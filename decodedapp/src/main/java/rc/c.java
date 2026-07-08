package rc;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends hc.c {

    /* JADX INFO: renamed from: b */
    final hc.e f25857b;

    /* JADX INFO: renamed from: c */
    final hc.a f25858c;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f25859a;

        static {
            int[] iArr = new int[hc.a.values().length];
            f25859a = iArr;
            try {
                iArr[hc.a.MISSING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25859a[hc.a.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f25859a[hc.a.DROP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f25859a[hc.a.LATEST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: rc.c$c */
    static final class C0356c extends b {

        /* JADX INFO: renamed from: c */
        final tc.b f25862c;

        /* JADX INFO: renamed from: d */
        Throwable f25863d;

        /* JADX INFO: renamed from: e */
        volatile boolean f25864e;

        /* JADX INFO: renamed from: f */
        final AtomicInteger f25865f;

        C0356c(ck.b bVar, int i10) {
            super(bVar);
            this.f25862c = new tc.b(i10);
            this.f25865f = new AtomicInteger();
        }

        @Override // rc.c.b
        void e() {
            h();
        }

        @Override // rc.c.b
        void f() {
            if (this.f25865f.getAndIncrement() == 0) {
                this.f25862c.clear();
            }
        }

        @Override // rc.c.b
        public boolean g(Throwable th2) {
            if (this.f25864e || isCancelled()) {
                return false;
            }
            if (th2 == null) {
                th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            this.f25863d = th2;
            this.f25864e = true;
            h();
            return true;
        }

        void h() {
            if (this.f25865f.getAndIncrement() != 0) {
                return;
            }
            ck.b bVar = this.f25860a;
            tc.b bVar2 = this.f25862c;
            int iAddAndGet = 1;
            do {
                long j10 = get();
                long j11 = 0;
                while (j11 != j10) {
                    if (isCancelled()) {
                        bVar2.clear();
                        return;
                    }
                    boolean z10 = this.f25864e;
                    Object objPoll = bVar2.poll();
                    boolean z11 = objPoll == null;
                    if (z10 && z11) {
                        Throwable th2 = this.f25863d;
                        if (th2 != null) {
                            c(th2);
                            return;
                        } else {
                            b();
                            return;
                        }
                    }
                    if (z11) {
                        break;
                    }
                    bVar.onNext(objPoll);
                    j11++;
                }
                if (j11 == j10) {
                    if (isCancelled()) {
                        bVar2.clear();
                        return;
                    }
                    boolean z12 = this.f25864e;
                    boolean zIsEmpty = bVar2.isEmpty();
                    if (z12 && zIsEmpty) {
                        Throwable th3 = this.f25863d;
                        if (th3 != null) {
                            c(th3);
                            return;
                        } else {
                            b();
                            return;
                        }
                    }
                }
                if (j11 != 0) {
                    xc.b.c(this, j11);
                }
                iAddAndGet = this.f25865f.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // rc.c.b, hc.b
        public void onComplete() {
            this.f25864e = true;
            h();
        }

        @Override // hc.b
        public void onNext(Object obj) {
            if (this.f25864e || isCancelled()) {
                return;
            }
            if (obj == null) {
                d(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                this.f25862c.offer(obj);
                h();
            }
        }
    }

    static final class e extends h {
        e(ck.b bVar) {
            super(bVar);
        }

        @Override // rc.c.h
        void h() {
            d(new lc.c("create: could not emit value due to lack of requests"));
        }
    }

    static final class f extends b {

        /* JADX INFO: renamed from: c */
        final AtomicReference f25866c;

        /* JADX INFO: renamed from: d */
        Throwable f25867d;

        /* JADX INFO: renamed from: e */
        volatile boolean f25868e;

        /* JADX INFO: renamed from: f */
        final AtomicInteger f25869f;

        f(ck.b bVar) {
            super(bVar);
            this.f25866c = new AtomicReference();
            this.f25869f = new AtomicInteger();
        }

        @Override // rc.c.b
        void e() {
            h();
        }

        @Override // rc.c.b
        void f() {
            if (this.f25869f.getAndIncrement() == 0) {
                this.f25866c.lazySet(null);
            }
        }

        @Override // rc.c.b
        public boolean g(Throwable th2) {
            if (this.f25868e || isCancelled()) {
                return false;
            }
            if (th2 == null) {
                d(new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources."));
            }
            this.f25867d = th2;
            this.f25868e = true;
            h();
            return true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:100:0x0070, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:101:0x0071, code lost:
        
            b();
         */
        /* JADX WARN: Code restructure failed: missing block: B:102:0x0074, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:104:0x0077, code lost:
        
            if (r9 == 0) goto L106;
         */
        /* JADX WARN: Code restructure failed: missing block: B:105:0x0079, code lost:
        
            xc.b.c(r17, r9);
         */
        /* JADX WARN: Code restructure failed: missing block: B:106:0x007c, code lost:
        
            r4 = r17.f25869f.addAndGet(-r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:87:0x0050, code lost:
        
            if (r9 != r5) goto L103;
         */
        /* JADX WARN: Code restructure failed: missing block: B:89:0x0056, code lost:
        
            if (isCancelled() == false) goto L92;
         */
        /* JADX WARN: Code restructure failed: missing block: B:90:0x0058, code lost:
        
            r2.lazySet(null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:91:0x005b, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:92:0x005c, code lost:
        
            r5 = r17.f25868e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:93:0x0062, code lost:
        
            if (r2.get() != null) goto L95;
         */
        /* JADX WARN: Code restructure failed: missing block: B:94:0x0064, code lost:
        
            r11 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:95:0x0065, code lost:
        
            if (r5 == false) goto L103;
         */
        /* JADX WARN: Code restructure failed: missing block: B:96:0x0067, code lost:
        
            if (r11 == false) goto L103;
         */
        /* JADX WARN: Code restructure failed: missing block: B:97:0x0069, code lost:
        
            r1 = r17.f25867d;
         */
        /* JADX WARN: Code restructure failed: missing block: B:98:0x006b, code lost:
        
            if (r1 == null) goto L101;
         */
        /* JADX WARN: Code restructure failed: missing block: B:99:0x006d, code lost:
        
            c(r1);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void h() {
            /*
                r17 = this;
                r0 = r17
                java.util.concurrent.atomic.AtomicInteger r1 = r0.f25869f
                int r1 = r1.getAndIncrement()
                if (r1 == 0) goto Lc
                goto L85
            Lc:
                ck.b r1 = r0.f25860a
                java.util.concurrent.atomic.AtomicReference r2 = r0.f25866c
                r3 = 1
                r4 = 1
            L12:
                long r5 = r0.get()
                r7 = 0
                r9 = r7
            L19:
                r11 = 0
                r12 = 0
                int r13 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
                if (r13 == 0) goto L50
                boolean r14 = r0.isCancelled()
                if (r14 == 0) goto L29
                r2.lazySet(r12)
                return
            L29:
                boolean r14 = r0.f25868e
                java.lang.Object r15 = r2.getAndSet(r12)
                if (r15 != 0) goto L34
                r16 = 1
                goto L36
            L34:
                r16 = 0
            L36:
                if (r14 == 0) goto L46
                if (r16 == 0) goto L46
                java.lang.Throwable r1 = r0.f25867d
                if (r1 == 0) goto L42
                r0.c(r1)
                return
            L42:
                r0.b()
                return
            L46:
                if (r16 == 0) goto L49
                goto L50
            L49:
                r1.onNext(r15)
                r11 = 1
                long r9 = r9 + r11
                goto L19
            L50:
                if (r13 != 0) goto L75
                boolean r5 = r0.isCancelled()
                if (r5 == 0) goto L5c
                r2.lazySet(r12)
                return
            L5c:
                boolean r5 = r0.f25868e
                java.lang.Object r6 = r2.get()
                if (r6 != 0) goto L65
                r11 = 1
            L65:
                if (r5 == 0) goto L75
                if (r11 == 0) goto L75
                java.lang.Throwable r1 = r0.f25867d
                if (r1 == 0) goto L71
                r0.c(r1)
                return
            L71:
                r0.b()
                return
            L75:
                int r5 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
                if (r5 == 0) goto L7c
                xc.b.c(r0, r9)
            L7c:
                java.util.concurrent.atomic.AtomicInteger r5 = r0.f25869f
                int r4 = -r4
                int r4 = r5.addAndGet(r4)
                if (r4 != 0) goto L12
            L85:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: rc.c.f.h():void");
        }

        @Override // rc.c.b, hc.b
        public void onComplete() {
            this.f25868e = true;
            h();
        }

        @Override // hc.b
        public void onNext(Object obj) {
            if (this.f25868e || isCancelled()) {
                return;
            }
            if (obj == null) {
                d(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                this.f25866c.set(obj);
                h();
            }
        }
    }

    static final class g extends b {
        g(ck.b bVar) {
            super(bVar);
        }

        @Override // hc.b
        public void onNext(Object obj) {
            long j10;
            if (isCancelled()) {
                return;
            }
            if (obj == null) {
                d(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            this.f25860a.onNext(obj);
            do {
                j10 = get();
                if (j10 == 0) {
                    return;
                }
            } while (!compareAndSet(j10, j10 - 1));
        }
    }

    static abstract class h extends b {
        h(ck.b bVar) {
            super(bVar);
        }

        abstract void h();

        @Override // hc.b
        public final void onNext(Object obj) {
            if (isCancelled()) {
                return;
            }
            if (obj == null) {
                d(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else if (get() == 0) {
                h();
            } else {
                this.f25860a.onNext(obj);
                xc.b.c(this, 1L);
            }
        }
    }

    public c(hc.e eVar, hc.a aVar) {
        this.f25857b = eVar;
        this.f25858c = aVar;
    }

    @Override // hc.c
    public void m(ck.b bVar) {
        int i10 = a.f25859a[this.f25858c.ordinal()];
        b c0356c = i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? new C0356c(bVar, hc.c.c()) : new f(bVar) : new d(bVar) : new e(bVar) : new g(bVar);
        bVar.a(c0356c);
        try {
            this.f25857b.a(c0356c);
        } catch (Throwable th2) {
            lc.b.b(th2);
            c0356c.d(th2);
        }
    }

    static abstract class b extends AtomicLong implements hc.d, ck.c {

        /* JADX INFO: renamed from: a */
        final ck.b f25860a;

        /* JADX INFO: renamed from: b */
        final nc.e f25861b = new nc.e();

        b(ck.b bVar) {
            this.f25860a = bVar;
        }

        @Override // hc.d
        public final long a() {
            return get();
        }

        protected void b() {
            if (isCancelled()) {
                return;
            }
            try {
                this.f25860a.onComplete();
            } finally {
                this.f25861b.dispose();
            }
        }

        protected boolean c(Throwable th2) {
            if (th2 == null) {
                th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (isCancelled()) {
                return false;
            }
            try {
                this.f25860a.onError(th2);
                this.f25861b.dispose();
                return true;
            } catch (Throwable th3) {
                this.f25861b.dispose();
                throw th3;
            }
        }

        @Override // ck.c
        public final void cancel() {
            this.f25861b.dispose();
            f();
        }

        public final void d(Throwable th2) {
            if (g(th2)) {
                return;
            }
            yc.a.n(th2);
        }

        public boolean g(Throwable th2) {
            return c(th2);
        }

        @Override // hc.d
        public final boolean isCancelled() {
            return this.f25861b.d();
        }

        @Override // hc.b
        public void onComplete() {
            b();
        }

        @Override // ck.c
        public final void request(long j10) {
            if (wc.d.h(j10)) {
                xc.b.a(this, j10);
                e();
            }
        }

        @Override // java.util.concurrent.atomic.AtomicLong
        public String toString() {
            return String.format("%s{%s}", getClass().getSimpleName(), super.toString());
        }

        void e() {
        }

        void f() {
        }
    }

    static final class d extends h {
        d(ck.b bVar) {
            super(bVar);
        }

        @Override // rc.c.h
        void h() {
        }
    }
}
