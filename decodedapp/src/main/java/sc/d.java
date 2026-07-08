package sc;

import hc.h;
import hc.i;
import hc.j;
import uc.l;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends sc.a {

    /* JADX INFO: renamed from: b */
    final j f27282b;

    /* JADX INFO: renamed from: c */
    final boolean f27283c;

    /* JADX INFO: renamed from: d */
    final int f27284d;

    static final class a extends qc.b implements i, Runnable {

        /* JADX INFO: renamed from: a */
        final i f27285a;

        /* JADX INFO: renamed from: b */
        final j.b f27286b;

        /* JADX INFO: renamed from: c */
        final boolean f27287c;

        /* JADX INFO: renamed from: d */
        final int f27288d;

        /* JADX INFO: renamed from: e */
        pc.g f27289e;

        /* JADX INFO: renamed from: f */
        kc.b f27290f;

        /* JADX INFO: renamed from: g */
        Throwable f27291g;

        /* JADX INFO: renamed from: h */
        volatile boolean f27292h;

        /* JADX INFO: renamed from: r */
        volatile boolean f27293r;

        /* JADX INFO: renamed from: s */
        int f27294s;

        /* JADX INFO: renamed from: t */
        boolean f27295t;

        a(i iVar, j.b bVar, boolean z10, int i10) {
            this.f27285a = iVar;
            this.f27286b = bVar;
            this.f27287c = z10;
            this.f27288d = i10;
        }

        @Override // hc.i
        public void a(kc.b bVar) {
            if (nc.b.i(this.f27290f, bVar)) {
                this.f27290f = bVar;
                if (bVar instanceof pc.b) {
                    pc.b bVar2 = (pc.b) bVar;
                    int iE = bVar2.e(7);
                    if (iE == 1) {
                        this.f27294s = iE;
                        this.f27289e = bVar2;
                        this.f27292h = true;
                        this.f27285a.a(this);
                        g();
                        return;
                    }
                    if (iE == 2) {
                        this.f27294s = iE;
                        this.f27289e = bVar2;
                        this.f27285a.a(this);
                        return;
                    }
                }
                this.f27289e = new tc.b(this.f27288d);
                this.f27285a.a(this);
            }
        }

        boolean b(boolean z10, boolean z11, i iVar) {
            if (this.f27293r) {
                this.f27289e.clear();
                return true;
            }
            if (!z10) {
                return false;
            }
            Throwable th2 = this.f27291g;
            if (this.f27287c) {
                if (!z11) {
                    return false;
                }
                this.f27293r = true;
                if (th2 != null) {
                    iVar.onError(th2);
                } else {
                    iVar.onComplete();
                }
                this.f27286b.dispose();
                return true;
            }
            if (th2 != null) {
                this.f27293r = true;
                this.f27289e.clear();
                iVar.onError(th2);
                this.f27286b.dispose();
                return true;
            }
            if (!z11) {
                return false;
            }
            this.f27293r = true;
            iVar.onComplete();
            this.f27286b.dispose();
            return true;
        }

        void c() {
            int iAddAndGet = 1;
            while (!this.f27293r) {
                boolean z10 = this.f27292h;
                Throwable th2 = this.f27291g;
                if (!this.f27287c && z10 && th2 != null) {
                    this.f27293r = true;
                    this.f27285a.onError(this.f27291g);
                    this.f27286b.dispose();
                    return;
                }
                this.f27285a.onNext(null);
                if (z10) {
                    this.f27293r = true;
                    Throwable th3 = this.f27291g;
                    if (th3 != null) {
                        this.f27285a.onError(th3);
                    } else {
                        this.f27285a.onComplete();
                    }
                    this.f27286b.dispose();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // pc.g
        public void clear() {
            this.f27289e.clear();
        }

        @Override // kc.b
        public boolean d() {
            return this.f27293r;
        }

        @Override // kc.b
        public void dispose() {
            if (this.f27293r) {
                return;
            }
            this.f27293r = true;
            this.f27290f.dispose();
            this.f27286b.dispose();
            if (getAndIncrement() == 0) {
                this.f27289e.clear();
            }
        }

        @Override // pc.c
        public int e(int i10) {
            if ((i10 & 2) == 0) {
                return 0;
            }
            this.f27295t = true;
            return 2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:46:0x0027, code lost:
        
            r3 = addAndGet(-r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x002c, code lost:
        
            if (r3 != 0) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void f() {
            /*
                r7 = this;
                pc.g r0 = r7.f27289e
                hc.i r1 = r7.f27285a
                r2 = 1
                r3 = 1
            L6:
                boolean r4 = r7.f27292h
                boolean r5 = r0.isEmpty()
                boolean r4 = r7.b(r4, r5, r1)
                if (r4 == 0) goto L13
                goto L2e
            L13:
                boolean r4 = r7.f27292h
                java.lang.Object r5 = r0.poll()     // Catch: java.lang.Throwable -> L33
                if (r5 != 0) goto L1d
                r6 = 1
                goto L1e
            L1d:
                r6 = 0
            L1e:
                boolean r4 = r7.b(r4, r6, r1)
                if (r4 == 0) goto L25
                goto L2e
            L25:
                if (r6 == 0) goto L2f
                int r3 = -r3
                int r3 = r7.addAndGet(r3)
                if (r3 != 0) goto L6
            L2e:
                return
            L2f:
                r1.onNext(r5)
                goto L13
            L33:
                r3 = move-exception
                lc.b.b(r3)
                r7.f27293r = r2
                kc.b r2 = r7.f27290f
                r2.dispose()
                r0.clear()
                r1.onError(r3)
                hc.j$b r0 = r7.f27286b
                r0.dispose()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: sc.d.a.f():void");
        }

        void g() {
            if (getAndIncrement() == 0) {
                this.f27286b.b(this);
            }
        }

        @Override // pc.g
        public boolean isEmpty() {
            return this.f27289e.isEmpty();
        }

        @Override // hc.i
        public void onComplete() {
            if (this.f27292h) {
                return;
            }
            this.f27292h = true;
            g();
        }

        @Override // hc.i
        public void onError(Throwable th2) {
            if (this.f27292h) {
                yc.a.n(th2);
                return;
            }
            this.f27291g = th2;
            this.f27292h = true;
            g();
        }

        @Override // hc.i
        public void onNext(Object obj) {
            if (this.f27292h) {
                return;
            }
            if (this.f27294s != 2) {
                this.f27289e.offer(obj);
            }
            g();
        }

        @Override // pc.g
        public Object poll() {
            return this.f27289e.poll();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f27295t) {
                c();
            } else {
                f();
            }
        }
    }

    public d(h hVar, j jVar, boolean z10, int i10) {
        super(hVar);
        this.f27282b = jVar;
        this.f27283c = z10;
        this.f27284d = i10;
    }

    @Override // hc.g
    protected void k(i iVar) {
        j jVar = this.f27282b;
        if (jVar instanceof l) {
            this.f27278a.a(iVar);
        } else {
            this.f27278a.a(new a(iVar, jVar.a(), this.f27283c, this.f27284d));
        }
    }
}
