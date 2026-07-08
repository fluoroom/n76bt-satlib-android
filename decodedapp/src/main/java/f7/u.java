package f7;

import d6.k0;
import p6.d0;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k0 f12888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f12889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected boolean f12890c = false;

    public u(k0 k0Var) {
        this.f12888a = k0Var;
    }

    public Object a(Object obj) {
        if (this.f12889b == null) {
            this.f12889b = this.f12888a.c(obj);
        }
        return this.f12889b;
    }

    public void b(e6.g gVar, d0 d0Var, i iVar) {
        this.f12890c = true;
        if (gVar.n()) {
            Object obj = this.f12889b;
            gVar.N0(obj == null ? null : String.valueOf(obj));
            return;
        }
        e6.p pVar = iVar.f12850b;
        if (pVar != null) {
            gVar.C0(pVar);
            iVar.f12852d.f(this.f12889b, gVar, d0Var);
        }
    }

    public boolean c(e6.g gVar, d0 d0Var, i iVar) throws e6.f {
        if (this.f12889b == null) {
            return false;
        }
        if (!this.f12890c && !iVar.f12853e) {
            return false;
        }
        if (gVar.n()) {
            gVar.O0(String.valueOf(this.f12889b));
            return true;
        }
        iVar.f12852d.f(this.f12889b, gVar, d0Var);
        return true;
    }
}
