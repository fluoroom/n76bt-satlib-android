package ce;

import be.l3;
import be.z2;
import ed.q;
import eg.c1;
import eg.e2;
import eg.i2;
import eg.r0;
import he.b1;
import he.i0;
import he.s1;
import he.t1;
import he.y0;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o {
    private static final boolean a(Member member) {
        if (member.getDeclaringClass() == null) {
            return false;
        }
        return !pd.a.e(r0).m();
    }

    public static final void g(h hVar, int i10, he.b bVar, boolean z10) {
        if (j.a(hVar) == i10) {
            return;
        }
        throw new z2("Inconsistent number of parameters in the descriptor and Java reflection object: " + j.a(hVar) + " != " + i10 + "\nCalling: " + bVar + "\nParameter types: " + hVar.j() + ")\nDefault: " + z10);
    }

    public static final Object h(Object obj, he.b bVar) {
        r0 r0VarL;
        Class clsS;
        Method methodM;
        rd.m.e(bVar, "descriptor");
        return (((bVar instanceof y0) && qf.k.e((t1) bVar)) || (r0VarL = l(bVar)) == null || (clsS = s(r0VarL)) == null || (methodM = m(clsS, bVar)) == null) ? obj : methodM.invoke(obj, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final ce.h i(ce.h r3, he.b r4, boolean r5) {
        /*
            java.lang.String r0 = "<this>"
            rd.m.e(r3, r0)
            java.lang.String r0 = "descriptor"
            rd.m.e(r4, r0)
            boolean r0 = qf.k.a(r4)
            if (r0 != 0) goto L90
            java.util.List r0 = r4.q0()
            java.lang.String r1 = "getContextReceiverParameters(...)"
            rd.m.d(r0, r1)
            boolean r1 = d.h0.a(r0)
            java.lang.String r2 = "getType(...)"
            if (r1 == 0) goto L28
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L28
            goto L46
        L28:
            java.util.Iterator r0 = r0.iterator()
        L2c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L46
            java.lang.Object r1 = r0.next()
            he.b1 r1 = (he.b1) r1
            eg.r0 r1 = r1.getType()
            rd.m.d(r1, r2)
            boolean r1 = qf.k.h(r1)
            if (r1 == 0) goto L2c
            goto L90
        L46:
            java.util.List r0 = r4.i()
            java.lang.String r1 = "getValueParameters(...)"
            rd.m.d(r0, r1)
            boolean r1 = d.h0.a(r0)
            if (r1 == 0) goto L5c
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L5c
            goto L7a
        L5c:
            java.util.Iterator r0 = r0.iterator()
        L60:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L7a
            java.lang.Object r1 = r0.next()
            he.s1 r1 = (he.s1) r1
            eg.r0 r1 = r1.getType()
            rd.m.d(r1, r2)
            boolean r1 = qf.k.h(r1)
            if (r1 == 0) goto L60
            goto L90
        L7a:
            eg.r0 r0 = r4.g()
            if (r0 == 0) goto L88
            boolean r0 = qf.k.c(r0)
            r1 = 1
            if (r0 != r1) goto L88
            goto L90
        L88:
            boolean r0 = q(r4)
            if (r0 == 0) goto L8f
            goto L90
        L8f:
            return r3
        L90:
            ce.n r0 = new ce.n
            r0.<init>(r4, r3, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ce.o.i(ce.h, he.b, boolean):ce.h");
    }

    public static /* synthetic */ h j(h hVar, he.b bVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return i(hVar, bVar, z10);
    }

    public static final Method k(Class cls, he.b bVar) {
        try {
            Method declaredMethod = cls.getDeclaredMethod("box-impl", m(cls, bVar).getReturnType());
            rd.m.b(declaredMethod);
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new z2("No box method found in inline class: " + cls + " (calling " + bVar + ')');
        }
    }

    private static final r0 l(he.b bVar) {
        b1 b1VarL0 = bVar.l0();
        b1 b1VarG0 = bVar.g0();
        if (b1VarL0 != null) {
            return b1VarL0.getType();
        }
        if (b1VarG0 == null) {
            return null;
        }
        if (bVar instanceof he.l) {
            return b1VarG0.getType();
        }
        he.m mVarB = bVar.b();
        he.e eVar = mVarB instanceof he.e ? (he.e) mVarB : null;
        if (eVar != null) {
            return eVar.s();
        }
        return null;
    }

    public static final Method m(Class cls, he.b bVar) {
        rd.m.e(cls, "<this>");
        rd.m.e(bVar, "descriptor");
        try {
            Method declaredMethod = cls.getDeclaredMethod("unbox-impl", null);
            rd.m.b(declaredMethod);
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new z2("No unbox method found in inline class: " + cls + " (calling " + bVar + ')');
        }
    }

    public static final List n(c1 c1Var) {
        rd.m.e(c1Var, "type");
        List listO = o(e2.a(c1Var));
        if (listO == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(q.v(listO, 10));
        Iterator it = listO.iterator();
        while (it.hasNext()) {
            arrayList.add("unbox-impl-" + ((String) it.next()));
        }
        he.h hVarQ = c1Var.N0().q();
        rd.m.c(hVarQ, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        Class clsQ = l3.q((he.e) hVarQ);
        rd.m.b(clsQ);
        ArrayList arrayList2 = new ArrayList(q.v(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(clsQ.getDeclaredMethod((String) it2.next(), null));
        }
        return arrayList2;
    }

    private static final List o(c1 c1Var) {
        Collection collectionE;
        if (!qf.k.i(c1Var)) {
            return null;
        }
        he.h hVarQ = c1Var.N0().q();
        rd.m.c(hVarQ, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        i0 i0VarT = uf.e.t((he.e) hVarQ);
        rd.m.b(i0VarT);
        List<dd.q> listC = i0VarT.c();
        ArrayList arrayList = new ArrayList();
        for (dd.q qVar : listC) {
            mf.f fVar = (mf.f) qVar.a();
            List listO = o((c1) qVar.b());
            if (listO != null) {
                collectionE = new ArrayList(q.v(listO, 10));
                Iterator it = listO.iterator();
                while (it.hasNext()) {
                    collectionE.add(fVar.f() + '-' + ((String) it.next()));
                }
            } else {
                collectionE = q.e(fVar.f());
            }
            q.A(arrayList, collectionE);
        }
        return arrayList;
    }

    public static final List p(c1 c1Var, he.b bVar) {
        Method methodM;
        List listN = n(c1Var);
        if (listN != null) {
            return listN;
        }
        Class clsS = s(c1Var);
        if (clsS == null || (methodM = m(clsS, bVar)) == null) {
            return null;
        }
        return q.e(methodM);
    }

    private static final boolean q(he.b bVar) {
        r0 r0VarL = l(bVar);
        return r0VarL != null && qf.k.h(r0VarL);
    }

    public static final List r(he.b bVar, Member member, qd.l lVar) {
        ArrayList arrayList = new ArrayList();
        b1 b1VarL0 = bVar.l0();
        r0 type = b1VarL0 != null ? b1VarL0.getType() : null;
        if (type != null) {
            arrayList.add(type);
        } else if (bVar instanceof he.l) {
            he.e eVarE = ((he.l) bVar).E();
            rd.m.d(eVarE, "getConstructedClass(...)");
            if (eVarE.N()) {
                he.m mVarB = eVarE.b();
                rd.m.c(mVarB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                arrayList.add(((he.e) mVarB).s());
            }
        } else {
            he.m mVarB2 = bVar.b();
            rd.m.d(mVarB2, "getContainingDeclaration(...)");
            if ((mVarB2 instanceof he.e) && ((Boolean) lVar.l(mVarB2)).booleanValue()) {
                if (member == null || !a(member)) {
                    arrayList.add(((he.e) mVarB2).s());
                } else {
                    c1 c1VarS = ((he.e) mVarB2).s();
                    rd.m.d(c1VarS, "getDefaultType(...)");
                    arrayList.add(jg.d.B(c1VarS));
                }
            }
        }
        List listI = bVar.i();
        rd.m.d(listI, "getValueParameters(...)");
        Iterator it = listI.iterator();
        while (it.hasNext()) {
            arrayList.add(((s1) it.next()).getType());
        }
        return arrayList;
    }

    public static final Class s(r0 r0Var) {
        r0 r0VarK;
        Class clsT = t(r0Var.N0().q());
        if (clsT == null) {
            return null;
        }
        if (i2.l(r0Var) && ((r0VarK = qf.k.k(r0Var)) == null || i2.l(r0VarK) || ee.i.t0(r0VarK))) {
            return null;
        }
        return clsT;
    }

    public static final Class t(he.m mVar) {
        if (!(mVar instanceof he.e) || !qf.k.b(mVar)) {
            return null;
        }
        he.e eVar = (he.e) mVar;
        Class clsQ = l3.q(eVar);
        if (clsQ != null) {
            return clsQ;
        }
        throw new z2("Class object for the class " + eVar.getName() + " cannot be found (classId=" + uf.e.n((he.h) mVar) + ')');
    }

    public static final String u(he.h hVar) {
        rd.m.e(hVar, "<this>");
        mf.b bVarN = uf.e.n(hVar);
        rd.m.b(bVarN);
        return lf.b.b(bVarN.b());
    }
}
