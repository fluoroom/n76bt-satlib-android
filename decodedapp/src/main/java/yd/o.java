package yd;

/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f32525c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o f32526d = new o(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f32527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m f32528b;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        public final o a(m mVar) {
            rd.m.e(mVar, "type");
            return new o(p.f32531b, mVar);
        }

        public final o b(m mVar) {
            rd.m.e(mVar, "type");
            return new o(p.f32532c, mVar);
        }

        public final o c() {
            return o.f32526d;
        }

        public final o d(m mVar) {
            rd.m.e(mVar, "type");
            return new o(p.f32530a, mVar);
        }

        private a() {
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32529a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.f32530a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.f32531b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.f32532c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f32529a = iArr;
        }
    }

    public o(p pVar, m mVar) {
        String str;
        this.f32527a = pVar;
        this.f32528b = mVar;
        if ((pVar == null) == (mVar == null)) {
            return;
        }
        if (pVar == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + pVar + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    public final p a() {
        return this.f32527a;
    }

    public final m b() {
        return this.f32528b;
    }

    public final m c() {
        return this.f32528b;
    }

    public final p d() {
        return this.f32527a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f32527a == oVar.f32527a && rd.m.a(this.f32528b, oVar.f32528b);
    }

    public int hashCode() {
        p pVar = this.f32527a;
        int iHashCode = (pVar == null ? 0 : pVar.hashCode()) * 31;
        m mVar = this.f32528b;
        return iHashCode + (mVar != null ? mVar.hashCode() : 0);
    }

    public String toString() {
        p pVar = this.f32527a;
        int i10 = pVar == null ? -1 : b.f32529a[pVar.ordinal()];
        if (i10 == -1) {
            return "*";
        }
        if (i10 == 1) {
            return String.valueOf(this.f32528b);
        }
        if (i10 == 2) {
            return "in " + this.f32528b;
        }
        if (i10 != 3) {
            throw new dd.o();
        }
        return "out " + this.f32528b;
    }
}
