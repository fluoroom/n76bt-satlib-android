package com.google.protobuf;

/* JADX INFO: loaded from: classes3.dex */
abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f8946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class f8947b = a("libcore.io.Memory");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f8948c;

    static {
        f8948c = (f8946a || a("org.robolectric.Robolectric") == null) ? false : true;
    }

    private static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static Class b() {
        return f8947b;
    }

    static boolean c() {
        if (f8946a) {
            return true;
        }
        return (f8947b == null || f8948c) ? false : true;
    }
}
