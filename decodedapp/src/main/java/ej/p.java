package ej;

import ej.j;
import yj.c0;

/* JADX INFO: loaded from: classes3.dex */
abstract class p implements ej.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c0 f12725a;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12726a;

        static {
            int[] iArr = new int[j.e.values().length];
            f12726a = iArr;
            try {
                iArr[j.e.SUN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12726a[j.e.MERCURY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12726a[j.e.VENUS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12726a[j.e.EARTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12726a[j.e.MOON.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12726a[j.e.MARS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12726a[j.e.JUPITER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f12726a[j.e.SATURN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f12726a[j.e.URANUS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f12726a[j.e.NEPTUNE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f12726a[j.e.PLUTO.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    private static class b extends p {
        b(c0 c0Var) {
            super(c0Var);
        }

        @Override // ej.h
        public double P(yj.b bVar) {
            return aj.d.Z((a(bVar) * 360.9856235d) + 190.147d);
        }

        @Override // ej.h
        public xi.f V(yj.b bVar) {
            double dC = c(bVar);
            return new xi.f(aj.d.Z(((-0.641d) * dC) + 0.0d), aj.d.Z((dC * (-0.557d)) + 90.0d));
        }

        @Override // ej.p, ej.h
        public xi.f y(yj.b bVar) {
            return new xi.f(aj.d.Z((c(bVar) * (-0.641d)) + 0.0d + 90.0d), 0.0d);
        }
    }

    private static class c extends p {
        c(c0 c0Var) {
            super(c0Var);
        }

        @Override // ej.h
        public double P(yj.b bVar) {
            return 0.0d;
        }

        @Override // ej.h
        public xi.f V(yj.b bVar) {
            return xi.f.f32237r;
        }

        @Override // ej.p, ej.h
        public xi.f y(yj.b bVar) {
            return xi.f.f32233e;
        }
    }

    private static class d extends p {
        d(c0 c0Var) {
            super(c0Var);
        }

        @Override // ej.h
        public double P(yj.b bVar) {
            return aj.d.Z((a(bVar) * 870.536d) + 284.95d);
        }

        @Override // ej.h
        public xi.f V(yj.b bVar) {
            double dC = c(bVar);
            double dZ = aj.d.Z((4850.4046d * dC) + 99.360714d);
            double dZ2 = aj.d.Z((1191.9605d * dC) + 175.895369d);
            double dZ3 = aj.d.Z((262.5475d * dC) + 300.323162d);
            double dZ4 = aj.d.Z((6070.2476d * dC) + 114.012305d);
            double dZ5 = aj.d.Z((64.3d * dC) + 49.511251d);
            aj.m mVarR = aj.d.R(dZ);
            aj.m mVarR2 = aj.d.R(dZ2);
            aj.m mVarR3 = aj.d.R(dZ3);
            aj.m mVarR4 = aj.d.R(dZ4);
            aj.m mVarR5 = aj.d.R(dZ5);
            return new xi.f(aj.d.Z(((-0.006499d) * dC) + 268.056595d + (mVarR.b() * 1.17E-4d) + (mVarR2.b() * 9.38E-4d) + (mVarR3.b() * 0.001432d) + (mVarR4.b() * 3.0E-5d) + (mVarR5.b() * 0.00215d)), aj.d.Z((dC * 0.002413d) + 64.495303d + (mVarR.a() * 5.0E-5d) + (mVarR2.a() * 4.04E-4d) + (mVarR3.a() * 6.17E-4d) + (mVarR4.a() * (-1.3E-5d)) + (mVarR5.a() * 9.26E-4d)));
        }
    }

    private static class e extends p {
        e(c0 c0Var) {
            super(c0Var);
        }

        @Override // ej.h
        public double P(yj.b bVar) {
            return aj.d.Z((a(bVar) * 350.89198226d) + 176.63d);
        }

        @Override // ej.h
        public xi.f V(yj.b bVar) {
            double dC = c(bVar);
            return new xi.f(aj.d.Z(((-0.1061d) * dC) + 317.68143d), aj.d.Z((dC * (-0.0609d)) + 52.8865d));
        }
    }

    private static class f extends p {
        f(c0 c0Var) {
            super(c0Var);
        }

        @Override // ej.h
        public double P(yj.b bVar) {
            double dA = a(bVar);
            return aj.d.Z((a(bVar) * 6.1385025d) + 329.5469d + (aj.d.P(aj.d.Z((4.092335d * dA) + 174.791086d)) * 0.00993822d) + (aj.d.P(aj.d.Z((8.18467d * dA) + 349.582171d)) * (-0.00104581d)) + (aj.d.P(aj.d.Z((12.277005d * dA) + 164.373257d)) * (-1.028E-4d)) + (aj.d.P(aj.d.Z((16.36934d * dA) + 339.164343d)) * (-2.364E-5d)) + (aj.d.P(aj.d.Z((dA * 20.461675d) + 153.955429d)) * (-5.32E-6d)));
        }

        @Override // ej.h
        public xi.f V(yj.b bVar) {
            double dC = c(bVar);
            return new xi.f(aj.d.Z(((-0.0328d) * dC) + 281.0097d), aj.d.Z((dC * (-0.0049d)) + 61.4143d));
        }
    }

    private static class g extends p {
        g(c0 c0Var) {
            super(c0Var);
        }

        @Override // ej.h
        public double P(yj.b bVar) {
            double dA = a(bVar);
            return aj.d.Z(((((-1.4E-12d) * dA) + 13.17635815d) * dA) + 38.3213d + (aj.d.P(aj.d.Z(((-0.0529921d) * dA) + 125.045d)) * 3.561d) + (aj.d.P(aj.d.Z(((-0.1059842d) * dA) + 250.089d)) * 0.1208d) + (aj.d.P(aj.d.Z((13.0120009d * dA) + 260.008d)) * (-0.0642d)) + (aj.d.P(aj.d.Z((13.3407154d * dA) + 176.625d)) * 0.0158d) + (aj.d.P(aj.d.Z((0.9856003d * dA) + 357.529d)) * 0.0252d) + (aj.d.P(aj.d.Z((26.4057084d * dA) + 311.589d)) * (-0.0066d)) + (aj.d.P(aj.d.Z((13.064993d * dA) + 134.963d)) * (-0.0047d)) + (aj.d.P(aj.d.Z((0.3287146d * dA) + 276.617d)) * (-0.0046d)) + (aj.d.P(aj.d.Z((1.7484877d * dA) + 34.226d)) * 0.0028d) + (aj.d.P(aj.d.Z(((-0.1589763d) * dA) + 15.134d)) * 0.0052d) + (aj.d.P(aj.d.Z((0.0036096d * dA) + 119.743d)) * 0.004d) + (aj.d.P(aj.d.Z((0.1643573d * dA) + 239.961d)) * 0.0019d) + (aj.d.P(aj.d.Z((dA * 12.9590088d) + 25.053d)) * (-0.0044d)));
        }

        @Override // ej.h
        public xi.f V(yj.b bVar) {
            double dA = a(bVar);
            double dC = c(bVar);
            aj.m mVarR = aj.d.R(aj.d.Z(((-0.0529921d) * dA) + 125.045d));
            aj.m mVarR2 = aj.d.R(aj.d.Z(((-0.1059842d) * dA) + 250.089d));
            aj.m mVarR3 = aj.d.R(aj.d.Z((13.0120009d * dA) + 260.008d));
            aj.m mVarR4 = aj.d.R(aj.d.Z((13.3407154d * dA) + 176.625d));
            aj.m mVarR5 = aj.d.R(aj.d.Z((26.4057084d * dA) + 311.589d));
            aj.m mVarR6 = aj.d.R(aj.d.Z(((-0.1589763d) * dA) + 15.134d));
            aj.m mVarR7 = aj.d.R(aj.d.Z((12.9590088d * dA) + 25.053d));
            return new xi.f(aj.d.Z((0.0031d * dC) + 269.9949d + (mVarR.b() * (-3.8787d)) + (mVarR2.b() * (-0.1204d)) + (mVarR3.b() * 0.07d) + (mVarR4.b() * (-0.0172d)) + (mVarR5.b() * 0.0072d) + (mVarR6.b() * (-0.0052d)) + (mVarR7.b() * 0.0043d)), aj.d.Z((dC * 0.013d) + 66.5392d + (mVarR.a() * 1.5419d) + (mVarR2.a() * 0.0239d) + (mVarR3.a() * (-0.0278d)) + (mVarR4.a() * 0.0068d) + (mVarR5.a() * (-0.0029d)) + (aj.d.n(aj.d.Z((dA * 13.064993d) + 134.963d)) * 9.0E-4d) + (mVarR6.a() * 8.0E-4d) + (mVarR7.a() * (-9.0E-4d))));
        }
    }

    private static class h extends p {
        h(c0 c0Var) {
            super(c0Var);
        }

        @Override // ej.h
        public double P(yj.b bVar) {
            return aj.d.Z((a(bVar) * 536.3128492d) + (aj.d.P(aj.d.Z((c(bVar) * 52.316d) + 357.85d)) * (-0.48d)) + 253.18d);
        }

        @Override // ej.h
        public xi.f V(yj.b bVar) {
            aj.m mVarR = aj.d.R(aj.d.Z((c(bVar) * 52.316d) + 357.85d));
            return new xi.f(aj.d.Z((mVarR.b() * 0.7d) + 299.36d), aj.d.Z((mVarR.a() * (-0.51d)) + 43.46d));
        }
    }

    private static class i extends p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final xi.f f12727b;

        i(c0 c0Var) {
            super(c0Var);
            this.f12727b = new xi.f(aj.d.Z(132.993d), aj.d.Z(-6.163d));
        }

        @Override // ej.h
        public double P(yj.b bVar) {
            return aj.d.Z((a(bVar) * 56.3625225d) + 302.695d);
        }

        @Override // ej.h
        public xi.f V(yj.b bVar) {
            return this.f12727b;
        }
    }

    private static class j extends p {
        j(c0 c0Var) {
            super(c0Var);
        }

        @Override // ej.h
        public double P(yj.b bVar) {
            return aj.d.Z((a(bVar) * 810.7939024d) + 38.9d);
        }

        @Override // ej.h
        public xi.f V(yj.b bVar) {
            double dC = c(bVar);
            return new xi.f(aj.d.Z(((-0.036d) * dC) + 40.589d), aj.d.Z((dC * (-0.004d)) + 83.537d));
        }
    }

    private static class k extends p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final xi.f f12728b;

        k(c0 c0Var) {
            super(c0Var);
            this.f12728b = new xi.f(aj.d.Z(286.13d), aj.d.Z(63.87d));
        }

        @Override // ej.h
        public double P(yj.b bVar) {
            return aj.d.Z((a(bVar) * 14.1844d) + 84.176d);
        }

        @Override // ej.h
        public xi.f V(yj.b bVar) {
            return this.f12728b;
        }
    }

    private static class l extends p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final xi.f f12729b;

        l(c0 c0Var) {
            super(c0Var);
            this.f12729b = new xi.f(aj.d.Z(257.311d), aj.d.Z(-15.175d));
        }

        @Override // ej.h
        public double P(yj.b bVar) {
            return aj.d.Z((a(bVar) * (-501.1600928d)) + 203.81d);
        }

        @Override // ej.h
        public xi.f V(yj.b bVar) {
            return this.f12729b;
        }
    }

    private static class m extends p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final xi.f f12730b;

        m(c0 c0Var) {
            super(c0Var);
            this.f12730b = new xi.f(aj.d.Z(272.76d), aj.d.Z(67.16d));
        }

        @Override // ej.h
        public double P(yj.b bVar) {
            return aj.d.Z((a(bVar) * (-1.4813688d)) + 160.2d);
        }

        @Override // ej.h
        public xi.f V(yj.b bVar) {
            return this.f12730b;
        }
    }

    p(c0 c0Var) {
        this.f12725a = c0Var;
    }

    public static p b(j.e eVar, c0 c0Var) {
        switch (a.f12726a[eVar.ordinal()]) {
            case 1:
                return new k(c0Var);
            case 2:
                return new f(c0Var);
            case 3:
                return new m(c0Var);
            case 4:
                return new b(c0Var);
            case 5:
                return new g(c0Var);
            case 6:
                return new e(c0Var);
            case 7:
                return new d(c0Var);
            case 8:
                return new j(c0Var);
            case 9:
                return new l(c0Var);
            case 10:
                return new h(c0Var);
            case 11:
                return new i(c0Var);
            default:
                return new c(c0Var);
        }
    }

    protected double a(yj.b bVar) {
        return bVar.d0(this.f12725a.c(), this.f12725a.d()) / 86400.0d;
    }

    protected double c(yj.b bVar) {
        return bVar.d0(this.f12725a.c(), this.f12725a.d()) / 3.15576E9d;
    }

    @Override // ej.h
    public /* synthetic */ xi.f y(yj.b bVar) {
        return ej.g.a(this, bVar);
    }
}
