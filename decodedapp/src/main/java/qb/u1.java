package qb;

import com.facebook.stetho.dumpapp.Framer;
import j$.util.DesugarCollections;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;
import qb.z0;
import r9.g;

/* JADX INFO: loaded from: classes3.dex */
public final class u1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final List f24768d = h();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final u1 f24769e = b.OK.d();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final u1 f24770f = b.CANCELLED.d();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final u1 f24771g = b.UNKNOWN.d();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final u1 f24772h = b.INVALID_ARGUMENT.d();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final u1 f24773i = b.DEADLINE_EXCEEDED.d();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final u1 f24774j = b.NOT_FOUND.d();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final u1 f24775k = b.ALREADY_EXISTS.d();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final u1 f24776l = b.PERMISSION_DENIED.d();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final u1 f24777m = b.UNAUTHENTICATED.d();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final u1 f24778n = b.RESOURCE_EXHAUSTED.d();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final u1 f24779o = b.FAILED_PRECONDITION.d();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final u1 f24780p = b.ABORTED.d();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final u1 f24781q = b.OUT_OF_RANGE.d();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final u1 f24782r = b.UNIMPLEMENTED.d();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final u1 f24783s = b.INTERNAL.d();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final u1 f24784t = b.UNAVAILABLE.d();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final u1 f24785u = b.DATA_LOSS.d();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    static final z0.h f24786v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final z0.k f24787w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    static final z0.h f24788x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f24789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f24790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Throwable f24791c;

    public enum b {
        OK(0),
        CANCELLED(1),
        UNKNOWN(2),
        INVALID_ARGUMENT(3),
        DEADLINE_EXCEEDED(4),
        NOT_FOUND(5),
        ALREADY_EXISTS(6),
        PERMISSION_DENIED(7),
        RESOURCE_EXHAUSTED(8),
        FAILED_PRECONDITION(9),
        ABORTED(10),
        OUT_OF_RANGE(11),
        UNIMPLEMENTED(12),
        INTERNAL(13),
        UNAVAILABLE(14),
        DATA_LOSS(15),
        UNAUTHENTICATED(16);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f24807a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte[] f24808b;

        b(int i10) {
            this.f24807a = i10;
            this.f24808b = Integer.toString(i10).getBytes(StandardCharsets.US_ASCII);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public byte[] f() {
            return this.f24808b;
        }

        public u1 d() {
            return (u1) u1.f24768d.get(this.f24807a);
        }

        public int e() {
            return this.f24807a;
        }
    }

    private static final class c implements z0.k {
        private c() {
        }

        @Override // qb.z0.k
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public u1 b(byte[] bArr) {
            return u1.k(bArr);
        }

        @Override // qb.z0.k
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public byte[] a(u1 u1Var) {
            return u1Var.o().f();
        }
    }

    private static final class d implements z0.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final byte[] f24809a = {48, Framer.STDOUT_FRAME_PREFIX, Framer.STDERR_FRAME_PREFIX, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};

        private d() {
        }

        private static boolean c(byte b10) {
            return b10 < 32 || b10 >= 126 || b10 == 37;
        }

        private static String e(byte[] bArr) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length);
            int i10 = 0;
            while (i10 < bArr.length) {
                if (bArr[i10] == 37 && i10 + 2 < bArr.length) {
                    try {
                        byteBufferAllocate.put((byte) Integer.parseInt(new String(bArr, i10 + 1, 2, StandardCharsets.US_ASCII), 16));
                        i10 += 3;
                    } catch (NumberFormatException unused) {
                        byteBufferAllocate.put(bArr[i10]);
                        i10++;
                    }
                }
                byteBufferAllocate.put(bArr[i10]);
                i10++;
            }
            return new String(byteBufferAllocate.array(), 0, byteBufferAllocate.position(), StandardCharsets.UTF_8);
        }

        private static byte[] g(byte[] bArr, int i10) {
            byte[] bArr2 = new byte[((bArr.length - i10) * 3) + i10];
            if (i10 != 0) {
                System.arraycopy(bArr, 0, bArr2, 0, i10);
            }
            int i11 = i10;
            while (i10 < bArr.length) {
                byte b10 = bArr[i10];
                if (c(b10)) {
                    bArr2[i11] = 37;
                    byte[] bArr3 = f24809a;
                    bArr2[i11 + 1] = bArr3[(b10 >> 4) & 15];
                    bArr2[i11 + 2] = bArr3[b10 & 15];
                    i11 += 3;
                } else {
                    bArr2[i11] = b10;
                    i11++;
                }
                i10++;
            }
            return Arrays.copyOf(bArr2, i11);
        }

        @Override // qb.z0.k
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public String b(byte[] bArr) {
            for (int i10 = 0; i10 < bArr.length; i10++) {
                byte b10 = bArr[i10];
                if (b10 < 32 || b10 >= 126 || (b10 == 37 && i10 + 2 < bArr.length)) {
                    return e(bArr);
                }
            }
            return new String(bArr, 0);
        }

        @Override // qb.z0.k
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public byte[] a(String str) {
            byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
            for (int i10 = 0; i10 < bytes.length; i10++) {
                if (c(bytes[i10])) {
                    return g(bytes, i10);
                }
            }
            return bytes;
        }
    }

    static {
        f24786v = z0.h.h("grpc-status", false, new c());
        d dVar = new d();
        f24787w = dVar;
        f24788x = z0.h.h("grpc-message", false, dVar);
    }

    private u1(b bVar) {
        this(bVar, null, null);
    }

    private static List h() {
        TreeMap treeMap = new TreeMap();
        for (b bVar : b.values()) {
            u1 u1Var = (u1) treeMap.put(Integer.valueOf(bVar.e()), new u1(bVar));
            if (u1Var != null) {
                throw new IllegalStateException("Code value duplication between " + u1Var.o().name() + " & " + bVar.name());
            }
        }
        return DesugarCollections.unmodifiableList(new ArrayList(treeMap.values()));
    }

    static String i(u1 u1Var) {
        if (u1Var.f24790b == null) {
            return u1Var.f24789a.toString();
        }
        return u1Var.f24789a + ": " + u1Var.f24790b;
    }

    public static u1 j(int i10) {
        if (i10 >= 0) {
            List list = f24768d;
            if (i10 < list.size()) {
                return (u1) list.get(i10);
            }
        }
        return f24771g.s("Unknown code " + i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static u1 k(byte[] bArr) {
        return (bArr.length == 1 && bArr[0] == 48) ? f24769e : l(bArr);
    }

    private static u1 l(byte[] bArr) {
        int i10;
        byte b10;
        int length = bArr.length;
        char c10 = 0;
        if (length != 1) {
            if (length == 2 && (b10 = bArr[0]) >= 48 && b10 <= 57) {
                i10 = (b10 - 48) * 10;
                c10 = 1;
            }
            return f24771g.s("Unknown code " + new String(bArr, StandardCharsets.US_ASCII));
        }
        i10 = 0;
        byte b11 = bArr[c10];
        if (b11 >= 48 && b11 <= 57) {
            int i11 = i10 + (b11 - 48);
            List list = f24768d;
            if (i11 < list.size()) {
                return (u1) list.get(i11);
            }
        }
        return f24771g.s("Unknown code " + new String(bArr, StandardCharsets.US_ASCII));
    }

    public static u1 m(Throwable th2) {
        for (Throwable cause = (Throwable) r9.l.o(th2, "t"); cause != null; cause = cause.getCause()) {
            if (cause instanceof v1) {
                return ((v1) cause).a();
            }
            if (cause instanceof x1) {
                return ((x1) cause).a();
            }
        }
        return f24771g.r(th2);
    }

    public v1 c() {
        return new v1(this);
    }

    public v1 d(z0 z0Var) {
        return new v1(this, z0Var);
    }

    public x1 e() {
        return new x1(this);
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public x1 f(z0 z0Var) {
        return new x1(this, z0Var);
    }

    public u1 g(String str) {
        if (str == null) {
            return this;
        }
        if (this.f24790b == null) {
            return new u1(this.f24789a, str, this.f24791c);
        }
        return new u1(this.f24789a, this.f24790b + "\n" + str, this.f24791c);
    }

    public int hashCode() {
        return super.hashCode();
    }

    public Throwable n() {
        return this.f24791c;
    }

    public b o() {
        return this.f24789a;
    }

    public String p() {
        return this.f24790b;
    }

    public boolean q() {
        return b.OK == this.f24789a;
    }

    public u1 r(Throwable th2) {
        return r9.h.a(this.f24791c, th2) ? this : new u1(this.f24789a, this.f24790b, th2);
    }

    public u1 s(String str) {
        return r9.h.a(this.f24790b, str) ? this : new u1(this.f24789a, str, this.f24791c);
    }

    public String toString() {
        g.b bVarD = r9.g.b(this).d("code", this.f24789a.name()).d("description", this.f24790b);
        Throwable th2 = this.f24791c;
        Object objE = th2;
        if (th2 != null) {
            objE = r9.r.e(th2);
        }
        return bVarD.d("cause", objE).toString();
    }

    private u1(b bVar, String str, Throwable th2) {
        this.f24789a = (b) r9.l.o(bVar, "code");
        this.f24790b = str;
        this.f24791c = th2;
    }
}
