package ag;

/* JADX INFO: loaded from: classes3.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f611d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f612e;

    public y(Object obj, Object obj2, Object obj3, Object obj4, String str) {
        rd.m.e(str, "filePath");
        this.f608a = obj;
        this.f609b = obj2;
        this.f610c = obj3;
        this.f611d = obj4;
        this.f612e = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return rd.m.a(this.f608a, yVar.f608a) && rd.m.a(this.f609b, yVar.f609b) && rd.m.a(this.f610c, yVar.f610c) && rd.m.a(this.f611d, yVar.f611d) && rd.m.a(this.f612e, yVar.f612e);
    }

    public int hashCode() {
        Object obj = this.f608a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f609b;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f610c;
        int iHashCode3 = (iHashCode2 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        Object obj4 = this.f611d;
        return ((iHashCode3 + (obj4 != null ? obj4.hashCode() : 0)) * 31) + this.f612e.hashCode();
    }

    public String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.f608a + ", compilerVersion=" + this.f609b + ", languageVersion=" + this.f610c + ", expectedVersion=" + this.f611d + ", filePath=" + this.f612e + ')';
    }
}
