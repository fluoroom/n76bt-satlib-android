package dd;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f10895b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final short f10896a;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        private a() {
        }
    }

    private /* synthetic */ b0(short s10) {
        this.f10896a = s10;
    }

    public static final /* synthetic */ b0 a(short s10) {
        return new b0(s10);
    }

    public static boolean e(short s10, Object obj) {
        return (obj instanceof b0) && s10 == ((b0) obj).h();
    }

    public static String g(short s10) {
        return String.valueOf(s10 & 65535);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return rd.m.f(h() & 65535, ((b0) obj).h() & 65535);
    }

    public boolean equals(Object obj) {
        return e(this.f10896a, obj);
    }

    public final /* synthetic */ short h() {
        return this.f10896a;
    }

    public int hashCode() {
        return f(this.f10896a);
    }

    public String toString() {
        return g(this.f10896a);
    }

    public static short d(short s10) {
        return s10;
    }

    public static int f(short s10) {
        return s10;
    }
}
