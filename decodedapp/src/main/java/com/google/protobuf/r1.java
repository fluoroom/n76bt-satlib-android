package com.google.protobuf;

/* JADX INFO: loaded from: classes3.dex */
final class r1 implements h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l1 f10082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s2 f10083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f10084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final z f10085d;

    private r1(s2 s2Var, z zVar, l1 l1Var) {
        this.f10083b = s2Var;
        this.f10084c = zVar.d(l1Var);
        this.f10085d = zVar;
        this.f10082a = l1Var;
    }

    private int e(s2 s2Var, Object obj) {
        return s2Var.i(s2Var.g(obj));
    }

    private void f(s2 s2Var, z zVar, Object obj, f2 f2Var, y yVar) throws Throwable {
        s2 s2Var2;
        z zVar2;
        f2 f2Var2;
        y yVar2;
        Object objF = s2Var.f(obj);
        e0 e0VarC = zVar.c(obj);
        while (f2Var.z() != Integer.MAX_VALUE) {
            try {
                s2Var2 = s2Var;
                zVar2 = zVar;
                f2Var2 = f2Var;
                yVar2 = yVar;
            } catch (Throwable th2) {
                th = th2;
                s2Var2 = s2Var;
            }
            try {
                if (!h(f2Var2, yVar2, zVar2, e0VarC, s2Var2, objF)) {
                    s2Var2.o(obj, objF);
                    return;
                }
                f2Var = f2Var2;
                yVar = yVar2;
                zVar = zVar2;
                s2Var = s2Var2;
            } catch (Throwable th3) {
                th = th3;
                Throwable th4 = th;
                s2Var2.o(obj, objF);
                throw th4;
            }
        }
        s2Var.o(obj, objF);
    }

    static r1 g(s2 s2Var, z zVar, l1 l1Var) {
        return new r1(s2Var, zVar, l1Var);
    }

    private boolean h(f2 f2Var, y yVar, z zVar, e0 e0Var, s2 s2Var, Object obj) throws p0 {
        int iA = f2Var.a();
        int iP = 0;
        if (iA != a3.f8843a) {
            if (a3.b(iA) != 2) {
                return f2Var.H();
            }
            Object objA = zVar.a(yVar, this.f10082a, a3.a(iA));
            if (objA == null) {
                return s2Var.m(obj, f2Var, 0);
            }
            zVar.g(f2Var, objA, yVar, e0Var);
            return true;
        }
        Object objA2 = null;
        l lVarE = null;
        while (f2Var.z() != Integer.MAX_VALUE) {
            int iA2 = f2Var.a();
            if (iA2 == a3.f8845c) {
                iP = f2Var.p();
                objA2 = zVar.a(yVar, this.f10082a, iP);
            } else if (iA2 == a3.f8846d) {
                if (objA2 != null) {
                    zVar.g(f2Var, objA2, yVar, e0Var);
                } else {
                    lVarE = f2Var.E();
                }
            } else if (!f2Var.H()) {
                break;
            }
        }
        if (f2Var.a() != a3.f8844b) {
            throw p0.a();
        }
        if (lVarE != null) {
            if (objA2 != null) {
                zVar.h(lVarE, objA2, yVar, e0Var);
            } else {
                s2Var.d(obj, iP, lVarE);
            }
        }
        return true;
    }

    @Override // com.google.protobuf.h2
    public void a(Object obj, Object obj2) {
        j2.G(this.f10083b, obj, obj2);
        if (this.f10084c) {
            j2.E(this.f10085d, obj, obj2);
        }
    }

    @Override // com.google.protobuf.h2
    public void b(Object obj) {
        this.f10083b.j(obj);
        this.f10085d.e(obj);
    }

    @Override // com.google.protobuf.h2
    public void c(Object obj, f2 f2Var, y yVar) throws Throwable {
        f(this.f10083b, this.f10085d, obj, f2Var, yVar);
    }

    @Override // com.google.protobuf.h2
    public int d(Object obj) {
        int iE = e(this.f10083b, obj);
        return this.f10084c ? iE + this.f10085d.b(obj).r() : iE;
    }

    @Override // com.google.protobuf.h2
    public Object newInstance() {
        return this.f10082a.newBuilderForType().buildPartial();
    }
}
