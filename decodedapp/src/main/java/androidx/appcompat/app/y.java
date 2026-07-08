package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.view.b;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.DecorToolbar;
import androidx.appcompat.widget.ScrollingTabContainerView;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import m0.a1;
import m0.b1;
import m0.o0;
import m0.y0;
import m0.z0;

/* JADX INFO: loaded from: classes.dex */
public class y extends androidx.appcompat.app.a implements ActionBarOverlayLayout.ActionBarVisibilityCallback {
    private static final Interpolator E = new AccelerateInterpolator();
    private static final Interpolator F = new DecelerateInterpolator();
    boolean A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Context f988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Activity f990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    ActionBarOverlayLayout f991d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ActionBarContainer f992e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    DecorToolbar f993f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    ActionBarContextView f994g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    View f995h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    ScrollingTabContainerView f996i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f999l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    d f1000m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    androidx.appcompat.view.b f1001n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    b.a f1002o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f1003p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f1005r;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    boolean f1008u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    boolean f1009v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f1010w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    androidx.appcompat.view.h f1012y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f1013z;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ArrayList f997j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f998k = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ArrayList f1004q = new ArrayList();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f1006s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    boolean f1007t = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f1011x = true;
    final z0 B = new a();
    final z0 C = new b();
    final b1 D = new c();

    class a extends a1 {
        a() {
        }

        @Override // m0.z0
        public void onAnimationEnd(View view) {
            View view2;
            y yVar = y.this;
            if (yVar.f1007t && (view2 = yVar.f995h) != null) {
                view2.setTranslationY(0.0f);
                y.this.f992e.setTranslationY(0.0f);
            }
            y.this.f992e.setVisibility(8);
            y.this.f992e.setTransitioning(false);
            y yVar2 = y.this;
            yVar2.f1012y = null;
            yVar2.E();
            ActionBarOverlayLayout actionBarOverlayLayout = y.this.f991d;
            if (actionBarOverlayLayout != null) {
                o0.j0(actionBarOverlayLayout);
            }
        }
    }

    class b extends a1 {
        b() {
        }

        @Override // m0.z0
        public void onAnimationEnd(View view) {
            y yVar = y.this;
            yVar.f1012y = null;
            yVar.f992e.requestLayout();
        }
    }

    class c implements b1 {
        c() {
        }

        @Override // m0.b1
        public void a(View view) {
            ((View) y.this.f992e.getParent()).invalidate();
        }
    }

    public class d extends androidx.appcompat.view.b implements h.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f1017a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final androidx.appcompat.view.menu.h f1018b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private b.a f1019c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private WeakReference f1020d;

        public d(Context context, b.a aVar) {
            this.f1017a = context;
            this.f1019c = aVar;
            androidx.appcompat.view.menu.h hVarX = new androidx.appcompat.view.menu.h(context).X(1);
            this.f1018b = hVarX;
            hVarX.W(this);
        }

        public boolean a() {
            this.f1018b.i0();
            try {
                return this.f1019c.b(this, this.f1018b);
            } finally {
                this.f1018b.h0();
            }
        }

        @Override // androidx.appcompat.view.b
        public void finish() {
            y yVar = y.this;
            if (yVar.f1000m != this) {
                return;
            }
            if (y.D(yVar.f1008u, yVar.f1009v, false)) {
                this.f1019c.a(this);
            } else {
                y yVar2 = y.this;
                yVar2.f1001n = this;
                yVar2.f1002o = this.f1019c;
            }
            this.f1019c = null;
            y.this.C(false);
            y.this.f994g.closeMode();
            y yVar3 = y.this;
            yVar3.f991d.setHideOnContentScrollEnabled(yVar3.A);
            y.this.f1000m = null;
        }

