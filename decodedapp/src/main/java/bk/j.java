package bk;

import aj.l;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class j implements Serializable {
    public static final j A;
    public static final j B;
    public static final j C;
    public static final j D;
    public static final j E;
    public static final j F;
    public static final j G;
    public static final j H;
    public static final j I;
    public static final j J;
    public static final j K;
    public static final j L;
    public static final j M;
    public static final j N;
    public static final j O;
    public static final j P;
    public static final j Q;
    public static final j R;
    public static final j S;
    public static final j T;
    public static final j U;
    public static final j V;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final j f4161h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final j f4162r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final j f4163s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f4164t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final j f4165u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final j f4166v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final j f4167w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final j f4168x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final j f4169y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final j f4170z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f4171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f4172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final vi.c f4173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final vi.c f4174d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final vi.c f4175e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final vi.c f4176f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final vi.c f4177g;

    static {
        vi.c cVar = vi.c.f30864e;
        f4161h = new j("n/a", 1.0d, cVar, cVar, cVar, cVar, cVar);
        f4162r = new j("1", 1.0d, cVar, cVar, cVar, cVar, cVar);
        f4163s = new j("cyc", 1.0d, cVar, cVar, cVar, cVar, cVar);
        f4164t = new j("%", 0.01d, cVar, cVar, cVar, cVar, cVar);
        vi.c cVar2 = vi.c.f30863d;
        j jVar = new j("s", 1.0d, cVar, cVar, cVar2, cVar, cVar);
        f4165u = jVar;
        j jVarO = jVar.o("min", 60.0d);
        f4166v = jVarO;
        j jVarO2 = jVarO.o("h", 60.0d);
        f4167w = jVarO2;
        j jVarO3 = jVarO2.o("d", 24.0d);
        f4168x = jVarO3;
        f4169y = jVarO3.o("a", 365.25d);
        j jVarL = jVar.l("Hz", vi.c.f30875y);
        f4170z = jVarL;
        j jVar2 = new j("m", 1.0d, cVar, cVar2, cVar, cVar, cVar);
        A = jVar2;
        B = jVar2.o("km", 1000.0d);
        j jVar3 = new j("kg", 1.0d, cVar2, cVar, cVar, cVar, cVar);
        C = jVar3;
        D = jVar3.o("g", 0.001d);
        j jVar4 = new j("A", 1.0d, cVar, cVar, cVar, cVar2, cVar);
        E = jVar4;
        j jVar5 = new j("rad", 1.0d, cVar, cVar, cVar, cVar, cVar2);
        F = jVar5;
        j jVarO4 = jVar5.o("°", aj.d.Z(1.0d));
        G = jVarO4;
        j jVarO5 = jVarO4.o("′", 0.016666666666666666d);
        H = jVarO5;
        I = jVarO5.o("″", 0.016666666666666666d);
        J = jVar5.o("rev", 6.283185307179586d);
        j jVarJ = jVar3.j(null, jVar2);
        vi.c cVar3 = vi.c.f30862c;
        j jVarB = jVarJ.b("N", jVar.l(null, cVar3));
        K = jVarB;
        j jVarB2 = jVarB.b("Pa", jVar2.l(null, cVar3));
        L = jVarB2;
        M = jVarB2.o("bar", 100000.0d);
        j jVarJ2 = jVarB.j("J", jVar2);
        N = jVarJ2;
        j jVarB3 = jVarJ2.b("W", jVar);
        O = jVarB3;
        P = jVar.j("C", jVar4);
        j jVarB4 = jVarB3.b("V", jVar4);
        Q = jVarB4;
        R = jVarB4.b("Ω", jVar4);
        S = jVarB4.j(null, jVar).b("T", jVar2.l(null, cVar3));
        T = jVarB3.b(null, jVar2.l(null, cVar3).j(null, jVarL)).o("SFU", 1.0E-22d);
        U = jVar2.l(null, new vi.c(-2)).o("TECU", 1.0E16d);
        V = new j("ER", 1.0d, cVar, cVar, cVar, cVar2, cVar);
    }

    public j(String str, double d10, vi.c cVar, vi.c cVar2, vi.c cVar3, vi.c cVar4, vi.c cVar5) {
        this.f4171a = str;
        this.f4172b = d10;
        this.f4173c = cVar;
        this.f4174d = cVar2;
        this.f4175e = cVar3;
        this.f4176f = cVar4;
        this.f4177g = cVar5;
    }

    public static j k(String str) {
        List<e> listE = d.e(str);
        if (listE == null) {
            return f4161h;
        }
        j jVarJ = f4162r;
        for (e eVar : listE) {
            try {
                j jVarQ = g.q(eVar.a().toString());
                if (!vi.c.f30863d.equals(eVar.b())) {
                    jVarQ = jVarQ.l(null, eVar.b());
                }
                jVarJ = jVarJ.j(null, jVarQ.o(null, eVar.c()));
            } catch (IllegalArgumentException unused) {
                throw new hj.a(hj.f.UNKNOWN_UNIT, eVar.a());
            }
        }
        return jVarJ.a(str);
    }

    public j a(String str) {
        return new j(str, this.f4172b, this.f4173c, this.f4174d, this.f4175e, this.f4176f, this.f4177g);
    }

    public j b(String str, j jVar) {
        return new j(str, this.f4172b / jVar.f4172b, this.f4173c.h0(jVar.f4173c), this.f4174d.h0(jVar.f4174d), this.f4175e.h0(jVar.f4175e), this.f4176f.h0(jVar.f4176f), this.f4177g.h0(jVar.f4177g));
    }

    public vi.c c() {
        return this.f4177g;
    }

    public vi.c d() {
        return this.f4176f;
    }

    public vi.c e() {
        return this.f4174d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (l.b(this.f4172b, jVar.f4172b, 1) && this.f4173c.equals(jVar.f4173c) && this.f4174d.equals(jVar.f4174d) && this.f4175e.equals(jVar.f4175e) && this.f4176f.equals(jVar.f4176f) && this.f4177g.equals(jVar.f4177g)) {
                return true;
            }
        }
        return false;
    }

    public vi.c f() {
        return this.f4173c;
    }

    public String g() {
        return this.f4171a;
    }

    public double h() {
        return this.f4172b;
    }

    public int hashCode() {
        return ((((((o4.c.a(this.f4172b) << 12) ^ 26599) ^ (this.f4173c.hashCode() << 10)) ^ (this.f4174d.hashCode() << 8)) ^ (this.f4175e.hashCode() << 6)) ^ (this.f4176f.hashCode() << 4)) ^ (this.f4177g.hashCode() << 2);
    }

    public vi.c i() {
        return this.f4175e;
    }

    public j j(String str, j jVar) {
        return new j(str, this.f4172b * jVar.f4172b, this.f4173c.X(jVar.f4173c), this.f4174d.X(jVar.f4174d), this.f4175e.X(jVar.f4175e), this.f4176f.X(jVar.f4176f), this.f4177g.X(jVar.f4177g));
    }

    public j l(String str, vi.c cVar) {
        int iC0 = cVar.c0();
        int iA0 = cVar.a0();
        double dU = this.f4172b;
        if (iC0 != 1) {
            dU = aj.d.J(dU, iC0);
        }
        if (iA0 > 1) {
            dU = iA0 == 2 ? aj.d.U(dU) : iA0 == 3 ? aj.d.k(dU) : aj.d.I(dU, 1.0d / ((double) iA0));
        }
        double d10 = dU;
        vi.c cVarF0 = this.f4173c.f0(cVar);
        vi.c cVarF02 = this.f4174d.f0(cVar);
        vi.c cVarF03 = this.f4175e.f0(cVar);
        vi.c cVar2 = this.f4176f;
        return new j(str, d10, cVarF0, cVarF02, cVarF03, cVar2.f0(cVar2), this.f4177g.f0(cVar));
    }

    public boolean n(j jVar) {
        return this.f4175e.equals(jVar.f4175e) && this.f4174d.equals(jVar.f4174d) && this.f4173c.equals(jVar.f4173c) && this.f4176f.equals(jVar.f4176f) && this.f4177g.equals(jVar.f4177g);
    }

    public j o(String str, double d10) {
        return new j(str, d10 * this.f4172b, this.f4173c, this.f4174d, this.f4175e, this.f4176f, this.f4177g);
    }

    public double p(double d10) {
        return d10 * this.f4172b;
    }

    public String toString() {
        return g();
    }
}
