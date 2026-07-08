package i7;

import e6.g;
import e6.j;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public class b0 extends e6.g {
    protected static final int D = g.b.a();
    protected Object A;

    /* JADX INFO: renamed from: e */
    protected e6.n f15838e;

    /* JADX INFO: renamed from: f */
    protected e6.l f15839f;

    /* JADX INFO: renamed from: h */
    protected e6.r f15841h;

    /* JADX INFO: renamed from: r */
    protected boolean f15842r;

    /* JADX INFO: renamed from: s */
    protected boolean f15843s;

    /* JADX INFO: renamed from: t */
    protected boolean f15844t;

    /* JADX INFO: renamed from: u */
    protected boolean f15845u;

    /* JADX INFO: renamed from: v */
    protected boolean f15846v;

    /* JADX INFO: renamed from: w */
    protected c f15847w;

    /* JADX INFO: renamed from: x */
    protected c f15848x;

    /* JADX INFO: renamed from: y */
    protected int f15849y;

    /* JADX INFO: renamed from: z */
    protected Object f15850z;
    protected boolean B = false;

    /* JADX INFO: renamed from: g */
    protected int f15840g = D;
    protected l6.e C = l6.e.s(null);

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f15851a;

        /* JADX INFO: renamed from: b */
        static final /* synthetic */ int[] f15852b;

        static {
            int[] iArr = new int[j.b.values().length];
            f15852b = iArr;
            try {
                iArr[j.b.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15852b[j.b.BIG_INTEGER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[e6.m.values().length];
            f15851a = iArr2;
            try {
                iArr2[e6.m.START_OBJECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15851a[e6.m.END_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15851a[e6.m.START_ARRAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15851a[e6.m.END_ARRAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15851a[e6.m.FIELD_NAME.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15851a[e6.m.VALUE_STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f15851a[e6.m.VALUE_NUMBER_INT.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f15851a[e6.m.VALUE_NUMBER_FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f15851a[e6.m.VALUE_TRUE.ordinal()] = 9;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f15851a[e6.m.VALUE_FALSE.ordinal()] = 10;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f15851a[e6.m.VALUE_NULL.ordinal()] = 11;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f15851a[e6.m.VALUE_EMBEDDED_OBJECT.ordinal()] = 12;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    protected static final class b extends f6.d {
        protected final boolean A;
        protected final boolean B;
        protected c C;
        protected c0 E;
        protected boolean F;
        protected transient o6.c G;

        /* JADX INFO: renamed from: x */
        protected e6.n f15853x;

        /* JADX INFO: renamed from: y */
        protected e6.r f15854y;

        /* JADX INFO: renamed from: z */
        protected final boolean f15855z;
        protected e6.h H = null;
        protected int D = -1;

        public b(c cVar, e6.n nVar, boolean z10, boolean z11, e6.l lVar, e6.r rVar) {
            this.C = cVar;
            this.f15853x = nVar;
            this.f15854y = rVar;
            this.E = c0.o(lVar);
            this.f15855z = z10;
            this.A = z11;
            this.B = z10 || z11;
        }

        private final boolean P1(Number number) {
            return (number instanceof Short) || (number instanceof Byte);
        }

        private final boolean Q1(Number number) {
            return (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
        }

        private Number R1(boolean z10) throws e6.i {
            L1();
            Object objO1 = O1();
            if (objO1 instanceof Number) {
                return (Number) objO1;
            }
            if (!(objO1 instanceof String)) {
                throw new IllegalStateException("Internal error: entry should be a Number, but is of type " + h.h(objO1));
            }
            String str = (String) objO1;
            int length = str.length();
            if (this.f12831c == e6.m.VALUE_NUMBER_INT) {
                return (z10 || length >= 19) ? i6.i.g(str, Q0(e6.s.USE_FAST_BIG_NUMBER_PARSER)) : length >= 10 ? Long.valueOf(i6.i.m(str)) : Integer.valueOf(i6.i.k(str));
            }
            if (!z10) {
                return Double.valueOf(i6.i.i(str, Q0(e6.s.USE_FAST_DOUBLE_PARSER)));
            }
            BigDecimal bigDecimalE = i6.i.e(str, Q0(e6.s.USE_FAST_BIG_NUMBER_PARSER));
            if (bigDecimalE != null) {
                return bigDecimalE;
            }
            throw new IllegalStateException("Internal error: failed to parse number '" + str + "'");
        }

        @Override // e6.j
        public o6.i A0() {
            return e6.j.f11531b;
        }

        @Override // f6.d, e6.j
        public String C0() {
            e6.m mVar = this.f12831c;
            if (mVar == e6.m.VALUE_STRING || mVar == e6.m.FIELD_NAME) {
                Object objO1 = O1();
                return objO1 instanceof String ? (String) objO1 : h.b0(objO1);
            }
            if (mVar == null) {
                return null;
            }
            int i10 = a.f15851a[mVar.ordinal()];
            return (i10 == 7 || i10 == 8) ? h.b0(O1()) : this.f12831c.d();
        }

        @Override // e6.j
        public char[] D0() {
            String strC0 = C0();
            if (strC0 == null) {
                return null;
            }
            return strC0.toCharArray();
        }

        @Override // e6.j
        public int E0() {
            String strC0 = C0();
            if (strC0 == null) {
                return 0;
            }
            return strC0.length();
        }

        @Override // e6.j
        public int F0() {
            return 0;
        }

        @Override // e6.j
        public e6.n G() {
            return this.f15853x;
        }

        @Override // e6.j
        public e6.h G0() {
            return H();
        }

        @Override // e6.j
        public e6.h H() {
            e6.h hVar = this.H;
            return hVar == null ? e6.h.f11524g : hVar;
        }

        @Override // e6.j
        public Object H0() {
            return this.C.i(this.D);
        }

        protected final void L1() throws e6.i {
            e6.m mVar = this.f12831c;
            if (mVar == null || !mVar.f()) {
                throw a("Current token (" + this.f12831c + ") not numeric, cannot use numeric value accessors");
            }
        }

        @Override // e6.j
        public boolean M0() {
            return false;
        }

        protected int M1(Number number) {
            if (number instanceof Long) {
                long jLongValue = number.longValue();
                int i10 = (int) jLongValue;
                if (i10 != jLongValue) {
                    F1();
                }
                return i10;
            }
            if (number instanceof BigInteger) {
                BigInteger bigInteger = (BigInteger) number;
                if (f6.d.f12823g.compareTo(bigInteger) > 0 || f6.d.f12824h.compareTo(bigInteger) < 0) {
                    F1();
                }
            } else {
                if ((number instanceof Double) || (number instanceof Float)) {
                    double dDoubleValue = number.doubleValue();
                    if (dDoubleValue < -2.147483648E9d || dDoubleValue > 2.147483647E9d) {
                        F1();
                    }
                    return (int) dDoubleValue;
                }
                if (number instanceof BigDecimal) {
                    BigDecimal bigDecimal = (BigDecimal) number;
                    if (f6.d.f12829v.compareTo(bigDecimal) > 0 || f6.d.f12830w.compareTo(bigDecimal) < 0) {
                        F1();
                    }
                } else {
                    y1();
                }
            }
            return number.intValue();
        }

        protected long N1(Number number) {
            if (number instanceof BigInteger) {
                BigInteger bigInteger = (BigInteger) number;
                if (f6.d.f12825r.compareTo(bigInteger) > 0 || f6.d.f12826s.compareTo(bigInteger) < 0) {
                    I1();
                }
            } else {
                if ((number instanceof Double) || (number instanceof Float)) {
                    double dDoubleValue = number.doubleValue();
                    if (dDoubleValue < -9.223372036854776E18d || dDoubleValue > 9.223372036854776E18d) {
                        I1();
                    }
                    return (long) dDoubleValue;
                }
                if (number instanceof BigDecimal) {
                    BigDecimal bigDecimal = (BigDecimal) number;
                    if (f6.d.f12827t.compareTo(bigDecimal) > 0 || f6.d.f12828u.compareTo(bigDecimal) < 0) {
                        I1();
                    }
                } else {
                    y1();
                }
            }
            return number.longValue();
        }

        protected final Object O1() {
            return this.C.j(this.D);
        }

        @Override // f6.d, e6.j
        public String S() {
            return l();
        }

        public void S1(e6.h hVar) {
            this.H = hVar;
        }

        @Override // e6.j
        public boolean U0() {
            if (this.f12831c == e6.m.VALUE_NUMBER_FLOAT) {
                Object objO1 = O1();
                if (objO1 instanceof Double) {
                    Double d10 = (Double) objO1;
                    return d10.isNaN() || d10.isInfinite();
                }
                if (objO1 instanceof Float) {
                    Float f10 = (Float) objO1;
                    return f10.isNaN() || f10.isInfinite();
                }
            }
            return false;
        }

        @Override // e6.j
        public String V0() {
            c cVar;
            if (!this.F && (cVar = this.C) != null) {
                int i10 = this.D + 1;
                if (i10 < 16) {
                    e6.m mVarP = cVar.p(i10);
                    e6.m mVar = e6.m.FIELD_NAME;
                    if (mVarP == mVar) {
                        this.D = i10;
                        this.f12831c = mVar;
                        Object objJ = this.C.j(i10);
                        String string = objJ instanceof String ? (String) objJ : objJ.toString();
                        this.E.q(string);
                        return string;
                    }
                }
                if (X0() == e6.m.FIELD_NAME) {
                    return l();
                }
            }
            return null;
        }

        @Override // e6.j
        public BigDecimal W() throws e6.i {
            Number numberR1 = R1(true);
            return numberR1 instanceof BigDecimal ? (BigDecimal) numberR1 : numberR1 instanceof Integer ? BigDecimal.valueOf(numberR1.intValue()) : numberR1 instanceof Long ? BigDecimal.valueOf(numberR1.longValue()) : numberR1 instanceof BigInteger ? new BigDecimal((BigInteger) numberR1) : BigDecimal.valueOf(numberR1.doubleValue());
        }

        @Override // e6.j
        public double X() {
            return w0().doubleValue();
        }

        @Override // f6.d, e6.j
        public e6.m X0() {
            c cVar;
            if (this.F || (cVar = this.C) == null) {
                return null;
            }
            int i10 = this.D + 1;
            this.D = i10;
            if (i10 >= 16) {
                this.D = 0;
                c cVarK = cVar.k();
                this.C = cVarK;
                if (cVarK == null) {
                    return null;
                }
            }
            e6.m mVarP = this.C.p(this.D);
            this.f12831c = mVarP;
            if (mVarP == e6.m.FIELD_NAME) {
                Object objO1 = O1();
                this.E.q(objO1 instanceof String ? (String) objO1 : objO1.toString());
            } else if (mVarP == e6.m.START_OBJECT) {
                this.E = this.E.n();
            } else if (mVarP == e6.m.START_ARRAY) {
                this.E = this.E.m();
            } else if (mVarP == e6.m.END_OBJECT || mVarP == e6.m.END_ARRAY) {
                this.E = this.E.p();
            } else {
                this.E.r();
            }
            return this.f12831c;
        }

        @Override // e6.j
        public int a1(e6.a aVar, OutputStream outputStream) throws IOException {
            byte[] bArrV = v(aVar);
            if (bArrV == null) {
                return 0;
            }
            outputStream.write(bArrV, 0, bArrV.length);
            return bArrV.length;
        }

        @Override // e6.j
        public boolean c() {
            return this.A;
        }

        @Override // e6.j, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.F) {
                return;
            }
            this.F = true;
        }

        @Override // e6.j
        public boolean e() {
            return this.f15855z;
        }

        @Override // e6.j
        public e6.r g1() {
            return this.f15854y;
        }

        @Override // e6.j
        public Object h0() {
            if (this.f12831c == e6.m.VALUE_EMBEDDED_OBJECT) {
                return O1();
            }
            return null;
        }

        @Override // f6.d
        protected void k1() {
            y1();
        }

        @Override // e6.j
        public String l() {
            e6.m mVar = this.f12831c;
            return (mVar == e6.m.START_OBJECT || mVar == e6.m.START_ARRAY) ? this.E.f().b() : this.E.b();
        }

        @Override // e6.j
        public float p0() {
            return w0().floatValue();
        }

        @Override // e6.j
        public BigInteger r() throws e6.i, g6.b {
            Number numberR1 = R1(true);
            if (numberR1 instanceof BigInteger) {
                return (BigInteger) numberR1;
            }
            if (!(numberR1 instanceof BigDecimal)) {
                return BigInteger.valueOf(numberR1.longValue());
            }
            BigDecimal bigDecimal = (BigDecimal) numberR1;
            g1().b(bigDecimal.scale());
            return bigDecimal.toBigInteger();
        }

        @Override // e6.j
        public int t0() {
            Number numberW0 = this.f12831c == e6.m.VALUE_NUMBER_INT ? (Number) O1() : w0();
            return ((numberW0 instanceof Integer) || P1(numberW0)) ? numberW0.intValue() : M1(numberW0);
        }

        @Override // e6.j
        public long u0() {
            Number numberW0 = this.f12831c == e6.m.VALUE_NUMBER_INT ? (Number) O1() : w0();
            return ((numberW0 instanceof Long) || Q1(numberW0)) ? numberW0.longValue() : N1(numberW0);
        }

        @Override // e6.j
        public byte[] v(e6.a aVar) throws e6.i {
            if (this.f12831c == e6.m.VALUE_EMBEDDED_OBJECT) {
                Object objO1 = O1();
                if (objO1 instanceof byte[]) {
                    return (byte[]) objO1;
                }
            }
            if (this.f12831c != e6.m.VALUE_STRING) {
                throw a("Current token (" + this.f12831c + ") not VALUE_STRING (or VALUE_EMBEDDED_OBJECT with byte[]), cannot access as binary");
            }
            String strC0 = C0();
            if (strC0 == null) {
                return null;
            }
            o6.c cVar = this.G;
            if (cVar == null) {
                cVar = new o6.c(100);
                this.G = cVar;
            } else {
                cVar.reset();
            }
            i1(strC0, cVar, aVar);
            return cVar.l();
        }

        @Override // e6.j
        public j.b v0() throws e6.i {
            Object objX0 = x0();
            if (objX0 instanceof Integer) {
                return j.b.INT;
            }
            if (objX0 instanceof Long) {
                return j.b.LONG;
            }
            if (objX0 instanceof Double) {
                return j.b.DOUBLE;
            }
            if (objX0 instanceof BigDecimal) {
                return j.b.BIG_DECIMAL;
            }
            if (objX0 instanceof BigInteger) {
                return j.b.BIG_INTEGER;
            }
            if (objX0 instanceof Float) {
                return j.b.FLOAT;
            }
            if (objX0 instanceof Short) {
                return j.b.INT;
            }
            if (objX0 instanceof String) {
                return this.f12831c == e6.m.VALUE_NUMBER_FLOAT ? j.b.BIG_DECIMAL : j.b.BIG_INTEGER;
            }
            return null;
        }

        @Override // e6.j
        public final Number w0() {
            return R1(false);
        }

        @Override // e6.j
        public Object x0() throws e6.i {
            L1();
            return O1();
        }

        @Override // e6.j
        public Object y0() {
            return this.C.h(this.D);
        }

        @Override // e6.j
        public e6.l z0() {
            return this.E;
        }
    }

    protected static final class c {

        /* JADX INFO: renamed from: e */
        private static final e6.m[] f15856e;

        /* JADX INFO: renamed from: a */
        protected c f15857a;

        /* JADX INFO: renamed from: b */
        protected long f15858b;

        /* JADX INFO: renamed from: c */
        protected final Object[] f15859c = new Object[16];

        /* JADX INFO: renamed from: d */
        protected TreeMap f15860d;

        static {
            e6.m[] mVarArr = new e6.m[16];
            f15856e = mVarArr;
            e6.m[] mVarArrValues = e6.m.values();
            System.arraycopy(mVarArrValues, 1, mVarArr, 1, Math.min(15, mVarArrValues.length - 1));
        }

        private final int a(int i10) {
            return i10 + i10 + 1;
        }

        private final int b(int i10) {
            return i10 + i10;
        }

        private final void g(int i10, Object obj, Object obj2) {
            if (this.f15860d == null) {
                this.f15860d = new TreeMap();
            }
            if (obj != null) {
                this.f15860d.put(Integer.valueOf(a(i10)), obj);
            }
            if (obj2 != null) {
                this.f15860d.put(Integer.valueOf(b(i10)), obj2);
            }
        }

        private void l(int i10, e6.m mVar) {
            long jOrdinal = mVar.ordinal();
            if (i10 > 0) {
                jOrdinal <<= i10 << 2;
            }
            this.f15858b |= jOrdinal;
        }

        private void m(int i10, e6.m mVar, Object obj) {
            this.f15859c[i10] = obj;
            long jOrdinal = mVar.ordinal();
            if (i10 > 0) {
                jOrdinal <<= i10 << 2;
            }
            this.f15858b = jOrdinal | this.f15858b;
        }

        private void n(int i10, e6.m mVar, Object obj, Object obj2) {
            long jOrdinal = mVar.ordinal();
            if (i10 > 0) {
                jOrdinal <<= i10 << 2;
            }
            this.f15858b = jOrdinal | this.f15858b;
            g(i10, obj, obj2);
        }

        private void o(int i10, e6.m mVar, Object obj, Object obj2, Object obj3) {
            this.f15859c[i10] = obj;
            long jOrdinal = mVar.ordinal();
            if (i10 > 0) {
                jOrdinal <<= i10 << 2;
            }
            this.f15858b = jOrdinal | this.f15858b;
            g(i10, obj2, obj3);
        }

        public c c(int i10, e6.m mVar) {
            if (i10 < 16) {
                l(i10, mVar);
                return null;
            }
            c cVar = new c();
            this.f15857a = cVar;
            cVar.l(0, mVar);
            return this.f15857a;
        }

        public c d(int i10, e6.m mVar, Object obj) {
            if (i10 < 16) {
                m(i10, mVar, obj);
                return null;
            }
            c cVar = new c();
            this.f15857a = cVar;
            cVar.m(0, mVar, obj);
            return this.f15857a;
        }

        public c e(int i10, e6.m mVar, Object obj, Object obj2) {
            if (i10 < 16) {
                n(i10, mVar, obj, obj2);
                return null;
            }
            c cVar = new c();
            this.f15857a = cVar;
            cVar.n(0, mVar, obj, obj2);
            return this.f15857a;
        }

        public c f(int i10, e6.m mVar, Object obj, Object obj2, Object obj3) {
            if (i10 < 16) {
                o(i10, mVar, obj, obj2, obj3);
                return null;
            }
            c cVar = new c();
            this.f15857a = cVar;
            cVar.o(0, mVar, obj, obj2, obj3);
            return this.f15857a;
        }

        Object h(int i10) {
            TreeMap treeMap = this.f15860d;
            if (treeMap == null) {
                return null;
            }
            return treeMap.get(Integer.valueOf(a(i10)));
        }

        Object i(int i10) {
            TreeMap treeMap = this.f15860d;
            if (treeMap == null) {
                return null;
            }
            return treeMap.get(Integer.valueOf(b(i10)));
        }

        public Object j(int i10) {
            return this.f15859c[i10];
        }

        public c k() {
            return this.f15857a;
        }

        public e6.m p(int i10) {
            long j10 = this.f15858b;
            if (i10 > 0) {
                j10 >>= i10 << 2;
            }
            return f15856e[((int) j10) & 15];
        }
    }

    public b0(e6.j jVar, p6.h hVar) {
        this.f15841h = e6.r.a();
        this.f15838e = jVar.G();
        this.f15841h = jVar.g1();
        this.f15839f = jVar.z0();
        c cVar = new c();
        this.f15848x = cVar;
        this.f15847w = cVar;
        this.f15849y = 0;
        this.f15843s = jVar.e();
        boolean zC = jVar.c();
        this.f15844t = zC;
        this.f15845u = this.f15843s || zC;
        this.f15846v = hVar != null ? hVar.D0(p6.i.USE_BIG_DECIMAL_FOR_FLOATS) : false;
    }

    private void E1(Object obj) {
        o1(e6.m.VALUE_NUMBER_FLOAT, obj);
    }

    private void F1(Object obj) {
        o1(e6.m.VALUE_NUMBER_INT, obj);
    }

    private final void l1(StringBuilder sb2) {
        Object objH = this.f15848x.h(this.f15849y - 1);
        if (objH != null) {
            sb2.append("[objectId=");
            sb2.append(String.valueOf(objH));
            sb2.append(']');
        }
        Object objI = this.f15848x.i(this.f15849y - 1);
        if (objI != null) {
            sb2.append("[typeId=");
            sb2.append(String.valueOf(objI));
            sb2.append(']');
        }
    }

    private final void p1(e6.j jVar) {
        Object objH0 = jVar.H0();
        this.f15850z = objH0;
        if (objH0 != null) {
            this.B = true;
        }
        Object objY0 = jVar.y0();
        this.A = objY0;
        if (objY0 != null) {
            this.B = true;
        }
    }

    private void r1(e6.j jVar, e6.m mVar) {
        if (this.f15845u) {
            p1(jVar);
        }
        switch (a.f15851a[mVar.ordinal()]) {
            case 6:
                if (jVar.M0()) {
                    e1(jVar.D0(), jVar.F0(), jVar.E0());
                    return;
                } else {
                    d1(jVar.C0());
                    return;
                }
            case 7:
                int i10 = a.f15852b[jVar.v0().ordinal()];
                if (i10 == 1) {
                    H0(jVar.t0());
                    return;
                } else if (i10 != 2) {
                    I0(jVar.u0());
                    return;
                } else {
                    F1(jVar.x0());
                    return;
                }
            case 8:
                E1(jVar.x0());
                return;
            case 9:
                y0(true);
                return;
            case 10:
                y0(false);
                return;
            case 11:
                E0();
                return;
            case 12:
                writeObject(jVar.h0());
                return;
            default:
                throw new RuntimeException("Internal error: unexpected token: " + mVar);
        }
    }

    @Override // e6.g
    public final void A0() {
        j1(e6.m.END_OBJECT);
        l6.e eVarF = this.C.f();
        if (eVarF != null) {
            this.C = eVarF;
        }
    }

    public b0 A1(e6.j jVar, p6.h hVar) throws p6.m {
        e6.m mVarX0;
        if (!jVar.N0(e6.m.FIELD_NAME)) {
            z1(jVar);
            return this;
        }
        Z0();
        do {
            z1(jVar);
            mVarX0 = jVar.X0();
        } while (mVarX0 == e6.m.FIELD_NAME);
        e6.m mVar = e6.m.END_OBJECT;
        if (mVarX0 != mVar) {
            hVar.Y0(b0.class, mVar, "Expected END_OBJECT after copying contents of a JsonParser into TokenBuffer, got " + mVarX0, new Object[0]);
        }
        A0();
        return this;
    }

    public e6.m B1() {
        return this.f15847w.p(0);
    }

    @Override // e6.g
    public void C0(e6.p pVar) throws e6.f {
        this.C.y(pVar.getValue());
        k1(pVar);
    }

    public int C1() {
        return this.f15840g;
    }

    @Override // e6.g
    public final void D0(String str) throws e6.f {
        this.C.y(str);
        k1(str);
    }

    @Override // e6.g
    /* JADX INFO: renamed from: D1 */
    public final l6.e s() {
        return this.C;
    }

    @Override // e6.g
    public void E0() {
        n1(e6.m.VALUE_NULL);
    }

    @Override // e6.g
    public void F0(double d10) {
        o1(e6.m.VALUE_NUMBER_FLOAT, Double.valueOf(d10));
    }

    @Override // e6.g
    public e6.g G(int i10, int i11) {
        this.f15840g = (i10 & i11) | (C1() & (~i11));
        return this;
    }

    @Override // e6.g
    public void G0(float f10) {
        o1(e6.m.VALUE_NUMBER_FLOAT, Float.valueOf(f10));
    }

    @Override // e6.g
    public void H0(int i10) {
        o1(e6.m.VALUE_NUMBER_INT, Integer.valueOf(i10));
    }

    @Override // e6.g
    public void I0(long j10) {
        o1(e6.m.VALUE_NUMBER_INT, Long.valueOf(j10));
    }

    @Override // e6.g
    public void J0(String str) {
        o1(e6.m.VALUE_NUMBER_FLOAT, str);
    }

    @Override // e6.g
    public void K0(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            E0();
        } else {
            o1(e6.m.VALUE_NUMBER_FLOAT, bigDecimal);
        }
    }

    @Override // e6.g
    public void L0(BigInteger bigInteger) {
        if (bigInteger == null) {
            E0();
        } else {
            o1(e6.m.VALUE_NUMBER_INT, bigInteger);
        }
    }

    @Override // e6.g
    public void M0(short s10) {
        o1(e6.m.VALUE_NUMBER_INT, Short.valueOf(s10));
    }

    @Override // e6.g
    public void N0(Object obj) {
        this.A = obj;
        this.B = true;
    }

    @Override // e6.g
    public void Q0(char c10) {
        s1();
    }

    @Override // e6.g
    public void R0(e6.p pVar) {
        s1();
    }

    @Override // e6.g
    public void S0(String str) {
        s1();
    }

    @Override // e6.g
    public void T0(char[] cArr, int i10, int i11) {
        s1();
    }

    @Override // e6.g
    public void V0(String str) {
        o1(e6.m.VALUE_EMBEDDED_OBJECT, new x(str));
    }

    @Override // e6.g
    public final void W0() {
        this.C.z();
        m1(e6.m.START_ARRAY);
        this.C = this.C.o();
    }

    @Override // e6.g
    public void X0(Object obj) {
        this.C.z();
        m1(e6.m.START_ARRAY);
        this.C = this.C.p(obj);
    }

    @Override // e6.g
    public void Y0(Object obj, int i10) {
        this.C.z();
        m1(e6.m.START_ARRAY);
        this.C = this.C.p(obj);
    }

    @Override // e6.g
    public final void Z0() {
        this.C.z();
        m1(e6.m.START_OBJECT);
        this.C = this.C.q();
    }

    @Override // e6.g
    public void a1(Object obj) {
        this.C.z();
        m1(e6.m.START_OBJECT);
        this.C = this.C.r(obj);
    }

    @Override // e6.g
    public void b1(Object obj, int i10) {
        this.C.z();
        m1(e6.m.START_OBJECT);
        this.C = this.C.r(obj);
    }

    @Override // e6.g
    public void c1(e6.p pVar) {
        if (pVar == null) {
            E0();
        } else {
            o1(e6.m.VALUE_STRING, pVar);
        }
    }

    @Override // e6.g, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f15842r = true;
    }

    @Override // e6.g
    public void d1(String str) {
        if (str == null) {
            E0();
        } else {
            o1(e6.m.VALUE_STRING, str);
        }
    }

    @Override // e6.g
    public void e1(char[] cArr, int i10, int i11) {
        d1(new String(cArr, i10, i11));
    }

    @Override // e6.g
    public void g1(Object obj) {
        this.f15850z = obj;
        this.B = true;
    }

    protected final void j1(e6.m mVar) {
        c cVarC = this.f15848x.c(this.f15849y, mVar);
        if (cVarC == null) {
            this.f15849y++;
        } else {
            this.f15848x = cVarC;
            this.f15849y = 1;
        }
    }

    protected final void k1(Object obj) {
        c cVarF = this.B ? this.f15848x.f(this.f15849y, e6.m.FIELD_NAME, obj, this.A, this.f15850z) : this.f15848x.d(this.f15849y, e6.m.FIELD_NAME, obj);
        if (cVarF == null) {
            this.f15849y++;
        } else {
            this.f15848x = cVarF;
            this.f15849y = 1;
        }
    }

    @Override // e6.g
    public boolean l() {
        return true;
    }

    protected final void m1(e6.m mVar) {
        c cVarE = this.B ? this.f15848x.e(this.f15849y, mVar, this.A, this.f15850z) : this.f15848x.c(this.f15849y, mVar);
        if (cVarE == null) {
            this.f15849y++;
        } else {
            this.f15848x = cVarE;
            this.f15849y = 1;
        }
    }

    @Override // e6.g
    public boolean n() {
        return this.f15844t;
    }

    protected final void n1(e6.m mVar) {
        this.C.z();
        c cVarE = this.B ? this.f15848x.e(this.f15849y, mVar, this.A, this.f15850z) : this.f15848x.c(this.f15849y, mVar);
        if (cVarE == null) {
            this.f15849y++;
        } else {
            this.f15848x = cVarE;
            this.f15849y = 1;
        }
    }

    protected final void o1(e6.m mVar, Object obj) {
        this.C.z();
        c cVarF = this.B ? this.f15848x.f(this.f15849y, mVar, obj, this.A, this.f15850z) : this.f15848x.d(this.f15849y, mVar, obj);
        if (cVarF == null) {
            this.f15849y++;
        } else {
            this.f15848x = cVarF;
            this.f15849y = 1;
        }
    }

    @Override // e6.g
    public boolean q() {
        return this.f15843s;
    }

    protected void q1(e6.j jVar) throws e6.f {
        int i10 = 1;
        while (true) {
            e6.m mVarX0 = jVar.X0();
            if (mVarX0 == null) {
                return;
            }
            int i11 = a.f15851a[mVarX0.ordinal()];
            if (i11 == 1) {
                if (this.f15845u) {
                    p1(jVar);
                }
                Z0();
            } else if (i11 == 2) {
                A0();
                i10--;
                if (i10 == 0) {
                    return;
                }
            } else if (i11 == 3) {
                if (this.f15845u) {
                    p1(jVar);
                }
                W0();
            } else if (i11 == 4) {
                z0();
                i10--;
                if (i10 == 0) {
                    return;
                }
            } else if (i11 != 5) {
                r1(jVar, mVarX0);
            } else {
                if (this.f15845u) {
                    p1(jVar);
                }
                D0(jVar.l());
            }
            i10++;
        }
    }

    @Override // e6.g
    public e6.g r(g.b bVar) {
        this.f15840g = (~bVar.f()) & this.f15840g;
        return this;
    }

    protected void s1() {
        throw new UnsupportedOperationException("Called operation not supported for TokenBuffer");
    }

    @Override // e6.g
    public int t0(e6.a aVar, InputStream inputStream, int i10) {
        throw new UnsupportedOperationException();
    }

    public b0 t1(b0 b0Var) {
        if (!this.f15843s) {
            this.f15843s = b0Var.q();
        }
        if (!this.f15844t) {
            this.f15844t = b0Var.n();
        }
        this.f15845u = this.f15843s || this.f15844t;
        e6.j jVarU1 = b0Var.u1();
        while (jVarU1.X0() != null) {
            z1(jVarU1);
        }
        return this;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[TokenBuffer: ");
        e6.j jVarU1 = u1();
        int i10 = 0;
        boolean z10 = this.f15843s || this.f15844t;
        while (true) {
            try {
                e6.m mVarX0 = jVarU1.X0();
                if (mVarX0 == null) {
                    break;
                }
                if (z10) {
                    l1(sb2);
                }
                if (i10 < 100) {
                    if (i10 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(mVarX0.toString());
                    if (mVarX0 == e6.m.FIELD_NAME) {
                        sb2.append('(');
                        sb2.append(jVarU1.l());
                        sb2.append(')');
                    }
                }
                i10++;
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }
        if (i10 >= 100) {
            sb2.append(" ... (truncated ");
            sb2.append(i10 - 100);
            sb2.append(" entries)");
        }
        sb2.append(']');
        return sb2.toString();
    }

    public e6.j u1() {
        return w1(this.f15838e);
    }

    @Override // e6.g
    public void v0(e6.a aVar, byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        writeObject(bArr2);
    }

    public e6.j v1(e6.j jVar) {
        b bVar = new b(this.f15847w, jVar.G(), this.f15843s, this.f15844t, this.f15839f, jVar.g1());
        bVar.S1(jVar.G0());
        return bVar;
    }

    @Override // e6.g
    public boolean w(g.b bVar) {
        return (bVar.f() & this.f15840g) != 0;
    }

    public e6.j w1(e6.n nVar) {
        return new b(this.f15847w, nVar, this.f15843s, this.f15844t, this.f15839f, this.f15841h);
    }

    public void writeObject(Object obj) {
        if (obj == null) {
            E0();
            return;
        }
        if (obj.getClass() == byte[].class || (obj instanceof x)) {
            o1(e6.m.VALUE_EMBEDDED_OBJECT, obj);
            return;
        }
        e6.n nVar = this.f15838e;
        if (nVar == null) {
            o1(e6.m.VALUE_EMBEDDED_OBJECT, obj);
        } else {
            nVar.c(this, obj);
        }
    }

    public e6.j x1(e6.r rVar) {
        return new b(this.f15847w, this.f15838e, this.f15843s, this.f15844t, this.f15839f, rVar);
    }

    @Override // e6.g
    public void y0(boolean z10) {
        n1(z10 ? e6.m.VALUE_TRUE : e6.m.VALUE_FALSE);
    }

    public e6.j y1() {
        e6.j jVarW1 = w1(this.f15838e);
        jVarW1.X0();
        return jVarW1;
    }

    @Override // e6.g
    public final void z0() {
        j1(e6.m.END_ARRAY);
        l6.e eVarF = this.C.f();
        if (eVarF != null) {
            this.C = eVarF;
        }
    }

    public void z1(e6.j jVar) {
        e6.m mVarN = jVar.n();
        if (mVarN == e6.m.FIELD_NAME) {
            if (this.f15845u) {
                p1(jVar);
            }
            D0(jVar.l());
            mVarN = jVar.X0();
        } else if (mVarN == null) {
            throw new IllegalStateException("No token available from argument `JsonParser`");
        }
        int i10 = a.f15851a[mVarN.ordinal()];
        if (i10 == 1) {
            if (this.f15845u) {
                p1(jVar);
            }
            Z0();
            q1(jVar);
            return;
        }
        if (i10 == 2) {
            A0();
            return;
        }
        if (i10 != 3) {
            if (i10 != 4) {
                r1(jVar, mVarN);
                return;
            } else {
                z0();
                return;
            }
        }
        if (this.f15845u) {
            p1(jVar);
        }
        W0();
        q1(jVar);
    }

    @Override // e6.g, java.io.Flushable
    public void flush() {
    }
}
