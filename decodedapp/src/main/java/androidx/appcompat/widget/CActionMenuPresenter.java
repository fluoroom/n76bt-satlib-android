package androidx.appcompat.widget;

import a6.s;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.o;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class CActionMenuPresenter extends ActionMenuPresenter {
    private OverflowPopup mOverflowPopup;
    private OpenOverflowRunnable mPostedOpenRunnable;

    public static class MenuPopupHelper implements AdapterView.OnItemClickListener, View.OnKeyListener, ViewTreeObserver.OnGlobalLayoutListener, PopupWindow.OnDismissListener, n {
        static final int ITEM_LAYOUT = k3.g.f19207a;
        private static final String TAG = "MenuPopupHelper";
        private final MenuAdapter mAdapter;
        private View mAnchorView;
        private int mContentWidth;
        private final Context mContext;
        private int mDropDownGravity;
        boolean mForceShowIcon;
        private boolean mHasContentWidth;
        private final LayoutInflater mInflater;
        private ViewGroup mMeasureParent;
        private final androidx.appcompat.view.menu.h mMenu;
        private final boolean mOverflowOnly;
        private ListPopupWindow mPopup;
        private final int mPopupMaxWidth;
        private final int mPopupStyleAttr;
        private final int mPopupStyleRes;
        private n.a mPresenterCallback;
        private ViewTreeObserver mTreeObserver;

        private class CMenuAdapter extends MenuAdapter {
            final int SECTION_VIEW_TYPE;

            public CMenuAdapter(androidx.appcompat.view.menu.h hVar) {
                super(hVar);
                this.SECTION_VIEW_TYPE = super.getViewTypeCount();
            }

            @Override // android.widget.BaseAdapter, android.widget.Adapter
            public int getItemViewType(int i10) {
                androidx.appcompat.view.menu.j item = getItem(i10);
                return (item.getItemId() == k3.f.f19204x || item.getAlphabeticShortcut() == 's') ? this.SECTION_VIEW_TYPE : super.getItemViewType(i10);
            }

            public View getSectionView(int i10, View view, ViewGroup viewGroup) {
                if (view == null) {
                    view = MenuPopupHelper.this.mInflater.inflate(k3.g.f19226t, viewGroup, false);
                }
                ((TextView) view).setText(getItem(i10).getTitle());
                return view;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.appcompat.widget.CActionMenuPresenter.MenuPopupHelper.MenuAdapter, android.widget.Adapter
            public View getView(int i10, View view, ViewGroup viewGroup) {
                if (getItemViewType(i10) == this.SECTION_VIEW_TYPE) {
                    return getSectionView(i10, view, viewGroup);
                }
                View view2 = super.getView(i10, view, viewGroup);
                o.a aVar = (o.a) view2;
                if (view == null && MenuPopupHelper.this.mForceShowIcon) {
                    try {
                        ((ImageView) s.c(ListMenuItemView.class, aVar, "mIconView")).setColorFilter(((TextView) s.c(ListMenuItemView.class, aVar, "mTitleView")).getCurrentTextColor(), PorterDuff.Mode.SRC_ATOP);
                        return view2;
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                }
                return view2;
            }

            @Override // android.widget.BaseAdapter, android.widget.Adapter
            public int getViewTypeCount() {
                return this.SECTION_VIEW_TYPE + 1;
            }
        }

        private class MenuAdapter extends BaseAdapter {
            private androidx.appcompat.view.menu.h mAdapterMenu;
            private int mExpandedIndex = -1;

            public MenuAdapter(androidx.appcompat.view.menu.h hVar) {
                this.mAdapterMenu = hVar;
                findExpandedIndex();
            }

            void findExpandedIndex() {
                androidx.appcompat.view.menu.j jVarX = MenuPopupHelper.this.mMenu.x();
                if (jVarX != null) {
                    ArrayList arrayListB = MenuPopupHelper.this.mMenu.B();
                    int size = arrayListB.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (((androidx.appcompat.view.menu.j) arrayListB.get(i10)) == jVarX) {
                            this.mExpandedIndex = i10;
                            return;
                        }
                    }
                }
                this.mExpandedIndex = -1;
            }

            @Override // android.widget.Adapter
            public int getCount() {
                return this.mExpandedIndex < 0 ? (MenuPopupHelper.this.mOverflowOnly ? this.mAdapterMenu.B() : this.mAdapterMenu.G()).size() : r0.size() - 1;
            }

            @Override // android.widget.Adapter
            public long getItemId(int i10) {
                return i10;
            }

            @Override // android.widget.Adapter
            public View getView(int i10, View view, ViewGroup viewGroup) {
                if (view == null) {
                    view = MenuPopupHelper.this.mInflater.inflate(MenuPopupHelper.ITEM_LAYOUT, viewGroup, false);
                }
                o.a aVar = (o.a) view;
                if (MenuPopupHelper.this.mForceShowIcon) {
                    ((ListMenuItemView) view).setForceShowIcon(true);
                }
                aVar.initialize(getItem(i10), 0);
                return view;
            }

            @Override // android.widget.BaseAdapter
            public void notifyDataSetChanged() {
                findExpandedIndex();
                super.notifyDataSetChanged();
            }

            @Override // android.widget.Adapter
            public androidx.appcompat.view.menu.j getItem(int i10) {
                ArrayList arrayListB = MenuPopupHelper.this.mOverflowOnly ? this.mAdapterMenu.B() : this.mAdapterMenu.G();
                int i11 = this.mExpandedIndex;
                if (i11 >= 0 && i10 >= i11) {
                    i10++;
                }
                return (androidx.appcompat.view.menu.j) arrayListB.get(i10);
            }
        }

        public MenuPopupHelper(Context context, androidx.appcompat.view.menu.h hVar) {
            this(context, hVar, null, false, k3.b.f19163k);
        }

        private int measureContentWidth() {
            MenuAdapter menuAdapter = this.mAdapter;
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            int count = menuAdapter.getCount();
            View view = null;
            int i10 = 0;
            int i11 = 0;
            for (int i12 = 0; i12 < count; i12++) {
                int itemViewType = menuAdapter.getItemViewType(i12);
                if (itemViewType != i11) {
                    view = null;
                    i11 = itemViewType;
                }
                if (this.mMeasureParent == null) {
                    this.mMeasureParent = new android.widget.FrameLayout(this.mContext);
                }
                view = menuAdapter.getView(i12, view, this.mMeasureParent);
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                int measuredWidth = view.getMeasuredWidth();
                int i13 = this.mPopupMaxWidth;
                if (measuredWidth >= i13) {
                    return i13;
                }
                if (measuredWidth > i10) {
                    i10 = measuredWidth;
                }
            }
            return i10;
        }

        @Override // androidx.appcompat.view.menu.n
        public boolean collapseItemActionView(androidx.appcompat.view.menu.h hVar, androidx.appcompat.view.menu.j jVar) {
            return false;
        }

        public void dismiss() {
            if (isShowing()) {
                this.mPopup.dismiss();
            }
        }

        @Override // androidx.appcompat.view.menu.n
        public boolean expandItemActionView(androidx.appcompat.view.menu.h hVar, androidx.appcompat.view.menu.j jVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.n
        public boolean flagActionItems() {
            return false;
        }

        public int getGravity() {
            return this.mDropDownGravity;
        }

        @Override // androidx.appcompat.view.menu.n
        public int getId() {
            return 0;
        }

        public o getMenuView(ViewGroup viewGroup) {
            throw new UnsupportedOperationException("MenuPopupHelpers manage their own views");
        }

        public ListPopupWindow getPopup() {
            return this.mPopup;
        }

        @Override // androidx.appcompat.view.menu.n
        public void initForMenu(Context context, androidx.appcompat.view.menu.h hVar) {
        }

        public boolean isShowing() {
            ListPopupWindow listPopupWindow = this.mPopup;
            return listPopupWindow != null && listPopupWindow.isShowing();
        }

        @Override // androidx.appcompat.view.menu.n
        public void onCloseMenu(androidx.appcompat.view.menu.h hVar, boolean z10) {
            if (hVar != this.mMenu) {
                return;
            }
            dismiss();
            n.a aVar = this.mPresenterCallback;
            if (aVar != null) {
                aVar.onCloseMenu(hVar, z10);
            }
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            this.mPopup = null;
            this.mMenu.close();
            ViewTreeObserver viewTreeObserver = this.mTreeObserver;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    this.mTreeObserver = this.mAnchorView.getViewTreeObserver();
                }
                this.mTreeObserver.removeGlobalOnLayoutListener(this);
                this.mTreeObserver = null;
            }
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (isShowing()) {
                View view = this.mAnchorView;
                if (view == null || !view.isShown()) {
                    dismiss();
                } else if (isShowing()) {
                    this.mPopup.show();
                }
            }
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            MenuAdapter menuAdapter = this.mAdapter;
            menuAdapter.mAdapterMenu.O(menuAdapter.getItem(i10), 0);
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 1 || i10 != 82) {
                return false;
            }
            dismiss();
            return true;
        }

        @Override // androidx.appcompat.view.menu.n
        public void onRestoreInstanceState(Parcelable parcelable) {
        }

        @Override // androidx.appcompat.view.menu.n
        public Parcelable onSaveInstanceState() {
            return null;
        }

        @Override // androidx.appcompat.view.menu.n
        public boolean onSubMenuSelected(androidx.appcompat.view.menu.s sVar) {
            boolean z10;
            if (sVar.hasVisibleItems()) {
                MenuPopupHelper menuPopupHelper = new MenuPopupHelper(this.mContext, sVar, this.mAnchorView);
                menuPopupHelper.setCallback(this.mPresenterCallback);
                int size = sVar.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        z10 = false;
                        break;
                    }
                    MenuItem item = sVar.getItem(i10);
                    if (item.isVisible() && item.getIcon() != null) {
                        z10 = true;
                        break;
                    }
                    i10++;
                }
                menuPopupHelper.setForceShowIcon(z10);
                if (menuPopupHelper.tryShow()) {
                    n.a aVar = this.mPresenterCallback;
                    if (aVar != null) {
                        aVar.onOpenSubMenu(sVar);
                    }
                    return true;
                }
            }
            return false;
        }

        public void setAnchorView(View view) {
            this.mAnchorView = view;
        }

        @Override // androidx.appcompat.view.menu.n
        public void setCallback(n.a aVar) {
            this.mPresenterCallback = aVar;
        }

        public void setForceShowIcon(boolean z10) {
            this.mForceShowIcon = z10;
        }

        public void setGravity(int i10) {
            this.mDropDownGravity = i10;
        }

        public void show() {
            if (!tryShow()) {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
        }

        public boolean tryShow() {
            ListPopupWindow listPopupWindow = new ListPopupWindow(this.mContext, null, this.mPopupStyleAttr, this.mPopupStyleRes);
            this.mPopup = listPopupWindow;
            listPopupWindow.setOnDismissListener(this);
            this.mPopup.setOnItemClickListener(this);
            this.mPopup.setAdapter(this.mAdapter);
            this.mPopup.setModal(true);
            View view = this.mAnchorView;
            if (view == null) {
                return false;
            }
            boolean z10 = this.mTreeObserver == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.mTreeObserver = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this);
            }
            this.mPopup.setAnchorView(view);
            this.mPopup.setDropDownGravity(this.mDropDownGravity);
            if (!this.mHasContentWidth) {
                this.mContentWidth = measureContentWidth();
                this.mHasContentWidth = true;
            }
            this.mPopup.setContentWidth(this.mContentWidth);
            this.mPopup.setInputMethodMode(2);
            this.mPopup.show();
            this.mPopup.getListView().setOnKeyListener(this);
            return true;
        }

        @Override // androidx.appcompat.view.menu.n
        public void updateMenuView(boolean z10) {
            this.mHasContentWidth = false;
            MenuAdapter menuAdapter = this.mAdapter;
            if (menuAdapter != null) {
                menuAdapter.notifyDataSetChanged();
            }
        }

        public MenuPopupHelper(Context context, androidx.appcompat.view.menu.h hVar, View view) {
            this(context, hVar, view, false, k3.b.f19163k);
        }

        public MenuPopupHelper(Context context, androidx.appcompat.view.menu.h hVar, View view, boolean z10, int i10) {
            this(context, hVar, view, z10, i10, 0);
        }

        public MenuPopupHelper(Context context, androidx.appcompat.view.menu.h hVar, View view, boolean z10, int i10, int i11) {
            this.mDropDownGravity = 0;
            this.mContext = context;
            this.mInflater = LayoutInflater.from(context);
            this.mMenu = hVar;
            this.mAdapter = new CMenuAdapter(hVar);
            this.mOverflowOnly = z10;
            this.mPopupStyleAttr = i10;
            this.mPopupStyleRes = i11;
            Resources resources = context.getResources();
            this.mPopupMaxWidth = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(k3.d.f19167a));
            this.mAnchorView = view;
            hVar.c(this, context);
        }
    }

    private class OpenOverflowRunnable implements Runnable {
        private OverflowPopup mPopup;

        public OpenOverflowRunnable(OverflowPopup overflowPopup) {
            this.mPopup = overflowPopup;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((androidx.appcompat.view.menu.c) CActionMenuPresenter.this).mMenu != null) {
                ((androidx.appcompat.view.menu.c) CActionMenuPresenter.this).mMenu.d();
            }
            View view = (View) ((androidx.appcompat.view.menu.c) CActionMenuPresenter.this).mMenuView;
            if (view != null && view.getWindowToken() != null && this.mPopup.tryShow()) {
                CActionMenuPresenter.this.mOverflowPopup = this.mPopup;
            }
            CActionMenuPresenter.this.mPostedOpenRunnable = null;
        }
    }

    private class OverflowPopup extends MenuPopupHelper {
        public OverflowPopup(Context context, androidx.appcompat.view.menu.h hVar, View view, boolean z10) {
            super(context, hVar, view, z10, k3.b.f19154b);
            setGravity(8388613);
            setCallback(CActionMenuPresenter.this.mPopupPresenterCallback);
            setForceShowIcon(true);
        }

        @Override // androidx.appcompat.widget.CActionMenuPresenter.MenuPopupHelper, android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            super.onDismiss();
            if (((androidx.appcompat.view.menu.c) CActionMenuPresenter.this).mMenu != null) {
                ((androidx.appcompat.view.menu.c) CActionMenuPresenter.this).mMenu.close();
            }
            CActionMenuPresenter.this.mOverflowPopup = null;
        }
    }

    public CActionMenuPresenter(Context context) {
        super(context);
        setItemLimit(getMaxActionButtons(context));
        setWidthLimit(getEmbeddedMenuWidthLimit(context), false);
    }

    @Override // androidx.appcompat.widget.ActionMenuPresenter, androidx.appcompat.view.menu.c
    public /* bridge */ /* synthetic */ void bindItemView(androidx.appcompat.view.menu.j jVar, o.a aVar) {
        super.bindItemView(jVar, aVar);
    }

    @Override // androidx.appcompat.widget.ActionMenuPresenter
    public /* bridge */ /* synthetic */ boolean dismissPopupMenus() {
        return super.dismissPopupMenus();
    }

    @Override // androidx.appcompat.widget.ActionMenuPresenter, androidx.appcompat.view.menu.c
    public /* bridge */ /* synthetic */ boolean filterLeftoverView(ViewGroup viewGroup, int i10) {
        return super.filterLeftoverView(viewGroup, i10);
    }

    @Override // androidx.appcompat.widget.ActionMenuPresenter, androidx.appcompat.view.menu.n
    public /* bridge */ /* synthetic */ boolean flagActionItems() {
        return super.flagActionItems();
    }

    public int getEmbeddedMenuWidthLimit(Context context) {
        return (context.getResources().getDisplayMetrics().widthPixels * 2) / 3;
    }

    @Override // androidx.appcompat.widget.ActionMenuPresenter, androidx.appcompat.view.menu.c
    public /* bridge */ /* synthetic */ View getItemView(androidx.appcompat.view.menu.j jVar, View view, ViewGroup viewGroup) {
        return super.getItemView(jVar, view, viewGroup);
    }

    public int getMaxActionButtons(Context context) {
        return ((context.getResources().getConfiguration().screenWidthDp * 2) / 3) / 48;
    }

    @Override // androidx.appcompat.widget.ActionMenuPresenter, androidx.appcompat.view.menu.c
    public /* bridge */ /* synthetic */ o getMenuView(ViewGroup viewGroup) {
        return super.getMenuView(viewGroup);
    }

    @Override // androidx.appcompat.widget.ActionMenuPresenter
    public /* bridge */ /* synthetic */ Drawable getOverflowIcon() {
        return super.getOverflowIcon();
    }

    @Override // androidx.appcompat.widget.ActionMenuPresenter
    public boolean hideOverflowMenu() {
        Object obj;
        OpenOverflowRunnable openOverflowRunnable = this.mPostedOpenRunnable;
        if (openOverflowRunnable != null && (obj = this.mMenuView) != null) {
            ((View) obj).removeCallbacks(openOverflowRunnable);
            this.mPostedOpenRunnable = null;
            return true;
        }
        OverflowPopup overflowPopup = this.mOverflowPopup;
        if (overflowPopup == null) {
            return false;
        }
        overflowPopup.dismiss();
        return true;
    }

    @Override // androidx.appcompat.widget.ActionMenuPresenter
    public /* bridge */ /* synthetic */ boolean hideSubMenus() {
        return super.hideSubMenus();
    }

    @Override // androidx.appcompat.widget.ActionMenuPresenter, androidx.appcompat.view.menu.c, androidx.appcompat.view.menu.n
    public /* bridge */ /* synthetic */ void initForMenu(Context context, androidx.appcompat.view.menu.h hVar) {
        super.initForMenu(context, hVar);
    }

    @Override // androidx.appcompat.widget.ActionMenuPresenter
    public boolean isOverflowMenuShowPending() {
        return this.mPostedOpenRunnable != null || isOverflowMenuShowing();
    }

    @Override // androidx.appcompat.widget.ActionMenuPresenter
    public boolean isOverflowMenuShowing() {
        OverflowPopup overflowPopup = this.mOverflowPopup;
        return overflowPopup != null && overflowPopup.isShowing();
    }

    @Override // androidx.appcompat.widget.ActionMenuPresenter
    public /* bridge */ /* synthetic */ boolean isOverflowReserved() {
        return super.isOverflowReserved();
    }

    @Override // androidx.appcompat.widget.ActionMenuPresenter, androidx.appcompat.view.menu.c, androidx.appcompat.view.menu.n
    public /* bridge */ /* synthetic */ void onCloseMenu(androidx.appcompat.view.menu.h hVar, boolean z10) {
        super.onCloseMenu(hVar, z10);
    }

    @Override // androidx.appcompat.widget.ActionMenuPresenter
    public /* bridge */ /* synthetic */ void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // androidx.appcompat.widget.ActionMenuPresenter, androidx.appcompat.view.menu.n
    public /* bridge */ /* synthetic */ void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(parcelable);
    }

    @Override // androidx.appcompat.widget.ActionMenuPresenter, androidx.appcompat.view.menu.n
    public /* bridge */ /* synthetic */ Parcelable onSaveInstanceState() {
        return super.onSaveInstanceState();
    }

    @Override // androidx.appcompat.widget.ActionMenuPresenter, androidx.appcompat.view.menu.c, androidx.appcompat.view.menu.n
    public /* bridge */ /* synthetic */ boolean onSubMenuSelected(androidx.appcompat.view.menu.s sVar) {
        return super.onSubMenuSelected(sVar);
    }

    @Override // androidx.appcompat.widget.ActionMenuPresenter, m0.b.a
    public /* bridge */ /* synthetic */ void onSubUiVisibilityChanged(boolean z10) {
        super.onSubUiVisibilityChanged(z10);
    }

    @Override // androidx.appcompat.widget.ActionMenuPresenter
    public /* bridge */ /* synthetic */ void setExpandedActionViewsExclusive(boolean z10) {
        super.setExpandedActionViewsExclusive(z10);
    }

    @Override // androidx.appcompat.widget.ActionMenuPresenter
    public /* bridge */ /* synthetic */ void setItemLimit(int i10) {
        super.setItemLimit(i10);
    }

    @Override // androidx.appcompat.widget.ActionMenuPresenter
    public /* bridge */ /* synthetic */ void setMenuView(ActionMenuView actionMenuView) {
        super.setMenuView(actionMenuView);
    }

    @Override // androidx.appcompat.widget.ActionMenuPresenter
    public /* bridge */ /* synthetic */ void setOverflowIcon(Drawable drawable) {
        super.setOverflowIcon(drawable);
    }

    @Override // androidx.appcompat.widget.ActionMenuPresenter
    public /* bridge */ /* synthetic */ void setReserveOverflow(boolean z10) {
        super.setReserveOverflow(z10);
    }

    @Override // androidx.appcompat.widget.ActionMenuPresenter
    public /* bridge */ /* synthetic */ void setWidthLimit(int i10, boolean z10) {
        super.setWidthLimit(i10, z10);
    }

    @Override // androidx.appcompat.widget.ActionMenuPresenter, androidx.appcompat.view.menu.c
    public /* bridge */ /* synthetic */ boolean shouldIncludeItem(int i10, androidx.appcompat.view.menu.j jVar) {
        return super.shouldIncludeItem(i10, jVar);
    }

    @Override // androidx.appcompat.widget.ActionMenuPresenter
    public boolean showOverflowMenu() {
        androidx.appcompat.view.menu.h hVar;
        if (!isOverflowReserved() || isOverflowMenuShowing() || (hVar = this.mMenu) == null || this.mMenuView == null || this.mPostedOpenRunnable != null || hVar.B().isEmpty()) {
            return false;
        }
        try {
            View view = (View) s.c(ActionMenuPresenter.class, this, "mOverflowButton");
            view.setOnTouchListener(new ForwardingListener(view) { // from class: androidx.appcompat.widget.CActionMenuPresenter.1
                @Override // androidx.appcompat.widget.ForwardingListener
                public boolean onForwardingStarted() {
                    CActionMenuPresenter.this.showOverflowMenu();
                    return true;
                }

                @Override // androidx.appcompat.widget.ForwardingListener
                public boolean onForwardingStopped() {
                    if (CActionMenuPresenter.this.mPostedOpenRunnable != null) {
                        return false;
                    }
                    CActionMenuPresenter.this.hideOverflowMenu();
                    return true;
                }

                @Override // androidx.appcompat.widget.ForwardingListener
                public ListPopupWindow getPopup() {
                    if (CActionMenuPresenter.this.mOverflowPopup == null) {
                        return null;
                    }
                    return CActionMenuPresenter.this.mOverflowPopup.getPopup();
                }
            });
            OpenOverflowRunnable openOverflowRunnable = new OpenOverflowRunnable(new OverflowPopup(this.mContext, this.mMenu, view, true));
            this.mPostedOpenRunnable = openOverflowRunnable;
            ((View) this.mMenuView).post(openOverflowRunnable);
            n.a callback = getCallback();
            if (callback == null) {
                return true;
            }
            callback.onOpenSubMenu(null);
            return true;
        } catch (Exception e10) {
            e10.printStackTrace();
            return super.showOverflowMenu();
        }
    }

    @Override // androidx.appcompat.widget.ActionMenuPresenter, androidx.appcompat.view.menu.c, androidx.appcompat.view.menu.n
    public /* bridge */ /* synthetic */ void updateMenuView(boolean z10) {
        super.updateMenuView(z10);
    }
}
