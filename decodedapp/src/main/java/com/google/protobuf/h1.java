package com.google.protobuf;

/* JADX INFO: loaded from: classes3.dex */
abstract class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final e1 f9035a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final e1 f9036b = new g1();

    static e1 a() {
        return f9035a;
    }

    static e1 b() {
        return f9036b;
    }

    private static e1 c() {
        try {
            return (e1) f1.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
