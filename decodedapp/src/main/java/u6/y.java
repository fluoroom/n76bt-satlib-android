package u6;

import d6.k;
import i7.c;
import j$.util.Objects;
import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class y extends c0 implements s6.i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final Boolean f28372e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private transient Object f28373f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final s6.r f28374g;

    static final class a extends y {
        public a() {
            super(boolean[].class);
        }

        @Override // u6.y
        protected y j1(s6.r rVar, Boolean bool) {
            return new a(this, rVar, bool);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // u6.y
        /* JADX INFO: renamed from: k1, reason: merged with bridge method [inline-methods] */
        public boolean[] e1(boolean[] zArr, boolean[] zArr2) {
            int length = zArr.length;
            int length2 = zArr2.length;
            boolean[] zArrCopyOf = Arrays.copyOf(zArr, length + length2);
            System.arraycopy(zArr2, 0, zArrCopyOf, length, length2);
            return zArrCopyOf;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // u6.y
        /* JADX INFO: renamed from: l1, reason: merged with bridge method [inline-methods] */
        public boolean[] f1() {
            return new boolean[0];
        }

        @Override // p6.l
        /* JADX INFO: renamed from: m1, reason: merged with bridge method [inline-methods] */
        public boolean[] e(e6.j jVar, p6.h hVar) throws p6.m {
            boolean zQ0;
            int i10;
            if (!jVar.S0()) {
                return (boolean[]) h1(jVar, hVar);
            }
            c.b bVarB = hVar.a0().b();
            boolean[] zArr = (boolean[]) bVarB.f();
            int i11 = 0;
            while (true) {
                try {
                    e6.m mVarX0 = jVar.X0();
                    if (mVarX0 == e6.m.END_ARRAY) {
                        return (boolean[]) bVarB.e(zArr, i11);
                    }
                    try {
                        if (mVarX0 == e6.m.VALUE_TRUE) {
                            zQ0 = true;
                        } else {
                            if (mVarX0 != e6.m.VALUE_FALSE) {
                                if (mVarX0 == e6.m.VALUE_NULL) {
                                    s6.r rVar = this.f28374g;
                                    if (rVar != null) {
                                        rVar.a(hVar);
                                    } else {
                                        N0(hVar);
                                    }
                                } else {
                                    zQ0 = q0(jVar, hVar);
                                }
                            }
                            zQ0 = false;
                        }
                        zArr[i11] = zQ0;
                        i11 = i10;
                    } catch (Exception e10) {
                        e = e10;
                        i11 = i10;
                        throw p6.m.r(e, zArr, bVarB.d() + i11);
                    }
                    if (i11 >= zArr.length) {
                        zArr = (boolean[]) bVarB.c(zArr, i11);
                        i11 = 0;
                    }
                    i10 = i11 + 1;
                } catch (Exception e11) {
                    e = e11;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // u6.y
        /* JADX INFO: renamed from: n1, reason: merged with bridge method [inline-methods] */
        public boolean[] i1(e6.j jVar, p6.h hVar) {
            return new boolean[]{q0(jVar, hVar)};
        }

        protected a(a aVar, s6.r rVar, Boolean bool) {
            super(aVar, rVar, bool);
        }
    }

    static final class b extends y {
        public b() {
            super(byte[].class);
        }

        @Override // u6.y
        protected y j1(s6.r rVar, Boolean bool) {
            return new b(this, rVar, bool);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // u6.y
        /* JADX INFO: renamed from: k1, reason: merged with bridge method [inline-methods] */
        public byte[] e1(byte[] bArr, byte[] bArr2) {
            int length = bArr.length;
            int length2 = bArr2.length;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, length + length2);
            System.arraycopy(bArr2, 0, bArrCopyOf, length, length2);
            return bArrCopyOf;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // u6.y
        /* JADX INFO: renamed from: l1, reason: merged with bridge method [inline-methods] */
        public byte[] f1() {
            return new byte[0];
        }

        @Override // p6.l
        /* JADX INFO: renamed from: m1, reason: merged with bridge method [inline-methods] */
        public byte[] e(e6.j jVar, p6.h hVar) throws p6.m {
            byte bX;
            int i10;
            e6.m mVarN = jVar.n();
            if (mVarN == e6.m.VALUE_STRING) {
                try {
                    return jVar.v(hVar.b0());
                } catch (g6.c | p6.f e10) {
                    String strB = e10.b();
                    if (strB.contains("base64")) {
                        return (byte[]) hVar.z0(byte[].class, jVar.C0(), strB, new Object[0]);
                    }
                }
            }
            if (mVarN == e6.m.VALUE_EMBEDDED_OBJECT) {
                Object objH0 = jVar.h0();
                if (objH0 == null) {
                    return null;
                }
                if (objH0 instanceof byte[]) {
                    return (byte[]) objH0;
                }
            }
            if (!jVar.S0()) {
                return (byte[]) h1(jVar, hVar);
            }
            c.C0219c c0219cC = hVar.a0().c();
            byte[] bArr = (byte[]) c0219cC.f();
            int i11 = 0;
            while (true) {
                try {
                    e6.m mVarX0 = jVar.X0();
                    if (mVarX0 == e6.m.END_ARRAY) {
                        return (byte[]) c0219cC.e(bArr, i11);
                    }
                    try {
                        if (mVarX0 == e6.m.VALUE_NUMBER_INT) {
                            bX = jVar.x();
                        } else if (mVarX0 == e6.m.VALUE_NULL) {
                            s6.r rVar = this.f28374g;
                            if (rVar != null) {
                                rVar.a(hVar);
                            } else {
                                N0(hVar);
                                bX = 0;
                            }
                        } else {
                            bX = r0(jVar, hVar);
                        }
                        bArr[i11] = bX;
                        i11 = i10;
                    } catch (Exception e11) {
                        e = e11;
                        i11 = i10;
                        throw p6.m.r(e, bArr, c0219cC.d() + i11);
                    }
                    if (i11 >= bArr.length) {
                        bArr = (byte[]) c0219cC.c(bArr, i11);
                        i11 = 0;
                    }
                    i10 = i11 + 1;
                } catch (Exception e12) {
                    e = e12;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // u6.y
        /* JADX INFO: renamed from: n1, reason: merged with bridge method [inline-methods] */
        public byte[] i1(e6.j jVar, p6.h hVar) throws g6.a, v6.f {
            byte bByteValue;
            e6.m mVarN = jVar.n();
            if (mVarN == e6.m.VALUE_NUMBER_INT) {
                bByteValue = jVar.x();
            } else {
                if (mVarN == e6.m.VALUE_NULL) {
                    s6.r rVar = this.f28374g;
                    if (rVar != null) {
                        rVar.a(hVar);
                        return (byte[]) k(hVar);
                    }
                    N0(hVar);
                    return null;
                }
                bByteValue = ((Number) hVar.s0(this.f28200a.getComponentType(), jVar)).byteValue();
            }
            return new byte[]{bByteValue};
        }

        @Override // u6.y, p6.l
        public h7.c r() {
            return h7.c.Binary;
        }

        protected b(b bVar, s6.r rVar, Boolean bool) {
            super(bVar, rVar, bool);
        }
    }

    static final class d extends y {
        public d() {
            super(double[].class);
        }

        @Override // u6.y
        protected y j1(s6.r rVar, Boolean bool) {
            return new d(this, rVar, bool);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // u6.y
        /* JADX INFO: renamed from: k1, reason: merged with bridge method [inline-methods] */
        public double[] e1(double[] dArr, double[] dArr2) {
            int length = dArr.length;
            int length2 = dArr2.length;
            double[] dArrCopyOf = Arrays.copyOf(dArr, length + length2);
            System.arraycopy(dArr2, 0, dArrCopyOf, length, length2);
            return dArrCopyOf;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // u6.y
        /* JADX INFO: renamed from: l1, reason: merged with bridge method [inline-methods] */
        public double[] f1() {
            return new double[0];
        }

        @Override // p6.l
        /* JADX INFO: renamed from: m1, reason: merged with bridge method [inline-methods] */
        public double[] e(e6.j jVar, p6.h hVar) throws p6.m {
            s6.r rVar;
            if (!jVar.S0()) {
                return (double[]) h1(jVar, hVar);
            }
            c.d dVarD = hVar.a0().d();
            double[] dArr = (double[]) dVarD.f();
            int i10 = 0;
            while (true) {
                try {
                    e6.m mVarX0 = jVar.X0();
                    if (mVarX0 == e6.m.END_ARRAY) {
                        return (double[]) dVarD.e(dArr, i10);
                    }
                    if (mVarX0 != e6.m.VALUE_NULL || (rVar = this.f28374g) == null) {
                        double dW0 = w0(jVar, hVar);
                        if (i10 >= dArr.length) {
                            dArr = (double[]) dVarD.c(dArr, i10);
                            i10 = 0;
                        }
                        int i11 = i10 + 1;
                        try {
                            dArr[i10] = dW0;
                            i10 = i11;
                        } catch (Exception e10) {
                            e = e10;
                            i10 = i11;
                            throw p6.m.r(e, dArr, dVarD.d() + i10);
                        }
                    } else {
                        rVar.a(hVar);
                    }
                } catch (Exception e11) {
                    e = e11;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // u6.y
        /* JADX INFO: renamed from: n1, reason: merged with bridge method [inline-methods] */
        public double[] i1(e6.j jVar, p6.h hVar) {
            return new double[]{w0(jVar, hVar)};
        }

        protected d(d dVar, s6.r rVar, Boolean bool) {
            super(dVar, rVar, bool);
        }
    }

    static final class e extends y {
        public e() {
            super(float[].class);
        }

        @Override // u6.y
        protected y j1(s6.r rVar, Boolean bool) {
            return new e(this, rVar, bool);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // u6.y
        /* JADX INFO: renamed from: k1, reason: merged with bridge method [inline-methods] */
        public float[] e1(float[] fArr, float[] fArr2) {
            int length = fArr.length;
            int length2 = fArr2.length;
            float[] fArrCopyOf = Arrays.copyOf(fArr, length + length2);
            System.arraycopy(fArr2, 0, fArrCopyOf, length, length2);
            return fArrCopyOf;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // u6.y
        /* JADX INFO: renamed from: l1, reason: merged with bridge method [inline-methods] */
        public float[] f1() {
            return new float[0];
        }

        @Override // p6.l
        /* JADX INFO: renamed from: m1, reason: merged with bridge method [inline-methods] */
        public float[] e(e6.j jVar, p6.h hVar) throws p6.m {
            s6.r rVar;
            if (!jVar.S0()) {
                return (float[]) h1(jVar, hVar);
            }
            c.e eVarE = hVar.a0().e();
            float[] fArr = (float[]) eVarE.f();
            int i10 = 0;
            while (true) {
                try {
                    e6.m mVarX0 = jVar.X0();
                    if (mVarX0 == e6.m.END_ARRAY) {
                        return (float[]) eVarE.e(fArr, i10);
                    }
                    if (mVarX0 != e6.m.VALUE_NULL || (rVar = this.f28374g) == null) {
                        float fY0 = y0(jVar, hVar);
                        if (i10 >= fArr.length) {
                            fArr = (float[]) eVarE.c(fArr, i10);
                            i10 = 0;
                        }
                        int i11 = i10 + 1;
                        try {
                            fArr[i10] = fY0;
                            i10 = i11;
                        } catch (Exception e10) {
                            e = e10;
                            i10 = i11;
                            throw p6.m.r(e, fArr, eVarE.d() + i10);
                        }
                    } else {
                        rVar.a(hVar);
                    }
                } catch (Exception e11) {
                    e = e11;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // u6.y
        /* JADX INFO: renamed from: n1, reason: merged with bridge method [inline-methods] */
        public float[] i1(e6.j jVar, p6.h hVar) {
            return new float[]{y0(jVar, hVar)};
        }

        protected e(e eVar, s6.r rVar, Boolean bool) {
            super(eVar, rVar, bool);
        }
    }

    static final class f extends y {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final f f28375h = new f();

        public f() {
            super(int[].class);
        }

        @Override // u6.y
        protected y j1(s6.r rVar, Boolean bool) {
            return new f(this, rVar, bool);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // u6.y
        /* JADX INFO: renamed from: k1, reason: merged with bridge method [inline-methods] */
        public int[] e1(int[] iArr, int[] iArr2) {
            int length = iArr.length;
            int length2 = iArr2.length;
            int[] iArrCopyOf = Arrays.copyOf(iArr, length + length2);
            System.arraycopy(iArr2, 0, iArrCopyOf, length, length2);
            return iArrCopyOf;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // u6.y
        /* JADX INFO: renamed from: l1, reason: merged with bridge method [inline-methods] */
        public int[] f1() {
            return new int[0];
        }

        @Override // p6.l
        /* JADX INFO: renamed from: m1, reason: merged with bridge method [inline-methods] */
        public int[] e(e6.j jVar, p6.h hVar) throws p6.m {
            int iT0;
            int i10;
            if (!jVar.S0()) {
                return (int[]) h1(jVar, hVar);
            }
            c.f fVarF = hVar.a0().f();
            int[] iArr = (int[]) fVarF.f();
            int i11 = 0;
            while (true) {
                try {
                    e6.m mVarX0 = jVar.X0();
                    if (mVarX0 == e6.m.END_ARRAY) {
                        return (int[]) fVarF.e(iArr, i11);
                    }
                    try {
                        if (mVarX0 == e6.m.VALUE_NUMBER_INT) {
                            iT0 = jVar.t0();
                        } else if (mVarX0 == e6.m.VALUE_NULL) {
                            s6.r rVar = this.f28374g;
                            if (rVar != null) {
                                rVar.a(hVar);
                            } else {
                                N0(hVar);
                                iT0 = 0;
                            }
                        } else {
                            iT0 = A0(jVar, hVar);
                        }
                        iArr[i11] = iT0;
                        i11 = i10;
                    } catch (Exception e10) {
                        e = e10;
                        i11 = i10;
                        throw p6.m.r(e, iArr, fVarF.d() + i11);
                    }
                    if (i11 >= iArr.length) {
                        iArr = (int[]) fVarF.c(iArr, i11);
                        i11 = 0;
                    }
                    i10 = i11 + 1;
                } catch (Exception e11) {
                    e = e11;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // u6.y
        /* JADX INFO: renamed from: n1, reason: merged with bridge method [inline-methods] */
        public int[] i1(e6.j jVar, p6.h hVar) {
            return new int[]{A0(jVar, hVar)};
        }

        protected f(f fVar, s6.r rVar, Boolean bool) {
            super(fVar, rVar, bool);
        }
    }

    static final class g extends y {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final g f28376h = new g();

        public g() {
            super(long[].class);
        }

        @Override // u6.y
        protected y j1(s6.r rVar, Boolean bool) {
            return new g(this, rVar, bool);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // u6.y
        /* JADX INFO: renamed from: k1, reason: merged with bridge method [inline-methods] */
        public long[] e1(long[] jArr, long[] jArr2) {
            int length = jArr.length;
            int length2 = jArr2.length;
            long[] jArrCopyOf = Arrays.copyOf(jArr, length + length2);
            System.arraycopy(jArr2, 0, jArrCopyOf, length, length2);
            return jArrCopyOf;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // u6.y
        /* JADX INFO: renamed from: l1, reason: merged with bridge method [inline-methods] */
        public long[] f1() {
            return new long[0];
        }

        @Override // p6.l
        /* JADX INFO: renamed from: m1, reason: merged with bridge method [inline-methods] */
        public long[] e(e6.j jVar, p6.h hVar) throws p6.m {
            long jU0;
            int i10;
            if (!jVar.S0()) {
                return (long[]) h1(jVar, hVar);
            }
            c.g gVarG = hVar.a0().g();
            long[] jArr = (long[]) gVarG.f();
            int i11 = 0;
            while (true) {
                try {
                    e6.m mVarX0 = jVar.X0();
                    if (mVarX0 == e6.m.END_ARRAY) {
                        return (long[]) gVarG.e(jArr, i11);
                    }
                    try {
                        if (mVarX0 == e6.m.VALUE_NUMBER_INT) {
                            jU0 = jVar.u0();
                        } else if (mVarX0 == e6.m.VALUE_NULL) {
                            s6.r rVar = this.f28374g;
                            if (rVar != null) {
                                rVar.a(hVar);
                            } else {
                                N0(hVar);
                                jU0 = 0;
                            }
                        } else {
                            jU0 = G0(jVar, hVar);
                        }
                        jArr[i11] = jU0;
                        i11 = i10;
                    } catch (Exception e10) {
                        e = e10;
                        i11 = i10;
                        throw p6.m.r(e, jArr, gVarG.d() + i11);
                    }
                    if (i11 >= jArr.length) {
                        jArr = (long[]) gVarG.c(jArr, i11);
                        i11 = 0;
                    }
                    i10 = i11 + 1;
                } catch (Exception e11) {
                    e = e11;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // u6.y
        /* JADX INFO: renamed from: n1, reason: merged with bridge method [inline-methods] */
        public long[] i1(e6.j jVar, p6.h hVar) {
            return new long[]{G0(jVar, hVar)};
        }

        protected g(g gVar, s6.r rVar, Boolean bool) {
            super(gVar, rVar, bool);
        }
    }

    static final class h extends y {
        public h() {
            super(short[].class);
        }

        @Override // u6.y
        protected y j1(s6.r rVar, Boolean bool) {
            return new h(this, rVar, bool);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // u6.y
        /* JADX INFO: renamed from: k1, reason: merged with bridge method [inline-methods] */
        public short[] e1(short[] sArr, short[] sArr2) {
            int length = sArr.length;
            int length2 = sArr2.length;
            short[] sArrCopyOf = Arrays.copyOf(sArr, length + length2);
            System.arraycopy(sArr2, 0, sArrCopyOf, length, length2);
            return sArrCopyOf;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // u6.y
        /* JADX INFO: renamed from: l1, reason: merged with bridge method [inline-methods] */
        public short[] f1() {
            return new short[0];
        }

        @Override // p6.l
        /* JADX INFO: renamed from: m1, reason: merged with bridge method [inline-methods] */
        public short[] e(e6.j jVar, p6.h hVar) throws p6.m {
            short sI0;
            int i10;
            if (!jVar.S0()) {
                return (short[]) h1(jVar, hVar);
            }
            c.h hVarH = hVar.a0().h();
            short[] sArr = (short[]) hVarH.f();
            int i11 = 0;
            while (true) {
                try {
                    e6.m mVarX0 = jVar.X0();
                    if (mVarX0 == e6.m.END_ARRAY) {
                        return (short[]) hVarH.e(sArr, i11);
                    }
                    try {
                        if (mVarX0 == e6.m.VALUE_NULL) {
                            s6.r rVar = this.f28374g;
                            if (rVar != null) {
                                rVar.a(hVar);
                            } else {
                                N0(hVar);
                                sI0 = 0;
                            }
                        } else {
                            sI0 = I0(jVar, hVar);
                        }
                        sArr[i11] = sI0;
                        i11 = i10;
                    } catch (Exception e10) {
                        e = e10;
                        i11 = i10;
                        throw p6.m.r(e, sArr, hVarH.d() + i11);
                    }
                    if (i11 >= sArr.length) {
                        sArr = (short[]) hVarH.c(sArr, i11);
                        i11 = 0;
                    }
                    i10 = i11 + 1;
                } catch (Exception e11) {
                    e = e11;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // u6.y
        /* JADX INFO: renamed from: n1, reason: merged with bridge method [inline-methods] */
        public short[] i1(e6.j jVar, p6.h hVar) {
            return new short[]{I0(jVar, hVar)};
        }

        protected h(h hVar, s6.r rVar, Boolean bool) {
            super(hVar, rVar, bool);
        }
    }

    protected y(Class cls) {
        super(cls);
        this.f28372e = null;
        this.f28374g = null;
    }

    public static p6.l g1(Class cls) {
        if (cls == Integer.TYPE) {
            return f.f28375h;
        }
        if (cls == Long.TYPE) {
            return g.f28376h;
        }
        if (cls == Byte.TYPE) {
            return new b();
        }
        if (cls == Short.TYPE) {
            return new h();
        }
        if (cls == Float.TYPE) {
            return new e();
        }
        if (cls == Double.TYPE) {
            return new d();
        }
        if (cls == Boolean.TYPE) {
            return new a();
        }
        if (cls == Character.TYPE) {
            return new c();
        }
        throw new IllegalStateException();
    }

    @Override // s6.i
    public p6.l d(p6.h hVar, p6.d dVar) {
        Boolean boolT0 = T0(hVar, dVar, this.f28200a, k.a.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        d6.j0 j0VarQ0 = Q0(hVar, dVar);
        s6.r rVarF = j0VarQ0 == d6.j0.SKIP ? t6.q.f() : j0VarQ0 == d6.j0.FAIL ? dVar == null ? t6.r.e(hVar.G(this.f28200a.getComponentType())) : t6.r.d(dVar, dVar.getType().k()) : null;
        return (Objects.equals(boolT0, this.f28372e) && rVarF == this.f28374g) ? this : j1(rVarF, boolT0);
    }

    protected abstract Object e1(Object obj, Object obj2);

    @Override // p6.l
    public Object f(e6.j jVar, p6.h hVar, Object obj) {
        Object objE = e(jVar, hVar);
        return (obj == null || Array.getLength(obj) == 0) ? objE : e1(obj, objE);
    }

    protected abstract Object f1();

    @Override // u6.c0, p6.l
    public Object g(e6.j jVar, p6.h hVar, a7.e eVar) {
        return eVar.d(jVar, hVar);
    }

    protected Object h1(e6.j jVar, p6.h hVar) {
        if (jVar.N0(e6.m.VALUE_STRING)) {
            return Y(jVar, hVar);
        }
        Boolean bool = this.f28372e;
        return (bool == Boolean.TRUE || (bool == null && hVar.D0(p6.i.ACCEPT_SINGLE_VALUE_AS_ARRAY))) ? i1(jVar, hVar) : hVar.s0(this.f28200a, jVar);
    }

    protected abstract Object i1(e6.j jVar, p6.h hVar);

    @Override // p6.l
    public i7.a j() {
        return i7.a.CONSTANT;
    }

    protected abstract y j1(s6.r rVar, Boolean bool);

    @Override // p6.l
    public Object k(p6.h hVar) {
        Object obj = this.f28373f;
        if (obj != null) {
            return obj;
        }
        Object objF1 = f1();
        this.f28373f = objF1;
        return objF1;
    }

    @Override // p6.l
    public h7.c r() {
        return h7.c.Array;
    }

    @Override // p6.l
    public Boolean s(p6.g gVar) {
        return Boolean.TRUE;
    }

    protected y(y yVar, s6.r rVar, Boolean bool) {
        super(yVar.f28200a);
        this.f28372e = bool;
        this.f28374g = rVar;
    }

    static final class c extends y {
        public c() {
            super(char[].class);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // u6.y
        /* JADX INFO: renamed from: k1, reason: merged with bridge method [inline-methods] */
        public char[] e1(char[] cArr, char[] cArr2) {
            int length = cArr.length;
            int length2 = cArr2.length;
            char[] cArrCopyOf = Arrays.copyOf(cArr, length + length2);
            System.arraycopy(cArr2, 0, cArrCopyOf, length, length2);
            return cArrCopyOf;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // u6.y
        /* JADX INFO: renamed from: l1, reason: merged with bridge method [inline-methods] */
        public char[] f1() {
            return new char[0];
        }

        @Override // p6.l
        /* JADX INFO: renamed from: m1, reason: merged with bridge method [inline-methods] */
        public char[] e(e6.j jVar, p6.h hVar) throws v6.f {
            String strC0;
            if (jVar.N0(e6.m.VALUE_STRING)) {
                char[] cArrD0 = jVar.D0();
                int iF0 = jVar.F0();
                int iE0 = jVar.E0();
                char[] cArr = new char[iE0];
                System.arraycopy(cArrD0, iF0, cArr, 0, iE0);
                return cArr;
            }
            if (!jVar.S0()) {
                if (jVar.N0(e6.m.VALUE_EMBEDDED_OBJECT)) {
                    Object objH0 = jVar.h0();
                    if (objH0 == null) {
                        return null;
                    }
                    if (objH0 instanceof char[]) {
                        return (char[]) objH0;
                    }
                    if (objH0 instanceof String) {
                        return ((String) objH0).toCharArray();
                    }
                    if (objH0 instanceof byte[]) {
                        return e6.b.a().i((byte[]) objH0, false).toCharArray();
                    }
                }
                return (char[]) hVar.s0(this.f28200a, jVar);
            }
            StringBuilder sb2 = new StringBuilder(64);
            while (true) {
                e6.m mVarX0 = jVar.X0();
                if (mVarX0 == e6.m.END_ARRAY) {
                    return sb2.toString().toCharArray();
                }
                if (mVarX0 == e6.m.VALUE_STRING) {
                    strC0 = jVar.C0();
                } else if (mVarX0 == e6.m.VALUE_NULL) {
                    s6.r rVar = this.f28374g;
                    if (rVar != null) {
                        rVar.a(hVar);
                    } else {
                        N0(hVar);
                        strC0 = "\u0000";
                    }
                } else {
                    strC0 = ((CharSequence) hVar.s0(Character.TYPE, jVar)).toString();
                }
                if (strC0.length() != 1) {
                    hVar.S0(this, "Cannot convert a JSON String of length %d into a char element of char array", Integer.valueOf(strC0.length()));
                }
                sb2.append(strC0.charAt(0));
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // u6.y
        /* JADX INFO: renamed from: n1, reason: merged with bridge method [inline-methods] */
        public char[] i1(e6.j jVar, p6.h hVar) {
            return (char[]) hVar.s0(this.f28200a, jVar);
        }

        @Override // u6.y
        protected y j1(s6.r rVar, Boolean bool) {
            return this;
        }
    }
}
