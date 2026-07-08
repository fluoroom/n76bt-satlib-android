package eg;

import eg.t1;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a */
    public static final g f12094a = new g();

    /* JADX INFO: renamed from: b */
    public static boolean f12095b;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f12096a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f12097b;

        static {
            int[] iArr = new int[ig.v.values().length];
            try {
                iArr[ig.v.f16121d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ig.v.f16120c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ig.v.f16119b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f12096a = iArr;
            int[] iArr2 = new int[t1.b.values().length];
            try {
                iArr2[t1.b.f12194a.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[t1.b.f12195b.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[t1.b.f12196c.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f12097b = iArr2;
        }
    }

    private g() {
    }

    private final List A(t1 t1Var, List list) {
        int i10;
        ig.r rVarJ = t1Var.j();
        if (list.size() >= 2) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                ig.l lVarX = rVarJ.X((ig.j) obj);
                int iY = rVarJ.Y(lVarX);
                while (true) {
                    if (i10 >= iY) {
                        arrayList.add(obj);
                        break;
                    }
                    ig.i iVarF0 = rVarJ.f0(rVarJ.s0(lVarX, i10));
                    i10 = (iVarF0 != null ? rVarJ.j0(iVarF0) : null) == null ? i10 + 1 : 0;
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return list;
    }

    private final Boolean c(t1 t1Var, ig.j jVar, ig.j jVar2) {
        ig.r rVarJ = t1Var.j();
        if (!rVarJ.d0(jVar) && !rVarJ.d0(jVar2)) {
            return null;
        }
        if (f(rVarJ, jVar) && f(rVarJ, jVar2)) {
            return Boolean.TRUE;
        }
        if (rVarJ.d0(jVar)) {
            if (g(rVarJ, t1Var, jVar, jVar2, false)) {
                return Boolean.TRUE;
            }
        } else if (rVarJ.d0(jVar2) && (e(rVarJ, jVar) || g(rVarJ, t1Var, jVar2, jVar, true))) {
            return Boolean.TRUE;
        }
        return null;
    }

    private static final boolean d(ig.r rVar, ig.j jVar) {
        ig.i iVarF0;
        ig.j jVarN;
        return (jVar instanceof ig.d) && (iVarF0 = rVar.f0(rVar.F(rVar.C0((ig.d) jVar)))) != null && (jVarN = rVar.N(iVarF0)) != null && rVar.d0(jVarN);
    }

    private static final boolean e(ig.r rVar, ig.j jVar) {
        ig.p pVarF = rVar.f(jVar);
        if (!(pVarF instanceof ig.h)) {
            return false;
        }
        Collection collectionU0 = rVar.u0(pVarF);
        if (d.h0.a(collectionU0) && collectionU0.isEmpty()) {
            return false;
        }
        Iterator it = collectionU0.iterator();
        while (it.hasNext()) {
            ig.j jVarE = rVar.e((ig.i) it.next());
            if (jVarE != null && rVar.d0(jVarE)) {
                return true;
            }
        }
        return false;
    }

    private static final boolean f(ig.r rVar, ig.j jVar) {
        return rVar.d0(jVar) || d(rVar, jVar);
    }

    private static final boolean g(ig.r rVar, t1 t1Var, ig.j jVar, ig.j jVar2, boolean z10) {
        t1 t1Var2;
        ig.j jVar3;
        Collection<ig.i> collectionD0 = rVar.D0(jVar);
        if (d.h0.a(collectionD0) && collectionD0.isEmpty()) {
            return false;
        }
        for (ig.i iVar : collectionD0) {
            if (rd.m.a(rVar.A(iVar), rVar.f(jVar2))) {
                return true;
            }
            if (z10) {
                t1Var2 = t1Var;
                jVar3 = jVar2;
                if (v(f12094a, t1Var2, jVar3, iVar, false, 8, null)) {
                    return true;
                }
            } else {
                t1Var2 = t1Var;
                jVar3 = jVar2;
            }
            t1Var = t1Var2;
            jVar2 = jVar3;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:187:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Boolean h(eg.t1 r13, ig.j r14, ig.j r15) {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: eg.g.h(eg.t1, ig.j, ig.j):java.lang.Boolean");
    }

    private final List i(t1 t1Var, ig.j jVar, ig.p pVar) {
        t1.c cVarR;
        ig.r rVarJ = t1Var.j();
        List listU = rVarJ.u(jVar, pVar);
        if (listU != null) {
            return listU;
        }
        if (!rVarJ.t(pVar) && rVarJ.r0(jVar)) {
            return ed.q.k();
        }
        if (rVarJ.Q(pVar)) {
            if (!rVarJ.q(rVarJ.f(jVar), pVar)) {
                return ed.q.k();
            }
            ig.j jVarG0 = rVarJ.G0(jVar, ig.b.f16113a);
            if (jVarG0 != null) {
                jVar = jVarG0;
            }
            return ed.q.e(jVar);
        }
        og.j jVar2 = new og.j();
        t1Var.k();
        ArrayDeque arrayDequeH = t1Var.h();
        rd.m.b(arrayDequeH);
        Set setI = t1Var.i();
        rd.m.b(setI);
        arrayDequeH.push(jVar);
        while (!arrayDequeH.isEmpty()) {
            ig.j jVar3 = (ig.j) arrayDequeH.pop();
            rd.m.b(jVar3);
            if (setI.add(jVar3)) {
                ig.j jVarG02 = rVarJ.G0(jVar3, ig.b.f16113a);
                if (jVarG02 == null) {
                    jVarG02 = jVar3;
                }
                if (rVarJ.q(rVarJ.f(jVarG02), pVar)) {
                    jVar2.add(jVarG02);
                    cVarR = t1.c.C0166c.f12200a;
                } else {
                    cVarR = rVarJ.M(jVarG02) == 0 ? t1.c.b.f12199a : t1Var.j().r(jVarG02);
                }
                if (rd.m.a(cVarR, t1.c.C0166c.f12200a)) {
                    cVarR = null;
                }
                if (cVarR != null) {
                    ig.r rVarJ2 = t1Var.j();
                    Iterator it = rVarJ2.u0(rVarJ2.f(jVar3)).iterator();
                    while (it.hasNext()) {
                        arrayDequeH.add(cVarR.a(t1Var, (ig.i) it.next()));
                    }
                }
            }
        }
        t1Var.e();
        return jVar2;
    }

    private final List j(t1 t1Var, ig.j jVar, ig.p pVar) {
        return A(t1Var, i(t1Var, jVar, pVar));
    }

    private final boolean k(t1 t1Var, ig.i iVar, ig.i iVar2, boolean z10) {
        ig.r rVarJ = t1Var.j();
        ig.i iVarP = t1Var.p(t1Var.q(iVar));
        ig.i iVarP2 = t1Var.p(t1Var.q(iVar2));
        if (t1Var.m() && rVarJ.b0(iVarP) && rVarJ.c0(iVarP2)) {
            g gVar = f12094a;
            ig.g gVarJ0 = rVarJ.j0(iVarP);
            rd.m.b(gVarJ0);
            ig.j jVarC = rVarJ.c(gVarJ0);
            ig.j jVarE = rVarJ.e(iVarP2);
            rd.m.b(jVarE);
            return gVar.k(t1Var, jVarC, rVarJ.L(jVarE), z10);
        }
        g gVar2 = f12094a;
        Boolean boolH = gVar2.h(t1Var, rVarJ.C(iVarP), rVarJ.N(iVarP2));
        if (boolH == null) {
            Boolean boolC = t1Var.c(iVarP, iVarP2, z10);
            return boolC != null ? boolC.booleanValue() : gVar2.w(t1Var, rVarJ.C(iVarP), rVarJ.N(iVarP2));
        }
        boolean zBooleanValue = boolH.booleanValue();
        t1Var.c(iVarP, iVarP2, z10);
        return zBooleanValue;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x005a, code lost:
    
        return r7.a0(r7.A(r8), r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final ig.q o(ig.r r7, ig.i r8, ig.i r9) {
        /*
            r6 = this;
            int r0 = r7.M(r8)
            r1 = 0
            r2 = 0
        L6:
            r3 = 0
            if (r2 >= r0) goto L5e
            ig.m r4 = r7.m(r8, r2)
            boolean r5 = r7.h(r4)
            if (r5 != 0) goto L14
            r3 = r4
        L14:
            if (r3 == 0) goto L5b
            ig.i r3 = r7.f0(r3)
            if (r3 != 0) goto L1d
            goto L5b
        L1d:
            ig.j r4 = r7.C(r3)
            boolean r4 = r7.i(r4)
            if (r4 == 0) goto L33
            ig.j r4 = r7.C(r9)
            boolean r4 = r7.i(r4)
            if (r4 == 0) goto L33
            r4 = 1
            goto L34
        L33:
            r4 = 0
        L34:
            boolean r5 = rd.m.a(r3, r9)
            if (r5 != 0) goto L52
            if (r4 == 0) goto L4b
            ig.p r4 = r7.A(r3)
            ig.p r5 = r7.A(r9)
            boolean r4 = rd.m.a(r4, r5)
            if (r4 == 0) goto L4b
            goto L52
        L4b:
            ig.q r3 = r6.o(r7, r3, r9)
            if (r3 == 0) goto L5b
            return r3
        L52:
            ig.p r8 = r7.A(r8)
            ig.q r7 = r7.a0(r8, r2)
            return r7
        L5b:
            int r2 = r2 + 1
            goto L6
        L5e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: eg.g.o(ig.r, ig.i, ig.i):ig.q");
    }

    private final boolean p(t1 t1Var, ig.j jVar) {
        ig.r rVarJ = t1Var.j();
        ig.p pVarF = rVarJ.f(jVar);
        if (rVarJ.t(pVarF)) {
            return rVarJ.q0(pVarF);
        }
        if (rVarJ.q0(rVarJ.f(jVar))) {
            return true;
        }
        t1Var.k();
        ArrayDeque arrayDequeH = t1Var.h();
        rd.m.b(arrayDequeH);
        Set setI = t1Var.i();
        rd.m.b(setI);
        arrayDequeH.push(jVar);
        while (!arrayDequeH.isEmpty()) {
            ig.j jVar2 = (ig.j) arrayDequeH.pop();
            rd.m.b(jVar2);
            if (setI.add(jVar2)) {
                t1.c cVar = rVarJ.r0(jVar2) ? t1.c.C0166c.f12200a : t1.c.b.f12199a;
                if (rd.m.a(cVar, t1.c.C0166c.f12200a)) {
                    cVar = null;
                }
                if (cVar == null) {
                    continue;
                } else {
                    ig.r rVarJ2 = t1Var.j();
                    Iterator it = rVarJ2.u0(rVarJ2.f(jVar2)).iterator();
                    while (it.hasNext()) {
                        ig.j jVarA = cVar.a(t1Var, (ig.i) it.next());
                        if (rVarJ.q0(rVarJ.f(jVarA))) {
                            t1Var.e();
                            return true;
                        }
                        arrayDequeH.add(jVarA);
                    }
                }
            }
        }
        t1Var.e();
        return false;
    }

    private final boolean q(ig.r rVar, ig.i iVar) {
        return (!rVar.F0(rVar.A(iVar)) || rVar.x(iVar) || rVar.c0(iVar) || rVar.s(iVar) || rVar.n0(iVar)) ? false : true;
    }

    private final boolean r(ig.r rVar, ig.j jVar, ig.j jVar2) {
        if (rVar.f(jVar) != rVar.f(jVar2)) {
            return false;
        }
        if (rVar.I0(jVar) || !rVar.I0(jVar2)) {
            return !rVar.T(jVar) || rVar.T(jVar2);
        }
        return false;
    }

    public static /* synthetic */ boolean v(g gVar, t1 t1Var, ig.i iVar, ig.i iVar2, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        return gVar.u(t1Var, iVar, iVar2, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean w(eg.t1 r18, ig.j r19, ig.j r20) {
        /*
            Method dump skipped, instruction units count: 436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: eg.g.w(eg.t1, ig.j, ig.j):boolean");
    }

    public static final dd.d0 x(Collection collection, t1 t1Var, ig.r rVar, ig.j jVar, t1.a aVar) {
        rd.m.e(aVar, "$this$runForkingPoint");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            aVar.a(new f(t1Var, rVar, (ig.j) it.next(), jVar));
        }
        return dd.d0.f10897a;
    }

    public static final boolean y(t1 t1Var, ig.r rVar, ig.j jVar, ig.j jVar2) {
        return f12094a.s(t1Var, rVar.X(jVar), jVar2);
    }

    private final boolean z(ig.r rVar, ig.i iVar, ig.i iVar2, ig.p pVar) {
        ig.j jVarE = rVar.e(iVar);
        if (jVarE instanceof ig.d) {
            ig.d dVar = (ig.d) jVarE;
            if (rVar.i0(dVar) || !rVar.h(rVar.F(rVar.C0(dVar))) || rVar.x0(dVar) != ig.b.f16113a) {
                return false;
            }
            rVar.A(iVar2);
        }
        return false;
    }

    public final ig.v l(ig.v vVar, ig.v vVar2) {
        rd.m.e(vVar, "declared");
        rd.m.e(vVar2, "useSite");
        ig.v vVar3 = ig.v.f16121d;
        if (vVar == vVar3) {
            return vVar2;
        }
        if (vVar2 == vVar3 || vVar == vVar2) {
            return vVar;
        }
        return null;
    }

    public final boolean m(t1 t1Var, ig.i iVar, ig.i iVar2) {
        rd.m.e(t1Var, "state");
        rd.m.e(iVar, "a");
        rd.m.e(iVar2, "b");
        ig.r rVarJ = t1Var.j();
        if (iVar == iVar2) {
            return true;
        }
        g gVar = f12094a;
        if (gVar.q(rVarJ, iVar) && gVar.q(rVarJ, iVar2)) {
            ig.i iVarP = t1Var.p(t1Var.q(iVar));
            ig.i iVarP2 = t1Var.p(t1Var.q(iVar2));
            ig.j jVarC = rVarJ.C(iVarP);
            if (!rVarJ.q(rVarJ.A(iVarP), rVarJ.A(iVarP2))) {
                return false;
            }
            if (rVarJ.M(jVarC) == 0) {
                return rVarJ.E0(iVarP) || rVarJ.E0(iVarP2) || rVarJ.T(jVarC) == rVarJ.T(rVarJ.C(iVarP2));
            }
        }
        return v(gVar, t1Var, iVar, iVar2, false, 8, null) && v(gVar, t1Var, iVar2, iVar, false, 8, null);
    }

    public final List n(t1 t1Var, ig.j jVar, ig.p pVar) {
        t1.c cVar;
        rd.m.e(t1Var, "state");
        rd.m.e(jVar, "subType");
        rd.m.e(pVar, "superConstructor");
        ig.r rVarJ = t1Var.j();
        if (rVarJ.r0(jVar)) {
            return f12094a.j(t1Var, jVar, pVar);
        }
        if (!rVarJ.t(pVar) && !rVarJ.S(pVar)) {
            return f12094a.i(t1Var, jVar, pVar);
        }
        og.j<ig.j> jVar2 = new og.j();
        t1Var.k();
        ArrayDeque arrayDequeH = t1Var.h();
        rd.m.b(arrayDequeH);
        Set setI = t1Var.i();
        rd.m.b(setI);
        arrayDequeH.push(jVar);
        while (!arrayDequeH.isEmpty()) {
            ig.j jVar3 = (ig.j) arrayDequeH.pop();
            rd.m.b(jVar3);
            if (setI.add(jVar3)) {
                if (rVarJ.r0(jVar3)) {
                    jVar2.add(jVar3);
                    cVar = t1.c.C0166c.f12200a;
                } else {
                    cVar = t1.c.b.f12199a;
                }
                if (rd.m.a(cVar, t1.c.C0166c.f12200a)) {
                    cVar = null;
                }
                if (cVar != null) {
                    ig.r rVarJ2 = t1Var.j();
                    Iterator it = rVarJ2.u0(rVarJ2.f(jVar3)).iterator();
                    while (it.hasNext()) {
                        arrayDequeH.add(cVar.a(t1Var, (ig.i) it.next()));
                    }
                }
            }
        }
        t1Var.e();
        ArrayList arrayList = new ArrayList();
        for (ig.j jVar4 : jVar2) {
            g gVar = f12094a;
            rd.m.b(jVar4);
            ed.q.A(arrayList, gVar.j(t1Var, jVar4, pVar));
        }
        return arrayList;
    }

    public final boolean s(t1 t1Var, ig.l lVar, ig.j jVar) {
        boolean zM;
        t1 t1Var2 = t1Var;
        rd.m.e(t1Var2, "<this>");
        rd.m.e(lVar, "capturedSubArguments");
        rd.m.e(jVar, "superType");
        ig.r rVarJ = t1Var2.j();
        ig.p pVarF = rVarJ.f(jVar);
        int iY = rVarJ.Y(lVar);
        int iG0 = rVarJ.g0(pVarF);
        if (iY != iG0 || iY != rVarJ.M(jVar)) {
            return false;
        }
        for (int i10 = 0; i10 < iG0; i10++) {
            ig.m mVarM = rVarJ.m(jVar, i10);
            ig.i iVarF0 = rVarJ.f0(mVarM);
            if (iVarF0 != null) {
                ig.m mVarS0 = rVarJ.s0(lVar, i10);
                rVarJ.m0(mVarS0);
                ig.v vVar = ig.v.f16121d;
                ig.i iVarF02 = rVarJ.f0(mVarS0);
                rd.m.b(iVarF02);
                g gVar = f12094a;
                ig.v vVarL = gVar.l(rVarJ.k(rVarJ.a0(pVarF, i10)), rVarJ.m0(mVarM));
                if (vVarL == null) {
                    return t1Var2.n();
                }
                if (vVarL != vVar || (!gVar.z(rVarJ, iVarF02, iVarF0, pVarF) && !gVar.z(rVarJ, iVarF0, iVarF02, pVarF))) {
                    if (t1Var2.f12189h > 100) {
                        throw new IllegalStateException(("Arguments depth is too high. Some related argument: " + iVarF02).toString());
                    }
                    t1Var2.f12189h++;
                    int i11 = a.f12096a[vVarL.ordinal()];
                    if (i11 == 1) {
                        zM = gVar.m(t1Var2, iVarF02, iVarF0);
                    } else if (i11 == 2) {
                        t1Var2 = t1Var;
                        zM = v(gVar, t1Var2, iVarF02, iVarF0, false, 8, null);
                    } else {
                        if (i11 != 3) {
                            throw new dd.o();
                        }
                        zM = v(gVar, t1Var2, iVarF0, iVarF02, false, 8, null);
                        t1Var2 = t1Var;
                    }
                    t1Var2.f12189h--;
                    if (!zM) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final boolean t(t1 t1Var, ig.i iVar, ig.i iVar2) {
        rd.m.e(t1Var, "state");
        rd.m.e(iVar, "subType");
        rd.m.e(iVar2, "superType");
        return v(this, t1Var, iVar, iVar2, false, 8, null);
    }

    public final boolean u(t1 t1Var, ig.i iVar, ig.i iVar2, boolean z10) {
        rd.m.e(t1Var, "state");
        rd.m.e(iVar, "subType");
        rd.m.e(iVar2, "superType");
        if (iVar == iVar2) {
            return true;
        }
        if (t1Var.f(iVar, iVar2)) {
            return k(t1Var, iVar, iVar2, z10);
        }
        return false;
    }
}
