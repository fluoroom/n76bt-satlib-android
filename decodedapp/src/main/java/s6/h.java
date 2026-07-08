package s6;

import com.fasterxml.jackson.databind.JavaType;
import i7.b0;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import t6.y;

/* JADX INFO: loaded from: classes.dex */
public class h extends d {
    protected final x6.l I;
    protected final JavaType J;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f26940a;

        static {
            int[] iArr = new int[r6.b.values().length];
            f26940a = iArr;
            try {
                iArr[r6.b.AsEmpty.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26940a[r6.b.AsNull.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26940a[r6.b.TryConvert.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public h(e eVar, p6.c cVar, JavaType javaType, t6.c cVar2, Map map, Set set, boolean z10, Set set2, boolean z11) {
        super(eVar, cVar, cVar2, map, set, z10, set2, z11);
        this.J = javaType;
        this.I = eVar.r();
        if (this.G == null) {
            return;
        }
        throw new IllegalArgumentException("Cannot use Object Id with Builder-based deserialization (type " + cVar.z() + ")");
    }

    private final Object Z1(e6.j jVar, p6.h hVar, e6.m mVar) throws p6.m {
        Object objA = this.f26913g.A(hVar);
        while (jVar.n() == e6.m.FIELD_NAME) {
            String strL = jVar.l();
            jVar.X0();
            u uVarO = this.f26919v.o(strL);
            if (uVarO != null) {
                try {
                    objA = uVarO.o(jVar, hVar, objA);
                } catch (Exception e10) {
                    O1(e10, objA, strL, hVar);
                }
            } else {
                H1(jVar, hVar, objA, strL);
            }
            jVar.X0();
        }
        return objA;
    }

    @Override // s6.d
    public d K1(t6.c cVar) {
        return new h(this, cVar);
    }

    @Override // s6.d
    public d L1(Set set, Set set2) {
        return new h(this, set, set2);
    }

    @Override // s6.d
    public d M1(boolean z10) {
        return new h(this, z10);
    }

    @Override // s6.d
    public d N1(t6.s sVar) {
        return new h(this, sVar);
    }

    protected final Object Q1(e6.j jVar, p6.h hVar, Object obj) throws p6.m {
        Class clsY;
        if (this.f26920w != null) {
            I1(hVar, obj);
        }
        if (this.E != null) {
            if (jVar.N0(e6.m.START_OBJECT)) {
                jVar.X0();
            }
            b0 b0VarZ = hVar.z(jVar);
            b0VarZ.Z0();
            return W1(jVar, hVar, obj, b0VarZ);
        }
        if (this.F != null) {
            return U1(jVar, hVar, obj);
        }
        if (this.B && (clsY = hVar.Y()) != null) {
            return X1(jVar, hVar, obj, clsY);
        }
        e6.m mVarN = jVar.n();
        if (mVarN == e6.m.START_OBJECT) {
            mVarN = jVar.X0();
        }
        while (mVarN == e6.m.FIELD_NAME) {
            String strL = jVar.l();
            jVar.X0();
            u uVarO = this.f26919v.o(strL);
            if (uVarO != null) {
                try {
                    obj = uVarO.o(jVar, hVar, obj);
                } catch (Exception e10) {
                    O1(e10, obj, strL, hVar);
                }
            } else {
                H1(jVar, hVar, obj, strL);
            }
            mVarN = jVar.X0();
        }
        return obj;
    }

    protected Object R1(e6.j jVar, p6.h hVar) {
        JavaType javaType = this.J;
        return hVar.q(javaType, String.format("Deserialization (of %s) with Builder, External type id, @JsonCreator not yet implemented", javaType));
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected java.lang.Object S1(e6.j r10, p6.h r11) throws p6.m, e6.f {
        /*
            r9 = this;
            t6.v r1 = r9.f26916s
            t6.s r0 = r9.G
            t6.y r2 = r1.e(r10, r11, r0)
            i7.b0 r8 = r11.z(r10)
            r8.Z0()
            e6.m r0 = r10.n()
        L13:
            e6.m r3 = e6.m.FIELD_NAME
            if (r0 != r3) goto Lb0
            java.lang.String r3 = r10.l()
            r10.X0()
            s6.u r0 = r1.d(r3)
            boolean r4 = r2.i(r3)
            if (r4 == 0) goto L2f
            if (r0 != 0) goto L2f
        L2a:
            r4 = r10
            r5 = r11
            r11 = r9
            goto La8
        L2f:
            if (r0 == 0) goto L72
            java.lang.Object r4 = r0.l(r10, r11)
            boolean r0 = r2.b(r0, r4)
            if (r0 == 0) goto L2a
            r10.X0()
            java.lang.Object r7 = r1.a(r11, r2)     // Catch: java.lang.Exception -> L63
            java.lang.Class r0 = r7.getClass()
            com.fasterxml.jackson.databind.JavaType r1 = r9.f26911e
            java.lang.Class r1 = r1.r()
            if (r0 == r1) goto L5b
            e6.r r6 = r10.g1()
            r3 = r9
            r4 = r10
            r5 = r11
            java.lang.Object r10 = r3.F1(r4, r5, r6, r7, r8)
            r11 = r3
            return r10
        L5b:
            r4 = r10
            r5 = r11
            r11 = r9
            java.lang.Object r10 = r9.W1(r4, r5, r7, r8)
            return r10
        L63:
            r0 = move-exception
            r4 = r10
            r5 = r11
            r11 = r9
            r10 = r0
            com.fasterxml.jackson.databind.JavaType r0 = r11.f26911e
            java.lang.Class r0 = r0.r()
            r9.O1(r10, r0, r3, r5)
            goto La8
        L72:
            r4 = r10
            r5 = r11
            r11 = r9
            t6.c r10 = r11.f26919v
            s6.u r10 = r10.o(r3)
            if (r10 == 0) goto L85
            java.lang.Object r0 = r10.l(r4, r5)
            r2.e(r10, r0)
            goto La8
        L85:
            java.util.Set r10 = r11.f26922y
            java.util.Set r0 = r11.f26923z
            boolean r10 = i7.o.c(r3, r10, r0)
            if (r10 == 0) goto L97
            java.lang.Class r10 = r9.p()
            r9.E1(r4, r5, r10, r3)
            goto La8
        L97:
            r8.D0(r3)
            r8.z1(r4)
            s6.t r10 = r11.f26921x
            if (r10 == 0) goto La8
            java.lang.Object r0 = r10.f(r4, r5)
            r2.c(r10, r3, r0)
        La8:
            e6.m r0 = r4.X0()
            r10 = r4
            r11 = r5
            goto L13
        Lb0:
            r4 = r10
            r5 = r11
            r11 = r9
            r8.A0()
            java.lang.Object r10 = r1.a(r5, r2)     // Catch: java.lang.Exception -> Lc1
            t6.d0 r0 = r11.E
            java.lang.Object r10 = r0.b(r4, r5, r10, r8)
            return r10
        Lc1:
            r0 = move-exception
            r10 = r0
            java.lang.Object r10 = r9.P1(r10, r5)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: s6.h.S1(e6.j, p6.h):java.lang.Object");
    }

    protected Object T1(e6.j jVar, p6.h hVar) {
        return this.f26916s != null ? R1(jVar, hVar) : U1(jVar, hVar, this.f26913g.A(hVar));
    }

    protected Object U1(e6.j jVar, p6.h hVar, Object obj) throws p6.m {
        Class clsY = this.B ? hVar.Y() : null;
        t6.g gVarJ = this.F.j();
        e6.m mVarN = jVar.n();
        while (mVarN == e6.m.FIELD_NAME) {
            String strL = jVar.l();
            e6.m mVarX0 = jVar.X0();
            u uVarO = this.f26919v.o(strL);
            if (uVarO != null) {
                if (mVarX0.g()) {
                    gVarJ.i(jVar, hVar, strL, obj);
                }
                if (clsY == null || uVarO.S(clsY)) {
                    try {
                        obj = uVarO.o(jVar, hVar, obj);
                    } catch (Exception e10) {
                        O1(e10, obj, strL, hVar);
                    }
                } else {
                    jVar.f1();
                }
            } else if (i7.o.c(strL, this.f26922y, this.f26923z)) {
                E1(jVar, hVar, obj, strL);
            } else if (!gVarJ.h(jVar, hVar, strL, obj)) {
                t tVar = this.f26921x;
                if (tVar != null) {
                    try {
                        tVar.g(jVar, hVar, obj, strL);
                    } catch (Exception e11) {
                        O1(e11, obj, strL, hVar);
                    }
                } else {
                    b1(jVar, hVar, obj, strL);
                }
            }
            mVarN = jVar.X0();
        }
        return gVarJ.f(jVar, hVar, obj);
    }

    protected Object V1(e6.j jVar, p6.h hVar) throws p6.m, e6.f {
        p6.l lVar = this.f26914h;
        if (lVar != null) {
            return this.f26913g.D(hVar, lVar.e(jVar, hVar));
        }
        if (this.f26916s != null) {
            return S1(jVar, hVar);
        }
        b0 b0VarZ = hVar.z(jVar);
        b0VarZ.Z0();
        Object objA = this.f26913g.A(hVar);
        if (this.f26920w != null) {
            I1(hVar, objA);
        }
        Class clsY = this.B ? hVar.Y() : null;
        while (jVar.n() == e6.m.FIELD_NAME) {
            String strL = jVar.l();
            jVar.X0();
            u uVarO = this.f26919v.o(strL);
            if (uVarO != null) {
                if (clsY == null || uVarO.S(clsY)) {
                    try {
                        objA = uVarO.o(jVar, hVar, objA);
                    } catch (Exception e10) {
                        O1(e10, objA, strL, hVar);
                    }
                } else {
                    jVar.f1();
                }
            } else if (i7.o.c(strL, this.f26922y, this.f26923z)) {
                E1(jVar, hVar, objA, strL);
            } else {
                b0VarZ.D0(strL);
                b0VarZ.z1(jVar);
                t tVar = this.f26921x;
                if (tVar != null) {
                    try {
                        tVar.g(jVar, hVar, objA, strL);
                    } catch (Exception e11) {
                        O1(e11, objA, strL, hVar);
                    }
                }
            }
            jVar.X0();
        }
        b0VarZ.A0();
        return this.E.b(jVar, hVar, objA, b0VarZ);
    }

    @Override // u6.c0
    protected Object W(e6.j jVar, p6.h hVar) throws p6.m {
        e6.j jVar2;
        p6.h hVar2;
        p6.l lVar = this.f26915r;
        if (lVar != null || (lVar = this.f26914h) != null) {
            Object objZ = this.f26913g.z(hVar, lVar.e(jVar, hVar));
            if (this.f26920w != null) {
                I1(hVar, objZ);
            }
            return Y1(hVar, objZ);
        }
        r6.b bVarB0 = b0(hVar);
        boolean zD0 = hVar.D0(p6.i.UNWRAP_SINGLE_VALUE_ARRAYS);
        if (zD0 || bVarB0 != r6.b.Fail) {
            e6.m mVarX0 = jVar.X0();
            e6.m mVar = e6.m.END_ARRAY;
            if (mVarX0 == mVar) {
                int i10 = a.f26940a[bVarB0.ordinal()];
                return i10 != 1 ? (i10 == 2 || i10 == 3) ? a(hVar) : hVar.r0(Y0(hVar), e6.m.START_ARRAY, jVar, null, new Object[0]) : k(hVar);
            }
            jVar2 = jVar;
            hVar2 = hVar;
            if (zD0) {
                Object objE = e(jVar2, hVar2);
                if (jVar2.X0() != mVar) {
                    Z0(jVar2, hVar2);
                }
                return objE;
            }
        } else {
            jVar2 = jVar;
            hVar2 = hVar;
        }
        return hVar2.q0(Y0(hVar2), jVar2);
    }

    protected Object W1(e6.j jVar, p6.h hVar, Object obj, b0 b0Var) throws IOException {
        Class clsY = this.B ? hVar.Y() : null;
        e6.m mVarN = jVar.n();
        while (mVarN == e6.m.FIELD_NAME) {
            String strL = jVar.l();
            u uVarO = this.f26919v.o(strL);
            jVar.X0();
            if (uVarO != null) {
                if (clsY == null || uVarO.S(clsY)) {
                    try {
                        obj = uVarO.o(jVar, hVar, obj);
                    } catch (Exception e10) {
                        O1(e10, obj, strL, hVar);
                    }
                } else {
                    jVar.f1();
                }
            } else if (i7.o.c(strL, this.f26922y, this.f26923z)) {
                E1(jVar, hVar, obj, strL);
            } else {
                b0Var.D0(strL);
                b0Var.z1(jVar);
                t tVar = this.f26921x;
                if (tVar != null) {
                    tVar.g(jVar, hVar, obj, strL);
                }
            }
            mVarN = jVar.X0();
        }
        b0Var.A0();
        return this.E.b(jVar, hVar, obj, b0Var);
    }

    protected final Object X1(e6.j jVar, p6.h hVar, Object obj, Class cls) throws p6.m {
        e6.m mVarN = jVar.n();
        while (mVarN == e6.m.FIELD_NAME) {
            String strL = jVar.l();
            jVar.X0();
            u uVarO = this.f26919v.o(strL);
            if (uVarO == null) {
                H1(jVar, hVar, obj, strL);
            } else if (uVarO.S(cls)) {
                try {
                    obj = uVarO.o(jVar, hVar, obj);
                } catch (Exception e10) {
                    O1(e10, obj, strL, hVar);
                }
            } else {
                jVar.f1();
            }
            mVarN = jVar.X0();
        }
        return obj;
    }

    protected Object Y1(p6.h hVar, Object obj) {
        x6.l lVar = this.I;
        if (lVar == null) {
            return obj;
        }
        try {
            return lVar.n().invoke(obj, null);
        } catch (Exception e10) {
            return P1(e10, hVar);
        }
    }

    @Override // p6.l
    public Object e(e6.j jVar, p6.h hVar) {
        if (jVar.T0()) {
            return this.f26918u ? Y1(hVar, Z1(jVar, hVar, jVar.X0())) : Y1(hVar, w1(jVar, hVar));
        }
        switch (jVar.q()) {
            case 2:
            case 5:
                return Y1(hVar, w1(jVar, hVar));
            case 3:
                return W(jVar, hVar);
            case 4:
            case 11:
            default:
                return hVar.q0(Y0(hVar), jVar);
            case 6:
                return Y1(hVar, z1(jVar, hVar));
            case 7:
                return Y1(hVar, v1(jVar, hVar));
            case 8:
                return Y1(hVar, t1(jVar, hVar));
            case 9:
            case 10:
                return Y1(hVar, s1(jVar, hVar));
            case 12:
                return jVar.h0();
        }
    }

    @Override // p6.l
    public Object f(e6.j jVar, p6.h hVar, Object obj) {
        JavaType javaType = this.J;
        Class clsP = p();
        Class<?> cls = obj.getClass();
        return clsP.isAssignableFrom(cls) ? hVar.q(javaType, String.format("Deserialization of %s by passing existing Builder (%s) instance not supported", javaType, clsP.getName())) : hVar.q(javaType, String.format("Deserialization of %s by passing existing instance (of %s) not supported", javaType, cls.getName()));
    }

    @Override // s6.d
    protected Object g1(e6.j jVar, p6.h hVar) throws IOException {
        Object objP1;
        e6.j jVar2;
        p6.h hVar2;
        t6.v vVar = this.f26916s;
        y yVarE = vVar.e(jVar, hVar, this.G);
        Class clsY = this.B ? hVar.Y() : null;
        e6.m mVarN = jVar.n();
        b0 b0VarZ = null;
        while (mVarN == e6.m.FIELD_NAME) {
            String strL = jVar.l();
            jVar.X0();
            u uVarD = vVar.d(strL);
            if (yVarE.i(strL) && uVarD == null) {
                jVar2 = jVar;
                hVar2 = hVar;
            } else if (uVarD != null) {
                if (clsY != null && !uVarD.S(clsY)) {
                    jVar.f1();
                } else if (yVarE.b(uVarD, uVarD.l(jVar, hVar))) {
                    jVar.X0();
                    try {
                        Object objA = vVar.a(hVar, yVarE);
                        if (objA.getClass() != this.f26911e.r()) {
                            return F1(jVar, hVar, jVar.g1(), objA, b0VarZ);
                        }
                        e6.j jVar3 = jVar;
                        p6.h hVar3 = hVar;
                        if (b0VarZ != null) {
                            objA = G1(hVar3, objA, b0VarZ);
                        }
                        return Q1(jVar3, hVar3, objA);
                    } catch (Exception e10) {
                        jVar2 = jVar;
                        hVar2 = hVar;
                        O1(e10, this.f26911e.r(), strL, hVar2);
                    }
                }
                jVar2 = jVar;
                hVar2 = hVar;
            } else {
                jVar2 = jVar;
                hVar2 = hVar;
                u uVarO = this.f26919v.o(strL);
                if (uVarO != null) {
                    yVarE.e(uVarO, uVarO.l(jVar2, hVar2));
                } else if (i7.o.c(strL, this.f26922y, this.f26923z)) {
                    E1(jVar2, hVar2, p(), strL);
                } else {
                    t tVar = this.f26921x;
                    if (tVar != null) {
                        yVarE.c(tVar, strL, tVar.f(jVar2, hVar2));
                    } else {
                        if (b0VarZ == null) {
                            b0VarZ = hVar2.z(jVar2);
                        }
                        b0VarZ.D0(strL);
                        b0VarZ.z1(jVar2);
                    }
                }
            }
            mVarN = jVar2.X0();
            jVar = jVar2;
            hVar = hVar2;
        }
        e6.j jVar4 = jVar;
        p6.h hVar4 = hVar;
        try {
            objP1 = vVar.a(hVar4, yVarE);
        } catch (Exception e11) {
            objP1 = P1(e11, hVar4);
        }
        Object obj = objP1;
        return b0VarZ != null ? obj.getClass() != this.f26911e.r() ? F1(null, hVar4, jVar4.g1(), obj, b0VarZ) : G1(hVar4, obj, b0VarZ) : obj;
    }

    @Override // s6.d
    protected d r1() {
        return new t6.a(this, this.J, this.f26919v.q(), this.I);
    }

    @Override // s6.d, p6.l
    public Boolean s(p6.g gVar) {
        return Boolean.FALSE;
    }

    @Override // s6.d, p6.l
    public p6.l t(i7.s sVar) {
        return new h(this, sVar);
    }

    @Override // s6.d
    public Object w1(e6.j jVar, p6.h hVar) throws p6.m {
        Class clsY;
        if (this.f26917t) {
            return this.E != null ? V1(jVar, hVar) : this.F != null ? T1(jVar, hVar) : y1(jVar, hVar);
        }
        Object objA = this.f26913g.A(hVar);
        if (this.f26920w != null) {
            I1(hVar, objA);
        }
        if (this.B && (clsY = hVar.Y()) != null) {
            return X1(jVar, hVar, objA, clsY);
        }
        while (jVar.n() == e6.m.FIELD_NAME) {
            String strL = jVar.l();
            jVar.X0();
            u uVarO = this.f26919v.o(strL);
            if (uVarO != null) {
                try {
                    objA = uVarO.o(jVar, hVar, objA);
                } catch (Exception e10) {
                    O1(e10, objA, strL, hVar);
                }
            } else {
                H1(jVar, hVar, objA, strL);
            }
            jVar.X0();
        }
        return objA;
    }

    protected h(h hVar, boolean z10) {
        super(hVar, z10);
        this.I = hVar.I;
        this.J = hVar.J;
    }

    protected h(h hVar, i7.s sVar) {
        super(hVar, sVar);
        this.I = hVar.I;
        this.J = hVar.J;
    }

    public h(h hVar, t6.s sVar) {
        super(hVar, sVar);
        this.I = hVar.I;
        this.J = hVar.J;
    }

    public h(h hVar, Set set, Set set2) {
        super(hVar, set, set2);
        this.I = hVar.I;
        this.J = hVar.J;
    }

    public h(h hVar, t6.c cVar) {
        super(hVar, cVar);
        this.I = hVar.I;
        this.J = hVar.J;
    }
}
