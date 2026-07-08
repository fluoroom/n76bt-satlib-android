package jh;

import eh.e0;
import eh.f0;
import eh.h0;
import eh.j0;
import eh.z;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.util.List;
import jh.u;
import jh.v;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements u {

    /* JADX INFO: renamed from: a */
    private final ih.d f18834a;

    /* JADX INFO: renamed from: b */
    private final o f18835b;

    /* JADX INFO: renamed from: c */
    private final int f18836c;

    /* JADX INFO: renamed from: d */
    private final int f18837d;

    /* JADX INFO: renamed from: e */
    private final int f18838e;

    /* JADX INFO: renamed from: f */
    private final int f18839f;

    /* JADX INFO: renamed from: g */
    private final int f18840g;

    /* JADX INFO: renamed from: h */
    private final boolean f18841h;

    /* JADX INFO: renamed from: i */
    private final boolean f18842i;

    /* JADX INFO: renamed from: j */
    private final eh.a f18843j;

    /* JADX INFO: renamed from: k */
    private final s f18844k;

    /* JADX INFO: renamed from: l */
    private final m f18845l;

    /* JADX INFO: renamed from: m */
    private final boolean f18846m;

    /* JADX INFO: renamed from: n */
    private v.b f18847n;

    /* JADX INFO: renamed from: o */
    private v f18848o;

    /* JADX INFO: renamed from: p */
    private j0 f18849p;

    /* JADX INFO: renamed from: q */
    private final ed.i f18850q;

    public p(ih.d dVar, o oVar, int i10, int i11, int i12, int i13, int i14, boolean z10, boolean z11, eh.a aVar, s sVar, m mVar, f0 f0Var) {
        rd.m.e(dVar, "taskRunner");
        rd.m.e(oVar, "connectionPool");
        rd.m.e(aVar, "address");
        rd.m.e(sVar, "routeDatabase");
        rd.m.e(mVar, "call");
        rd.m.e(f0Var, "request");
        this.f18834a = dVar;
        this.f18835b = oVar;
        this.f18836c = i10;
        this.f18837d = i11;
        this.f18838e = i12;
        this.f18839f = i13;
        this.f18840g = i14;
        this.f18841h = z10;
        this.f18842i = z11;
        this.f18843j = aVar;
        this.f18844k = sVar;
        this.f18845l = mVar;
        this.f18846m = !rd.m.a(f0Var.i(), "GET");
        this.f18850q = new ed.i();
    }

    private final f0 g(j0 j0Var) {
        f0 f0VarA = new f0.a().r(j0Var.a().l()).m("CONNECT", null).k("Host", fh.p.t(j0Var.a().l(), true)).k("Proxy-Connection", "Keep-Alive").k("User-Agent", "okhttp/5.3.2").a();
        f0 f0VarA2 = j0Var.a().h().a(j0Var, new h0.a().q(f0VarA).o(e0.f12388d).f(407).l("Preemptive Authenticate").r(-1L).p(-1L).i("Proxy-Authenticate", "OkHttp-Preemptive").c());
        return f0VarA2 == null ? f0VarA : f0VarA2;
    }

    public static /* synthetic */ f j(p pVar, j0 j0Var, List list, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            list = null;
        }
        return pVar.i(j0Var, list);
    }

    private final r k() {
        Socket socketA;
        boolean z10;
        n nVarM = this.f18845l.m();
        if (nVarM == null) {
            return null;
        }
        boolean zP = nVarM.p(this.f18846m);
        synchronized (nVarM) {
            try {
                if (zP) {
                    socketA = (nVarM.k() || !b(nVarM.t().a().l())) ? this.f18845l.A() : null;
                    z10 = false;
                } else {
                    z10 = !nVarM.k();
                    nVarM.w(true);
                    socketA = this.f18845l.A();
                }
            } finally {
            }
        }
        if (this.f18845l.m() != null) {
            if (socketA == null) {
                return new r(nVarM);
            }
            throw new IllegalStateException("Check failed.");
        }
        if (socketA != null) {
            fh.p.h(socketA);
        }
        this.f18845l.n().l(this.f18845l, nVarM);
        nVarM.i().g(nVarM, this.f18845l);
        if (socketA != null) {
            nVarM.i().f(nVarM);
        } else if (z10) {
            nVarM.i().h(nVarM);
        }
        return null;
    }

    public static /* synthetic */ r m(p pVar, f fVar, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fVar = null;
        }
        if ((i10 & 2) != 0) {
            list = null;
        }
        return pVar.l(fVar, list);
    }

    private final j0 n(n nVar) {
        j0 j0VarT;
        synchronized (nVar) {
            j0VarT = null;
            if (nVar.l() == 0 && nVar.k() && fh.p.f(nVar.t().a().l(), d().l())) {
                j0VarT = nVar.t();
            }
        }
        return j0VarT;
    }

    @Override // jh.u
    public boolean a(n nVar) {
        v vVar;
        j0 j0VarN;
        if (!e().isEmpty() || this.f18849p != null) {
            return true;
        }
        if (nVar != null && (j0VarN = n(nVar)) != null) {
            this.f18849p = j0VarN;
            return true;
        }
        v.b bVar = this.f18847n;
        if ((bVar == null || !bVar.b()) && (vVar = this.f18848o) != null) {
            return vVar.a();
        }
        return true;
    }

    @Override // jh.u
    public boolean b(z zVar) {
        rd.m.e(zVar, "url");
        z zVarL = d().l();
        return zVar.m() == zVarL.m() && rd.m.a(zVar.h(), zVarL.h());
    }

    @Override // jh.u
    public boolean c() {
        return this.f18845l.c();
    }

    @Override // jh.u
    public eh.a d() {
        return this.f18843j;
    }

    @Override // jh.u
    public ed.i e() {
        return this.f18850q;
    }

    @Override // jh.u
    public u.b f() throws IOException {
        r rVarK = k();
        if (rVarK != null) {
            return rVarK;
        }
        r rVarM = m(this, null, null, 3, null);
        if (rVarM != null) {
            return rVarM;
        }
        if (!e().isEmpty()) {
            return (u.b) e().removeFirst();
        }
        f fVarH = h();
        r rVarL = l(fVarH, fVarH.t());
        return rVarL != null ? rVarL : fVarH;
    }

    public final f h() throws IOException {
        j0 j0Var = this.f18849p;
        if (j0Var != null) {
            this.f18849p = null;
            return j(this, j0Var, null, 2, null);
        }
        v.b bVar = this.f18847n;
        if (bVar != null && bVar.b()) {
            return j(this, bVar.c(), null, 2, null);
        }
        v vVar = this.f18848o;
        if (vVar == null) {
            vVar = new v(d(), this.f18844k, this.f18845l, this.f18842i);
            this.f18848o = vVar;
        }
        if (!vVar.a()) {
            throw new IOException("exhausted all routes");
        }
        v.b bVarC = vVar.c();
        this.f18847n = bVarC;
        if (c()) {
            throw new IOException("Canceled");
        }
        return i(bVarC.c(), bVarC.a());
    }

    public final f i(j0 j0Var, List list) throws UnknownServiceException {
        rd.m.e(j0Var, "route");
        if (j0Var.a().k() == null) {
            if (!j0Var.a().b().contains(eh.m.f12560k)) {
                throw new UnknownServiceException("CLEARTEXT communication not enabled for client");
            }
            String strH = j0Var.a().l().h();
            if (!okhttp3.internal.platform.c.f23684a.e().l(strH)) {
                throw new UnknownServiceException("CLEARTEXT communication to " + strH + " not permitted by network security policy");
            }
        } else if (j0Var.a().f().contains(e0.f12391g)) {
            throw new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS");
        }
        return new f(this.f18834a, this.f18835b, this.f18836c, this.f18837d, this.f18838e, this.f18839f, this.f18840g, this.f18841h, this.f18845l, this, j0Var, list, 0, j0Var.c() ? g(j0Var) : null, -1, false);
    }

    public final r l(f fVar, List list) {
        n nVarA = this.f18835b.a(this.f18846m, d(), this.f18845l, list, fVar != null && fVar.a());
        if (nVarA == null) {
            return null;
        }
        if (fVar != null) {
            this.f18849p = fVar.h();
            fVar.k();
        }
        this.f18845l.n().k(this.f18845l, nVarA);
        nVarA.i().e(nVarA, this.f18845l);
        return new r(nVarA);
    }
}
