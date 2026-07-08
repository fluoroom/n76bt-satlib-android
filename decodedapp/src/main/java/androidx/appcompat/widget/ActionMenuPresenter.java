package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.b;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.view.menu.q;
import androidx.appcompat.view.menu.s;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import m0.b;

/* JADX INFO: loaded from: classes.dex */
class ActionMenuPresenter extends androidx.appcompat.view.menu.c implements b.a {
    private static final String TAG = "ActionMenuPresenter";
    private final SparseBooleanArray mActionButtonGroups;
    ActionButtonSubmenu mActionButtonPopup;
    private int mActionItemWidthLimit;
    private boolean mExpandedActionViewsExclusive;
    private int mMaxItems;
    private boolean mMaxItemsSet;
    private int mMinCellSize;
    int mOpenSubMenuId;
    OverflowMenuButton mOverflowButton;
    OverflowPopup mOverflowPopup;
    private Drawable mPendingOverflowIcon;
    private boolean mPendingOverflowIconSet;
    private ActionMenuPopupCallback mPopupCallback;
    final PopupPresenterCallback mPopupPresenterCallback;
    OpenOverflowRunnable mPostedOpenRunnable;
    private boolean mReserveOverflow;
    private boolean mReserveOverflowSet;
    private boolean mStrictWidthLimit;
    private int mWidthLimit;
    private boolean mWidthLimitSet;

    private class ActionButtonSubmenu extends m {
        public ActionButtonSubmenu(Context context, s sVar, View view) {
            super(context, sVar, view, false, h.a.f14762m);
            if (!((androidx.appcompat.view.menu.j) sVar.getItem()).l()) {
                View view2 = ActionMenuPresenter.this.mOverflowButton;
                setAnchorView(view2 == null ? (View) ((androidx.appcompat.view.menu.c) ActionMenuPresenter.this).mMenuView : view2);
            }
            setPresenterCallback(ActionMenuPresenter.this.mPopupPresenterCallback);
        }

