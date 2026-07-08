package e7;

import g7.t;
import java.util.Map;
import p6.b0;
import p6.d0;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final p6.d f11613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final x6.k f11614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected p6.p f11615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected t f11616d;

    public a(p6.d dVar, x6.k kVar, p6.p pVar) {
        this.f11614b = kVar;
        this.f11613a = dVar;
        this.f11615c = pVar;
        if (pVar instanceof t) {
            this.f11616d = (t) pVar;
        }
    }

    public void a(b0 b0Var) {
        this.f11614b.i(b0Var.L(p6.r.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
    }

    public void b(Object obj, e6.g gVar, d0 d0Var) {
        Object objO = this.f11614b.o(obj);
        if (objO == null) {
            return;
        }
        if (!(objO instanceof Map)) {
            d0Var.q(this.f11613a.getType(), String.format("Value returned by 'any-getter' %s() not java.util.Map but %s", this.f11614b.d(), objO.getClass().getName()));
        }
        t tVar = this.f11616d;
        if (tVar != null) {
            tVar.b0((Map) objO, gVar, d0Var);
        } else {
            this.f11615c.f(objO, gVar, d0Var);
        }
    }

    public void c(d0 d0Var) {
        p6.p pVar = this.f11615c;
        if (pVar instanceof i) {
            p6.p pVarT0 = d0Var.t0(pVar, this.f11613a);
            this.f11615c = pVarT0;
            if (pVarT0 instanceof t) {
                this.f11616d = (t) pVarT0;
            }
        }
    }
}
