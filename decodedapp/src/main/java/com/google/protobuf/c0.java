package com.google.protobuf;

/* JADX INFO: loaded from: classes3.dex */
abstract class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final z f8921a = new b0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final z f8922b = c();

    static z a() {
        z zVar = f8922b;
        if (zVar != null) {
            return zVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static z b() {
        return f8921a;
    }

    private static z c() {
        try {
            int i10 = a0.f8842b;
            return (z) a0.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