        @Override // androidx.appcompat.view.menu.m
        protected void onDismiss() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            actionMenuPresenter.mActionButtonPopup = null;
            actionMenuPresenter.mOpenSubMenuId = 0;
            super.onDismiss();
        }
    }

    private class ActionMenuPopupCallback extends b.AbstractC0020b {
        ActionMenuPopupCallback() {
        }

        @Override // androidx.appcompat.view.menu.b.AbstractC0020b
        public q getPopup() {
            ActionButtonSubmenu actionButtonSubmenu = ActionMenuPresenter.this.mActionButtonPopup;
            if (actionButtonSubmenu != null) {
                return actionButtonSubmenu.getPopup();
            }
            return null;
        }
    }

    private class OpenOverflowRunnable implements Runnable {
        private OverflowPopup mPopup;

        public OpenOverflowRunnable(OverflowPopup overflowPopup) {
            this.mPopup = overflowPopup;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((androidx.appcompat.view.menu.c) ActionMenuPresenter.this).mMenu != null) {
                ((androidx.appcompat.view.menu.c) ActionMenuPresenter.this).mMenu.d();
            }
            View view = (View) ((androidx.appcompat.view.menu.c) ActionMenuPresenter.this).mMenuView;
            if (view != null && view.getWindowToken() != null && this.mPopup.tryShow()) {
                ActionMenuPresenter.this.mOverflowPopup = this.mPopup;
            }
            ActionMenuPresenter.this.mPostedOpenRunnable = null;
        }
    }

    private class OverflowMenuButton extends AppCompatImageView implements ActionMenuView.ActionMenuChildView {
        public OverflowMenuButton(Context context) {
            super(context, null, h.a.f14760l);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            TooltipCompat.setTooltipText(this, getContentDescription());
            setOnTouchListener(new ForwardingListener(this) { // from class: androidx.appcompat.widget.ActionMenuPresenter.OverflowMenuButton.1
                @Override // androidx.appcompat.widget.ForwardingListener
                public q getPopup() {
                    OverflowPopup overflowPopup = ActionMenuPresenter.this.mOverflowPopup;
                    if (overflowPopup == null) {
                        return null;
                    }
                    return overflowPopup.getPopup();
                }

                @Override // androidx.appcompat.widget.ForwardingListener
                public boolean onForwardingStarted() {
                    ActionMenuPresenter.this.showOverflowMenu();
                    return true;
                }

                @Override // androidx.appcompat.widget.ForwardingListener
                public boolean onForwardingStopped() {
                    ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
                    if (actionMenuPresenter.mPostedOpenRunnable != null) {
                        return false;
                    }
                    actionMenuPresenter.hideOverflowMenu();
                    return true;
                }
            });
        }

        @Override // androidx.appcompat.widget.ActionMenuView.ActionMenuChildView
        public boolean needsDividerAfter() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.ActionMenuChildView
        public boolean needsDividerBefore() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.showOverflowMenu();
            return true;
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int i10, int i11, int i12, int i13) {
            boolean frame = super.setFrame(i10, i11, i12, i13);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int iMax = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                e0.a.l(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
            }
            return frame;
        }
    }

    private class OverflowPopup extends m {
        public OverflowPopup(Context context, androidx.appcompat.view.menu.h hVar, View view, boolean z10) {
            super(context, hVar, view, z10, h.a.f14762m);
            setGravity(8388613);
            setPresenterCallback(ActionMenuPresenter.this.mPopupPresenterCallback);
        }

        @Override // androidx.appcompat.view.menu.m
        protected void onDismiss() {
            if (((androidx.appcompat.view.menu.c) ActionMenuPresenter.this).mMenu != null) {
                ((androidx.appcompat.view.menu.c) ActionMenuPresenter.this).mMenu.close();
            }
            ActionMenuPresenter.this.mOverflowPopup = null;
            super.onDismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class PopupPresenterCallback implements n.a {
        PopupPresenterCallback() {
        }

        @Override // androidx.appcompat.view.menu.n.a
        public void onCloseMenu(androidx.appcompat.view.menu.h hVar, boolean z10) {
            if (hVar instanceof s) {
                hVar.F().e(false);
            }
            n.a callback = ActionMenuPresenter.this.getCallback();
            if (callback != null) {
                callback.onCloseMenu(hVar, z10);
            }
        }

        @Override // androidx.appcompat.view.menu.n.a
        public boolean onOpenSubMenu(androidx.appcompat.view.menu.h hVar) {
            if (hVar == ((androidx.appcompat.view.menu.c) ActionMenuPresenter.this).mMenu) {
                return false;
            }
            ActionMenuPresenter.this.mOpenSubMenuId = ((s) hVar).getItem().getItemId();
            n.a callback = ActionMenuPresenter.this.getCallback();
            if (callback != null) {
                return callback.onOpenSubMenu(hVar);
            }
            return false;
        }
    }

    private static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: androidx.appcompat.widget.ActionMenuPresenter.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        };
        public int openSubMenuId;

        SavedState() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.openSubMenuId);
        }

        SavedState(Parcel parcel) {
            this.openSubMenuId = parcel.readInt();
        }
    }

    public ActionMenuPresenter(Context context) {
        super(context, h.g.f14868c, h.g.f14867b);
        this.mActionButtonGroups = new SparseBooleanArray();
        this.mPopupPresenterCallback = new PopupPresenterCallback();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private View findViewForItem(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.mMenuView;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if ((childAt instanceof o.a) && ((o.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.c
    public void bindItemView(androidx.appcompat.view.menu.j jVar, o.a aVar) {
        aVar.initialize(jVar, 0);
        androidx.appcompat.view.menu.b bVar = (androidx.appcompat.view.menu.b) aVar;
        bVar.setItemInvoker((ActionMenuView) this.mMenuView);
        if (this.mPopupCallback == null) {
            this.mPopupCallback = new ActionMenuPopupCallback();
        }
        bVar.setPopupCallback(this.mPopupCallback);
    }

    public boolean dismissPopupMenus() {
        return hideOverflowMenu() | hideSubMenus();
    }

    @Override // androidx.appcompat.view.menu.c
    public boolean filterLeftoverView(ViewGroup viewGroup, int i10) {
        if (viewGroup.getChildAt(i10) == this.mOverflowButton) {
            return false;
        }
        return super.filterLeftoverView(viewGroup, i10);
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean flagActionItems() {
        ArrayList arrayListG;
        int size;
        int i10;
        int iMeasureChildForCells;
        int i11;
        ActionMenuPresenter actionMenuPresenter = this;
        androidx.appcompat.view.menu.h hVar = actionMenuPresenter.mMenu;
        View view = null;
        int i12 = 0;
        if (hVar != null) {
            arrayListG = hVar.G();
            size = arrayListG.size();
        } else {
            arrayListG = null;
            size = 0;
        }
        int i13 = actionMenuPresenter.mMaxItems;
        int i14 = actionMenuPresenter.mActionItemWidthLimit;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) actionMenuPresenter.mMenuView;
        boolean z10 = false;
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < size; i17++) {
            androidx.appcompat.view.menu.j jVar = (androidx.appcompat.view.menu.j) arrayListG.get(i17);
            if (jVar.o()) {
                i15++;
            } else if (jVar.n()) {
                i16++;
            } else {
                z10 = true;
            }
            if (actionMenuPresenter.mExpandedActionViewsExclusive && jVar.isActionViewExpanded()) {
                i13 = 0;
            }
        }
        if (actionMenuPresenter.mReserveOverflow && (z10 || i16 + i15 > i13)) {
            i13--;
        }
        int i18 = i13 - i15;
        SparseBooleanArray sparseBooleanArray = actionMenuPresenter.mActionButtonGroups;
        sparseBooleanArray.clear();
        if (actionMenuPresenter.mStrictWidthLimit) {
            int i19 = actionMenuPresenter.mMinCellSize;
            iMeasureChildForCells = i14 / i19;
            i10 = i19 + ((i14 % i19) / iMeasureChildForCells);
        } else {
            i10 = 0;
            iMeasureChildForCells = 0;
        }
        int i20 = 0;
        int i21 = 0;
        while (i20 < size) {
            androidx.appcompat.view.menu.j jVar2 = (androidx.appcompat.view.menu.j) arrayListG.get(i20);
            if (jVar2.o()) {
                View itemView = actionMenuPresenter.getItemView(jVar2, view, viewGroup);
                if (actionMenuPresenter.mStrictWidthLimit) {
                    iMeasureChildForCells -= ActionMenuView.measureChildForCells(itemView, i10, iMeasureChildForCells, iMakeMeasureSpec, i12);
                } else {
                    itemView.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                }
                int measuredWidth = itemView.getMeasuredWidth();
                i14 -= measuredWidth;
                if (i21 == 0) {
                    i21 = measuredWidth;
                }
                int groupId = jVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                jVar2.u(true);
                i11 = size;
            } else if (jVar2.n()) {
                int groupId2 = jVar2.getGroupId();
                boolean z11 = sparseBooleanArray.get(groupId2);
                boolean z12 = (i18 > 0 || z11) && i14 > 0 && (!actionMenuPresenter.mStrictWidthLimit || iMeasureChildForCells > 0);
                boolean z13 = z12;
                i11 = size;
                if (z12) {
                    View itemView2 = actionMenuPresenter.getItemView(jVar2, null, viewGroup);
                    if (actionMenuPresenter.mStrictWidthLimit) {
                        int iMeasureChildForCells2 = ActionMenuView.measureChildForCells(itemView2, i10, iMeasureChildForCells, iMakeMeasureSpec, 0);
                        iMeasureChildForCells -= iMeasureChildForCells2;
                        if (iMeasureChildForCells2 == 0) {
                            z13 = false;
                        }
                    } else {
                        itemView2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    }
                    boolean z14 = z13;
                    int measuredWidth2 = itemView2.getMeasuredWidth();
                    i14 -= measuredWidth2;
                    if (i21 == 0) {
                        i21 = measuredWidth2;
                    }
                    z12 = z14 & (!actionMenuPresenter.mStrictWidthLimit ? i14 + i21 <= 0 : i14 < 0);
                }
                if (z12 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z11) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i22 = 0; i22 < i20; i22++) {
                        androidx.appcompat.view.menu.j jVar3 = (androidx.appcompat.view.menu.j) arrayListG.get(i22);
                        if (jVar3.getGroupId() == groupId2) {
                            if (jVar3.l()) {
                                i18++;
                            }
                            jVar3.u(false);
                        }
                    }
                }
                if (z12) {
                    i18--;
                }
                jVar2.u(z12);
            } else {
                i11 = size;
                jVar2.u(false);
                i20++;
                view = null;
                actionMenuPresenter = this;
                size = i11;
                i12 = 0;
            }
            i20++;
            view = null;
            actionMenuPresenter = this;
            size = i11;
            i12 = 0;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.c
    public View getItemView(androidx.appcompat.view.menu.j jVar, View view, ViewGroup viewGroup) {
        View actionView = jVar.getActionView();
        if (actionView == null || jVar.j()) {
            actionView = super.getItemView(jVar, view, viewGroup);
        }
        actionView.setVisibility(jVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.c
    public o getMenuView(ViewGroup viewGroup) {
        o oVar = this.mMenuView;
        o menuView = super.getMenuView(viewGroup);
        if (oVar != menuView) {
            ((ActionMenuView) menuView).setPresenter(this);
        }
        return menuView;
    }

    public Drawable getOverflowIcon() {
        OverflowMenuButton overflowMenuButton = this.mOverflowButton;
        if (overflowMenuButton != null) {
            return overflowMenuButton.getDrawable();
        }
        if (this.mPendingOverflowIconSet) {
            return this.mPendingOverflowIcon;
        }
        return null;
    }

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

    public boolean hideSubMenus() {
        ActionButtonSubmenu actionButtonSubmenu = this.mActionButtonPopup;
        if (actionButtonSubmenu == null) {
            return false;
        }
        actionButtonSubmenu.dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.c, androidx.appcompat.view.menu.n
    public void initForMenu(Context context, androidx.appcompat.view.menu.h hVar) {
        super.initForMenu(context, hVar);
        Resources resources = context.getResources();
        androidx.appcompat.view.a aVarB = androidx.appcompat.view.a.b(context);
        if (!this.mReserveOverflowSet) {
            this.mReserveOverflow = aVarB.h();
        }
        if (!this.mWidthLimitSet) {
            this.mWidthLimit = aVarB.c();
        }
        if (!this.mMaxItemsSet) {
            this.mMaxItems = aVarB.d();
        }
        int measuredWidth = this.mWidthLimit;
        if (this.mReserveOverflow) {
            if (this.mOverflowButton == null) {
                OverflowMenuButton overflowMenuButton = new OverflowMenuButton(this.mSystemContext);
                this.mOverflowButton = overflowMenuButton;
                if (this.mPendingOverflowIconSet) {
                    overflowMenuButton.setImageDrawable(this.mPendingOverflowIcon);
                    this.mPendingOverflowIcon = null;
                    this.mPendingOverflowIconSet = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.mOverflowButton.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.mOverflowButton.getMeasuredWidth();
        } else {
            this.mOverflowButton = null;
        }
        this.mActionItemWidthLimit = measuredWidth;
        this.mMinCellSize = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    public boolean isOverflowMenuShowPending() {
        return this.mPostedOpenRunnable != null || isOverflowMenuShowing();
    }

    public boolean isOverflowMenuShowing() {
        OverflowPopup overflowPopup = this.mOverflowPopup;
        return overflowPopup != null && overflowPopup.isShowing();
    }

    public boolean isOverflowReserved() {
        return this.mReserveOverflow;
    }

    @Override // androidx.appcompat.view.menu.c, androidx.appcompat.view.menu.n
    public void onCloseMenu(androidx.appcompat.view.menu.h hVar, boolean z10) {
        dismissPopupMenus();
        super.onCloseMenu(hVar, z10);
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (!this.mMaxItemsSet) {
            this.mMaxItems = androidx.appcompat.view.a.b(this.mContext).d();
        }
        androidx.appcompat.view.menu.h hVar = this.mMenu;
        if (hVar != null) {
            hVar.N(true);
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public void onRestoreInstanceState(Parcelable parcelable) {
        int i10;
        MenuItem menuItemFindItem;
        if ((parcelable instanceof SavedState) && (i10 = ((SavedState) parcelable).openSubMenuId) > 0 && (menuItemFindItem = this.mMenu.findItem(i10)) != null) {
            onSubMenuSelected((s) menuItemFindItem.getSubMenu());
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState();
        savedState.openSubMenuId = this.mOpenSubMenuId;
        return savedState;
    }

    @Override // androidx.appcompat.view.menu.c, androidx.appcompat.view.menu.n
    public boolean onSubMenuSelected(s sVar) {
        boolean z10 = false;
        if (!sVar.hasVisibleItems()) {
            return false;
        }
        s sVar2 = sVar;
        while (sVar2.j0() != this.mMenu) {
            sVar2 = (s) sVar2.j0();
        }
        View viewFindViewForItem = findViewForItem(sVar2.getItem());
        if (viewFindViewForItem == null) {
            return false;
        }
        this.mOpenSubMenuId = sVar.getItem().getItemId();
        int size = sVar.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            MenuItem item = sVar.getItem(i10);
            if (item.isVisible() && item.getIcon() != null) {
                z10 = true;
                break;
            }
            i10++;
        }
        ActionButtonSubmenu actionButtonSubmenu = new ActionButtonSubmenu(this.mContext, sVar, viewFindViewForItem);
        this.mActionButtonPopup = actionButtonSubmenu;
        actionButtonSubmenu.setForceShowIcon(z10);
        this.mActionButtonPopup.show();
        super.onSubMenuSelected(sVar);
        return true;
    }

    @Override // m0.b.a
    public void onSubUiVisibilityChanged(boolean z10) {
        if (z10) {
            super.onSubMenuSelected(null);
            return;
        }
        androidx.appcompat.view.menu.h hVar = this.mMenu;
        if (hVar != null) {
            hVar.e(false);
        }
    }

    public void setExpandedActionViewsExclusive(boolean z10) {
        this.mExpandedActionViewsExclusive = z10;
    }

    public void setItemLimit(int i10) {
        this.mMaxItems = i10;
        this.mMaxItemsSet = true;
    }

    public void setMenuView(ActionMenuView actionMenuView) {
        this.mMenuView = actionMenuView;
        actionMenuView.initialize(this.mMenu);
    }

    public void setOverflowIcon(Drawable drawable) {
        OverflowMenuButton overflowMenuButton = this.mOverflowButton;
        if (overflowMenuButton != null) {
            overflowMenuButton.setImageDrawable(drawable);
        } else {
            this.mPendingOverflowIconSet = true;
            this.mPendingOverflowIcon = drawable;
        }
    }

    public void setReserveOverflow(boolean z10) {
        this.mReserveOverflow = z10;
        this.mReserveOverflowSet = true;
    }

    public void setWidthLimit(int i10, boolean z10) {
        this.mWidthLimit = i10;
        this.mStrictWidthLimit = z10;
        this.mWidthLimitSet = true;
    }

    @Override // androidx.appcompat.view.menu.c
    public boolean shouldIncludeItem(int i10, androidx.appcompat.view.menu.j jVar) {
        return jVar.l();
    }

    public boolean showOverflowMenu() {
        androidx.appcompat.view.menu.h hVar;
        if (!this.mReserveOverflow || isOverflowMenuShowing() || (hVar = this.mMenu) == null || this.mMenuView == null || this.mPostedOpenRunnable != null || hVar.B().isEmpty()) {
            return false;
        }
        OpenOverflowRunnable openOverflowRunnable = new OpenOverflowRunnable(new OverflowPopup(this.mContext, this.mMenu, this.mOverflowButton, true));
        this.mPostedOpenRunnable = openOverflowRunnable;
        ((View) this.mMenuView).post(openOverflowRunnable);
        return true;
    }

    @Override // androidx.appcompat.view.menu.c, androidx.appcompat.view.menu.n
    public void updateMenuView(boolean z10) {
        super.updateMenuView(z10);
        ((View) this.mMenuView).requestLayout();
        androidx.appcompat.view.menu.h hVar = this.mMenu;
        boolean z11 = false;
        if (hVar != null) {
            ArrayList arrayListU = hVar.u();
            int size = arrayListU.size();
            for (int i10 = 0; i10 < size; i10++) {
                m0.b bVarA = ((androidx.appcompat.view.menu.j) arrayListU.get(i10)).a();
                if (bVarA != null) {
                    bVarA.setSubUiVisibilityListener(this);
                }
            }
        }
        androidx.appcompat.view.menu.h hVar2 = this.mMenu;
        ArrayList arrayListB = hVar2 != null ? hVar2.B() : null;
        if (this.mReserveOverflow && arrayListB != null) {
            int size2 = arrayListB.size();
            if (size2 == 1) {
                z11 = !((androidx.appcompat.view.menu.j) arrayListB.get(0)).isActionViewExpanded();
            } else if (size2 > 0) {
                z11 = true;
            }
        }
        if (z11) {
            if (this.mOverflowButton == null) {
                this.mOverflowButton = new OverflowMenuButton(this.mSystemContext);
            }
            ViewGroup viewGroup = (ViewGroup) this.mOverflowButton.getParent();
            if (viewGroup != this.mMenuView) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.mOverflowButton);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.mMenuView;
                actionMenuView.addView(this.mOverflowButton, actionMenuView.generateOverflowButtonLayoutParams());
            }
        } else {
            OverflowMenuButton overflowMenuButton = this.mOverflowButton;
            if (overflowMenuButton != null) {
                Object parent = overflowMenuButton.getParent();
                Object obj = this.mMenuView;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.mOverflowButton);
                }
            }
        }
        ((ActionMenuView) this.mMenuView).setOverflowReserved(this.mReserveOverflow);
    }
}
