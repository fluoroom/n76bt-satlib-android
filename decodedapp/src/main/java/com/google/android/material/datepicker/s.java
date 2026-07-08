package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
class s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final s f7822c = new s(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Long f7823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TimeZone f7824b;

    private s(Long l10, TimeZone timeZone) {
        this.f7823a = l10;
        this.f7824b = timeZone;
    }

    static s c() {
        return f7822c;
    }

    Calendar a() {
        return b(this.f7824b);
    }

    Calendar b(TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l10 = this.f7823a;
        if (l10 != null) {
            calendar.setTimeInMillis(l10.longValue());
        }
        return calendar;
    }
}
