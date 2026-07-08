package qb;

import r9.g;

/* JADX INFO: loaded from: classes3.dex */
public class w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u1 f24818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f24819b;

    private w1(u1 u1Var, Object obj) {
        this.f24818a = u1Var;
        this.f24819b = obj;
    }

    public static w1 a(u1 u1Var) {
        w1 w1Var = new w1((u1) r9.l.o(u1Var, "status"), null);
        r9.l.j(!u1Var.q(), "cannot use OK status: %s", u1Var);
        return w1Var;
    }

    public static w1 b(Object obj) {
        return new w1(null, obj);
    }

    public u1 c() {
        u1 u1Var = this.f24818a;
        return u1Var == null ? u1.f24769e : u1Var;
    }

    public Object d() {
        if (this.f24818a == null) {
            return this.f24819b;
        }
        throw new IllegalStateException("No value present.");
    }

    public boolean e() {
        return this.f24818a == null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof w1)) {
            return false;
        }
        w1 w1Var = (w1) obj;
        if (e() != w1Var.e()) {
            return false;
        }
        return e() ? r9.h.a(this.f24819b, w1Var.f24819b) : r9.h.a(this.f24818a, w1Var.f24818a);
    }

    public int hashCode() {
        return r9.h.b(this.f24818a, this.f24819b);
    }

    public String toString() {
        g.b bVarB = r9.g.b(this);
        u1 u1Var = this.f24818a;
        if (u1Var == null) {
            bVarB.d("value", this.f24819b);
        } else {
            bVarB.d("error", u1Var);
        }
        return bVarB.toString();
    }
}
