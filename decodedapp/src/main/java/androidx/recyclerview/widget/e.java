package androidx.recyclerview.widget;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
final class e implements Runnable {

    /* JADX INFO: renamed from: e */
    static final ThreadLocal f3177e = new ThreadLocal();

    /* JADX INFO: renamed from: f */
    static Comparator f3178f = new a();

    /* JADX INFO: renamed from: b */
    long f3180b;

    /* JADX INFO: renamed from: c */
    long f3181c;

    /* JADX INFO: renamed from: a */
    ArrayList f3179a = new ArrayList();

    /* JADX INFO: renamed from: d */
    private final ArrayList f3182d = new ArrayList();

    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a */
        public int compare(c cVar, c cVar2) {
            RecyclerView recyclerView = cVar.f3190d;
            if ((recyclerView == null) != (cVar2.f3190d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z10 = cVar.f3187a;
            if (z10 != cVar2.f3187a) {
                return z10 ? -1 : 1;
            }
            int i10 = cVar2.f3188b - cVar.f3188b;
            if (i10 != 0) {
                return i10;
            }
            int i11 = cVar.f3189c - cVar2.f3189c;
            if (i11 != 0) {
                return i11;
            }
            return 0;
        }
    }

    static class b implements RecyclerView.q.c {

        /* JADX INFO: renamed from: a */
        int f3183a;

        /* JADX INFO: renamed from: b */
        int f3184b;

        /* JADX INFO: renamed from: c */
        int[] f3185c;

        /* JADX INFO: renamed from: d */
        int f3186d;

        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q.c
        public void a(int i10, int i11) {
            if (i10 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i11 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i12 = this.f3186d;
            int i13 = i12 * 2;
            int[] iArr = this.f3185c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f3185c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i13 >= iArr.length) {
                int[] iArr3 = new int[i12 * 4];
                this.f3185c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f3185c;
            iArr4[i13] = i10;
            iArr4[i13 + 1] = i11;
            this.f3186d++;
        }

        void b() {
            int[] iArr = this.f3185c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f3186d = 0;
        }

        void c(RecyclerView recyclerView, boolean z10) {
            this.f3186d = 0;
            int[] iArr = this.f3185c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.q qVar = recyclerView.f2912w;
            if (recyclerView.f2910v == null || qVar == null || !qVar.y0()) {
                return;
            }
            if (z10) {
                if (!recyclerView.f2885e.p()) {
                    qVar.u(recyclerView.f2910v.f(), this);
                }
            } else if (!recyclerView.x0()) {
                qVar.t(this.f3183a, this.f3184b, recyclerView.f2903r0, this);
            }
            int i10 = this.f3186d;
            if (i10 > qVar.f3012m) {
                qVar.f3012m = i10;
                qVar.f3013n = z10;
                recyclerView.f2881c.P();
            }
        }

        boolean d(int i10) {
            if (this.f3185c != null) {
                int i11 = this.f3186d * 2;
                for (int i12 = 0; i12 < i11; i12 += 2) {
                    if (this.f3185c[i12] == i10) {
                        return true;
                    }
                }
            }
            return false;
        }

        void e(int i10, int i11) {
            this.f3183a = i10;
            this.f3184b = i11;
        }
    }

    static class c {

        /* JADX INFO: renamed from: a */
        public boolean f3187a;

        /* JADX INFO: renamed from: b */
        public int f3188b;

        /* JADX INFO: renamed from: c */
        public int f3189c;

        /* JADX INFO: renamed from: d */
        public RecyclerView f3190d;

        /* JADX INFO: renamed from: e */
        public int f3191e;

        c() {
        }

        public void a() {
            this.f3187a = false;
            this.f3188b = 0;
            this.f3189c = 0;
            this.f3190d = null;
            this.f3191e = 0;
        }
    }

    e() {
    }

    private void b() {
        c cVar;
        int size = this.f3179a.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView = (RecyclerView) this.f3179a.get(i11);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.f2901q0.c(recyclerView, false);
                i10 += recyclerView.f2901q0.f3186d;
            }
        }
        this.f3182d.ensureCapacity(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView recyclerView2 = (RecyclerView) this.f3179a.get(i13);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.f2901q0;
                int iAbs = Math.abs(bVar.f3183a) + Math.abs(bVar.f3184b);
                for (int i14 = 0; i14 < bVar.f3186d * 2; i14 += 2) {
                    if (i12 >= this.f3182d.size()) {
                        cVar = new c();
                        this.f3182d.add(cVar);
                    } else {
                        cVar = (c) this.f3182d.get(i12);
                    }
                    int[] iArr = bVar.f3185c;
                    int i15 = iArr[i14 + 1];
                    cVar.f3187a = i15 <= iAbs;
                    cVar.f3188b = iAbs;
                    cVar.f3189c = i15;
                    cVar.f3190d = recyclerView2;
                    cVar.f3191e = iArr[i14];
                    i12++;
                }
            }
        }
        Collections.sort(this.f3182d, f3178f);
    }

    private void c(c cVar, long j10) {
        RecyclerView.f0 f0VarI = i(cVar.f3190d, cVar.f3191e, cVar.f3187a ? Long.MAX_VALUE : j10);
        if (f0VarI == null || f0VarI.f2965b == null || !f0VarI.u() || f0VarI.v()) {
            return;
        }
        h((RecyclerView) f0VarI.f2965b.get(), j10);
    }

    private void d(long j10) {
        for (int i10 = 0; i10 < this.f3182d.size(); i10++) {
            c cVar = (c) this.f3182d.get(i10);
            if (cVar.f3190d == null) {
                return;
            }
            c(cVar, j10);
            cVar.a();
        }
    }

    static boolean e(RecyclerView recyclerView, int i10) {
        int iJ = recyclerView.f2887f.j();
        for (int i11 = 0; i11 < iJ; i11++) {
            RecyclerView.f0 f0VarP0 = RecyclerView.p0(recyclerView.f2887f.i(i11));
            if (f0VarP0.f2966c == i10 && !f0VarP0.v()) {
                return true;
            }
        }
        return false;
    }

    private void h(RecyclerView recyclerView, long j10) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.N && recyclerView.f2887f.j() != 0) {
            recyclerView.i1();
        }
        b bVar = recyclerView.f2901q0;
        bVar.c(recyclerView, true);
        if (bVar.f3186d != 0) {
            try {
                Trace.beginSection(j10 == Long.MAX_VALUE ? "RV Nested Prefetch" : "RV Nested Prefetch forced - needed next frame");
                recyclerView.f2903r0.f(recyclerView.f2910v);
                for (int i10 = 0; i10 < bVar.f3186d * 2; i10 += 2) {
                    i(recyclerView, bVar.f3185c[i10], j10);
                }
                Trace.endSection();
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        }
    }

    private RecyclerView.f0 i(RecyclerView recyclerView, int i10, long j10) {
        if (e(recyclerView, i10)) {
            return null;
        }
        RecyclerView.w wVar = recyclerView.f2881c;
        if (j10 == Long.MAX_VALUE) {
            try {
                if (i0.l.c()) {
                    Trace.beginSection("RV Prefetch forced - needed next frame");
                }
            } catch (Throwable th2) {
                recyclerView.U0(false);
                Trace.endSection();
                throw th2;
            }
        }
        recyclerView.S0();
        RecyclerView.f0 f0VarN = wVar.N(i10, false, j10);
        if (f0VarN != null) {
            if (!f0VarN.u() || f0VarN.v()) {
                wVar.a(f0VarN, false);
            } else {
                wVar.G(f0VarN.f2964a);
            }
        }
        recyclerView.U0(false);
        Trace.endSection();
        return f0VarN;
    }

    public void a(RecyclerView recyclerView) {
        if (RecyclerView.N0 && this.f3179a.contains(recyclerView)) {
            throw new IllegalStateException("RecyclerView already present in worker list!");
        }
        this.f3179a.add(recyclerView);
    }

    void f(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.isAttachedToWindow()) {
            if (RecyclerView.N0 && !this.f3179a.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f3180b == 0) {
                this.f3180b = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        recyclerView.f2901q0.e(i10, i11);
    }

    void g(long j10) {
        b();
        d(j10);
    }

    public void j(RecyclerView recyclerView) {
        boolean zRemove = this.f3179a.remove(recyclerView);
        if (RecyclerView.N0 && !zRemove) {
            throw new IllegalStateException("RecyclerView removal failed!");
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Trace.beginSection("RV Prefetch");
            if (!this.f3179a.isEmpty()) {
                int size = this.f3179a.size();
                long jMax = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    RecyclerView recyclerView = (RecyclerView) this.f3179a.get(i10);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    g(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f3181c);
                }
            }
        } finally {
            this.f3180b = 0L;
            Trace.endSection();
        }
    }
}
