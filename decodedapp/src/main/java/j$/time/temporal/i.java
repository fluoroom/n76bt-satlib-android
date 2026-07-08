package j$.time.temporal;

import j$.time.Duration;

/* JADX INFO: loaded from: classes2.dex */
public enum i implements s {
    WEEK_BASED_YEARS("WeekBasedYears"),
    QUARTER_YEARS("QuarterYears");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17619a;

    static {
        Duration.i(31556952L, 0);
        Duration.i(7889238L, 0);
    }

    i(String str) {
        this.f17619a = str;
    }

    @Override // j$.time.temporal.s
    public final m i(m mVar, long j10) {
        int i10 = c.f17615a[ordinal()];
        if (i10 == 1) {
            return mVar.c(j$.com.android.tools.r8.a.t(mVar.i(r0), j10), j.f17622c);
        }
        if (i10 == 2) {
            return mVar.d(j10 / 4, b.YEARS).d((j10 % 4) * 3, b.MONTHS);
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f17619a;
    }
}
