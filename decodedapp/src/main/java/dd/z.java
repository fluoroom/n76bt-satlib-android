package dd;

/* JADX INFO: loaded from: classes3.dex */
public final class z implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f10933b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f10934a;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        private a() {
        }
    }

    private /* synthetic */ z(long j10) {
        this.f10934a = j10;
    }

    public static final /* synthetic */ z a(long j10) {
        return new z(j10);
    }

    public static boolean e(long j10, Object obj) {
        return (obj instanceof z) && j10 == ((z) obj).h();
    }

    public static int f(long j10) {
        return o4.a.a(j10);
    }

    public static String g(long j10) {
        return f0.c(j10, 10);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return f0.b(h(), ((z) obj).h());
    }

    public boolean equals(Object obj) {
        return e(this.f10934a, obj);
    }

    public final /* synthetic */ long h() {
        return this.f10934a;
    }

    public int hashCode() {
        return f(this.f10934a);
    }

    public String toString() {
        return g(this.f10934a);
    }

    public static long d(long j10) {
        return j10;
    }
}
