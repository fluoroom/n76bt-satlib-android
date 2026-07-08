package com.google.protobuf;

/* JADX INFO: loaded from: classes3.dex */
class i0 implements k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final i0 f9037a = new i0();

    private i0() {
    }

    public static i0 c() {
        return f9037a;
    }

    @Override // com.google.protobuf.k1
    public j1 a(Class cls) {
        if (!j0.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            j0.b(cls.asSubclass(j0.class));
            throw null;
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e10);
        }
    }

    @Override // com.google.protobuf.k1
    public boolean b(Class cls) {
        return j0.class.isAssignableFrom(cls);
    }
}
