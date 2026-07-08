package rc;

import hc.j;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends rc.a {

    /* JADX INFO: renamed from: c */
    final j f25904c;

    /* JADX INFO: renamed from: d */
    final boolean f25905d;

    /* JADX INFO: renamed from: e */
    final int f25906e;

    static abstract class a extends wc.a implements hc.f, Runnable {

        /* JADX INFO: renamed from: a */
        final j.b f25907a;

        /* JADX INFO: renamed from: b */
        final boolean f25908b;

        /* JADX INFO: renamed from: c */
        final int f25909c;

        /* JADX INFO: renamed from: d */
        final int f25910d;

        /* JADX INFO: renamed from: e */
        final AtomicLong f25911e = new AtomicLong();

        /* JADX INFO: renamed from: f */
        ck.c f25912f;

        /* JADX INFO: renamed from: g */
        pc.g f25913g;

        /* JADX INFO: renamed from: h */
        volatile boolean f25914h;

        /* JADX INFO: renamed from: r */
        volatile boolean f25915r;

        /* JADX INFO: renamed from: s */
        Throwable f25916s;

        /* JADX INFO: renamed from: t */
        int f25917t;

        /* JADX INFO: renamed from: u */
        long f25918u;

        /* JADX INFO: renamed from: v */
        boolean f25919v;

        a(j.b bVar, boolean z10, int i10) {
            this.f25907a = bVar;
            this.f25908b = z10;
            this.f25909c = i10;
            this.f25910d = i10 - (i10 >> 2);
        }

        final boolean c(boolean z10, boolean z11, ck.b bVar) {
            if (this.f25914h) {
                clear();
                return true;
            }
            if (!z10) {
                return false;
            }
            if (this.f25908b) {
                if (!z11) {
                    return false;
                }
                this.f25914h = true;
                Throwable th2 = this.f25916s;
                if (th2 != null) {
                    bVar.onError(th2);
                } else {
                    bVar.onComplete();
                }
                this.f25907a.dispose();
                return true;
            }
            Throwable th3 = this.f25916s;
            if (th3 != null) {
                this.f25914h = true;
                clear();
                bVar.onError(th3);
                this.f25907a.dispose();
                return true;
            }
            if (!z11) {
                return false;
            }
            this.f25914h = true;
            bVar.onComplete();
            this.f25907a.dispose();
            return true;
        }

        @Override // ck.c
        public final void cancel() {
            if (this.f25914h) {
                return;
            }
            this.f25914h = true;
            this.f25912f.cancel();
            this.f25907a.dispose();
            if (getAndIncrement() == 0) {
                this.f25913g.clear();
            }
        }

        @Override // pc.g
        public final void clear() {
            this.f25913g.clear();
        }

        abstract void d();

        @Override // pc.c
        public final int e(int i10) {
            if ((i10 & 2) == 0) {
                return 0;
            }
            this.f25919v = true;
            return 2;
        }

        abstract void f();

        abstract void g();

        final void h() {
            if (getAndIncrement() != 0) {
                return;
            }
            this.f25907a.b(this);
        }

        @Override // pc.g
        public final boolean isEmpty() {
            return this.f25913g.isEmpty();
        }

        @Override // ck.b
        public final void onComplete() {
            if (this.f25915r) {
                return;
            }
            this.f25915r = true;
            h();
        }

        @Override // ck.b
        public final void onError(Throwable th2) {
            if (this.f25915r) {
                yc.a.n(th2);
                return;
            }
            this.f25916s = th2;
            this.f25915r = true;
            h();
        }

        @Override // ck.b
        public final void onNext(Object obj) {
            if (this.f25915r) {
                return;
            }
            if (this.f25917t == 2) {
                h();
                return;
            }
            if (!this.f25913g.offer(obj)) {
                this.f25912f.cancel();
                this.f25916s = new lc.c("Queue is full?!");
                this.f25915r = true;
            }
            h();
        }

        @Override // ck.c
        public final void request(long j10) {
            if (wc.d.h(j10)) {
                xc.b.a(this.f25911e, j10);
                h();
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f25919v) {
                f();
            } else if (this.f25917t == 1) {
                g();
            } else {
                d();
            }
        }
    }

    static final class b extends a {

        /* JADX INFO: renamed from: w */
        final pc.a f25920w;

        /* JADX INFO: renamed from: x */
        long f25921x;

        b(pc.a aVar, j.b bVar, boolean z10, int i10) {
            super(bVar, z10, i10);
            this.f25920w = aVar;
        }

        @Override // hc.f, ck.b
        public void a(ck.c cVar) {
            if (wc.d.i(this.f25912f, cVar)) {
                this.f25912f = cVar;
                if (cVar instanceof pc.d) {
                    pc.d dVar = (pc.d) cVar;
                    int iE = dVar.e(7);
                    if (iE == 1) {
                        this.f25917t = 1;
                        this.f25913g = dVar;
                        this.f25915r = true;
                        this.f25920w.a(this);
                        return;
                    }
                    if (iE == 2) {
                        this.f25917t = 2;
                        this.f25913g = dVar;
                        this.f25920w.a(this);
                        cVar.request(this.f25909c);
                        return;
                    }
                }
                this.f25913g = new tc.a(this.f25909c);
                this.f25920w.a(this);
                cVar.request(this.f25909c);
            }
        }

        @Override // rc.h.a
        void d() {
            pc.a aVar = this.f25920w;
            pc.g gVar = this.f25913g;
            long j10 = this.f25918u;
            long j11 = this.f25921x;
            int iAddAndGet = 1;
            while (true) {
                long j12 = this.f25911e.get();
                while (j10 != j12) {
                    boolean z10 = this.f25915r;
                    try {
                        Object objPoll = gVar.poll();
                        boolean z11 = objPoll == null;
                        if (c(z10, z11, aVar)) {
                            return;
                        }
                        if (z11) {
                            break;
                        }
                        if (aVar.b(objPoll)) {
                            j10++;
                        }
                        j11++;
                        if (j11 == this.f25910d) {
                            this.f25912f.request(j11);
                            j11 = 0;
                        }
                    } catch (Throwable th2) {
                        lc.b.b(th2);
                        this.f25914h = true;
                        this.f25912f.cancel();
                        gVar.clear();
                        aVar.onError(th2);
                        this.f25907a.dispose();
                        return;
                    }
                }
                if (j10 == j12 && c(this.f25915r, gVar.isEmpty(), aVar)) {
                    return;
                }
                int i10 = get();
                if (iAddAndGet == i10) {
                    this.f25918u = j10;
                    this.f25921x = j11;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i10;
                }
            }
        }

        @Override // rc.h.a
        void f() {
            int iAddAndGet = 1;
            while (!this.f25914h) {
                boolean z10 = this.f25915r;
                this.f25920w.onNext(null);
                if (z10) {
                    this.f25914h = true;
                    Throwable th2 = this.f25916s;
                    if (th2 != null) {
                        this.f25920w.onError(th2);
                    } else {
                        this.f25920w.onComplete();
                    }
                    this.f25907a.dispose();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // rc.h.a
        void g() {
            pc.a aVar = this.f25920w;
            pc.g gVar = this.f25913g;
            long j10 = this.f25918u;
            int iAddAndGet = 1;
            while (true) {
                long j11 = this.f25911e.get();
                while (j10 != j11) {
                    try {
                        Object objPoll = gVar.poll();
                        if (this.f25914h) {
                            return;
                        }
                        if (objPoll == null) {
                            this.f25914h = true;
                            aVar.onComplete();
                            this.f25907a.dispose();
                            return;
                        } else if (aVar.b(objPoll)) {
                            j10++;
                        }
                    } catch (Throwable th2) {
                        lc.b.b(th2);
                        this.f25914h = true;
                        this.f25912f.cancel();
                        aVar.onError(th2);
                        this.f25907a.dispose();
                        return;
                    }
                }
                if (this.f25914h) {
                    return;
                }
                if (gVar.isEmpty()) {
                    this.f25914h = true;
                    aVar.onComplete();
                    this.f25907a.dispose();
                    return;
                } else {
                    int i10 = get();
                    if (iAddAndGet == i10) {
                        this.f25918u = j10;
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    } else {
                        iAddAndGet = i10;
                    }
                }
            }
        }

        @Override // pc.g
        public Object poll() {
            Object objPoll = this.f25913g.poll();
            if (objPoll != null && this.f25917t != 1) {
                long j10 = this.f25921x + 1;
                if (j10 == this.f25910d) {
                    this.f25921x = 0L;
                    this.f25912f.request(j10);
                    return objPoll;
                }
                this.f25921x = j10;
            }
            return objPoll;
        }
    }

    static final class c extends a implements hc.f {

        /* JADX INFO: renamed from: w */
        final ck.b f25922w;

        c(ck.b bVar, j.b bVar2, boolean z10, int i10) {
            super(bVar2, z10, i10);
            this.f25922w = bVar;
        }

        @Override // hc.f, ck.b
        public void a(ck.c cVar) {
            if (wc.d.i(this.f25912f, cVar)) {
                this.f25912f = cVar;
                if (cVar instanceof pc.d) {
                    pc.d dVar = (pc.d) cVar;
                    int iE = dVar.e(7);
                    if (iE == 1) {
                        this.f25917t = 1;
                        this.f25913g = dVar;
                        this.f25915r = true;
                        this.f25922w.a(this);
                        return;
                    }
                    if (iE == 2) {
                        this.f25917t = 2;
                        this.f25913g = dVar;
                        this.f25922w.a(this);
                        cVar.request(this.f25909c);
                        return;
                    }
                }
                this.f25913g = new tc.a(this.f25909c);
                this.f25922w.a(this);
                cVar.request(this.f25909c);
            }
        }

        @Override // rc.h.a
        void d() {
            ck.b bVar = this.f25922w;
            pc.g gVar = this.f25913g;
            long j10 = this.f25918u;
            int iAddAndGet = 1;
            while (true) {
                long jAddAndGet = this.f25911e.get();
                while (j10 != jAddAndGet) {
                    boolean z10 = this.f25915r;
                    try {
                        Object objPoll = gVar.poll();
                        boolean z11 = objPoll == null;
                        if (c(z10, z11, bVar)) {
                            return;
                        }
                        if (z11) {
                            break;
                        }
                        bVar.onNext(objPoll);
                        j10++;
                        if (j10 == this.f25910d) {
                            if (jAddAndGet != Long.MAX_VALUE) {
                                jAddAndGet = this.f25911e.addAndGet(-j10);
                            }
                            this.f25912f.request(j10);
                            j10 = 0;
                        }
                    } catch (Throwable th2) {
                        lc.b.b(th2);
                        this.f25914h = true;
                        this.f25912f.cancel();
                        gVar.clear();
                        bVar.onError(th2);
                        this.f25907a.dispose();
                        return;
                    }
                }
                if (j10 == jAddAndGet && c(this.f25915r, gVar.isEmpty(), bVar)) {
                    return;
                }
                int i10 = get();
                if (iAddAndGet == i10) {
                    this.f25918u = j10;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i10;
                }
            }
        }

        @Override // rc.h.a
        void f() {
            int iAddAndGet = 1;
            while (!this.f25914h) {
                boolean z10 = this.f25915r;
                this.f25922w.onNext(null);
                if (z10) {
                    this.f25914h = true;
                    Throwable th2 = this.f25916s;
                    if (th2 != null) {
                        this.f25922w.onError(th2);
                    } else {
                        this.f25922w.onComplete();
                    }
                    this.f25907a.dispose();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // rc.h.a
        void g() {
            ck.b bVar = this.f25922w;
            pc.g gVar = this.f25913g;
            long j10 = this.f25918u;
            int iAddAndGet = 1;
            while (true) {
                long j11 = this.f25911e.get();
                while (j10 != j11) {
                    try {
                        Object objPoll = gVar.poll();
                        if (this.f25914h) {
                            return;
                        }
                        if (objPoll == null) {
                            this.f25914h = true;
                            bVar.onComplete();
                            this.f25907a.dispose();
                            return;
                        }
                        bVar.onNext(objPoll);
                        j10++;
                    } catch (Throwable th2) {
                        lc.b.b(th2);
                        this.f25914h = true;
                        this.f25912f.cancel();
                        bVar.onError(th2);
                        this.f25907a.dispose();
                        return;
                    }
                }
                if (this.f25914h) {
                    return;
                }
                if (gVar.isEmpty()) {
                    this.f25914h = true;
                    bVar.onComplete();
                    this.f25907a.dispose();
                    return;
                } else {
                    int i10 = get();
                    if (iAddAndGet == i10) {
                        this.f25918u = j10;
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    } else {
                        iAddAndGet = i10;
                    }
                }
            }
        }

        @Override // pc.g
        public Object poll() {
            Object objPoll = this.f25913g.poll();
            if (objPoll != null && this.f25917t != 1) {
                long j10 = this.f25918u + 1;
                if (j10 == this.f25910d) {
                    this.f25918u = 0L;
                    this.f25912f.request(j10);
                    return objPoll;
                }
                this.f25918u = j10;
            }
            return objPoll;
        }
    }

    public h(hc.c cVar, j jVar, boolean z10, int i10) {
        super(cVar);
        this.f25904c = jVar;
        this.f25905d = z10;
        this.f25906e = i10;
    }

    @Override // hc.c
    public void m(ck.b bVar) {
        j.b bVarA = this.f25904c.a();
        if (bVar instanceof pc.a) {
            this.f25856b.l(new b((pc.a) bVar, bVarA, this.f25905d, this.f25906e));
        } else {
            this.f25856b.l(new c(bVar, bVarA, this.f25905d, this.f25906e));
        }
    }
}
