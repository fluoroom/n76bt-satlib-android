package t6;

import com.fasterxml.jackson.databind.JavaType;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class b extends s6.d {
    protected final s6.d I;
    protected final s6.u[] J;

    public b(s6.d dVar, s6.u[] uVarArr) {
        super(dVar);
        this.I = dVar;
        this.J = uVarArr;
    }

    @Override // s6.d
    public s6.d K1(c cVar) {
        return new b(this.I.K1(cVar), this.J);
    }

    @Override // s6.d
    public s6.d L1(Set set, Set set2) {
        return new b(this.I.L1(set, set2), this.J);
    }

    @Override // s6.d
    public s6.d M1(boolean z10) {
        return new b(this.I.M1(z10), this.J);
    }

    @Override // s6.d
    public s6.d N1(s sVar) {
        return new b(this.I.N1(sVar), this.J);
    }

    protected Object Q1(e6.j jVar, p6.h hVar) {
        return hVar.r0(Y0(hVar), jVar.n(), jVar, "Cannot deserialize a POJO (of type %s) from non-Array representation (token: %s): type/property designed to be serialized as JSON Array", i7.h.G(this.f26911e), jVar.n());
    }

    protected Object R1(e6.j jVar, p6.h hVar) throws p6.m {
        if (this.f26917t) {
            return y1(jVar, hVar);
        }
        Object objA = this.f26913g.A(hVar);
        jVar.c1(objA);
        if (this.f26920w != null) {
            I1(hVar, objA);
        }
        Class clsY = this.B ? hVar.Y() : null;
        s6.u[] uVarArr = this.J;
        int length = uVarArr.length;
        int i10 = 0;
        while (true) {
            e6.m mVarX0 = jVar.X0();
            e6.m mVar = e6.m.END_ARRAY;
            if (mVarX0 == mVar) {
                break;
            }
            if (i10 == length) {
                if (!this.A) {
                    hVar.Z0(this, mVar, "Unexpected JSON values; expected at most %d properties (in JSON Array)", Integer.valueOf(length));
                }
                do {
                    jVar.f1();
                } while (jVar.X0() != e6.m.END_ARRAY);
            } else {
                s6.u uVar = uVarArr[i10];
                i10++;
                if (uVar == null || !(clsY == null || uVar.S(clsY))) {
                    jVar.f1();
                } else {
                    try {
                        uVar.n(jVar, hVar, objA);
                    } catch (Exception e10) {
                        O1(e10, objA, uVar.getName(), hVar);
                    }
                }
            }
        }
        return objA;
    }

    @Override // p6.l
    public Object e(e6.j jVar, p6.h hVar) throws p6.m {
        if (!jVar.S0()) {
            return Q1(jVar, hVar);
        }
        if (!this.f26918u) {
            return R1(jVar, hVar);
        }
        Object objA = this.f26913g.A(hVar);
        jVar.c1(objA);
        s6.u[] uVarArr = this.J;
        int length = uVarArr.length;
        int i10 = 0;
        while (true) {
            e6.m mVarX0 = jVar.X0();
            e6.m mVar = e6.m.END_ARRAY;
            if (mVarX0 == mVar) {
                break;
            }
            if (i10 == length) {
                if (!this.A && hVar.D0(p6.i.FAIL_ON_UNKNOWN_PROPERTIES)) {
                    hVar.Z0(this, mVar, "Unexpected JSON values; expected at most %d properties (in JSON Array)", Integer.valueOf(length));
                }
                do {
                    jVar.f1();
                } while (jVar.X0() != e6.m.END_ARRAY);
            } else {
                s6.u uVar = uVarArr[i10];
                if (uVar != null) {
                    try {
                        uVar.n(jVar, hVar, objA);
                    } catch (Exception e10) {
                        O1(e10, objA, uVar.getName(), hVar);
                    }
                } else {
                    jVar.f1();
                }
                i10++;
            }
        }
        return objA;
    }

    @Override // p6.l
    public Object f(e6.j jVar, p6.h hVar, Object obj) throws p6.m {
        jVar.c1(obj);
        if (!jVar.S0()) {
            return Q1(jVar, hVar);
        }
        if (this.f26920w != null) {
            I1(hVar, obj);
        }
        s6.u[] uVarArr = this.J;
        int length = uVarArr.length;
        int i10 = 0;
        while (true) {
            e6.m mVarX0 = jVar.X0();
            e6.m mVar = e6.m.END_ARRAY;
            if (mVarX0 == mVar) {
                break;
            }
            if (i10 == length) {
                if (!this.A && hVar.D0(p6.i.FAIL_ON_UNKNOWN_PROPERTIES)) {
                    hVar.Z0(this, mVar, "Unexpected JSON values; expected at most %d properties (in JSON Array)", Integer.valueOf(length));
                }
                do {
                    jVar.f1();
                } while (jVar.X0() != e6.m.END_ARRAY);
            } else {
                s6.u uVar = uVarArr[i10];
                if (uVar != null) {
                    try {
                        uVar.n(jVar, hVar, obj);
                    } catch (Exception e10) {
                        O1(e10, obj, uVar.getName(), hVar);
                    }
                } else {
                    jVar.f1();
                }
                i10++;
            }
        }
        return obj;
    }

    @Override // s6.d
    protected final Object g1(e6.j jVar, p6.h hVar) throws p6.m {
        v vVar = this.f26916s;
        y yVarE = vVar.e(jVar, hVar, this.G);
        s6.u[] uVarArr = this.J;
        int length = uVarArr.length;
        Class clsY = this.B ? hVar.Y() : null;
        Object objA = null;
        int i10 = 0;
        while (jVar.X0() != e6.m.END_ARRAY) {
            s6.u uVar = i10 < length ? uVarArr[i10] : null;
            if (uVar == null) {
                jVar.f1();
            } else if (clsY != null && !uVar.S(clsY)) {
                jVar.f1();
            } else if (objA != null) {
                try {
                    uVar.n(jVar, hVar, objA);
                } catch (Exception e10) {
                    O1(e10, objA, uVar.getName(), hVar);
                }
            } else {
                String name = uVar.getName();
                s6.u uVarD = vVar.d(name);
                if (!yVarE.i(name) || uVarD != null) {
                    if (uVarD == null) {
                        yVarE.e(uVar, uVar.l(jVar, hVar));
                    } else if (yVarE.b(uVarD, uVarD.l(jVar, hVar))) {
                        try {
                            objA = vVar.a(hVar, yVarE);
                            jVar.c1(objA);
                            if (objA.getClass() != this.f26911e.r()) {
                                JavaType javaType = this.f26911e;
                                hVar.q(javaType, String.format("Cannot support implicit polymorphic deserialization for POJOs-as-Arrays style: nominal type %s, actual type %s", i7.h.G(javaType), i7.h.y(objA)));
                            }
                        } catch (Exception e11) {
                            O1(e11, this.f26911e.r(), name, hVar);
                        }
                    }
                }
            }
            i10++;
        }
        if (objA != null) {
            return objA;
        }
        try {
            return vVar.a(hVar, yVarE);
        } catch (Exception e12) {
            return P1(e12, hVar);
        }
    }

    @Override // s6.d, p6.l
    public p6.l t(i7.s sVar) {
        return this.I.t(sVar);
    }

    @Override // s6.d
    public Object w1(e6.j jVar, p6.h hVar) {
        return Q1(jVar, hVar);
    }

    @Override // s6.d
    protected s6.d r1() {
        return this;
    }
}
