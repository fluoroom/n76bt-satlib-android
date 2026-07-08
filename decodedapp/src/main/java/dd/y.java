package dd;

/* JADX INFO: loaded from: classes3.dex */
public final class y implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f10931b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f10932a;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        private a() {
        }
    }

    private /* synthetic */ y(int i10) {
        this.f10932a = i10;
    }

    public static final /* synthetic */ y a(int i10) {
        return new y(i10);
    }

    public static boolean e(int i10, Object obj) {
        return (obj instanceof y) && i10 == ((y) obj).h();
    }

    public static String g(int i10) {
        return String.valueOf(((long) i10) & 4294967295L);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return f0.a(h(), ((y) obj).h());
    }

    public boolean equals(Object obj) {
        return e(this.f10932a, obj);
    }

    public final /* synthetic */ int h() {
        return this.f10932a;
    }

    public int hashCode() {
        return f(this.f10932a);
    }

    public String toString() {
        return g(this.f10932a);
    }

    public static int d(int i10) {
        return i10;
    }

    public static int f(int i10) {
        return i10;
    }
}
