package tc;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import pc.f;
import xc.h;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends AtomicReferenceArray implements f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Integer f27769f = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f27770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final AtomicLong f27771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    long f27772c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final AtomicLong f27773d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f27774e;

    public a(int i10) {
        super(h.a(i10));
        this.f27770a = length() - 1;
        this.f27771b = new AtomicLong();
        this.f27773d = new AtomicLong();
        this.f27774e = Math.min(i10 / 4, f27769f.intValue());
    }

    int a(long j10) {
        return this.f27770a & ((int) j10);
    }

    int b(long j10, int i10) {
        return ((int) j10) & i10;
    }

    Object c(int i10) {
        return get(i10);
    }

    @Override // pc.g
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    void d(long j10) {
        this.f27773d.lazySet(j10);
    }

    void f(int i10, Object obj) {
        lazySet(i10, obj);
    }

    void g(long j10) {
        this.f27771b.lazySet(j10);
    }

    @Override // pc.g
    public boolean isEmpty() {
        return this.f27771b.get() == this.f27773d.get();
    }

    @Override // pc.g
    public boolean offer(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        int i10 = this.f27770a;
        long j10 = this.f27771b.get();
        int iB = b(j10, i10);
        if (j10 >= this.f27772c) {
            long j11 = ((long) this.f27774e) + j10;
            if (c(b(j11, i10)) == null) {
                this.f27772c = j11;
            } else if (c(iB) != null) {
                return false;
            }
        }
        f(iB, obj);
        g(j10 + 1);
        return true;
    }

    @Override // pc.f, pc.g
    public Object poll() {
        long j10 = this.f27773d.get();
        int iA = a(j10);
        Object objC = c(iA);
        if (objC == null) {
            return null;
        }
        d(j10 + 1);
        f(iA, null);
        return objC;
    }
}
