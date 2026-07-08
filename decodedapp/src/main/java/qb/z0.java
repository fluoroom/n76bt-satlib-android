package qb;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class z0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Logger f24832c = Logger.getLogger(z0.class.getName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f24833d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f24834e = new b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final t9.a f24835f = t9.a.a().k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object[] f24836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f24837b;

    private static class c extends h {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final d f24838f;

        /* synthetic */ c(String str, boolean z10, d dVar, a aVar) {
            this(str, z10, dVar);
        }

        @Override // qb.z0.h
        Object i(byte[] bArr) {
            return this.f24838f.b(new String(bArr, StandardCharsets.US_ASCII));
        }

        @Override // qb.z0.h
        byte[] k(Object obj) {
            return ((String) r9.l.o(this.f24838f.a(obj), "null marshaller.toAsciiString()")).getBytes(StandardCharsets.US_ASCII);
        }

        private c(String str, boolean z10, d dVar) {
            super(str, z10, dVar, null);
            r9.l.k(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
            this.f24838f = (d) r9.l.o(dVar, "marshaller");
        }
    }

    public interface d {
        String a(Object obj);

        Object b(String str);
    }

    private static class e extends h {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final f f24839f;

        /* synthetic */ e(String str, f fVar, a aVar) {
            this(str, fVar);
        }

        @Override // qb.z0.h
        Object i(byte[] bArr) {
            return this.f24839f.b(bArr);
        }

        @Override // qb.z0.h
        byte[] k(Object obj) {
            return (byte[]) r9.l.o(this.f24839f.a(obj), "null marshaller.toBytes()");
        }

        private e(String str, f fVar) {
            super(str, false, fVar, null);
            r9.l.k(str.endsWith("-bin"), "Binary header is named %s. It must end with %s", str, "-bin");
            r9.l.e(str.length() > 4, "empty key name");
            this.f24839f = (f) r9.l.o(fVar, "marshaller is null");
        }
    }

    public interface f {
        byte[] a(Object obj);

        Object b(byte[] bArr);
    }

    public interface g {
    }

    public static abstract class h {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final BitSet f24840e = b();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f24841a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f24842b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final byte[] f24843c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Object f24844d;

        /* synthetic */ h(String str, boolean z10, Object obj, a aVar) {
            this(str, z10, obj);
        }

        private static BitSet b() {
            BitSet bitSet = new BitSet(127);
            bitSet.set(45);
            bitSet.set(95);
            bitSet.set(46);
            for (char c10 = '0'; c10 <= '9'; c10 = (char) (c10 + 1)) {
                bitSet.set(c10);
            }
            for (char c11 = 'a'; c11 <= 'z'; c11 = (char) (c11 + 1)) {
                bitSet.set(c11);
            }
            return bitSet;
        }

        public static h e(String str, d dVar) {
            return g(str, false, dVar);
        }

        public static h f(String str, f fVar) {
            return new e(str, fVar, null);
        }

        static h g(String str, boolean z10, d dVar) {
            return new c(str, z10, dVar, null);
        }

        static h h(String str, boolean z10, k kVar) {
            return new j(str, z10, kVar, null);
        }

        private static String l(String str, boolean z10) {
            r9.l.o(str, "name");
            r9.l.e(!str.isEmpty(), "token must have at least 1 tchar");
            if (str.equals("connection")) {
                z0.f24832c.log(Level.WARNING, "Metadata key is 'Connection', which should not be used. That is used by HTTP/1 for connection-specific headers which are not to be forwarded. There is probably an HTTP/1 conversion bug. Simply removing the Connection header is not enough; you should remove all headers it references as well. See RFC 7230 section 6.1", (Throwable) new RuntimeException("exception to show backtrace"));
            }
            for (int i10 = 0; i10 < str.length(); i10++) {
                char cCharAt = str.charAt(i10);
                if (!z10 || cCharAt != ':' || i10 != 0) {
                    r9.l.g(f24840e.get(cCharAt), "Invalid character '%s' in key name '%s'", cCharAt, str);
                }
            }
            return str;
        }

        byte[] a() {
            return this.f24843c;
        }

        final Object c(Class cls) {
            if (cls.isInstance(this.f24844d)) {
                return cls.cast(this.f24844d);
            }
            return null;
        }

        public final String d() {
            return this.f24842b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.f24842b.equals(((h) obj).f24842b);
        }

        public final int hashCode() {
            return this.f24842b.hashCode();
        }

        abstract Object i(byte[] bArr);

        boolean j() {
            return false;
        }

        abstract byte[] k(Object obj);

        public String toString() {
            return "Key{name='" + this.f24842b + "'}";
        }

        private h(String str, boolean z10, Object obj) {
            String str2 = (String) r9.l.o(str, "name");
            this.f24841a = str2;
            String strL = l(str2.toLowerCase(Locale.ROOT), z10);
            this.f24842b = strL;
            this.f24843c = strL.getBytes(StandardCharsets.US_ASCII);
            this.f24844d = obj;
        }
    }

    static final class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f24845a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile byte[] f24846b;

        i(g gVar, Object obj) {
            this.f24845a = obj;
        }

        static i a(h hVar, Object obj) {
            b(hVar);
            android.support.v4.media.session.b.a(r9.l.n(null));
            return new i(null, obj);
        }

        private static g b(h hVar) {
            android.support.v4.media.session.b.a(hVar.c(g.class));
            return null;
        }

        byte[] c() {
            if (this.f24846b == null) {
                synchronized (this) {
                    try {
                        if (this.f24846b == null) {
                            this.f24846b = z0.r(e());
                        }
                    } finally {
                    }
                }
            }
            return this.f24846b;
        }

        Object d(h hVar) {
            if (hVar.j()) {
                b(hVar);
            }
            return hVar.i(c());
        }

        InputStream e() {
            throw null;
        }
    }

    private static final class j extends h {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final k f24847f;

        /* synthetic */ j(String str, boolean z10, k kVar, a aVar) {
            this(str, z10, kVar);
        }

        @Override // qb.z0.h
        Object i(byte[] bArr) {
            return this.f24847f.b(bArr);
        }

        @Override // qb.z0.h
        byte[] k(Object obj) {
            return (byte[]) r9.l.o(this.f24847f.a(obj), "null marshaller.toAsciiString()");
        }

        private j(String str, boolean z10, k kVar) {
            super(str, z10, kVar, null);
            r9.l.k(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
            this.f24847f = (k) r9.l.o(kVar, "marshaller");
        }
    }

    interface k {
        byte[] a(Object obj);

        Object b(byte[] bArr);
    }

    z0(byte[]... bArr) {
        this(bArr.length / 2, bArr);
    }

    private boolean c(byte[] bArr, byte[] bArr2) {
        return Arrays.equals(bArr, bArr2);
    }

    private int d() {
        Object[] objArr = this.f24836a;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    private void f(int i10) {
        Object[] objArr = new Object[i10];
        if (!i()) {
            System.arraycopy(this.f24836a, 0, objArr, 0, j());
        }
        this.f24836a = objArr;
    }

    private boolean i() {
        return this.f24837b == 0;
    }

    private int j() {
        return this.f24837b * 2;
    }

    private void k() {
        if (j() == 0 || j() == d()) {
            f(Math.max(j() * 2, 8));
        }
    }

    private void m(int i10, byte[] bArr) {
        this.f24836a[i10 * 2] = bArr;
    }

    private byte[] n(int i10) {
        return (byte[]) this.f24836a[i10 * 2];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] r(InputStream inputStream) {
        try {
            return t9.b.d(inputStream);
        } catch (IOException e10) {
            throw new RuntimeException("failure reading serialized stream", e10);
        }
    }

    private Object s(int i10) {
        return this.f24836a[(i10 * 2) + 1];
    }

    private void t(int i10, Object obj) {
        if (this.f24836a instanceof byte[][]) {
            f(d());
        }
        this.f24836a[(i10 * 2) + 1] = obj;
    }

    private void u(int i10, byte[] bArr) {
        this.f24836a[(i10 * 2) + 1] = bArr;
    }

    private byte[] v(int i10) {
        Object objS = s(i10);
        return objS instanceof byte[] ? (byte[]) objS : ((i) objS).c();
    }

    private Object w(int i10, h hVar) {
        Object objS = s(i10);
        return objS instanceof byte[] ? hVar.i((byte[]) objS) : ((i) objS).d(hVar);
    }

    public void e(h hVar) {
        if (i()) {
            return;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f24837b; i11++) {
            if (!c(hVar.a(), n(i11))) {
                m(i10, n(i11));
                t(i10, s(i11));
                i10++;
            }
        }
        Arrays.fill(this.f24836a, i10 * 2, j(), (Object) null);
        this.f24837b = i10;
    }

    public Object g(h hVar) {
        for (int i10 = this.f24837b - 1; i10 >= 0; i10--) {
            if (c(hVar.a(), n(i10))) {
                return w(i10, hVar);
            }
        }
        return null;
    }

    int h() {
        return this.f24837b;
    }

    public void l(z0 z0Var) {
        if (z0Var.i()) {
            return;
        }
        int iD = d() - j();
        if (i() || iD < z0Var.j()) {
            f(j() + z0Var.j());
        }
        System.arraycopy(z0Var.f24836a, 0, this.f24836a, j(), z0Var.j());
        this.f24837b += z0Var.f24837b;
    }

    public void o(h hVar, Object obj) {
        r9.l.o(hVar, "key");
        r9.l.o(obj, "value");
        k();
        m(this.f24837b, hVar.a());
        if (hVar.j()) {
            t(this.f24837b, i.a(hVar, obj));
        } else {
            u(this.f24837b, hVar.k(obj));
        }
        this.f24837b++;
    }

    public Iterable p(h hVar) {
        if (i()) {
            return null;
        }
        ArrayList arrayList = null;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f24837b; i11++) {
            if (c(hVar.a(), n(i11))) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(w(i11, hVar));
            } else {
                m(i10, n(i11));
                t(i10, s(i11));
                i10++;
            }
        }
        Arrays.fill(this.f24836a, i10 * 2, j(), (Object) null);
        this.f24837b = i10;
        return arrayList;
    }

    byte[][] q() {
        byte[][] bArr = new byte[j()][];
        Object[] objArr = this.f24836a;
        if (objArr instanceof byte[][]) {
            System.arraycopy(objArr, 0, bArr, 0, j());
            return bArr;
        }
        for (int i10 = 0; i10 < this.f24837b; i10++) {
            int i11 = i10 * 2;
            bArr[i11] = n(i10);
            bArr[i11 + 1] = v(i10);
        }
        return bArr;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Metadata(");
        for (int i10 = 0; i10 < this.f24837b; i10++) {
            if (i10 != 0) {
                sb2.append(',');
            }
            byte[] bArrN = n(i10);
            Charset charset = StandardCharsets.US_ASCII;
            String str = new String(bArrN, charset);
            sb2.append(str);
            sb2.append('=');
            if (str.endsWith("-bin")) {
                sb2.append(f24835f.e(v(i10)));
            } else {
                sb2.append(new String(v(i10), charset));
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    z0(int i10, byte[]... bArr) {
        this(i10, (Object[]) bArr);
    }

    z0(int i10, Object[] objArr) {
        this.f24837b = i10;
        this.f24836a = objArr;
    }

    public z0() {
    }

    class a implements f {
        a() {
        }

        @Override // qb.z0.f
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public byte[] b(byte[] bArr) {
            return bArr;
        }

        @Override // qb.z0.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public byte[] a(byte[] bArr) {
            return bArr;
        }
    }

    class b implements d {
        b() {
        }

        @Override // qb.z0.d
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public String b(String str) {
            return str;
        }

        @Override // qb.z0.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public String a(String str) {
            return str;
        }
    }
}
