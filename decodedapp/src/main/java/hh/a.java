package hh;

import com.facebook.stetho.server.http.HttpHeaders;
import eh.a0;
import eh.e0;
import eh.f0;
import eh.h0;
import eh.s;
import eh.y;
import fh.p;
import hh.d;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import rd.m;
import rg.q;
import vh.n0;
import vh.o0;
import vh.z;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0216a f15358b = new C0216a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final eh.c f15359a;

    /* JADX INFO: renamed from: hh.a$a, reason: collision with other inner class name */
    public static final class C0216a {
        public /* synthetic */ C0216a(rd.h hVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final y b(y yVar, y yVar2) {
            y.a aVar = new y.a();
            int size = yVar.size();
            for (int i10 = 0; i10 < size; i10++) {
                String strD = yVar.d(i10);
                String strG = yVar.g(i10);
                if ((!q.x("Warning", strD, true) || !q.J(strG, "1", false, 2, null)) && (c(strD) || !d(strD) || yVar2.b(strD) == null)) {
                    aVar.d(strD, strG);
                }
            }
            int size2 = yVar2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                String strD2 = yVar2.d(i11);
                if (!c(strD2) && d(strD2)) {
                    aVar.d(strD2, yVar2.g(i11));
                }
            }
            return aVar.f();
        }

        private final boolean c(String str) {
            return q.x(HttpHeaders.CONTENT_LENGTH, str, true) || q.x("Content-Encoding", str, true) || q.x(HttpHeaders.CONTENT_TYPE, str, true);
        }

        private final boolean d(String str) {
            return (q.x("Connection", str, true) || q.x("Keep-Alive", str, true) || q.x("Proxy-Authenticate", str, true) || q.x("Proxy-Authorization", str, true) || q.x("TE", str, true) || q.x("Trailers", str, true) || q.x("Transfer-Encoding", str, true) || q.x("Upgrade", str, true)) ? false : true;
        }

        private C0216a() {
        }
    }

    public static final class b implements n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f15360a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ vh.g f15361b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f15362c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ vh.f f15363d;

        b(vh.g gVar, c cVar, vh.f fVar) {
            this.f15361b = gVar;
            this.f15362c = cVar;
            this.f15363d = fVar;
        }

        @Override // vh.n0
        public long N(vh.e eVar, long j10) throws IOException {
            m.e(eVar, "sink");
            try {
                long jN = this.f15361b.N(eVar, j10);
                if (jN != -1) {
                    eVar.w(this.f15363d.h(), eVar.size() - jN, jN);
                    this.f15363d.D();
                    return jN;
                }
                if (!this.f15360a) {
                    this.f15360a = true;
                    this.f15363d.close();
                }
                return -1L;
            } catch (IOException e10) {
                if (this.f15360a) {
                    throw e10;
                }
                this.f15360a = true;
                this.f15362c.a();
                throw e10;
            }
        }

        @Override // vh.n0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!this.f15360a && !p.i(this, 100, TimeUnit.MILLISECONDS)) {
                this.f15360a = true;
                this.f15362c.a();
            }
            this.f15361b.close();
        }

        @Override // vh.n0
        public o0 i() {
            return this.f15361b.i();
        }
    }

    public a(eh.c cVar) {
        this.f15359a = cVar;
    }

    private final h0 a(c cVar, h0 h0Var) {
        if (cVar == null) {
            return h0Var;
        }
        b bVar = new b(h0Var.c().source(), cVar, z.b(cVar.body()));
        return h0Var.T().b(new kh.h(h0.w(h0Var, HttpHeaders.CONTENT_TYPE, null, 2, null), h0Var.c().contentLength(), z.c(bVar))).c();
    }

    @Override // eh.a0
    public h0 intercept(a0.a aVar) {
        s sVarN;
        m.e(aVar, "chain");
        eh.e eVarCall = aVar.call();
        eh.c cVar = this.f15359a;
        h0 h0VarC = cVar != null ? cVar.c(hh.b.b(aVar.e())) : null;
        d dVarB = new d.b(System.currentTimeMillis(), aVar.e(), h0VarC).b();
        f0 f0VarB = dVarB.b();
        h0 h0VarA = dVarB.a();
        eh.c cVar2 = this.f15359a;
        if (cVar2 != null) {
            cVar2.v(dVarB);
        }
        jh.m mVar = eVarCall instanceof jh.m ? (jh.m) eVarCall : null;
        if (mVar == null || (sVarN = mVar.n()) == null) {
            sVarN = s.f12601b;
        }
        if (h0VarC != null && h0VarA == null) {
            fh.m.f(h0VarC.c());
        }
        if (f0VarB == null && h0VarA == null) {
            h0 h0VarC2 = new h0.a().q(aVar.e()).o(e0.f12388d).f(504).l("Unsatisfiable Request (only-if-cached)").r(-1L).p(System.currentTimeMillis()).c();
            sVarN.E(eVarCall, h0VarC2);
            return h0VarC2;
        }
        if (f0VarB == null) {
            m.b(h0VarA);
            h0 h0VarC3 = h0VarA.T().d(fh.h.a(h0VarA)).c();
            sVarN.b(eVarCall, h0VarC3);
            return h0VarC3;
        }
        if (h0VarA != null) {
            sVarN.a(eVarCall, h0VarA);
        } else if (this.f15359a != null) {
            sVarN.c(eVarCall);
        }
        try {
            h0 h0VarA2 = aVar.a(f0VarB);
            if (h0VarA2 == null && h0VarC != null) {
            }
            if (h0VarA != null) {
                if (h0VarA2 != null && h0VarA2.n() == 304) {
                    h0 h0VarC4 = h0VarA.T().j(f15358b.b(h0VarA.x(), h0VarA2.x())).r(h0VarA2.t0()).p(h0VarA2.h0()).d(fh.h.a(h0VarA)).m(fh.h.a(h0VarA2)).c();
                    h0VarA2.c().close();
                    eh.c cVar3 = this.f15359a;
                    m.b(cVar3);
                    cVar3.s();
                    this.f15359a.w(h0VarA, h0VarC4);
                    sVarN.b(eVarCall, h0VarC4);
                    return h0VarC4;
                }
                fh.m.f(h0VarA.c());
            }
            m.b(h0VarA2);
            h0 h0VarC5 = h0VarA2.T().d(h0VarA != null ? fh.h.a(h0VarA) : null).m(fh.h.a(h0VarA2)).c();
            if (this.f15359a != null) {
                f0 f0VarB2 = hh.b.b(f0VarB);
                if (kh.e.b(h0VarC5) && d.f15364c.a(h0VarC5, f0VarB2)) {
                    h0 h0VarA3 = a(this.f15359a.l(h0VarC5.T().q(f0VarB2).c()), h0VarC5);
                    if (h0VarA != null) {
                        sVarN.c(eVarCall);
                    }
                    return h0VarA3;
                }
                if (kh.f.a(f0VarB.i())) {
                    try {
                        this.f15359a.n(f0VarB);
                    } catch (IOException unused) {
                    }
                }
            }
            return h0VarC5;
        } finally {
            if (h0VarC != null) {
                fh.m.f(h0VarC.c());
            }
        }
    }
}
