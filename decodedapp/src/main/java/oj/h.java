package oj;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final double f23613a = 1.2043347651023166d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final double f23614b = 4.64788969626918d;

    private static pi.b a(pi.b bVar, pi.b bVar2) {
        pi.b bVar3 = (pi.b) ((pi.b) ((pi.b) bVar.negate()).add(1.0d)).N((pi.b) bVar2.g());
        pi.b bVar4 = (pi.b) ((pi.b) bVar2.n()).negate();
        pi.b bVar5 = (pi.b) ((pi.b) bVar2.q().a()).add(Double.NaN);
        double d10 = 0.0d;
        while (!Double.valueOf(bVar3.s()).equals(Double.valueOf(bVar5.s()))) {
            d10 += 2.0d;
            bVar2 = (pi.b) bVar2.N((pi.b) bVar4.x((d10 + 1.0d) * d10));
            bVar5 = bVar3;
            bVar3 = (pi.b) bVar3.O(bVar2);
        }
        return bVar3;
    }

    public static pi.b b(pi.b bVar, pi.b bVar2) {
        return (pi.b) bVar2.O((pi.b) bVar.N((pi.b) bVar2.g()));
    }

    public static pi.b c(pi.b bVar, pi.b bVar2) {
        pi.b bVar3 = (pi.b) bVar.T((pi.b) ((pi.b) ((pi.b) ((pi.b) ((pi.b) bVar.n()).negate()).add(1.0d)).h()).add(1.0d));
        aj.f fVarQ = aj.d.Q(bVar2);
        return (pi.b) bVar2.H((pi.b) ((pi.b) ((pi.b) ((pi.b) bVar3.N((pi.b) fVarQ.b())).T((pi.b) ((pi.b) ((pi.b) bVar3.N((pi.b) fVarQ.a())).j(1.0d)).negate())).i()).L(2));
    }

    public static pi.b d(pi.b bVar, pi.b bVar2) {
        pi.b bVar3;
        pi.b bVar4;
        pi.b bVar5;
        pi.b bVarG = aj.j.g(bVar2, (pi.b) bVar2.q().a());
        if (((pi.b) bVarG.R()).s() < 0.16666666666666666d) {
            bVar3 = aj.d.b(bVarG.s()) < aj.l.f682b ? bVarG : (pi.b) bVarG.H((pi.b) bVar.N((pi.b) ((pi.b) ((pi.b) bVarG.L(6)).f()).O(bVarG)));
        } else {
            pi.b bVar6 = (pi.b) bVar.D();
            if (bVarG.s() < 0.0d) {
                pi.b bVar7 = (pi.b) bVarG.H(bVar6);
                bVar3 = (pi.b) bVarG.H((pi.b) bVar.N((pi.b) ((pi.b) ((pi.b) ((pi.b) bVar7.K(f23613a)).T((pi.b) ((pi.b) bVar7.negate()).add(f23614b))).O(bVar6)).O(bVarG)));
            } else {
                pi.b bVar8 = (pi.b) ((pi.b) bVarG.negate()).H(bVar6);
                bVar3 = (pi.b) bVarG.H((pi.b) bVar.N((pi.b) ((pi.b) ((pi.b) ((pi.b) ((pi.b) bVar8.K(f23613a)).T((pi.b) ((pi.b) bVar8.negate()).add(f23614b))).negate()).O(bVarG)).H(bVar6)));
            }
        }
        double d10 = 1.0d;
        pi.b bVar9 = (pi.b) ((pi.b) bVar.negate()).add(1.0d);
        int i10 = 0;
        boolean z10 = bVar9.s() + ((bVar3.s() * bVar3.s()) / 6.0d) >= 0.1d;
        while (i10 < 2) {
            aj.f fVarQ = aj.d.Q(bVar3);
            pi.b bVar10 = (pi.b) bVar.N((pi.b) fVarQ.b());
            pi.b bVar11 = (pi.b) bVar.N((pi.b) fVarQ.a());
            if (z10) {
                bVar5 = (pi.b) ((pi.b) bVar3.O(bVar10)).O(bVarG);
                bVar4 = (pi.b) ((pi.b) bVar11.negate()).add(d10);
            } else {
                pi.b bVar12 = (pi.b) a(bVar, bVar3).O(bVarG);
                bVar4 = (pi.b) bVar9.H((pi.b) ((pi.b) bVar.N((pi.b) ((pi.b) ((pi.b) bVar3.K(0.5d)).g()).n())).L(2));
                bVar5 = bVar12;
            }
            pi.b bVar13 = (pi.b) ((pi.b) bVar5.N(bVar4)).T((pi.b) ((pi.b) ((pi.b) bVar5.N(bVar10)).K(0.5d)).O((pi.b) bVar4.n()));
            pi.b bVar14 = (pi.b) bVar4.H((pi.b) ((pi.b) bVar13.N((pi.b) bVar10.H((pi.b) bVar13.N((pi.b) bVar11.x(3.0d))))).K(0.5d));
            pi.b bVar15 = (pi.b) bVar4.H((pi.b) bVar13.N((pi.b) bVar10.H((pi.b) ((pi.b) bVar13.N(bVar11)).K(0.5d))));
            bVar3 = (pi.b) bVar3.O((pi.b) ((pi.b) bVar5.O((pi.b) bVar13.N((pi.b) bVar15.O(bVar14)))).T(bVar15));
            i10++;
            d10 = 1.0d;
        }
        return (pi.b) ((pi.b) bVar3.H(bVar2)).O(bVarG);
    }

    public static pi.b e(pi.b bVar, pi.b bVar2) {
        return c(bVar, d(bVar, bVar2));
    }

    public static pi.b f(pi.b bVar, pi.b bVar2) {
        pi.b bVar3 = (pi.b) bVar.T((pi.b) ((pi.b) ((pi.b) ((pi.b) ((pi.b) bVar.n()).negate()).add(1.0d)).h()).add(1.0d));
        aj.f fVarQ = aj.d.Q(bVar2);
        return (pi.b) bVar2.O((pi.b) ((pi.b) ((pi.b) ((pi.b) bVar3.N((pi.b) fVarQ.b())).T((pi.b) ((pi.b) bVar3.N((pi.b) fVarQ.a())).add(1.0d))).i()).L(2));
    }

    public static pi.b g(pi.b bVar, pi.b bVar2) {
        return b(bVar, f(bVar, bVar2));
    }

    public static pi.b h(pi.b bVar, pi.b bVar2) {
        return (pi.b) ((pi.b) bVar.N((pi.b) bVar2.e())).O(bVar2);
    }

    public static pi.b i(pi.b bVar, pi.b bVar2) {
        return (pi.b) ((pi.b) ((pi.b) ((pi.b) ((pi.b) ((pi.b) bVar.add(1.0d)).T((pi.b) bVar.j(1.0d))).h()).N((pi.b) ((pi.b) bVar2.K(0.5d)).l())).i()).L(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r1v20, types: [pi.b, pi.e] */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2, types: [pi.e] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v4, types: [pi.b, pi.e] */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static pi.b j(pi.b bVar, pi.b bVar2) {
        ?? r16;
        ?? r21;
        pi.b bVar3;
        int i10;
        pi.b bVar4;
        pi.b bVar5;
        pi.c cVarQ = bVar.q();
        pi.b bVar6 = (pi.b) cVarQ.a();
        pi.b bVar7 = (pi.b) cVarQ.b();
        pi.b bVar8 = (pi.b) bVar6.w(2.0d);
        pi.b bVar9 = (pi.b) bVar6.w(3.0d);
        pi.b bVar10 = (pi.b) bVar6.w(0.5d);
        pi.b bVar11 = (pi.b) bVar6.w(1.5d);
        pi.b bVar12 = (pi.b) ((pi.b) bVar6.w(4.0d)).x(3.0d);
        pi.b bVar13 = (pi.b) bVar2.T(bVar);
        pi.b bVar14 = (pi.b) bVar.k();
        pi.b bVar15 = (pi.b) bVar7.O(bVar14);
        if (bVar13.isZero()) {
            return (pi.b) bVar2.q().a();
        }
        pi.b bVar16 = (pi.b) ((pi.b) ((pi.b) bVar13.n()).H(bVar7)).h();
        pi.b bVar17 = (pi.b) bVar13.a();
        pi.b bVar18 = (pi.b) ((pi.b) ((pi.b) bVar14.n()).N(bVar17)).T((pi.b) ((pi.b) bVar16.N(bVar16)).N(bVar16));
        pi.b bVar19 = (pi.b) bVar7.O((pi.b) bVar14.T(bVar16));
        pi.b bVar20 = (pi.b) bVar13.H((pi.b) ((pi.b) bVar14.N(bVar17)).T((pi.b) ((pi.b) ((pi.b) ((pi.b) bVar19.n()).N(bVar19)).H((pi.b) ((pi.b) bVar18.N(bVar13)).N((pi.b) bVar11.O((pi.b) bVar12.N(bVar14))))).f()));
        int i11 = 0;
        ?? r12 = bVar20;
        ?? r42 = bVar8;
        ?? r52 = bVar14;
        while (i11 < 2) {
            pi.b bVar21 = (pi.b) r12.n();
            pi.b bVar22 = (pi.b) bVar21.H(bVar7);
            pi.e eVar = (pi.b) bVar22.h();
            pi.b bVar23 = (pi.b) bVar22.N(eVar);
            pi.b bVar24 = (pi.b) ((pi.b) r52.N(r12)).T(bVar23);
            pi.b bVar25 = (pi.b) ((pi.b) r52.N((pi.b) bVar7.O((pi.b) r42.N(bVar21)))).T((pi.b) bVar22.N(bVar23));
            if (((pi.b) ((pi.b) bVar21.x(6.0d)).H(bVar15)).s() >= 0.5d) {
                bVar4 = (pi.b) ((pi.b) r12.O((pi.b) r52.N((pi.b) r12.a()))).O(bVar13);
                bVar5 = (pi.b) bVar7.O((pi.b) r52.T(eVar));
                r16 = r42;
                r21 = r52;
                bVar3 = bVar9;
                i10 = i11;
            } else {
                pi.b bVar26 = (pi.b) r12.T((pi.b) bVar7.H((pi.b) ((pi.b) bVar7.H((pi.b) r12.N(r12))).h()));
                pi.b bVar27 = (pi.b) bVar26.n();
                pi.b bVar28 = (pi.b) r12.N((pi.b) bVar15.H((pi.b) r52.N(bVar27)));
                pi.b bVar29 = (pi.b) ((pi.b) r42.N(r52)).N(bVar26);
                r16 = r42;
                r21 = r52;
                int i12 = 0;
                pi.b bVar30 = bVar7;
                pi.b bVar31 = bVar29;
                while (true) {
                    i12++;
                    if (i12 == 1000000) {
                        throw new ui.f(hj.f.UNABLE_TO_COMPUTE_HYPERBOLIC_ECCENTRIC_ANOMALY, Integer.valueOf(i12));
                    }
                    bVar3 = bVar9;
                    i10 = i11;
                    pi.b bVar32 = (pi.b) bVar30.add(2.0d);
                    pi.b bVar33 = (pi.b) bVar31.N(bVar27);
                    pi.b bVar34 = (pi.b) bVar28.O((pi.b) bVar33.T(bVar32));
                    if (bVar34.s() == bVar28.s()) {
                        bVar4 = (pi.b) bVar34.O(bVar13);
                        bVar5 = (pi.b) ((pi.b) ((pi.b) bVar21.T((pi.b) eVar.H(bVar7))).H(bVar15)).T(eVar);
                        break;
                    }
                    bVar28 = bVar34;
                    i11 = i10;
                    bVar9 = bVar3;
                    bVar31 = bVar33;
                    bVar30 = bVar32;
                }
            }
            pi.b bVar35 = (pi.b) ((pi.b) bVar4.N(bVar5)).T((pi.b) ((pi.b) ((pi.b) bVar10.N(bVar4)).N(bVar24)).O((pi.b) bVar5.N(bVar5)));
            pi.b bVar36 = (pi.b) r12.H(bVar35);
            if (r12.s() == bVar36.s()) {
                break;
            }
            pi.b bVar37 = (pi.b) bVar36.O((pi.b) ((pi.b) bVar4.H((pi.b) bVar35.N((pi.b) bVar5.H((pi.b) bVar10.N((pi.b) bVar35.N((pi.b) bVar24.H((pi.b) ((pi.b) bVar35.T(bVar3)).N(bVar25)))))))).T((pi.b) bVar5.H((pi.b) bVar35.N((pi.b) bVar24.H((pi.b) ((pi.b) bVar10.N(bVar35)).N(bVar25))))));
            i11 = i10 + 1;
            bVar9 = bVar3;
            r42 = r16;
            r52 = r21;
            r12 = bVar37;
        }
        return (pi.b) r12.a();
    }

    public static pi.b k(pi.b bVar, pi.b bVar2) {
        return i(bVar, j(bVar, bVar2));
    }

    public static pi.b l(pi.b bVar, pi.b bVar2) {
        aj.f fVarQ = aj.d.Q(bVar2);
        return (pi.b) ((pi.b) ((pi.b) ((pi.b) ((pi.b) ((pi.b) bVar.n()).j(1.0d)).h()).N((pi.b) fVarQ.b())).T((pi.b) ((pi.b) bVar.N((pi.b) fVarQ.a())).add(1.0d))).a();
    }

    public static pi.b m(pi.b bVar, pi.b bVar2) {
        return h(bVar, l(bVar, bVar2));
    }
}
