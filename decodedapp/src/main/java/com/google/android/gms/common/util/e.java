package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Boolean f7220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Boolean f7221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Boolean f7222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Boolean f7223d;

    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f7223d == null) {
            boolean z10 = false;
            if (f.c() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z10 = true;
            }
            f7223d = Boolean.valueOf(z10);
        }
        return f7223d.booleanValue();
    }

    public static boolean b() {
        int i10 = s7.h.f26996a;
        return "user".equals(Build.TYPE);
    }

    public static boolean c(Context context) {
        return g(context.getPackageManager());
    }

    public static boolean d(Context context) {
        if (c(context) && !f.b()) {
            return true;
        }
        if (e(context)) {
            return !f.c() || f.f();
        }
        return false;
    }

    public static boolean e(Context context) {
        if (f7221b == null) {
            f7221b = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f7221b.booleanValue();
    }

    public static boolean f(Context context) {
        if (f7222c == null) {
            boolean z10 = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z10 = false;
            }
            f7222c = Boolean.valueOf(z10);
        }
        return f7222c.booleanValue();
    }

    public static boolean g(PackageManager packageManager) {
        if (f7220a == null) {
            f7220a = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        return f7220a.booleanValue();
    }
}
