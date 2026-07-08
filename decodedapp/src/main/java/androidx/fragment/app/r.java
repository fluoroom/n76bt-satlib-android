package androidx.fragment.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t f2448a;

    private r(t tVar) {
        this.f2448a = tVar;
    }

    public static r b(t tVar) {
        return new r((t) l0.g.h(tVar, "callbacks == null"));
    }

    public void a(o oVar) {
        w wVarH = this.f2448a.h();
        t tVar = this.f2448a;
        wVarH.m(tVar, tVar, oVar);
    }

    public void c() {
        this.f2448a.h().y();
    }

    public boolean d(MenuItem menuItem) {
        return this.f2448a.h().B(menuItem);
    }

    public void e() {
        this.f2448a.h().C();
    }

    public void f() {
        this.f2448a.h().E();
    }

    public void g() {
        this.f2448a.h().N();
    }

    public void h() {
        this.f2448a.h().R();
    }

    public void i() {
        this.f2448a.h().S();
    }

    public void j() {
        this.f2448a.h().U();
    }

    public boolean k() {
        return this.f2448a.h().b0(true);
    }

    public w l() {
        return this.f2448a.h();
    }

    public void m() {
        this.f2448a.h().U0();
    }

    public View n(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f2448a.h().x0().onCreateView(view, str, context, attributeSet);
    }
}
