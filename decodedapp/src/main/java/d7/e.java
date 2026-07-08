package d7;

import p6.d0;

/* JADX INFO: loaded from: classes.dex */
public class e extends v {

    /* JADX INFO: renamed from: b */
    public static final e f10812b = new e(true);

    /* JADX INFO: renamed from: c */
    public static final e f10813c = new e(false);

    /* JADX INFO: renamed from: a */
    private final boolean f10814a;

    protected e(boolean z10) {
        this.f10814a = z10;
    }

    public static e a0() {
        return f10813c;
    }

    public static e b0() {
        return f10812b;
    }

    @Override // p6.n
    public m C() {
        return m.BOOLEAN;
    }

    @Override // d7.v, e6.w
    public e6.m c() {
        return this.f10814a ? e6.m.VALUE_TRUE : e6.m.VALUE_FALSE;
    }

    @Override // d7.b, p6.o
    public final void d(e6.g gVar, d0 d0Var) {
        gVar.y0(this.f10814a);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj != null && (obj instanceof e) && this.f10814a == ((e) obj).f10814a;
    }

    @Override // p6.n
    public long h(long j10) {
        return this.f10814a ? 1L : 0L;
    }

    public int hashCode() {
        return this.f10814a ? 3 : 1;
    }

    @Override // p6.n
    public String i() {
        return this.f10814a ? "true" : "false";
    }
}
