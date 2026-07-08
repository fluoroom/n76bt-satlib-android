package e6;

import java.io.Closeable;
import java.io.Flushable;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import n6.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class g implements Closeable, Flushable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final o6.i f11504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected static final o6.i f11505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected static final o6.i f11506d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected o f11507a;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f11508a;

        static {
            int[] iArr = new int[c.a.values().length];
            f11508a = iArr;
            try {
                iArr[c.a.PARENT_PROPERTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11508a[c.a.PAYLOAD_PROPERTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11508a[c.a.METADATA_PROPERTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11508a[c.a.WRAPPER_OBJECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11508a[c.a.WRAPPER_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public enum b {
        AUTO_CLOSE_TARGET(true),
        AUTO_CLOSE_JSON_CONTENT(true),
        FLUSH_PASSED_TO_STREAM(true),
        QUOTE_FIELD_NAMES(true),
        QUOTE_NON_NUMERIC_NUMBERS(true),
        ESCAPE_NON_ASCII(false),
        WRITE_NUMBERS_AS_STRINGS(false),
        WRITE_BIGDECIMAL_AS_PLAIN(false),
        STRICT_DUPLICATE_DETECTION(false),
        IGNORE_UNKNOWN(false),
        USE_FAST_DOUBLE_WRITER(false),
        WRITE_HEX_UPPER_CASE(true);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f11522a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f11523b = 1 << ordinal();

        b(boolean z10) {
            this.f11522a = z10;
        }

        public static int a() {
            int iF = 0;
            for (b bVar : values()) {
                if (bVar.d()) {
                    iF |= bVar.f();
                }
            }
            return iF;
        }

        public boolean d() {
            return this.f11522a;
        }

        public boolean e(int i10) {
            return (i10 & this.f11523b) != 0;
        }

        public int f() {
            return this.f11523b;
        }
    }

    static {
        o6.i iVarA = o6.i.a(t.values());
        f11504b = iVarA;
        f11505c = iVarA.c(t.CAN_WRITE_FORMATTED_NUMBERS);
        f11506d = iVarA.c(t.CAN_WRITE_BINARY_NATIVELY);
    }

    protected g() {
    }

    public abstract void A0();

    public void B0(long j10) {
        D0(Long.toString(j10));
    }

    public abstract void C0(p pVar);

    public abstract void D0(String str);

    public abstract void E0();

    public abstract void F0(double d10);

    public abstract g G(int i10, int i11);

    public abstract void G0(float f10);

    public void H(Object obj) {
        l lVarS = s();
        if (lVarS != null) {
            lVarS.k(obj);
        }
    }

    public abstract void H0(int i10);

    public abstract void I0(long j10);

    public abstract void J0(String str);

    public abstract void K0(BigDecimal bigDecimal);

    public abstract void L0(BigInteger bigInteger);

    public abstract void M0(short s10);

    public void N0(Object obj) throws f {
        throw new f("No native support for writing Object Ids", this);
    }

    public void O0(Object obj) throws f {
        throw new f("No native support for writing Object Ids", this);
    }

    public abstract void Q0(char c10);

    public abstract void R0(p pVar);

    public abstract g S(int i10);

    public abstract void S0(String str);

    public g T(o oVar) {
        this.f11507a = oVar;
        return this;
    }

    public abstract void T0(char[] cArr, int i10, int i11);

    public void U0(p pVar) {
        V0(pVar.getValue());
    }

    public abstract void V0(String str);

    public g W(p pVar) {
        throw new UnsupportedOperationException();
    }

    public abstract void W0();

    public void X(double[] dArr, int i10, int i11) {
        if (dArr == null) {
            throw new IllegalArgumentException("null array");
        }
        e(dArr.length, i10, i11);
        Y0(dArr, i11);
        int i12 = i11 + i10;
        while (i10 < i12) {
            F0(dArr[i10]);
            i10++;
        }
        z0();
    }

    public abstract void X0(Object obj);

    public abstract void Y0(Object obj, int i10);

    public abstract void Z0();

    protected void a(String str) throws f {
        throw new f(str, this);
    }

    public abstract void a1(Object obj);

    public abstract void b1(Object obj, int i10);

    protected final void c() {
        o6.r.a();
    }

    public abstract void c1(p pVar);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    public abstract void d1(String str);

    protected final void e(int i10, int i11, int i12) {
        if (i11 < 0 || i11 + i12 > i10) {
            throw new IllegalArgumentException(String.format("invalid argument(s) (offset=%d, length=%d) for input array of %d element", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i10)));
        }
    }

    public abstract void e1(char[] cArr, int i10, int i11);

    public void f1(String str, String str2) {
        D0(str);
        d1(str2);
    }

    @Override // java.io.Flushable
    public abstract void flush();

    public void g1(Object obj) throws f {
        throw new f("No native support for writing Type Ids", this);
    }

    public void h0(int[] iArr, int i10, int i11) {
        if (iArr == null) {
            throw new IllegalArgumentException("null array");
        }
        e(iArr.length, i10, i11);
        Y0(iArr, i11);
        int i12 = i11 + i10;
        while (i10 < i12) {
            H0(iArr[i10]);
            i10++;
        }
        z0();
    }

    public n6.c h1(n6.c cVar) throws f {
        Object obj = cVar.f22548c;
        m mVar = cVar.f22551f;
        if (q()) {
            cVar.f22552g = false;
            g1(obj);
        } else {
            String strValueOf = obj instanceof String ? (String) obj : String.valueOf(obj);
            cVar.f22552g = true;
            c.a aVar = cVar.f22550e;
            if (mVar != m.START_OBJECT && aVar.a()) {
                aVar = c.a.WRAPPER_ARRAY;
                cVar.f22550e = aVar;
            }
            int i10 = a.f11508a[aVar.ordinal()];
            if (i10 != 1 && i10 != 2) {
                if (i10 == 3) {
                    a1(cVar.f22546a);
                    f1(cVar.f22549d, strValueOf);
                    return cVar;
                }
                if (i10 != 4) {
                    W0();
                    d1(strValueOf);
                } else {
                    Z0();
                    D0(strValueOf);
                }
            }
        }
        if (mVar == m.START_OBJECT) {
            a1(cVar.f22546a);
            return cVar;
        }
        if (mVar == m.START_ARRAY) {
            W0();
        }
        return cVar;
    }

    public n6.c i1(n6.c cVar) {
        m mVar = cVar.f22551f;
        if (mVar == m.START_OBJECT) {
            A0();
        } else if (mVar == m.START_ARRAY) {
            z0();
        }
        if (cVar.f22552g) {
            int i10 = a.f11508a[cVar.f22550e.ordinal()];
            if (i10 == 1) {
                Object obj = cVar.f22548c;
                f1(cVar.f22549d, obj instanceof String ? (String) obj : String.valueOf(obj));
            } else if (i10 != 2 && i10 != 3) {
                if (i10 != 5) {
                    A0();
                    return cVar;
                }
                z0();
                return cVar;
            }
        }
        return cVar;
    }

    public boolean k() {
        return true;
    }

    public boolean l() {
        return false;
    }

    public boolean n() {
        return false;
    }

    public void p0(long[] jArr, int i10, int i11) {
        if (jArr == null) {
            throw new IllegalArgumentException("null array");
        }
        e(jArr.length, i10, i11);
        Y0(jArr, i11);
        int i12 = i11 + i10;
        while (i10 < i12) {
            I0(jArr[i10]);
            i10++;
        }
        z0();
    }

    public boolean q() {
        return false;
    }

    public abstract g r(b bVar);

    public abstract l s();

    public abstract int t0(e6.a aVar, InputStream inputStream, int i10);

    public int u0(InputStream inputStream, int i10) {
        return t0(e6.b.a(), inputStream, i10);
    }

    public o v() {
        return this.f11507a;
    }

    public abstract void v0(e6.a aVar, byte[] bArr, int i10, int i11);

    public abstract boolean w(b bVar);

    public void w0(byte[] bArr) {
        v0(e6.b.a(), bArr, 0, bArr.length);
    }

    public void x0(byte[] bArr, int i10, int i11) {
        v0(e6.b.a(), bArr, i10, i11);
    }

    public abstract void y0(boolean z10);

    public abstract void z0();

    public void P0(String str) {
    }

    public g x(int i10, int i11) {
        return this;
    }
}
