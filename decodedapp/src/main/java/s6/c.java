package s6;

import com.fasterxml.jackson.databind.JavaType;
import i7.b0;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import t6.y;
import t6.z;

/* JADX INFO: loaded from: classes.dex */
public class c extends d implements Serializable {
    protected transient Exception I;
    private volatile transient i7.s J;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f26906a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f26907b;

        static {
            int[] iArr = new int[r6.b.values().length];
            f26907b = iArr;
            try {
                iArr[r6.b.AsEmpty.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26907b[r6.b.AsNull.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26907b[r6.b.TryConvert.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[e6.m.values().length];
            f26906a = iArr2;
            try {
                iArr2[e6.m.VALUE_STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f26906a[e6.m.VALUE_NUMBER_INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f26906a[e6.m.VALUE_NUMBER_FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f26906a[e6.m.VALUE_EMBEDDED_OBJECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f26906a[e6.m.VALUE_TRUE.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f26906a[e6.m.VALUE_FALSE.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f26906a[e6.m.VALUE_NULL.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f26906a[e6.m.START_ARRAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f26906a[e6.m.FIELD_NAME.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f26906a[e6.m.END_OBJECT.ordinal()] = 10;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    static class b extends z.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final p6.h f26908c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final u f26909d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Object f26910e;

        b(p6.h hVar, v vVar, JavaType javaType, y yVar, u uVar) {
            super(vVar, javaType);
            this.f26908c = hVar;
            this.f26909d = uVar;
        }

        public void a(Object obj) {
            this.f26910e = obj;
        }
    }

    public c(e eVar, p6.c cVar, t6.c cVar2, Map map, HashSet hashSet, boolean z10, Set set, boolean z11) {
        super(eVar, cVar, cVar2, map, hashSet, z10, set, z11);
    }

    private b c2(p6.h hVar, u uVar, y yVar, v vVar) {
        b bVar = new b(hVar, vVar, uVar.getType(), yVar, uVar);
        vVar.w().a(bVar);
        return bVar;
    }

    private final Object d2(e6.j jVar, p6.h hVar, e6.m mVar) throws p6.m {
        Object objA = this.f26913g.A(hVar);
        jVar.c1(objA);
        if (jVar.O0(5)) {
            String strL = jVar.l();
            do {
                jVar.X0();
                u uVarO = this.f26919v.o(strL);
                if (uVarO != null) {
                    try {
                        uVarO.n(jVar, hVar, objA);
                    } catch (Exception e10) {
                        O1(e10, objA, strL, hVar);
                    }
                } else {
                    H1(jVar, hVar, objA, strL);
                }
                strL = jVar.V0();
            } while (strL != null);
        }
        return objA;
    }

    @Override // s6.d
    public d K1(t6.c cVar) {
        return new c(this, cVar);
    }

    @Override // s6.d
    public d M1(boolean z10) {
        return new c(this, z10);
    }

    protected Exception Q1() {
        if (this.I == null) {
            this.I = new NullPointerException("JSON Creator returned null");
        }
        return this.I;
    }

    protected final Object R1(e6.j jVar, p6.h hVar, e6.m mVar) {
        if (mVar != null) {
            switch (a.f26906a[mVar.ordinal()]) {
                case 1:
                    return z1(jVar, hVar);
                case 2:
                    return v1(jVar, hVar);
                case 3:
                    return t1(jVar, hVar);
                case 4:
                    return u1(jVar, hVar);
                case 5:
                case 6:
                    return s1(jVar, hVar);
                case 7:
                    return U1(jVar, hVar);
                case 8:
                    return W(jVar, hVar);
                case 9:
                case 10:
                    return this.f26918u ? d2(jVar, hVar, mVar) : this.G != null ? A1(jVar, hVar) : w1(jVar, hVar);
            }
        }
        return hVar.q0(Y0(hVar), jVar);
    }

    protected final Object S1(e6.j jVar, p6.h hVar, u uVar) throws p6.m {
        try {
            return uVar.l(jVar, hVar);
        } catch (Exception e10) {
            O1(e10, this.f26911e.r(), uVar.getName(), hVar);
            return null;
        }
    }

    protected Object T1(e6.j jVar, p6.h hVar, Object obj, t6.g gVar) throws p6.m {
        Class clsY = this.B ? hVar.Y() : null;
        e6.m mVarN = jVar.n();
        while (mVarN == e6.m.FIELD_NAME) {
            String strL = jVar.l();
            e6.m mVarX0 = jVar.X0();
            u uVarO = this.f26919v.o(strL);
            if (uVarO != null) {
                if (mVarX0.g()) {
                    gVar.i(jVar, hVar, strL, obj);
                }
                if (clsY == null || uVarO.S(clsY)) {
                    try {
                        uVarO.n(jVar, hVar, obj);
                    } catch (Exception e10) {
                        O1(e10, obj, strL, hVar);
                    }
                } else {
                    jVar.f1();
                }
            } else if (i7.o.c(strL, this.f26922y, this.f26923z)) {
                E1(jVar, hVar, obj, strL);
            } else if (!gVar.h(jVar, hVar, strL, obj)) {
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
        return gVar.f(jVar, hVar, obj);
    }

    protected Object U1(e6.j jVar, p6.h hVar) {
        if (!jVar.b1()) {
            return hVar.q0(Y0(hVar), jVar);
        }
        b0 b0VarZ = hVar.z(jVar);
        b0VarZ.A0();
        e6.j jVarV1 = b0VarZ.v1(jVar);
        jVarV1.X0();
        Object objD2 = this.f26918u ? d2(jVarV1, hVar, e6.m.END_OBJECT) : w1(jVarV1, hVar);
        jVarV1.close();
        return objD2;
    }

    protected Object V1(e6.j jVar, p6.h hVar) throws p6.m {
        t6.g gVarJ = this.F.j();
        t6.v vVar = this.f26916s;
        y yVarE = vVar.e(jVar, hVar, this.G);
        Class clsY = this.B ? hVar.Y() : null;
        e6.m mVarN = jVar.n();
        while (mVarN == e6.m.FIELD_NAME) {
            String strL = jVar.l();
            e6.m mVarX0 = jVar.X0();
            u uVarD = vVar.d(strL);
            if (!yVarE.i(strL) || uVarD != null) {
                if (uVarD == null) {
                    u uVarO = this.f26919v.o(strL);
                    if (uVarO != null) {
                        if (mVarX0.g()) {
                            gVarJ.i(jVar, hVar, strL, null);
                        }
                        if (clsY == null || uVarO.S(clsY)) {
                            yVarE.e(uVarO, uVarO.l(jVar, hVar));
                        } else {
                            jVar.f1();
                        }
                    } else if (!gVarJ.h(jVar, hVar, strL, null)) {
                        if (i7.o.c(strL, this.f26922y, this.f26923z)) {
                            E1(jVar, hVar, p(), strL);
                        } else {
                            t tVar = this.f26921x;
                            if (tVar != null) {
                                yVarE.c(tVar, strL, tVar.f(jVar, hVar));
                            } else {
                                b1(jVar, hVar, this.f28200a, strL);
                            }
                        }
                    }
                } else if (!gVarJ.h(jVar, hVar, strL, null) && yVarE.b(uVarD, S1(jVar, hVar, uVarD))) {
                    jVar.X0();
                    try {
                        Object objA = vVar.a(hVar, yVarE);
                        if (objA.getClass() == this.f26911e.r()) {
                            return T1(jVar, hVar, objA, gVarJ);
                        }
                        JavaType javaType = this.f26911e;
                        return hVar.q(javaType, String.format("Cannot create polymorphic instances with external type ids (%s -> %s)", javaType, objA.getClass()));
                    } catch (Exception e10) {
                        O1(e10, this.f26911e.r(), strL, hVar);
                    }
                }
            }
            mVarN = jVar.X0();
        }
        try {
            return gVarJ.g(jVar, hVar, yVarE, vVar);
        } catch (Exception e11) {
            return P1(e11, hVar);
        }
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
            return objZ;
        }
        r6.b bVarB0 = b0(hVar);
        boolean zD0 = hVar.D0(p6.i.UNWRAP_SINGLE_VALUE_ARRAYS);
        if (zD0 || bVarB0 != r6.b.Fail) {
            e6.m mVarX0 = jVar.X0();
            e6.m mVar = e6.m.END_ARRAY;
            if (mVarX0 == mVar) {
                int i10 = a.f26907b[bVarB0.ordinal()];
                return i10 != 1 ? (i10 == 2 || i10 == 3) ? a(hVar) : hVar.r0(Y0(hVar), e6.m.START_ARRAY, jVar, null, new Object[0]) : k(hVar);
            }
            jVar2 = jVar;
            if (zD0) {
                e6.m mVar2 = e6.m.START_ARRAY;
                if (mVarX0 == mVar2) {
                    JavaType javaTypeY0 = Y0(hVar);
                    return hVar.r0(javaTypeY0, mVar2, jVar2, "Cannot deserialize value of type %s from deeply-nested Array: only single wrapper allowed with `%s`", i7.h.G(javaTypeY0), "DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS");
                }
                Object objE = e(jVar2, hVar);
                if (jVar2.X0() != mVar) {
                    Z0(jVar2, hVar);
                }
                return objE;
            }
            hVar2 = hVar;
        } else {
            jVar2 = jVar;
            hVar2 = hVar;
        }
        return hVar2.q0(Y0(hVar2), jVar2);
    }

    protected Object W1(e6.j jVar, p6.h hVar) throws IOException {
        Object objP1;
        t6.v vVar = this.f26916s;
        y yVarE = vVar.e(jVar, hVar, this.G);
        b0 b0VarZ = hVar.z(jVar);
        b0VarZ.Z0();
        e6.m mVarN = jVar.n();
        while (mVarN == e6.m.FIELD_NAME) {
            String strL = jVar.l();
            jVar.X0();
            u uVarD = vVar.d(strL);
            if (!yVarE.i(strL) || uVarD != null) {
                if (uVarD == null) {
                    u uVarO = this.f26919v.o(strL);
                    if (uVarO != null) {
                        yVarE.e(uVarO, S1(jVar, hVar, uVarO));
                    } else if (i7.o.c(strL, this.f26922y, this.f26923z)) {
                        E1(jVar, hVar, p(), strL);
                    } else if (this.f26921x == null) {
                        b0VarZ.D0(strL);
                        b0VarZ.z1(jVar);
                    } else {
                        b0 b0VarW = hVar.w(jVar);
                        b0VarZ.D0(strL);
                        b0VarZ.t1(b0VarW);
                        try {
                            t tVar = this.f26921x;
                            yVarE.c(tVar, strL, tVar.f(b0VarW.y1(), hVar));
                        } catch (Exception e10) {
                            O1(e10, this.f26911e.r(), strL, hVar);
                        }
                    }
                } else if (yVarE.b(uVarD, S1(jVar, hVar, uVarD))) {
                    e6.m mVarX0 = jVar.X0();
                    try {
                        objP1 = vVar.a(hVar, yVarE);
                    } catch (Exception e11) {
                        objP1 = P1(e11, hVar);
                    }
                    jVar.c1(objP1);
                    while (mVarX0 == e6.m.FIELD_NAME) {
                        b0VarZ.z1(jVar);
                        mVarX0 = jVar.X0();
                    }
                    e6.m mVar = e6.m.END_OBJECT;
                    if (mVarX0 != mVar) {
                        hVar.Z0(this, mVar, "Attempted to unwrap '%s' value", p().getName());
                    }
                    b0VarZ.A0();
                    if (objP1.getClass() == this.f26911e.r()) {
                        return this.E.b(jVar, hVar, objP1, b0VarZ);
                    }
                    hVar.R0(uVarD, "Cannot create polymorphic instances with unwrapped values", new Object[0]);
                    return null;
                }
            }
            mVarN = jVar.X0();
        }
        try {
            return this.E.b(jVar, hVar, vVar.a(hVar, yVarE), b0VarZ);
        } catch (Exception e12) {
            P1(e12, hVar);
            return null;
        }
    }

    protected Object X1(e6.j jVar, p6.h hVar) {
        if (this.f26916s != null) {
            return V1(jVar, hVar);
        }
        p6.l lVar = this.f26914h;
        return lVar != null ? this.f26913g.D(hVar, lVar.e(jVar, hVar)) : Y1(jVar, hVar, this.f26913g.A(hVar));
    }

    protected Object Y1(e6.j jVar, p6.h hVar, Object obj) {
        return T1(jVar, hVar, obj, this.F.j());
    }

    protected Object Z1(e6.j jVar, p6.h hVar) throws p6.m, e6.f {
        p6.l lVar = this.f26914h;
        if (lVar != null) {
            return this.f26913g.D(hVar, lVar.e(jVar, hVar));
        }
        if (this.f26916s != null) {
            return W1(jVar, hVar);
        }
        b0 b0VarZ = hVar.z(jVar);
        b0VarZ.Z0();
        Object objA = this.f26913g.A(hVar);
        jVar.c1(objA);
        if (this.f26920w != null) {
            I1(hVar, objA);
        }
        Class clsY = this.B ? hVar.Y() : null;
        String strL = jVar.O0(5) ? jVar.l() : null;
        while (strL != null) {
            jVar.X0();
            u uVarO = this.f26919v.o(strL);
            if (uVarO != null) {
                if (clsY == null || uVarO.S(clsY)) {
                    try {
                        uVarO.n(jVar, hVar, objA);
                    } catch (Exception e10) {
                        O1(e10, objA, strL, hVar);
                    }
                } else {
                    jVar.f1();
                }
            } else if (i7.o.c(strL, this.f26922y, this.f26923z)) {
                E1(jVar, hVar, objA, strL);
            } else if (this.f26921x == null) {
                b0VarZ.D0(strL);
                b0VarZ.z1(jVar);
            } else {
                b0 b0VarW = hVar.w(jVar);
                b0VarZ.D0(strL);
                b0VarZ.t1(b0VarW);
                try {
                    this.f26921x.g(b0VarW.y1(), hVar, objA, strL);
                } catch (Exception e11) {
                    O1(e11, objA, strL, hVar);
                }
            }
            strL = jVar.V0();
        }
        b0VarZ.A0();
        this.E.b(jVar, hVar, objA, b0VarZ);
        return objA;
    }

    protected Object a2(e6.j jVar, p6.h hVar, Object obj) throws p6.m, e6.f {
        e6.m mVarN = jVar.n();
        if (mVarN == e6.m.START_OBJECT) {
            mVarN = jVar.X0();
        }
        b0 b0VarZ = hVar.z(jVar);
        b0VarZ.Z0();
        Class clsY = this.B ? hVar.Y() : null;
        while (mVarN == e6.m.FIELD_NAME) {
            String strL = jVar.l();
            u uVarO = this.f26919v.o(strL);
            jVar.X0();
            if (uVarO != null) {
                if (clsY == null || uVarO.S(clsY)) {
                    try {
                        uVarO.n(jVar, hVar, obj);
                    } catch (Exception e10) {
                        O1(e10, obj, strL, hVar);
                    }
                } else {
                    jVar.f1();
                }
            } else if (i7.o.c(strL, this.f26922y, this.f26923z)) {
                E1(jVar, hVar, obj, strL);
            } else if (this.f26921x == null) {
                b0VarZ.D0(strL);
                b0VarZ.z1(jVar);
            } else {
                b0 b0VarW = hVar.w(jVar);
                b0VarZ.D0(strL);
                b0VarZ.t1(b0VarW);
                try {
                    this.f26921x.g(b0VarW.y1(), hVar, obj, strL);
                } catch (Exception e11) {
                    O1(e11, obj, strL, hVar);
                }
            }
            mVarN = jVar.X0();
        }
        b0VarZ.A0();
        this.E.b(jVar, hVar, obj, b0VarZ);
        return obj;
    }

    protected final Object b2(e6.j jVar, p6.h hVar, Object obj, Class cls) throws p6.m {
        if (jVar.O0(5)) {
            String strL = jVar.l();
            do {
                jVar.X0();
                u uVarO = this.f26919v.o(strL);
                if (uVarO == null) {
                    H1(jVar, hVar, obj, strL);
                } else if (uVarO.S(cls)) {
                    try {
                        uVarO.n(jVar, hVar, obj);
                    } catch (Exception e10) {
                        O1(e10, obj, strL, hVar);
                    }
                } else {
                    jVar.f1();
                }
                strL = jVar.V0();
            } while (strL != null);
        }
        return obj;
    }

    @Override // p6.l
    public Object e(e6.j jVar, p6.h hVar) {
        if (!jVar.T0()) {
            return R1(jVar, hVar, jVar.n());
        }
        if (this.f26918u) {
            return d2(jVar, hVar, jVar.X0());
        }
        jVar.X0();
        return this.G != null ? A1(jVar, hVar) : w1(jVar, hVar);
    }

    @Override // s6.d
    /* JADX INFO: renamed from: e2, reason: merged with bridge method [inline-methods] */
    public c L1(Set set, Set set2) {
        return new c(this, set, set2);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // p6.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object f(e6.j r3, p6.h r4, java.lang.Object r5) throws p6.m {
        /*
            r2 = this;
            r3.c1(r5)
            t6.e0[] r0 = r2.f26920w
            if (r0 == 0) goto La
            r2.I1(r4, r5)
        La:
            t6.d0 r0 = r2.E
            if (r0 == 0) goto L13
            java.lang.Object r3 = r2.a2(r3, r4, r5)
            return r3
        L13:
            t6.g r0 = r2.F
            if (r0 == 0) goto L1c
            java.lang.Object r3 = r2.Y1(r3, r4, r5)
            return r3
        L1c:
            boolean r0 = r3.T0()
            if (r0 == 0) goto L29
            java.lang.String r0 = r3.V0()
            if (r0 != 0) goto L34
            goto L60
        L29:
            r0 = 5
            boolean r0 = r3.O0(r0)
            if (r0 == 0) goto L60
            java.lang.String r0 = r3.l()
        L34:
            boolean r1 = r2.B
            if (r1 == 0) goto L43
            java.lang.Class r1 = r4.Y()
            if (r1 == 0) goto L43
            java.lang.Object r3 = r2.b2(r3, r4, r5, r1)
            return r3
        L43:
            r3.X0()
            t6.c r1 = r2.f26919v
            s6.u r1 = r1.o(r0)
            if (r1 == 0) goto L57
            r1.n(r3, r4, r5)     // Catch: java.lang.Exception -> L52
            goto L5a
        L52:
            r1 = move-exception
            r2.O1(r1, r5, r0, r4)
            goto L5a
        L57:
            r2.H1(r3, r4, r5, r0)
        L5a:
            java.lang.String r0 = r3.V0()
            if (r0 != 0) goto L43
        L60:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: s6.c.f(e6.j, p6.h, java.lang.Object):java.lang.Object");
    }

    @Override // s6.d
    /* JADX INFO: renamed from: f2, reason: merged with bridge method [inline-methods] */
    public c N1(t6.s sVar) {
        return new c(this, sVar);
    }

    @Override // s6.d
    protected Object g1(e6.j jVar, p6.h hVar) throws IOException {
        e6.j jVar2;
        p6.h hVar2;
        Object objP1;
        t6.v vVar = this.f26916s;
        y yVarE = vVar.e(jVar, hVar, this.G);
        Object objA = null;
        Class clsY = this.B ? hVar.Y() : null;
        e6.m mVarN = jVar.n();
        ArrayList arrayList = null;
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
                } else if (yVarE.b(uVarD, S1(jVar, hVar, uVarD))) {
                    jVar.X0();
                    try {
                        objP1 = vVar.a(hVar, yVarE);
                    } catch (Exception e10) {
                        objP1 = P1(e10, hVar);
                    }
                    Object objG1 = objP1;
                    if (objG1 == null) {
                        return hVar.l0(p(), null, Q1());
                    }
                    jVar.c1(objG1);
                    if (objG1.getClass() != this.f26911e.r()) {
                        return F1(jVar, hVar, jVar.g1(), objG1, b0VarZ);
                    }
                    e6.j jVar3 = jVar;
                    p6.h hVar3 = hVar;
                    if (b0VarZ != null) {
                        objG1 = G1(hVar3, objG1, b0VarZ);
                    }
                    return f(jVar3, hVar3, objG1);
                }
                jVar2 = jVar;
                hVar2 = hVar;
            } else {
                jVar2 = jVar;
                hVar2 = hVar;
                u uVarO = this.f26919v.o(strL);
                if (uVarO != null && (!this.f26911e.X() || (uVarO instanceof t6.o))) {
                    try {
                        yVarE.e(uVarO, S1(jVar2, hVar2, uVarO));
                    } catch (v e11) {
                        b bVarC2 = c2(hVar2, uVarO, yVarE, e11);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(bVarC2);
                    }
                } else if (i7.o.c(strL, this.f26922y, this.f26923z)) {
                    E1(jVar2, hVar2, p(), strL);
                } else {
                    t tVar = this.f26921x;
                    if (tVar != null) {
                        try {
                            yVarE.c(tVar, strL, tVar.f(jVar2, hVar2));
                        } catch (Exception e12) {
                            O1(e12, this.f26911e.r(), strL, hVar2);
                        }
                    } else if (this.A) {
                        jVar2.f1();
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
            objA = vVar.a(hVar4, yVarE);
        } catch (Exception e13) {
            P1(e13, hVar4);
        }
        Object obj = objA;
        if (this.f26920w != null) {
            I1(hVar4, obj);
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((b) it.next()).a(obj);
            }
        }
        return b0VarZ != null ? obj.getClass() != this.f26911e.r() ? F1(null, hVar4, jVar4.g1(), obj, b0VarZ) : G1(hVar4, obj, b0VarZ) : obj;
    }

    @Override // s6.d
    protected d r1() {
        return new t6.b(this, this.f26919v.q());
    }

    @Override // s6.d, p6.l
    public p6.l t(i7.s sVar) {
        if (getClass() != c.class || this.J == sVar) {
            return this;
        }
        this.J = sVar;
        try {
            return new c(this, sVar);
        } finally {
            this.J = null;
        }
    }

    @Override // s6.d
    public Object w1(e6.j jVar, p6.h hVar) throws p6.m {
        Class clsY;
        Object objY0;
        t6.s sVar = this.G;
        if (sVar != null && sVar.e() && jVar.O0(5) && this.G.d(jVar.l(), jVar)) {
            return x1(jVar, hVar);
        }
        if (this.f26917t) {
            return this.E != null ? Z1(jVar, hVar) : this.F != null ? X1(jVar, hVar) : y1(jVar, hVar);
        }
        Object objA = this.f26913g.A(hVar);
        jVar.c1(objA);
        if (jVar.c() && (objY0 = jVar.y0()) != null) {
            l1(jVar, hVar, objA, objY0);
        }
        if (this.f26920w != null) {
            I1(hVar, objA);
        }
        if (this.B && (clsY = hVar.Y()) != null) {
            return b2(jVar, hVar, objA, clsY);
        }
        if (jVar.O0(5)) {
            String strL = jVar.l();
            do {
                jVar.X0();
                u uVarO = this.f26919v.o(strL);
                if (uVarO != null) {
                    try {
                        uVarO.n(jVar, hVar, objA);
                    } catch (Exception e10) {
                        O1(e10, objA, strL, hVar);
                    }
                } else {
                    H1(jVar, hVar, objA, strL);
                }
                strL = jVar.V0();
            } while (strL != null);
        }
        return objA;
    }

    protected c(d dVar) {
        super(dVar, dVar.A);
    }

    protected c(d dVar, boolean z10) {
        super(dVar, z10);
    }

    protected c(d dVar, i7.s sVar) {
        super(dVar, sVar);
    }

    public c(d dVar, t6.s sVar) {
        super(dVar, sVar);
    }

    public c(d dVar, Set set, Set set2) {
        super(dVar, set, set2);
    }

    public c(d dVar, t6.c cVar) {
        super(dVar, cVar);
    }
}
