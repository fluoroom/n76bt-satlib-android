package com.google.protobuf;

import androidx.appcompat.widget.ActivityChooserView;
import com.google.protobuf.a1;
import com.google.protobuf.p0;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class n implements f2 {

    /* JADX INFO: renamed from: a */
    private final m f9197a;

    /* JADX INFO: renamed from: b */
    private int f9198b;

    /* JADX INFO: renamed from: c */
    private int f9199c;

    /* JADX INFO: renamed from: d */
    private int f9200d = 0;

    private n(m mVar) {
        m mVar2 = (m) o0.b(mVar, "input");
        this.f9197a = mVar2;
        mVar2.f9157d = this;
    }

    public static n O(m mVar) {
        n nVar = mVar.f9157d;
        return nVar != null ? nVar : new n(mVar);
    }

    private void P(Object obj, h2 h2Var, y yVar) {
        int i10 = this.f9199c;
        this.f9199c = a3.c(a3.a(this.f9198b), 4);
        try {
            h2Var.c(obj, this, yVar);
            if (this.f9198b == this.f9199c) {
            } else {
                throw p0.g();
            }
        } finally {
            this.f9199c = i10;
        }
    }

    private void Q(Object obj, h2 h2Var, y yVar) throws p0 {
        int iL = this.f9197a.L();
        m mVar = this.f9197a;
        if (mVar.f9154a >= mVar.f9155b) {
            throw p0.h();
        }
        int iP = mVar.p(iL);
        this.f9197a.f9154a++;
        h2Var.c(obj, this, yVar);
        this.f9197a.a(0);
        r5.f9154a--;
        this.f9197a.o(iP);
    }

    private Object R(h2 h2Var, y yVar) {
        Object objNewInstance = h2Var.newInstance();
        P(objNewInstance, h2Var, yVar);
        h2Var.b(objNewInstance);
        return objNewInstance;
    }

    private Object S(h2 h2Var, y yVar) throws p0 {
        Object objNewInstance = h2Var.newInstance();
        Q(objNewInstance, h2Var, yVar);
        h2Var.b(objNewInstance);
        return objNewInstance;
    }

    private void U(int i10) throws p0 {
        if (this.f9197a.f() != i10) {
            throw p0.l();
        }
    }

    private void V(int i10) throws p0.a {
        if (a3.b(this.f9198b) != i10) {
            throw p0.d();
        }
    }

    private void W(int i10) throws p0 {
        if ((i10 & 3) != 0) {
            throw p0.g();
        }
    }

    private void X(int i10) throws p0 {
        if ((i10 & 7) != 0) {
            throw p0.g();
        }
    }

    @Override // com.google.protobuf.f2
    public void A(List list) throws p0.a {
        T(list, false);
    }

    @Override // com.google.protobuf.f2
    public void B(Object obj, h2 h2Var, y yVar) throws p0 {
        V(2);
        Q(obj, h2Var, yVar);
    }

    @Override // com.google.protobuf.f2
    public void C(Map map, a1.a aVar, y yVar) throws p0.a {
        V(2);
        this.f9197a.p(this.f9197a.L());
        throw null;
    }

    @Override // com.google.protobuf.f2
    public void D(List list) throws p0.a {
        T(list, true);
    }

    @Override // com.google.protobuf.f2
    public l E() throws p0.a {
        V(2);
        return this.f9197a.r();
    }

    @Override // com.google.protobuf.f2
    public void F(List list) throws p0 {
        int iK;
        int iK2;
        if (!(list instanceof g0)) {
            int iB = a3.b(this.f9198b);
            if (iB == 2) {
                int iL = this.f9197a.L();
                W(iL);
                int iF = this.f9197a.f() + iL;
                do {
                    list.add(Float.valueOf(this.f9197a.w()));
                } while (this.f9197a.f() < iF);
                return;
            }
            if (iB != 5) {
                throw p0.d();
            }
            do {
                list.add(Float.valueOf(this.f9197a.w()));
                if (this.f9197a.g()) {
                    return;
                } else {
                    iK = this.f9197a.K();
                }
            } while (iK == this.f9198b);
            this.f9200d = iK;
            return;
        }
        g0 g0Var = (g0) list;
        int iB2 = a3.b(this.f9198b);
        if (iB2 == 2) {
            int iL2 = this.f9197a.L();
            W(iL2);
            int iF2 = this.f9197a.f() + iL2;
            do {
                g0Var.e(this.f9197a.w());
            } while (this.f9197a.f() < iF2);
            return;
        }
        if (iB2 != 5) {
            throw p0.d();
        }
        do {
            g0Var.e(this.f9197a.w());
            if (this.f9197a.g()) {
                return;
            } else {
                iK2 = this.f9197a.K();
            }
        } while (iK2 == this.f9198b);
        this.f9200d = iK2;
    }

    @Override // com.google.protobuf.f2
    public int G() throws p0.a {
        V(0);
        return this.f9197a.y();
    }

    @Override // com.google.protobuf.f2
    public boolean H() {
        int i10;
        if (this.f9197a.g() || (i10 = this.f9198b) == this.f9199c) {
            return false;
        }
        return this.f9197a.Q(i10);
    }

    @Override // com.google.protobuf.f2
    public int I() throws p0.a {
        V(5);
        return this.f9197a.E();
    }

    @Override // com.google.protobuf.f2
    public void J(List list) throws p0.a {
        int iK;
        if (a3.b(this.f9198b) != 2) {
            throw p0.d();
        }
        do {
            list.add(E());
            if (this.f9197a.g()) {
                return;
            } else {
                iK = this.f9197a.K();
            }
        } while (iK == this.f9198b);
        this.f9200d = iK;
    }

    @Override // com.google.protobuf.f2
    public void K(List list) throws p0 {
        int iK;
        int iK2;
        if (!(list instanceof s)) {
            int iB = a3.b(this.f9198b);
            if (iB == 1) {
                do {
                    list.add(Double.valueOf(this.f9197a.s()));
                    if (this.f9197a.g()) {
                        return;
                    } else {
                        iK = this.f9197a.K();
                    }
                } while (iK == this.f9198b);
                this.f9200d = iK;
                return;
            }
            if (iB != 2) {
                throw p0.d();
            }
            int iL = this.f9197a.L();
            X(iL);
            int iF = this.f9197a.f() + iL;
            do {
                list.add(Double.valueOf(this.f9197a.s()));
            } while (this.f9197a.f() < iF);
            return;
        }
        s sVar = (s) list;
        int iB2 = a3.b(this.f9198b);
        if (iB2 == 1) {
            do {
                sVar.e(this.f9197a.s());
                if (this.f9197a.g()) {
                    return;
                } else {
                    iK2 = this.f9197a.K();
                }
            } while (iK2 == this.f9198b);
            this.f9200d = iK2;
            return;
        }
        if (iB2 != 2) {
            throw p0.d();
        }
        int iL2 = this.f9197a.L();
        X(iL2);
        int iF2 = this.f9197a.f() + iL2;
        do {
            sVar.e(this.f9197a.s());
        } while (this.f9197a.f() < iF2);
    }

    @Override // com.google.protobuf.f2
    public long L() throws p0.a {
        V(0);
        return this.f9197a.z();
    }

    @Override // com.google.protobuf.f2
    public String M() throws p0.a {
        V(2);
        return this.f9197a.J();
    }

    @Override // com.google.protobuf.f2
    public void N(List list) throws p0 {
        int iK;
        int iK2;
        if (!(list instanceof x0)) {
            int iB = a3.b(this.f9198b);
            if (iB == 1) {
                do {
                    list.add(Long.valueOf(this.f9197a.v()));
                    if (this.f9197a.g()) {
                        return;
                    } else {
                        iK = this.f9197a.K();
                    }
                } while (iK == this.f9198b);
                this.f9200d = iK;
                return;
            }
            if (iB != 2) {
                throw p0.d();
            }
            int iL = this.f9197a.L();
            X(iL);
            int iF = this.f9197a.f() + iL;
            do {
                list.add(Long.valueOf(this.f9197a.v()));
            } while (this.f9197a.f() < iF);
            return;
        }
        x0 x0Var = (x0) list;
        int iB2 = a3.b(this.f9198b);
        if (iB2 == 1) {
            do {
                x0Var.G(this.f9197a.v());
                if (this.f9197a.g()) {
                    return;
                } else {
                    iK2 = this.f9197a.K();
                }
            } while (iK2 == this.f9198b);
            this.f9200d = iK2;
            return;
        }
        if (iB2 != 2) {
            throw p0.d();
        }
        int iL2 = this.f9197a.L();
        X(iL2);
        int iF2 = this.f9197a.f() + iL2;
        do {
            x0Var.G(this.f9197a.v());
        } while (this.f9197a.f() < iF2);
    }

    public void T(List list, boolean z10) throws p0.a {
        int iK;
        int iK2;
        if (a3.b(this.f9198b) != 2) {
            throw p0.d();
        }
        if (!(list instanceof v0) || z10) {
            do {
                list.add(z10 ? M() : c());
                if (this.f9197a.g()) {
                    return;
                } else {
                    iK = this.f9197a.K();
                }
            } while (iK == this.f9198b);
            this.f9200d = iK;
            return;
        }
        v0 v0Var = (v0) list;
        do {
            v0Var.w(E());
            if (this.f9197a.g()) {
                return;
            } else {
                iK2 = this.f9197a.K();
            }
        } while (iK2 == this.f9198b);
        this.f9200d = iK2;
    }

    @Override // com.google.protobuf.f2
    public int a() {
        return this.f9198b;
    }

    @Override // com.google.protobuf.f2
    public void b(List list) throws p0 {
        int iK;
        int iK2;
        if (!(list instanceof n0)) {
            int iB = a3.b(this.f9198b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f9197a.G()));
                    if (this.f9197a.g()) {
                        return;
                    } else {
                        iK = this.f9197a.K();
                    }
                } while (iK == this.f9198b);
                this.f9200d = iK;
                return;
            }
            if (iB != 2) {
                throw p0.d();
            }
            int iF = this.f9197a.f() + this.f9197a.L();
            do {
                list.add(Integer.valueOf(this.f9197a.G()));
            } while (this.f9197a.f() < iF);
            U(iF);
            return;
        }
        n0 n0Var = (n0) list;
        int iB2 = a3.b(this.f9198b);
        if (iB2 == 0) {
            do {
                n0Var.x(this.f9197a.G());
                if (this.f9197a.g()) {
                    return;
                } else {
                    iK2 = this.f9197a.K();
                }
            } while (iK2 == this.f9198b);
            this.f9200d = iK2;
            return;
        }
        if (iB2 != 2) {
            throw p0.d();
        }
        int iF2 = this.f9197a.f() + this.f9197a.L();
        do {
            n0Var.x(this.f9197a.G());
        } while (this.f9197a.f() < iF2);
        U(iF2);
    }

    @Override // com.google.protobuf.f2
    public String c() throws p0.a {
        V(2);
        return this.f9197a.I();
    }

    @Override // com.google.protobuf.f2
    public long d() throws p0.a {
        V(0);
        return this.f9197a.M();
    }

    @Override // com.google.protobuf.f2
    public long e() throws p0.a {
        V(1);
        return this.f9197a.v();
    }

    @Override // com.google.protobuf.f2
    public void f(List list) throws p0 {
        int iK;
        int iK2;
        if (!(list instanceof n0)) {
            int iB = a3.b(this.f9198b);
            if (iB == 2) {
                int iL = this.f9197a.L();
                W(iL);
                int iF = this.f9197a.f() + iL;
                do {
                    list.add(Integer.valueOf(this.f9197a.E()));
                } while (this.f9197a.f() < iF);
                return;
            }
            if (iB != 5) {
                throw p0.d();
            }
            do {
                list.add(Integer.valueOf(this.f9197a.E()));
                if (this.f9197a.g()) {
                    return;
                } else {
                    iK = this.f9197a.K();
                }
            } while (iK == this.f9198b);
            this.f9200d = iK;
            return;
        }
        n0 n0Var = (n0) list;
        int iB2 = a3.b(this.f9198b);
        if (iB2 == 2) {
            int iL2 = this.f9197a.L();
            W(iL2);
            int iF2 = this.f9197a.f() + iL2;
            do {
                n0Var.x(this.f9197a.E());
            } while (this.f9197a.f() < iF2);
            return;
        }
        if (iB2 != 5) {
            throw p0.d();
        }
        do {
            n0Var.x(this.f9197a.E());
            if (this.f9197a.g()) {
                return;
            } else {
                iK2 = this.f9197a.K();
            }
        } while (iK2 == this.f9198b);
        this.f9200d = iK2;
    }

    @Override // com.google.protobuf.f2
    public void g(List list) throws p0 {
        int iK;
        int iK2;
        if (!(list instanceof x0)) {
            int iB = a3.b(this.f9198b);
            if (iB == 0) {
                do {
                    list.add(Long.valueOf(this.f9197a.H()));
                    if (this.f9197a.g()) {
                        return;
                    } else {
                        iK = this.f9197a.K();
                    }
                } while (iK == this.f9198b);
                this.f9200d = iK;
                return;
            }
            if (iB != 2) {
                throw p0.d();
            }
            int iF = this.f9197a.f() + this.f9197a.L();
            do {
                list.add(Long.valueOf(this.f9197a.H()));
            } while (this.f9197a.f() < iF);
            U(iF);
            return;
        }
        x0 x0Var = (x0) list;
        int iB2 = a3.b(this.f9198b);
        if (iB2 == 0) {
            do {
                x0Var.G(this.f9197a.H());
                if (this.f9197a.g()) {
                    return;
                } else {
                    iK2 = this.f9197a.K();
                }
            } while (iK2 == this.f9198b);
            this.f9200d = iK2;
            return;
        }
        if (iB2 != 2) {
            throw p0.d();
        }
        int iF2 = this.f9197a.f() + this.f9197a.L();
        do {
            x0Var.G(this.f9197a.H());
        } while (this.f9197a.f() < iF2);
        U(iF2);
    }

    @Override // com.google.protobuf.f2
    public void h(List list, h2 h2Var, y yVar) throws p0.a {
        int iK;
        if (a3.b(this.f9198b) != 3) {
            throw p0.d();
        }
        int i10 = this.f9198b;
        do {
            list.add(R(h2Var, yVar));
            if (this.f9197a.g() || this.f9200d != 0) {
                return;
            } else {
                iK = this.f9197a.K();
            }
        } while (iK == i10);
        this.f9200d = iK;
    }

    @Override // com.google.protobuf.f2
    public void i(List list) throws p0 {
        int iK;
        int iK2;
        if (!(list instanceof n0)) {
            int iB = a3.b(this.f9198b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f9197a.L()));
                    if (this.f9197a.g()) {
                        return;
                    } else {
                        iK = this.f9197a.K();
                    }
                } while (iK == this.f9198b);
                this.f9200d = iK;
                return;
            }
            if (iB != 2) {
                throw p0.d();
            }
            int iF = this.f9197a.f() + this.f9197a.L();
            do {
                list.add(Integer.valueOf(this.f9197a.L()));
            } while (this.f9197a.f() < iF);
            U(iF);
            return;
        }
        n0 n0Var = (n0) list;
        int iB2 = a3.b(this.f9198b);
        if (iB2 == 0) {
            do {
                n0Var.x(this.f9197a.L());
                if (this.f9197a.g()) {
                    return;
                } else {
                    iK2 = this.f9197a.K();
                }
            } while (iK2 == this.f9198b);
            this.f9200d = iK2;
            return;
        }
        if (iB2 != 2) {
            throw p0.d();
        }
        int iF2 = this.f9197a.f() + this.f9197a.L();
        do {
            n0Var.x(this.f9197a.L());
        } while (this.f9197a.f() < iF2);
        U(iF2);
    }

    @Override // com.google.protobuf.f2
    public void j(Object obj, h2 h2Var, y yVar) throws p0.a {
        V(3);
        P(obj, h2Var, yVar);
    }

    @Override // com.google.protobuf.f2
    public int k() throws p0.a {
        V(5);
        return this.f9197a.u();
    }

    @Override // com.google.protobuf.f2
    public boolean l() throws p0.a {
        V(0);
        return this.f9197a.q();
    }

    @Override // com.google.protobuf.f2
    public void m(List list, h2 h2Var, y yVar) throws p0.a {
        int iK;
        if (a3.b(this.f9198b) != 2) {
            throw p0.d();
        }
        int i10 = this.f9198b;
        do {
            list.add(S(h2Var, yVar));
            if (this.f9197a.g() || this.f9200d != 0) {
                return;
            } else {
                iK = this.f9197a.K();
            }
        } while (iK == i10);
        this.f9200d = iK;
    }

    @Override // com.google.protobuf.f2
    public long n() throws p0.a {
        V(1);
        return this.f9197a.F();
    }

    @Override // com.google.protobuf.f2
    public void o(List list) throws p0 {
        int iK;
        int iK2;
        if (!(list instanceof x0)) {
            int iB = a3.b(this.f9198b);
            if (iB == 0) {
                do {
                    list.add(Long.valueOf(this.f9197a.M()));
                    if (this.f9197a.g()) {
                        return;
                    } else {
                        iK = this.f9197a.K();
                    }
                } while (iK == this.f9198b);
                this.f9200d = iK;
                return;
            }
            if (iB != 2) {
                throw p0.d();
            }
            int iF = this.f9197a.f() + this.f9197a.L();
            do {
                list.add(Long.valueOf(this.f9197a.M()));
            } while (this.f9197a.f() < iF);
            U(iF);
            return;
        }
        x0 x0Var = (x0) list;
        int iB2 = a3.b(this.f9198b);
        if (iB2 == 0) {
            do {
                x0Var.G(this.f9197a.M());
                if (this.f9197a.g()) {
                    return;
                } else {
                    iK2 = this.f9197a.K();
                }
            } while (iK2 == this.f9198b);
            this.f9200d = iK2;
            return;
        }
        if (iB2 != 2) {
            throw p0.d();
        }
        int iF2 = this.f9197a.f() + this.f9197a.L();
        do {
            x0Var.G(this.f9197a.M());
        } while (this.f9197a.f() < iF2);
        U(iF2);
    }

    @Override // com.google.protobuf.f2
    public int p() throws p0.a {
        V(0);
        return this.f9197a.L();
    }

    @Override // com.google.protobuf.f2
    public void q(List list) throws p0 {
        int iK;
        int iK2;
        if (!(list instanceof x0)) {
            int iB = a3.b(this.f9198b);
            if (iB == 0) {
                do {
                    list.add(Long.valueOf(this.f9197a.z()));
                    if (this.f9197a.g()) {
                        return;
                    } else {
                        iK = this.f9197a.K();
                    }
                } while (iK == this.f9198b);
                this.f9200d = iK;
                return;
            }
            if (iB != 2) {
                throw p0.d();
            }
            int iF = this.f9197a.f() + this.f9197a.L();
            do {
                list.add(Long.valueOf(this.f9197a.z()));
            } while (this.f9197a.f() < iF);
            U(iF);
            return;
        }
        x0 x0Var = (x0) list;
        int iB2 = a3.b(this.f9198b);
        if (iB2 == 0) {
            do {
                x0Var.G(this.f9197a.z());
                if (this.f9197a.g()) {
                    return;
                } else {
                    iK2 = this.f9197a.K();
                }
            } while (iK2 == this.f9198b);
            this.f9200d = iK2;
            return;
        }
        if (iB2 != 2) {
            throw p0.d();
        }
        int iF2 = this.f9197a.f() + this.f9197a.L();
        do {
            x0Var.G(this.f9197a.z());
        } while (this.f9197a.f() < iF2);
        U(iF2);
    }

    @Override // com.google.protobuf.f2
    public void r(List list) throws p0 {
        int iK;
        int iK2;
        if (!(list instanceof x0)) {
            int iB = a3.b(this.f9198b);
            if (iB == 1) {
                do {
                    list.add(Long.valueOf(this.f9197a.F()));
                    if (this.f9197a.g()) {
                        return;
                    } else {
                        iK = this.f9197a.K();
                    }
                } while (iK == this.f9198b);
                this.f9200d = iK;
                return;
            }
            if (iB != 2) {
                throw p0.d();
            }
            int iL = this.f9197a.L();
            X(iL);
            int iF = this.f9197a.f() + iL;
            do {
                list.add(Long.valueOf(this.f9197a.F()));
            } while (this.f9197a.f() < iF);
            return;
        }
        x0 x0Var = (x0) list;
        int iB2 = a3.b(this.f9198b);
        if (iB2 == 1) {
            do {
                x0Var.G(this.f9197a.F());
                if (this.f9197a.g()) {
                    return;
                } else {
                    iK2 = this.f9197a.K();
                }
            } while (iK2 == this.f9198b);
            this.f9200d = iK2;
            return;
        }
        if (iB2 != 2) {
            throw p0.d();
        }
        int iL2 = this.f9197a.L();
        X(iL2);
        int iF2 = this.f9197a.f() + iL2;
        do {
            x0Var.G(this.f9197a.F());
        } while (this.f9197a.f() < iF2);
    }

    @Override // com.google.protobuf.f2
    public double readDouble() throws p0.a {
        V(1);
        return this.f9197a.s();
    }

    @Override // com.google.protobuf.f2
    public float readFloat() throws p0.a {
        V(5);
        return this.f9197a.w();
    }

    @Override // com.google.protobuf.f2
    public void s(List list) throws p0 {
        int iK;
        int iK2;
        if (!(list instanceof n0)) {
            int iB = a3.b(this.f9198b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f9197a.y()));
                    if (this.f9197a.g()) {
                        return;
                    } else {
                        iK = this.f9197a.K();
                    }
                } while (iK == this.f9198b);
                this.f9200d = iK;
                return;
            }
            if (iB != 2) {
                throw p0.d();
            }
            int iF = this.f9197a.f() + this.f9197a.L();
            do {
                list.add(Integer.valueOf(this.f9197a.y()));
            } while (this.f9197a.f() < iF);
            U(iF);
            return;
        }
        n0 n0Var = (n0) list;
        int iB2 = a3.b(this.f9198b);
        if (iB2 == 0) {
            do {
                n0Var.x(this.f9197a.y());
                if (this.f9197a.g()) {
                    return;
                } else {
                    iK2 = this.f9197a.K();
                }
            } while (iK2 == this.f9198b);
            this.f9200d = iK2;
            return;
        }
        if (iB2 != 2) {
            throw p0.d();
        }
        int iF2 = this.f9197a.f() + this.f9197a.L();
        do {
            n0Var.x(this.f9197a.y());
        } while (this.f9197a.f() < iF2);
        U(iF2);
    }

    @Override // com.google.protobuf.f2
    public void t(List list) throws p0 {
        int iK;
        int iK2;
        if (!(list instanceof n0)) {
            int iB = a3.b(this.f9198b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f9197a.t()));
                    if (this.f9197a.g()) {
                        return;
                    } else {
                        iK = this.f9197a.K();
                    }
                } while (iK == this.f9198b);
                this.f9200d = iK;
                return;
            }
            if (iB != 2) {
                throw p0.d();
            }
            int iF = this.f9197a.f() + this.f9197a.L();
            do {
                list.add(Integer.valueOf(this.f9197a.t()));
            } while (this.f9197a.f() < iF);
            U(iF);
            return;
        }
        n0 n0Var = (n0) list;
        int iB2 = a3.b(this.f9198b);
        if (iB2 == 0) {
            do {
                n0Var.x(this.f9197a.t());
                if (this.f9197a.g()) {
                    return;
                } else {
                    iK2 = this.f9197a.K();
                }
            } while (iK2 == this.f9198b);
            this.f9200d = iK2;
            return;
        }
        if (iB2 != 2) {
            throw p0.d();
        }
        int iF2 = this.f9197a.f() + this.f9197a.L();
        do {
            n0Var.x(this.f9197a.t());
        } while (this.f9197a.f() < iF2);
        U(iF2);
    }

    @Override // com.google.protobuf.f2
    public int u() throws p0.a {
        V(0);
        return this.f9197a.t();
    }

    @Override // com.google.protobuf.f2
    public void v(List list) throws p0 {
        int iK;
        int iK2;
        if (!(list instanceof n0)) {
            int iB = a3.b(this.f9198b);
            if (iB == 2) {
                int iL = this.f9197a.L();
                W(iL);
                int iF = this.f9197a.f() + iL;
                do {
                    list.add(Integer.valueOf(this.f9197a.u()));
                } while (this.f9197a.f() < iF);
                return;
            }
            if (iB != 5) {
                throw p0.d();
            }
            do {
                list.add(Integer.valueOf(this.f9197a.u()));
                if (this.f9197a.g()) {
                    return;
                } else {
                    iK = this.f9197a.K();
                }
            } while (iK == this.f9198b);
            this.f9200d = iK;
            return;
        }
        n0 n0Var = (n0) list;
        int iB2 = a3.b(this.f9198b);
        if (iB2 == 2) {
            int iL2 = this.f9197a.L();
            W(iL2);
            int iF2 = this.f9197a.f() + iL2;
            do {
                n0Var.x(this.f9197a.u());
            } while (this.f9197a.f() < iF2);
            return;
        }
        if (iB2 != 5) {
            throw p0.d();
        }
        do {
            n0Var.x(this.f9197a.u());
            if (this.f9197a.g()) {
                return;
            } else {
                iK2 = this.f9197a.K();
            }
        } while (iK2 == this.f9198b);
        this.f9200d = iK2;
    }

    @Override // com.google.protobuf.f2
    public int w() throws p0.a {
        V(0);
        return this.f9197a.G();
    }

    @Override // com.google.protobuf.f2
    public long x() throws p0.a {
        V(0);
        return this.f9197a.H();
    }

    @Override // com.google.protobuf.f2
    public void y(List list) throws p0 {
        int iK;
        int iK2;
        if (!(list instanceof j)) {
            int iB = a3.b(this.f9198b);
            if (iB == 0) {
                do {
                    list.add(Boolean.valueOf(this.f9197a.q()));
                    if (this.f9197a.g()) {
                        return;
                    } else {
                        iK = this.f9197a.K();
                    }
                } while (iK == this.f9198b);
                this.f9200d = iK;
                return;
            }
            if (iB != 2) {
                throw p0.d();
            }
            int iF = this.f9197a.f() + this.f9197a.L();
            do {
                list.add(Boolean.valueOf(this.f9197a.q()));
            } while (this.f9197a.f() < iF);
            U(iF);
            return;
        }
        j jVar = (j) list;
        int iB2 = a3.b(this.f9198b);
        if (iB2 == 0) {
            do {
                jVar.f(this.f9197a.q());
                if (this.f9197a.g()) {
                    return;
                } else {
                    iK2 = this.f9197a.K();
                }
            } while (iK2 == this.f9198b);
            this.f9200d = iK2;
            return;
        }
        if (iB2 != 2) {
            throw p0.d();
        }
        int iF2 = this.f9197a.f() + this.f9197a.L();
        do {
            jVar.f(this.f9197a.q());
        } while (this.f9197a.f() < iF2);
        U(iF2);
    }

    @Override // com.google.protobuf.f2
    public int z() {
        int i10 = this.f9200d;
        if (i10 != 0) {
            this.f9198b = i10;
            this.f9200d = 0;
        } else {
            this.f9198b = this.f9197a.K();
        }
        int i11 = this.f9198b;
        return (i11 == 0 || i11 == this.f9199c) ? ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED : a3.a(i11);
    }
}
