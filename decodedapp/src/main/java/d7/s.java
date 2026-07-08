package d7;

import p6.d0;

/* JADX INFO: loaded from: classes.dex */
public class s extends v {

    /* JADX INFO: renamed from: a */
    protected final Object f10860a;

    public s(Object obj) {
        this.f10860a = obj;
    }

    @Override // p6.n
    public m C() {
        return m.POJO;
    }

    protected boolean a0(s sVar) {
        Object obj = this.f10860a;
        return obj == null ? sVar.f10860a == null : obj.equals(sVar.f10860a);
    }

    public Object b0() {
        return this.f10860a;
    }

    @Override // d7.v, e6.w
    public e6.m c() {
        return e6.m.VALUE_EMBEDDED_OBJECT;
    }

    @Override // d7.b, p6.o
    public final void d(e6.g gVar, d0 d0Var) {
        Object obj = this.f10860a;
        if (obj == null) {
            d0Var.N(gVar);
        } else if (obj instanceof p6.o) {
            ((p6.o) obj).d(gVar, d0Var);
        } else {
            d0Var.O(obj, gVar);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof s)) {
            return a0((s) obj);
        }
        return false;
    }

    @Override // p6.n
    public long h(long j10) {
        Object obj = this.f10860a;
        return obj instanceof Number ? ((Number) obj).longValue() : j10;
    }

    public int hashCode() {
        return this.f10860a.hashCode();
    }

    @Override // p6.n
    public String i() {
        Object obj = this.f10860a;
        return obj == null ? "null" : obj.toString();
    }

    @Override // p6.n
    public String j(String str) {
        Object obj = this.f10860a;
        return obj == null ? str : obj.toString();
    }

    @Override // p6.n
    public byte[] o() {
        Object obj = this.f10860a;
        return obj instanceof byte[] ? (byte[]) obj : super.o();
    }
}
