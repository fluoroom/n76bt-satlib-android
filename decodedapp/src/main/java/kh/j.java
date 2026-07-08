package kh;

import androidx.appcompat.widget.ActivityChooserView;
import com.facebook.stetho.server.http.HttpHeaders;
import ed.q;
import eh.a0;
import eh.d0;
import eh.f0;
import eh.g0;
import eh.h0;
import eh.j0;
import eh.z;
import fh.p;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import jh.n;
import rd.m;
import rg.o;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f19954b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f19955a;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        private a() {
        }
    }

    public j(d0 d0Var) {
        m.e(d0Var, "client");
        this.f19955a = d0Var;
    }

    private final f0 a(h0 h0Var, String str) {
        String strW;
        z zVarP;
        if (!this.f19955a.s() || (strW = h0.w(h0Var, "Location", null, 2, null)) == null || (zVarP = h0Var.p0().m().p(strW)) == null) {
            return null;
        }
        if (!m.a(zVarP.q(), h0Var.p0().m().q()) && !this.f19955a.t()) {
            return null;
        }
        f0.a aVarJ = h0Var.p0().j();
        if (f.c(str)) {
            int iN = h0Var.n();
            f fVar = f.f19940a;
            boolean z10 = fVar.e(str) || iN == 308 || iN == 307;
            if (!fVar.d(str) || iN == 308 || iN == 307) {
                aVarJ.m(str, z10 ? h0Var.p0().a() : null);
            } else {
                aVarJ.m("GET", null);
            }
            if (!z10) {
                aVarJ.o("Transfer-Encoding");
                aVarJ.o(HttpHeaders.CONTENT_LENGTH);
                aVarJ.o(HttpHeaders.CONTENT_TYPE);
            }
        }
        if (!p.f(h0Var.p0().m(), zVarP)) {
            aVarJ.o("Authorization");
        }
        return aVarJ.r(zVarP).a();
    }

    private final f0 b(h0 h0Var, jh.h hVar) throws ProtocolException {
        n nVarJ;
        j0 j0VarT = (hVar == null || (nVarJ = hVar.j()) == null) ? null : nVarJ.t();
        int iN = h0Var.n();
        String strI = h0Var.p0().i();
        if (iN != 307 && iN != 308) {
            if (iN == 401) {
                return this.f19955a.f().a(j0VarT, h0Var);
            }
            if (iN == 421) {
                g0 g0VarA = h0Var.p0().a();
                if ((g0VarA != null && g0VarA.e()) || hVar == null || !hVar.n()) {
                    return null;
                }
                hVar.j().s();
                return h0Var.p0();
            }
            if (iN == 503) {
                h0 h0VarW = h0Var.W();
                if ((h0VarW == null || h0VarW.n() != 503) && f(h0Var, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) == 0) {
                    return h0Var.p0();
                }
                return null;
            }
            if (iN == 407) {
                m.b(j0VarT);
                if (j0VarT.b().type() == Proxy.Type.HTTP) {
                    return this.f19955a.E().a(j0VarT, h0Var);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            }
            if (iN == 408) {
                if (!this.f19955a.H()) {
                    return null;
                }
                g0 g0VarA2 = h0Var.p0().a();
                if (g0VarA2 != null && g0VarA2.e()) {
                    return null;
                }
                h0 h0VarW2 = h0Var.W();
                if ((h0VarW2 == null || h0VarW2.n() != 408) && f(h0Var, 0) <= 0) {
                    return h0Var.p0();
                }
                return null;
            }
            switch (iN) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        return a(h0Var, strI);
    }

    private final boolean c(IOException iOException, boolean z10) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        return iOException instanceof InterruptedIOException ? (iOException instanceof SocketTimeoutException) && !z10 : (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    private final boolean d(IOException iOException, jh.m mVar, f0 f0Var) {
        boolean z10 = iOException instanceof mh.a;
        boolean z11 = !z10;
        if (this.f19955a.H()) {
            return (z10 || !e(iOException, f0Var)) && c(iOException, z11) && mVar.B();
        }
        return false;
    }

    private final boolean e(IOException iOException, f0 f0Var) {
        g0 g0VarA = f0Var.a();
        return (g0VarA != null && g0VarA.e()) || (iOException instanceof FileNotFoundException);
    }

    private final int f(h0 h0Var, int i10) {
        String strW = h0.w(h0Var, "Retry-After", null, 2, null);
        if (strW == null) {
            return i10;
        }
        if (!new o("\\d+").c(strW)) {
            return ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        }
        Integer numValueOf = Integer.valueOf(strW);
        m.d(numValueOf, "valueOf(...)");
        return numValueOf.intValue();
    }

    @Override // eh.a0
    public h0 intercept(a0.a aVar) throws Throwable {
        jh.h hVarP;
        f0 f0VarB;
        m.e(aVar, "chain");
        g gVar = (g) aVar;
        f0 f0VarJ = gVar.j();
        jh.m mVarF = gVar.f();
        List listK = q.k();
        boolean z10 = false;
        h0 h0VarC = null;
        boolean z11 = true;
        int i10 = 0;
        while (true) {
            mVarF.i(f0VarJ, z11, gVar);
            try {
                if (mVarF.c()) {
                    throw new IOException("Canceled");
                }
                try {
                    h0VarC = gVar.a(f0VarJ).T().q(f0VarJ).n(h0VarC != null ? fh.h.a(h0VarC) : null).c();
                    hVarP = mVarF.p();
                    f0VarB = b(h0VarC, hVarP);
                } catch (IOException e10) {
                    boolean zD = d(e10, mVarF, f0VarJ);
                    mVarF.n().D(mVarF, e10, zD);
                    if (!zD) {
                        throw fh.m.G(e10, listK);
                    }
                    listK = q.t0(listK, e10);
                    mVarF.j(true);
                    z11 = false;
                }
                try {
                    if (f0VarB == null) {
                        if (hVarP != null && hVarP.o()) {
                            mVarF.C();
                        }
                        mVarF.n().q(mVarF, h0VarC, null);
                        mVarF.j(false);
                        return h0VarC;
                    }
                    g0 g0VarA = f0VarB.a();
                    if (g0VarA != null && g0VarA.e()) {
                        mVarF.n().q(mVarF, h0VarC, null);
                        mVarF.j(false);
                        return h0VarC;
                    }
                    fh.m.f(h0VarC.c());
                    i10++;
                    if (i10 > 20) {
                        mVarF.n().q(mVarF, h0VarC, null);
                        throw new ProtocolException("Too many follow-up requests: " + i10);
                    }
                    mVarF.n().q(mVarF, h0VarC, f0VarB);
                    mVarF.j(true);
                    f0VarJ = f0VarB;
                    z11 = true;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                z10 = true;
            }
            mVarF.j(z10);
            throw th;
        }
    }
}
