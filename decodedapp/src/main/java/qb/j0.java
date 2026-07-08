package qb;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class j0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AtomicLong f24657d = new AtomicLong();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f24658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f24659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f24660c;

    j0(String str, String str2, long j10) {
        r9.l.o(str, "typeName");
        r9.l.e(!str.isEmpty(), "empty type");
        this.f24658a = str;
        this.f24659b = str2;
        this.f24660c = j10;
    }

    public static j0 a(Class cls, String str) {
        return b(c(cls), str);
    }

    public static j0 b(String str, String str2) {
        return new j0(str, str2, e());
    }

    private static String c(Class cls) {
        String simpleName = ((Class) r9.l.o(cls, "type")).getSimpleName();
        return !simpleName.isEmpty() ? simpleName : cls.getName().substring(cls.getPackage().getName().length() + 1);
    }

    static long e() {
        return f24657d.incrementAndGet();
    }

    public long d() {
        return this.f24660c;
    }

    public String f() {
        return this.f24658a + "<" + this.f24660c + ">";
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f());
        if (this.f24659b != null) {
            sb2.append(": (");
            sb2.append(this.f24659b);
            sb2.append(')');
        }
        return sb2.toString();
    }
}
