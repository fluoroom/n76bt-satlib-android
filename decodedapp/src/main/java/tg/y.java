package tg;

import hd.i;

/* JADX INFO: loaded from: classes3.dex */
public abstract class y {
    private static final hd.i d(hd.i iVar, hd.i iVar2, final boolean z10) {
        boolean zH = h(iVar);
        boolean zH2 = h(iVar2);
        if (!zH && !zH2) {
            return iVar.l(iVar2);
        }
        final rd.b0 b0Var = new rd.b0();
        b0Var.f25935a = iVar2;
        hd.j jVar = hd.j.f15243a;
        hd.i iVar3 = (hd.i) iVar.r(jVar, new qd.p() { // from class: tg.w
            @Override // qd.p
            public final Object s(Object obj, Object obj2) {
                return y.e(b0Var, z10, (hd.i) obj, (i.b) obj2);
            }
        });
        if (zH2) {
            b0Var.f25935a = ((hd.i) b0Var.f25935a).r(jVar, new qd.p() { // from class: tg.x
                @Override // qd.p
                public final Object s(Object obj, Object obj2) {
                    return y.f((hd.i) obj, (i.b) obj2);
                }
            });
        }
        return iVar3.l((hd.i) b0Var.f25935a);
    }

    public static final hd.i e(rd.b0 b0Var, boolean z10, hd.i iVar, i.b bVar) {
        return iVar.l(bVar);
    }

    public static final hd.i f(hd.i iVar, i.b bVar) {
        return iVar.l(bVar);
    }

    public static final String g(hd.i iVar) {
        return null;
    }

    private static final boolean h(hd.i iVar) {
        return ((Boolean) iVar.r(Boolean.FALSE, new qd.p() { // from class: tg.v
            @Override // qd.p
            public final Object s(Object obj, Object obj2) {
                return Boolean.valueOf(y.i(((Boolean) obj).booleanValue(), (i.b) obj2));
            }
        })).booleanValue();
    }

    public static final boolean i(boolean z10, i.b bVar) {
        return z10;
    }

    public static final hd.i j(hd.i iVar, hd.i iVar2) {
        return !h(iVar2) ? iVar.l(iVar2) : d(iVar, iVar2, false);
    }

    public static final hd.i k(d0 d0Var, hd.i iVar) {
        hd.i iVarD = d(d0Var.G(), iVar, true);
        return (iVarD == p0.a() || iVarD.a(hd.f.f15241k) != null) ? iVarD : iVarD.l(p0.a());
    }

    public static final a2 l(jd.e eVar) {
        while (!(eVar instanceof m0) && (eVar = eVar.b()) != null) {
            if (eVar instanceof a2) {
                return (a2) eVar;
            }
        }
        return null;
    }

    public static final a2 m(hd.e eVar, hd.i iVar, Object obj) {
        if (!(eVar instanceof jd.e) || iVar.a(b2.f27801a) == null) {
            return null;
        }
        a2 a2VarL = l((jd.e) eVar);
        if (a2VarL != null) {
            a2VarL.C0(iVar, obj);
        }
        return a2VarL;
    }
}
