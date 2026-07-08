package zg;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import rd.b0;

/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f33319b = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "lastScheduledTask$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f33320c = AtomicIntegerFieldUpdater.newUpdater(m.class, "producerIndex$volatile");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f33321d = AtomicIntegerFieldUpdater.newUpdater(m.class, "consumerIndex$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f33322e = AtomicIntegerFieldUpdater.newUpdater(m.class, "blockingTasksInBuffer$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReferenceArray f33323a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    private final h b(h hVar) {
        if (e() == 127) {
            return hVar;
        }
        if (hVar.f33310b) {
            f33322e.incrementAndGet(this);
        }
        int i10 = f33320c.get(this) & 127;
        while (this.f33323a.get(i10) != null) {
            Thread.yield();
        }
        this.f33323a.lazySet(i10, hVar);
        f33320c.incrementAndGet(this);
        return null;
    }

    private final void c(h hVar) {
        if (hVar == null || !hVar.f33310b) {
            return;
        }
        f33322e.decrementAndGet(this);
    }

    private final int e() {
        return f33320c.get(this) - f33321d.get(this);
    }

    private final h m() {
        h hVar;
        while (true) {
            int i10 = f33321d.get(this);
            if (i10 - f33320c.get(this) == 0) {
                return null;
            }
            int i11 = i10 & 127;
            if (f33321d.compareAndSet(this, i10, i10 + 1) && (hVar = (h) this.f33323a.getAndSet(i11, null)) != null) {
                c(hVar);
                return hVar;
            }
        }
    }

    private final boolean n(d dVar) {
        h hVarM = m();
        if (hVarM == null) {
            return false;
        }
        dVar.a(hVarM);
        return true;
    }

    private final h o(boolean z10) {
        h hVar;
        do {
            hVar = (h) f33319b.get(this);
            if (hVar == null || hVar.f33310b != z10) {
                int i10 = f33321d.get(this);
                int i11 = f33320c.get(this);
                while (i10 != i11) {
                    if (z10 && f33322e.get(this) == 0) {
                        return null;
                    }
                    i11--;
                    h hVarQ = q(i11, z10);
                    if (hVarQ != null) {
                        return hVarQ;
                    }
                }
                return null;
            }
        } while (!androidx.concurrent.futures.b.a(f33319b, this, hVar, null));
        return hVar;
    }

    private final h p(int i10) {
        int i11 = f33321d.get(this);
        int i12 = f33320c.get(this);
        boolean z10 = i10 == 1;
        while (i11 != i12) {
            if (z10 && f33322e.get(this) == 0) {
                return null;
            }
            int i13 = i11 + 1;
            h hVarQ = q(i11, z10);
            if (hVarQ != null) {
                return hVarQ;
            }
            i11 = i13;
        }
        return null;
    }

    private final h q(int i10, boolean z10) {
        int i11 = i10 & 127;
        h hVar = (h) this.f33323a.get(i11);
        if (hVar == null || hVar.f33310b != z10 || !l.a(this.f33323a, i11, hVar, null)) {
            return null;
        }
        if (z10) {
            f33322e.decrementAndGet(this);
        }
        return hVar;
    }

    private final long s(int i10, b0 b0Var) {
        h hVar;
        do {
            hVar = (h) f33319b.get(this);
            if (hVar == null) {
                return -2L;
            }
            if (((hVar.f33310b ? 1 : 2) & i10) == 0) {
                return -2L;
            }
            long jA = j.f33317f.a() - hVar.f33309a;
            long j10 = j.f33313b;
            if (jA < j10) {
                return j10 - jA;
            }
        } while (!androidx.concurrent.futures.b.a(f33319b, this, hVar, null));
        b0Var.f25935a = hVar;
        return -1L;
    }

    public final h a(h hVar, boolean z10) {
        if (z10) {
            return b(hVar);
        }
        h hVar2 = (h) f33319b.getAndSet(this, hVar);
        if (hVar2 == null) {
            return null;
        }
        return b(hVar2);
    }

    public final int i() {
        return f33319b.get(this) != null ? e() + 1 : e();
    }

    public final void j(d dVar) {
        h hVar = (h) f33319b.getAndSet(this, null);
        if (hVar != null) {
            dVar.a(hVar);
        }
        while (n(dVar)) {
        }
    }

    public final h k() {
        h hVar = (h) f33319b.getAndSet(this, null);
        return hVar == null ? m() : hVar;
    }

    public final h l() {
        return o(true);
    }

    public final long r(int i10, b0 b0Var) {
        h hVarM = i10 == 3 ? m() : p(i10);
        if (hVarM == null) {
            return s(i10, b0Var);
        }
        b0Var.f25935a = hVarM;
        return -1L;
    }
}
