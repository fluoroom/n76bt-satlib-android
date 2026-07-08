package zj;

import gj.b0;
import gj.y;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.io.InputStream;
import java.util.function.Function;
import java.util.regex.Pattern;
import zj.s;

/* JADX INFO: loaded from: classes3.dex */
public abstract class s extends Enum {

    /* JADX INFO: renamed from: a */
    public static final s f33452a;

    /* JADX INFO: renamed from: b */
    public static final s f33453b;

    /* JADX INFO: renamed from: c */
    public static final s f33454c;

    /* JADX INFO: renamed from: d */
    private static final Pattern f33455d;

    /* JADX INFO: renamed from: e */
    private static final /* synthetic */ s[] f33456e;

    enum a extends s {

        /* JADX INFO: renamed from: zj.s$a$a */
        class C0452a implements yj.z {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ gj.a0 f33457a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ yj.c0 f33458b;

            C0452a(gj.a0 a0Var, yj.c0 c0Var) {
                this.f33457a = a0Var;
                this.f33458b = c0Var;
            }

            @Override // yj.z
            public double a(yj.b bVar) {
                return this.f33457a.b(a.this.d(bVar, this.f33458b));
            }
        }

        class b implements yj.h0 {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ gj.o f33460a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ y.b f33461b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ gj.a0 f33462c;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ double f33463d;

            /* JADX INFO: renamed from: e */
            final /* synthetic */ gj.a0 f33464e;

            b(gj.o oVar, y.b bVar, gj.a0 a0Var, double d10, gj.a0 a0Var2) {
                this.f33460a = oVar;
                this.f33461b = bVar;
                this.f33462c = a0Var;
                this.f33463d = d10;
                this.f33464e = a0Var2;
            }

            @Override // yj.h0
            public double[] a(yj.b bVar) {
                gj.b bVarB = this.f33460a.b(bVar);
                double[] dArrB = this.f33461b.b(bVarB);
                double dP = bVarB.p();
                double dC = bVarB.c();
                double dA = bVarB.a();
                double dU = bVarB.u();
                aj.m mVarR = aj.d.R(dP);
                aj.m mVarC = aj.m.c(mVarR, mVarR);
                aj.m mVarR2 = aj.d.R(((dC - dA) + dP) * 2.0d);
                double dA2 = mVarR.a();
                double dB = mVarR.b();
                double dB2 = mVarC.b();
                double dA3 = mVarR2.a();
                double d10 = dU * dU;
                return new double[]{this.f33462c.b(dU) + (this.f33463d * dArrB[0]) + (((dA2 * 2.908882086657216E-10d) + (9.890199094634534E-9d * dB) + (7.757018897752577E-10d * dA3)) * d10), this.f33464e.b(dU) + dArrB[1] + (d10 * ((dA2 * (-1.1199196033630281E-8d)) + (dA3 * (-6.787391535533503E-10d)))), ((-1.2799081181291749E-8d) * dB) + (dB2 * (-2.908882086657216E-10d)) + (dU * ((((dB * 3.587621240210566E-9d) + (mVarR2.b() * 2.908882086657216E-10d) + ((-3.5192625111741217E-7d) * dU)) * dU) + 1.8665326722717134E-8d))};
            }
        }

        class c implements yj.h0 {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ gj.o f33466a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ y.b f33467b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ yj.c0 f33468c;

            c(gj.o oVar, y.b bVar, yj.c0 c0Var) {
                this.f33466a = oVar;
                this.f33467b = bVar;
                this.f33468c = c0Var;
            }

            @Override // yj.h0
            public double[] a(yj.b bVar) {
                gj.b bVarB = this.f33466a.b(bVar);
                double[] dArrB = this.f33467b.b(bVarB);
                return new double[]{dArrB[0], dArrB[1], f.a(bVarB, this.f33468c.l())};
            }
        }

        class d implements yj.z {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ yj.b f33470a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ yj.b0 f33471b;

            d(yj.b bVar, yj.b0 b0Var) {
                this.f33470a = bVar;
                this.f33471b = b0Var;
            }

            @Override // yj.z
            public double a(yj.b bVar) {
                double dX = bVar.X(this.f33470a) + this.f33471b.a(bVar).Q();
                double d10 = dX / 3.15576E9d;
                return (((((((-6.2E-6d) * d10) + 0.093104d) * d10) + 8640184.812866d) * d10) + 24110.54841d + aj.d.a(dX + 43200.0d, 86400.0d)) * 7.27220521664304E-5d;
            }
        }

        class e implements yj.z {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ yj.b f33473a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ yj.b0 f33474b;

            e(yj.b bVar, yj.b0 b0Var) {
                this.f33473a = bVar;
                this.f33474b = b0Var;
            }

            @Override // yj.z
            public double a(yj.b bVar) {
                double dX = (bVar.X(this.f33473a) + this.f33474b.a(bVar).Q()) / 3.15576E9d;
                return (((((((3.0d * dX) * (-6.2E-6d)) + 0.186208d) * dX) + 8640184.812866d) / 3.15576E9d) + 1.0d) * 7.27220521664304E-5d;
            }
        }

        class f implements yj.z {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ yj.h0 f33476a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ kj.z f33477b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ yj.z f33478c;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ yj.z f33479d;

            f(yj.h0 h0Var, kj.z zVar, yj.z zVar2, yj.z zVar3) {
                this.f33476a = h0Var;
                this.f33477b = zVar;
                this.f33478c = zVar2;
                this.f33479d = zVar3;
            }

