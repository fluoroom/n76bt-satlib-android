package u6;

import com.fasterxml.jackson.databind.JavaType;
import d6.k;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class i0 extends c0 implements s6.i {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String[] f28250r = new String[0];

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final i0 f28251s = new i0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected p6.l f28252e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final s6.r f28253f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final Boolean f28254g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final boolean f28255h;

    public i0() {
        this(null, null, null);
    }

    private final String[] h1(e6.j jVar, p6.h hVar) {
        i0 i0Var;
        e6.j jVar2;
        p6.h hVar2;
        String strJ0;
        Boolean bool = this.f28254g;
        if (bool != Boolean.TRUE && (bool != null || !hVar.D0(p6.i.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            return jVar.N0(e6.m.VALUE_STRING) ? (String[]) Y(jVar, hVar) : (String[]) hVar.s0(this.f28200a, jVar);
        }
        if (jVar.N0(e6.m.VALUE_NULL)) {
            strJ0 = (String) this.f28253f.a(hVar);
        } else if (jVar.N0(e6.m.VALUE_STRING)) {
            String strC0 = jVar.C0();
            if (strC0.isEmpty()) {
                r6.b bVarN = hVar.N(r(), p(), r6.e.EmptyString);
                if (bVarN != r6.b.Fail) {
                    return (String[]) X(jVar, hVar, bVarN, p(), "empty String (\"\")");
                }
                i0Var = this;
                jVar2 = jVar;
                hVar2 = hVar;
                strJ0 = J0(jVar2, hVar2, i0Var.f28253f);
            } else {
                jVar2 = jVar;
                hVar2 = hVar;
                if (c0.g0(strC0)) {
                    h7.c cVarR = r();
                    Class clsP = p();
                    r6.b bVar = r6.b.Fail;
                    r6.b bVarO = hVar2.O(cVarR, clsP, bVar);
                    if (bVarO != bVar) {
                        return (String[]) X(jVar2, hVar2, bVarO, p(), "blank String (all whitespace)");
                    }
                }
                i0Var = this;
                strJ0 = J0(jVar2, hVar2, i0Var.f28253f);
            }
        } else {
            i0Var = this;
            jVar2 = jVar;
            hVar2 = hVar;
            strJ0 = J0(jVar2, hVar2, i0Var.f28253f);
        }
        return new String[]{strJ0};
    }

    @Override // s6.i
    public p6.l d(p6.h hVar, p6.d dVar) {
        p6.l lVarR0 = R0(hVar, dVar, this.f28252e);
        JavaType javaTypeG = hVar.G(String.class);
        p6.l lVarQ = lVarR0 == null ? hVar.Q(javaTypeG, dVar) : hVar.p0(lVarR0, dVar, javaTypeG);
        Boolean boolT0 = T0(hVar, dVar, String[].class, k.a.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        s6.r rVarP0 = P0(hVar, dVar, lVarQ);
        if (lVarQ != null && c1(lVarQ)) {
            lVarQ = null;
        }
        return (this.f28252e == lVarQ && Objects.equals(this.f28254g, boolT0) && this.f28253f == rVarP0) ? this : new i0(lVarQ, rVarP0, boolT0);
    }

    protected final String[] e1(e6.j jVar, p6.h hVar, String[] strArr) throws p6.m {
        int length;
        Object[] objArrJ;
        String str;
        int i10;
        i7.v vVarH0 = hVar.H0();
        if (strArr == null) {
            objArrJ = vVarH0.i();
            length = 0;
        } else {
            length = strArr.length;
            objArrJ = vVarH0.j(strArr, length);
        }
        p6.l lVar = this.f28252e;
        while (true) {
            try {
                try {
                    if (jVar.W0() == null) {
                        e6.m mVarN = jVar.n();
                        if (mVarN == e6.m.END_ARRAY) {
                            String[] strArr2 = (String[]) vVarH0.g(objArrJ, length, String.class);
                            hVar.a1(vVarH0);
                            return strArr2;
                        }
                        if (mVarN != e6.m.VALUE_NULL) {
                            str = (String) lVar.e(jVar, hVar);
                        } else if (!this.f28255h) {
                            str = (String) this.f28253f.a(hVar);
                        }
                    } else {
                        str = (String) lVar.e(jVar, hVar);
                    }
                    objArrJ[length] = str;
                    length = i10;
                } catch (Exception e10) {
                    e = e10;
                    length = i10;
                    throw p6.m.r(e, String.class, length);
                }
                if (length >= objArrJ.length) {
                    objArrJ = vVarH0.c(objArrJ);
                    length = 0;
                }
                i10 = length + 1;
            } catch (Exception e11) {
                e = e11;
            }
        }
    }

    @Override // p6.l
    /* JADX INFO: renamed from: f1, reason: merged with bridge method [inline-methods] */
    public String[] e(e6.j jVar, p6.h hVar) throws p6.m {
        int i10;
        if (!jVar.S0()) {
            return h1(jVar, hVar);
        }
        if (this.f28252e != null) {
            return e1(jVar, hVar, null);
        }
        i7.v vVarH0 = hVar.H0();
        Object[] objArrI = vVarH0.i();
        int i11 = 0;
        while (true) {
            try {
                String strW0 = jVar.W0();
                try {
                    if (strW0 == null) {
                        e6.m mVarN = jVar.n();
                        if (mVarN == e6.m.END_ARRAY) {
                            String[] strArr = (String[]) vVarH0.g(objArrI, i11, String.class);
                            hVar.a1(vVarH0);
                            return strArr;
                        }
                        if (mVarN != e6.m.VALUE_NULL) {
                            strW0 = J0(jVar, hVar, this.f28253f);
                        } else if (!this.f28255h) {
                            strW0 = (String) this.f28253f.a(hVar);
                        }
                    }
                    objArrI[i11] = strW0;
                    i11 = i10;
                } catch (Exception e10) {
                    e = e10;
                    i11 = i10;
                    throw p6.m.r(e, objArrI, vVarH0.d() + i11);
                }
                if (i11 >= objArrI.length) {
                    objArrI = vVarH0.c(objArrI);
                    i11 = 0;
                }
                i10 = i11 + 1;
            } catch (Exception e11) {
                e = e11;
            }
        }
    }

    @Override // u6.c0, p6.l
    public Object g(e6.j jVar, p6.h hVar, a7.e eVar) {
        return eVar.d(jVar, hVar);
    }

    @Override // p6.l
    /* JADX INFO: renamed from: g1, reason: merged with bridge method [inline-methods] */
    public String[] f(e6.j jVar, p6.h hVar, String[] strArr) throws p6.m {
        String strW0;
        if (!jVar.S0()) {
            String[] strArrH1 = h1(jVar, hVar);
            if (strArrH1 == null) {
                return strArr;
            }
            int length = strArr.length;
            String[] strArr2 = new String[strArrH1.length + length];
            System.arraycopy(strArr, 0, strArr2, 0, length);
            System.arraycopy(strArrH1, 0, strArr2, length, strArrH1.length);
            return strArr2;
        }
        if (this.f28252e != null) {
            return e1(jVar, hVar, strArr);
        }
        i7.v vVarH0 = hVar.H0();
        int length2 = strArr.length;
        Object[] objArrJ = vVarH0.j(strArr, length2);
        while (true) {
            try {
                strW0 = jVar.W0();
            } catch (Exception e10) {
                e = e10;
            }
            if (strW0 == null) {
                e6.m mVarN = jVar.n();
                if (mVarN == e6.m.END_ARRAY) {
                    String[] strArr3 = (String[]) vVarH0.g(objArrJ, length2, String.class);
                    hVar.a1(vVarH0);
                    return strArr3;
                }
                if (mVarN != e6.m.VALUE_NULL) {
                    strW0 = J0(jVar, hVar, this.f28253f);
                } else {
                    if (this.f28255h) {
                        return f28250r;
                    }
                    strW0 = (String) this.f28253f.a(hVar);
                }
                throw p6.m.r(e, objArrJ, vVarH0.d() + length2);
            }
            if (length2 >= objArrJ.length) {
                objArrJ = vVarH0.c(objArrJ);
                length2 = 0;
            }
            int i10 = length2 + 1;
            try {
                objArrJ[length2] = strW0;
                length2 = i10;
            } catch (Exception e11) {
                e = e11;
                length2 = i10;
            }
        }
    }

    @Override // p6.l
    public i7.a j() {
        return i7.a.CONSTANT;
    }

    @Override // p6.l
    public Object k(p6.h hVar) {
        return f28250r;
    }

    @Override // p6.l
    public h7.c r() {
        return h7.c.Array;
    }

    @Override // p6.l
    public Boolean s(p6.g gVar) {
        return Boolean.TRUE;
    }

    protected i0(p6.l lVar, s6.r rVar, Boolean bool) {
        super(String[].class);
        this.f28252e = lVar;
        this.f28253f = rVar;
        this.f28254g = bool;
        this.f28255h = t6.q.d(rVar);
    }
}
