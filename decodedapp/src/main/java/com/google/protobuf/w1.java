package com.google.protobuf;

/* JADX INFO: loaded from: classes3.dex */
abstract class w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final t1 f10134a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final t1 f10135b = new v1();

    static t1 a() {
        return f10134a;
    }

    static t1 b() {
        return f10135b;
    }

    private static t1 c() {
        try {
            return (t1) u1.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
