package u6;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final HashSet f28342a = new HashSet();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f28343a;

        static {
            int[] iArr = new int[r6.b.values().length];
            f28343a = iArr;
            try {
                iArr[r6.b.Fail.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28343a[r6.b.AsNull.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28343a[r6.b.AsEmpty.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class b extends g0 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final b f28344e = new b();

        public b() {
            super(BigDecimal.class);
        }

        @Override // p6.l
        /* JADX INFO: renamed from: e1, reason: merged with bridge method [inline-methods] */
        public BigDecimal e(e6.j jVar, p6.h hVar) throws g6.b {
            String strK;
            int iQ = jVar.q();
            if (iQ == 1) {
                strK = hVar.K(jVar, this, this.f28200a);
            } else {
                if (iQ == 3) {
                    return (BigDecimal) W(jVar, hVar);
                }
                if (iQ != 6) {
                    if (iQ == 7) {
                        r6.b bVarK = K(jVar, hVar, this.f28200a);
                        if (bVarK == r6.b.AsNull) {
                            return (BigDecimal) a(hVar);
                        }
                        if (bVarK == r6.b.AsEmpty) {
                            return (BigDecimal) k(hVar);
                        }
                    } else if (iQ != 8) {
                        return (BigDecimal) hVar.q0(Y0(hVar), jVar);
                    }
                    return jVar.W();
                }
                strK = jVar.C0();
            }
            r6.b bVarG = G(hVar, strK);
            if (bVarG == r6.b.AsNull) {
                return (BigDecimal) a(hVar);
            }
            if (bVarG == r6.b.AsEmpty) {
                return (BigDecimal) k(hVar);
            }
            String strTrim = strK.trim();
            if (e0(strTrim)) {
                return (BigDecimal) a(hVar);
            }
            jVar.g1().c(strTrim.length());
            try {
                return i6.i.e(strTrim, jVar.Q0(e6.s.USE_FAST_BIG_NUMBER_PARSER));
            } catch (IllegalArgumentException unused) {
                return (BigDecimal) hVar.z0(this.f28200a, strTrim, "not a valid representation", new Object[0]);
            }
        }

        @Override // p6.l
        public Object k(p6.h hVar) {
            return BigDecimal.ZERO;
        }

        @Override // u6.g0, p6.l
        public final h7.c r() {
            return h7.c.Float;
        }
    }

    public static class c extends g0 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final c f28345e = new c();

        public c() {
            super(BigInteger.class);
        }

        @Override // p6.l
        /* JADX INFO: renamed from: e1, reason: merged with bridge method [inline-methods] */
        public BigInteger e(e6.j jVar, p6.h hVar) throws g6.b {
            String strK;
            if (jVar.R0()) {
                return jVar.r();
            }
            int iQ = jVar.q();
            if (iQ == 1) {
                strK = hVar.K(jVar, this, this.f28200a);
            } else {
                if (iQ == 3) {
                    return (BigInteger) W(jVar, hVar);
                }
                if (iQ != 6) {
                    if (iQ != 8) {
                        return (BigInteger) hVar.q0(Y0(hVar), jVar);
                    }
                    r6.b bVarC = C(jVar, hVar, this.f28200a);
                    if (bVarC == r6.b.AsNull) {
                        return (BigInteger) a(hVar);
                    }
                    if (bVarC == r6.b.AsEmpty) {
                        return (BigInteger) k(hVar);
                    }
                    BigDecimal bigDecimalW = jVar.W();
                    jVar.g1().b(bigDecimalW.scale());
                    return bigDecimalW.toBigInteger();
                }
                strK = jVar.C0();
            }
            r6.b bVarG = G(hVar, strK);
            if (bVarG == r6.b.AsNull) {
                return (BigInteger) a(hVar);
            }
            if (bVarG == r6.b.AsEmpty) {
                return (BigInteger) k(hVar);
            }
            String strTrim = strK.trim();
            if (e0(strTrim)) {
                return (BigInteger) a(hVar);
            }
            jVar.g1().d(strTrim.length());
            try {
                return i6.i.g(strTrim, jVar.Q0(e6.s.USE_FAST_BIG_NUMBER_PARSER));
            } catch (IllegalArgumentException unused) {
                return (BigInteger) hVar.z0(this.f28200a, strTrim, "not a valid representation", new Object[0]);
            }
        }

        @Override // p6.l
        public Object k(p6.h hVar) {
            return BigInteger.ZERO;
        }

        @Override // u6.g0, p6.l
        public final h7.c r() {
            return h7.c.Integer;
        }
    }

    public static final class d extends l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        static final d f28346r = new d(Boolean.TYPE, Boolean.FALSE);

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        static final d f28347s = new d(Boolean.class, null);

        public d(Class cls, Boolean bool) {
            super(cls, h7.c.Boolean, bool, Boolean.FALSE);
        }

        @Override // p6.l
        /* JADX INFO: renamed from: e1, reason: merged with bridge method [inline-methods] */
        public Boolean e(e6.j jVar, p6.h hVar) {
            e6.m mVarN = jVar.n();
            return mVarN == e6.m.VALUE_TRUE ? Boolean.TRUE : mVarN == e6.m.VALUE_FALSE ? Boolean.FALSE : this.f28364h ? Boolean.valueOf(q0(jVar, hVar)) : p0(jVar, hVar, this.f28200a);
        }

        @Override // u6.g0, u6.c0, p6.l
        /* JADX INFO: renamed from: f1, reason: merged with bridge method [inline-methods] */
        public Boolean g(e6.j jVar, p6.h hVar, a7.e eVar) {
            e6.m mVarN = jVar.n();
            return mVarN == e6.m.VALUE_TRUE ? Boolean.TRUE : mVarN == e6.m.VALUE_FALSE ? Boolean.FALSE : this.f28364h ? Boolean.valueOf(q0(jVar, hVar)) : p0(jVar, hVar, this.f28200a);
        }

        @Override // u6.w.l, p6.l
        public /* bridge */ /* synthetic */ Object k(p6.h hVar) {
            return super.k(hVar);
        }
    }

    public static class e extends l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        static final e f28348r = new e(Byte.TYPE, (byte) 0);

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        static final e f28349s = new e(Byte.class, null);

        public e(Class cls, Byte b10) {
            super(cls, h7.c.Integer, b10, (byte) 0);
        }

        protected Byte e1(e6.j jVar, p6.h hVar) {
            String strK;
            int iQ = jVar.q();
            if (iQ == 1) {
                strK = hVar.K(jVar, this, this.f28200a);
            } else {
                if (iQ == 3) {
                    return (Byte) W(jVar, hVar);
                }
                if (iQ == 11) {
                    return (Byte) a(hVar);
                }
                if (iQ != 6) {
                    if (iQ == 7) {
                        return Byte.valueOf(jVar.x());
                    }
                    if (iQ != 8) {
                        return (Byte) hVar.q0(Y0(hVar), jVar);
                    }
                    r6.b bVarC = C(jVar, hVar, this.f28200a);
                    return bVarC == r6.b.AsNull ? (Byte) a(hVar) : bVarC == r6.b.AsEmpty ? (Byte) k(hVar) : Byte.valueOf(jVar.x());
                }
                strK = jVar.C0();
            }
            r6.b bVarG = G(hVar, strK);
            if (bVarG == r6.b.AsNull) {
                return (Byte) a(hVar);
            }
            if (bVarG == r6.b.AsEmpty) {
                return (Byte) k(hVar);
            }
            String strTrim = strK.trim();
            if (N(hVar, strTrim)) {
                return (Byte) a(hVar);
            }
            try {
                int iK = i6.i.k(strTrim);
                return v(iK) ? (Byte) hVar.z0(this.f28200a, strTrim, "overflow, value cannot be represented as 8-bit value", new Object[0]) : Byte.valueOf((byte) iK);
            } catch (IllegalArgumentException unused) {
                return (Byte) hVar.z0(this.f28200a, strTrim, "not a valid Byte value", new Object[0]);
            }
        }

        @Override // p6.l
        /* JADX INFO: renamed from: f1, reason: merged with bridge method [inline-methods] */
        public Byte e(e6.j jVar, p6.h hVar) {
            return jVar.R0() ? Byte.valueOf(jVar.x()) : this.f28364h ? Byte.valueOf(r0(jVar, hVar)) : e1(jVar, hVar);
        }

        @Override // u6.w.l, p6.l
        public /* bridge */ /* synthetic */ Object k(p6.h hVar) {
            return super.k(hVar);
        }
    }

    public static class f extends l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        static final f f28350r = new f(Character.TYPE, 0);

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        static final f f28351s = new f(Character.class, null);

        public f(Class cls, Character ch2) {
            super(cls, h7.c.Integer, ch2, (char) 0);
        }

        @Override // p6.l
        /* JADX INFO: renamed from: e1, reason: merged with bridge method [inline-methods] */
        public Character e(e6.j jVar, p6.h hVar) throws v6.f {
            p6.h hVar2;
            String strK;
            p6.h hVar3;
            int iQ = jVar.q();
            if (iQ == 1) {
                hVar2 = hVar;
                strK = hVar2.K(jVar, this, this.f28200a);
            } else {
                if (iQ == 3) {
                    return (Character) W(jVar, hVar);
                }
                if (iQ == 11) {
                    if (this.f28364h) {
                        N0(hVar);
                    }
                    return (Character) a(hVar);
                }
                if (iQ != 6) {
                    if (iQ != 7) {
                        return (Character) hVar.q0(Y0(hVar), jVar);
                    }
                    r6.b bVarN = hVar.N(r(), this.f28200a, r6.e.Integer);
                    int i10 = a.f28343a[bVarN.ordinal()];
                    if (i10 == 1) {
                        hVar3 = hVar;
                        x(hVar3, bVarN, this.f28200a, jVar.w0(), "Integer value (" + jVar.C0() + ")");
                    } else {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                return (Character) k(hVar);
                            }
                            int iT0 = jVar.t0();
                            return (iT0 < 0 || iT0 > 65535) ? (Character) hVar.y0(p(), Integer.valueOf(iT0), "value outside valid Character range (0x0000 - 0xFFFF)", new Object[0]) : Character.valueOf((char) iT0);
                        }
                        hVar3 = hVar;
                    }
                    return (Character) a(hVar3);
                }
                hVar2 = hVar;
                strK = jVar.C0();
            }
            if (strK.length() == 1) {
                return Character.valueOf(strK.charAt(0));
            }
            r6.b bVarG = G(hVar2, strK);
            if (bVarG == r6.b.AsNull) {
                return (Character) a(hVar2);
            }
            if (bVarG == r6.b.AsEmpty) {
                return (Character) k(hVar2);
            }
            String strTrim = strK.trim();
            return N(hVar2, strTrim) ? (Character) a(hVar2) : (Character) hVar2.z0(p(), strTrim, "Expected either Integer value code or 1-character String", new Object[0]);
        }

        @Override // u6.w.l, p6.l
        public /* bridge */ /* synthetic */ Object k(p6.h hVar) {
            return super.k(hVar);
        }
    }

    public static class g extends l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        static final g f28352r = new g(Double.TYPE, Double.valueOf(0.0d));

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        static final g f28353s = new g(Double.class, null);

        public g(Class cls, Double d10) {
            super(cls, h7.c.Float, d10, Double.valueOf(0.0d));
        }

        protected final Double e1(e6.j jVar, p6.h hVar) throws g6.b {
            String strK;
            int iQ = jVar.q();
            if (iQ == 1) {
                strK = hVar.K(jVar, this, this.f28200a);
            } else {
                if (iQ == 3) {
                    return (Double) W(jVar, hVar);
                }
                if (iQ == 11) {
                    return (Double) a(hVar);
                }
                if (iQ != 6) {
                    if (iQ == 7) {
                        r6.b bVarK = K(jVar, hVar, this.f28200a);
                        if (bVarK == r6.b.AsNull) {
                            return (Double) a(hVar);
                        }
                        if (bVarK == r6.b.AsEmpty) {
                            return (Double) k(hVar);
                        }
                    } else if (iQ != 8) {
                        return (Double) hVar.q0(Y0(hVar), jVar);
                    }
                    return Double.valueOf(jVar.X());
                }
                strK = jVar.C0();
            }
            Double dZ = z(strK);
            if (dZ != null) {
                return dZ;
            }
            r6.b bVarG = G(hVar, strK);
            if (bVarG == r6.b.AsNull) {
                return (Double) a(hVar);
            }
            if (bVarG == r6.b.AsEmpty) {
                return (Double) k(hVar);
            }
            String strTrim = strK.trim();
            if (N(hVar, strTrim)) {
                return (Double) a(hVar);
            }
            jVar.g1().c(strTrim.length());
            try {
                return Double.valueOf(c0.v0(strTrim, jVar.Q0(e6.s.USE_FAST_DOUBLE_PARSER)));
            } catch (IllegalArgumentException unused) {
                return (Double) hVar.z0(this.f28200a, strTrim, "not a valid `Double` value", new Object[0]);
            }
        }

        @Override // p6.l
        /* JADX INFO: renamed from: f1, reason: merged with bridge method [inline-methods] */
        public Double e(e6.j jVar, p6.h hVar) {
            return jVar.N0(e6.m.VALUE_NUMBER_FLOAT) ? Double.valueOf(jVar.X()) : this.f28364h ? Double.valueOf(w0(jVar, hVar)) : e1(jVar, hVar);
        }

        @Override // u6.g0, u6.c0, p6.l
        /* JADX INFO: renamed from: g1, reason: merged with bridge method [inline-methods] */
        public Double g(e6.j jVar, p6.h hVar, a7.e eVar) {
            return jVar.N0(e6.m.VALUE_NUMBER_FLOAT) ? Double.valueOf(jVar.X()) : this.f28364h ? Double.valueOf(w0(jVar, hVar)) : e1(jVar, hVar);
        }

        @Override // u6.w.l, p6.l
        public /* bridge */ /* synthetic */ Object k(p6.h hVar) {
            return super.k(hVar);
        }
    }

    public static class h extends l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        static final h f28354r = new h(Float.TYPE, Float.valueOf(0.0f));

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        static final h f28355s = new h(Float.class, null);

        public h(Class cls, Float f10) {
            super(cls, h7.c.Float, f10, Float.valueOf(0.0f));
        }

        protected final Float e1(e6.j jVar, p6.h hVar) {
            String strK;
            int iQ = jVar.q();
            if (iQ == 1) {
                strK = hVar.K(jVar, this, this.f28200a);
            } else {
                if (iQ == 3) {
                    return (Float) W(jVar, hVar);
                }
                if (iQ == 11) {
                    return (Float) a(hVar);
                }
                if (iQ != 6) {
                    if (iQ == 7) {
                        r6.b bVarK = K(jVar, hVar, this.f28200a);
                        if (bVarK == r6.b.AsNull) {
                            return (Float) a(hVar);
                        }
                        if (bVarK == r6.b.AsEmpty) {
                            return (Float) k(hVar);
                        }
                    } else if (iQ != 8) {
                        return (Float) hVar.q0(Y0(hVar), jVar);
                    }
                    return Float.valueOf(jVar.p0());
                }
                strK = jVar.C0();
            }
            Float fA = A(strK);
            if (fA != null) {
                return fA;
            }
            r6.b bVarG = G(hVar, strK);
            if (bVarG == r6.b.AsNull) {
                return (Float) a(hVar);
            }
            if (bVarG == r6.b.AsEmpty) {
                return (Float) k(hVar);
            }
            String strTrim = strK.trim();
            if (N(hVar, strTrim)) {
                return (Float) a(hVar);
            }
            try {
                return Float.valueOf(i6.i.j(strTrim, jVar.Q0(e6.s.USE_FAST_DOUBLE_PARSER)));
            } catch (IllegalArgumentException unused) {
                return (Float) hVar.z0(this.f28200a, strTrim, "not a valid `Float` value", new Object[0]);
            }
        }

        @Override // p6.l
        /* JADX INFO: renamed from: f1, reason: merged with bridge method [inline-methods] */
        public Float e(e6.j jVar, p6.h hVar) {
            return jVar.N0(e6.m.VALUE_NUMBER_FLOAT) ? Float.valueOf(jVar.p0()) : this.f28364h ? Float.valueOf(y0(jVar, hVar)) : e1(jVar, hVar);
        }

        @Override // u6.w.l, p6.l
        public /* bridge */ /* synthetic */ Object k(p6.h hVar) {
            return super.k(hVar);
        }
    }

    public static final class i extends l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        static final i f28356r = new i(Integer.TYPE, 0);

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        static final i f28357s = new i(Integer.class, null);

        public i(Class cls, Integer num) {
            super(cls, h7.c.Integer, num, 0);
        }

        @Override // p6.l
        /* JADX INFO: renamed from: e1, reason: merged with bridge method [inline-methods] */
        public Integer e(e6.j jVar, p6.h hVar) {
            return jVar.R0() ? Integer.valueOf(jVar.t0()) : this.f28364h ? Integer.valueOf(A0(jVar, hVar)) : C0(jVar, hVar, Integer.class);
        }

        @Override // u6.g0, u6.c0, p6.l
        /* JADX INFO: renamed from: f1, reason: merged with bridge method [inline-methods] */
        public Integer g(e6.j jVar, p6.h hVar, a7.e eVar) {
            return jVar.R0() ? Integer.valueOf(jVar.t0()) : this.f28364h ? Integer.valueOf(A0(jVar, hVar)) : C0(jVar, hVar, Integer.class);
        }

        @Override // u6.w.l, p6.l
        public /* bridge */ /* synthetic */ Object k(p6.h hVar) {
            return super.k(hVar);
        }

        @Override // p6.l
        public boolean q() {
            return true;
        }
    }

    public static final class j extends l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        static final j f28358r = new j(Long.TYPE, 0L);

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        static final j f28359s = new j(Long.class, null);

        public j(Class cls, Long l10) {
            super(cls, h7.c.Integer, l10, 0L);
        }

        @Override // p6.l
        /* JADX INFO: renamed from: e1, reason: merged with bridge method [inline-methods] */
        public Long e(e6.j jVar, p6.h hVar) {
            return jVar.R0() ? Long.valueOf(jVar.u0()) : this.f28364h ? Long.valueOf(G0(jVar, hVar)) : E0(jVar, hVar, Long.class);
        }

        @Override // u6.w.l, p6.l
        public /* bridge */ /* synthetic */ Object k(p6.h hVar) {
            return super.k(hVar);
        }

        @Override // p6.l
        public boolean q() {
            return true;
        }
    }

    public static class k extends g0 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final k f28360e = new k();

        public k() {
            super(Number.class);
        }

        @Override // p6.l
        public Object e(e6.j jVar, p6.h hVar) throws g6.b {
            String strK;
            int iQ = jVar.q();
            if (iQ == 1) {
                strK = hVar.K(jVar, this, this.f28200a);
            } else {
                if (iQ == 3) {
                    return W(jVar, hVar);
                }
                if (iQ != 6) {
                    return iQ != 7 ? iQ != 8 ? hVar.q0(Y0(hVar), jVar) : (!hVar.D0(p6.i.USE_BIG_DECIMAL_FOR_FLOATS) || jVar.U0()) ? jVar.w0() : jVar.W() : hVar.A0(c0.f28198c) ? R(jVar, hVar) : jVar.w0();
                }
                strK = jVar.C0();
            }
            r6.b bVarG = G(hVar, strK);
            if (bVarG == r6.b.AsNull) {
                return a(hVar);
            }
            if (bVarG == r6.b.AsEmpty) {
                return k(hVar);
            }
            String strTrim = strK.trim();
            if (e0(strTrim)) {
                return a(hVar);
            }
            if (l0(strTrim)) {
                return Double.valueOf(Double.POSITIVE_INFINITY);
            }
            if (k0(strTrim)) {
                return Double.valueOf(Double.NEGATIVE_INFINITY);
            }
            if (j0(strTrim)) {
                return Double.valueOf(Double.NaN);
            }
            try {
                if (!i0(strTrim)) {
                    jVar.g1().c(strTrim.length());
                    return hVar.D0(p6.i.USE_BIG_DECIMAL_FOR_FLOATS) ? i6.i.e(strTrim, jVar.Q0(e6.s.USE_FAST_BIG_NUMBER_PARSER)) : Double.valueOf(i6.i.i(strTrim, jVar.Q0(e6.s.USE_FAST_DOUBLE_PARSER)));
                }
                jVar.g1().d(strTrim.length());
                if (hVar.D0(p6.i.USE_BIG_INTEGER_FOR_INTS)) {
                    return i6.i.g(strTrim, jVar.Q0(e6.s.USE_FAST_BIG_NUMBER_PARSER));
                }
                long jM = i6.i.m(strTrim);
                return (hVar.D0(p6.i.USE_LONG_FOR_INTS) || jM > 2147483647L || jM < -2147483648L) ? Long.valueOf(jM) : Integer.valueOf((int) jM);
            } catch (IllegalArgumentException unused) {
                return hVar.z0(this.f28200a, strTrim, "not a valid number", new Object[0]);
            }
        }

        @Override // u6.g0, u6.c0, p6.l
        public Object g(e6.j jVar, p6.h hVar, a7.e eVar) {
            int iQ = jVar.q();
            return (iQ == 6 || iQ == 7 || iQ == 8) ? e(jVar, hVar) : eVar.f(jVar, hVar);
        }

        @Override // u6.g0, p6.l
        public final h7.c r() {
            return h7.c.Integer;
        }
    }

    protected static abstract class l extends g0 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        protected final h7.c f28361e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        protected final Object f28362f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        protected final Object f28363g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        protected final boolean f28364h;

        protected l(Class cls, h7.c cVar, Object obj, Object obj2) {
            super(cls);
            this.f28361e = cVar;
            this.f28362f = obj;
            this.f28363g = obj2;
            this.f28364h = cls.isPrimitive();
        }

        @Override // p6.l, s6.r
        public final Object a(p6.h hVar) throws v6.f {
            if (this.f28364h && hVar.D0(p6.i.FAIL_ON_NULL_FOR_PRIMITIVES)) {
                hVar.S0(this, "Cannot map `null` into type %s (set DeserializationConfig.DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES to 'false' to allow)", i7.h.h(p()));
            }
            return this.f28362f;
        }

        @Override // p6.l
        public Object k(p6.h hVar) {
            return this.f28363g;
        }

        @Override // u6.g0, p6.l
        public final h7.c r() {
            return this.f28361e;
        }
    }

    public static class m extends l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        static final m f28365r = new m(Short.TYPE, 0);

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        static final m f28366s = new m(Short.class, null);

        public m(Class cls, Short sh2) {
            super(cls, h7.c.Integer, sh2, (short) 0);
        }

        protected Short e1(e6.j jVar, p6.h hVar) {
            String strK;
            int iQ = jVar.q();
            if (iQ == 1) {
                strK = hVar.K(jVar, this, this.f28200a);
            } else {
                if (iQ == 3) {
                    return (Short) W(jVar, hVar);
                }
                if (iQ == 11) {
                    return (Short) a(hVar);
                }
                if (iQ != 6) {
                    if (iQ == 7) {
                        return Short.valueOf(jVar.B0());
                    }
                    if (iQ != 8) {
                        return (Short) hVar.q0(Y0(hVar), jVar);
                    }
                    r6.b bVarC = C(jVar, hVar, this.f28200a);
                    return bVarC == r6.b.AsNull ? (Short) a(hVar) : bVarC == r6.b.AsEmpty ? (Short) k(hVar) : Short.valueOf(jVar.B0());
                }
                strK = jVar.C0();
            }
            r6.b bVarG = G(hVar, strK);
            if (bVarG == r6.b.AsNull) {
                return (Short) a(hVar);
            }
            if (bVarG == r6.b.AsEmpty) {
                return (Short) k(hVar);
            }
            String strTrim = strK.trim();
            if (N(hVar, strTrim)) {
                return (Short) a(hVar);
            }
            try {
                int iK = i6.i.k(strTrim);
                return L0(iK) ? (Short) hVar.z0(this.f28200a, strTrim, "overflow, value cannot be represented as 16-bit value", new Object[0]) : Short.valueOf((short) iK);
            } catch (IllegalArgumentException unused) {
                return (Short) hVar.z0(this.f28200a, strTrim, "not a valid Short value", new Object[0]);
            }
        }

        @Override // p6.l
        /* JADX INFO: renamed from: f1, reason: merged with bridge method [inline-methods] */
        public Short e(e6.j jVar, p6.h hVar) {
            return jVar.R0() ? Short.valueOf(jVar.B0()) : this.f28364h ? Short.valueOf(I0(jVar, hVar)) : e1(jVar, hVar);
        }

        @Override // u6.w.l, p6.l
        public /* bridge */ /* synthetic */ Object k(p6.h hVar) {
            return super.k(hVar);
        }
    }

    static {
        Class[] clsArr = {Boolean.class, Byte.class, Short.class, Character.class, Integer.class, Long.class, Float.class, Double.class, Number.class, BigDecimal.class, BigInteger.class};
        for (int i10 = 0; i10 < 11; i10++) {
            f28342a.add(clsArr[i10].getName());
        }
    }

    public static p6.l a(Class cls, String str) {
        if (cls.isPrimitive()) {
            if (cls == Integer.TYPE) {
                return i.f28356r;
            }
            if (cls == Boolean.TYPE) {
                return d.f28346r;
            }
            if (cls == Long.TYPE) {
                return j.f28358r;
            }
            if (cls == Double.TYPE) {
                return g.f28352r;
            }
            if (cls == Character.TYPE) {
                return f.f28350r;
            }
            if (cls == Byte.TYPE) {
                return e.f28348r;
            }
            if (cls == Short.TYPE) {
                return m.f28365r;
            }
            if (cls == Float.TYPE) {
                return h.f28354r;
            }
            if (cls == Void.TYPE) {
                return v.f28341e;
            }
        } else {
            if (!f28342a.contains(str)) {
                return null;
            }
            if (cls == Integer.class) {
                return i.f28357s;
            }
            if (cls == Boolean.class) {
                return d.f28347s;
            }
            if (cls == Long.class) {
                return j.f28359s;
            }
            if (cls == Double.class) {
                return g.f28353s;
            }
            if (cls == Character.class) {
                return f.f28351s;
            }
            if (cls == Byte.class) {
                return e.f28349s;
            }
            if (cls == Short.class) {
                return m.f28366s;
            }
            if (cls == Float.class) {
                return h.f28355s;
            }
            if (cls == Number.class) {
                return k.f28360e;
            }
            if (cls == BigDecimal.class) {
                return b.f28344e;
            }
            if (cls == BigInteger.class) {
                return c.f28345e;
            }
        }
        throw new IllegalArgumentException("Internal error: can't find deserializer for " + cls.getName());
    }
}
