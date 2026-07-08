package rc;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends rc.a {

    /* JADX INFO: renamed from: c */
    final mc.d f25871c;

    /* JADX INFO: renamed from: d */
    final boolean f25872d;

    /* JADX INFO: renamed from: e */
    final int f25873e;

    /* JADX INFO: renamed from: f */
    final int f25874f;

    static final class a extends AtomicReference implements hc.f, kc.b {

        /* JADX INFO: renamed from: a */
        final long f25875a;

        /* JADX INFO: renamed from: b */
        final b f25876b;

        /* JADX INFO: renamed from: c */
        final int f25877c;

        /* JADX INFO: renamed from: d */
        final int f25878d;

        /* JADX INFO: renamed from: e */
        volatile boolean f25879e;

        /* JADX INFO: renamed from: f */
        volatile pc.g f25880f;

        /* JADX INFO: renamed from: g */
        long f25881g;

        /* JADX INFO: renamed from: h */
        int f25882h;

        a(b bVar, long j10) {
            this.f25875a = j10;
            this.f25876b = bVar;
            int i10 = bVar.f25887e;
            this.f25878d = i10;
            this.f25877c = i10 >> 2;
        }

        @Override // hc.f, ck.b
        public void a(ck.c cVar) {
            if (wc.d.g(this, cVar)) {
                if (cVar instanceof pc.d) {
                    pc.d dVar = (pc.d) cVar;
                    int iE = dVar.e(7);
                    if (iE == 1) {
                        this.f25882h = iE;
                        this.f25880f = dVar;
                        this.f25879e = true;
                        this.f25876b.g();
                        return;
                    }
                    if (iE == 2) {
                        this.f25882h = iE;
                        this.f25880f = dVar;
                    }
                }
                cVar.request(this.f25878d);
            }
        }

        void c(long j10) {
            if (this.f25882h != 1) {
                long j11 = this.f25881g + j10;
                if (j11 < this.f25877c) {
                    this.f25881g = j11;
                } else {
                    this.f25881g = 0L;
                    ((ck.c) get()).request(j11);
                }
            }
        }

        @Override // kc.b
        public boolean d() {
            return get() == wc.d.CANCELLED;
        }

        @Override // kc.b
        public void dispose() {
            wc.d.a(this);
        }

        @Override // ck.b
        public void onComplete() {
            this.f25879e = true;
            this.f25876b.g();
        }

        @Override // ck.b
        public void onError(Throwable th2) {
            lazySet(wc.d.CANCELLED);
            this.f25876b.k(this, th2);
        }

        @Override // ck.b
        public void onNext(Object obj) {
            if (this.f25882h != 2) {
                this.f25876b.n(obj, this);
            } else {
                this.f25876b.g();
            }
        }
    }

    static final class b extends AtomicInteger implements hc.f, ck.c {
        static final a[] A = new a[0];
        static final a[] B = new a[0];

        /* JADX INFO: renamed from: a */
        final ck.b f25883a;

        /* JADX INFO: renamed from: b */
        final mc.d f25884b;

        /* JADX INFO: renamed from: c */
        final boolean f25885c;

        /* JADX INFO: renamed from: d */
        final int f25886d;

        /* JADX INFO: renamed from: e */
        final int f25887e;

        /* JADX INFO: renamed from: f */
        volatile pc.f f25888f;

        /* JADX INFO: renamed from: g */
        volatile boolean f25889g;

        /* JADX INFO: renamed from: h */
        final xc.a f25890h = new xc.a();

        /* JADX INFO: renamed from: r */
        volatile boolean f25891r;

        /* JADX INFO: renamed from: s */
        final AtomicReference f25892s;

        /* JADX INFO: renamed from: t */
        final AtomicLong f25893t;

        /* JADX INFO: renamed from: u */
        ck.c f25894u;

        /* JADX INFO: renamed from: v */
        long f25895v;

        /* JADX INFO: renamed from: w */
        long f25896w;

        /* JADX INFO: renamed from: x */
        int f25897x;

        /* JADX INFO: renamed from: y */
        int f25898y;

        /* JADX INFO: renamed from: z */
        final int f25899z;

        b(ck.b bVar, mc.d dVar, boolean z10, int i10, int i11) {
            AtomicReference atomicReference = new AtomicReference();
            this.f25892s = atomicReference;
            this.f25893t = new AtomicLong();
            this.f25883a = bVar;
            this.f25884b = dVar;
            this.f25885c = z10;
            this.f25886d = i10;
            this.f25887e = i11;
            this.f25899z = Math.max(1, i10 >> 1);
            atomicReference.lazySet(A);
        }

        @Override // hc.f, ck.b
        public void a(ck.c cVar) {
            if (wc.d.i(this.f25894u, cVar)) {
                this.f25894u = cVar;
                this.f25883a.a(this);
                if (this.f25891r) {
                    return;
                }
                int i10 = this.f25886d;
                if (i10 == Integer.MAX_VALUE) {
                    cVar.request(Long.MAX_VALUE);
                } else {
                    cVar.request(i10);
                }
            }
        }

        boolean c(a aVar) {
            a[] aVarArr;
            a[] aVarArr2;
            do {
                aVarArr = (a[]) this.f25892s.get();
                if (aVarArr == B) {
                    aVar.dispose();
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new a[length + 1];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!androidx.lifecycle.b.a(this.f25892s, aVarArr, aVarArr2));
            return true;
        }

        @Override // ck.c
        public void cancel() {
            pc.f fVar;
            if (this.f25891r) {
                return;
            }
            this.f25891r = true;
            this.f25894u.cancel();
            f();
            if (getAndIncrement() != 0 || (fVar = this.f25888f) == null) {
                return;
            }
            fVar.clear();
        }

        boolean d() {
            if (this.f25891r) {
                e();
                return true;
            }
            if (this.f25885c || this.f25890h.get() == null) {
                return false;
            }
            e();
            Throwable thB = this.f25890h.b();
            if (thB != xc.e.f31965a) {
                this.f25883a.onError(thB);
            }
            return true;
        }

        void e() {
            pc.f fVar = this.f25888f;
            if (fVar != null) {
                fVar.clear();
            }
        }

        void f() {
            a[] aVarArr;
            a[] aVarArr2 = (a[]) this.f25892s.get();
            a[] aVarArr3 = B;
            if (aVarArr2 == aVarArr3 || (aVarArr = (a[]) this.f25892s.getAndSet(aVarArr3)) == aVarArr3) {
                return;
            }
            for (a aVar : aVarArr) {
                aVar.dispose();
            }
            Throwable thB = this.f25890h.b();
            if (thB == null || thB == xc.e.f31965a) {
                return;
            }
            yc.a.n(thB);
        }

        void g() {
            if (getAndIncrement() == 0) {
                h();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:294:0x0177, code lost:
        
            r9 = r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:300:0x0187, code lost:
        
            r24.f25897x = r3;
            r24.f25896w = r7[r3].f25875a;
         */
        /* JADX WARN: Removed duplicated region for block: B:244:0x00dd  */
        /* JADX WARN: Removed duplicated region for block: B:333:0x0184 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void h() {
            /*
                Method dump skipped, instruction units count: 431
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: rc.e.b.h():void");
        }

        pc.g i(a aVar) {
            pc.g gVar = aVar.f25880f;
            if (gVar != null) {
                return gVar;
            }
            tc.a aVar2 = new tc.a(this.f25887e);
            aVar.f25880f = aVar2;
            return aVar2;
        }

        pc.g j() {
            pc.f bVar = this.f25888f;
            if (bVar == null) {
                bVar = this.f25886d == Integer.MAX_VALUE ? new tc.b(this.f25887e) : new tc.a(this.f25886d);
                this.f25888f = bVar;
            }
            return bVar;
        }

        void k(a aVar, Throwable th2) {
            if (!this.f25890h.a(th2)) {
                yc.a.n(th2);
                return;
            }
            aVar.f25879e = true;
            if (!this.f25885c) {
                this.f25894u.cancel();
                for (a aVar2 : (a[]) this.f25892s.getAndSet(B)) {
                    aVar2.dispose();
                }
            }
            g();
        }

        void l(a aVar) {
            a[] aVarArr;
            a[] aVarArr2;
            do {
                aVarArr = (a[]) this.f25892s.get();
                int length = aVarArr.length;
                if (length == 0) {
                    return;
                }
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        i10 = -1;
                        break;
                    } else if (aVarArr[i10] == aVar) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (i10 < 0) {
                    return;
                }
                if (length == 1) {
                    aVarArr2 = A;
                } else {
                    a[] aVarArr3 = new a[length - 1];
                    System.arraycopy(aVarArr, 0, aVarArr3, 0, i10);
                    System.arraycopy(aVarArr, i10 + 1, aVarArr3, i10, (length - i10) - 1);
                    aVarArr2 = aVarArr3;
                }
            } while (!androidx.lifecycle.b.a(this.f25892s, aVarArr, aVarArr2));
        }

        void n(Object obj, a aVar) {
            if (get() == 0 && compareAndSet(0, 1)) {
                long j10 = this.f25893t.get();
                pc.g gVarI = aVar.f25880f;
                if (j10 == 0 || !(gVarI == null || gVarI.isEmpty())) {
                    if (gVarI == null) {
                        gVarI = i(aVar);
                    }
                    if (!gVarI.offer(obj)) {
                        onError(new lc.c("Inner queue full?!"));
                        return;
                    }
                } else {
                    this.f25883a.onNext(obj);
                    if (j10 != Long.MAX_VALUE) {
                        this.f25893t.decrementAndGet();
                    }
                    aVar.c(1L);
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                pc.g aVar2 = aVar.f25880f;
                if (aVar2 == null) {
                    aVar2 = new tc.a(this.f25887e);
                    aVar.f25880f = aVar2;
                }
                if (!aVar2.offer(obj)) {
                    onError(new lc.c("Inner queue full?!"));
                    return;
                } else if (getAndIncrement() != 0) {
                    return;
                }
            }
            h();
        }

        void o(Object obj) {
            if (get() == 0 && compareAndSet(0, 1)) {
                long j10 = this.f25893t.get();
                pc.g gVarJ = this.f25888f;
                if (j10 == 0 || !(gVarJ == null || gVarJ.isEmpty())) {
                    if (gVarJ == null) {
                        gVarJ = j();
                    }
                    if (!gVarJ.offer(obj)) {
                        onError(new IllegalStateException("Scalar queue full?!"));
                        return;
                    }
                } else {
                    this.f25883a.onNext(obj);
                    if (j10 != Long.MAX_VALUE) {
                        this.f25893t.decrementAndGet();
                    }
                    if (this.f25886d != Integer.MAX_VALUE && !this.f25891r) {
                        int i10 = this.f25898y + 1;
                        this.f25898y = i10;
                        int i11 = this.f25899z;
                        if (i10 == i11) {
                            this.f25898y = 0;
                            this.f25894u.request(i11);
                        }
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else if (!j().offer(obj)) {
                onError(new IllegalStateException("Scalar queue full?!"));
                return;
            } else if (getAndIncrement() != 0) {
                return;
            }
            h();
        }

        @Override // ck.b
        public void onComplete() {
            if (this.f25889g) {
                return;
            }
            this.f25889g = true;
            g();
        }

        @Override // ck.b
        public void onError(Throwable th2) {
            if (this.f25889g) {
                yc.a.n(th2);
            } else if (!this.f25890h.a(th2)) {
                yc.a.n(th2);
            } else {
                this.f25889g = true;
                g();
            }
        }

        @Override // ck.b
        public void onNext(Object obj) {
            if (this.f25889g) {
                return;
            }
            try {
                ck.a aVar = (ck.a) oc.b.c(this.f25884b.apply(obj), "The mapper returned a null Publisher");
                if (!(aVar instanceof Callable)) {
                    long j10 = this.f25895v;
                    this.f25895v = 1 + j10;
                    a aVar2 = new a(this, j10);
                    if (c(aVar2)) {
                        aVar.a(aVar2);
                        return;
                    }
                    return;
                }
                try {
                    Object objCall = ((Callable) aVar).call();
                    if (objCall != null) {
                        o(objCall);
                        return;
                    }
                    if (this.f25886d == Integer.MAX_VALUE || this.f25891r) {
                        return;
                    }
                    int i10 = this.f25898y + 1;
                    this.f25898y = i10;
                    int i11 = this.f25899z;
                    if (i10 == i11) {
                        this.f25898y = 0;
                        this.f25894u.request(i11);
                    }
                } catch (Throwable th2) {
                    lc.b.b(th2);
                    this.f25890h.a(th2);
                    g();
                }
            } catch (Throwable th3) {
                lc.b.b(th3);
                this.f25894u.cancel();
                onError(th3);
            }
        }

        @Override // ck.c
        public void request(long j10) {
            if (wc.d.h(j10)) {
                xc.b.a(this.f25893t, j10);
                g();
            }
        }
    }

    public e(hc.c cVar, mc.d dVar, boolean z10, int i10, int i11) {
        super(cVar);
        this.f25871c = dVar;
        this.f25872d = z10;
        this.f25873e = i10;
        this.f25874f = i11;
    }

    public static hc.f n(ck.b bVar, mc.d dVar, boolean z10, int i10, int i11) {
        return new b(bVar, dVar, z10, i10, i11);
    }

    @Override // hc.c
    protected void m(ck.b bVar) {
        if (i.b(this.f25856b, bVar, this.f25871c)) {
            return;
        }
        this.f25856b.l(n(bVar, this.f25871c, this.f25872d, this.f25873e, this.f25874f));
    }
}
