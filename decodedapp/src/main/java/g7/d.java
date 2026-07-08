package g7;

import com.fasterxml.jackson.databind.JavaType;
import d6.k;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends i0 implements e7.i, e7.o {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected static final p6.y f13581t = new p6.y("#object-ref");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected static final e7.c[] f13582u = new e7.c[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final JavaType f13583c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final e7.c[] f13584d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final e7.c[] f13585e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final e7.a f13586f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final Object f13587g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final x6.k f13588h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected final f7.i f13589r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected final k.c f13590s;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f13591a;

        static {
            int[] iArr = new int[k.c.values().length];
            f13591a = iArr;
            try {
                iArr[k.c.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13591a[k.c.NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13591a[k.c.NUMBER_INT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    protected d(JavaType javaType, e7.e eVar, e7.c[] cVarArr, e7.c[] cVarArr2) {
        super(javaType);
        this.f13583c = javaType;
        this.f13584d = cVarArr;
        this.f13585e = cVarArr2;
        if (eVar == null) {
            this.f13588h = null;
            this.f13586f = null;
            this.f13587g = null;
            this.f13589r = null;
            this.f13590s = null;
            return;
        }
        this.f13588h = eVar.h();
        this.f13586f = eVar.c();
        this.f13587g = eVar.e();
        this.f13589r = eVar.f();
        this.f13590s = eVar.d().g(null).i();
    }

    private static final e7.c[] H(e7.c[] cVarArr, i7.s sVar) {
        if (cVarArr == null || cVarArr.length == 0 || sVar == null || sVar == i7.s.f15919a) {
            return cVarArr;
        }
        int length = cVarArr.length;
        e7.c[] cVarArr2 = new e7.c[length];
        for (int i10 = 0; i10 < length; i10++) {
            e7.c cVar = cVarArr[i10];
            if (cVar != null) {
                cVarArr2[i10] = cVar.w(sVar);
            }
        }
        return cVarArr2;
    }

    protected final void A(Object obj, e6.g gVar, p6.d0 d0Var, boolean z10) throws IOException {
        f7.i iVar = this.f13589r;
        f7.u uVarY = d0Var.Y(obj, iVar.f12851c);
        if (uVarY.c(gVar, d0Var, iVar)) {
            return;
        }
        Object objA = uVarY.a(obj);
        if (iVar.f12853e) {
            iVar.f12852d.f(objA, gVar, d0Var);
            return;
        }
        if (z10) {
            gVar.a1(obj);
        }
        uVarY.b(gVar, d0Var, iVar);
        if (this.f13587g != null) {
            L(obj, gVar, d0Var);
        } else {
            K(obj, gVar, d0Var);
        }
        if (z10) {
            gVar.A0();
        }
    }

    protected final n6.c C(a7.h hVar, Object obj, e6.m mVar) {
        x6.k kVar = this.f13588h;
        if (kVar == null) {
            return hVar.d(obj, mVar);
        }
        Object objO = kVar.o(obj);
        if (objO == null) {
            objO = "";
        }
        return hVar.e(obj, mVar, objO);
    }

    protected abstract d D();

    protected p6.p G(p6.d0 d0Var, e7.c cVar) {
        x6.k kVarH;
        Object objH0;
        p6.b bVarI0 = d0Var.i0();
        if (bVarI0 == null || (kVarH = cVar.h()) == null || (objH0 = bVarI0.h0(kVarH)) == null) {
            return null;
        }
        i7.j jVarJ = d0Var.j(cVar.h(), objH0);
        JavaType javaTypeB = jVarJ.b(d0Var.l());
        return new d0(jVarJ, javaTypeB, javaTypeB.S() ? null : d0Var.e0(javaTypeB, cVar));
    }

    protected void K(Object obj, e6.g gVar, p6.d0 d0Var) throws IOException {
        e7.c[] cVarArr = (this.f13585e == null || d0Var.h0() == null) ? this.f13584d : this.f13585e;
        int i10 = 0;
        try {
            int length = cVarArr.length;
            while (i10 < length) {
                e7.c cVar = cVarArr[i10];
                if (cVar != null) {
                    cVar.z(obj, gVar, d0Var);
                }
                i10++;
            }
            e7.a aVar = this.f13586f;
            if (aVar != null) {
                aVar.b(obj, gVar, d0Var);
            }
        } catch (Exception e10) {
            w(d0Var, e10, obj, i10 != cVarArr.length ? cVarArr[i10].getName() : "[anySetter]");
        } catch (StackOverflowError e11) {
            p6.m mVar = new p6.m(gVar, "Infinite recursion (StackOverflowError)", e11);
            mVar.e(obj, i10 != cVarArr.length ? cVarArr[i10].getName() : "[anySetter]");
            throw mVar;
        }
    }

    protected void L(Object obj, e6.g gVar, p6.d0 d0Var) throws IOException {
        if (this.f13585e != null) {
            d0Var.h0();
        }
        s(d0Var, this.f13587g, obj);
        K(obj, gVar, d0Var);
    }

    protected abstract d N(Set set, Set set2);

    public abstract d O(Object obj);

    public abstract d Q(f7.i iVar);

    protected abstract d R(e7.c[] cVarArr, e7.c[] cVarArr2);

    @Override // e7.i
    public p6.p a(p6.d0 d0Var, p6.d dVar) throws v6.b {
        k.c cVarI;
        Object objR;
        Set setE;
        Set setH;
        int i10;
        d dVarO;
        f7.i iVarC;
        e7.c cVar;
        Object obj;
        x6.e0 e0VarL;
        p6.b bVarI0 = d0Var.i0();
        e7.c[] cVarArr = null;
        x6.k kVarH = (dVar == null || bVarI0 == null) ? null : dVar.h();
        p6.b0 b0VarK = d0Var.k();
        k.d dVarQ = q(d0Var, dVar, this.f13605a);
        int i11 = 2;
        if (dVarQ == null || !dVarQ.o()) {
            cVarI = null;
        } else {
            cVarI = dVarQ.i();
            if (cVarI != k.c.ANY && cVarI != this.f13590s) {
                if (this.f13583c.O()) {
                    int i12 = a.f13591a[cVarI.ordinal()];
                    if (i12 == 1 || i12 == 2 || i12 == 3) {
                        return d0Var.t0(m.A(this.f13583c.r(), d0Var.k(), b0VarK.G(this.f13583c), dVarQ), dVar);
                    }
                } else if (cVarI == k.c.NATURAL && ((!this.f13583c.T() || !Map.class.isAssignableFrom(this.f13605a)) && Map.Entry.class.isAssignableFrom(this.f13605a))) {
                    JavaType javaTypeI = this.f13583c.i(Map.Entry.class);
                    return d0Var.t0(new f7.h(this.f13583c, javaTypeI.h(0), javaTypeI.h(1), false, null, dVar), dVar);
                }
            }
        }
        f7.i iVarA = this.f13589r;
        if (kVarH != null) {
            setH = bVarI0.X(b0VarK, kVarH).h();
            setE = bVarI0.a0(b0VarK, kVarH).e();
            x6.e0 e0VarK = bVarI0.K(kVarH);
            if (e0VarK == null) {
                if (iVarA != null && (e0VarL = bVarI0.L(kVarH, null)) != null) {
                    iVarA = this.f13589r.b(e0VarL.b());
                }
                i10 = 0;
            } else {
                x6.e0 e0VarL2 = bVarI0.L(kVarH, e0VarK);
                Class clsC = e0VarL2.c();
                JavaType javaType = d0Var.l().X(d0Var.i(clsC), d6.k0.class)[0];
                if (clsC == d6.n0.class) {
                    String strC = e0VarL2.d().c();
                    int length = this.f13584d.length;
                    i10 = 0;
                    while (true) {
                        if (i10 == length) {
                            JavaType javaType2 = this.f13583c;
                            String strY = i7.h.Y(c());
                            String strV = i7.h.V(strC);
                            Object[] objArr = new Object[i11];
                            objArr[0] = strY;
                            objArr[1] = strV;
                            d0Var.q(javaType2, String.format("Invalid Object Id definition for %s: cannot find property with name %s", objArr));
                        }
                        cVar = this.f13584d[i10];
                        if (strC.equals(cVar.getName())) {
                            break;
                        }
                        i10++;
                        i11 = 2;
                    }
                    iVarA = f7.i.a(cVar.getType(), null, new f7.j(e0VarL2, cVar), e0VarL2.b());
                } else {
                    iVarA = f7.i.a(javaType, e0VarL2.d(), d0Var.o(kVarH, e0VarL2), e0VarL2.b());
                    i10 = 0;
                }
            }
            objR = bVarI0.r(kVarH);
            if (objR == null || ((obj = this.f13587g) != null && objR.equals(obj))) {
                objR = null;
            }
        } else {
            objR = null;
            setE = null;
            setH = null;
            i10 = 0;
        }
        if (i10 > 0) {
            e7.c[] cVarArr2 = this.f13584d;
            e7.c[] cVarArr3 = (e7.c[]) Arrays.copyOf(cVarArr2, cVarArr2.length);
            e7.c cVar2 = cVarArr3[i10];
            System.arraycopy(cVarArr3, 0, cVarArr3, 1, i10);
            cVarArr3[0] = cVar2;
            e7.c[] cVarArr4 = this.f13585e;
            if (cVarArr4 != null) {
                cVarArr = (e7.c[]) Arrays.copyOf(cVarArr4, cVarArr4.length);
                e7.c cVar3 = cVarArr[i10];
                System.arraycopy(cVarArr, 0, cVarArr, 1, i10);
                cVarArr[0] = cVar3;
            }
            dVarO = R(cVarArr3, cVarArr);
        } else {
            dVarO = this;
        }
        if (iVarA != null && (iVarC = iVarA.c(d0Var.e0(iVarA.f12849a, dVar))) != this.f13589r) {
            dVarO = dVarO.Q(iVarC);
        }
        if ((setH != null && !setH.isEmpty()) || setE != null) {
            dVarO = dVarO.N(setH, setE);
        }
        if (objR != null) {
            dVarO = dVarO.O(objR);
        }
        if (cVarI == null) {
            cVarI = this.f13590s;
        }
        return cVarI == k.c.ARRAY ? dVarO.D() : dVarO;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x008c  */
    @Override // e7.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(p6.d0 r8) throws p6.m {
        /*
            r7 = this;
            e7.c[] r0 = r7.f13585e
            r1 = 0
            if (r0 != 0) goto L7
            r0 = 0
            goto L8
        L7:
            int r0 = r0.length
        L8:
            e7.c[] r2 = r7.f13584d
            int r2 = r2.length
        Lb:
            if (r1 >= r2) goto L93
            e7.c[] r3 = r7.f13584d
            r3 = r3[r1]
            boolean r4 = r3.H()
            if (r4 != 0) goto L31
            boolean r4 = r3.t()
            if (r4 != 0) goto L31
            p6.p r4 = r8.X(r3)
            if (r4 == 0) goto L31
            r3.k(r4)
            if (r1 >= r0) goto L31
            e7.c[] r5 = r7.f13585e
            r5 = r5[r1]
            if (r5 == 0) goto L31
            r5.k(r4)
        L31:
            boolean r4 = r3.v()
            if (r4 == 0) goto L38
            goto L8f
        L38:
            p6.p r4 = r7.G(r8, r3)
            if (r4 != 0) goto L80
            com.fasterxml.jackson.databind.JavaType r4 = r3.q()
            if (r4 != 0) goto L5e
            com.fasterxml.jackson.databind.JavaType r4 = r3.getType()
            boolean r5 = r4.Q()
            if (r5 != 0) goto L5e
            boolean r5 = r4.L()
            if (r5 != 0) goto L5a
            int r5 = r4.g()
            if (r5 <= 0) goto L8f
        L5a:
            r3.D(r4)
            goto L8f
        L5e:
            p6.p r5 = r8.e0(r4, r3)
            boolean r6 = r4.L()
            if (r6 == 0) goto L7f
            com.fasterxml.jackson.databind.JavaType r4 = r4.k()
            java.lang.Object r4 = r4.v()
            a7.h r4 = (a7.h) r4
            if (r4 == 0) goto L7f
            boolean r6 = r5 instanceof e7.h
            if (r6 == 0) goto L7f
            e7.h r5 = (e7.h) r5
            e7.h r4 = r5.z(r4)
            goto L80
        L7f:
            r4 = r5
        L80:
            if (r1 >= r0) goto L8c
            e7.c[] r5 = r7.f13585e
            r5 = r5[r1]
            if (r5 == 0) goto L8c
            r5.l(r4)
            goto L8f
        L8c:
            r3.l(r4)
        L8f:
            int r1 = r1 + 1
            goto Lb
        L93:
            e7.a r0 = r7.f13586f
            if (r0 == 0) goto L9a
            r0.c(r8)
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g7.d.b(p6.d0):void");
    }

    @Override // p6.p
    public void g(Object obj, e6.g gVar, p6.d0 d0Var, a7.h hVar) throws IOException {
        if (this.f13589r != null) {
            z(obj, gVar, d0Var, hVar);
            return;
        }
        n6.c cVarC = C(hVar, obj, e6.m.START_OBJECT);
        hVar.g(gVar, cVarC);
        gVar.H(obj);
        if (this.f13587g != null) {
            L(obj, gVar, d0Var);
        } else {
            K(obj, gVar, d0Var);
        }
        hVar.h(gVar, cVarC);
    }

    @Override // p6.p
    public boolean i() {
        return this.f13589r != null;
    }

    protected void x(Object obj, e6.g gVar, p6.d0 d0Var, a7.h hVar, f7.u uVar) throws IOException {
        f7.i iVar = this.f13589r;
        n6.c cVarC = C(hVar, obj, e6.m.START_OBJECT);
        hVar.g(gVar, cVarC);
        gVar.H(obj);
        uVar.b(gVar, d0Var, iVar);
        if (this.f13587g != null) {
            L(obj, gVar, d0Var);
        } else {
            K(obj, gVar, d0Var);
        }
        hVar.h(gVar, cVarC);
    }

    protected final void z(Object obj, e6.g gVar, p6.d0 d0Var, a7.h hVar) throws IOException {
        f7.i iVar = this.f13589r;
        f7.u uVarY = d0Var.Y(obj, iVar.f12851c);
        if (uVarY.c(gVar, d0Var, iVar)) {
            return;
        }
        Object objA = uVarY.a(obj);
        if (iVar.f12853e) {
            iVar.f12852d.f(objA, gVar, d0Var);
        } else {
            x(obj, gVar, d0Var, hVar, uVarY);
        }
    }

    protected d(d dVar, e7.c[] cVarArr, e7.c[] cVarArr2) {
        super(dVar.f13605a);
        this.f13583c = dVar.f13583c;
        this.f13584d = cVarArr;
        this.f13585e = cVarArr2;
        this.f13588h = dVar.f13588h;
        this.f13586f = dVar.f13586f;
        this.f13589r = dVar.f13589r;
        this.f13587g = dVar.f13587g;
        this.f13590s = dVar.f13590s;
    }

    protected d(d dVar, f7.i iVar) {
        this(dVar, iVar, dVar.f13587g);
    }

    protected d(d dVar, f7.i iVar, Object obj) {
        super(dVar.f13605a);
        this.f13583c = dVar.f13583c;
        this.f13584d = dVar.f13584d;
        this.f13585e = dVar.f13585e;
        this.f13588h = dVar.f13588h;
        this.f13586f = dVar.f13586f;
        this.f13589r = iVar;
        this.f13587g = obj;
        this.f13590s = dVar.f13590s;
    }

    protected d(d dVar, Set set, Set set2) {
        super(dVar.f13605a);
        this.f13583c = dVar.f13583c;
        e7.c[] cVarArr = dVar.f13584d;
        e7.c[] cVarArr2 = dVar.f13585e;
        int length = cVarArr.length;
        ArrayList arrayList = new ArrayList(length);
        ArrayList arrayList2 = cVarArr2 == null ? null : new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            e7.c cVar = cVarArr[i10];
            if (!i7.o.c(cVar.getName(), set, set2)) {
                arrayList.add(cVar);
                if (cVarArr2 != null) {
                    arrayList2.add(cVarArr2[i10]);
                }
            }
        }
        this.f13584d = (e7.c[]) arrayList.toArray(new e7.c[arrayList.size()]);
        this.f13585e = arrayList2 != null ? (e7.c[]) arrayList2.toArray(new e7.c[arrayList2.size()]) : null;
        this.f13588h = dVar.f13588h;
        this.f13586f = dVar.f13586f;
        this.f13589r = dVar.f13589r;
        this.f13587g = dVar.f13587g;
        this.f13590s = dVar.f13590s;
    }

    protected d(d dVar, i7.s sVar) {
        this(dVar, H(dVar.f13584d, sVar), H(dVar.f13585e, sVar));
    }
}
