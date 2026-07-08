package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.m;
import androidx.lifecycle.p0;
import androidx.lifecycle.v0;
import androidx.lifecycle.x0;
import androidx.lifecycle.y0;

/* JADX INFO: loaded from: classes.dex */
class h0 implements androidx.lifecycle.k, l1.i, y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f2296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x0 f2297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f2298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private v0.c f2299d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private androidx.lifecycle.v f2300e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private l1.h f2301f = null;

    h0(o oVar, x0 x0Var, Runnable runnable) {
        this.f2296a = oVar;
        this.f2297b = x0Var;
        this.f2298c = runnable;
    }

    @Override // androidx.lifecycle.k
    public v0.c A() {
        Application application;
        v0.c cVarA = this.f2296a.A();
        if (!cVarA.equals(this.f2296a.f2389h0)) {
            this.f2299d = cVarA;
            return cVarA;
        }
        if (this.f2299d == null) {
            Context applicationContext = this.f2296a.x3().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            o oVar = this.f2296a;
            this.f2299d = new p0(application, oVar, oVar.i1());
        }
        return this.f2299d;
    }

    @Override // androidx.lifecycle.k
    public e1.a B() {
        Application application;
        Context applicationContext = this.f2296a.x3().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        e1.b bVar = new e1.b();
        if (application != null) {
            bVar.c(v0.a.f2702g, application);
        }
        bVar.c(androidx.lifecycle.l0.f2645a, this.f2296a);
        bVar.c(androidx.lifecycle.l0.f2646b, this);
        if (this.f2296a.i1() != null) {
            bVar.c(androidx.lifecycle.l0.f2647c, this.f2296a.i1());
        }
        return bVar;
    }

    @Override // androidx.lifecycle.t
    public androidx.lifecycle.m S0() {
        b();
        return this.f2300e;
    }

    @Override // androidx.lifecycle.y0
    public x0 U() {
        b();
        return this.f2297b;
    }

    void a(m.a aVar) {
        this.f2300e.i(aVar);
    }

    void b() {
        if (this.f2300e == null) {
            this.f2300e = new androidx.lifecycle.v(this);
            l1.h hVarA = l1.h.a(this);
            this.f2301f = hVarA;
            hVarA.c();
            this.f2298c.run();
        }
    }

    boolean c() {
        return this.f2300e != null;
    }

    void e(Bundle bundle) {
        this.f2301f.d(bundle);
    }

    @Override // l1.i
    public l1.f e0() {
        b();
        return this.f2301f.b();
    }

    void f(Bundle bundle) {
        this.f2301f.e(bundle);
    }

    void g(m.b bVar) {
        this.f2300e.n(bVar);
    }
}
