package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Build;
import android.text.format.DateUtils;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
abstract class e {
    static String a(Context context, long j10, boolean z10, boolean z11, boolean z12) {
        String strD = d(j10);
        if (z10) {
            strD = String.format(context.getString(u8.j.f28720v), strD);
        }
        return z11 ? String.format(context.getString(u8.j.f28719u), strD) : z12 ? String.format(context.getString(u8.j.f28716r), strD) : strD;
    }

    static String b(long j10) {
        return c(j10, Locale.getDefault());
    }

    static String c(long j10, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? u.f(locale).format(new Date(j10)) : u.e(locale).format(new Date(j10));
    }

    static String d(long j10) {
        return i(j10) ? b(j10) : g(j10);
    }

    static String e(Context context, int i10) {
        return u.i().get(1) == i10 ? String.format(context.getString(u8.j.f28717s), Integer.valueOf(i10)) : String.format(context.getString(u8.j.f28718t), Integer.valueOf(i10));
    }

    static String f(long j10) {
        return Build.VERSION.SDK_INT >= 24 ? u.m(Locale.getDefault()).format(new Date(j10)) : DateUtils.formatDateTime(null, j10, 8228);
    }

    static String g(long j10) {
        return h(j10, Locale.getDefault());
    }

    static String h(long j10, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? u.n(locale).format(new Date(j10)) : u.e(locale).format(new Date(j10));
    }

    private static boolean i(long j10) {
        Calendar calendarI = u.i();
        Calendar calendarK = u.k();
        calendarK.setTimeInMillis(j10);
        return calendarI.get(1) == calendarK.get(1);
    }
}
