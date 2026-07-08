package dd;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements Comparable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f10901e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h f10902f = i.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f10903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f10904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f10905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f10906d;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        private a() {
        }
    }

    public h(int i10, int i11, int i12) {
        this.f10903a = i10;
        this.f10904b = i11;
        this.f10905c = i12;
        this.f10906d = d(i10, i11, i12);
    }

    private final int d(int i10, int i11, int i12) {
        if (i10 >= 0 && i10 < 256 && i11 >= 0 && i11 < 256 && i12 >= 0 && i12 < 256) {
            return (i10 << 16) + (i11 << 8) + i12;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i10 + '.' + i11 + '.' + i12).toString());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(h hVar) {
        rd.m.e(hVar, "other");
        return this.f10906d - hVar.f10906d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        h hVar = obj instanceof h ? (h) obj : null;
        return hVar != null && this.f10906d == hVar.f10906d;
    }

    public int hashCode() {
        return this.f10906d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f10903a);
        sb2.append('.');
        sb2.append(this.f10904b);
        sb2.append('.');
        sb2.append(this.f10905c);
        return sb2.toString();
    }

    public h(int i10, int i11) {
        this(i10, i11, 0);
    }
}
