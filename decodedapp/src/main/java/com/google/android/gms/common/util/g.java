package com.google.android.gms.common.util;

import android.os.Process;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Boolean f7224a;

    public static boolean a() {
        Boolean boolValueOf = f7224a;
        if (boolValueOf == null) {
            if (f.d()) {
                boolValueOf = Boolean.valueOf(Process.isIsolated());
            } else {
                try {
                    Object objA = i8.h.a(Process.class, "isIsolated", new i8.g[0]);
                    Object[] objArr = new Object[0];
                    if (objA == null) {
                        throw new i8.c(i8.b.a("expected a non-null reference", objArr));
                    }
                    boolValueOf = (Boolean) objA;
                } catch (ReflectiveOperationException unused) {
                    boolValueOf = Boolean.FALSE;
                }
            }
            f7224a = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }
}
