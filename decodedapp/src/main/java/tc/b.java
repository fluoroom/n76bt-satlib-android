package tc;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import pc.f;
import xc.h;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements f {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    static final int f27775r = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Object f27776s = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f27778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    long f27779c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f27780d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    AtomicReferenceArray f27781e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final int f27782f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    AtomicReferenceArray f27783g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final AtomicLong f27777a = new AtomicLong();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final AtomicLong f27784h = new AtomicLong();

    public b(int i10) {
        int iA = h.a(Math.max(8, i10));
        int i11 = iA - 1;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(iA + 1);
        this.f27781e = atomicReferenceArray;
        this.f27780d = i11;
        a(iA);
        this.f27783g = atomicReferenceArray;
        this.f27782f = i11;
        this.f27779c = iA - 2;
        p(0L);
    }

    private void a(int i10) {
        this.f27778b = Math.min(i10 / 4, f27775r);
    }

    private static int c(long j10, int i10) {
        return b(((int) j10) & i10);
    }

    private long d() {
        return this.f27784h.get();
    }

    private long f() {
        return this.f27777a.get();
    }

    private long g() {
        return this.f27784h.get();
    }

    private static Object h(AtomicReferenceArray atomicReferenceArray, int i10) {
        return atomicReferenceArray.get(i10);
    }

    private AtomicReferenceArray i(AtomicReferenceArray atomicReferenceArray, int i10) {
        int iB = b(i10);
        AtomicReferenceArray atomicReferenceArray2 = (AtomicReferenceArray) h(atomicReferenceArray, iB);
        n(atomicReferenceArray, iB, null);
        return atomicReferenceArray2;
    }

    private long j() {
        return this.f27777a.get();
    }

    private Object k(AtomicReferenceArray atomicReferenceArray, long j10, int i10) {
        this.f27783g = atomicReferenceArray;
        int iC = c(j10, i10);
        Object objH = h(atomicReferenceArray, iC);
        if (objH != null) {
            n(atomicReferenceArray, iC, null);
            m(j10 + 1);
        }
        return objH;
    }

    private void l(AtomicReferenceArray atomicReferenceArray, long j10, int i10, Object obj, long j11) {
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
        this.f27781e = atomicReferenceArray2;
        this.f27779c = (j11 + j10) - 1;
        n(atomicReferenceArray2, i10, obj);
        o(atomicReferenceArray, atomicReferenceArray2);
        n(atomicReferenceArray, i10, f27776s);
        p(j10 + 1);
    }

    private void m(long j10) {
        this.f27784h.lazySet(j10);
    }

    private static void n(AtomicReferenceArray atomicReferenceArray, int i10, Object obj) {
        atomicReferenceArray.lazySet(i10, obj);
    }

    private void o(AtomicReferenceArray atomicReferenceArray, AtomicReferenceArray atomicReferenceArray2) {
        n(atomicReferenceArray, b(atomicReferenceArray.length() - 1), atomicReferenceArray2);
    }

    private void p(long j10) {
        this.f27777a.lazySet(j10);
    }

    private boolean q(AtomicReferenceArray atomicReferenceArray, Object obj, long j10, int i10) {
        n(atomicReferenceArray, i10, obj);
        p(j10 + 1);
        return true;
    }

    @Override // pc.g
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // pc.g
    public boolean isEmpty() {
        return j() == g();
    }

    @Override // pc.g
    public boolean offer(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicReferenceArray atomicReferenceArray = this.f27781e;
        long jF = f();
        int i10 = this.f27780d;
        int iC = c(jF, i10);
        if (jF < this.f27779c) {
            return q(atomicReferenceArray, obj, jF, iC);
        }
        long j10 = ((long) this.f27778b) + jF;
        if (h(atomicReferenceArray, c(j10, i10)) == null) {
            this.f27779c = j10 - 1;
            return q(atomicReferenceArray, obj, jF, iC);
        }
        if (h(atomicReferenceArray, c(jF + 1, i10)) == null) {
            return q(atomicReferenceArray, obj, jF, iC);
        }
        l(atomicReferenceArray, jF, iC, obj, i10);
        return true;
    }

    @Override // pc.f, pc.g
    public Object poll() {
        AtomicReferenceArray atomicReferenceArray = this.f27783g;
        long jD = d();
        int i10 = this.f27782f;
        int iC = c(jD, i10);
        Object objH = h(atomicReferenceArray, iC);
        boolean z10 = objH == f27776s;
        if (objH == null || z10) {
            if (z10) {
                return k(i(atomicReferenceArray, i10 + 1), jD, i10);
            }
            return null;
        }
        n(atomicReferenceArray, iC, null);
        m(jD + 1);
        return objH;
    }

    private static int b(int i10) {
        return i10;
    }
}
