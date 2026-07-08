package gf;

import com.facebook.stetho.server.http.HttpStatus;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import of.a;
import of.d;
import of.i;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends i.d implements of.q {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final h f14054r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static of.r f14055s = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final of.d f14056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f14057d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f14058e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List f14059f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private byte f14060g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f14061h;

    static class a extends of.b {
        a() {
        }

        @Override // of.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public h b(of.e eVar, of.g gVar) {
            return new h(eVar, gVar);
        }
    }

    static {
        h hVar = new h(true);
        f14054r = hVar;
        hVar.Q();
    }

    public static h K() {
        return f14054r;
    }

    private void Q() {
        this.f14058e = 0;
        this.f14059f = Collections.EMPTY_LIST;
    }

    public static b R() {
        return b.r();
    }

    public static b T(h hVar) {
        return R().f(hVar);
    }

    public gf.b D(int i10) {
        return (gf.b) this.f14059f.get(i10);
    }

    public int G() {
        return this.f14059f.size();
    }

    public List H() {
        return this.f14059f;
    }

    @Override // of.q
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public h getDefaultInstanceForType() {
        return f14054r;
    }

    public int N() {
        return this.f14058e;
    }

    public boolean O() {
        return (this.f14057d & 1) == 1;
    }

    @Override // of.p
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public b newBuilderForType() {
        return R();
    }

    @Override // of.p
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public b toBuilder() {
        return T(this);
    }

    @Override // of.p
    public void a(of.f fVar) throws IOException {
        getSerializedSize();
        i.d.a aVarT = t();
        if ((this.f14057d & 1) == 1) {
            fVar.Z(1, this.f14058e);
        }
        for (int i10 = 0; i10 < this.f14059f.size(); i10++) {
            fVar.c0(2, (of.p) this.f14059f.get(i10));
        }
        aVarT.a(HttpStatus.HTTP_OK, fVar);
        fVar.h0(this.f14056c);
    }

    @Override // of.p
    public int getSerializedSize() {
        int i10 = this.f14061h;
        if (i10 != -1) {
            return i10;
        }
        int iO = (this.f14057d & 1) == 1 ? of.f.o(1, this.f14058e) : 0;
        for (int i11 = 0; i11 < this.f14059f.size(); i11++) {
            iO += of.f.r(2, (of.p) this.f14059f.get(i11));
        }
        int iO2 = iO + o() + this.f14056c.size();
        this.f14061h = iO2;
        return iO2;
    }

    @Override // of.q
    public final boolean isInitialized() {
        byte b10 = this.f14060g;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < G(); i10++) {
            if (!D(i10).isInitialized()) {
                this.f14060g = (byte) 0;
                return false;
            }
        }
        if (n()) {
            this.f14060g = (byte) 1;
            return true;
        }
        this.f14060g = (byte) 0;
        return false;
    }

    private h(i.c cVar) {
        super(cVar);
        this.f14060g = (byte) -1;
        this.f14061h = -1;
        this.f14056c = cVar.d();
    }

    private h(boolean z10) {
        this.f14060g = (byte) -1;
        this.f14061h = -1;
        this.f14056c = of.d.f23423a;
    }

    private h(of.e eVar, of.g gVar) {
        this.f14060g = (byte) -1;
        this.f14061h = -1;
        Q();
        d.b bVarO = of.d.o();
        of.f fVarI = of.f.I(bVarO, 1);
        boolean z10 = false;
        char c10 = 0;
        while (!z10) {
            try {
                try {
                    int iJ = eVar.J();
                    if (iJ != 0) {
                        if (iJ == 8) {
                            this.f14057d |= 1;
                            this.f14058e = eVar.r();
                        } else if (iJ != 18) {
                            if (!j(eVar, fVarI, gVar, iJ)) {
                            }
                        } else {
                            if ((c10 & 2) != 2) {
                                this.f14059f = new ArrayList();
                                c10 = 2;
                            }
                            this.f14059f.add(eVar.t(gf.b.f13887r, gVar));
                        }
                    }
                    z10 = true;
                } catch (of.k e10) {
                    throw e10.i(this);
                } catch (IOException e11) {
                    throw new of.k(e11.getMessage()).i(this);
                }
            } catch (Throwable th2) {
                if ((c10 & 2) == 2) {
                    this.f14059f = DesugarCollections.unmodifiableList(this.f14059f);
                }
                try {
                    fVarI.H();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f14056c = bVarO.l();
                    throw th3;
                }
                this.f14056c = bVarO.l();
                g();
                throw th2;
            }
        }
        if ((c10 & 2) == 2) {
            this.f14059f = DesugarCollections.unmodifiableList(this.f14059f);
        }
        try {
            fVarI.H();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f14056c = bVarO.l();
            throw th4;
        }
        this.f14056c = bVarO.l();
        g();
    }

    public static final class b extends i.c implements of.q {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f14062d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f14063e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List f14064f = Collections.EMPTY_LIST;

        private b() {
            u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b r() {
            return new b();
        }

        private void t() {
            if ((this.f14062d & 2) != 2) {
                this.f14064f = new ArrayList(this.f14064f);
                this.f14062d |= 2;
            }
        }

        @Override // of.p.a
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public h build() {
            h hVarO = o();
            if (hVarO.isInitialized()) {
                return hVarO;
            }
            throw a.AbstractC0317a.b(hVarO);
        }

        public h o() {
            h hVar = new h(this);
            int i10 = (this.f14062d & 1) != 1 ? 0 : 1;
            hVar.f14058e = this.f14063e;
            if ((this.f14062d & 2) == 2) {
                this.f14064f = DesugarCollections.unmodifiableList(this.f14064f);
                this.f14062d &= -3;
            }
            hVar.f14059f = this.f14064f;
            hVar.f14057d = i10;
            return hVar;
        }

        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return r().f(o());
        }

        @Override // of.i.b
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public b f(h hVar) {
            if (hVar == h.K()) {
                return this;
            }
            if (hVar.O()) {
                x(hVar.N());
            }
            if (!hVar.f14059f.isEmpty()) {
                if (this.f14064f.isEmpty()) {
                    this.f14064f = hVar.f14059f;
                    this.f14062d &= -3;
                } else {
                    t();
                    this.f14064f.addAll(hVar.f14059f);
                }
            }
            k(hVar);
            g(d().c(hVar.f14056c));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // of.p.a
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public gf.h.b S(of.e r3, of.g r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                of.r r1 = gf.h.f14055s     // Catch: java.lang.Throwable -> Lf of.k -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf of.k -> L11
                gf.h r3 = (gf.h) r3     // Catch: java.lang.Throwable -> Lf of.k -> L11
                if (r3 == 0) goto Le
                r2.f(r3)
            Le:
                return r2
            Lf:
                r3 = move-exception
                goto L1b
            L11:
                r3 = move-exception
                of.p r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                gf.h r4 = (gf.h) r4     // Catch: java.lang.Throwable -> Lf
                throw r3     // Catch: java.lang.Throwable -> L19
            L19:
                r3 = move-exception
                r0 = r4
            L1b:
                if (r0 == 0) goto L20
                r2.f(r0)
            L20:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: gf.h.b.S(of.e, of.g):gf.h$b");
        }

        public b x(int i10) {
            this.f14062d |= 1;
            this.f14063e = i10;
            return this;
        }

        private void u() {
        }
    }
}
