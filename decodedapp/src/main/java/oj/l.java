package oj;

import java.lang.reflect.Array;
import kj.r0;
import yj.e0;
import yj.f0;
import yj.g0;
import zj.k1;
import zj.y0;
import zj.z0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l implements z0, g0, e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r0 f23625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final yj.b f23626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f23627c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private xi.f f23628d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private k1 f23629e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private double[][] f23630f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private double[][] f23631g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private double[][] f23632h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private double[][] f23633r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private double[][] f23634s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private double[][] f23635t;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f23636a;

        static {
            int[] iArr = new int[n.values().length];
            f23636a = iArr;
            try {
                iArr[n.MEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23636a[n.ECCENTRIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23636a[n.TRUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    protected l(r0 r0Var, yj.b bVar, double d10) {
        u(r0Var);
        this.f23626b = bVar;
        this.f23627c = d10;
        this.f23629e = null;
        this.f23625a = r0Var;
        this.f23630f = null;
        this.f23631g = null;
        this.f23632h = null;
        this.f23633r = null;
        this.f23634s = null;
        this.f23635t = null;
    }

    protected static void A(double d10, xi.f fVar, double[] dArr, int i10) {
        dArr[i10] = fVar.j() * d10;
        dArr[i10 + 1] = fVar.k() * d10;
        dArr[i10 + 2] = d10 * fVar.l();
    }

    protected static boolean Y(y0 y0Var, double d10) {
        xi.f fVarO = y0Var.o();
        if (fVarO == null) {
            return false;
        }
        xi.f fVarT = y0Var.t();
        double d11 = 1.0E-9d * d10;
        xi.f fVarU = fVarO.U(fVarT.i());
        return fVarU.I() >= d11 && fVarU.a(((xi.f) fVarT.p()).U(d10)).I() > d11;
    }

    private static void u(r0 r0Var) {
        if (!r0Var.y()) {
            throw new hj.c(hj.f.NON_PSEUDO_INERTIAL_FRAME, r0Var.r());
        }
    }

    protected static void v(double d10, xi.f fVar, double d11, xi.f fVar2, double d12, xi.f fVar3, double d13, xi.f fVar4, double d14, xi.f fVar5, double d15, xi.f fVar6, double[] dArr, int i10) {
        double[] dArr2 = {d10, d11, d12, d13, d14, d15};
        dArr[i10] = aj.i.g(dArr2, new double[]{fVar.j(), fVar2.j(), fVar3.j(), fVar4.j(), fVar5.j(), fVar6.j()});
        dArr[i10 + 1] = aj.i.g(dArr2, new double[]{fVar.k(), fVar2.k(), fVar3.k(), fVar4.k(), fVar5.k(), fVar6.k()});
        dArr[i10 + 2] = aj.i.g(dArr2, new double[]{fVar.l(), fVar2.l(), fVar3.l(), fVar4.l(), fVar5.l(), fVar6.l()});
    }

    protected static void w(double d10, xi.f fVar, double d11, xi.f fVar2, double d12, xi.f fVar3, double d13, xi.f fVar4, double d14, xi.f fVar5, double[] dArr, int i10) {
        double[] dArr2 = {d10, d11, d12, d13, d14};
        dArr[i10] = aj.i.g(dArr2, new double[]{fVar.j(), fVar2.j(), fVar3.j(), fVar4.j(), fVar5.j()});
        dArr[i10 + 1] = aj.i.g(dArr2, new double[]{fVar.k(), fVar2.k(), fVar3.k(), fVar4.k(), fVar5.k()});
        dArr[i10 + 2] = aj.i.g(dArr2, new double[]{fVar.l(), fVar2.l(), fVar3.l(), fVar4.l(), fVar5.l()});
    }

    protected static void x(double d10, xi.f fVar, double d11, xi.f fVar2, double d12, xi.f fVar3, double d13, xi.f fVar4, double[] dArr, int i10) {
        dArr[i10] = aj.i.f(d10, fVar.j(), d11, fVar2.j(), d12, fVar3.j(), d13, fVar4.j());
        dArr[i10 + 1] = aj.i.f(d10, fVar.k(), d11, fVar2.k(), d12, fVar3.k(), d13, fVar4.k());
        dArr[i10 + 2] = aj.i.f(d10, fVar.l(), d11, fVar2.l(), d12, fVar3.l(), d13, fVar4.l());
    }

    protected static void y(double d10, xi.f fVar, double d11, xi.f fVar2, double d12, xi.f fVar3, double[] dArr, int i10) {
        dArr[i10] = aj.i.e(d10, fVar.j(), d11, fVar2.j(), d12, fVar3.j());
        dArr[i10 + 1] = aj.i.e(d10, fVar.k(), d11, fVar2.k(), d12, fVar3.k());
        dArr[i10 + 2] = aj.i.e(d10, fVar.l(), d11, fVar2.l(), d12, fVar3.l());
    }

    protected static void z(double d10, xi.f fVar, double d11, xi.f fVar2, double[] dArr, int i10) {
        dArr[i10] = aj.i.d(d10, fVar.j(), d11, fVar2.j());
        dArr[i10 + 1] = aj.i.d(d10, fVar.k(), d11, fVar2.k());
        dArr[i10 + 2] = aj.i.d(d10, fVar.l(), d11, fVar2.l());
    }

    public abstract double B();

    public abstract double C();

    protected yi.f D(yi.j jVar) {
        return new yi.i(jVar).e();
    }

    public abstract double E();

    public abstract double F();

    public abstract double G();

    public abstract double H();

    public r0 I() {
        return this.f23625a;
    }

    public abstract double J();

    public abstract double K();

    public abstract double L();

    public abstract double M();

    public abstract double N();

    public void O(n nVar, double[][] dArr) {
        double[][] dArr2;
        synchronized (this) {
            try {
                int i10 = a.f23636a[nVar.ordinal()];
                if (i10 == 1) {
                    if (this.f23630f == null) {
                        this.f23630f = p();
                    }
                    dArr2 = this.f23630f;
                } else if (i10 == 2) {
                    if (this.f23632h == null) {
                        this.f23632h = o();
                    }
                    dArr2 = this.f23632h;
                } else {
                    if (i10 != 3) {
                        throw new hj.e(null);
                    }
                    if (this.f23634s == null) {
                        this.f23634s = t();
                    }
                    dArr2 = this.f23634s;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (int i11 = 0; i11 < dArr2.length; i11++) {
            double[] dArr3 = dArr2[i11];
            System.arraycopy(dArr3, 0, dArr[i11], 0, dArr3.length);
        }
    }

    public double P() {
        double dB = aj.d.b(B());
        return aj.d.U(this.f23627c / dB) / dB;
    }

    public abstract double Q();

    public abstract double R();

    public double S() {
        return this.f23627c;
    }

    public k1 T() {
        if (this.f23629e == null) {
            k1 k1VarZ = Z();
            this.f23629e = k1VarZ;
            this.f23628d = k1VarZ.t();
        }
        return this.f23629e;
    }

    public k1 U(r0 r0Var) {
        if (this.f23629e == null) {
            this.f23629e = Z();
        }
        r0 r0Var2 = this.f23625a;
        return r0Var == r0Var2 ? this.f23629e : r0Var2.x(r0Var, this.f23626b).t(this.f23629e);
    }

    public xi.f V() {
        if (this.f23628d == null) {
            this.f23628d = a0();
        }
        return this.f23628d;
    }

    public abstract m W();

    public abstract boolean X();

    protected abstract k1 Z();

    protected abstract xi.f a0();

    public boolean b0() {
        return B() > 0.0d;
    }

    protected xi.f c0() {
        double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, 6, 6);
        n nVar = n.MEAN;
        O(nVar, dArr);
        yi.f fVarD = D(yi.h.f(dArr));
        double[] dArr2 = new double[6];
        W().d(this, nVar, new double[6], dArr2);
        dArr2[5] = dArr2[5] - P();
        yi.m mVarA = fVarD.a(yi.h.g(dArr2));
        return new xi.f(mVarA.b(3), mVarA.b(4), mVarA.b(5));
    }

    public abstract l d0(double d10);

    @Override // yj.g0
    public /* synthetic */ double e(g0 g0Var) {
        return f0.a(this, g0Var);
    }

    @Override // yj.g0
    public yj.b getDate() {
        return this.f23626b;
    }

    protected abstract double[][] o();

    protected abstract double[][] p();

    protected abstract double[][] t();

    protected l(k1 k1Var, r0 r0Var, double d10) {
        u(r0Var);
        this.f23626b = k1Var.getDate();
        this.f23627c = d10;
        if (k1Var.o().i() == 0.0d) {
            double dI = k1Var.t().i();
            this.f23629e = new k1(k1Var.getDate(), k1Var.t(), k1Var.s(), new xi.f((-d10) / (dI * aj.d.U(dI)), k1Var.t()));
        } else {
            this.f23629e = k1Var;
        }
        this.f23625a = r0Var;
    }
}
