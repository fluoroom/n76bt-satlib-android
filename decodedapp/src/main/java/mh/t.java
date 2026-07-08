package mh;

import eh.d0;
import eh.e0;
import eh.f0;
import eh.h0;
import eh.y;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kh.d;
import vh.l0;
import vh.m0;
import vh.n0;
import vh.o0;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements kh.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f22207g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final List f22208h = fh.p.l("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final List f22209i = fh.p.l("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d.a f22210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final kh.g f22211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o f22212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile v f22213d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final e0 f22214e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile boolean f22215f;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        public final List a(f0 f0Var) {
            rd.m.e(f0Var, "request");
            eh.y yVarF = f0Var.f();
            ArrayList arrayList = new ArrayList(yVarF.size() + 4);
            arrayList.add(new d(d.f22111g, f0Var.i()));
            arrayList.add(new d(d.f22112h, kh.i.f19953a.c(f0Var.m())));
            String strE = f0Var.e("Host");
            if (strE != null) {
                arrayList.add(new d(d.f22114j, strE));
            }
            arrayList.add(new d(d.f22113i, f0Var.m().q()));
            int size = yVarF.size();
            for (int i10 = 0; i10 < size; i10++) {
                String strD = yVarF.d(i10);
                Locale locale = Locale.US;
                rd.m.d(locale, "US");
                String lowerCase = strD.toLowerCase(locale);
                rd.m.d(lowerCase, "toLowerCase(...)");
                if (!t.f22208h.contains(lowerCase) || (rd.m.a(lowerCase, "te") && rd.m.a(yVarF.g(i10), "trailers"))) {
                    arrayList.add(new d(lowerCase, yVarF.g(i10)));
                }
            }
            return arrayList;
        }

        public final h0.a b(eh.y yVar, e0 e0Var) throws ProtocolException {
            rd.m.e(yVar, "headerBlock");
            rd.m.e(e0Var, "protocol");
            y.a aVar = new y.a();
            int size = yVar.size();
            kh.k kVarA = null;
            for (int i10 = 0; i10 < size; i10++) {
                String strD = yVar.d(i10);
                String strG = yVar.g(i10);
                if (rd.m.a(strD, ":status")) {
                    kVarA = kh.k.f19956d.a("HTTP/1.1 " + strG);
                } else if (!t.f22209i.contains(strD)) {
                    aVar.d(strD, strG);
                }
            }
            if (kVarA != null) {
                return new h0.a().o(e0Var).f(kVarA.f19958b).l(kVarA.f19959c).j(aVar.f());
            }
            throw new ProtocolException("Expected ':status' header not present");
        }

        private a() {
        }
    }

    public t(d0 d0Var, d.a aVar, kh.g gVar, o oVar) {
        rd.m.e(d0Var, "client");
        rd.m.e(aVar, "carrier");
        rd.m.e(gVar, "chain");
        rd.m.e(oVar, "http2Connection");
        this.f22210a = aVar;
        this.f22211b = gVar;
        this.f22212c = oVar;
        List listC = d0Var.C();
        e0 e0Var = e0.f12391g;
        this.f22214e = listC.contains(e0Var) ? e0Var : e0.f12390f;
    }

    @Override // kh.d
    public void a() throws IOException {
        v vVar = this.f22213d;
        rd.m.b(vVar);
        vVar.a().close();
    }

    @Override // kh.d
    public boolean b() {
        v vVar = this.f22213d;
        return vVar != null && vVar.w();
    }

    @Override // kh.d
    public long c(h0 h0Var) {
        rd.m.e(h0Var, "response");
        if (kh.e.b(h0Var)) {
            return fh.p.k(h0Var);
        }
        return 0L;
    }

    @Override // kh.d
    public void cancel() {
        this.f22215f = true;
        v vVar = this.f22213d;
        if (vVar != null) {
            vVar.h(b.f22099t);
        }
    }

    @Override // kh.d
    public h0.a d(boolean z10) throws IOException {
        v vVar = this.f22213d;
        if (vVar == null) {
            throw new IOException("stream wasn't created");
        }
        h0.a aVarB = f22207g.b(vVar.C(z10), this.f22214e);
        if (z10 && aVarB.g() == 100) {
            return null;
        }
        return aVarB;
    }

    @Override // kh.d
    public n0 e(h0 h0Var) {
        rd.m.e(h0Var, "response");
        v vVar = this.f22213d;
        rd.m.b(vVar);
        return vVar.getSource();
    }

    @Override // kh.d
    public void f(f0 f0Var) throws IOException {
        rd.m.e(f0Var, "request");
        if (this.f22213d != null) {
            return;
        }
        this.f22213d = this.f22212c.M0(f22207g.a(f0Var), f0Var.a() != null);
        if (this.f22215f) {
            v vVar = this.f22213d;
            rd.m.b(vVar);
            vVar.h(b.f22099t);
            throw new IOException("Canceled");
        }
        v vVar2 = this.f22213d;
        rd.m.b(vVar2);
        o0 o0VarX = vVar2.x();
        long jI = this.f22211b.i();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        o0VarX.g(jI, timeUnit);
        v vVar3 = this.f22213d;
        rd.m.b(vVar3);
        vVar3.E().g(this.f22211b.k(), timeUnit);
    }

    @Override // kh.d
    public void g() {
        this.f22212c.flush();
    }

    @Override // kh.d
    public m0 h() {
        v vVar = this.f22213d;
        rd.m.b(vVar);
        return vVar;
    }

    @Override // kh.d
    public d.a i() {
        return this.f22210a;
    }

    @Override // kh.d
    public l0 j(f0 f0Var, long j10) {
        rd.m.e(f0Var, "request");
        v vVar = this.f22213d;
        rd.m.b(vVar);
        return vVar.a();
    }
}
