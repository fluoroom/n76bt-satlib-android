package k2;

import android.util.Log;
import f3.a;
import java.util.Map;
import java.util.concurrent.Executor;
import k2.h;
import k2.p;
import m2.a;
import m2.h;

/* JADX INFO: loaded from: classes.dex */
public class k implements m, h.a, p.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final boolean f19030i = Log.isLoggable("Engine", 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f19031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f19032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m2.h f19033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f19034d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final y f19035e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c f19036f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final a f19037g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final k2.a f19038h;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final h.e f19039a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final l0.d f19040b = f3.a.d(150, new C0252a());

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f19041c;

        /* JADX INFO: renamed from: k2.k$a$a, reason: collision with other inner class name */
        class C0252a implements a.d {
            C0252a() {
            }

            @Override // f3.a.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public h create() {
                a aVar = a.this;
                return new h(aVar.f19039a, aVar.f19040b);
            }
        }

        a(h.e eVar) {
            this.f19039a = eVar;
        }

        h a(com.bumptech.glide.e eVar, Object obj, n nVar, i2.f fVar, int i10, int i11, Class cls, Class cls2, com.bumptech.glide.h hVar, j jVar, Map map, boolean z10, boolean z11, boolean z12, i2.h hVar2, h.b bVar) {
            h hVar3 = (h) e3.k.e((h) this.f19040b.b());
            int i12 = this.f19041c;
            this.f19041c = i12 + 1;
            return hVar3.r(eVar, obj, nVar, fVar, i10, i11, cls, cls2, hVar, jVar, map, z10, z11, z12, hVar2, bVar, i12);
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final n2.a f19043a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final n2.a f19044b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final n2.a f19045c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final n2.a f19046d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final m f19047e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final p.a f19048f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final l0.d f19049g = f3.a.d(150, new a());

        class a implements a.d {
            a() {
            }

            @Override // f3.a.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public l create() {
                b bVar = b.this;
                return new l(bVar.f19043a, bVar.f19044b, bVar.f19045c, bVar.f19046d, bVar.f19047e, bVar.f19048f, bVar.f19049g);
            }
        }

        b(n2.a aVar, n2.a aVar2, n2.a aVar3, n2.a aVar4, m mVar, p.a aVar5) {
            this.f19043a = aVar;
            this.f19044b = aVar2;
            this.f19045c = aVar3;
            this.f19046d = aVar4;
            this.f19047e = mVar;
            this.f19048f = aVar5;
        }

        l a(i2.f fVar, boolean z10, boolean z11, boolean z12, boolean z13) {
            return ((l) e3.k.e((l) this.f19049g.b())).l(fVar, z10, z11, z12, z13);
        }
    }

    private static class c implements h.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a.InterfaceC0285a f19051a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile m2.a f19052b;

        c(a.InterfaceC0285a interfaceC0285a) {
            this.f19051a = interfaceC0285a;
        }

        @Override // k2.h.e
        public m2.a a() {
            if (this.f19052b == null) {
                synchronized (this) {
                    try {
                        if (this.f19052b == null) {
                            this.f19052b = this.f19051a.build();
                        }
                        if (this.f19052b == null) {
                            this.f19052b = new m2.b();
                        }
                    } finally {
                    }
                }
            }
            return this.f19052b;
        }
    }

    public class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final l f19053a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a3.g f19054b;

        d(a3.g gVar, l lVar) {
            this.f19054b = gVar;
            this.f19053a = lVar;
        }

        public void a() {
            synchronized (k.this) {
                this.f19053a.r(this.f19054b);
            }
        }
    }

    public k(m2.h hVar, a.InterfaceC0285a interfaceC0285a, n2.a aVar, n2.a aVar2, n2.a aVar3, n2.a aVar4, boolean z10) {
        this(hVar, interfaceC0285a, aVar, aVar2, aVar3, aVar4, null, null, null, null, null, null, z10);
    }

    private p e(i2.f fVar) {
        v vVarC = this.f19033c.c(fVar);
        if (vVarC == null) {
            return null;
        }
        return vVarC instanceof p ? (p) vVarC : new p(vVarC, true, true, fVar, this);
    }

    private p g(i2.f fVar) {
        p pVarE = this.f19038h.e(fVar);
        if (pVarE != null) {
            pVarE.b();
        }
        return pVarE;
    }

    private p h(i2.f fVar) {
        p pVarE = e(fVar);
        if (pVarE != null) {
            pVarE.b();
            this.f19038h.a(fVar, pVarE);
        }
        return pVarE;
    }

    private p i(n nVar, boolean z10, long j10) {
        if (!z10) {
            return null;
        }
        p pVarG = g(nVar);
        if (pVarG != null) {
            if (f19030i) {
                j("Loaded resource from active resources", j10, nVar);
            }
            return pVarG;
        }
        p pVarH = h(nVar);
        if (pVarH == null) {
            return null;
        }
        if (f19030i) {
            j("Loaded resource from cache", j10, nVar);
        }
        return pVarH;
    }

    private static void j(String str, long j10, i2.f fVar) {
        Log.v("Engine", str + " in " + e3.g.a(j10) + "ms, key: " + fVar);
    }

    private d l(com.bumptech.glide.e eVar, Object obj, i2.f fVar, int i10, int i11, Class cls, Class cls2, com.bumptech.glide.h hVar, j jVar, Map map, boolean z10, boolean z11, i2.h hVar2, boolean z12, boolean z13, boolean z14, boolean z15, a3.g gVar, Executor executor, n nVar, long j10) {
        l lVarA = this.f19031a.a(nVar, z15);
        if (lVarA != null) {
            lVarA.d(gVar, executor);
            if (f19030i) {
                j("Added to existing load", j10, nVar);
            }
            return new d(gVar, lVarA);
        }
        l lVarA2 = this.f19034d.a(nVar, z12, z13, z14, z15);
        h hVarA = this.f19037g.a(eVar, obj, nVar, fVar, i10, i11, cls, cls2, hVar, jVar, map, z10, z11, z15, hVar2, lVarA2);
        this.f19031a.c(nVar, lVarA2);
        lVarA2.d(gVar, executor);
        lVarA2.s(hVarA);
        if (f19030i) {
            j("Started new load", j10, nVar);
        }
        return new d(gVar, lVarA2);
    }

    @Override // k2.p.a
    public void a(i2.f fVar, p pVar) {
        this.f19038h.d(fVar);
        if (pVar.f()) {
            this.f19033c.d(fVar, pVar);
        } else {
            this.f19035e.a(pVar, false);
        }
    }

    @Override // k2.m
    public synchronized void b(l lVar, i2.f fVar, p pVar) {
        if (pVar != null) {
            try {
                if (pVar.f()) {
                    this.f19038h.a(fVar, pVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f19031a.d(fVar, lVar);
    }

    @Override // k2.m
    public synchronized void c(l lVar, i2.f fVar) {
        this.f19031a.d(fVar, lVar);
    }

    @Override // m2.h.a
    public void d(v vVar) {
        this.f19035e.a(vVar, true);
    }

    public d f(com.bumptech.glide.e eVar, Object obj, i2.f fVar, int i10, int i11, Class cls, Class cls2, com.bumptech.glide.h hVar, j jVar, Map map, boolean z10, boolean z11, i2.h hVar2, boolean z12, boolean z13, boolean z14, boolean z15, a3.g gVar, Executor executor) {
        long jB = f19030i ? e3.g.b() : 0L;
        n nVarA = this.f19032b.a(obj, fVar, i10, i11, map, cls, cls2, hVar2);
        synchronized (this) {
            try {
                p pVarI = i(nVarA, z12, jB);
                if (pVarI == null) {
                    return l(eVar, obj, fVar, i10, i11, cls, cls2, hVar, jVar, map, z10, z11, hVar2, z12, z13, z14, z15, gVar, executor, nVarA, jB);
                }
                gVar.c(pVarI, i2.a.MEMORY_CACHE, false);
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void k(v vVar) {
        if (!(vVar instanceof p)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((p) vVar).g();
    }

    k(m2.h hVar, a.InterfaceC0285a interfaceC0285a, n2.a aVar, n2.a aVar2, n2.a aVar3, n2.a aVar4, s sVar, o oVar, k2.a aVar5, b bVar, a aVar6, y yVar, boolean z10) {
        this.f19033c = hVar;
        c cVar = new c(interfaceC0285a);
        this.f19036f = cVar;
        k2.a aVar7 = aVar5 == null ? new k2.a(z10) : aVar5;
        this.f19038h = aVar7;
        aVar7.f(this);
        this.f19032b = oVar == null ? new o() : oVar;
        this.f19031a = sVar == null ? new s() : sVar;
        this.f19034d = bVar == null ? new b(aVar, aVar2, aVar3, aVar4, this, this) : bVar;
        this.f19037g = aVar6 == null ? new a(cVar) : aVar6;
        this.f19035e = yVar == null ? new y() : yVar;
        hVar.e(this);
    }
}