        @Override // androidx.appcompat.view.b
        public View getCustomView() {
            WeakReference weakReference = this.f1020d;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        @Override // androidx.appcompat.view.b
        public Menu getMenu() {
            return this.f1018b;
        }

        @Override // androidx.appcompat.view.b
        public MenuInflater getMenuInflater() {
            return new androidx.appcompat.view.g(this.f1017a);
        }

        @Override // androidx.appcompat.view.b
        public CharSequence getSubtitle() {
            return y.this.f994g.getSubtitle();
        }

        @Override // androidx.appcompat.view.b
        public CharSequence getTitle() {
            return y.this.f994g.getTitle();
        }

        @Override // androidx.appcompat.view.b
        public void invalidate() {
            if (y.this.f1000m != this) {
                return;
            }
            this.f1018b.i0();
            try {
                this.f1019c.c(this, this.f1018b);
            } finally {
                this.f1018b.h0();
            }
        }

        @Override // androidx.appcompat.view.b
        public boolean isTitleOptional() {
            return y.this.f994g.isTitleOptional();
        }

        @Override // androidx.appcompat.view.menu.h.a
        public boolean onMenuItemSelected(androidx.appcompat.view.menu.h hVar, MenuItem menuItem) {
            b.a aVar = this.f1019c;
            if (aVar != null) {
                return aVar.d(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.h.a
        public void onMenuModeChange(androidx.appcompat.view.menu.h hVar) {
            if (this.f1019c == null) {
                return;
            }
            invalidate();
            y.this.f994g.showOverflowMenu();
        }

        @Override // androidx.appcompat.view.b
        public void setCustomView(View view) {
            y.this.f994g.setCustomView(view);
            this.f1020d = new WeakReference(view);
        }

        @Override // androidx.appcompat.view.b
        public void setSubtitle(CharSequence charSequence) {
            y.this.f994g.setSubtitle(charSequence);
        }

        @Override // androidx.appcompat.view.b
        public void setTitle(CharSequence charSequence) {
            y.this.f994g.setTitle(charSequence);
        }

        @Override // androidx.appcompat.view.b
        public void setTitleOptionalHint(boolean z10) {
            super.setTitleOptionalHint(z10);
            y.this.f994g.setTitleOptional(z10);
        }

        @Override // androidx.appcompat.view.b
        public void setSubtitle(int i10) {
            setSubtitle(y.this.f988a.getResources().getString(i10));
        }

        @Override // androidx.appcompat.view.b
        public void setTitle(int i10) {
            setTitle(y.this.f988a.getResources().getString(i10));
        }
    }

    public y(Activity activity, boolean z10) {
        this.f990c = activity;
        View decorView = activity.getWindow().getDecorView();
        K(decorView);
        if (z10) {
            return;
        }
        this.f995h = decorView.findViewById(R.id.content);
    }

    static boolean D(boolean z10, boolean z11, boolean z12) {
        if (z12) {
            return true;
        }
        return (z10 || z11) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private DecorToolbar H(View view) {
        if (view instanceof DecorToolbar) {
            return (DecorToolbar) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Can't make a decor toolbar out of ");
        sb2.append(view != 0 ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb2.toString());
    }

    private void J() {
        if (this.f1010w) {
            this.f1010w = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f991d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            R(false);
        }
    }

    private void K(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(h.f.f14856q);
        this.f991d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f993f = H(view.findViewById(h.f.f14840a));
        this.f994g = (ActionBarContextView) view.findViewById(h.f.f14845f);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(h.f.f14842c);
        this.f992e = actionBarContainer;
        DecorToolbar decorToolbar = this.f993f;
        if (decorToolbar == null || this.f994g == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f988a = decorToolbar.getContext();
        boolean z10 = (this.f993f.getDisplayOptions() & 4) != 0;
        if (z10) {
            this.f999l = true;
        }
        androidx.appcompat.view.a aVarB = androidx.appcompat.view.a.b(this.f988a);
        t(aVarB.a() || z10);
        N(aVarB.g());
        TypedArray typedArrayObtainStyledAttributes = this.f988a.obtainStyledAttributes(null, h.j.f14913a, h.a.f14742c, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(h.j.f14971k, false)) {
            O(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(h.j.f14961i, 0);
        if (dimensionPixelSize != 0) {
            M(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void N(boolean z10) {
        this.f1005r = z10;
        if (z10) {
            this.f992e.setTabContainer(null);
            this.f993f.setEmbeddedTabView(this.f996i);
        } else {
            this.f993f.setEmbeddedTabView(null);
            this.f992e.setTabContainer(this.f996i);
        }
        boolean z11 = I() == 2;
        ScrollingTabContainerView scrollingTabContainerView = this.f996i;
        if (scrollingTabContainerView != null) {
            if (z11) {
                scrollingTabContainerView.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f991d;
                if (actionBarOverlayLayout != null) {
                    o0.j0(actionBarOverlayLayout);
                }
            } else {
                scrollingTabContainerView.setVisibility(8);
            }
        }
        this.f993f.setCollapsible(!this.f1005r && z11);
        this.f991d.setHasNonEmbeddedTabs(!this.f1005r && z11);
    }

    private boolean P() {
        return this.f992e.isLaidOut();
    }

    private void Q() {
        if (this.f1010w) {
            return;
        }
        this.f1010w = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f991d;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        R(false);
    }

    private void R(boolean z10) {
        if (D(this.f1008u, this.f1009v, this.f1010w)) {
            if (this.f1011x) {
                return;
            }
            this.f1011x = true;
            G(z10);
            return;
        }
        if (this.f1011x) {
            this.f1011x = false;
            F(z10);
        }
    }

    @Override // androidx.appcompat.app.a
    public void A() {
        if (this.f1008u) {
            this.f1008u = false;
            R(false);
        }
    }

    @Override // androidx.appcompat.app.a
    public androidx.appcompat.view.b B(b.a aVar) {
        d dVar = this.f1000m;
        if (dVar != null) {
            dVar.finish();
        }
        this.f991d.setHideOnContentScrollEnabled(false);
        this.f994g.killMode();
        d dVar2 = new d(this.f994g.getContext(), aVar);
        if (!dVar2.a()) {
            return null;
        }
        this.f1000m = dVar2;
        dVar2.invalidate();
        this.f994g.initForMode(dVar2);
        C(true);
        return dVar2;
    }

    public void C(boolean z10) {
        y0 y0Var;
        y0 y0Var2;
        if (z10) {
            Q();
        } else {
            J();
        }
        if (!P()) {
            if (z10) {
                this.f993f.setVisibility(4);
                this.f994g.setVisibility(0);
                return;
            } else {
                this.f993f.setVisibility(0);
                this.f994g.setVisibility(8);
                return;
            }
        }
        if (z10) {
            y0Var2 = this.f993f.setupAnimatorToVisibility(4, 100L);
            y0Var = this.f994g.setupAnimatorToVisibility(0, 200L);
        } else {
            y0Var = this.f993f.setupAnimatorToVisibility(0, 200L);
            y0Var2 = this.f994g.setupAnimatorToVisibility(8, 100L);
        }
        androidx.appcompat.view.h hVar = new androidx.appcompat.view.h();
        hVar.d(y0Var2, y0Var);
        hVar.h();
    }

    void E() {
        b.a aVar = this.f1002o;
        if (aVar != null) {
            aVar.a(this.f1001n);
            this.f1001n = null;
            this.f1002o = null;
        }
    }

    public void F(boolean z10) {
        View view;
        androidx.appcompat.view.h hVar = this.f1012y;
        if (hVar != null) {
            hVar.a();
        }
        if (this.f1006s != 0 || (!this.f1013z && !z10)) {
            this.B.onAnimationEnd(null);
            return;
        }
        this.f992e.setAlpha(1.0f);
        this.f992e.setTransitioning(true);
        androidx.appcompat.view.h hVar2 = new androidx.appcompat.view.h();
        float f10 = -this.f992e.getHeight();
        if (z10) {
            this.f992e.getLocationInWindow(new int[]{0, 0});
            f10 -= r5[1];
        }
        y0 y0VarL = o0.e(this.f992e).l(f10);
        y0VarL.j(this.D);
        hVar2.c(y0VarL);
        if (this.f1007t && (view = this.f995h) != null) {
            hVar2.c(o0.e(view).l(f10));
        }
        hVar2.f(E);
        hVar2.e(250L);
        hVar2.g(this.B);
        this.f1012y = hVar2;
        hVar2.h();
    }

    public void G(boolean z10) {
        View view;
        View view2;
        androidx.appcompat.view.h hVar = this.f1012y;
        if (hVar != null) {
            hVar.a();
        }
        this.f992e.setVisibility(0);
        if (this.f1006s == 0 && (this.f1013z || z10)) {
            this.f992e.setTranslationY(0.0f);
            float f10 = -this.f992e.getHeight();
            if (z10) {
                this.f992e.getLocationInWindow(new int[]{0, 0});
                f10 -= r5[1];
            }
            this.f992e.setTranslationY(f10);
            androidx.appcompat.view.h hVar2 = new androidx.appcompat.view.h();
            y0 y0VarL = o0.e(this.f992e).l(0.0f);
            y0VarL.j(this.D);
            hVar2.c(y0VarL);
            if (this.f1007t && (view2 = this.f995h) != null) {
                view2.setTranslationY(f10);
                hVar2.c(o0.e(this.f995h).l(0.0f));
            }
            hVar2.f(F);
            hVar2.e(250L);
            hVar2.g(this.C);
            this.f1012y = hVar2;
            hVar2.h();
        } else {
            this.f992e.setAlpha(1.0f);
            this.f992e.setTranslationY(0.0f);
            if (this.f1007t && (view = this.f995h) != null) {
                view.setTranslationY(0.0f);
            }
            this.C.onAnimationEnd(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f991d;
        if (actionBarOverlayLayout != null) {
            o0.j0(actionBarOverlayLayout);
        }
    }

    public int I() {
        return this.f993f.getNavigationMode();
    }

    public void L(int i10, int i11) {
        int displayOptions = this.f993f.getDisplayOptions();
        if ((i11 & 4) != 0) {
            this.f999l = true;
        }
        this.f993f.setDisplayOptions((i10 & i11) | ((~i11) & displayOptions));
    }

    public void M(float f10) {
        o0.t0(this.f992e, f10);
    }

    public void O(boolean z10) {
        if (z10 && !this.f991d.isInOverlayMode()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.A = z10;
        this.f991d.setHideOnContentScrollEnabled(z10);
    }

    @Override // androidx.appcompat.app.a
    public boolean b() {
        DecorToolbar decorToolbar = this.f993f;
        if (decorToolbar == null || !decorToolbar.hasExpandedActionView()) {
            return false;
        }
        this.f993f.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void c(boolean z10) {
        if (z10 == this.f1003p) {
            return;
        }
        this.f1003p = z10;
        if (this.f1004q.size() <= 0) {
            return;
        }
        android.support.v4.media.session.b.a(this.f1004q.get(0));
        throw null;
    }

    @Override // androidx.appcompat.app.a
    public int d() {
        return this.f993f.getDisplayOptions();
    }

    @Override // androidx.appcompat.app.a
    public Context e() {
        if (this.f989b == null) {
            TypedValue typedValue = new TypedValue();
            this.f988a.getTheme().resolveAttribute(h.a.f14750g, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                this.f989b = new ContextThemeWrapper(this.f988a, i10);
            } else {
                this.f989b = this.f988a;
            }
        }
        return this.f989b;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void enableContentAnimations(boolean z10) {
        this.f1007t = z10;
    }

    @Override // androidx.appcompat.app.a
    public void f() {
        if (this.f1008u) {
            return;
        }
        this.f1008u = true;
        R(false);
    }

    @Override // androidx.appcompat.app.a
    public void h(Configuration configuration) {
        N(androidx.appcompat.view.a.b(this.f988a).g());
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void hideForSystem() {
        if (this.f1009v) {
            return;
        }
        this.f1009v = true;
        R(true);
    }

    @Override // androidx.appcompat.app.a
    public boolean j(int i10, KeyEvent keyEvent) {
        Menu menu;
        d dVar = this.f1000m;
        if (dVar == null || (menu = dVar.getMenu()) == null) {
            return false;
        }
        menu.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menu.performShortcut(i10, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.a
    public void m(Drawable drawable) {
        this.f992e.setPrimaryBackground(drawable);
    }

    @Override // androidx.appcompat.app.a
    public void n(boolean z10) {
        if (this.f999l) {
            return;
        }
        o(z10);
    }

    @Override // androidx.appcompat.app.a
    public void o(boolean z10) {
        L(z10 ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void onContentScrollStarted() {
        androidx.appcompat.view.h hVar = this.f1012y;
        if (hVar != null) {
            hVar.a();
            this.f1012y = null;
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void onContentScrollStopped() {
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void onWindowVisibilityChanged(int i10) {
        this.f1006s = i10;
    }

    @Override // androidx.appcompat.app.a
    public void p(boolean z10) {
        L(z10 ? 2 : 0, 2);
    }

    @Override // androidx.appcompat.app.a
    public void q(int i10) {
        this.f993f.setNavigationContentDescription(i10);
    }

    @Override // androidx.appcompat.app.a
    public void r(int i10) {
        this.f993f.setNavigationIcon(i10);
    }

    @Override // androidx.appcompat.app.a
    public void s(Drawable drawable) {
        this.f993f.setNavigationIcon(drawable);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void showForSystem() {
        if (this.f1009v) {
            this.f1009v = false;
            R(true);
        }
    }

    @Override // androidx.appcompat.app.a
    public void t(boolean z10) {
        this.f993f.setHomeButtonEnabled(z10);
    }

    @Override // androidx.appcompat.app.a
    public void u(int i10) {
        this.f993f.setLogo(i10);
    }

    @Override // androidx.appcompat.app.a
    public void v(boolean z10) {
        androidx.appcompat.view.h hVar;
        this.f1013z = z10;
        if (z10 || (hVar = this.f1012y) == null) {
            return;
        }
        hVar.a();
    }

    @Override // androidx.appcompat.app.a
    public void w(CharSequence charSequence) {
        this.f993f.setSubtitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void x(int i10) {
        y(this.f988a.getString(i10));
    }

    @Override // androidx.appcompat.app.a
    public void y(CharSequence charSequence) {
        this.f993f.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void z(CharSequence charSequence) {
        this.f993f.setWindowTitle(charSequence);
    }

    public y(Dialog dialog) {
        K(dialog.getWindow().getDecorView());
    }
}
