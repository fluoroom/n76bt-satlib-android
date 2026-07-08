package ke;

import eg.f2;
import he.b;
import he.b1;
import he.g1;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class i extends s implements he.d {
    protected final boolean N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected i(he.e eVar, he.l lVar, ie.h hVar, boolean z10, b.a aVar, g1 g1Var) {
        super(eVar, lVar, hVar, mf.h.f22019j, aVar, g1Var);
        if (eVar == null) {
            K(0);
        }
        if (hVar == null) {
            K(1);
        }
        if (aVar == null) {
            K(2);
        }
        if (g1Var == null) {
            K(3);
        }
        this.N = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void K(int r8) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ke.i.K(int):void");
    }

    private List k1() {
        he.e eVarB = b();
        if (eVarB.H0().isEmpty()) {
            List list = Collections.EMPTY_LIST;
            if (list == null) {
                K(16);
            }
            return list;
        }
        List listH0 = eVarB.H0();
        if (listH0 == null) {
            K(15);
        }
        return listH0;
    }

    public static i n1(he.e eVar, ie.h hVar, boolean z10, g1 g1Var) {
        if (eVar == null) {
            K(4);
        }
        if (hVar == null) {
            K(5);
        }
        if (g1Var == null) {
            K(6);
        }
        return new i(eVar, null, hVar, z10, b.a.DECLARATION, g1Var);
    }

    @Override // he.l
    public boolean D() {
        return this.N;
    }

    @Override // he.l
    public he.e E() {
        he.e eVarB = b();
        if (eVarB == null) {
            K(18);
        }
        return eVarB;
    }

    @Override // ke.s, he.z, he.b, he.a
    public Collection e() {
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            K(21);
        }
        return set;
    }

    public b1 l1() {
        he.e eVarB = b();
        if (!eVarB.N()) {
            return null;
        }
        he.m mVarB = eVarB.b();
        if (mVarB instanceof he.e) {
            return ((he.e) mVarB).J0();
        }
        return null;
    }

    @Override // he.b
    /* JADX INFO: renamed from: m1, reason: merged with bridge method [inline-methods] */
    public he.d Q(he.m mVar, he.e0 e0Var, he.u uVar, b.a aVar, boolean z10) {
        he.d dVar = (he.d) super.K0(mVar, e0Var, uVar, aVar, z10);
        if (dVar == null) {
            K(27);
        }
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ke.s
    public i o1(he.m mVar, he.z zVar, b.a aVar, mf.f fVar, ie.h hVar, g1 g1Var) {
        if (mVar == null) {
            K(23);
        }
        if (aVar == null) {
            K(24);
        }
        if (hVar == null) {
            K(25);
        }
        if (g1Var == null) {
            K(26);
        }
        b.a aVar2 = b.a.DECLARATION;
        if (aVar == aVar2 || aVar == b.a.SYNTHESIZED) {
            return new i((he.e) mVar, this, hVar, this.N, aVar2, g1Var);
        }
        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + mVar + "\nkind: " + aVar);
    }

    @Override // ke.n, he.m
    /* JADX INFO: renamed from: p1, reason: merged with bridge method [inline-methods] */
    public he.e b() {
        he.e eVar = (he.e) super.b();
        if (eVar == null) {
            K(17);
        }
        return eVar;
    }

    public i q1(List list, he.u uVar) {
        if (list == null) {
            K(13);
        }
        if (uVar == null) {
            K(14);
        }
        r1(list, uVar, b().v());
        return this;
    }

    public i r1(List list, he.u uVar, List list2) {
        if (list == null) {
            K(10);
        }
        if (uVar == null) {
            K(11);
        }
        if (list2 == null) {
            K(12);
        }
        super.R0(null, l1(), k1(), list2, list, null, he.e0.f15259b, uVar);
        return this;
    }

    @Override // ke.s, he.m
    public Object t0(he.o oVar, Object obj) {
        return oVar.e(this, obj);
    }

    @Override // ke.s, he.b
    public void x0(Collection collection) {
        if (collection == null) {
            K(22);
        }
    }

    @Override // ke.s, he.z, he.i1
    public he.d c(f2 f2Var) {
        if (f2Var == null) {
            K(20);
        }
        return (he.d) super.c(f2Var);
    }

    @Override // ke.s, ke.n, ke.m, he.m
    public he.d a() {
        he.d dVar = (he.d) super.a();
        if (dVar == null) {
            K(19);
        }
        return dVar;
    }
}
