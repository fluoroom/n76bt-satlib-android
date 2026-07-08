package v;

import v.e;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a */
    static boolean[] f29454a = new boolean[3];

    static void a(f fVar, s.d dVar, e eVar) {
        eVar.f29374t = -1;
        eVar.f29376u = -1;
        e.b bVar = fVar.Z[0];
        e.b bVar2 = e.b.WRAP_CONTENT;
        if (bVar != bVar2 && eVar.Z[0] == e.b.MATCH_PARENT) {
            int i10 = eVar.O.f29323g;
            int iW = fVar.W() - eVar.Q.f29323g;
            d dVar2 = eVar.O;
            dVar2.f29325i = dVar.q(dVar2);
            d dVar3 = eVar.Q;
            dVar3.f29325i = dVar.q(dVar3);
            dVar.f(eVar.O.f29325i, i10);
            dVar.f(eVar.Q.f29325i, iW);
            eVar.f29374t = 2;
            eVar.P0(i10, iW);
        }
        if (fVar.Z[1] == bVar2 || eVar.Z[1] != e.b.MATCH_PARENT) {
            return;
        }
        int i11 = eVar.P.f29323g;
        int iX = fVar.x() - eVar.R.f29323g;
        d dVar4 = eVar.P;
        dVar4.f29325i = dVar.q(dVar4);
        d dVar5 = eVar.R;
        dVar5.f29325i = dVar.q(dVar5);
        dVar.f(eVar.P.f29325i, i11);
        dVar.f(eVar.R.f29325i, iX);
        if (eVar.f29359l0 > 0 || eVar.V() == 8) {
            d dVar6 = eVar.S;
            dVar6.f29325i = dVar.q(dVar6);
            dVar.f(eVar.S.f29325i, eVar.f29359l0 + i11);
        }
        eVar.f29376u = 2;
        eVar.g1(i11, iX);
    }

    public static final boolean b(int i10, int i11) {
        return (i10 & i11) == i11;
    }
}
