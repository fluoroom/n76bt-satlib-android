package kj;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final yj.c0 f20014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Supplier f20015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient Map f20016c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private transient Map f20017d = new HashMap();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f20018a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f20019b;

        static {
            int[] iArr = new int[zj.s.values().length];
            f20019b = iArr;
            try {
                iArr[zj.s.f33452a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20019b[zj.s.f33453b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20019b[zj.s.f33454c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[j1.values().length];
            f20018a = iArr2;
            try {
                iArr2[j1.GCRF.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20018a[j1.ICRF.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20018a[j1.ECLIPTIC_CONVENTIONS_1996.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20018a[j1.ECLIPTIC_CONVENTIONS_2003.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f20018a[j1.ECLIPTIC_CONVENTIONS_2010.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f20018a[j1.EME2000.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f20018a[j1.ITRF_CIO_CONV_2010_SIMPLE_EOP.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f20018a[j1.ITRF_CIO_CONV_2010_ACCURATE_EOP.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f20018a[j1.ITRF_CIO_CONV_2003_SIMPLE_EOP.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f20018a[j1.ITRF_CIO_CONV_2003_ACCURATE_EOP.ordinal()] = 10;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f20018a[j1.ITRF_CIO_CONV_1996_SIMPLE_EOP.ordinal()] = 11;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f20018a[j1.ITRF_CIO_CONV_1996_ACCURATE_EOP.ordinal()] = 12;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f20018a[j1.ITRF_EQUINOX_CONV_2010_SIMPLE_EOP.ordinal()] = 13;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f20018a[j1.ITRF_EQUINOX_CONV_2010_ACCURATE_EOP.ordinal()] = 14;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f20018a[j1.ITRF_EQUINOX_CONV_2003_SIMPLE_EOP.ordinal()] = 15;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f20018a[j1.ITRF_EQUINOX_CONV_2003_ACCURATE_EOP.ordinal()] = 16;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f20018a[j1.ITRF_EQUINOX_CONV_1996_SIMPLE_EOP.ordinal()] = 17;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f20018a[j1.ITRF_EQUINOX_CONV_1996_ACCURATE_EOP.ordinal()] = 18;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f20018a[j1.TIRF_CONVENTIONS_2010_SIMPLE_EOP.ordinal()] = 19;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f20018a[j1.TIRF_CONVENTIONS_2010_ACCURATE_EOP.ordinal()] = 20;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f20018a[j1.TIRF_CONVENTIONS_2003_SIMPLE_EOP.ordinal()] = 21;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f20018a[j1.TIRF_CONVENTIONS_2003_ACCURATE_EOP.ordinal()] = 22;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f20018a[j1.TIRF_CONVENTIONS_1996_SIMPLE_EOP.ordinal()] = 23;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f20018a[j1.TIRF_CONVENTIONS_1996_ACCURATE_EOP.ordinal()] = 24;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f20018a[j1.CIRF_CONVENTIONS_2010_ACCURATE_EOP.ordinal()] = 25;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f20018a[j1.CIRF_CONVENTIONS_2010_SIMPLE_EOP.ordinal()] = 26;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f20018a[j1.CIRF_CONVENTIONS_2003_ACCURATE_EOP.ordinal()] = 27;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f20018a[j1.CIRF_CONVENTIONS_2003_SIMPLE_EOP.ordinal()] = 28;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f20018a[j1.CIRF_CONVENTIONS_1996_ACCURATE_EOP.ordinal()] = 29;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f20018a[j1.CIRF_CONVENTIONS_1996_SIMPLE_EOP.ordinal()] = 30;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f20018a[j1.VEIS_1950.ordinal()] = 31;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f20018a[j1.GTOD_WITHOUT_EOP_CORRECTIONS.ordinal()] = 32;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f20018a[j1.GTOD_CONVENTIONS_2010_ACCURATE_EOP.ordinal()] = 33;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f20018a[j1.GTOD_CONVENTIONS_2010_SIMPLE_EOP.ordinal()] = 34;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f20018a[j1.GTOD_CONVENTIONS_2003_ACCURATE_EOP.ordinal()] = 35;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f20018a[j1.GTOD_CONVENTIONS_2003_SIMPLE_EOP.ordinal()] = 36;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f20018a[j1.GTOD_CONVENTIONS_1996_ACCURATE_EOP.ordinal()] = 37;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f20018a[j1.GTOD_CONVENTIONS_1996_SIMPLE_EOP.ordinal()] = 38;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f20018a[j1.TOD_WITHOUT_EOP_CORRECTIONS.ordinal()] = 39;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                f20018a[j1.TOD_CONVENTIONS_2010_ACCURATE_EOP.ordinal()] = 40;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                f20018a[j1.TOD_CONVENTIONS_2010_SIMPLE_EOP.ordinal()] = 41;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                f20018a[j1.TOD_CONVENTIONS_2003_ACCURATE_EOP.ordinal()] = 42;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                f20018a[j1.TOD_CONVENTIONS_2003_SIMPLE_EOP.ordinal()] = 43;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                f20018a[j1.TOD_CONVENTIONS_1996_ACCURATE_EOP.ordinal()] = 44;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                f20018a[j1.TOD_CONVENTIONS_1996_SIMPLE_EOP.ordinal()] = 45;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                f20018a[j1.MOD_WITHOUT_EOP_CORRECTIONS.ordinal()] = 46;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                f20018a[j1.MOD_CONVENTIONS_2010.ordinal()] = 47;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                f20018a[j1.MOD_CONVENTIONS_2003.ordinal()] = 48;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                f20018a[j1.MOD_CONVENTIONS_1996.ordinal()] = 49;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                f20018a[j1.TEME.ordinal()] = 50;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                f20018a[j1.PZ90_11.ordinal()] = 51;
            } catch (NoSuchFieldError unused54) {
            }
        }
    }

    public c(yj.c0 c0Var, Supplier supplier) {
        this.f20014a = c0Var;
        this.f20015b = supplier;
    }

    private g0 e(zj.s sVar, boolean z10, boolean z11) {
        j1 j1Var;
        g0 g0Var;
        synchronized (this) {
            try {
                int i10 = a.f20019b[sVar.ordinal()];
                if (i10 == 1) {
                    j1Var = z10 ? z11 ? j1.GTOD_CONVENTIONS_1996_SIMPLE_EOP : j1.GTOD_CONVENTIONS_1996_ACCURATE_EOP : j1.GTOD_WITHOUT_EOP_CORRECTIONS;
                } else if (i10 == 2) {
                    j1Var = z11 ? j1.GTOD_CONVENTIONS_2003_SIMPLE_EOP : j1.GTOD_CONVENTIONS_2003_ACCURATE_EOP;
                } else {
                    if (i10 != 3) {
                        throw new hj.e(null);
                    }
                    j1Var = z11 ? j1.GTOD_CONVENTIONS_2010_SIMPLE_EOP : j1.GTOD_CONVENTIONS_2010_ACCURATE_EOP;
                }
                g0Var = (g0) this.f20016c.get(j1Var);
                if (g0Var == null) {
                    g0 g0VarK = k(sVar, z10, z11);
                    r1 r1Var = (r1) g0VarK.v();
                    g0 g0Var2 = new g0(g0VarK, new r1(new u0(sVar, ((w1) r1Var.g()).d(), l()), zj.d.USE_PVA, zj.c.USE_R, r1Var.f(), r1Var.h(), zj.x0.a(), 3.15576E7d, 2592000.0d), false, j1Var);
                    this.f20016c.put(j1Var, g0Var2);
                    g0Var = g0Var2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return g0Var;
    }

    private g0 h(zj.s sVar, boolean z10) {
        r0 r0VarD;
        j1 j1Var;
        g0 g0Var;
        synchronized (this) {
            try {
                int i10 = a.f20019b[sVar.ordinal()];
                if (i10 == 1) {
                    j1 j1Var2 = z10 ? j1.MOD_CONVENTIONS_1996 : j1.MOD_WITHOUT_EOP_CORRECTIONS;
                    r0VarD = z10 ? d() : c();
                    j1Var = j1Var2;
                } else if (i10 == 2) {
                    j1Var = j1.MOD_CONVENTIONS_2003;
                    r0VarD = c();
                } else {
                    if (i10 != 3) {
                        throw new hj.e(null);
                    }
                    j1Var = j1.MOD_CONVENTIONS_2010;
                    r0VarD = c();
                }
                g0Var = (g0) this.f20016c.get(j1Var);
                if (g0Var == null) {
                    g0 g0Var2 = new g0(r0VarD, new g1(sVar, l()), true, j1Var);
                    this.f20016c.put(j1Var, g0Var2);
                    g0Var = g0Var2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return g0Var;
    }

    private g0 k(zj.s sVar, boolean z10, boolean z11) {
        j1 j1Var;
        g0 g0Var;
        synchronized (this) {
            try {
                int i10 = a.f20019b[sVar.ordinal()];
                if (i10 == 1) {
                    j1Var = z10 ? z11 ? j1.TOD_CONVENTIONS_1996_SIMPLE_EOP : j1.TOD_CONVENTIONS_1996_ACCURATE_EOP : j1.TOD_WITHOUT_EOP_CORRECTIONS;
                } else if (i10 == 2) {
                    j1Var = z11 ? j1.TOD_CONVENTIONS_2003_SIMPLE_EOP : j1.TOD_CONVENTIONS_2003_ACCURATE_EOP;
                } else {
                    if (i10 != 3) {
                        throw new hj.e(null);
                    }
                    j1Var = z11 ? j1.TOD_CONVENTIONS_2010_SIMPLE_EOP : j1.TOD_CONVENTIONS_2010_ACCURATE_EOP;
                }
                int i11 = z10 ? 24 : 8;
                g0Var = (g0) this.f20016c.get(j1Var);
                if (g0Var == null) {
                    g0 g0Var2 = new g0(h(sVar, z10), new r1(new w1(sVar, z10 ? a(sVar, z11) : null, l()), zj.d.USE_PVA, zj.c.USE_R, 6, 86400.0d / ((double) i11), zj.x0.a(), 3.15576E7d, 2592000.0d), true, j1Var);
                    this.f20016c.put(j1Var, g0Var2);
                    g0Var = g0Var2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return g0Var;
    }

    public g0 b(zj.s sVar, boolean z10) {
        j1 j1Var;
        g0 g0Var;
        synchronized (this) {
            try {
                int i10 = a.f20019b[sVar.ordinal()];
                if (i10 == 1) {
                    j1Var = z10 ? j1.CIRF_CONVENTIONS_1996_SIMPLE_EOP : j1.CIRF_CONVENTIONS_1996_ACCURATE_EOP;
                } else if (i10 == 2) {
                    j1Var = z10 ? j1.CIRF_CONVENTIONS_2003_SIMPLE_EOP : j1.CIRF_CONVENTIONS_2003_ACCURATE_EOP;
                } else {
                    if (i10 != 3) {
                        throw new hj.e(null);
                    }
                    j1Var = z10 ? j1.CIRF_CONVENTIONS_2010_SIMPLE_EOP : j1.CIRF_CONVENTIONS_2010_ACCURATE_EOP;
                }
                g0Var = (g0) this.f20016c.get(j1Var);
                if (g0Var == null) {
                    g0Var = new g0(d(), new r1(new f(a(sVar, z10)), zj.d.USE_PVA, zj.c.USE_R, 6, 3600.0d, zj.x0.a(), 3.15576E7d, 2592000.0d), true, j1Var);
                    this.f20016c.put(j1Var, g0Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return g0Var;
    }

    public g0 c() {
        g0 g0Var;
        synchronized (this) {
            try {
                Map map = this.f20016c;
                j1 j1Var = j1.EME2000;
                g0Var = (g0) map.get(j1Var);
                if (g0Var == null) {
                    g0Var = new g0(d(), new h(), true, j1Var);
                    this.f20016c.put(j1Var, g0Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return g0Var;
    }

    public r0 d() {
        return r0.t();
    }

    public g0 f(boolean z10) {
        return e(zj.s.f33452a, z10, true);
    }

    public g0 g(zj.s sVar, boolean z10) {
        j1 j1Var;
        g0 g0Var;
        synchronized (this) {
            try {
                int i10 = a.f20019b[sVar.ordinal()];
                if (i10 == 1) {
                    j1Var = z10 ? j1.ITRF_CIO_CONV_1996_SIMPLE_EOP : j1.ITRF_CIO_CONV_1996_ACCURATE_EOP;
                } else if (i10 == 2) {
                    j1Var = z10 ? j1.ITRF_CIO_CONV_2003_SIMPLE_EOP : j1.ITRF_CIO_CONV_2003_ACCURATE_EOP;
                } else {
                    if (i10 != 3) {
                        throw new hj.e(null);
                    }
                    j1Var = z10 ? j1.ITRF_CIO_CONV_2010_SIMPLE_EOP : j1.ITRF_CIO_CONV_2010_ACCURATE_EOP;
                }
                g0Var = (g0) this.f20016c.get(j1Var);
                if (g0Var == null) {
                    g0 g0VarJ = j(sVar, z10);
                    g0Var = new g0(g0VarJ, new v0(((v1) g0VarJ.v()).d()), false, j1Var);
                    this.f20016c.put(j1Var, g0Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return g0Var;
    }

    public g0 i() {
        g0 g0Var;
        synchronized (this) {
            try {
                j1 j1Var = j1.TEME;
                g0Var = (g0) this.f20016c.get(j1Var);
                if (g0Var == null) {
                    zj.s sVar = zj.s.f33452a;
                    g0 g0VarK = k(sVar, false, true);
                    r1 r1Var = (r1) g0VarK.v();
                    g0Var = new g0(g0VarK, new r1(new u1(sVar, null, l()), zj.d.USE_PVA, zj.c.USE_R, r1Var.f(), r1Var.h(), zj.x0.a(), 3.15576E7d, 2592000.0d), true, j1Var);
                    this.f20016c.put(j1Var, g0Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return g0Var;
    }

    public g0 j(zj.s sVar, boolean z10) {
        j1 j1Var;
        g0 g0Var;
        synchronized (this) {
            try {
                int i10 = a.f20019b[sVar.ordinal()];
                if (i10 == 1) {
                    j1Var = z10 ? j1.TIRF_CONVENTIONS_1996_SIMPLE_EOP : j1.TIRF_CONVENTIONS_1996_ACCURATE_EOP;
                } else if (i10 == 2) {
                    j1Var = z10 ? j1.TIRF_CONVENTIONS_2003_SIMPLE_EOP : j1.TIRF_CONVENTIONS_2003_ACCURATE_EOP;
                } else {
                    if (i10 != 3) {
                        throw new hj.e(null);
                    }
                    j1Var = z10 ? j1.TIRF_CONVENTIONS_2010_SIMPLE_EOP : j1.TIRF_CONVENTIONS_2010_ACCURATE_EOP;
                }
                g0Var = (g0) this.f20016c.get(j1Var);
                if (g0Var == null) {
                    g0 g0VarB = b(sVar, z10);
                    g0 g0Var2 = new g0(g0VarB, new v1(((f) ((r1) g0VarB.v()).g()).d(), l().f(sVar, z10)), false, j1Var);
                    this.f20016c.put(j1Var, g0Var2);
                    g0Var = g0Var2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return g0Var;
    }

    protected yj.c0 l() {
        return this.f20014a;
    }
}
