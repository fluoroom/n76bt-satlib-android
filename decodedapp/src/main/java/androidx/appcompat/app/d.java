package androidx.appcompat.app;

import a0.w;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.app.b;
import androidx.appcompat.view.b;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.VectorEnabledTintResources;
import l1.f;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends androidx.fragment.app.p implements e, w.a, b.c {
    private h K;
    private Resources L;

    class a implements f.b {
        a() {
        }

        @Override // l1.f.b
        public Bundle a() {
            Bundle bundle = new Bundle();
            d.this.X0().E(bundle);
            return bundle;
        }
    }

    class b implements e.b {
        b() {
        }

        @Override // e.b
        public void a(Context context) {
            h hVarX0 = d.this.X0();
            hVarX0.w();
            hVarX0.A(d.this.e0().a("androidx:appcompat"));
        }
    }

    public d() {
        Z0();
    }

    private void Z0() {
        e0().c("androidx:appcompat", new a());
        t0(new b());
    }

    private boolean g1(KeyEvent keyEvent) {
        Window window;
        return (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true;
    }

    @Override // androidx.fragment.app.p
    public void V0() {
        X0().x();
    }

    public h X0() {
        if (this.K == null) {
            this.K = h.j(this, this);
        }
        return this.K;
    }

    public androidx.appcompat.app.a Y0() {
        return X0().v();
    }

    public void a1(a0.w wVar) {
        wVar.c(this);
    }

    @Override // d.q, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        B0();
        X0().d(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(X0().i(context));
    }

    protected void c1(int i10) {
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        androidx.appcompat.app.a aVarY0 = Y0();
        if (getWindow().hasFeature(0)) {
            if (aVarY0 == null || !aVarY0.a()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // a0.g, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        androidx.appcompat.app.a aVarY0 = Y0();
        if (keyCode == 82 && aVarY0 != null && aVarY0.k(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // androidx.appcompat.app.e
    public void e(androidx.appcompat.view.b bVar) {
    }

    public void e1() {
    }

    @Override // androidx.appcompat.app.b.c
    public b.InterfaceC0016b f() {
        return X0().p();
    }

    public boolean f1() {
        Intent intentM = m();
        if (intentM == null) {
            return false;
        }
        if (!l1(intentM)) {
            j1(intentM);
            return true;
        }
        a0.w wVarE = a0.w.e(this);
        a1(wVarE);
        d1(wVarE);
        wVarE.f();
        try {
            a0.b.o(this);
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override // android.app.Activity
    public View findViewById(int i10) {
        return X0().l(i10);
    }

    @Override // androidx.appcompat.app.e
    public void g(androidx.appcompat.view.b bVar) {
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return X0().s();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.L == null && VectorEnabledTintResources.shouldBeUsed()) {
            this.L = new VectorEnabledTintResources(this, super.getResources());
        }
        Resources resources = this.L;
        return resources == null ? super.getResources() : resources;
    }

    public void h1(Toolbar toolbar) {
        X0().Q(toolbar);
    }

    public androidx.appcompat.view.b i1(b.a aVar) {
        return X0().T(aVar);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        X0().x();
    }

    public void j1(Intent intent) {
        a0.i.e(this, intent);
    }

    public boolean k1(int i10) {
        return X0().J(i10);
    }

    public boolean l1(Intent intent) {
        return a0.i.f(this, intent);
    }

    @Override // a0.w.a
    public Intent m() {
        return a0.i.a(this);
    }

    @Override // d.q, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        X0().z(configuration);
        if (this.L != null) {
            this.L.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        e1();
    }

    @Override // androidx.fragment.app.p, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        X0().B();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (g1(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // androidx.fragment.app.p, d.q, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        androidx.appcompat.app.a aVarY0 = Y0();
        if (menuItem.getItemId() != 16908332 || aVarY0 == null || (aVarY0.d() & 4) == 0) {
            return false;
        }
        return f1();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i10, Menu menu) {
        return super.onMenuOpened(i10, menu);
    }

    @Override // d.q, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        X0().C(bundle);
    }

    @Override // androidx.fragment.app.p, android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        X0().D();
    }

    @Override // androidx.fragment.app.p, android.app.Activity
    protected void onStart() {
        super.onStart();
        X0().F();
    }

    @Override // androidx.fragment.app.p, android.app.Activity
    protected void onStop() {
        super.onStop();
        X0().G();
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i10) {
        super.onTitleChanged(charSequence, i10);
        X0().S(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        androidx.appcompat.app.a aVarY0 = Y0();
        if (getWindow().hasFeature(0)) {
            if (aVarY0 == null || !aVarY0.l()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // androidx.appcompat.app.e
    public androidx.appcompat.view.b s(b.a aVar) {
        return null;
    }

    @Override // d.q, android.app.Activity
    public void setContentView(int i10) {
        B0();
        X0().M(i10);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        super.setTheme(i10);
        X0().R(i10);
    }

    @Override // d.q, android.app.Activity
    public void setContentView(View view) {
        B0();
        X0().N(view);
    }

    @Override // d.q, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        B0();
        X0().O(view, layoutParams);
    }

    protected void b1(i0.f fVar) {
    }

    public void d1(a0.w wVar) {
    }
}
