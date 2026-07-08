package cg;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class t0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f4848c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final t0 f4849d = new t0(false, 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f4850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f4851b;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        private a() {
        }
    }

    public t0(boolean z10, List list) {
        rd.m.e(list, "poisoningFeatures");
        this.f4850a = z10;
        this.f4851b = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return this.f4850a == t0Var.f4850a && rd.m.a(this.f4851b, t0Var.f4851b);
    }

    public int hashCode() {
        return (o4.b.a(this.f4850a) * 31) + this.f4851b.hashCode();
    }

    public String toString() {
        return "PreReleaseInfo(isInvisible=" + this.f4850a + ", poisoningFeatures=" + this.f4851b + ')';
    }

    public /* synthetic */ t0(boolean z10, List list, int i10, rd.h hVar) {
        this(z10, (i10 & 2) != 0 ? ed.q.k() : list);
    }
}
