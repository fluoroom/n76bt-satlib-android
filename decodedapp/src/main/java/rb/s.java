package rb;

import androidx.appcompat.widget.ActivityChooserView;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f25842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final tb.c f25843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f25844c = 65535;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f25845d = new c(0, 65535, null);

    public interface b {
        void b(int i10);
    }

    public final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Runnable f25847b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f25848c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f25849d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f25850e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final b f25851f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final vh.e f25846a = new vh.e();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f25852g = false;

        c(int i10, int i11, b bVar) {
            this.f25848c = i10;
            this.f25849d = i11;
            this.f25851f = bVar;
        }

        void a(int i10) {
            this.f25850e += i10;
        }

        int b() {
            return this.f25850e;
        }

        void c() {
            this.f25850e = 0;
        }

        void d(vh.e eVar, int i10, boolean z10) {
            this.f25846a.C(eVar, i10);
            this.f25852g |= z10;
        }

        boolean e() {
            return this.f25846a.size() > 0;
        }

        int f(int i10) {
            if (i10 <= 0 || ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - i10 >= this.f25849d) {
                int i11 = this.f25849d + i10;
                this.f25849d = i11;
                return i11;
            }
            throw new IllegalArgumentException("Window size overflow for stream: " + this.f25848c);
        }

        int g() {
            return Math.max(0, Math.min(this.f25849d, (int) this.f25846a.size()));
        }

        int h() {
            return g() - this.f25850e;
        }

        int i() {
            return this.f25849d;
        }

        int j() {
            return Math.min(this.f25849d, s.this.f25845d.i());
        }

        void k(vh.e eVar, int i10, boolean z10) {
            do {
                int iMin = Math.min(i10, s.this.f25843b.i0());
                int i11 = -iMin;
                s.this.f25845d.f(i11);
                f(i11);
                try {
                    s.this.f25843b.m(eVar.size() == ((long) iMin) && z10, this.f25848c, eVar, iMin);
                    this.f25851f.b(iMin);
                    i10 -= iMin;
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            } while (i10 > 0);
        }

        int l(int i10, e eVar) {
            Runnable runnable;
            int iMin = Math.min(i10, j());
            int size = 0;
            while (e() && iMin > 0) {
                if (iMin >= this.f25846a.size()) {
                    size += (int) this.f25846a.size();
                    vh.e eVar2 = this.f25846a;
                    k(eVar2, (int) eVar2.size(), this.f25852g);
                } else {
                    size += iMin;
                    k(this.f25846a, iMin, false);
                }
                eVar.b();
                iMin = Math.min(i10 - size, j());
            }
            if (!e() && (runnable = this.f25847b) != null) {
                runnable.run();
                this.f25847b = null;
            }
            return size;
        }
    }

    public interface d {
        c[] a();
    }

    private static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25854a;

        private e() {
        }

        boolean a() {
            return this.f25854a > 0;
        }

        void b() {
            this.f25854a++;
        }
    }

    public s(d dVar, tb.c cVar) {
        this.f25842a = (d) r9.l.o(dVar, "transport");
        this.f25843b = (tb.c) r9.l.o(cVar, "frameWriter");
    }

    public c c(b bVar, int i10) {
        return new c(i10, this.f25844c, (b) r9.l.o(bVar, "stream"));
    }

    public void d(boolean z10, c cVar, vh.e eVar, boolean z11) {
        r9.l.o(eVar, "source");
        int iJ = cVar.j();
        boolean zE = cVar.e();
        int size = (int) eVar.size();
        if (zE || iJ < size) {
            if (!zE && iJ > 0) {
                cVar.k(eVar, iJ, false);
            }
            cVar.d(eVar, (int) eVar.size(), z10);
        } else {
            cVar.k(eVar, size, z10);
        }
        if (z11) {
            e();
        }
    }

    public void e() {
        try {
            this.f25843b.flush();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public boolean f(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Invalid initial window size: " + i10);
        }
        int i11 = i10 - this.f25844c;
        this.f25844c = i10;
        for (c cVar : this.f25842a.a()) {
            cVar.f(i11);
        }
        return i11 > 0;
    }

    public int g(c cVar, int i10) {
        if (cVar == null) {
            int iF = this.f25845d.f(i10);
            h();
            return iF;
        }
        int iF2 = cVar.f(i10);
        e eVar = new e();
        cVar.l(cVar.j(), eVar);
        if (eVar.a()) {
            e();
        }
        return iF2;
    }

    public void h() {
        int i10;
        c[] cVarArrA = this.f25842a.a();
        Collections.shuffle(Arrays.asList(cVarArrA));
        int i11 = this.f25845d.i();
        int length = cVarArrA.length;
        while (true) {
            i10 = 0;
            if (length <= 0 || i11 <= 0) {
                break;
            }
            int iCeil = (int) Math.ceil(i11 / length);
            for (int i12 = 0; i12 < length && i11 > 0; i12++) {
                c cVar = cVarArrA[i12];
                int iMin = Math.min(i11, Math.min(cVar.h(), iCeil));
                if (iMin > 0) {
                    cVar.a(iMin);
                    i11 -= iMin;
                }
                if (cVar.h() > 0) {
                    cVarArrA[i10] = cVar;
                    i10++;
                }
            }
            length = i10;
        }
        e eVar = new e();
        c[] cVarArrA2 = this.f25842a.a();
        int length2 = cVarArrA2.length;
        while (i10 < length2) {
            c cVar2 = cVarArrA2[i10];
            cVar2.l(cVar2.b(), eVar);
            cVar2.c();
            i10++;
        }
        if (eVar.a()) {
            e();
        }
    }
}
