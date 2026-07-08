package eg;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r0 implements ie.a, ig.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f12169a;

    public /* synthetic */ r0(rd.h hVar) {
        this();
    }

    private final int K0() {
        return v0.a(this) ? super.hashCode() : (((N0().hashCode() * 31) + L0().hashCode()) * 31) + (O0() ? 1 : 0);
    }

    public abstract List L0();

    public abstract q1 M0();

    public abstract u1 N0();

    public abstract boolean O0();

    public abstract r0 P0(fg.g gVar);

    public abstract l2 Q0();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return O0() == r0Var.O0() && fg.t.f13085a.a(Q0(), r0Var.Q0());
    }

    @Override // ie.a
    public ie.h getAnnotations() {
        return t.a(M0());
    }

    public final int hashCode() {
        int i10 = this.f12169a;
        if (i10 != 0) {
            return i10;
        }
        int iK0 = K0();
        this.f12169a = iK0;
        return iK0;
    }

    public abstract xf.k p();

    private r0() {
    }
}
