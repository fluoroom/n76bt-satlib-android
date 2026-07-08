package zd;

import be.v2;
import be.y0;
import be.z2;
import ed.q;
import eg.b2;
import eg.c1;
import eg.c2;
import eg.j1;
import eg.m2;
import eg.q1;
import eg.r0;
import eg.u0;
import eg.u1;
import he.h;
import he.l1;
import java.util.ArrayList;
import java.util.List;
import rd.m;
import yd.d;
import yd.o;
import yd.p;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f33116a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.f32530a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.f32531b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.f32532c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f33116a = iArr;
        }
    }

    private static final c1 a(q1 q1Var, u1 u1Var, List list, boolean z10) {
        b2 j1Var;
        List parameters = u1Var.getParameters();
        m.d(parameters, "getParameters(...)");
        ArrayList arrayList = new ArrayList(q.v(list, 10));
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                q.u();
            }
            o oVar = (o) obj;
            v2 v2Var = (v2) oVar.c();
            r0 r0VarN = v2Var != null ? v2Var.n() : null;
            p pVarD = oVar.d();
            int i12 = pVarD == null ? -1 : a.f33116a[pVarD.ordinal()];
            if (i12 == -1) {
                Object obj2 = parameters.get(i10);
                m.d(obj2, "get(...)");
                j1Var = new j1((l1) obj2);
            } else if (i12 == 1) {
                m2 m2Var = m2.f12140e;
                m.b(r0VarN);
                j1Var = new c2(m2Var, r0VarN);
            } else if (i12 == 2) {
                m2 m2Var2 = m2.f12141f;
                m.b(r0VarN);
                j1Var = new c2(m2Var2, r0VarN);
            } else {
                if (i12 != 3) {
                    throw new dd.o();
                }
                m2 m2Var3 = m2.f12142g;
                m.b(r0VarN);
                j1Var = new c2(m2Var3, r0VarN);
            }
            arrayList.add(j1Var);
            i10 = i11;
        }
        return u0.k(q1Var, u1Var, arrayList, z10, null, 16, null);
    }

    public static final yd.m b(d dVar, List list, boolean z10, List list2) {
        h hVarE;
        m.e(dVar, "<this>");
        m.e(list, "arguments");
        m.e(list2, "annotations");
        y0 y0Var = dVar instanceof y0 ? (y0) dVar : null;
        if (y0Var == null || (hVarE = y0Var.e()) == null) {
            throw new z2("Cannot create type for an unsupported classifier: " + dVar + " (" + dVar.getClass() + ')');
        }
        u1 u1VarK = hVarE.k();
        m.d(u1VarK, "getTypeConstructor(...)");
        List parameters = u1VarK.getParameters();
        m.d(parameters, "getParameters(...)");
        if (parameters.size() == list.size()) {
            return new v2(a(list2.isEmpty() ? q1.f12167b.k() : q1.f12167b.k(), u1VarK, list, z10), null, 2, null);
        }
        throw new IllegalArgumentException("Class declares " + parameters.size() + " type parameters, but " + list.size() + " were provided.");
    }
}
