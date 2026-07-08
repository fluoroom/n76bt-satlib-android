package eh;

import com.facebook.stetho.server.http.HttpHeaders;
import ed.r0;
import eh.h0;
import eh.y;
import hh.f;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import okhttp3.internal.platform.c;
import vh.e0;
import vh.h;
import vh.n0;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements Closeable, Flushable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f12258g = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hh.f f12259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f12260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f12261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f12262d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f12263e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f12264f;

    private static final class a extends i0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f.d f12265a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f12266b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f12267c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final vh.g f12268d;

        /* JADX INFO: renamed from: eh.c$a$a, reason: collision with other inner class name */
        public static final class C0169a extends vh.n {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f12269b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0169a(n0 n0Var, a aVar) {
                super(n0Var);
                this.f12269b = aVar;
            }

            @Override // vh.n, vh.n0, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                this.f12269b.c().close();
                super.close();
            }
        }

        public a(f.d dVar, String str, String str2) {
            rd.m.e(dVar, "snapshot");
            this.f12265a = dVar;
            this.f12266b = str;
            this.f12267c = str2;
            this.f12268d = vh.z.c(new C0169a(dVar.c(1), this));
        }

        public final f.d c() {
            return this.f12265a;
        }

        @Override // eh.i0
        public long contentLength() {
            String str = this.f12267c;
            if (str != null) {
                return fh.m.C(str, -1L);
            }
            return -1L;
        }

        @Override // eh.i0
        public b0 contentType() {
            String str = this.f12266b;
            if (str != null) {
                return b0.f12251e.b(str);
            }
            return null;
        }

        @Override // eh.i0
        public vh.g source() {
            return this.f12268d;
        }
    }

    public static final class b {
        public /* synthetic */ b(rd.h hVar) {
            this();
        }

        private final Set d(y yVar) {
            int size = yVar.size();
            TreeSet treeSet = null;
            for (int i10 = 0; i10 < size; i10++) {
                if (rg.q.x("Vary", yVar.d(i10), true)) {
                    String strG = yVar.g(i10);
                    if (treeSet == null) {
                        treeSet = new TreeSet(rg.q.y(rd.g0.f25951a));
                    }
                    Iterator it = rg.q.B0(strG, new char[]{','}, false, 0, 6, null).iterator();
                    while (it.hasNext()) {
                        treeSet.add(rg.q.W0((String) it.next()).toString());
                    }
                }
            }
            return treeSet == null ? r0.d() : treeSet;
        }

        private final y e(y yVar, y yVar2) {
            Set setD = d(yVar2);
            if (setD.isEmpty()) {
                return y.f12618c;
            }
            y.a aVar = new y.a();
            int size = yVar.size();
            for (int i10 = 0; i10 < size; i10++) {
                String strD = yVar.d(i10);
                if (setD.contains(strD)) {
                    aVar.a(strD, yVar.g(i10));
                }
            }
            return aVar.f();
        }

        public final boolean a(h0 h0Var) {
            rd.m.e(h0Var, "<this>");
            return d(h0Var.x()).contains("*");
        }

        public final String b(z zVar) {
            rd.m.e(zVar, "url");
            return vh.h.f30792d.d(zVar.toString()).D().n();
        }

        public final int c(vh.g gVar) throws IOException {
            rd.m.e(gVar, "source");
            try {
                long jE = gVar.E();
                String strU = gVar.U();
                if (jE >= 0 && jE <= 2147483647L && strU.length() <= 0) {
                    return (int) jE;
                }
                throw new IOException("expected an int but was \"" + jE + strU + '\"');
            } catch (NumberFormatException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        public final y f(h0 h0Var) {
            rd.m.e(h0Var, "<this>");
            h0 h0VarS = h0Var.S();
            rd.m.b(h0VarS);
            return e(h0VarS.p0().f(), h0Var.x());
        }

        public final boolean g(h0 h0Var, y yVar, f0 f0Var) {
            rd.m.e(h0Var, "cachedResponse");
            rd.m.e(yVar, "cachedRequest");
            rd.m.e(f0Var, "newRequest");
            Set<String> setD = d(h0Var.x());
            if (d.h0.a(setD) && setD.isEmpty()) {
                return true;
            }
            for (String str : setD) {
                if (!rd.m.a(yVar.h(str), f0Var.g(str))) {
                    return false;
                }
            }
            return true;
        }

        private b() {
        }
    }

    private final class d implements hh.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f.b f12283a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final vh.l0 f12284b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final vh.l0 f12285c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f12286d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ c f12287e;

        public static final class a extends vh.m {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f12288b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ d f12289c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, d dVar, vh.l0 l0Var) {
                super(l0Var);
                this.f12288b = cVar;
                this.f12289c = dVar;
            }

            @Override // vh.m, vh.l0, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                c cVar = this.f12288b;
                d dVar = this.f12289c;
                synchronized (cVar) {
                    if (dVar.c()) {
                        return;
                    }
                    dVar.d(true);
                    cVar.r(cVar.k() + 1);
                    super.close();
                    this.f12289c.f12283a.c();
                }
            }
        }

        public d(c cVar, f.b bVar) {
            rd.m.e(bVar, "editor");
            this.f12287e = cVar;
            this.f12283a = bVar;
            vh.l0 l0VarG = bVar.g(1);
            this.f12284b = l0VarG;
            this.f12285c = new a(cVar, this, l0VarG);
        }

        @Override // hh.c
        public void a() {
            c cVar = this.f12287e;
            synchronized (cVar) {
                if (this.f12286d) {
                    return;
                }
                this.f12286d = true;
                cVar.q(cVar.e() + 1);
                fh.m.f(this.f12284b);
                try {
                    this.f12283a.b();
                } catch (IOException unused) {
                }
            }
        }

        @Override // hh.c
        public vh.l0 body() {
            return this.f12285c;
        }

        public final boolean c() {
            return this.f12286d;
        }

        public final void d(boolean z10) {
            this.f12286d = z10;
        }
    }

    public c(vh.e0 e0Var, long j10, vh.k kVar, ih.d dVar) {
        rd.m.e(e0Var, "directory");
        rd.m.e(kVar, "fileSystem");
        rd.m.e(dVar, "taskRunner");
        this.f12259a = new hh.f(kVar, e0Var, 201105, 2, j10, dVar);
    }

    private final void a(f.b bVar) {
        if (bVar != null) {
            try {
                bVar.b();
            } catch (IOException unused) {
            }
        }
    }

    public final h0 c(f0 f0Var) {
        rd.m.e(f0Var, "request");
        try {
            f.d dVarS = this.f12259a.S(f12258g.b(f0Var.m()));
            if (dVarS == null) {
                return null;
            }
            try {
                C0170c c0170c = new C0170c(dVarS.c(0));
                h0 h0VarC = c0170c.c(dVarS);
                if (c0170c.a(f0Var, h0VarC)) {
                    return h0VarC;
                }
                fh.m.f(h0VarC.c());
                return null;
            } catch (IOException unused) {
                fh.m.f(dVarS);
                return null;
            }
        } catch (IOException unused2) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f12259a.close();
    }

    public final int e() {
        return this.f12261c;
    }

    @Override // java.io.Flushable
    public void flush() {
        this.f12259a.flush();
    }

    public final int k() {
        return this.f12260b;
    }

    public final hh.c l(h0 h0Var) {
        f.b bVarH;
        rd.m.e(h0Var, "response");
        String strI = h0Var.p0().i();
        if (kh.f.a(h0Var.p0().i())) {
            try {
                n(h0Var.p0());
            } catch (IOException unused) {
            }
            return null;
        }
        if (!rd.m.a(strI, "GET")) {
            return null;
        }
        b bVar = f12258g;
        if (bVar.a(h0Var)) {
            return null;
        }
        C0170c c0170c = new C0170c(h0Var);
        try {
            bVarH = hh.f.H(this.f12259a, bVar.b(h0Var.p0().m()), 0L, 2, null);
            if (bVarH == null) {
                return null;
            }
            try {
                c0170c.e(bVarH);
                return new d(this, bVarH);
            } catch (IOException unused2) {
                a(bVarH);
                return null;
            }
        } catch (IOException unused3) {
            bVarH = null;
        }
    }

    public final void n(f0 f0Var) {
        rd.m.e(f0Var, "request");
        this.f12259a.A0(f12258g.b(f0Var.m()));
    }

    public final void q(int i10) {
        this.f12261c = i10;
    }

    public final void r(int i10) {
        this.f12260b = i10;
    }

    public final synchronized void s() {
        this.f12263e++;
    }

    public final synchronized void v(hh.d dVar) {
        try {
            rd.m.e(dVar, "cacheStrategy");
            this.f12264f++;
            if (dVar.b() != null) {
                this.f12262d++;
            } else if (dVar.a() != null) {
                this.f12263e++;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void w(h0 h0Var, h0 h0Var2) {
        f.b bVarA;
        rd.m.e(h0Var, "cached");
        rd.m.e(h0Var2, "network");
        C0170c c0170c = new C0170c(h0Var2);
        i0 i0VarC = h0Var.c();
        rd.m.c(i0VarC, "null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
        try {
            bVarA = ((a) i0VarC).c().a();
            if (bVarA == null) {
                return;
            }
            try {
                c0170c.e(bVarA);
                bVarA.c();
            } catch (IOException unused) {
                a(bVarA);
            }
        } catch (IOException unused2) {
            bVarA = null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(vh.k kVar, vh.e0 e0Var, long j10) {
        this(e0Var, j10, kVar, ih.d.f16139m);
        rd.m.e(kVar, "fileSystem");
        rd.m.e(e0Var, "directory");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(File file, long j10) {
        this(vh.k.f30830b, e0.a.d(vh.e0.f30784b, file, false, 1, null), j10);
        rd.m.e(file, "directory");
    }

    /* JADX INFO: renamed from: eh.c$c, reason: collision with other inner class name */
    private static final class C0170c {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final a f12270k = new a(null);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f12271l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final String f12272m;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final z f12273a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final y f12274b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f12275c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final e0 f12276d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f12277e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f12278f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final y f12279g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final x f12280h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final long f12281i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final long f12282j;

        /* JADX INFO: renamed from: eh.c$c$a */
        public static final class a {
            public /* synthetic */ a(rd.h hVar) {
                this();
            }

            private a() {
            }
        }

        static {
            StringBuilder sb2 = new StringBuilder();
            c.a aVar = okhttp3.internal.platform.c.f23684a;
            sb2.append(aVar.e().i());
            sb2.append("-Sent-Millis");
            f12271l = sb2.toString();
            f12272m = aVar.e().i() + "-Received-Millis";
        }

        public C0170c(n0 n0Var) throws IOException {
            rd.m.e(n0Var, "rawSource");
            try {
                vh.g gVarC = vh.z.c(n0Var);
                String strU = gVarC.U();
                z zVarD = z.f12621j.d(strU);
                if (zVarD == null) {
                    IOException iOException = new IOException("Cache corruption for " + strU);
                    okhttp3.internal.platform.c.f23684a.e().m("cache corruption", 5, iOException);
                    throw iOException;
                }
                this.f12273a = zVarD;
                this.f12275c = gVarC.U();
                y.a aVar = new y.a();
                int iC = c.f12258g.c(gVarC);
                for (int i10 = 0; i10 < iC; i10++) {
                    aVar.c(gVarC.U());
                }
                this.f12274b = aVar.f();
                kh.k kVarA = kh.k.f19956d.a(gVarC.U());
                this.f12276d = kVarA.f19957a;
                this.f12277e = kVarA.f19958b;
                this.f12278f = kVarA.f19959c;
                y.a aVar2 = new y.a();
                int iC2 = c.f12258g.c(gVarC);
                for (int i11 = 0; i11 < iC2; i11++) {
                    aVar2.c(gVarC.U());
                }
                String str = f12271l;
                String strG = aVar2.g(str);
                String str2 = f12272m;
                String strG2 = aVar2.g(str2);
                aVar2.i(str);
                aVar2.i(str2);
                this.f12281i = strG != null ? Long.parseLong(strG) : 0L;
                this.f12282j = strG2 != null ? Long.parseLong(strG2) : 0L;
                this.f12279g = aVar2.f();
                if (this.f12273a.i()) {
                    String strU2 = gVarC.U();
                    if (strU2.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + strU2 + '\"');
                    }
                    this.f12280h = x.f12612e.c(!gVarC.z() ? k0.f12541b.a(gVarC.U()) : k0.f12546g, j.f12469b.b(gVarC.U()), b(gVarC), b(gVarC));
                } else {
                    this.f12280h = null;
                }
                dd.d0 d0Var = dd.d0.f10897a;
                od.a.a(n0Var, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    od.a.a(n0Var, th2);
                    throw th3;
                }
            }
        }

        private final List b(vh.g gVar) throws IOException {
            int iC = c.f12258g.c(gVar);
            if (iC == -1) {
                return ed.q.k();
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(iC);
                for (int i10 = 0; i10 < iC; i10++) {
                    String strU = gVar.U();
                    vh.e eVar = new vh.e();
                    vh.h hVarA = vh.h.f30792d.a(strU);
                    if (hVarA == null) {
                        throw new IOException("Corrupt certificate in cache entry");
                    }
                    eVar.Z(hVarA);
                    arrayList.add(certificateFactory.generateCertificate(eVar.s0()));
                }
                return arrayList;
            } catch (CertificateException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        private final void d(vh.f fVar, List list) throws IOException {
            try {
                fVar.n0(list.size()).writeByte(10);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    byte[] encoded = ((Certificate) it.next()).getEncoded();
                    h.a aVar = vh.h.f30792d;
                    rd.m.b(encoded);
                    fVar.J(h.a.g(aVar, encoded, 0, 0, 3, null).a()).writeByte(10);
                }
            } catch (CertificateEncodingException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        public final boolean a(f0 f0Var, h0 h0Var) {
            rd.m.e(f0Var, "request");
            rd.m.e(h0Var, "response");
            return rd.m.a(this.f12273a, f0Var.m()) && rd.m.a(this.f12275c, f0Var.i()) && c.f12258g.g(h0Var, this.f12274b, f0Var);
        }

        public final h0 c(f.d dVar) {
            rd.m.e(dVar, "snapshot");
            String strB = this.f12279g.b(HttpHeaders.CONTENT_TYPE);
            String strB2 = this.f12279g.b(HttpHeaders.CONTENT_LENGTH);
            return new h0.a().q(new f0(this.f12273a, this.f12274b, this.f12275c, null, 8, null)).o(this.f12276d).f(this.f12277e).l(this.f12278f).j(this.f12279g).b(new a(dVar, strB, strB2)).h(this.f12280h).r(this.f12281i).p(this.f12282j).c();
        }

        public final void e(f.b bVar) throws IOException {
            rd.m.e(bVar, "editor");
            vh.f fVarB = vh.z.b(bVar.g(0));
            try {
                fVarB.J(this.f12273a.toString()).writeByte(10);
                fVarB.J(this.f12275c).writeByte(10);
                fVarB.n0(this.f12274b.size()).writeByte(10);
                int size = this.f12274b.size();
                for (int i10 = 0; i10 < size; i10++) {
                    fVarB.J(this.f12274b.d(i10)).J(": ").J(this.f12274b.g(i10)).writeByte(10);
                }
                fVarB.J(new kh.k(this.f12276d, this.f12277e, this.f12278f).toString()).writeByte(10);
                fVarB.n0(this.f12279g.size() + 2).writeByte(10);
                int size2 = this.f12279g.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    fVarB.J(this.f12279g.d(i11)).J(": ").J(this.f12279g.g(i11)).writeByte(10);
                }
                fVarB.J(f12271l).J(": ").n0(this.f12281i).writeByte(10);
                fVarB.J(f12272m).J(": ").n0(this.f12282j).writeByte(10);
                if (this.f12273a.i()) {
                    fVarB.writeByte(10);
                    x xVar = this.f12280h;
                    rd.m.b(xVar);
                    fVarB.J(xVar.b().c()).writeByte(10);
                    d(fVarB, this.f12280h.e());
                    d(fVarB, this.f12280h.d());
                    fVarB.J(this.f12280h.g().d()).writeByte(10);
                }
                dd.d0 d0Var = dd.d0.f10897a;
                od.a.a(fVarB, null);
            } finally {
            }
        }

        public C0170c(h0 h0Var) {
            rd.m.e(h0Var, "response");
            this.f12273a = h0Var.p0().m();
            this.f12274b = c.f12258g.f(h0Var);
            this.f12275c = h0Var.p0().i();
            this.f12276d = h0Var.X();
            this.f12277e = h0Var.n();
            this.f12278f = h0Var.H();
            this.f12279g = h0Var.x();
            this.f12280h = h0Var.r();
            this.f12281i = h0Var.t0();
            this.f12282j = h0Var.h0();
        }
    }
}
