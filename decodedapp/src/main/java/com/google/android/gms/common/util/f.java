package com.google.android.gms.common.util;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static boolean a() {
        return true;
    }

    public static boolean b() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public static boolean c() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean d() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static boolean e() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static boolean f() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static boolean g() {
        return Build.VERSION.SDK_INT >= 31;
    }
}
