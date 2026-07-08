package com.google.protobuf;

/* JADX INFO: loaded from: classes3.dex */
abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Class f10137a = c();

    public static y a() {
        y yVarB = b("getEmptyRegistry");
        return yVarB != null ? yVarB : y.f10151e;
    }

    private static final y b(String str) {
        Class cls = f10137a;
        if (cls == null) {
            return null;
        }
        try {
            return (y) cls.getDeclaredMethod(str, null).invoke(null, null);
        } catch (Exception unused) {
            return null;
        }
    }

    static Class c() {
        try {
            w wVar = w.f10124j;
            return w.class;
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
