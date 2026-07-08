package u6;

import com.fasterxml.jackson.databind.JavaType;
import java.io.IOException;
import java.util.EnumMap;

/* JADX INFO: loaded from: classes.dex */
public class m extends j implements s6.i, s6.s {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected final Class f28280r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected p6.q f28281s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected p6.l f28282t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected final a7.e f28283u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected final s6.w f28284v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected p6.l f28285w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected t6.v f28286x;

    public m(JavaType javaType, s6.w wVar, p6.q qVar, p6.l lVar, a7.e eVar, s6.r rVar) {
        super(javaType, rVar, (Boolean) null);
        this.f28280r = javaType.q().r();
        this.f28281s = qVar;
        this.f28282t = lVar;
        this.f28283u = eVar;
        this.f28284v = wVar;
    }

    @Override // u6.c0
    public s6.w W0() {
        return this.f28284v;
    }

    @Override // s6.s
    public void c(p6.h hVar) throws v6.b {
        s6.w wVar = this.f28284v;
        if (wVar != null) {
            if (wVar.k()) {
                JavaType javaTypeN = this.f28284v.N(hVar.k());
                if (javaTypeN == null) {
                    JavaType javaType = this.f28256e;
                    hVar.q(javaType, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'", javaType, this.f28284v.getClass().getName()));
                }
                this.f28285w = S0(hVar, javaTypeN, null);
                return;
            }
            if (!this.f28284v.i()) {
                if (this.f28284v.g()) {
                    this.f28286x = t6.v.c(hVar, this.f28284v, this.f28284v.O(hVar.k()), hVar.E0(p6.r.ACCEPT_CASE_INSENSITIVE_PROPERTIES));
                }
            } else {
                JavaType javaTypeH = this.f28284v.H(hVar.k());
                if (javaTypeH == null) {
                    JavaType javaType2 = this.f28256e;
                    hVar.q(javaType2, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'", javaType2, this.f28284v.getClass().getName()));
                }
                this.f28285w = S0(hVar, javaTypeH, null);
            }
        }
    }

    @Override // s6.i
    public p6.l d(p6.h hVar, p6.d dVar) throws v6.b {
        p6.q qVarS = this.f28281s;
        if (qVarS == null) {
            qVarS = hVar.S(this.f28256e.q(), dVar);
        }
        p6.l lVar = this.f28282t;
        JavaType javaTypeK = this.f28256e.k();
        p6.l lVarQ = lVar == null ? hVar.Q(javaTypeK, dVar) : hVar.p0(lVar, dVar, javaTypeK);
        a7.e eVarG = this.f28283u;
        if (eVarG != null) {
            eVarG = eVarG.g(dVar);
        }
        return k1(qVarS, lVarQ, eVarG, P0(hVar, dVar, lVarQ));
    }

    @Override // u6.j
    public p6.l e1() {
        return this.f28282t;
    }

    @Override // u6.c0, p6.l
    public Object g(e6.j jVar, p6.h hVar, a7.e eVar) {
        return eVar.e(jVar, hVar);
    }

    public EnumMap g1(e6.j jVar, p6.h hVar) throws IOException {
        Object objE;
        t6.v vVar = this.f28286x;
        t6.y yVarE = vVar.e(jVar, hVar, null);
        String strV0 = jVar.T0() ? jVar.V0() : jVar.N0(e6.m.FIELD_NAME) ? jVar.l() : null;
        while (strV0 != null) {
            e6.m mVarX0 = jVar.X0();
            s6.u uVarD = vVar.d(strV0);
            if (uVarD == null) {
                Enum r52 = (Enum) this.f28281s.a(strV0, hVar);
                if (r52 != null) {
                    try {
                        if (mVarX0 != e6.m.VALUE_NULL) {
                            a7.e eVar = this.f28283u;
                            objE = eVar == null ? this.f28282t.e(jVar, hVar) : this.f28282t.g(jVar, hVar, eVar);
                        } else if (!this.f28258g) {
                            objE = this.f28257f.a(hVar);
                        }
                        yVarE.d(r52, objE);
                    } catch (Exception e10) {
                        f1(hVar, e10, this.f28256e.r(), strV0);
                        return null;
                    }
                } else {
                    if (!hVar.D0(p6.i.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                        return (EnumMap) hVar.z0(this.f28280r, strV0, "value not one of declared Enum instance names for %s", this.f28256e.q());
                    }
                    jVar.X0();
                    jVar.f1();
                }
            } else if (yVarE.b(uVarD, uVarD.l(jVar, hVar))) {
                jVar.X0();
                try {
                    return f(jVar, hVar, (EnumMap) vVar.a(hVar, yVarE));
                } catch (Exception e11) {
                    return (EnumMap) f1(hVar, e11, this.f28256e.r(), strV0);
                }
            }
            strV0 = jVar.V0();
        }
        try {
            return (EnumMap) vVar.a(hVar, yVarE);
        } catch (Exception e12) {
            f1(hVar, e12, this.f28256e.r(), strV0);
            return null;
        }
    }

    protected EnumMap h1(p6.h hVar) {
        s6.w wVar = this.f28284v;
        if (wVar == null) {
            return new EnumMap(this.f28280r);
        }
        try {
            try {
                return !wVar.j() ? (EnumMap) hVar.m0(p(), W0(), null, "no default constructor found", new Object[0]) : (EnumMap) this.f28284v.A(hVar);
            } catch (IOException e10) {
                e = e10;
            }
        } catch (IOException e11) {
            e = e11;
        }
        return (EnumMap) i7.h.h0(hVar, e);
    }

    @Override // p6.l
    /* JADX INFO: renamed from: i1, reason: merged with bridge method [inline-methods] */
    public EnumMap e(e6.j jVar, p6.h hVar) {
        if (this.f28286x != null) {
            return g1(jVar, hVar);
        }
        p6.l lVar = this.f28285w;
        if (lVar != null) {
            return (EnumMap) this.f28284v.D(hVar, lVar.e(jVar, hVar));
        }
        int iQ = jVar.q();
        if (iQ != 1 && iQ != 2) {
            if (iQ == 3) {
                return (EnumMap) W(jVar, hVar);
            }
            if (iQ != 5) {
                return iQ != 6 ? (EnumMap) hVar.q0(Y0(hVar), jVar) : (EnumMap) Y(jVar, hVar);
            }
        }
        return f(jVar, hVar, h1(hVar));
    }

    @Override // p6.l
    /* JADX INFO: renamed from: j1, reason: merged with bridge method [inline-methods] */
    public EnumMap f(e6.j jVar, p6.h hVar, EnumMap enumMap) throws p6.m {
        String strL;
        Object objE;
        jVar.c1(enumMap);
        p6.l lVar = this.f28282t;
        a7.e eVar = this.f28283u;
        if (jVar.T0()) {
            strL = jVar.V0();
        } else {
            e6.m mVarN = jVar.n();
            e6.m mVar = e6.m.FIELD_NAME;
            if (mVarN != mVar) {
                if (mVarN != e6.m.END_OBJECT) {
                    hVar.Z0(this, mVar, null, new Object[0]);
                }
                return enumMap;
            }
            strL = jVar.l();
        }
        while (strL != null) {
            Enum r42 = (Enum) this.f28281s.a(strL, hVar);
            e6.m mVarX0 = jVar.X0();
            if (r42 != null) {
                try {
                    if (mVarX0 != e6.m.VALUE_NULL) {
                        objE = eVar == null ? lVar.e(jVar, hVar) : lVar.g(jVar, hVar, eVar);
                    } else if (!this.f28258g) {
                        objE = this.f28257f.a(hVar);
                    }
                    enumMap.put(r42, objE);
                } catch (Exception e10) {
                    return (EnumMap) f1(hVar, e10, enumMap, strL);
                }
            } else {
                if (!hVar.D0(p6.i.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                    return (EnumMap) hVar.z0(this.f28280r, strL, "value not one of declared Enum instance names for %s", this.f28256e.q());
                }
                jVar.f1();
            }
            strL = jVar.V0();
        }
        return enumMap;
    }

    @Override // u6.j, p6.l
    public Object k(p6.h hVar) {
        return h1(hVar);
    }

    public m k1(p6.q qVar, p6.l lVar, a7.e eVar, s6.r rVar) {
        return (qVar == this.f28281s && rVar == this.f28257f && lVar == this.f28282t && eVar == this.f28283u) ? this : new m(this, qVar, lVar, eVar, rVar);
    }

    @Override // p6.l
    public boolean q() {
        return this.f28282t == null && this.f28281s == null && this.f28283u == null;
    }

    @Override // p6.l
    public h7.c r() {
        return h7.c.Map;
    }

    protected m(m mVar, p6.q qVar, p6.l lVar, a7.e eVar, s6.r rVar) {
        super(mVar, rVar, mVar.f28259h);
        this.f28280r = mVar.f28280r;
        this.f28281s = qVar;
        this.f28282t = lVar;
        this.f28283u = eVar;
        this.f28284v = mVar.f28284v;
        this.f28285w = mVar.f28285w;
        this.f28286x = mVar.f28286x;
    }
}
