package qe;

/* JADX INFO: loaded from: classes3.dex */
public final class r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f25052c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private v f25053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f25054b;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        private a() {
        }
    }

    public r(v vVar, String str) {
        rd.m.e(vVar, "type");
        this.f25053a = vVar;
        this.f25054b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return rd.m.a(this.f25053a, rVar.f25053a) && rd.m.a(this.f25054b, rVar.f25054b);
    }

    public int hashCode() {
        int iHashCode = this.f25053a.hashCode() * 31;
        String str = this.f25054b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "KmFlexibleTypeUpperBound(type=" + this.f25053a + ", typeFlexibilityId=" + this.f25054b + ')';
    }
}
