package jh;

import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import jh.u;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u f18776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ih.d f18777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f18778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f18779d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final CopyOnWriteArrayList f18780e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final BlockingQueue f18781f;

    public static final class a extends ih.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ u.b f18782e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ k f18783f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, u.b bVar, k kVar) {
            super(str, false, 2, null);
            this.f18782e = bVar;
            this.f18783f = kVar;
        }

        @Override // ih.a
        public long f() throws InterruptedException {
            u.a aVar;
            try {
                aVar = this.f18782e.d();
            } catch (Throwable th2) {
                aVar = new u.a(this.f18782e, null, th2, 2, null);
            }
            if (!this.f18783f.f18780e.contains(this.f18782e)) {
                return -1L;
            }
            this.f18783f.f18781f.put(aVar);
            return -1L;
        }
    }

    public k(u uVar, ih.d dVar) {
        rd.m.e(uVar, "routePlanner");
        rd.m.e(dVar, "taskRunner");
        this.f18776a = uVar;
        this.f18777b = dVar;
        this.f18778c = TimeUnit.MILLISECONDS.toNanos(250L);
        this.f18779d = Long.MIN_VALUE;
        this.f18780e = new CopyOnWriteArrayList();
        this.f18781f = dVar.h().d(new LinkedBlockingDeque());
    }

    private final u.a e(long j10, TimeUnit timeUnit) {
        u.a aVar;
        if (this.f18780e.isEmpty() || (aVar = (u.a) this.f18781f.poll(j10, timeUnit)) == null) {
            return null;
        }
        this.f18780e.remove(aVar.d());
        return aVar;
    }

    private final void f() {
        Iterator it = this.f18780e.iterator();
        rd.m.d(it, "iterator(...)");
        while (it.hasNext()) {
            u.b bVar = (u.b) it.next();
            bVar.cancel();
            u.b bVarB = bVar.b();
            if (bVarB != null) {
                b().e().addLast(bVarB);
            }
        }
        this.f18780e.clear();
    }

    private final u.a g() {
        u.b jVar;
        if (t.a(b(), null, 1, null)) {
            try {
                jVar = b().f();
            } catch (Throwable th2) {
                jVar = new j(th2);
            }
            if (jVar.a()) {
                return new u.a(jVar, null, null, 6, null);
            }
            if (jVar instanceof j) {
                return ((j) jVar).f();
            }
            this.f18780e.add(jVar);
            ih.c.m(this.f18777b.k(), new a(fh.p.f13110c + " connect " + b().d().l().o(), jVar, this), 0L, 2, null);
        }
        return null;
    }

    @Override // jh.i
    public n a() throws IOException {
        u.a aVarG;
        long j10;
        IOException iOException = null;
        while (true) {
            try {
                if (this.f18780e.isEmpty() && !t.a(b(), null, 1, null)) {
                    f();
                    rd.m.b(iOException);
                    throw iOException;
                }
                if (b().c()) {
                    throw new IOException("Canceled");
                }
                long jE = this.f18777b.h().e();
                long j11 = this.f18779d - jE;
                if (this.f18780e.isEmpty() || j11 <= 0) {
                    aVarG = g();
                    j10 = this.f18778c;
                    this.f18779d = jE + j10;
                } else {
                    j10 = j11;
                    aVarG = null;
                }
                if (aVarG != null || (aVarG = e(j10, TimeUnit.NANOSECONDS)) != null) {
                    if (aVarG.f()) {
                        f();
                        if (!aVarG.d().a()) {
                            aVarG = aVarG.d().g();
                        }
                        if (aVarG.f()) {
                            return aVarG.d().c();
                        }
                    }
                    Throwable thE = aVarG.e();
                    if (thE != null) {
                        if (!(thE instanceof IOException)) {
                            throw thE;
                        }
                        if (iOException == null) {
                            iOException = (IOException) thE;
                        } else {
                            dd.b.a(iOException, thE);
                        }
                    }
                    u.b bVarC = aVarG.c();
                    if (bVarC != null) {
                        b().e().addFirst(bVarC);
                    }
                }
            } finally {
                f();
            }
        }
    }

    @Override // jh.i
    public u b() {
        return this.f18776a;
    }
}
