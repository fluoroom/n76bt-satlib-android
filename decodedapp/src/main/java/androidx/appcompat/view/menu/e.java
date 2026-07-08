package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.MenuItemHoverListener;
import androidx.appcompat.widget.MenuPopupWindow;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class e extends l implements n, View.OnKeyListener, PopupWindow.OnDismissListener {
    private static final int K = h.g.f14872g;
    private boolean A;
    private boolean B;
    private int C;
    private int D;
    private boolean F;
    private n.a G;
    ViewTreeObserver H;
    private PopupWindow.OnDismissListener I;
    boolean J;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f1191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f1192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f1193d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f1194e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f1195f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final Handler f1196g;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private View f1204x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    View f1205y;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f1197h = new ArrayList();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final List f1198r = new ArrayList();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f1199s = new a();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f1200t = new b();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final MenuItemHoverListener f1201u = new c();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f1202v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f1203w = 0;
    private boolean E = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f1206z = s();

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!e.this.isShowing() || e.this.f1198r.size() <= 0 || ((d) e.this.f1198r.get(0)).f1214a.isModal()) {
                return;
            }
            View view = e.this.f1205y;
            if (view == null || !view.isShown()) {
                e.this.dismiss();
                return;
            }
            Iterator it = e.this.f1198r.iterator();
            while (it.hasNext()) {
                ((d) it.next()).f1214a.show();
            }
        }
    }

    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = e.this.H;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    e.this.H = view.getViewTreeObserver();
                }
                e eVar = e.this;
                eVar.H.removeGlobalOnLayoutListener(eVar.f1199s);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    class c implements MenuItemHoverListener {

        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f1210a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ MenuItem f1211b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ h f1212c;

            a(d dVar, MenuItem menuItem, h hVar) {
                this.f1210a = dVar;
                this.f1211b = menuItem;
                this.f1212c = hVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.f1210a;
                if (dVar != null) {
                    e.this.J = true;
                    dVar.f1215b.e(false);
                    e.this.J = false;
                }
                if (this.f1211b.isEnabled() && this.f1211b.hasSubMenu()) {
                    this.f1212c.O(this.f1211b, 4);
                }
            }
        }

        c() {
        }

        @Override // androidx.appcompat.widget.MenuItemHoverListener
        public void onItemHoverEnter(h hVar, MenuItem menuItem) {
            e.this.f1196g.removeCallbacksAndMessages(null);
            int size = e.this.f1198r.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    i10 = -1;
                    break;
                } else if (hVar == ((d) e.this.f1198r.get(i10)).f1215b) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 == -1) {
                return;
            }
            int i11 = i10 + 1;
            e.this.f1196g.postAtTime(new a(i11 < e.this.f1198r.size() ? (d) e.this.f1198r.get(i11) : null, menuItem, hVar), hVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.MenuItemHoverListener
        public void onItemHoverExit(h hVar, MenuItem menuItem) {
            e.this.f1196g.removeCallbacksAndMessages(hVar);
        }
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MenuPopupWindow f1214a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final h f1215b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f1216c;

        public d(MenuPopupWindow menuPopupWindow, h hVar, int i10) {
            this.f1214a = menuPopupWindow;
            this.f1215b = hVar;
            this.f1216c = i10;
        }

        public ListView a() {
            return this.f1214a.getListView();
        }
    }

    public e(Context context, View view, int i10, int i11, boolean z10) {
        this.f1191b = context;
        this.f1204x = view;
        this.f1193d = i10;
        this.f1194e = i11;
        this.f1195f = z10;
        Resources resources = context.getResources();
        this.f1192c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(h.d.f14802d));
        this.f1196g = new Handler();
    }

    private MenuPopupWindow o() {
        MenuPopupWindow menuPopupWindow = new MenuPopupWindow(this.f1191b, null, this.f1193d, this.f1194e);
        menuPopupWindow.setHoverListener(this.f1201u);
        menuPopupWindow.setOnItemClickListener(this);
        menuPopupWindow.setOnDismissListener(this);
        menuPopupWindow.setAnchorView(this.f1204x);
        menuPopupWindow.setDropDownGravity(this.f1203w);
        menuPopupWindow.setModal(true);
        menuPopupWindow.setInputMethodMode(2);
        return menuPopupWindow;
    }

    private int p(h hVar) {
        int size = this.f1198r.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (hVar == ((d) this.f1198r.get(i10)).f1215b) {
                return i10;
            }
        }
        return -1;
    }

    private MenuItem q(h hVar, h hVar2) {
        int size = hVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = hVar.getItem(i10);
            if (item.hasSubMenu() && hVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    private View r(d dVar, h hVar) {
        g gVar;
        int headersCount;
        int firstVisiblePosition;
        MenuItem menuItemQ = q(dVar.f1215b, hVar);
        if (menuItemQ == null) {
            return null;
        }
        ListView listViewA = dVar.a();
        ListAdapter adapter = listViewA.getAdapter();
        int i10 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            headersCount = headerViewListAdapter.getHeadersCount();
            gVar = (g) headerViewListAdapter.getWrappedAdapter();
        } else {
            gVar = (g) adapter;
            headersCount = 0;
        }
        int count = gVar.getCount();
        while (true) {
            if (i10 >= count) {
                i10 = -1;
                break;
            }
            if (menuItemQ == gVar.getItem(i10)) {
                break;
            }
            i10++;
        }
        if (i10 != -1 && (firstVisiblePosition = (i10 + headersCount) - listViewA.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < listViewA.getChildCount()) {
            return listViewA.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    private int s() {
        return this.f1204x.getLayoutDirection() == 1 ? 0 : 1;
    }

    private int t(int i10) {
        List list = this.f1198r;
        ListView listViewA = ((d) list.get(list.size() - 1)).a();
        int[] iArr = new int[2];
        listViewA.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f1205y.getWindowVisibleDisplayFrame(rect);
        return this.f1206z == 1 ? (iArr[0] + listViewA.getWidth()) + i10 > rect.right ? 0 : 1 : iArr[0] - i10 < 0 ? 1 : 0;
    }

    private void u(h hVar) {
        d dVar;
        View viewR;
        int i10;
        int i11;
        int i12;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f1191b);
        g gVar = new g(hVar, layoutInflaterFrom, this.f1195f, K);
        if (!isShowing() && this.E) {
            gVar.d(true);
        } else if (isShowing()) {
            gVar.d(l.m(hVar));
        }
        int iD = l.d(gVar, null, this.f1191b, this.f1192c);
        MenuPopupWindow menuPopupWindowO = o();
        menuPopupWindowO.setAdapter(gVar);
        menuPopupWindowO.setContentWidth(iD);
        menuPopupWindowO.setDropDownGravity(this.f1203w);
        if (this.f1198r.size() > 0) {
            List list = this.f1198r;
            dVar = (d) list.get(list.size() - 1);
            viewR = r(dVar, hVar);
        } else {
            dVar = null;
            viewR = null;
        }
        if (viewR != null) {
            menuPopupWindowO.setTouchModal(false);
            menuPopupWindowO.setEnterTransition(null);
            int iT = t(iD);
            boolean z10 = iT == 1;
            this.f1206z = iT;
            if (Build.VERSION.SDK_INT >= 26) {
                menuPopupWindowO.setAnchorView(viewR);
                i11 = 0;
                i10 = 0;
            } else {
                int[] iArr = new int[2];
                this.f1204x.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                viewR.getLocationOnScreen(iArr2);
                if ((this.f1203w & 7) == 5) {
                    iArr[0] = iArr[0] + this.f1204x.getWidth();
                    iArr2[0] = iArr2[0] + viewR.getWidth();
                }
                i10 = iArr2[0] - iArr[0];
                i11 = iArr2[1] - iArr[1];
            }
            if ((this.f1203w & 5) == 5) {
                if (!z10) {
                    iD = viewR.getWidth();
                    i12 = i10 - iD;
                }
                i12 = i10 + iD;
            } else {
                if (z10) {
                    iD = viewR.getWidth();
                    i12 = i10 + iD;
                }
                i12 = i10 - iD;
            }
            menuPopupWindowO.setHorizontalOffset(i12);
            menuPopupWindowO.setOverlapAnchor(true);
            menuPopupWindowO.setVerticalOffset(i11);
        } else {
            if (this.A) {
                menuPopupWindowO.setHorizontalOffset(this.C);
            }
            if (this.B) {
                menuPopupWindowO.setVerticalOffset(this.D);
            }
            menuPopupWindowO.setEpicenterBounds(c());
        }
        this.f1198r.add(new d(menuPopupWindowO, hVar, this.f1206z));
        menuPopupWindowO.show();
        ListView listView = menuPopupWindowO.getListView();
        listView.setOnKeyListener(this);
        if (dVar == null && this.F && hVar.z() != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(h.g.f14879n, (ViewGroup) listView, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(hVar.z());
            listView.addHeaderView(frameLayout, null, false);
            menuPopupWindowO.show();
        }
    }

    @Override // androidx.appcompat.view.menu.l
    public void a(h hVar) {
        hVar.c(this, this.f1191b);
        if (isShowing()) {
            u(hVar);
        } else {
            this.f1197h.add(hVar);
        }
    }

    @Override // androidx.appcompat.view.menu.l
    protected boolean b() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.q
    public void dismiss() {
        int size = this.f1198r.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.f1198r.toArray(new d[size]);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                d dVar = dVarArr[i10];
                if (dVar.f1214a.isShowing()) {
                    dVar.f1214a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.l
    public void e(View view) {
        if (this.f1204x != view) {
            this.f1204x = view;
            this.f1203w = m0.l.b(this.f1202v, view.getLayoutDirection());
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean flagActionItems() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.l
    public void g(boolean z10) {
        this.E = z10;
    }

    @Override // androidx.appcompat.view.menu.q
    public ListView getListView() {
        if (this.f1198r.isEmpty()) {
            return null;
        }
        return ((d) this.f1198r.get(r0.size() - 1)).a();
    }

    @Override // androidx.appcompat.view.menu.l
    public void h(int i10) {
        if (this.f1202v != i10) {
            this.f1202v = i10;
            this.f1203w = m0.l.b(i10, this.f1204x.getLayoutDirection());
        }
    }

    @Override // androidx.appcompat.view.menu.l
    public void i(int i10) {
        this.A = true;
        this.C = i10;
    }

    @Override // androidx.appcompat.view.menu.q
    public boolean isShowing() {
        return this.f1198r.size() > 0 && ((d) this.f1198r.get(0)).f1214a.isShowing();
    }

    @Override // androidx.appcompat.view.menu.l
    public void j(PopupWindow.OnDismissListener onDismissListener) {
        this.I = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.l
    public void k(boolean z10) {
        this.F = z10;
    }

    @Override // androidx.appcompat.view.menu.l
    public void l(int i10) {
        this.B = true;
        this.D = i10;
    }

    @Override // androidx.appcompat.view.menu.n
    public void onCloseMenu(h hVar, boolean z10) {
        int iP = p(hVar);
        if (iP < 0) {
            return;
        }
        int i10 = iP + 1;
        if (i10 < this.f1198r.size()) {
            ((d) this.f1198r.get(i10)).f1215b.e(false);
        }
        d dVar = (d) this.f1198r.remove(iP);
        dVar.f1215b.R(this);
        if (this.J) {
            dVar.f1214a.setExitTransition(null);
            dVar.f1214a.setAnimationStyle(0);
        }
        dVar.f1214a.dismiss();
        int size = this.f1198r.size();
        if (size > 0) {
            this.f1206z = ((d) this.f1198r.get(size - 1)).f1216c;
        } else {
            this.f1206z = s();
        }
        if (size != 0) {
            if (z10) {
                ((d) this.f1198r.get(0)).f1215b.e(false);
                return;
            }
            return;
        }
        dismiss();
        n.a aVar = this.G;
        if (aVar != null) {
            aVar.onCloseMenu(hVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.H;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.H.removeGlobalOnLayoutListener(this.f1199s);
            }
            this.H = null;
        }
        this.f1205y.removeOnAttachStateChangeListener(this.f1200t);
        this.I.onDismiss();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.f1198r.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                dVar = null;
                break;
            }
            dVar = (d) this.f1198r.get(i10);
            if (!dVar.f1214a.isShowing()) {
                break;
            } else {
                i10++;
            }
        }
        if (dVar != null) {
            dVar.f1215b.e(false);
        }
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
    public boolean onSubMenuSelected(s sVar) {
        for (d dVar : this.f1198r) {
            if (sVar == dVar.f1215b) {
                dVar.a().requestFocus();
                return true;
            }
        }
        if (!sVar.hasVisibleItems()) {
            return false;
        }
        a(sVar);
        n.a aVar = this.G;
        if (aVar != null) {
            aVar.onOpenSubMenu(sVar);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.n
    public void setCallback(n.a aVar) {
        this.G = aVar;
    }

    @Override // androidx.appcompat.view.menu.q
    public void show() {
        if (isShowing()) {
            return;
        }
        Iterator it = this.f1197h.iterator();
        while (it.hasNext()) {
            u((h) it.next());
        }
        this.f1197h.clear();
        View view = this.f1204x;
        this.f1205y = view;
        if (view != null) {
            boolean z10 = this.H == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.H = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f1199s);
            }
            this.f1205y.addOnAttachStateChangeListener(this.f1200t);
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public void updateMenuView(boolean z10) {
        Iterator it = this.f1198r.iterator();
        while (it.hasNext()) {
            l.n(((d) it.next()).a().getAdapter()).notifyDataSetChanged();
        }
    }
}
