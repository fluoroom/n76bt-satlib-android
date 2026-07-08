package u7;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import java.util.Set;
import t7.a;
import t7.g;

/* JADX INFO: loaded from: classes.dex */
public final class d1 extends s8.d implements g.a, g.b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final a.AbstractC0384a f28397j = r8.d.f25617c;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f28398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Handler f28399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a.AbstractC0384a f28400e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Set f28401f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final v7.e f28402g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private r8.e f28403h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private c1 f28404i;

    public d1(Context context, Handler handler, v7.e eVar) {
        a.AbstractC0384a abstractC0384a = f28397j;
        this.f28398c = context;
        this.f28399d = handler;
        this.f28402g = (v7.e) v7.q.j(eVar, "ClientSettings must not be null");
        this.f28401f = eVar.g();
        this.f28400e = abstractC0384a;
    }

    static /* bridge */ /* synthetic */ void x1(d1 d1Var, s8.l lVar) {
        s7.a aVarB = lVar.b();
        if (aVarB.g()) {
            v7.p0 p0Var = (v7.p0) v7.q.i(lVar.c());
            s7.a aVarB2 = p0Var.b();
            if (!aVarB2.g()) {
                String strValueOf = String.valueOf(aVarB2);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(strValueOf), new Exception());
                d1Var.f28404i.c(aVarB2);
                d1Var.f28403h.a();
                return;
            }
            d1Var.f28404i.b(p0Var.c(), d1Var.f28401f);
        } else {
            d1Var.f28404i.c(aVarB);
        }
        d1Var.f28403h.a();
    }

    @Override // s8.f
    public final void G0(s8.l lVar) {
        this.f28399d.post(new b1(this, lVar));
    }

    @Override // u7.m
    public final void j(s7.a aVar) {
        this.f28404i.c(aVar);
    }

    @Override // u7.d
    public final void q(int i10) {
        this.f28404i.d(i10);
    }

    @Override // u7.d
    public final void x(Bundle bundle) {
        this.f28403h.c(this);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [r8.e, t7.a$f] */
    public final void y1(c1 c1Var) {
        r8.e eVar = this.f28403h;
        if (eVar != null) {
            eVar.a();
        }
        this.f28402g.k(Integer.valueOf(System.identityHashCode(this)));
        a.AbstractC0384a abstractC0384a = this.f28400e;
        Context context = this.f28398c;
        Handler handler = this.f28399d;
        v7.e eVar2 = this.f28402g;
        this.f28403h = abstractC0384a.a(context, handler.getLooper(), eVar2, eVar2.h(), this, this);
        this.f28404i = c1Var;
        Set set = this.f28401f;
        if (set == null || set.isEmpty()) {
            this.f28399d.post(new a1(this));
        } else {
            this.f28403h.p();
        }
    }

    public final void z1() {
        r8.e eVar = this.f28403h;
        if (eVar != null) {
            eVar.a();
        }
    }
}
