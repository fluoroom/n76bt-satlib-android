package kh;

import eh.a0;
import eh.f0;
import eh.h0;
import java.util.List;
import jh.m;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements a0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f19941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f19942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f19943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final jh.h f19944d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final f0 f19945e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f19946f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f19947g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f19948h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f19949i;

    public g(m mVar, List list, int i10, jh.h hVar, f0 f0Var, int i11, int i12, int i13) {
        rd.m.e(mVar, "call");
        rd.m.e(list, "interceptors");
        rd.m.e(f0Var, "request");
        this.f19941a = mVar;
        this.f19942b = list;
        this.f19943c = i10;
        this.f19944d = hVar;
        this.f19945e = f0Var;
        this.f19946f = i11;
        this.f19947g = i12;
        this.f19948h = i13;
    }

    public static /* synthetic */ g d(g gVar, int i10, jh.h hVar, f0 f0Var, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = gVar.f19943c;
        }
        if ((i14 & 2) != 0) {
            hVar = gVar.f19944d;
        }
        if ((i14 & 4) != 0) {
            f0Var = gVar.f19945e;
        }
        if ((i14 & 8) != 0) {
            i11 = gVar.f19946f;
        }
        if ((i14 & 16) != 0) {
            i12 = gVar.f19947g;
        }
        if ((i14 & 32) != 0) {
            i13 = gVar.f19948h;
        }
        int i15 = i12;
        int i16 = i13;
        return gVar.c(i10, hVar, f0Var, i11, i15, i16);
    }

    @Override // eh.a0.a
    public h0 a(f0 f0Var) {
        rd.m.e(f0Var, "request");
        if (this.f19943c >= this.f19942b.size()) {
            throw new IllegalStateException("Check failed.");
        }
        this.f19949i++;
        jh.h hVar = this.f19944d;
        if (hVar != null) {
            if (!hVar.l().b().b(f0Var.m())) {
                throw new IllegalStateException(("network interceptor " + this.f19942b.get(this.f19943c - 1) + " must retain the same host and port").toString());
            }
            if (this.f19949i != 1) {
                throw new IllegalStateException(("network interceptor " + this.f19942b.get(this.f19943c - 1) + " must call proceed() exactly once").toString());
            }
        }
        g gVarD = d(this, this.f19943c + 1, null, f0Var, 0, 0, 0, 58, null);
        a0 a0Var = (a0) this.f19942b.get(this.f19943c);
        h0 h0VarIntercept = a0Var.intercept(gVarD);
        if (h0VarIntercept == null) {
            throw new NullPointerException("interceptor " + a0Var + " returned null");
        }
        if (this.f19944d == null || this.f19943c + 1 >= this.f19942b.size() || gVarD.f19949i == 1) {
            return h0VarIntercept;
        }
        throw new IllegalStateException(("network interceptor " + a0Var + " must call proceed() exactly once").toString());
    }

    @Override // eh.a0.a
    public eh.k b() {
        jh.h hVar = this.f19944d;
        if (hVar != null) {
            return hVar.j();
        }
        return null;
    }

    public final g c(int i10, jh.h hVar, f0 f0Var, int i11, int i12, int i13) {
        rd.m.e(f0Var, "request");
        return new g(this.f19941a, this.f19942b, i10, hVar, f0Var, i11, i12, i13);
    }

    @Override // eh.a0.a
    public eh.e call() {
        return this.f19941a;
    }

    @Override // eh.a0.a
    public f0 e() {
        return this.f19945e;
    }

    public final m f() {
        return this.f19941a;
    }

    public final int g() {
        return this.f19946f;
    }

    public final jh.h h() {
        return this.f19944d;
    }

    public final int i() {
        return this.f19947g;
    }

    public final f0 j() {
        return this.f19945e;
    }

    public final int k() {
        return this.f19948h;
    }

    public int l() {
        return this.f19947g;
    }
}
