package u6;

import androidx.appcompat.widget.ActivityChooserView;
import androidx.appcompat.widget.RtlSpacingHelper;
import com.fasterxml.jackson.databind.JavaType;
import d6.k;
import e6.j;
import java.io.Serializable;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public abstract class c0 extends p6.l implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected static final int f28198c = p6.i.USE_BIG_INTEGER_FOR_INTS.d() | p6.i.USE_LONG_FOR_INTS.d();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected static final int f28199d = p6.i.UNWRAP_SINGLE_VALUE_ARRAYS.d() | p6.i.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT.d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Class f28200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final JavaType f28201b;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f28202a;

        static {
            int[] iArr = new int[r6.b.values().length];
            f28202a = iArr;
            try {
                iArr[r6.b.AsEmpty.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28202a[r6.b.AsNull.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28202a[r6.b.TryConvert.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28202a[r6.b.Fail.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    protected c0(Class cls) {
        this.f28200a = cls;
        this.f28201b = null;
    }

    protected static final boolean g0(String str) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (str.charAt(i10) > ' ') {
                return false;
            }
        }
        return true;
    }

    protected static final boolean n0(Object obj, Object obj2) {
        return (obj == null || obj2 == null) ? false : true;
    }

    protected static final double v0(String str, boolean z10) {
        return i6.i.i(str, z10);
    }

    protected Float A(String str) {
        if (str.isEmpty()) {
            return null;
        }
        char cCharAt = str.charAt(0);
        if (cCharAt == '-') {
            if (k0(str)) {
                return Float.valueOf(Float.NEGATIVE_INFINITY);
            }
            return null;
        }
        if (cCharAt == 'I') {
            if (l0(str)) {
                return Float.valueOf(Float.POSITIVE_INFINITY);
            }
            return null;
        }
        if (cCharAt == 'N' && j0(str)) {
            return Float.valueOf(Float.NaN);
        }
        return null;
    }

    protected final int A0(e6.j jVar, p6.h hVar) throws p6.m {
        String strK;
        int iQ = jVar.q();
        Class cls = Integer.TYPE;
        if (iQ != 1) {
            if (iQ != 3) {
                if (iQ == 11) {
                    N0(hVar);
                    return 0;
                }
                if (iQ == 6) {
                    strK = jVar.C0();
                } else {
                    if (iQ == 7) {
                        return jVar.t0();
                    }
                    if (iQ == 8) {
                        r6.b bVarC = C(jVar, hVar, cls);
                        if (bVarC == r6.b.AsNull || bVarC == r6.b.AsEmpty) {
                            return 0;
                        }
                        return jVar.I0();
                    }
                }
            } else if (hVar.D0(p6.i.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                if (jVar.X0() == e6.m.START_ARRAY) {
                    return ((Integer) a1(jVar, hVar)).intValue();
                }
                int iA0 = A0(jVar, hVar);
                M0(jVar, hVar);
                return iA0;
            }
            return ((Number) hVar.s0(cls, jVar)).intValue();
        }
        strK = hVar.K(jVar, this, cls);
        r6.b bVarH = H(hVar, strK, h7.c.Integer, cls);
        if (bVarH == r6.b.AsNull) {
            N0(hVar);
            return 0;
        }
        if (bVarH == r6.b.AsEmpty) {
            return 0;
        }
        String strTrim = strK.trim();
        if (!e0(strTrim)) {
            return B0(hVar, strTrim);
        }
        O0(hVar, strTrim);
        return 0;
    }

    protected final int B0(p6.h hVar, String str) {
        Class cls = Integer.TYPE;
        try {
            if (str.length() <= 9) {
                return i6.i.k(str);
            }
            long jM = i6.i.m(str);
            return f0(jM) ? o0((Number) hVar.z0(cls, str, "Overflow: numeric value (%s) out of range of int (%d -%d)", str, Integer.valueOf(RtlSpacingHelper.UNDEFINED), Integer.valueOf(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED))).intValue() : (int) jM;
        } catch (IllegalArgumentException unused) {
            return o0((Number) hVar.z0(cls, str, "not a valid `int` value", new Object[0])).intValue();
        }
    }

    protected r6.b C(e6.j jVar, p6.h hVar, Class cls) {
        r6.b bVarN = hVar.N(h7.c.Integer, cls, r6.e.Float);
        if (bVarN != r6.b.Fail) {
            return bVarN;
        }
        return x(hVar, bVarN, cls, jVar.w0(), "Floating-point value (" + jVar.C0() + ")");
    }

    protected final Integer C0(e6.j jVar, p6.h hVar, Class cls) {
        String strK;
        int iQ = jVar.q();
        if (iQ == 1) {
            strK = hVar.K(jVar, this, cls);
        } else {
            if (iQ == 3) {
                return (Integer) W(jVar, hVar);
            }
            if (iQ == 11) {
                return (Integer) a(hVar);
            }
            if (iQ != 6) {
                if (iQ == 7) {
                    return Integer.valueOf(jVar.t0());
                }
                if (iQ != 8) {
                    return (Integer) hVar.q0(Y0(hVar), jVar);
                }
                r6.b bVarC = C(jVar, hVar, cls);
                return bVarC == r6.b.AsNull ? (Integer) a(hVar) : bVarC == r6.b.AsEmpty ? (Integer) k(hVar) : Integer.valueOf(jVar.I0());
            }
            strK = jVar.C0();
        }
        r6.b bVarG = G(hVar, strK);
        if (bVarG == r6.b.AsNull) {
            return (Integer) a(hVar);
        }
        if (bVarG == r6.b.AsEmpty) {
            return (Integer) k(hVar);
        }
        String strTrim = strK.trim();
        return N(hVar, strTrim) ? (Integer) a(hVar) : D0(hVar, strTrim);
    }

    protected r6.b D(e6.j jVar, p6.h hVar, Class cls) {
        return O(jVar, hVar, cls, jVar.w0(), r6.e.Float);
    }

    protected final Integer D0(p6.h hVar, String str) {
        try {
            if (str.length() <= 9) {
                return Integer.valueOf(i6.i.k(str));
            }
            long jM = i6.i.m(str);
            return f0(jM) ? (Integer) hVar.z0(Integer.class, str, "Overflow: numeric value (%s) out of range of `java.lang.Integer` (%d -%d)", str, Integer.valueOf(RtlSpacingHelper.UNDEFINED), Integer.valueOf(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED)) : Integer.valueOf((int) jM);
        } catch (IllegalArgumentException unused) {
            return (Integer) hVar.z0(Integer.class, str, "not a valid `java.lang.Integer` value", new Object[0]);
        }
    }

    protected final Long E0(e6.j jVar, p6.h hVar, Class cls) {
        String strK;
        int iQ = jVar.q();
        if (iQ == 1) {
            strK = hVar.K(jVar, this, cls);
        } else {
            if (iQ == 3) {
                return (Long) W(jVar, hVar);
            }
            if (iQ == 11) {
                return (Long) a(hVar);
            }
            if (iQ != 6) {
                if (iQ == 7) {
                    return Long.valueOf(jVar.u0());
                }
                if (iQ != 8) {
                    return (Long) hVar.q0(Y0(hVar), jVar);
                }
                r6.b bVarC = C(jVar, hVar, cls);
                return bVarC == r6.b.AsNull ? (Long) a(hVar) : bVarC == r6.b.AsEmpty ? (Long) k(hVar) : Long.valueOf(jVar.J0());
            }
            strK = jVar.C0();
        }
        r6.b bVarG = G(hVar, strK);
        if (bVarG == r6.b.AsNull) {
            return (Long) a(hVar);
        }
        if (bVarG == r6.b.AsEmpty) {
            return (Long) k(hVar);
        }
        String strTrim = strK.trim();
        return N(hVar, strTrim) ? (Long) a(hVar) : F0(hVar, strTrim);
    }

    protected final Long F0(p6.h hVar, String str) {
        try {
            return Long.valueOf(i6.i.m(str));
        } catch (IllegalArgumentException unused) {
            return (Long) hVar.z0(Long.class, str, "not a valid `java.lang.Long` value", new Object[0]);
        }
    }

    protected r6.b G(p6.h hVar, String str) {
        return H(hVar, str, r(), p());
    }

    protected final long G0(e6.j jVar, p6.h hVar) throws p6.m {
        String strK;
        int iQ = jVar.q();
        Class cls = Long.TYPE;
        if (iQ != 1) {
            if (iQ != 3) {
                if (iQ == 11) {
                    N0(hVar);
                    return 0L;
                }
                if (iQ == 6) {
                    strK = jVar.C0();
                } else {
                    if (iQ == 7) {
                        return jVar.u0();
                    }
                    if (iQ == 8) {
                        r6.b bVarC = C(jVar, hVar, cls);
                        if (bVarC == r6.b.AsNull || bVarC == r6.b.AsEmpty) {
                            return 0L;
                        }
                        return jVar.J0();
                    }
                }
            } else if (hVar.D0(p6.i.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                if (jVar.X0() == e6.m.START_ARRAY) {
                    return ((Long) a1(jVar, hVar)).longValue();
                }
                long jG0 = G0(jVar, hVar);
                M0(jVar, hVar);
                return jG0;
            }
            return ((Number) hVar.s0(cls, jVar)).longValue();
        }
        strK = hVar.K(jVar, this, cls);
        r6.b bVarH = H(hVar, strK, h7.c.Integer, cls);
        if (bVarH == r6.b.AsNull) {
            N0(hVar);
            return 0L;
        }
        if (bVarH == r6.b.AsEmpty) {
            return 0L;
        }
        String strTrim = strK.trim();
        if (!e0(strTrim)) {
            return H0(hVar, strTrim);
        }
        O0(hVar, strTrim);
        return 0L;
    }

    protected r6.b H(p6.h hVar, String str, h7.c cVar, Class cls) throws v6.f {
        if (str.isEmpty()) {
            return x(hVar, hVar.N(cVar, cls, r6.e.EmptyString), cls, str, "empty String (\"\")");
        }
        if (g0(str)) {
            return x(hVar, hVar.O(cVar, cls, r6.b.Fail), cls, str, "blank String (all whitespace)");
        }
        if (hVar.C0(e6.q.UNTYPED_SCALARS)) {
            return r6.b.TryConvert;
        }
        r6.b bVarN = hVar.N(cVar, cls, r6.e.String);
        if (bVarN == r6.b.Fail) {
            hVar.S0(this, "Cannot coerce String value (\"%s\") to %s (but might if coercion using `CoercionConfig` was enabled)", str, S());
        }
        return bVarN;
    }

    protected final long H0(p6.h hVar, String str) {
        try {
            return i6.i.m(str);
        } catch (IllegalArgumentException unused) {
            return o0((Number) hVar.z0(Long.TYPE, str, "not a valid `long` value", new Object[0])).longValue();
        }
    }

    protected final short I0(e6.j jVar, p6.h hVar) throws p6.m {
        String strK;
        int iQ = jVar.q();
        Class cls = Short.TYPE;
        if (iQ != 1) {
            if (iQ != 3) {
                if (iQ == 11) {
                    N0(hVar);
                    return (short) 0;
                }
                if (iQ == 6) {
                    strK = jVar.C0();
                } else {
                    if (iQ == 7) {
                        return jVar.B0();
                    }
                    if (iQ == 8) {
                        r6.b bVarC = C(jVar, hVar, cls);
                        if (bVarC == r6.b.AsNull || bVarC == r6.b.AsEmpty) {
                            return (short) 0;
                        }
                        return jVar.B0();
                    }
                }
            } else if (hVar.D0(p6.i.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                if (jVar.X0() == e6.m.START_ARRAY) {
                    return ((Short) a1(jVar, hVar)).shortValue();
                }
                short sI0 = I0(jVar, hVar);
                M0(jVar, hVar);
                return sI0;
            }
            return ((Short) hVar.q0(hVar.G(cls), jVar)).shortValue();
        }
        strK = hVar.K(jVar, this, cls);
        r6.b bVarH = H(hVar, strK, h7.c.Integer, cls);
        if (bVarH == r6.b.AsNull) {
            N0(hVar);
            return (short) 0;
        }
        if (bVarH == r6.b.AsEmpty) {
            return (short) 0;
        }
        String strTrim = strK.trim();
        if (e0(strTrim)) {
            O0(hVar, strTrim);
            return (short) 0;
        }
        try {
            int iK = i6.i.k(strTrim);
            return L0(iK) ? ((Short) hVar.z0(cls, strTrim, "overflow, value cannot be represented as 16-bit value", new Object[0])).shortValue() : (short) iK;
        } catch (IllegalArgumentException unused) {
            return ((Short) hVar.z0(cls, strTrim, "not a valid `short` value", new Object[0])).shortValue();
        }
    }

    protected final String J0(e6.j jVar, p6.h hVar, s6.r rVar) {
        String strK0;
        r6.b bVarL = r6.b.TryConvert;
        int iQ = jVar.q();
        if (iQ == 1) {
            return hVar.K(jVar, this, this.f28200a);
        }
        if (iQ == 12) {
            Object objH0 = jVar.h0();
            if (objH0 instanceof byte[]) {
                return hVar.b0().i((byte[]) objH0, false);
            }
            if (objH0 == null) {
                return null;
            }
            return objH0.toString();
        }
        switch (iQ) {
            case 6:
                return jVar.C0();
            case 7:
                bVarL = L(jVar, hVar, String.class);
                break;
            case 8:
                bVarL = D(jVar, hVar, String.class);
                break;
            case 9:
            case 10:
                bVarL = w(jVar, hVar, String.class);
                break;
        }
        return bVarL == r6.b.AsNull ? (String) rVar.a(hVar) : bVarL == r6.b.AsEmpty ? "" : (!jVar.n().g() || (strK0 = jVar.K0()) == null) ? (String) hVar.q0(Y0(hVar), jVar) : strK0;
    }

    protected r6.b K(e6.j jVar, p6.h hVar, Class cls) {
        r6.b bVarN = hVar.N(h7.c.Float, cls, r6.e.Integer);
        if (bVarN != r6.b.Fail) {
            return bVarN;
        }
        return x(hVar, bVarN, cls, jVar.w0(), "Integer value (" + jVar.C0() + ")");
    }

    protected void K0(p6.h hVar, boolean z10, Enum r72, String str) throws v6.f {
        hVar.S0(this, "Cannot coerce %s to Null value as %s (%s `%s.%s` to allow)", str, S(), z10 ? "enable" : "disable", r72.getDeclaringClass().getSimpleName(), r72.name());
    }

    protected r6.b L(e6.j jVar, p6.h hVar, Class cls) {
        return O(jVar, hVar, cls, jVar.w0(), r6.e.Integer);
    }

    protected final boolean L0(int i10) {
        return i10 < -32768 || i10 > 32767;
    }

    protected void M0(e6.j jVar, p6.h hVar) throws p6.m {
        if (jVar.X0() != e6.m.END_ARRAY) {
            Z0(jVar, hVar);
        }
    }

    protected boolean N(p6.h hVar, String str) throws v6.f {
        if (!e0(str)) {
            return false;
        }
        p6.r rVar = p6.r.ALLOW_COERCION_OF_SCALARS;
        if (!hVar.E0(rVar)) {
            K0(hVar, true, rVar, "String \"null\"");
        }
        return true;
    }

    protected final void N0(p6.h hVar) throws v6.f {
        if (hVar.D0(p6.i.FAIL_ON_NULL_FOR_PRIMITIVES)) {
            hVar.S0(this, "Cannot coerce `null` to %s (disable `DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES` to allow)", S());
        }
    }

    protected r6.b O(e6.j jVar, p6.h hVar, Class cls, Object obj, r6.e eVar) {
        r6.b bVarN = hVar.N(h7.c.Textual, cls, eVar);
        if (bVarN != r6.b.Fail) {
            return bVarN;
        }
        return x(hVar, bVarN, cls, obj, eVar.name() + " value (" + jVar.C0() + ")");
    }

    protected final void O0(p6.h hVar, String str) throws v6.f {
        boolean z10;
        p6.i iVar;
        p6.r rVar = p6.r.ALLOW_COERCION_OF_SCALARS;
        if (hVar.E0(rVar)) {
            p6.i iVar2 = p6.i.FAIL_ON_NULL_FOR_PRIMITIVES;
            if (!hVar.D0(iVar2)) {
                return;
            }
            z10 = false;
            iVar = iVar2;
        } else {
            z10 = true;
            iVar = rVar;
        }
        K0(hVar, z10, iVar, str.isEmpty() ? "empty String (\"\")" : String.format("String \"%s\"", str));
    }

    protected s6.r P0(p6.h hVar, p6.d dVar, p6.l lVar) {
        d6.j0 j0VarQ0 = Q0(hVar, dVar);
        if (j0VarQ0 == d6.j0.SKIP) {
            return t6.q.f();
        }
        if (j0VarQ0 != d6.j0.FAIL) {
            s6.r rVarD0 = d0(hVar, dVar, j0VarQ0, lVar);
            return rVarD0 != null ? rVarD0 : lVar;
        }
        if (dVar != null) {
            return t6.r.d(dVar, dVar.getType().k());
        }
        JavaType javaTypeG = hVar.G(lVar.p());
        if (javaTypeG.L()) {
            javaTypeG = javaTypeG.k();
        }
        return t6.r.e(javaTypeG);
    }

    protected Boolean Q(e6.j jVar, p6.h hVar, Class cls) throws v6.c {
        r6.b bVarN = hVar.N(h7.c.Boolean, cls, r6.e.Integer);
        int i10 = a.f28202a[bVarN.ordinal()];
        if (i10 == 1) {
            return Boolean.FALSE;
        }
        if (i10 == 2) {
            return null;
        }
        if (i10 != 4) {
            if (jVar.v0() == j.b.INT) {
                return Boolean.valueOf(jVar.t0() != 0);
            }
            return Boolean.valueOf(!"0".equals(jVar.C0()));
        }
        x(hVar, bVarN, cls, jVar.w0(), "Integer value (" + jVar.C0() + ")");
        return Boolean.FALSE;
    }

    protected d6.j0 Q0(p6.h hVar, p6.d dVar) {
        return dVar != null ? dVar.d().b() : hVar.k().s().e();
    }

    protected Object R(e6.j jVar, p6.h hVar) {
        return hVar.D0(p6.i.USE_BIG_INTEGER_FOR_INTS) ? jVar.r() : hVar.D0(p6.i.USE_LONG_FOR_INTS) ? Long.valueOf(jVar.u0()) : jVar.w0();
    }

    protected p6.l R0(p6.h hVar, p6.d dVar, p6.l lVar) {
        x6.k kVarH;
        Object objK;
        p6.b bVarZ = hVar.Z();
        if (!n0(bVarZ, dVar) || (kVarH = dVar.h()) == null || (objK = bVarZ.k(kVarH)) == null) {
            return lVar;
        }
        i7.j jVarJ = hVar.j(dVar.h(), objK);
        JavaType javaTypeA = jVarJ.a(hVar.l());
        if (lVar == null) {
            lVar = hVar.Q(javaTypeA, dVar);
        }
        return new b0(jVarJ, javaTypeA, lVar);
    }

    protected String S() {
        boolean zK;
        String strY;
        JavaType javaTypeX0 = X0();
        if (javaTypeX0 == null || javaTypeX0.W()) {
            Class clsP = p();
            zK = i7.h.K(clsP);
            strY = i7.h.y(clsP);
        } else {
            zK = javaTypeX0.L() || javaTypeX0.b();
            strY = i7.h.G(javaTypeX0);
        }
        if (zK) {
            return "element of " + strY;
        }
        return strY + " value";
    }

    protected p6.l S0(p6.h hVar, JavaType javaType, p6.d dVar) {
        return hVar.Q(javaType, dVar);
    }

    protected String T(Class cls) {
        String strY = i7.h.y(cls);
        if (i7.h.K(cls)) {
            return "element of " + strY;
        }
        return strY + " value";
    }

    protected Boolean T0(p6.h hVar, p6.d dVar, Class cls, k.a aVar) {
        k.d dVarU0 = U0(hVar, dVar, cls);
        if (dVarU0 != null) {
            return dVarU0.e(aVar);
        }
        return null;
    }

    protected k.d U0(p6.h hVar, p6.d dVar, Class cls) {
        return dVar != null ? dVar.f(hVar.k(), cls) : hVar.e0(cls);
    }

    protected final s6.r V0(p6.h hVar, s6.u uVar, p6.x xVar) {
        if (uVar != null) {
            return d0(hVar, uVar, xVar.e(), uVar.x());
        }
        return null;
    }

    protected Object W(e6.j jVar, p6.h hVar) throws p6.m {
        r6.b bVarB0 = b0(hVar);
        boolean zD0 = hVar.D0(p6.i.UNWRAP_SINGLE_VALUE_ARRAYS);
        if (zD0 || bVarB0 != r6.b.Fail) {
            e6.m mVarX0 = jVar.X0();
            e6.m mVar = e6.m.END_ARRAY;
            if (mVarX0 == mVar) {
                int i10 = a.f28202a[bVarB0.ordinal()];
                if (i10 == 1) {
                    return k(hVar);
                }
                if (i10 == 2 || i10 == 3) {
                    return a(hVar);
                }
            } else if (zD0) {
                Object objZ = Z(jVar, hVar);
                if (jVar.X0() != mVar) {
                    Z0(jVar, hVar);
                }
                return objZ;
            }
        }
        return hVar.r0(Y0(hVar), e6.m.START_ARRAY, jVar, null, new Object[0]);
    }

    public s6.w W0() {
        return null;
    }

    protected Object X(e6.j jVar, p6.h hVar, r6.b bVar, Class cls, String str) throws v6.c {
        int i10 = a.f28202a[bVar.ordinal()];
        if (i10 == 1) {
            return k(hVar);
        }
        if (i10 != 4) {
            return null;
        }
        x(hVar, bVar, cls, "", "empty String (\"\")");
        return null;
    }

    public JavaType X0() {
        return this.f28201b;
    }

    protected Object Y(e6.j jVar, p6.h hVar) {
        s6.w wVarW0 = W0();
        Class clsP = p();
        String strK0 = jVar.K0();
        if (wVarW0 != null && wVarW0.h()) {
            return wVarW0.x(hVar, strK0);
        }
        if (strK0.isEmpty()) {
            return X(jVar, hVar, hVar.N(r(), clsP, r6.e.EmptyString), clsP, "empty String (\"\")");
        }
        if (g0(strK0)) {
            return X(jVar, hVar, hVar.O(r(), clsP, r6.b.Fail), clsP, "blank String (all whitespace)");
        }
        if (wVarW0 != null) {
            strK0 = strK0.trim();
            if (wVarW0.e() && hVar.N(h7.c.Integer, Integer.class, r6.e.String) == r6.b.TryConvert) {
                return wVarW0.s(hVar, B0(hVar, strK0));
            }
            if (wVarW0.f() && hVar.N(h7.c.Integer, Long.class, r6.e.String) == r6.b.TryConvert) {
                return wVarW0.t(hVar, H0(hVar, strK0));
            }
            if (wVarW0.c() && hVar.N(h7.c.Boolean, Boolean.class, r6.e.String) == r6.b.TryConvert) {
                String strTrim = strK0.trim();
                if ("true".equals(strTrim)) {
                    return wVarW0.q(hVar, true);
                }
                if ("false".equals(strTrim)) {
                    return wVarW0.q(hVar, false);
                }
            }
        }
        return hVar.m0(clsP, wVarW0, hVar.i0(), "no String-argument constructor/factory method to deserialize from String value ('%s')", strK0);
    }

    public JavaType Y0(p6.h hVar) {
        JavaType javaType = this.f28201b;
        return javaType != null ? javaType : hVar.G(this.f28200a);
    }

    protected Object Z(e6.j jVar, p6.h hVar) {
        return jVar.N0(e6.m.START_ARRAY) ? a1(jVar, hVar) : e(jVar, hVar);
    }

    protected void Z0(e6.j jVar, p6.h hVar) throws p6.m {
        hVar.Z0(this, e6.m.END_ARRAY, "Attempted to unwrap '%s' value from an array (with `DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS`) but it contains more than one value", p().getName());
    }

    protected r6.b a0(p6.h hVar) {
        return hVar.O(r(), p(), r6.b.Fail);
    }

    protected Object a1(e6.j jVar, p6.h hVar) {
        return hVar.r0(Y0(hVar), jVar.n(), jVar, String.format("Cannot deserialize instance of %s out of %s token: nested Arrays not allowed with %s", i7.h.Y(this.f28200a), e6.m.START_ARRAY, "DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS"), new Object[0]);
    }

    protected r6.b b0(p6.h hVar) {
        return hVar.N(r(), p(), r6.e.EmptyArray);
    }

    protected void b1(e6.j jVar, p6.h hVar, Object obj, String str) {
        if (obj == null) {
            obj = p();
        }
        if (hVar.u0(jVar, this, obj, str)) {
            return;
        }
        jVar.f1();
    }

    protected r6.b c0(p6.h hVar) {
        return hVar.N(r(), p(), r6.e.EmptyString);
    }

    protected boolean c1(p6.l lVar) {
        return i7.h.P(lVar);
    }

    protected final s6.r d0(p6.h hVar, p6.d dVar, d6.j0 j0Var, p6.l lVar) {
        if (j0Var == d6.j0.FAIL) {
            if (dVar == null) {
                return t6.r.e(hVar.G(lVar == null ? Object.class : lVar.p()));
            }
            return t6.r.c(dVar);
        }
        if (j0Var != d6.j0.AS_EMPTY) {
            if (j0Var == d6.j0.SKIP) {
                return t6.q.f();
            }
            return null;
        }
        if (lVar == null) {
            return null;
        }
        if (lVar instanceof s6.d) {
            s6.d dVar2 = (s6.d) lVar;
            if (!dVar2.W0().j()) {
                JavaType javaTypeX0 = dVar == null ? dVar2.X0() : dVar.getType();
                return (s6.r) hVar.q(javaTypeX0, String.format("Cannot create empty instance of %s, no default Creator", javaTypeX0));
            }
        }
        i7.a aVarJ = lVar.j();
        return aVarJ == i7.a.ALWAYS_NULL ? t6.q.e() : aVarJ == i7.a.CONSTANT ? t6.q.c(lVar.k(hVar)) : new t6.p(lVar);
    }

    protected boolean d1(p6.q qVar) {
        return i7.h.P(qVar);
    }

    protected boolean e0(String str) {
        return "null".equals(str);
    }

    protected final boolean f0(long j10) {
        return j10 < -2147483648L || j10 > 2147483647L;
    }

    @Override // p6.l
    public Object g(e6.j jVar, p6.h hVar, a7.e eVar) {
        return eVar.c(jVar, hVar);
    }

    protected boolean h0(String str) {
        char cCharAt = str.charAt(0);
        if (cCharAt == 'f') {
            return "false".equals(str);
        }
        if (cCharAt == 'F') {
            return "FALSE".equals(str) || "False".equals(str);
        }
        return false;
    }

    protected final boolean i0(String str) {
        int i10;
        int length = str.length();
        if (length <= 0) {
            return false;
        }
        char cCharAt = str.charAt(0);
        if (cCharAt != '-' && cCharAt != '+') {
            i10 = 0;
        } else {
            if (length == 1) {
                return false;
            }
            i10 = 1;
        }
        while (i10 < length) {
            char cCharAt2 = str.charAt(i10);
            if (cCharAt2 > '9' || cCharAt2 < '0') {
                return false;
            }
            i10++;
        }
        return true;
    }

    protected final boolean j0(String str) {
        return "NaN".equals(str);
    }

    protected final boolean k0(String str) {
        return "-Infinity".equals(str) || "-INF".equals(str);
    }

    protected final boolean l0(String str) {
        return "Infinity".equals(str) || "INF".equals(str);
    }

    protected boolean m0(String str) {
        char cCharAt = str.charAt(0);
        if (cCharAt == 't') {
            return "true".equals(str);
        }
        if (cCharAt == 'T') {
            return "TRUE".equals(str) || "True".equals(str);
        }
        return false;
    }

    protected Number o0(Number number) {
        if (number == null) {
            return 0;
        }
        return number;
    }

    @Override // p6.l
    public Class p() {
        return this.f28200a;
    }

    protected final Boolean p0(e6.j jVar, p6.h hVar, Class cls) throws v6.f {
        String strK;
        int iQ = jVar.q();
        if (iQ == 1) {
            strK = hVar.K(jVar, this, cls);
        } else {
            if (iQ == 3) {
                return (Boolean) W(jVar, hVar);
            }
            if (iQ != 6) {
                if (iQ == 7) {
                    return Q(jVar, hVar, cls);
                }
                switch (iQ) {
                    case 9:
                        return Boolean.TRUE;
                    case 10:
                        return Boolean.FALSE;
                    case 11:
                        return null;
                    default:
                        return (Boolean) hVar.s0(cls, jVar);
                }
            }
            strK = jVar.C0();
        }
        r6.b bVarH = H(hVar, strK, h7.c.Boolean, cls);
        if (bVarH == r6.b.AsNull) {
            return null;
        }
        if (bVarH == r6.b.AsEmpty) {
            return Boolean.FALSE;
        }
        String strTrim = strK.trim();
        int length = strTrim.length();
        if (length == 4) {
            if (m0(strTrim)) {
                return Boolean.TRUE;
            }
        } else if (length == 5 && h0(strTrim)) {
            return Boolean.FALSE;
        }
        if (N(hVar, strTrim)) {
            return null;
        }
        return (Boolean) hVar.z0(cls, strTrim, "only \"true\" or \"false\" recognized", new Object[0]);
    }

    protected final boolean q0(e6.j jVar, p6.h hVar) throws p6.m {
        String strK;
        int iQ = jVar.q();
        Class cls = Boolean.TYPE;
        if (iQ != 1) {
            if (iQ != 3) {
                if (iQ == 6) {
                    strK = jVar.C0();
                } else {
                    if (iQ == 7) {
                        return Boolean.TRUE.equals(Q(jVar, hVar, cls));
                    }
                    switch (iQ) {
                        case 9:
                            return true;
                        case 11:
                            N0(hVar);
                        case 10:
                            return false;
                    }
                }
            } else if (hVar.D0(p6.i.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                if (jVar.X0() == e6.m.START_ARRAY) {
                    return ((Boolean) a1(jVar, hVar)).booleanValue();
                }
                boolean zQ0 = q0(jVar, hVar);
                M0(jVar, hVar);
                return zQ0;
            }
            return ((Boolean) hVar.s0(cls, jVar)).booleanValue();
        }
        strK = hVar.K(jVar, this, cls);
        r6.b bVarH = H(hVar, strK, h7.c.Boolean, cls);
        if (bVarH == r6.b.AsNull) {
            N0(hVar);
            return false;
        }
        if (bVarH == r6.b.AsEmpty) {
            return false;
        }
        String strTrim = strK.trim();
        int length = strTrim.length();
        if (length == 4) {
            if (m0(strTrim)) {
                return true;
            }
        } else if (length == 5 && h0(strTrim)) {
            return false;
        }
        if (e0(strTrim)) {
            O0(hVar, strTrim);
            return false;
        }
        return Boolean.TRUE.equals((Boolean) hVar.z0(cls, strTrim, "only \"true\"/\"True\"/\"TRUE\" or \"false\"/\"False\"/\"FALSE\" recognized", new Object[0]));
    }

    protected final byte r0(e6.j jVar, p6.h hVar) throws p6.m {
        String strK;
        int iQ = jVar.q();
        Class cls = Byte.TYPE;
        if (iQ != 1) {
            if (iQ != 3) {
                if (iQ == 11) {
                    N0(hVar);
                    return (byte) 0;
                }
                if (iQ == 6) {
                    strK = jVar.C0();
                } else {
                    if (iQ == 7) {
                        return jVar.x();
                    }
                    if (iQ == 8) {
                        r6.b bVarC = C(jVar, hVar, cls);
                        if (bVarC == r6.b.AsNull || bVarC == r6.b.AsEmpty) {
                            return (byte) 0;
                        }
                        return jVar.x();
                    }
                }
            } else if (hVar.D0(p6.i.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                if (jVar.X0() == e6.m.START_ARRAY) {
                    return ((Byte) a1(jVar, hVar)).byteValue();
                }
                byte bR0 = r0(jVar, hVar);
                M0(jVar, hVar);
                return bR0;
            }
            return ((Byte) hVar.q0(hVar.G(cls), jVar)).byteValue();
        }
        strK = hVar.K(jVar, this, cls);
        r6.b bVarH = H(hVar, strK, h7.c.Integer, cls);
        if (bVarH == r6.b.AsNull) {
            N0(hVar);
            return (byte) 0;
        }
        if (bVarH == r6.b.AsEmpty) {
            return (byte) 0;
        }
        String strTrim = strK.trim();
        if (e0(strTrim)) {
            O0(hVar, strTrim);
            return (byte) 0;
        }
        try {
            int iK = i6.i.k(strTrim);
            return v(iK) ? ((Byte) hVar.z0(this.f28200a, strTrim, "overflow, value cannot be represented as 8-bit value", new Object[0])).byteValue() : (byte) iK;
        } catch (IllegalArgumentException unused) {
            return ((Byte) hVar.z0(this.f28200a, strTrim, "not a valid `byte` value", new Object[0])).byteValue();
        }
    }

    protected Date s0(e6.j jVar, p6.h hVar) {
        String strK;
        long jLongValue;
        int iQ = jVar.q();
        if (iQ == 1) {
            strK = hVar.K(jVar, this, this.f28200a);
        } else {
            if (iQ == 3) {
                return u0(jVar, hVar);
            }
            if (iQ == 11) {
                return (Date) a(hVar);
            }
            if (iQ != 6) {
                if (iQ != 7) {
                    return (Date) hVar.s0(this.f28200a, jVar);
                }
                try {
                    jLongValue = jVar.u0();
                } catch (g6.c unused) {
                    jLongValue = ((Number) hVar.y0(this.f28200a, jVar.w0(), "not a valid 64-bit `long` for creating `java.util.Date`", new Object[0])).longValue();
                }
                return new Date(jLongValue);
            }
            strK = jVar.C0();
        }
        return t0(strK.trim(), hVar);
    }

    protected Date t0(String str, p6.h hVar) {
        try {
            if (str.isEmpty()) {
                if (a.f28202a[G(hVar, str).ordinal()] != 1) {
                    return null;
                }
                return new Date(0L);
            }
            if (e0(str)) {
                return null;
            }
            return hVar.J0(str);
        } catch (IllegalArgumentException e10) {
            return (Date) hVar.z0(this.f28200a, str, "not a valid representation (error: %s)", i7.h.o(e10));
        }
    }

    protected Date u0(e6.j jVar, p6.h hVar) throws p6.m {
        r6.b bVarB0 = b0(hVar);
        boolean zD0 = hVar.D0(p6.i.UNWRAP_SINGLE_VALUE_ARRAYS);
        if (zD0 || bVarB0 != r6.b.Fail) {
            e6.m mVarX0 = jVar.X0();
            if (mVarX0 == e6.m.END_ARRAY) {
                int i10 = a.f28202a[bVarB0.ordinal()];
                if (i10 == 1) {
                    return (Date) k(hVar);
                }
                if (i10 == 2 || i10 == 3) {
                    return (Date) a(hVar);
                }
            } else if (zD0) {
                if (mVarX0 == e6.m.START_ARRAY) {
                    return (Date) a1(jVar, hVar);
                }
                Date dateS0 = s0(jVar, hVar);
                M0(jVar, hVar);
                return dateS0;
            }
        }
        return (Date) hVar.t0(this.f28200a, e6.m.START_ARRAY, jVar, null, new Object[0]);
    }

    protected final boolean v(int i10) {
        return i10 < -128 || i10 > 255;
    }

    protected r6.b w(e6.j jVar, p6.h hVar, Class cls) {
        return O(jVar, hVar, cls, Boolean.valueOf(jVar.w()), r6.e.Boolean);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001a, code lost:
    
        if (r0 != 8) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final double w0(e6.j r6, p6.h r7) throws p6.m {
        /*
            r5 = this;
            int r0 = r6.q()
            r1 = 1
            java.lang.Class r2 = java.lang.Double.TYPE
            r3 = 0
            if (r0 == r1) goto L67
            r1 = 3
            if (r0 == r1) goto L39
            r1 = 11
            if (r0 == r1) goto L35
            r1 = 6
            if (r0 == r1) goto L30
            r1 = 7
            if (r0 == r1) goto L1d
            r1 = 8
            if (r0 == r1) goto L2b
            goto L5c
        L1d:
            r6.b r7 = r5.K(r6, r7, r2)
            r6.b r0 = r6.b.AsNull
            if (r7 != r0) goto L26
            return r3
        L26:
            r6.b r0 = r6.b.AsEmpty
            if (r7 != r0) goto L2b
            return r3
        L2b:
            double r6 = r6.X()
            return r6
        L30:
            java.lang.String r0 = r6.C0()
            goto L6b
        L35:
            r5.N0(r7)
            return r3
        L39:
            p6.i r0 = p6.i.UNWRAP_SINGLE_VALUE_ARRAYS
            boolean r0 = r7.D0(r0)
            if (r0 == 0) goto L5c
            e6.m r0 = r6.X0()
            e6.m r1 = e6.m.START_ARRAY
            if (r0 != r1) goto L54
            java.lang.Object r6 = r5.a1(r6, r7)
            java.lang.Double r6 = (java.lang.Double) r6
            double r6 = r6.doubleValue()
            return r6
        L54:
            double r0 = r5.w0(r6, r7)
            r5.M0(r6, r7)
            return r0
        L5c:
            java.lang.Object r6 = r7.s0(r2, r6)
            java.lang.Number r6 = (java.lang.Number) r6
            double r6 = r6.doubleValue()
            return r6
        L67:
            java.lang.String r0 = r7.K(r6, r5, r2)
        L6b:
            java.lang.Double r1 = r5.z(r0)
            if (r1 == 0) goto L76
            double r6 = r1.doubleValue()
            return r6
        L76:
            h7.c r1 = h7.c.Integer
            r6.b r1 = r5.H(r7, r0, r1, r2)
            r6.b r2 = r6.b.AsNull
            if (r1 != r2) goto L84
            r5.N0(r7)
            return r3
        L84:
            r6.b r2 = r6.b.AsEmpty
            if (r1 != r2) goto L89
            return r3
        L89:
            java.lang.String r0 = r0.trim()
            boolean r1 = r5.e0(r0)
            if (r1 == 0) goto L97
            r5.O0(r7, r0)
            return r3
        L97:
            double r6 = r5.x0(r6, r7, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: u6.c0.w0(e6.j, p6.h):double");
    }

    protected r6.b x(p6.h hVar, r6.b bVar, Class cls, Object obj, String str) throws v6.c {
        if (bVar == r6.b.Fail) {
            hVar.M0(this, cls, obj, "Cannot coerce %s to %s (but could if coercion was enabled using `CoercionConfig`)", str, T(cls));
        }
        return bVar;
    }

    protected final double x0(e6.j jVar, p6.h hVar, String str) {
        try {
            return v0(str, jVar.Q0(e6.s.USE_FAST_DOUBLE_PARSER));
        } catch (IllegalArgumentException unused) {
            return o0((Number) hVar.z0(Double.TYPE, str, "not a valid `double` value (as String to convert)", new Object[0])).doubleValue();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0019, code lost:
    
        if (r0 != 8) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final float y0(e6.j r5, p6.h r6) throws p6.m {
        /*
            r4 = this;
            int r0 = r5.q()
            r1 = 1
            java.lang.Class r2 = java.lang.Float.TYPE
            r3 = 0
            if (r0 == r1) goto L66
            r1 = 3
            if (r0 == r1) goto L38
            r1 = 11
            if (r0 == r1) goto L34
            r1 = 6
            if (r0 == r1) goto L2f
            r1 = 7
            if (r0 == r1) goto L1c
            r1 = 8
            if (r0 == r1) goto L2a
            goto L5b
        L1c:
            r6.b r6 = r4.K(r5, r6, r2)
            r6.b r0 = r6.b.AsNull
            if (r6 != r0) goto L25
            return r3
        L25:
            r6.b r0 = r6.b.AsEmpty
            if (r6 != r0) goto L2a
            return r3
        L2a:
            float r5 = r5.p0()
            return r5
        L2f:
            java.lang.String r0 = r5.C0()
            goto L6a
        L34:
            r4.N0(r6)
            return r3
        L38:
            p6.i r0 = p6.i.UNWRAP_SINGLE_VALUE_ARRAYS
            boolean r0 = r6.D0(r0)
            if (r0 == 0) goto L5b
            e6.m r0 = r5.X0()
            e6.m r1 = e6.m.START_ARRAY
            if (r0 != r1) goto L53
            java.lang.Object r5 = r4.a1(r5, r6)
            java.lang.Float r5 = (java.lang.Float) r5
            float r5 = r5.floatValue()
            return r5
        L53:
            float r0 = r4.y0(r5, r6)
            r4.M0(r5, r6)
            return r0
        L5b:
            java.lang.Object r5 = r6.s0(r2, r5)
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            return r5
        L66:
            java.lang.String r0 = r6.K(r5, r4, r2)
        L6a:
            java.lang.Float r1 = r4.A(r0)
            if (r1 == 0) goto L75
            float r5 = r1.floatValue()
            return r5
        L75:
            h7.c r1 = h7.c.Integer
            r6.b r1 = r4.H(r6, r0, r1, r2)
            r6.b r2 = r6.b.AsNull
            if (r1 != r2) goto L83
            r4.N0(r6)
            return r3
        L83:
            r6.b r2 = r6.b.AsEmpty
            if (r1 != r2) goto L88
            return r3
        L88:
            java.lang.String r0 = r0.trim()
            boolean r1 = r4.e0(r0)
            if (r1 == 0) goto L96
            r4.O0(r6, r0)
            return r3
        L96:
            float r5 = r4.z0(r5, r6, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: u6.c0.y0(e6.j, p6.h):float");
    }

    protected Double z(String str) {
        if (str.isEmpty()) {
            return null;
        }
        char cCharAt = str.charAt(0);
        if (cCharAt == '-') {
            if (k0(str)) {
                return Double.valueOf(Double.NEGATIVE_INFINITY);
            }
            return null;
        }
        if (cCharAt == 'I') {
            if (l0(str)) {
                return Double.valueOf(Double.POSITIVE_INFINITY);
            }
            return null;
        }
        if (cCharAt == 'N' && j0(str)) {
            return Double.valueOf(Double.NaN);
        }
        return null;
    }

    protected final float z0(e6.j jVar, p6.h hVar, String str) {
        try {
            return i6.i.j(str, jVar.Q0(e6.s.USE_FAST_DOUBLE_PARSER));
        } catch (IllegalArgumentException unused) {
            return o0((Number) hVar.z0(Float.TYPE, str, "not a valid `float` value", new Object[0])).floatValue();
        }
    }

    protected c0(JavaType javaType) {
        this.f28200a = javaType == null ? Object.class : javaType.r();
        this.f28201b = javaType;
    }

    protected c0(c0 c0Var) {
        this.f28200a = c0Var.f28200a;
        this.f28201b = c0Var.f28201b;
    }
}
