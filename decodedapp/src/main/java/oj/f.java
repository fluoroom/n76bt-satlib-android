package oj;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {
    private static pi.b a(pi.b bVar, pi.b bVar2) {
        return (pi.b) ((pi.b) ((pi.b) bVar.T(bVar2)).i()).L(2);
    }

    private static pi.b b(pi.b bVar, pi.b bVar2) {
        return (pi.b) ((pi.b) ((pi.b) ((pi.b) ((pi.b) bVar.n()).negate()).O((pi.b) bVar2.n())).add(1.0d)).h();
    }

    public static pi.b c(pi.b bVar, pi.b bVar2, pi.b bVar3) {
        aj.f fVarQ = aj.d.Q(bVar3);
        return (pi.b) bVar3.O((pi.b) ((pi.b) bVar.N((pi.b) fVarQ.b())).O((pi.b) bVar2.N((pi.b) fVarQ.a())));
    }

    public static pi.b d(pi.b bVar, pi.b bVar2, pi.b bVar3) {
        pi.b bVarB = b(bVar, bVar2);
        aj.f fVarQ = aj.d.Q(bVar3);
        pi.b bVar4 = (pi.b) fVarQ.a();
        pi.b bVar5 = (pi.b) fVarQ.b();
        return (pi.b) bVar3.H(a((pi.b) ((pi.b) bVar.N(bVar5)).O((pi.b) bVar2.N(bVar4)), (pi.b) ((pi.b) ((pi.b) bVarB.add(1.0d)).O((pi.b) bVar.N(bVar4))).O((pi.b) bVar2.N(bVar5))));
    }

    public static pi.b e(pi.b bVar, pi.b bVar2, pi.b bVar3) {
        pi.b bVar4;
        boolean z10;
        pi.b bVar5 = (pi.b) bVar3.q().a();
        pi.b bVar6 = bVar3;
        int i10 = 0;
        while (true) {
            aj.f fVarQ = aj.d.Q(bVar6);
            pi.b bVar7 = (pi.b) ((pi.b) bVar.N((pi.b) fVarQ.b())).O((pi.b) bVar2.N((pi.b) fVarQ.a()));
            pi.b bVar8 = (pi.b) ((pi.b) ((pi.b) ((pi.b) bVar.negate()).N((pi.b) fVarQ.a())).O((pi.b) bVar2.N((pi.b) fVarQ.b()))).add(1.0d);
            pi.b bVar9 = (pi.b) bVar5.O(bVar7);
            pi.b bVar10 = (pi.b) bVar8.L(2);
            pi.b bVar11 = (pi.b) ((pi.b) bVar9.N(bVar10)).T((pi.b) ((pi.b) bVar8.N(bVar10)).O((pi.b) bVar9.N(bVar7)));
            bVar5 = (pi.b) bVar5.O(bVar11);
            bVar4 = (pi.b) bVar3.H(bVar5);
            z10 = aj.d.b(bVar11.s()) <= 1.0E-11d;
            i10++;
            if (i10 >= 50 || z10) {
                break;
            }
            bVar6 = bVar4;
        }
        if (z10) {
            return bVar4;
        }
        throw new hj.a(hj.f.UNABLE_TO_COMPUTE_ECCENTRIC_LATITUDE_ARGUMENT, Integer.valueOf(i10));
    }

    public static pi.b f(pi.b bVar, pi.b bVar2, pi.b bVar3) {
        return d(bVar, bVar2, e(bVar, bVar2, bVar3));
    }

    public static pi.b g(pi.b bVar, pi.b bVar2, pi.b bVar3) {
        pi.b bVarB = b(bVar, bVar2);
        aj.f fVarQ = aj.d.Q(bVar3);
        pi.b bVar4 = (pi.b) fVarQ.a();
        pi.b bVar5 = (pi.b) fVarQ.b();
        return (pi.b) bVar3.H(a((pi.b) ((pi.b) bVar2.N(bVar4)).O((pi.b) bVar.N(bVar5)), (pi.b) ((pi.b) bVarB.add(1.0d)).H((pi.b) ((pi.b) bVar.N(bVar4)).H((pi.b) bVar2.N(bVar5)))));
    }

    public static pi.b h(pi.b bVar, pi.b bVar2, pi.b bVar3) {
        return c(bVar, bVar2, g(bVar, bVar2, bVar3));
    }
}
