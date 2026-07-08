package com.google.protobuf;

import com.google.protobuf.k0;

/* JADX INFO: loaded from: classes3.dex */
final class a0 extends z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f8841a = i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f8842b = 0;

    a0() {
    }

    private static long i() {
        return y2.M(k0.e.class.getDeclaredField("a"));
    }

    @Override // com.google.protobuf.z
    Object a(y yVar, l1 l1Var, int i10) {
        ((w) yVar).d(((i1) l1Var).getDescriptorForType(), i10);
        return null;
    }

    @Override // com.google.protobuf.z
    public e0 b(Object obj) {
        return (e0) y2.G(obj, f8841a);
    }

    @Override // com.google.protobuf.z
    e0 c(Object obj) {
        e0 e0VarB = b(obj);
        if (!e0VarB.z()) {
            return e0VarB;
        }
        e0 e0VarClone = e0VarB.clone();
        j(obj, e0VarClone);
        return e0VarClone;
    }

    @Override // com.google.protobuf.z
    boolean d(l1 l1Var) {
        return l1Var instanceof k0.e;
    }

    @Override // com.google.protobuf.z
    void e(Object obj) {
        b(obj).F();
    }

    @Override // com.google.protobuf.z
    Object f(Object obj, f2 f2Var, Object obj2, y yVar, e0 e0Var, Object obj3, s2 s2Var) {
        android.support.v4.media.session.b.a(obj2);
        throw null;
    }

    @Override // com.google.protobuf.z
    void g(f2 f2Var, Object obj, y yVar, e0 e0Var) {
        android.support.v4.media.session.b.a(obj);
        if (!y.c()) {
            throw null;
        }
        throw null;
    }

    @Override // com.google.protobuf.z
    void h(l lVar, Object obj, y yVar, e0 e0Var) {
        android.support.v4.media.session.b.a(obj);
        throw null;
    }

    void j(Object obj, e0 e0Var) {
        y2.X(obj, f8841a, e0Var);
    }
}