            @Override // yj.z
            public double a(yj.b bVar) {
                double[] dArrA = this.f33476a.a(bVar);
                double d10 = dArrA[0];
                kj.z zVar = this.f33477b;
                if (zVar != null) {
                    d10 += zVar.j(bVar)[0];
                }
                return this.f33479d.a(bVar) + (d10 * aj.d.n(this.f33478c.a(bVar))) + dArrA[2];
            }
        }

        a(String str, int i10) {
            super(str, i10, null);
        }

        public static /* synthetic */ gj.o H(a aVar, yj.b0 b0Var, yj.c0 c0Var, InputStream inputStream) {
            aVar.getClass();
            return new gj.o(aVar, b0Var, inputStream, "/assets/org/orekit/IERS-conventions/1996/nutation-arguments.txt", c0Var);
        }

        @Override // zj.s
        public yj.h0 e(yj.c0 c0Var) {
            gj.o oVarK = k(c0Var.h(), c0Var);
            final gj.z zVarG = new gj.z(17).j(1).i(7).g(2);
            gj.y yVar = (gj.y) s.w("/assets/org/orekit/IERS-conventions/1996/tab8.4.txt", new Function() { // from class: zj.p
                public /* synthetic */ Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return zVarG.l(0, 14, 4.84813681109536E-9d, 15, 4.84813681109536E-9d).d((InputStream) obj, "/assets/org/orekit/IERS-conventions/1996/tab8.4.txt");
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            gj.y yVar2 = (gj.y) s.w("/assets/org/orekit/IERS-conventions/1996/tab8.4.txt", new Function() { // from class: zj.q
                public /* synthetic */ Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return zVarG.l(0, 16, 4.84813681109536E-9d, 17, 4.84813681109536E-9d).d((InputStream) obj, "/assets/org/orekit/IERS-conventions/1996/tab8.4.txt");
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            final gj.z zVarG2 = new gj.z(17).j(1).i(7).g(2);
            return new e(oVarK, yVar, yVar2, (gj.y) s.w("/assets/org/orekit/IERS-conventions/1996/tab8.3.txt", new Function() { // from class: zj.r
                public /* synthetic */ Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return zVarG2.l(0, 16, 1.0E-4d, 17, 1.0E-4d).d((InputStream) obj, "/assets/org/orekit/IERS-conventions/1996/tab8.3.txt");
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }));
        }

        @Override // zj.s
        public yj.z g(yj.b0 b0Var, kj.z zVar, yj.c0 c0Var) {
            return new f(q(c0Var), zVar, j(c0Var), h(b0Var, c0Var));
        }

        @Override // zj.s
        public yj.z h(yj.b0 b0Var, yj.c0 c0Var) {
            return new d(new yj.b(yj.i.f32670w, yj.w.f32744f, c0Var.l()), b0Var);
        }

        @Override // zj.s
        public yj.z i(yj.b0 b0Var, yj.c0 c0Var) {
            return new e(new yj.b(yj.i.f32670w, yj.w.f32744f, c0Var.l()), b0Var);
        }

        @Override // zj.s
        public yj.z j(yj.c0 c0Var) {
            return new C0452a(new gj.a0(0.40909280422232897d, -2.2696552481142927E-4d, -2.8604007185462624E-9d, 8.789672038515888E-9d), c0Var);
        }

        @Override // zj.s
        public gj.o k(final yj.b0 b0Var, final yj.c0 c0Var) {
            return (gj.o) s.w("/assets/org/orekit/IERS-conventions/1996/nutation-arguments.txt", new Function() { // from class: zj.o
                public /* synthetic */ Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return s.a.H(this.f33437a, b0Var, c0Var, (InputStream) obj);
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
        }

        @Override // zj.s
        public yj.h0 q(yj.c0 c0Var) {
            gj.o oVarL = l(c0Var);
            gj.z zVarG = new gj.z(10).g(1);
            final gj.z zVarL = zVarG.l(0, 7, 4.84813681109536E-10d, -1, 4.84813681109536E-10d).l(1, 8, 4.84813681109536E-10d, -1, 4.84813681109536E-10d);
            gj.y yVar = (gj.y) s.w("/assets/org/orekit/IERS-conventions/1996/tab5.1.txt", new Function() { // from class: zj.m
                public /* synthetic */ Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return zVarL.d((InputStream) obj, "/assets/org/orekit/IERS-conventions/1996/tab5.1.txt");
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            final gj.z zVarL2 = zVarG.l(0, -1, 4.84813681109536E-10d, 9, 4.84813681109536E-10d).l(1, -1, 4.84813681109536E-10d, 10, 4.84813681109536E-10d);
            return new c(oVarL, gj.y.a(yVar, (gj.y) s.w("/assets/org/orekit/IERS-conventions/1996/tab5.1.txt", new Function() { // from class: zj.n
                public /* synthetic */ Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return zVarL2.d((InputStream) obj, "/assets/org/orekit/IERS-conventions/1996/tab5.1.txt");
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            })), c0Var);
        }

        @Override // zj.s
        public yj.h0 s(yj.c0 c0Var) {
            return new h(new gj.a0(0.0d, 0.02442868704399218d, -5.200063062212772E-6d, -5.560812922326378E-9d), new gj.a0(j(c0Var).a(r(c0Var)), 0.0d, 2.4856397430485914E-7d, -3.745670500252275E-8d), new gj.a0(0.0d, 5.1160448512764897E-5d, -1.1541668417966057E-5d, -5.454153912482279E-9d), c0Var);
        }

        @Override // zj.s
        public yj.h0 v(yj.c0 c0Var) {
            gj.o oVarL = l(c0Var);
            gj.a0 a0Var = new gj.a0(0.0d, 0.00971717345516967d, -2.068457570453835E-6d, -9.631114663449597E-7d, 6.787391535533504E-11d);
            double dP = aj.d.P(j(c0Var).a(r(c0Var)));
            gj.z zVarG = new gj.z(12).g(1);
            final gj.z zVarL = zVarG.l(0, 7, 4.84813681109536E-10d, -1, 4.84813681109536E-10d).l(1, 8, 4.84813681109536E-10d, 9, 4.84813681109536E-10d);
            gj.y yVar = (gj.y) s.w("/assets/org/orekit/IERS-conventions/1996/tab5.4.txt", new Function() { // from class: zj.k
                public /* synthetic */ Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return zVarL.d((InputStream) obj, "/assets/org/orekit/IERS-conventions/1996/tab5.4.txt");
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            gj.a0 a0Var2 = new gj.a0(-6.302577854423967E-10d, 0.0d, -1.0864635808570213E-4d, 8.901179185171081E-9d, 5.395976270749136E-9d);
            final gj.z zVarL2 = zVarG.l(0, -1, 4.84813681109536E-10d, 10, 4.84813681109536E-10d).l(1, 12, 4.84813681109536E-10d, 11, 4.84813681109536E-10d);
            return new b(oVarL, gj.y.a(yVar, (gj.y) s.w("/assets/org/orekit/IERS-conventions/1996/tab5.4.txt", new Function() { // from class: zj.l
                public /* synthetic */ Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return zVarL2.d((InputStream) obj, "/assets/org/orekit/IERS-conventions/1996/tab5.4.txt");
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            })), a0Var, dP, a0Var2);
        }
    }

    enum b extends s {

        class a implements yj.z {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ gj.a0 f33481a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ yj.c0 f33482b;

            a(gj.a0 a0Var, yj.c0 c0Var) {
                this.f33481a = a0Var;
                this.f33482b = c0Var;
            }

            @Override // yj.z
            public double a(yj.b bVar) {
                return this.f33481a.b(b.this.d(bVar, this.f33482b));
            }
        }

        /* JADX INFO: renamed from: zj.s$b$b */
        class C0453b implements yj.h0 {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ y.b f33484a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ gj.o f33485b;

            C0453b(y.b bVar, gj.o oVar) {
                this.f33484a = bVar;
                this.f33485b = oVar;
            }

            @Override // yj.h0
            public double[] a(yj.b bVar) {
                return this.f33484a.b(this.f33485b.b(bVar));
            }
        }

        class c implements yj.h0 {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ gj.o f33487a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ y.b f33488b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ y.b f33489c;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ yj.c0 f33490d;

            c(gj.o oVar, y.b bVar, y.b bVar2, yj.c0 c0Var) {
                this.f33487a = oVar;
                this.f33488b = bVar;
                this.f33489c = bVar2;
                this.f33490d = c0Var;
            }

            @Override // yj.h0
            public double[] a(yj.b bVar) {
                gj.b bVarB = this.f33487a.b(bVar);
                double[] dArrB = this.f33488b.b(bVarB);
                double[] dArrB2 = this.f33489c.b(bVarB);
                return new double[]{dArrB[0] + dArrB2[0], dArrB[1] + dArrB2[1], f.a(bVarB, this.f33490d.l())};
            }
        }

        class d implements yj.z {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ i f33492a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ gj.a0 f33493b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ yj.c0 f33494c;

            d(i iVar, gj.a0 a0Var, yj.c0 c0Var) {
                this.f33492a = iVar;
                this.f33493b = a0Var;
                this.f33494c = c0Var;
            }

            @Override // yj.z
            public double a(yj.b bVar) {
                return this.f33492a.a(bVar) + this.f33493b.b(b.this.d(bVar, this.f33494c));
            }
        }

        class e implements yj.z {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ i f33496a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ gj.a0 f33497b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ yj.c0 f33498c;

            e(i iVar, gj.a0 a0Var, yj.c0 c0Var) {
                this.f33496a = iVar;
                this.f33497b = a0Var;
                this.f33498c = c0Var;
            }

            @Override // yj.z
            public double a(yj.b bVar) {
                return this.f33496a.b() + this.f33497b.a(b.this.d(bVar, this.f33498c));
            }
        }

        class f implements yj.z {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ gj.o f33500a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ y.b f33501b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ kj.z f33502c;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ yj.z f33503d;

            /* JADX INFO: renamed from: e */
            final /* synthetic */ yj.z f33504e;

            f(gj.o oVar, y.b bVar, kj.z zVar, yj.z zVar2, yj.z zVar3) {
                this.f33500a = oVar;
                this.f33501b = bVar;
                this.f33502c = zVar;
                this.f33503d = zVar2;
                this.f33504e = zVar3;
            }

            @Override // yj.z
            public double a(yj.b bVar) {
                double[] dArrB = this.f33501b.b(this.f33500a.b(bVar));
                kj.z zVar = this.f33502c;
                return this.f33504e.a(bVar) + ((dArrB[0] + dArrB[1] + (zVar == null ? 0.0d : zVar.j(bVar)[0])) * aj.d.n(this.f33503d.a(bVar))) + dArrB[2];
            }
        }

        b(String str, int i10) {
            super(str, i10, null);
        }

        public static /* synthetic */ gj.o K(b bVar, yj.b0 b0Var, yj.c0 c0Var, InputStream inputStream) {
            bVar.getClass();
            return new gj.o(bVar, b0Var, inputStream, "/assets/org/orekit/IERS-conventions/2003/nutation-arguments.txt", c0Var);
        }

        @Override // zj.s
        public yj.h0 e(yj.c0 c0Var) {
            gj.o oVarK = k(c0Var.h(), c0Var);
            final gj.z zVarG = new gj.z(13).j(1).i(2).g(3);
            final gj.z zVarG2 = new gj.z(11).j(1).i(2).g(3);
            return new e(oVarK, (gj.y) s.w("/assets/org/orekit/IERS-conventions/2003/tab8.2ab.txt", new Function() { // from class: zj.v
                public /* synthetic */ Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return zVarG.l(0, 10, 4.84813681109536E-12d, 11, 4.84813681109536E-12d).d((InputStream) obj, "/assets/org/orekit/IERS-conventions/2003/tab8.2ab.txt");
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }), (gj.y) s.w("/assets/org/orekit/IERS-conventions/2003/tab8.2ab.txt", new Function() { // from class: zj.w
                public /* synthetic */ Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return zVarG.l(0, 12, 4.84813681109536E-12d, 13, 4.84813681109536E-12d).d((InputStream) obj, "/assets/org/orekit/IERS-conventions/2003/tab8.2ab.txt");
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }), (gj.y) s.w("/assets/org/orekit/IERS-conventions/2003/tab8.3ab.txt", new Function() { // from class: zj.x
                public /* synthetic */ Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return zVarG2.l(0, 10, 1.0E-6d, 11, 1.0E-6d).d((InputStream) obj, "/assets/org/orekit/IERS-conventions/2003/tab8.3ab.txt");
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }));
        }

        @Override // zj.s
        public yj.z g(yj.b0 b0Var, kj.z zVar, yj.c0 c0Var) {
            gj.o oVarL = l(c0Var);
            yj.z zVarJ = j(c0Var);
            final gj.z zVarL = new gj.z(14).g(1).l(0, 7, 4.84813681109536E-9d, 11, 4.84813681109536E-9d).l(1, 8, 4.84813681109536E-9d, 12, 4.84813681109536E-9d);
            gj.y yVar = (gj.y) s.w("/assets/org/orekit/IERS-conventions/2003/tab5.3a-first-table.txt", new Function() { // from class: zj.t
                public /* synthetic */ Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return zVarL.d((InputStream) obj, "/assets/org/orekit/IERS-conventions/2003/tab5.3a-first-table.txt");
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            final gj.z zVarL2 = new gj.z(21).g(2).h(7).l(0, 17, 4.84813681109536E-9d, 18, 4.84813681109536E-9d);
            gj.y yVar2 = (gj.y) s.w("/assets/org/orekit/IERS-conventions/2003/tab5.3b.txt", new Function() { // from class: zj.a0
                public /* synthetic */ Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return zVarL2.d((InputStream) obj, "/assets/org/orekit/IERS-conventions/2003/tab5.3b.txt");
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            final gj.z zVarK = new gj.z(17).g(4).h(9).l(0, 2, 4.84813681109536E-12d, 3, 4.84813681109536E-12d).k('t', b0.a.ARC_SECONDS);
            return new f(oVarL, gj.y.a(yVar, yVar2, (gj.y) s.w("/assets/org/orekit/IERS-conventions/2003/tab5.4.txt", new Function() { // from class: zj.b0
                public /* synthetic */ Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return zVarK.d((InputStream) obj, "/assets/org/orekit/IERS-conventions/2003/tab5.4.txt");
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            })), zVar, zVarJ, f(b0Var, c0Var.l()));
        }

        @Override // zj.s
        public yj.z h(yj.b0 b0Var, yj.c0 c0Var) {
            i iVar = new i(b0Var, c0Var.l());
            final gj.z zVarK = new gj.z(17).g(4).h(9).l(0, 2, 4.84813681109536E-12d, 3, 4.84813681109536E-12d).k('t', b0.a.ARC_SECONDS);
            return new d(iVar, (gj.a0) s.w("/assets/org/orekit/IERS-conventions/2003/tab5.4.txt", new Function() { // from class: zj.z
                public /* synthetic */ Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return zVarK.d((InputStream) obj, "/assets/org/orekit/IERS-conventions/2003/tab5.4.txt").b();
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }), c0Var);
        }

        @Override // zj.s
        public yj.z i(yj.b0 b0Var, yj.c0 c0Var) {
            i iVar = new i(b0Var, c0Var.l());
            final gj.z zVarK = new gj.z(17).g(4).h(9).l(0, 2, 4.84813681109536E-12d, 3, 4.84813681109536E-12d).k('t', b0.a.ARC_SECONDS);
            return new e(iVar, (gj.a0) s.w("/assets/org/orekit/IERS-conventions/2003/tab5.4.txt", new Function() { // from class: zj.y
                public /* synthetic */ Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return zVarK.d((InputStream) obj, "/assets/org/orekit/IERS-conventions/2003/tab5.4.txt").b();
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }), c0Var);
        }

        @Override // zj.s
        public yj.z j(yj.c0 c0Var) {
            return new a(new gj.a0(0.40909280422232897d, -2.2708789178454132E-4d, -2.8604007185462624E-9d, 8.789672038515888E-9d), c0Var);
        }

        @Override // zj.s
        public gj.o k(final yj.b0 b0Var, final yj.c0 c0Var) {
            return (gj.o) s.w("/assets/org/orekit/IERS-conventions/2003/nutation-arguments.txt", new Function() { // from class: zj.u
                public /* synthetic */ Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return s.b.K(this.f33548a, b0Var, c0Var, (InputStream) obj);
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
        }

        @Override // zj.s
        public yj.h0 q(yj.c0 c0Var) {
            gj.o oVarL = l(c0Var);
            gj.z zVarG = new gj.z(14).g(1);
            final gj.z zVarL = zVarG.l(0, 7, 4.84813681109536E-9d, 11, 4.84813681109536E-9d).l(1, 8, 4.84813681109536E-9d, 12, 4.84813681109536E-9d);
            gj.y yVar = (gj.y) s.w("/assets/org/orekit/IERS-conventions/2003/tab5.3a-first-table.txt", new Function() { // from class: zj.f0
                public /* synthetic */ Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return zVarL.d((InputStream) obj, "/assets/org/orekit/IERS-conventions/2003/tab5.3a-first-table.txt");
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            final gj.z zVarL2 = zVarG.l(0, 13, 4.84813681109536E-9d, 9, 4.84813681109536E-9d).l(1, 14, 4.84813681109536E-9d, 10, 4.84813681109536E-9d);
            gj.y yVar2 = (gj.y) s.w("/assets/org/orekit/IERS-conventions/2003/tab5.3a-first-table.txt", new Function() { // from class: zj.g0
                public /* synthetic */ Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return zVarL2.d((InputStream) obj, "/assets/org/orekit/IERS-conventions/2003/tab5.3a-first-table.txt");
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            gj.z zVarH = new gj.z(21).g(2).h(7);
            final gj.z zVarL3 = zVarH.l(0, 17, 4.84813681109536E-9d, 18, 4.84813681109536E-9d);
            gj.y yVar3 = (gj.y) s.w("/assets/org/orekit/IERS-conventions/2003/tab5.3b.txt", new Function() { // from class: zj.h0
                public /* synthetic */ Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return zVarL3.d((InputStream) obj, "/assets/org/orekit/IERS-conventions/2003/tab5.3b.txt");
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            final gj.z zVarL4 = zVarH.l(0, 19, 4.84813681109536E-9d, 20, 4.84813681109536E-9d);
            return new c(oVarL, gj.y.a(yVar, yVar2), gj.y.a(yVar3, (gj.y) s.w("/assets/org/orekit/IERS-conventions/2003/tab5.3b.txt", new Function() { // from class: zj.i0
                public /* synthetic */ Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return zVarL4.d((InputStream) obj, "/assets/org/orekit/IERS-conventions/2003/tab5.3b.txt");
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            })), c0Var);
        }

        @Override // zj.s
        public yj.h0 s(yj.c0 c0Var) {
            return new h(new gj.a0(0.0d, 0.024427234299796735d, -5.200063062212772E-6d, -5.560812922326378E-9d), new gj.a0(j(c0Var).a(r(c0Var)), -1.2236697311204688E-7d, 2.4856397430485914E-7d, -3.745670500252275E-8d), new gj.a0(0.0d, 5.1160448512764897E-5d, -1.1541668417966057E-5d, -5.454153912482279E-9d), c0Var);
        }

        @Override // zj.s
        public yj.h0 v(yj.c0 c0Var) {
            gj.o oVarL = l(c0Var);
            final gj.z zVarL = new gj.z(17).k('t', b0.a.MICRO_ARC_SECONDS).g(4).h(9).l(0, 2, 4.84813681109536E-12d, 3, 4.84813681109536E-12d);
            return new C0453b(gj.y.a((gj.y) s.w("/assets/org/orekit/IERS-conventions/2003/tab5.2a.txt", new Function() { // from class: zj.c0
                public /* synthetic */ Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return zVarL.d((InputStream) obj, "/assets/org/orekit/IERS-conventions/2003/tab5.2a.txt");
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }), (gj.y) s.w("/assets/org/orekit/IERS-conventions/2003/tab5.2b.txt", new Function() { // from class: zj.d0
                public /* synthetic */ Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return zVarL.d((InputStream) obj, "/assets/org/orekit/IERS-conventions/2003/tab5.2b.txt");
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }), (gj.y) s.w("/assets/org/orekit/IERS-conventions/2003/tab5.2c.txt", new Function() { // from class: zj.e0
                public /* synthetic */ Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return zVarL.d((InputStream) obj, "/assets/org/orekit/IERS-conventions/2003/tab5.2c.txt");
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            })), oVarL);
        }
    }

    enum c extends s {

        class a implements yj.z {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ gj.a0 f33506a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ yj.c0 f33507b;

            a(gj.a0 a0Var, yj.c0 c0Var) {
                this.f33506a = a0Var;
                this.f33507b = c0Var;
            }

            @Override // yj.z
            public double a(yj.b bVar) {
                return this.f33506a.b(c.this.d(bVar, this.f33507b));
            }
        }

        class b implements yj.h0 {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ y.b f33509a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ gj.o f33510b;

            b(y.b bVar, gj.o oVar) {
                this.f33509a = bVar;
                this.f33510b = oVar;
            }

            @Override // yj.h0
            public double[] a(yj.b bVar) {
                return this.f33509a.b(this.f33510b.b(bVar));
            }
        }

        /* JADX INFO: renamed from: zj.s$c$c */
        class C0454c implements yj.h0 {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ gj.o f33512a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ y.b f33513b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ yj.c0 f33514c;

            C0454c(gj.o oVar, y.b bVar, yj.c0 c0Var) {
                this.f33512a = oVar;
                this.f33513b = bVar;
                this.f33514c = c0Var;
            }

            @Override // yj.h0
            public double[] a(yj.b bVar) {
                gj.b bVarB = this.f33512a.b(bVar);
                double[] dArrB = this.f33513b.b(bVarB);
                return new double[]{dArrB[0], dArrB[1], f.a(bVarB, this.f33514c.l())};
            }
        }

        class d implements yj.z {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ i f33516a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ gj.a0 f33517b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ yj.c0 f33518c;

            d(i iVar, gj.a0 a0Var, yj.c0 c0Var) {
                this.f33516a = iVar;
                this.f33517b = a0Var;
                this.f33518c = c0Var;
            }

            @Override // yj.z
            public double a(yj.b bVar) {
                return this.f33516a.a(bVar) + this.f33517b.b(c.this.d(bVar, this.f33518c));
            }
        }

        class e implements yj.z {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ i f33520a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ gj.a0 f33521b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ yj.c0 f33522c;

            e(i iVar, gj.a0 a0Var, yj.c0 c0Var) {
                this.f33520a = iVar;
                this.f33521b = a0Var;
                this.f33522c = c0Var;
            }

            @Override // yj.z
            public double a(yj.b bVar) {
                return this.f33520a.b() + this.f33521b.a(c.this.d(bVar, this.f33522c));
            }
        }

        class f implements yj.z {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ gj.o f33524a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ y.b f33525b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ kj.z f33526c;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ yj.z f33527d;

            /* JADX INFO: renamed from: e */
            final /* synthetic */ yj.z f33528e;

            f(gj.o oVar, y.b bVar, kj.z zVar, yj.z zVar2, yj.z zVar3) {
                this.f33524a = oVar;
                this.f33525b = bVar;
                this.f33526c = zVar;
                this.f33527d = zVar2;
                this.f33528e = zVar3;
            }

            @Override // yj.z
            public double a(yj.b bVar) {
                double[] dArrB = this.f33525b.b(this.f33524a.b(bVar));
                kj.z zVar = this.f33526c;
                return this.f33528e.a(bVar) + ((dArrB[0] + (zVar == null ? 0.0d : zVar.j(bVar)[0])) * aj.d.n(this.f33527d.a(bVar))) + dArrB[1];
            }
        }

        c(String str, int i10) {
            super(str, i10, null);
        }

        public static /* synthetic */ gj.o Q(c cVar, yj.b0 b0Var, yj.c0 c0Var, InputStream inputStream) {
            cVar.getClass();
            return new gj.o(cVar, b0Var, inputStream, "/assets/org/orekit/IERS-conventions/2010/nutation-arguments.txt", c0Var);
        }

        @Override // zj.s
        public yj.h0 e(yj.c0 c0Var) {
            gj.o oVarK = k(c0Var.h(), c0Var);
            final gj.z zVarG = new gj.z(13).j(1).i(2).g(3);
            final gj.z zVarG2 = new gj.z(11).j(1).i(2).g(3);
            return new e(oVarK, (gj.y) s.w("/assets/org/orekit/IERS-conventions/2010/tab8.2ab.txt", new Function() { // from class: zj.u0
                public /* synthetic */ Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return zVarG.l(0, 10, 4.84813681109536E-12d, 11, 4.84813681109536E-12d).d((InputStream) obj, "/assets/org/orekit/IERS-conventions/2010/tab8.2ab.txt");
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }), (gj.y) s.w("/assets/org/orekit/IERS-conventions/2010/tab8.2ab.txt", new Function() { // from class: zj.v0
                public /* synthetic */ Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return zVarG.l(0, 12, 4.84813681109536E-12d, 13, 4.84813681109536E-12d).d((InputStream) obj, "/assets/org/orekit/IERS-conventions/2010/tab8.2ab.txt");
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }), (gj.y) s.w("/assets/org/orekit/IERS-conventions/2010/tab8.3ab.txt", new Function() { // from class: zj.k0
                public /* synthetic */ Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return zVarG2.l(0, 10, 1.0E-6d, 11, 1.0E-6d).d((InputStream) obj, "/assets/org/orekit/IERS-conventions/2010/tab8.3ab.txt");
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }));
        }

        @Override // zj.s
        public yj.z g(yj.b0 b0Var, kj.z zVar, yj.c0 c0Var) {
            gj.o oVarL = l(c0Var);
            yj.z zVarJ = j(c0Var);
            final gj.z zVarL = new gj.z(17).g(4).h(9).l(0, 2, 4.84813681109536E-12d, 3, 4.84813681109536E-12d);
            final gj.z zVarK = zVarL.k('t', b0.a.ARC_SECONDS);
            return new f(oVarL, gj.y.a((gj.y) s.w("/assets/org/orekit/IERS-conventions/2010/tab5.3a.txt", new Function() { // from class: zj.o0
                public /* synthetic */ Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return zVarL.d((InputStream) obj, "/assets/org/orekit/IERS-conventions/2010/tab5.3a.txt");
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }), (gj.y) s.w("/assets/org/orekit/IERS-conventions/2010/tab5.2e.txt", new Function() { // from class: zj.p0
                public /* synthetic */ Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return zVarK.d((InputStream) obj, "/assets/org/orekit/IERS-conventions/2010/tab5.2e.txt");
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            })), zVar, zVarJ, f(b0Var, c0Var.l()));
        }

        @Override // zj.s
        public yj.z h(yj.b0 b0Var, yj.c0 c0Var) {
            i iVar = new i(b0Var, c0Var.l());
            final gj.z zVarK = new gj.z(17).g(4).h(9).l(0, 2, 4.84813681109536E-12d, 3, 4.84813681109536E-12d).k('t', b0.a.ARC_SECONDS);
            return new d(iVar, (gj.a0) s.w("/assets/org/orekit/IERS-conventions/2010/tab5.2e.txt", new Function() { // from class: zj.l0
                public /* synthetic */ Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return zVarK.d((InputStream) obj, "/assets/org/orekit/IERS-conventions/2010/tab5.2e.txt").b();
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }), c0Var);
        }

        @Override // zj.s
        public yj.z i(yj.b0 b0Var, yj.c0 c0Var) {
            i iVar = new i(b0Var, c0Var.l());
            final gj.z zVarK = new gj.z(17).g(4).h(9).l(0, 2, 4.84813681109536E-12d, 3, 4.84813681109536E-12d).k('t', b0.a.ARC_SECONDS);
            return new e(iVar, (gj.a0) s.w("/assets/org/orekit/IERS-conventions/2010/tab5.2e.txt", new Function() { // from class: zj.m0
                public /* synthetic */ Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return zVarK.d((InputStream) obj, "/assets/org/orekit/IERS-conventions/2010/tab5.2e.txt").b();
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }), c0Var);
        }

        @Override // zj.s
        public yj.z j(yj.c0 c0Var) {
            return new a(new gj.a0(0.4090926006005829d, -2.2707106390167E-4d, -8.876938501115605E-10d, 9.712757287348442E-9d, -2.792526803190927E-12d, -2.104091376015386E-13d), c0Var);
        }

        @Override // zj.s
        public gj.o k(final yj.b0 b0Var, final yj.c0 c0Var) {
            return (gj.o) s.w("/assets/org/orekit/IERS-conventions/2010/nutation-arguments.txt", new Function() { // from class: zj.t0
                public /* synthetic */ Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return s.c.Q(this.f33545a, b0Var, c0Var, (InputStream) obj);
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
        }

        @Override // zj.s
        public yj.h0 q(yj.c0 c0Var) {
            gj.o oVarL = l(c0Var);
            final gj.z zVarL = new gj.z(17).g(4).h(9).l(0, 2, 4.84813681109536E-12d, 3, 4.84813681109536E-12d);
            return new C0454c(oVarL, gj.y.a((gj.y) s.w("/assets/org/orekit/IERS-conventions/2010/tab5.3a.txt", new Function() { // from class: zj.j0
                public /* synthetic */ Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return zVarL.d((InputStream) obj, "/assets/org/orekit/IERS-conventions/2010/tab5.3a.txt");
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }), (gj.y) s.w("/assets/org/orekit/IERS-conventions/2010/tab5.3b.txt", new Function() { // from class: zj.n0
                public /* synthetic */ Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return zVarL.d((InputStream) obj, "/assets/org/orekit/IERS-conventions/2010/tab5.3b.txt");
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            })), c0Var);
        }

        @Override // zj.s
        public yj.h0 s(yj.c0 c0Var) {
            return new h(new gj.a0(0.0d, 0.024427247666109923d, -5.23117307131589E-6d, -5.529057626213704E-9d, 6.440798234908296E-10d, -4.610578107351687E-13d), new gj.a0(j(c0Var).a(r(c0Var)), -1.2485891543294988E-7d, 2.4852664365141367E-7d, -3.745200230981599E-8d, -2.264079890781533E-12d, 1.6178232538625214E-12d), new gj.a0(0.0d, 5.117888597705749E-5d, -1.1545494567537374E-5d, -5.875796370943243E-9d, 8.273975725919673E-10d, -2.7149566142134015E-13d), c0Var);
        }

        @Override // zj.s
        public yj.h0 v(yj.c0 c0Var) {
            gj.o oVarL = l(c0Var);
            final gj.z zVarL = new gj.z(17).k('t', b0.a.MICRO_ARC_SECONDS).g(4).h(9).l(0, 2, 4.84813681109536E-12d, 3, 4.84813681109536E-12d);
            return new b(gj.y.a((gj.y) s.w("/assets/org/orekit/IERS-conventions/2010/tab5.2a.txt", new Function() { // from class: zj.q0
                public /* synthetic */ Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return zVarL.d((InputStream) obj, "/assets/org/orekit/IERS-conventions/2010/tab5.2a.txt");
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }), (gj.y) s.w("/assets/org/orekit/IERS-conventions/2010/tab5.2b.txt", new Function() { // from class: zj.r0
                public /* synthetic */ Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return zVarL.d((InputStream) obj, "/assets/org/orekit/IERS-conventions/2010/tab5.2b.txt");
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }), (gj.y) s.w("/assets/org/orekit/IERS-conventions/2010/tab5.2d.txt", new Function() { // from class: zj.s0
                public /* synthetic */ Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return zVarL.d((InputStream) obj, "/assets/org/orekit/IERS-conventions/2010/tab5.2d.txt");
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            })), oVarL);
        }
    }

    class d implements g {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ yj.h0 f33530a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ yj.z f33531b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ double f33532c;

        d(yj.h0 h0Var, yj.z zVar, double d10) {
            this.f33530a = h0Var;
            this.f33531b = zVar;
            this.f33532c = d10;
        }

        @Override // zj.s.g
        public double[] a(yj.b bVar, double d10, double d11) {
            double[] dArrA = this.f33530a.a(bVar);
            double dP = aj.d.P(this.f33531b.a(bVar));
            double d12 = (dArrA[0] * this.f33532c) - dArrA[2];
            double d13 = (d12 * d12) + 1.0d;
            return new double[]{(d10 - (d12 * d11)) / (dP * d13), (d11 + (d12 * d10)) / d13};
        }

        @Override // zj.s.g
        public double[] b(yj.b bVar, double d10, double d11) {
            double[] dArrA = this.f33530a.a(bVar);
            double dP = aj.d.P(this.f33531b.a(bVar));
            double d12 = (dArrA[0] * this.f33532c) - dArrA[2];
            return new double[]{(dP * d10) + (d12 * d11), d11 - ((d12 * dP) * d10)};
        }
    }

    private static class e implements yj.h0 {

        /* JADX INFO: renamed from: a */
        private final gj.o f33534a;

        /* JADX INFO: renamed from: b */
        private final y.b f33535b;

        e(gj.o oVar, gj.y yVar, gj.y yVar2, gj.y yVar3) {
            this.f33534a = oVar;
            this.f33535b = gj.y.a(yVar, yVar2, yVar3);
        }

        @Override // yj.h0
        public double[] a(yj.b bVar) {
            gj.b bVarB = this.f33534a.b(bVar);
            double[] dArrB = this.f33535b.b(bVarB);
            return new double[]{dArrB[0], dArrB[1], dArrB[2], this.f33535b.a(bVarB)[2] * (-86400.0d)};
        }
    }

    private static class f {
        public static double a(gj.j jVar, yj.b0 b0Var) {
            if (jVar.getDate().compareTo(new yj.b(1997, 2, 27, 0, 0, 30.0d, b0Var)) < 0) {
                return 0.0d;
            }
            double dP = jVar.p();
            return (aj.d.P(dP) * 1.2799081181291749E-8d) + (aj.d.P(dP + dP) * 3.0543261909900767E-10d);
        }
    }

    public interface g {
        double[] a(yj.b bVar, double d10, double d11);

        double[] b(yj.b bVar, double d10, double d11);
    }

    private class h implements yj.h0 {

        /* JADX INFO: renamed from: a */
        private final gj.a0 f33536a;

        /* JADX INFO: renamed from: b */
        private final gj.a0 f33537b;

        /* JADX INFO: renamed from: c */
        private final gj.a0 f33538c;

        /* JADX INFO: renamed from: d */
        private final yj.c0 f33539d;

        h(gj.a0 a0Var, gj.a0 a0Var2, gj.a0 a0Var3, yj.c0 c0Var) {
            this.f33536a = a0Var;
            this.f33537b = a0Var2;
            this.f33538c = a0Var3;
            this.f33539d = c0Var;
        }

        @Override // yj.h0
        public double[] a(yj.b bVar) {
            double d10 = s.this.d(bVar, this.f33539d);
            return new double[]{this.f33536a.b(d10), this.f33537b.b(d10), this.f33538c.b(d10)};
        }
    }

    private static class i implements yj.z {

        /* JADX INFO: renamed from: a */
        private final yj.b0 f33541a;

        /* JADX INFO: renamed from: b */
        private final yj.b f33542b;

        i(yj.b0 b0Var, yj.b0 b0Var2) {
            this.f33541a = b0Var;
            this.f33542b = new yj.b(yj.i.f32670w, yj.w.f32744f, b0Var2);
        }

        @Override // yj.z
        public double a(yj.b bVar) {
            double dX = bVar.X(this.f33542b);
            double d10 = (((long) dX) / 86400) * 86400;
            double dQ = (dX - d10) + this.f33541a.a(bVar).Q();
            return (7.27220521664304E-5d * dQ) + 4.894961212823756d + ((d10 + dQ) * 1.99099300639395E-7d);
        }

        public double b() {
            return 7.292115146706979E-5d;
        }
    }

    static {
        a aVar = new a("IERS_1996", 0);
        f33452a = aVar;
        b bVar = new b("IERS_2003", 1);
        f33453b = bVar;
        c cVar = new c("IERS_2010", 2);
        f33454c = cVar;
        f33456e = new s[]{aVar, bVar, cVar};
        f33455d = Pattern.compile("\\p{Space}+");
    }

    private s(String str, int i10) {
        super(str, i10);
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f33456e.clone();
    }

    public static Object w(String str, Function function) {
        try {
            InputStream resourceAsStream = s.class.getResourceAsStream(str);
            try {
                Object objApply = function.apply(resourceAsStream);
                if (resourceAsStream != null) {
                    resourceAsStream.close();
                }
                return objApply;
            } finally {
            }
        } catch (IOException e10) {
            throw new hj.a(hj.f.INTERNAL_ERROR, e10);
        }
    }

    public double d(yj.b bVar, yj.c0 c0Var) {
        return bVar.X(r(c0Var)) / 3.15576E9d;
    }

    public abstract yj.h0 e(yj.c0 c0Var);

    public yj.z f(yj.b0 b0Var, yj.b0 b0Var2) {
        return new i(b0Var, b0Var2);
    }

    public abstract yj.z g(yj.b0 b0Var, kj.z zVar, yj.c0 c0Var);

    public abstract yj.z h(yj.b0 b0Var, yj.c0 c0Var);

    public abstract yj.z i(yj.b0 b0Var, yj.c0 c0Var);

    public abstract yj.z j(yj.c0 c0Var);

    public abstract gj.o k(yj.b0 b0Var, yj.c0 c0Var);

    protected gj.o l(yj.c0 c0Var) {
        return k(null, c0Var);
    }

    public g n(yj.c0 c0Var) {
        yj.h0 h0VarS = s(c0Var);
        yj.z zVarJ = j(c0Var);
        return new d(h0VarS, zVarJ, aj.d.n(zVarJ.a(r(c0Var))));
    }

    public abstract yj.h0 q(yj.c0 c0Var);

    public yj.b r(yj.c0 c0Var) {
        return c0Var.c();
    }

    public abstract yj.h0 s(yj.c0 c0Var);

    public abstract yj.h0 v(yj.c0 c0Var);

    /* synthetic */ s(String str, int i10, a aVar) {
        this(str, i10);
    }
}
