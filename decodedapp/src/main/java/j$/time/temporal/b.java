package j$.time.temporal;

import j$.time.Duration;

/* JADX INFO: loaded from: classes2.dex */
public enum b implements s {
    NANOS("Nanos"),
    MICROS("Micros"),
    MILLIS("Millis"),
    SECONDS("Seconds"),
    MINUTES("Minutes"),
    HOURS("Hours"),
    HALF_DAYS("HalfDays"),
    DAYS("Days"),
    WEEKS("Weeks"),
    MONTHS("Months"),
    YEARS("Years"),
    DECADES("Decades"),
    CENTURIES("Centuries"),
    MILLENNIA("Millennia"),
    ERAS("Eras"),
    FOREVER("Forever");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17614a;

    static {
        Duration.j(1L);
        Duration.j(1000L);
        Duration.j(1000000L);
        Duration.i(1L, 0);
        Duration.i(60L, 0);
        Duration.i(3600L, 0);
        Duration.i(43200L, 0);
        Duration.i(86400L, 0);
        Duration.i(604800L, 0);
        Duration.i(2629746L, 0);
        Duration.i(31556952L, 0);
        Duration.i(315569520L, 0);
        Duration.i(3155695200L, 0);
        Duration.i(31556952000L, 0);
        Duration.i(31556952000000000L, 0);
        Duration.i(j$.com.android.tools.r8.a.t(Long.MAX_VALUE, j$.com.android.tools.r8.a.x(999999999L, 1000000000L)), (int) j$.com.android.tools.r8.a.w(999999999L, 1000000000L));
    }

    b(String str) {
        this.f17614a = str;
    }

    @Override // j$.time.temporal.s
    public final m i(m mVar, long j10) {
        return mVar.d(j10, this);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f17614a;
    }
}
