package com.google.protobuf;

/* JADX INFO: loaded from: classes3.dex */
abstract class s2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile int f10092a = 100;

    s2() {
    }

    private final void l(Object obj, f2 f2Var, int i10) {
        while (f2Var.z() != Integer.MAX_VALUE && m(obj, f2Var, i10)) {
        }
    }

    abstract void a(Object obj, int i10, int i11);

    abstract void b(Object obj, int i10, long j10);

    abstract void c(Object obj, int i10, Object obj2);

    abstract void d(Object obj, int i10, l lVar);

    abstract void e(Object obj, int i10, long j10);

    abstract Object f(Object obj);

    abstract Object g(Object obj);

    abstract int h(Object obj);

    abstract int i(Object obj);

    abstract void j(Object obj);

    abstract Object k(Object obj, Object obj2);

    final boolean m(Object obj, f2 f2Var, int i10) throws p0 {
        int iA = f2Var.a();
        int iA2 = a3.a(iA);
        int iB = a3.b(iA);
        if (iB == 0) {
            e(obj, iA2, f2Var.L());
            return true;
        }
        if (iB == 1) {
            b(obj, iA2, f2Var.e());
            return true;
        }
        if (iB == 2) {
            d(obj, iA2, f2Var.E());
            return true;
        }
        if (iB != 3) {
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw p0.d();
            }
            a(obj, iA2, f2Var.k());
            return true;
        }
        Object objN = n();
        int iC = a3.c(iA2, 4);
        int i11 = i10 + 1;
        if (i11 >= f10092a) {
            throw p0.h();
        }
        l(objN, f2Var, i11);
        if (iC != f2Var.a()) {
            throw p0.a();
        }
        c(obj, iA2, r(objN));
        return true;
    }

    abstract Object n();

    abstract void o(Object obj, Object obj2);

    abstract void p(Object obj, Object obj2);

    abstract boolean q(f2 f2Var);

    abstract Object r(Object obj);
}
