package u6;

import com.fasterxml.jackson.databind.JavaType;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public class h0 extends s6.w implements Serializable {
    protected x6.p A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final String f28224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final Class f28225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected x6.p f28226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected x6.p f28227d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected s6.u[] f28228e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected JavaType f28229f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected x6.p f28230g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected s6.u[] f28231h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected JavaType f28232r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected x6.p f28233s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected s6.u[] f28234t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected x6.p f28235u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected x6.p f28236v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected x6.p f28237w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected x6.p f28238x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    protected x6.p f28239y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected x6.p f28240z;

    public h0(p6.g gVar, JavaType javaType) {
        this.f28224a = javaType == null ? "UNKNOWN TYPE" : javaType.toString();
        this.f28225b = javaType == null ? Object.class : javaType.r();
    }

    private Object R(x6.p pVar, s6.u[] uVarArr, p6.h hVar, Object obj) throws p6.m {
        if (pVar == null) {
            throw new IllegalStateException("No delegate constructor for " + d0());
        }
        try {
            if (uVarArr == null) {
                return pVar.t(obj);
            }
            int length = uVarArr.length;
            Object[] objArr = new Object[length];
            for (int i10 = 0; i10 < length; i10++) {
                s6.u uVar = uVarArr[i10];
                if (uVar == null) {
                    objArr[i10] = obj;
                } else {
                    objArr[i10] = hVar.R(uVar.s(), uVar, null);
                }
            }
            return pVar.s(objArr);
        } catch (Exception e10) {
            throw e0(hVar, e10);
        }
    }

    static Double f0(BigDecimal bigDecimal) {
        double dDoubleValue = bigDecimal.doubleValue();
        if (Double.isInfinite(dDoubleValue)) {
            return null;
        }
        return Double.valueOf(dDoubleValue);
    }

    @Override // s6.w
    public Object A(p6.h hVar) {
        x6.p pVar = this.f28226c;
        if (pVar == null) {
            return super.A(hVar);
        }
        try {
            return pVar.r();
        } catch (Exception e10) {
            return hVar.l0(this.f28225b, null, e0(hVar, e10));
        }
    }

    @Override // s6.w
    public Object C(p6.h hVar) {
        return this.f28226c != null ? A(hVar) : this.f28227d != null ? v(hVar, new Object[this.f28228e.length]) : super.C(hVar);
    }

    @Override // s6.w
    public Object D(p6.h hVar, Object obj) {
        x6.p pVar;
        x6.p pVar2 = this.f28230g;
        return (pVar2 != null || (pVar = this.f28233s) == null) ? R(pVar2, this.f28231h, hVar, obj) : R(pVar, this.f28234t, hVar, obj);
    }

    @Override // s6.w
    public x6.p G() {
        return this.f28233s;
    }

    @Override // s6.w
    public JavaType H(p6.g gVar) {
        return this.f28232r;
    }

    @Override // s6.w
    public x6.p K() {
        return this.f28226c;
    }

    @Override // s6.w
    public x6.p L() {
        return this.f28230g;
    }

    @Override // s6.w
    public JavaType N(p6.g gVar) {
        return this.f28229f;
    }

    @Override // s6.w
    public s6.u[] O(p6.g gVar) {
        return this.f28228e;
    }

    @Override // s6.w
    public Class Q() {
        return this.f28225b;
    }

    public void S(x6.p pVar, JavaType javaType, s6.u[] uVarArr) {
        this.f28233s = pVar;
        this.f28232r = javaType;
        this.f28234t = uVarArr;
    }

    public void T(x6.p pVar) {
        this.f28240z = pVar;
    }

    public void W(x6.p pVar) {
        this.f28238x = pVar;
    }

    public void X(x6.p pVar) {
        this.A = pVar;
    }

    public void Y(x6.p pVar) {
        this.f28239y = pVar;
    }

    public void Z(x6.p pVar) {
        this.f28236v = pVar;
    }

    @Override // s6.w
    public boolean a() {
        return this.f28240z != null;
    }

    public void a0(x6.p pVar) {
        this.f28237w = pVar;
    }

    @Override // s6.w
    public boolean b() {
        return this.f28238x != null;
    }

    public void b0(x6.p pVar, x6.p pVar2, JavaType javaType, s6.u[] uVarArr, x6.p pVar3, s6.u[] uVarArr2) {
        this.f28226c = pVar;
        this.f28230g = pVar2;
        this.f28229f = javaType;
        this.f28231h = uVarArr;
        this.f28227d = pVar3;
        this.f28228e = uVarArr2;
    }

    @Override // s6.w
    public boolean c() {
        return this.A != null;
    }

    public void c0(x6.p pVar) {
        this.f28235u = pVar;
    }

    @Override // s6.w
    public boolean d() {
        return this.f28239y != null;
    }

    public String d0() {
        return this.f28224a;
    }

    @Override // s6.w
    public boolean e() {
        return this.f28236v != null;
    }

    protected p6.m e0(p6.h hVar, Throwable th2) {
        Throwable cause;
        if (((th2 instanceof ExceptionInInitializerError) || (th2 instanceof InvocationTargetException)) && (cause = th2.getCause()) != null) {
            th2 = cause;
        }
        return g0(hVar, th2);
    }

    @Override // s6.w
    public boolean f() {
        return this.f28237w != null;
    }

    @Override // s6.w
    public boolean g() {
        return this.f28227d != null;
    }

    protected p6.m g0(p6.h hVar, Throwable th2) {
        return th2 instanceof p6.m ? (p6.m) th2 : hVar.B0(Q(), th2);
    }

    @Override // s6.w
    public boolean h() {
        return this.f28235u != null;
    }

    @Override // s6.w
    public boolean i() {
        return this.f28232r != null;
    }

    @Override // s6.w
    public boolean j() {
        return this.f28226c != null;
    }

    @Override // s6.w
    public boolean k() {
        return this.f28229f != null;
    }

    @Override // s6.w
    public boolean l() {
        return j() || k() || i() || g() || h() || e() || f() || d() || c();
    }

    @Override // s6.w
    public Object o(p6.h hVar, BigDecimal bigDecimal) {
        Double dF0;
        x6.p pVar = this.f28240z;
        if (pVar != null) {
            try {
                return pVar.t(bigDecimal);
            } catch (Exception e10) {
                return hVar.l0(this.f28240z.k(), bigDecimal, e0(hVar, e10));
            }
        }
        if (this.f28239y == null || (dF0 = f0(bigDecimal)) == null) {
            return super.o(hVar, bigDecimal);
        }
        try {
            return this.f28239y.t(dF0);
        } catch (Exception e11) {
            return hVar.l0(this.f28239y.k(), dF0, e0(hVar, e11));
        }
    }

    @Override // s6.w
    public Object p(p6.h hVar, BigInteger bigInteger) {
        x6.p pVar = this.f28238x;
        if (pVar == null) {
            return super.p(hVar, bigInteger);
        }
        try {
            return pVar.t(bigInteger);
        } catch (Exception e10) {
            return hVar.l0(this.f28238x.k(), bigInteger, e0(hVar, e10));
        }
    }

    @Override // s6.w
    public Object q(p6.h hVar, boolean z10) {
        if (this.A == null) {
            return super.q(hVar, z10);
        }
        Boolean boolValueOf = Boolean.valueOf(z10);
        try {
            return this.A.t(boolValueOf);
        } catch (Exception e10) {
            return hVar.l0(this.A.k(), boolValueOf, e0(hVar, e10));
        }
    }

    @Override // s6.w
    public Object r(p6.h hVar, double d10) {
        if (this.f28239y != null) {
            Double dValueOf = Double.valueOf(d10);
            try {
                return this.f28239y.t(dValueOf);
            } catch (Exception e10) {
                return hVar.l0(this.f28239y.k(), dValueOf, e0(hVar, e10));
            }
        }
        if (this.f28240z == null) {
            return super.r(hVar, d10);
        }
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(d10);
        try {
            return this.f28240z.t(bigDecimalValueOf);
        } catch (Exception e11) {
            return hVar.l0(this.f28240z.k(), bigDecimalValueOf, e0(hVar, e11));
        }
    }

    @Override // s6.w
    public Object s(p6.h hVar, int i10) {
        if (this.f28236v != null) {
            Integer numValueOf = Integer.valueOf(i10);
            try {
                return this.f28236v.t(numValueOf);
            } catch (Exception e10) {
                return hVar.l0(this.f28236v.k(), numValueOf, e0(hVar, e10));
            }
        }
        if (this.f28237w != null) {
            Long lValueOf = Long.valueOf(i10);
            try {
                return this.f28237w.t(lValueOf);
            } catch (Exception e11) {
                return hVar.l0(this.f28237w.k(), lValueOf, e0(hVar, e11));
            }
        }
        if (this.f28238x == null) {
            return super.s(hVar, i10);
        }
        BigInteger bigIntegerValueOf = BigInteger.valueOf(i10);
        try {
            return this.f28238x.t(bigIntegerValueOf);
        } catch (Exception e12) {
            return hVar.l0(this.f28238x.k(), bigIntegerValueOf, e0(hVar, e12));
        }
    }

    @Override // s6.w
    public Object t(p6.h hVar, long j10) {
        if (this.f28237w != null) {
            Long lValueOf = Long.valueOf(j10);
            try {
                return this.f28237w.t(lValueOf);
            } catch (Exception e10) {
                return hVar.l0(this.f28237w.k(), lValueOf, e0(hVar, e10));
            }
        }
        if (this.f28238x == null) {
            return super.t(hVar, j10);
        }
        BigInteger bigIntegerValueOf = BigInteger.valueOf(j10);
        try {
            return this.f28238x.t(bigIntegerValueOf);
        } catch (Exception e11) {
            return hVar.l0(this.f28238x.k(), bigIntegerValueOf, e0(hVar, e11));
        }
    }

    @Override // s6.w
    public Object v(p6.h hVar, Object[] objArr) {
        x6.p pVar = this.f28227d;
        if (pVar == null) {
            return super.v(hVar, objArr);
        }
        try {
            return pVar.s(objArr);
        } catch (Exception e10) {
            return hVar.l0(this.f28225b, objArr, e0(hVar, e10));
        }
    }

    @Override // s6.w
    public Object x(p6.h hVar, String str) {
        x6.p pVar = this.f28235u;
        if (pVar == null) {
            return super.x(hVar, str);
        }
        try {
            return pVar.t(str);
        } catch (Exception e10) {
            return hVar.l0(this.f28235u.k(), str, e0(hVar, e10));
        }
    }

    @Override // s6.w
    public Object z(p6.h hVar, Object obj) {
        x6.p pVar = this.f28233s;
        return (pVar != null || this.f28230g == null) ? R(pVar, this.f28234t, hVar, obj) : D(hVar, obj);
    }
}
