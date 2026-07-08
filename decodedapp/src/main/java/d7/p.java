package d7;

import p6.d0;

/* JADX INFO: loaded from: classes.dex */
public class p extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f10858a = new p();

    protected p() {
    }

    public static p a0() {
        return f10858a;
    }

    @Override // p6.n
    public m C() {
        return m.NULL;
    }

    @Override // d7.v, e6.w
    public e6.m c() {
        return e6.m.VALUE_NULL;
    }

    @Override // d7.b, p6.o
    public final void d(e6.g gVar, d0 d0Var) {
        d0Var.N(gVar);
    }

    public boolean equals(Object obj) {
        return obj == this || (obj instanceof p);
    }

    public int hashCode() {
        return m.NULL.ordinal();
    }

    @Override // p6.n
    public String i() {
        return "null";
    }

    @Override // p6.n
    public String j(String str) {
        return str;
    }
}
