package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.MenuPopupWindow;

/* JADX INFO: loaded from: classes.dex */
final class r extends l implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, n, View.OnKeyListener {
    private static final int E = h.g.f14880o;
    private boolean A;
    private int B;
    private boolean D;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f1305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h f1306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g f1307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f1308e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f1309f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f1310g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f1311h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final MenuPopupWindow f1312r;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private PopupWindow.OnDismissListener f1315u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private View f1316v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    View f1317w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private n.a f1318x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    ViewTreeObserver f1319y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f1320z;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f1313s = new a();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f1314t = new b();
    private int C = 0;

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!r.this.isShowing() || r.this.f1312r.isModal()) {
                return;
            }
            View view = r.this.f1317w;
            if (view == null || !view.isShown()) {
                r.this.dismiss();
            } else {
                r.this.f1312r.show();
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
            ViewTreeObserver viewTreeObserver = r.this.f1319y;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    r.this.f1319y = view.getViewTreeObserver();
                }
                r rVar = r.this;
                rVar.f1319y.removeGlobalOnLayoutListener(rVar.f1313s);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public r(Context context, h hVar, View view, int i10, int i11, boolean z10) {
        this.f1305b = context;
        this.f1306c = hVar;
        this.f1308e = z10;
        this.f1307d = new g(hVar, LayoutInflater.from(context), z10, E);
        this.f1310g = i10;
        this.f1311h = i11;
        Resources resources = context.getResources();
        this.f1309f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(h.d.f14802d));
        this.f1316v = view;
        this.f1312r = new MenuPopupWindow(context, null, i10, i11);
        hVar.c(this, context);
    }

    private boolean o() {
        View view;
        if (isShowing()) {
            return true;
        }
        if (this.f1320z || (view = this.f1316v) == null) {
            return false;
        }
        this.f1317w = view;
        this.f1312r.setOnDismissListener(this);
        this.f1312r.setOnItemClickListener(this);
        this.f1312r.setModal(true);
        View view2 = this.f1317w;
        boolean z10 = this.f1319y == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f1319y = viewTreeObserver;
        if (z10) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f1313s);
        }
        view2.addOnAttachStateChangeListener(this.f1314t);
        this.f1312r.setAnchorView(view2);
        this.f1312r.setDropDownGravity(this.C);
        if (!this.A) {
            this.B = l.d(this.f1307d, null, this.f1305b, this.f1309f);
            this.A = true;
        }
        this.f1312r.setContentWidth(this.B);
        this.f1312r.setInputMethodMode(2);
        this.f1312r.setEpicenterBounds(c());
        this.f1312r.show();
        ListView listView = this.f1312r.getListView();
        listView.setOnKeyListener(this);
        if (this.D && this.f1306c.z() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f1305b).inflate(h.g.f14879n, (ViewGroup) listView, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.f1306c.z());
            }
            frameLayout.setEnabled(false);
            listView.addHeaderView(frameLayout, null, false);
        }
        this.f1312r.setAdapter(this.f1307d);
        this.f1312r.show();
        return true;
    }

    @Override // androidx.appcompat.view.menu.l
    public void a(h hVar) {
    }

    @Override // androidx.appcompat.view.menu.q
    public void dismiss() {
        if (isShowing()) {
            this.f1312r.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.l
    public void e(View view) {
        this.f1316v = view;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean flagActionItems() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.l
    public void g(boolean z10) {
        this.f1307d.d(z10);
    }

    @Override // androidx.appcompat.view.menu.q
    public ListView getListView() {
        return this.f1312r.getListView();
    }

    @Override // androidx.appcompat.view.menu.l
    public void h(int i10) {
        this.C = i10;
    }

    @Override // androidx.appcompat.view.menu.l
    public void i(int i10) {
        this.f1312r.setHorizontalOffset(i10);
    }

    @Override // androidx.appcompat.view.menu.q
    public boolean isShowing() {
        return !this.f1320z && this.f1312r.isShowing();
    }

    @Override // androidx.appcompat.view.menu.l
    public void j(PopupWindow.OnDismissListener onDismissListener) {
        this.f1315u = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.l
    public void k(boolean z10) {
        this.D = z10;
    }

    @Override // androidx.appcompat.view.menu.l
    public void l(int i10) {
        this.f1312r.setVerticalOffset(i10);
    }

    @Override // androidx.appcompat.view.menu.n
    public void onCloseMenu(h hVar, boolean z10) {
        if (hVar != this.f1306c) {
            return;
        }
        dismiss();
        n.a aVar = this.f1318x;
        if (aVar != null) {
            aVar.onCloseMenu(hVar, z10);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f1320z = true;
        this.f1306c.close();
        ViewTreeObserver viewTreeObserver = this.f1319y;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f1319y = this.f1317w.getViewTreeObserver();
            }
            this.f1319y.removeGlobalOnLayoutListener(this.f1313s);
            this.f1319y = null;
        }
        this.f1317w.removeOnAttachStateChangeListener(this.f1314t);
        PopupWindow.OnDismissListener onDismissListener = this.f1315u;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
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
        if (sVar.hasVisibleItems()) {
            m mVar = new m(this.f1305b, sVar, this.f1317w, this.f1308e, this.f1310g, this.f1311h);
            mVar.setPresenterCallback(this.f1318x);
            mVar.setForceShowIcon(l.m(sVar));
            mVar.setOnDismissListener(this.f1315u);
            this.f1315u = null;
            this.f1306c.e(false);
            int horizontalOffset = this.f1312r.getHorizontalOffset();
            int verticalOffset = this.f1312r.getVerticalOffset();
            if ((Gravity.getAbsoluteGravity(this.C, this.f1316v.getLayoutDirection()) & 7) == 5) {
                horizontalOffset += this.f1316v.getWidth();
            }
            if (mVar.tryShow(horizontalOffset, verticalOffset)) {
                n.a aVar = this.f1318x;
                if (aVar == null) {
                    return true;
                }
                aVar.onOpenSubMenu(sVar);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public void setCallback(n.a aVar) {
        this.f1318x = aVar;
    }

    @Override // androidx.appcompat.view.menu.q
    public void show() {
        if (!o()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public void updateMenuView(boolean z10) {
        this.A = false;
        g gVar = this.f1307d;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }
}
