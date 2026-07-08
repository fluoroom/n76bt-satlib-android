package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.j;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.DecorToolbar;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ToolbarWidgetWrapper;
import java.util.ArrayList;
import m0.o0;

/* JADX INFO: loaded from: classes.dex */
class v extends androidx.appcompat.app.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final DecorToolbar f963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Window.Callback f964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final j.g f965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f966d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f967e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f968f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ArrayList f969g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Runnable f970h = new a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Toolbar.OnMenuItemClickListener f971i;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.D();
        }
    }

    class b implements Toolbar.OnMenuItemClickListener {
        b() {
        }

        @Override // androidx.appcompat.widget.Toolbar.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return v.this.f964b.onMenuItemSelected(0, menuItem);
        }
    }

    private final class c implements n.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f974a;

        c() {
        }

        @Override // androidx.appcompat.view.menu.n.a
        public void onCloseMenu(androidx.appcompat.view.menu.h hVar, boolean z10) {
            if (this.f974a) {
                return;
            }
            this.f974a = true;
            v.this.f963a.dismissPopupMenus();
            v.this.f964b.onPanelClosed(108, hVar);
            this.f974a = false;
        }

        @Override // androidx.appcompat.view.menu.n.a
        public boolean onOpenSubMenu(androidx.appcompat.view.menu.h hVar) {
            v.this.f964b.onMenuOpened(108, hVar);
            return true;
        }
    }

    private final class d implements h.a {
        d() {
        }

        @Override // androidx.appcompat.view.menu.h.a
        public boolean onMenuItemSelected(androidx.appcompat.view.menu.h hVar, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.h.a
        public void onMenuModeChange(androidx.appcompat.view.menu.h hVar) {
            if (v.this.f963a.isOverflowMenuShowing()) {
                v.this.f964b.onPanelClosed(108, hVar);
            } else if (v.this.f964b.onPreparePanel(0, null, hVar)) {
                v.this.f964b.onMenuOpened(108, hVar);
            }
        }
    }

    private class e implements j.g {
        e() {
        }

        @Override // androidx.appcompat.app.j.g
        public boolean a(int i10) {
            if (i10 != 0) {
                return false;
            }
            v vVar = v.this;
            if (vVar.f966d) {
                return false;
            }
            vVar.f963a.setMenuPrepared();
            v.this.f966d = true;
            return false;
        }

        @Override // androidx.appcompat.app.j.g
        public View onCreatePanelView(int i10) {
            if (i10 == 0) {
                return new View(v.this.f963a.getContext());
            }
            return null;
        }
    }

    v(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        b bVar = new b();
        this.f971i = bVar;
        l0.g.g(toolbar);
        ToolbarWidgetWrapper toolbarWidgetWrapper = new ToolbarWidgetWrapper(toolbar, false);
        this.f963a = toolbarWidgetWrapper;
        this.f964b = (Window.Callback) l0.g.g(callback);
        toolbarWidgetWrapper.setWindowCallback(callback);
        toolbar.setOnMenuItemClickListener(bVar);
        toolbarWidgetWrapper.setWindowTitle(charSequence);
        this.f965c = new e();
    }

    private Menu C() {
        if (!this.f967e) {
            this.f963a.setMenuCallbacks(new c(), new d());
            this.f967e = true;
        }
        return this.f963a.getMenu();
    }

    @Override // androidx.appcompat.app.a
    public void A() {
        this.f963a.setVisibility(0);
    }

    void D() {
        Menu menuC = C();
        androidx.appcompat.view.menu.h hVar = menuC instanceof androidx.appcompat.view.menu.h ? (androidx.appcompat.view.menu.h) menuC : null;
        if (hVar != null) {
            hVar.i0();
        }
        try {
            menuC.clear();
            if (!this.f964b.onCreatePanelMenu(0, menuC) || !this.f964b.onPreparePanel(0, null, menuC)) {
                menuC.clear();
            }
            if (hVar != null) {
                hVar.h0();
            }
        } catch (Throwable th2) {
            if (hVar != null) {
                hVar.h0();
            }
            throw th2;
        }
    }

    public void E(int i10, int i11) {
        this.f963a.setDisplayOptions((i10 & i11) | ((~i11) & this.f963a.getDisplayOptions()));
    }

    @Override // androidx.appcompat.app.a
    public boolean a() {
        return this.f963a.hideOverflowMenu();
    }

    @Override // androidx.appcompat.app.a
    public boolean b() {
        if (!this.f963a.hasExpandedActionView()) {
            return false;
        }
        this.f963a.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void c(boolean z10) {
        if (z10 == this.f968f) {
            return;
        }
        this.f968f = z10;
        if (this.f969g.size() <= 0) {
            return;
        }
        android.support.v4.media.session.b.a(this.f969g.get(0));
        throw null;
    }

    @Override // androidx.appcompat.app.a
    public int d() {
        return this.f963a.getDisplayOptions();
    }

    @Override // androidx.appcompat.app.a
    public Context e() {
        return this.f963a.getContext();
    }

    @Override // androidx.appcompat.app.a
    public void f() {
        this.f963a.setVisibility(8);
    }

    @Override // androidx.appcompat.app.a
    public boolean g() {
        this.f963a.getViewGroup().removeCallbacks(this.f970h);
        o0.e0(this.f963a.getViewGroup(), this.f970h);
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void h(Configuration configuration) {
        super.h(configuration);
    }

    @Override // androidx.appcompat.app.a
    void i() {
        this.f963a.getViewGroup().removeCallbacks(this.f970h);
    }

    @Override // androidx.appcompat.app.a
    public boolean j(int i10, KeyEvent keyEvent) {
        Menu menuC = C();
        if (menuC == null) {
            return false;
        }
        menuC.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuC.performShortcut(i10, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.a
    public boolean k(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            l();
        }
        return true;
    }

    @Override // androidx.appcompat.app.a
    public boolean l() {
        return this.f963a.showOverflowMenu();
    }

    @Override // androidx.appcompat.app.a
    public void m(Drawable drawable) {
        this.f963a.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.app.a
    public void n(boolean z10) {
    }

    @Override // androidx.appcompat.app.a
    public void o(boolean z10) {
        E(z10 ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.a
    public void p(boolean z10) {
        E(z10 ? 2 : 0, 2);
    }

    @Override // androidx.appcompat.app.a
    public void q(int i10) {
        this.f963a.setNavigationContentDescription(i10);
    }

    @Override // androidx.appcompat.app.a
    public void r(int i10) {
        this.f963a.setNavigationIcon(i10);
    }

    @Override // androidx.appcompat.app.a
    public void s(Drawable drawable) {
        this.f963a.setNavigationIcon(drawable);
    }

    @Override // androidx.appcompat.app.a
    public void t(boolean z10) {
    }

    @Override // androidx.appcompat.app.a
    public void u(int i10) {
        this.f963a.setLogo(i10);
    }

    @Override // androidx.appcompat.app.a
    public void v(boolean z10) {
    }

    @Override // androidx.appcompat.app.a
    public void w(CharSequence charSequence) {
        this.f963a.setSubtitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void x(int i10) {
        DecorToolbar decorToolbar = this.f963a;
        decorToolbar.setTitle(i10 != 0 ? decorToolbar.getContext().getText(i10) : null);
    }

    @Override // androidx.appcompat.app.a
    public void y(CharSequence charSequence) {
        this.f963a.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void z(CharSequence charSequence) {
        this.f963a.setWindowTitle(charSequence);
    }
}
