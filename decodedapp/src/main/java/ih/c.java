package ih;

import dd.d0;
import fh.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a */
    private final d f16129a;

    /* JADX INFO: renamed from: b */
    private final String f16130b;

    /* JADX INFO: renamed from: c */
    private boolean f16131c;

    /* JADX INFO: renamed from: d */
    private ih.a f16132d;

    /* JADX INFO: renamed from: e */
    private final List f16133e;

    /* JADX INFO: renamed from: f */
    private boolean f16134f;

    public static final class a extends ih.a {

        /* JADX INFO: renamed from: e */
        final /* synthetic */ qd.a f16135e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, boolean z10, qd.a aVar) {
            super(str, z10);
            this.f16135e = aVar;
        }

        @Override // ih.a
        public long f() {
            this.f16135e.a();
            return -1L;
        }
    }

    public static final class b extends ih.a {

        /* JADX INFO: renamed from: e */
        final /* synthetic */ qd.a f16136e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, qd.a aVar) {
            super(str, false, 2, null);
            this.f16136e = aVar;
        }

        @Override // ih.a
        public long f() {
            return ((Number) this.f16136e.a()).longValue();
        }
    }

    public c(d dVar, String str) {
        m.e(dVar, "taskRunner");
        m.e(str, "name");
        this.f16129a = dVar;
        this.f16130b = str;
        this.f16133e = new ArrayList();
    }

    public static /* synthetic */ void d(c cVar, String str, long j10, boolean z10, qd.a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        cVar.c(str, j10, (i10 & 4) != 0 ? true : z10, aVar);
    }

    public static /* synthetic */ void m(c cVar, ih.a aVar, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        cVar.k(aVar, j10);
    }

    public final void a() {
        d dVar = this.f16129a;
        if (p.f13109b && Thread.holdsLock(dVar)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + dVar);
        }
        synchronized (this.f16129a) {
            try {
                if (b()) {
                    this.f16129a.j(this);
                }
                d0 d0Var = d0.f10897a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean b() {
        ih.a aVar = this.f16132d;
        if (aVar != null) {
            m.b(aVar);
            if (aVar.a()) {
                this.f16134f = true;
            }
        }
        boolean z10 = false;
        for (int size = this.f16133e.size() - 1; -1 < size; size--) {
            if (((ih.a) this.f16133e.get(size)).a()) {
                Logger loggerI = this.f16129a.i();
                ih.a aVar2 = (ih.a) this.f16133e.get(size);
                if (loggerI.isLoggable(Level.FINE)) {
                    ih.b.c(loggerI, aVar2, this, "canceled");
                }
                this.f16133e.remove(size);
                z10 = true;
            }
        }
        return z10;
    }

    public final void c(String str, long j10, boolean z10, qd.a aVar) {
        m.e(str, "name");
        m.e(aVar, "block");
        k(new a(str, z10, aVar), j10);
    }

    public final ih.a e() {
        return this.f16132d;
    }

    public final boolean f() {
        return this.f16134f;
    }

    public final List g() {
        return this.f16133e;
    }

    public final String h() {
        return this.f16130b;
    }

    public final boolean i() {
        return this.f16131c;
    }

    public final d j() {
        return this.f16129a;
    }

    public final void k(ih.a aVar, long j10) {
        m.e(aVar, "task");
        synchronized (this.f16129a) {
            if (!this.f16131c) {
                if (n(aVar, j10, false)) {
                    this.f16129a.j(this);
                }
                d0 d0Var = d0.f10897a;
            } else if (aVar.a()) {
                Logger loggerI = this.f16129a.i();
                if (loggerI.isLoggable(Level.FINE)) {
                    ih.b.c(loggerI, aVar, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                Logger loggerI2 = this.f16129a.i();
                if (loggerI2.isLoggable(Level.FINE)) {
                    ih.b.c(loggerI2, aVar, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final void l(String str, long j10, qd.a aVar) {
        m.e(str, "name");
        m.e(aVar, "block");
        k(new b(str, aVar), j10);
    }

    public final boolean n(ih.a aVar, long j10, boolean z10) {
        String str;
        m.e(aVar, "task");
        aVar.e(this);
        long jE = this.f16129a.h().e();
        long j11 = jE + j10;
        int iIndexOf = this.f16133e.indexOf(aVar);
        if (iIndexOf != -1) {
            if (aVar.c() <= j11) {
                Logger loggerI = this.f16129a.i();
                if (loggerI.isLoggable(Level.FINE)) {
                    ih.b.c(loggerI, aVar, this, "already scheduled");
                }
                return false;
            }
            this.f16133e.remove(iIndexOf);
        }
        aVar.g(j11);
        Logger loggerI2 = this.f16129a.i();
        if (loggerI2.isLoggable(Level.FINE)) {
            if (z10) {
                str = "run again after " + ih.b.b(j11 - jE);
            } else {
                str = "scheduled after " + ih.b.b(j11 - jE);
            }
            ih.b.c(loggerI2, aVar, this, str);
        }
        Iterator it = this.f16133e.iterator();
        int size = 0;
        while (true) {
            if (!it.hasNext()) {
                size = -1;
                break;
            }
            if (((ih.a) it.next()).c() - jE > j10) {
                break;
            }
            size++;
        }
        if (size == -1) {
            size = this.f16133e.size();
        }
        this.f16133e.add(size, aVar);
        return size == 0;
    }

    public final void o(ih.a aVar) {
        this.f16132d = aVar;
    }

    public final void p(boolean z10) {
        this.f16134f = z10;
    }

    public final void q() {
        d dVar = this.f16129a;
        if (p.f13109b && Thread.holdsLock(dVar)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + dVar);
        }
        synchronized (this.f16129a) {
            try {
                this.f16131c = true;
                if (b()) {
                    this.f16129a.j(this);
                }
                d0 d0Var = d0.f10897a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String toString() {
        return this.f16130b;
    }
}
