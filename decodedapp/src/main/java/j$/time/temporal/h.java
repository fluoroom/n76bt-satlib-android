package j$.time.temporal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public abstract class h implements q {
    public static final h DAY_OF_QUARTER;
    public static final h QUARTER_OF_YEAR;
    public static final h WEEK_BASED_YEAR;
    public static final h WEEK_OF_WEEK_BASED_YEAR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f17616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ h[] f17617b;

    @Override // j$.time.temporal.q
    public final boolean isDateBased() {
        return true;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f17617b.clone();
    }

    static {
        h hVar = new h() { // from class: j$.time.temporal.d
            @Override // j$.time.temporal.q
            public final u k() {
                return u.f(90L, 92L);
            }

            @Override // j$.time.temporal.q
            public final boolean i(n nVar) {
                if (!nVar.e(a.DAY_OF_YEAR) || !nVar.e(a.MONTH_OF_YEAR) || !nVar.e(a.YEAR)) {
                    return false;
                }
                h hVar2 = j.f17620a;
                return j$.com.android.tools.r8.a.s(nVar).equals(j$.time.chrono.t.f17501c);
            }

            @Override // j$.time.temporal.q
            public final u j(n nVar) {
                if (!i(nVar)) {
                    throw new t("Unsupported field: DayOfQuarter");
                }
                long jW = nVar.w(h.QUARTER_OF_YEAR);
                if (jW == 1) {
                    long jW2 = nVar.w(a.YEAR);
                    j$.time.chrono.t.f17501c.getClass();
                    return j$.time.chrono.t.j(jW2) ? u.e(1L, 91L) : u.e(1L, 90L);
                }
                if (jW == 2) {
                    return u.e(1L, 91L);
                }
                if (jW == 3 || jW == 4) {
                    return u.e(1L, 92L);
                }
                return k();
            }

            @Override // j$.time.temporal.q
            public final long l(n nVar) {
                if (!i(nVar)) {
                    throw new t("Unsupported field: DayOfQuarter");
                }
                int i10 = nVar.i(a.DAY_OF_YEAR);
                int i11 = nVar.i(a.MONTH_OF_YEAR);
                long jW = nVar.w(a.YEAR);
                int i12 = (i11 - 1) / 3;
                j$.time.chrono.t.f17501c.getClass();
                return i10 - h.f17616a[i12 + (j$.time.chrono.t.j(jW) ? 4 : 0)];
            }

            @Override // j$.time.temporal.q
            public final m o(m mVar, long j10) {
                long jL = l(mVar);
                k().b(j10, this);
                a aVar = a.DAY_OF_YEAR;
                return mVar.c((j10 - jL) + mVar.w(aVar), aVar);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }
        };
        DAY_OF_QUARTER = hVar;
        h hVar2 = new h() { // from class: j$.time.temporal.e
            @Override // j$.time.temporal.q
            public final u k() {
                return u.e(1L, 4L);
            }

            @Override // j$.time.temporal.q
            public final boolean i(n nVar) {
                if (!nVar.e(a.MONTH_OF_YEAR)) {
                    return false;
                }
                h hVar3 = j.f17620a;
                return j$.com.android.tools.r8.a.s(nVar).equals(j$.time.chrono.t.f17501c);
            }

            @Override // j$.time.temporal.q
            public final long l(n nVar) {
                if (!i(nVar)) {
                    throw new t("Unsupported field: QuarterOfYear");
                }
                return (nVar.w(a.MONTH_OF_YEAR) + 2) / 3;
            }

            @Override // j$.time.temporal.q
            public final u j(n nVar) {
                if (!i(nVar)) {
                    throw new t("Unsupported field: QuarterOfYear");
                }
                return k();
            }

            @Override // j$.time.temporal.q
            public final m o(m mVar, long j10) {
                long jL = l(mVar);
                k().b(j10, this);
                a aVar = a.MONTH_OF_YEAR;
                return mVar.c(((j10 - jL) * 3) + mVar.w(aVar), aVar);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }
        };
        QUARTER_OF_YEAR = hVar2;
        h hVar3 = new h() { // from class: j$.time.temporal.f
            @Override // j$.time.temporal.q
            public final u k() {
                return u.f(52L, 53L);
            }

            @Override // j$.time.temporal.q
            public final boolean i(n nVar) {
                if (!nVar.e(a.EPOCH_DAY)) {
                    return false;
                }
                h hVar4 = j.f17620a;
                return j$.com.android.tools.r8.a.s(nVar).equals(j$.time.chrono.t.f17501c);
            }

            @Override // j$.time.temporal.q
            public final u j(n nVar) {
                if (!i(nVar)) {
                    throw new t("Unsupported field: WeekOfWeekBasedYear");
                }
                return u.e(1L, h.C(h.w(j$.time.g.E(nVar))));
            }

            @Override // j$.time.temporal.q
            public final long l(n nVar) {
                if (!i(nVar)) {
                    throw new t("Unsupported field: WeekOfWeekBasedYear");
                }
                return h.s(j$.time.g.E(nVar));
            }

            @Override // j$.time.temporal.q
            public final m o(m mVar, long j10) {
                k().b(j10, this);
                return mVar.d(j$.com.android.tools.r8.a.z(j10, l(mVar)), b.WEEKS);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = hVar3;
        h hVar4 = new h() { // from class: j$.time.temporal.g
            @Override // j$.time.temporal.q
            public final u k() {
                return a.YEAR.f17612b;
            }

            @Override // j$.time.temporal.q
            public final boolean i(n nVar) {
                if (!nVar.e(a.EPOCH_DAY)) {
                    return false;
                }
                h hVar5 = j.f17620a;
                return j$.com.android.tools.r8.a.s(nVar).equals(j$.time.chrono.t.f17501c);
            }

            @Override // j$.time.temporal.q
            public final long l(n nVar) {
                if (i(nVar)) {
                    return h.w(j$.time.g.E(nVar));
                }
                throw new t("Unsupported field: WeekBasedYear");
            }

            @Override // j$.time.temporal.q
            public final u j(n nVar) {
                if (!i(nVar)) {
                    throw new t("Unsupported field: WeekBasedYear");
                }
                return k();
            }

            @Override // j$.time.temporal.q
            public final m o(m mVar, long j10) {
                if (!i(mVar)) {
                    throw new t("Unsupported field: WeekBasedYear");
                }
                int iA = a.YEAR.f17612b.a(j10, h.WEEK_BASED_YEAR);
                j$.time.g gVarE = j$.time.g.E(mVar);
                int i10 = gVarE.i(a.DAY_OF_WEEK);
                int iS = h.s(gVarE);
                if (iS == 53 && h.C(iA) == 52) {
                    iS = 52;
                }
                return mVar.j(j$.time.g.K(iA, 1, 4).N(((iS - 1) * 7) + (i10 - r6.i(r0))));
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }
        };
        WEEK_BASED_YEAR = hVar4;
        f17617b = new h[]{hVar, hVar2, hVar3, hVar4};
        f17616a = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
    }

    public static int C(int i10) {
        j$.time.g gVarK = j$.time.g.K(i10, 1, 1);
        if (gVarK.G() != j$.time.d.THURSDAY) {
            return (gVarK.G() == j$.time.d.WEDNESDAY && gVarK.I()) ? 53 : 52;
        }
        return 53;
    }

    public static int s(j$.time.g gVar) {
        int iOrdinal = gVar.G().ordinal();
        int iH = gVar.H() - 1;
        int i10 = (3 - iOrdinal) + iH;
        int i11 = i10 - ((i10 / 7) * 7);
        int i12 = i11 - 3;
        if (i12 < -3) {
            i12 = i11 + 4;
        }
        if (iH < i12) {
            return (int) u.e(1L, C(w(gVar.T(180).P(-1L)))).f17640d;
        }
        int i13 = ((iH - i12) / 7) + 1;
        if (i13 != 53 || i12 == -3 || (i12 == -2 && gVar.I())) {
            return i13;
        }
        return 1;
    }

    public static int w(j$.time.g gVar) {
        int i10 = gVar.f17572a;
        int iH = gVar.H();
        if (iH <= 3) {
            return iH - gVar.G().ordinal() < -2 ? i10 - 1 : i10;
        }
        if (iH >= 363) {
            return ((iH - 363) - (gVar.I() ? 1 : 0)) - gVar.G().ordinal() >= 0 ? i10 + 1 : i10;
        }
        return i10;
    }
}
