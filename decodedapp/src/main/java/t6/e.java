package t6;

import com.fasterxml.jackson.databind.JavaType;
import java.lang.reflect.Member;
import java.util.HashMap;
import u6.h0;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected static final String[] f27488j = {"default", "from-String", "from-int", "from-long", "from-big-integer", "from-double", "from-big-decimal", "from-boolean", "delegate", "property-based", "array-delegate"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final p6.c f27489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final boolean f27490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final boolean f27491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final x6.p[] f27492d = new x6.p[11];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f27493e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected boolean f27494f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected s6.u[] f27495g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected s6.u[] f27496h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected s6.u[] f27497i;

    public e(p6.c cVar, r6.q qVar) {
        this.f27489a = cVar;
        this.f27490b = qVar.b();
        this.f27491c = qVar.L(p6.r.OVERRIDE_PUBLIC_ACCESS_MODIFIERS);
    }

    private JavaType a(p6.h hVar, x6.p pVar, s6.u[] uVarArr) {
        if (!this.f27494f || pVar == null) {
            return null;
        }
        int i10 = 0;
        if (uVarArr != null) {
            int length = uVarArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                if (uVarArr[i11] == null) {
                    i10 = i11;
                    break;
                }
                i11++;
            }
        }
        p6.g gVarK = hVar.k();
        JavaType javaTypeZ = pVar.z(i10);
        p6.b bVarG = gVarK.g();
        if (bVarG == null) {
            return javaTypeZ;
        }
        x6.o oVarV = pVar.v(i10);
        Object objN = bVarG.n(oVarV);
        return objN != null ? javaTypeZ.r0(hVar.H(oVarV, objN)) : bVarG.H0(gVarK, oVarV, javaTypeZ);
    }

    private x6.k b(x6.k kVar) {
        if (kVar != null && this.f27490b) {
            i7.h.g((Member) kVar.b(), this.f27491c);
        }
        return kVar;
    }

    protected boolean c(x6.p pVar) {
        return i7.h.M(pVar.k()) && "valueOf".equals(pVar.d());
    }

    protected void d(int i10, boolean z10, x6.p pVar, x6.p pVar2) {
        throw new IllegalArgumentException(String.format("Conflicting %s creators: already had %s creator %s, encountered another: %s", f27488j[i10], z10 ? "explicitly marked" : "implicitly discovered", pVar, pVar2));
    }

    public void e(x6.p pVar, boolean z10) {
        s(pVar, 6, z10);
    }

    public void f(x6.p pVar, boolean z10) {
        s(pVar, 4, z10);
    }

    public void g(x6.p pVar, boolean z10) {
        s(pVar, 7, z10);
    }

    public void h(x6.p pVar, boolean z10, s6.u[] uVarArr, int i10) {
        if (pVar.z(i10).H()) {
            if (s(pVar, 10, z10)) {
                this.f27496h = uVarArr;
            }
        } else if (s(pVar, 8, z10)) {
            this.f27495g = uVarArr;
        }
    }

    public void i(x6.p pVar, boolean z10) {
        s(pVar, 5, z10);
    }

    public void j(x6.p pVar, boolean z10) {
        s(pVar, 2, z10);
    }

    public void k(x6.p pVar, boolean z10) {
        s(pVar, 3, z10);
    }

    public void l(x6.p pVar, boolean z10, s6.u[] uVarArr) {
        Integer num;
        if (s(pVar, 9, z10)) {
            if (uVarArr.length > 1) {
                HashMap map = new HashMap();
                int length = uVarArr.length;
                for (int i10 = 0; i10 < length; i10++) {
                    String name = uVarArr[i10].getName();
                    if ((!name.isEmpty() || uVarArr[i10].s() == null) && (num = (Integer) map.put(name, Integer.valueOf(i10))) != null) {
                        throw new IllegalArgumentException(String.format("Duplicate creator property \"%s\" (index %s vs %d) for type %s ", name, num, Integer.valueOf(i10), i7.h.Y(this.f27489a.q())));
                    }
                }
            }
            this.f27497i = uVarArr;
        }
    }

    public void m(x6.p pVar, boolean z10) {
        s(pVar, 1, z10);
    }

    public s6.w n(p6.h hVar) {
        p6.g gVarK = hVar.k();
        JavaType javaTypeA = a(hVar, this.f27492d[8], this.f27495g);
        JavaType javaTypeA2 = a(hVar, this.f27492d[10], this.f27496h);
        h0 h0Var = new h0(gVarK, this.f27489a.z());
        x6.p[] pVarArr = this.f27492d;
        h0Var.b0(pVarArr[0], pVarArr[8], javaTypeA, this.f27495g, pVarArr[9], this.f27497i);
        h0Var.S(this.f27492d[10], javaTypeA2, this.f27496h);
        h0Var.c0(this.f27492d[1]);
        h0Var.Z(this.f27492d[2]);
        h0Var.a0(this.f27492d[3]);
        h0Var.W(this.f27492d[4]);
        h0Var.Y(this.f27492d[5]);
        h0Var.T(this.f27492d[6]);
        h0Var.X(this.f27492d[7]);
        return h0Var;
    }

    public boolean o() {
        return this.f27492d[0] != null;
    }

    public boolean p() {
        return this.f27492d[8] != null;
    }

    public boolean q() {
        return this.f27492d[9] != null;
    }

    public void r(x6.p pVar) {
        this.f27492d[0] = (x6.p) b(pVar);
    }

    protected boolean s(x6.p pVar, int i10, boolean z10) {
        boolean z11;
        int i11 = 1 << i10;
        this.f27494f = true;
        x6.p pVar2 = this.f27492d[i10];
        if (pVar2 != null) {
            if ((this.f27493e & i11) == 0) {
                z11 = !z10;
            } else {
                if (!z10) {
                    return false;
                }
                z11 = true;
            }
            if (z11 && pVar2.getClass() == pVar.getClass()) {
                Class clsA = pVar2.A(0);
                Class<?> clsA2 = pVar.A(0);
                if (clsA == clsA2) {
                    if (c(pVar)) {
                        return false;
                    }
                    if (!c(pVar2)) {
                        d(i10, z10, pVar2, pVar);
                    }
                } else {
                    if (clsA2.isAssignableFrom(clsA)) {
                        return false;
                    }
                    if (!clsA.isAssignableFrom(clsA2)) {
                        if (clsA.isPrimitive() == clsA2.isPrimitive()) {
                            d(i10, z10, pVar2, pVar);
                        } else if (clsA.isPrimitive()) {
                            return false;
                        }
                    }
                }
            }
        }
        if (z10) {
            this.f27493e |= i11;
        }
        this.f27492d[i10] = (x6.p) b(pVar);
        return true;
    }
}
