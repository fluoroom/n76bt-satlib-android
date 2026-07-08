package kh;

import com.facebook.stetho.server.http.HttpHeaders;
import ed.q;
import eh.a0;
import eh.b0;
import eh.f0;
import eh.g0;
import eh.h0;
import eh.i0;
import eh.n;
import eh.o;
import fh.p;
import java.util.List;
import rd.m;
import vh.z;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f19931a;

    public a(o oVar) {
        m.e(oVar, "cookieJar");
        this.f19931a = oVar;
    }

    private final String a(List list) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                q.u();
            }
            n nVar = (n) obj;
            if (i10 > 0) {
                sb2.append("; ");
            }
            sb2.append(nVar.e());
            sb2.append('=');
            sb2.append(nVar.g());
            i10 = i11;
        }
        return sb2.toString();
    }

    @Override // eh.a0
    public h0 intercept(a0.a aVar) {
        i0 i0VarC;
        m.e(aVar, "chain");
        f0 f0VarE = aVar.e();
        f0.a aVarJ = f0VarE.j();
        g0 g0VarA = f0VarE.a();
        if (g0VarA != null) {
            b0 b0VarB = g0VarA.b();
            if (b0VarB != null) {
                aVarJ.k(HttpHeaders.CONTENT_TYPE, b0VarB.toString());
            }
            long jA = g0VarA.a();
            if (jA != -1) {
                aVarJ.k(HttpHeaders.CONTENT_LENGTH, String.valueOf(jA));
                aVarJ.o("Transfer-Encoding");
            } else {
                aVarJ.k("Transfer-Encoding", "chunked");
                aVarJ.o(HttpHeaders.CONTENT_LENGTH);
            }
        }
        boolean z10 = false;
        if (f0VarE.e("Host") == null) {
            aVarJ.k("Host", p.u(f0VarE.m(), false, 1, null));
        }
        if (f0VarE.e("Connection") == null) {
            aVarJ.k("Connection", "Keep-Alive");
        }
        if (f0VarE.e("Accept-Encoding") == null && f0VarE.e("Range") == null) {
            aVarJ.k("Accept-Encoding", "gzip");
            z10 = true;
        }
        List listB = this.f19931a.b(f0VarE.m());
        if (!listB.isEmpty()) {
            aVarJ.k("Cookie", a(listB));
        }
        if (f0VarE.e("User-Agent") == null) {
            aVarJ.k("User-Agent", "okhttp/5.3.2");
        }
        f0 f0VarA = aVarJ.a();
        h0 h0VarA = aVar.a(f0VarA);
        e.f(this.f19931a, f0VarA.m(), h0VarA.x());
        h0.a aVarQ = h0VarA.T().q(f0VarA);
        if (z10 && rg.q.x("gzip", h0.w(h0VarA, "Content-Encoding", null, 2, null), true) && e.b(h0VarA) && (i0VarC = h0VarA.c()) != null) {
            vh.p pVar = new vh.p(i0VarC.source());
            aVarQ.j(h0VarA.x().e().i("Content-Encoding").i(HttpHeaders.CONTENT_LENGTH).f());
            aVarQ.b(new h(h0.w(h0VarA, HttpHeaders.CONTENT_TYPE, null, 2, null), -1L, z.c(pVar)));
        }
        return aVarQ.c();
    }
}
