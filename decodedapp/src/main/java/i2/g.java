package i2;

import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final b f15751e = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f15752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f15753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f15754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile byte[] f15755d;

    public interface b {
        void a(byte[] bArr, Object obj, MessageDigest messageDigest);
    }

    private g(String str, Object obj, b bVar) {
        this.f15754c = e3.k.c(str);
        this.f15752a = obj;
        this.f15753b = (b) e3.k.e(bVar);
    }

    public static g a(String str, Object obj, b bVar) {
        return new g(str, obj, bVar);
    }

    private static b b() {
        return f15751e;
    }

    private byte[] d() {
        if (this.f15755d == null) {
            this.f15755d = this.f15754c.getBytes(f.f15750a);
        }
        return this.f15755d;
    }

    public static g e(String str) {
        return new g(str, null, b());
    }

    public static g f(String str, Object obj) {
        return new g(str, obj, b());
    }

    public Object c() {
        return this.f15752a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f15754c.equals(((g) obj).f15754c);
        }
        return false;
    }

    public void g(Object obj, MessageDigest messageDigest) {
        this.f15753b.a(d(), obj, messageDigest);
    }

    public int hashCode() {
        return this.f15754c.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.f15754c + "'}";
    }

    class a implements b {
        a() {
        }

        @Override // i2.g.b
        public void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }
}
