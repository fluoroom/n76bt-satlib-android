package v4;

import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.dw.ht.Cfg;
import g3.a;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.function.Predicate$CC;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Predicate;
import org.msgpack.core.MessagePack;
import v4.n0;
import v4.y1;
import w5.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class y1 {

    /* JADX INFO: renamed from: b */
    private c f30263b;

    /* JADX INFO: renamed from: e */
    private int f30266e;

    /* JADX INFO: renamed from: f */
    protected final l1 f30267f;

    /* JADX INFO: renamed from: i */
    private int f30270i;

    /* JADX INFO: renamed from: j */
    protected boolean f30271j;

    /* JADX INFO: renamed from: k */
    private boolean f30272k;

    /* JADX INFO: renamed from: o */
    private Uri f30276o;

    /* JADX INFO: renamed from: p */
    private long f30277p;

    /* JADX INFO: renamed from: a */
    private final int f30262a = 53;

    /* JADX INFO: renamed from: c */
    private final ArrayList f30264c = new ArrayList();

    /* JADX INFO: renamed from: d */
    protected final Handler f30265d = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: g */
    protected final ConcurrentLinkedQueue f30268g = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: h */
    private final HashMap f30269h = new HashMap();

    /* JADX INFO: renamed from: l */
    private long f30273l = -1000000;

    /* JADX INFO: renamed from: m */
    private final Runnable f30274m = new a();

    /* JADX INFO: renamed from: n */
    private final Runnable f30275n = new b();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            y1.this.f30264c.clear();
            if (y1.this.f30263b != null) {
                y1 y1Var = y1.this;
                y1Var.u(y1Var.f30263b);
            }
            y1.this.f30263b = null;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (y1.this.f30269h.isEmpty()) {
                return;
            }
            y1.this.f30265d.postDelayed(this, 1000L);
            Iterator it = y1.this.f30269h.values().iterator();
            while (it.hasNext()) {
                ((d) it.next()).b(y1.this);
            }
        }
    }

    protected static class c {

        /* JADX INFO: renamed from: a */
        private final Uri f30280a;

        /* JADX INFO: renamed from: b */
        private final w5.h f30281b;

        /* JADX INFO: renamed from: c */
        private final long f30282c;

        /* JADX INFO: renamed from: d */
        private final s f30283d;

        /* JADX INFO: renamed from: e */
        final boolean f30284e;

        public c(w5.h hVar, long j10, Uri uri, s sVar, boolean z10) {
            long jNanoTime;
            this.f30281b = hVar;
            if (j10 == 0) {
                jNanoTime = Long.MAX_VALUE;
            } else {
                jNanoTime = (j10 * 1000000) + System.nanoTime();
            }
            this.f30282c = jNanoTime;
            this.f30280a = uri;
            this.f30283d = sVar;
            this.f30284e = z10;
        }

        public w5.h c() {
            return this.f30281b;
        }

        public boolean d() {
            return System.nanoTime() > this.f30282c;
        }
    }

    static class d {

        /* JADX INFO: renamed from: a */
        private final c f30285a;

        /* JADX INFO: renamed from: b */
        private long f30286b;

        /* JADX INFO: renamed from: c */
        private int f30287c;

        /* JADX INFO: renamed from: d */
        boolean f30288d;

        public d(c cVar) {
            this.f30285a = cVar;
        }

        boolean a() {
            int i10 = this.f30287c;
            return i10 <= 3 && i10 > 0;
        }

        void b(y1 y1Var) {
            long j10;
            if (this.f30288d) {
                return;
            }
            int i10 = this.f30287c;
            if (i10 == 1 || i10 == 2) {
                j10 = 60000;
            } else if (i10 != 3) {
                return;
            } else {
                j10 = 120000;
            }
            if (this.f30286b + j10 > SystemClock.elapsedRealtime()) {
                return;
            }
            this.f30288d = true;
            w5.h hVarC = this.f30285a.c();
            c cVar = this.f30285a;
            y1Var.x(hVarC, 100000, cVar.f30284e, cVar.f30283d);
        }

        public void c() {
            this.f30287c++;
            this.f30286b = SystemClock.elapsedRealtime();
            this.f30288d = false;
        }
    }

    y1(l1 l1Var) {
        this.f30267f = l1Var;
    }

    public static /* synthetic */ boolean c(y1 y1Var, c cVar) {
        y1Var.getClass();
        if (!cVar.d()) {
            return false;
        }
        y1Var.u(cVar);
        return true;
    }

    public static /* synthetic */ void d(y1 y1Var, w5.a aVar, c cVar) {
        y1Var.getClass();
        String strG = aVar.G();
        d dVar = (d) y1Var.f30269h.get(strG);
        if (dVar == null) {
            dVar = new d(cVar);
            y1Var.f30269h.put(strG, dVar);
        }
        dVar.c();
        if (!dVar.a()) {
            y1Var.f30269h.remove(strG);
        }
        y1Var.f30265d.removeCallbacks(y1Var.f30275n);
        y1Var.f30265d.postDelayed(y1Var.f30275n, 1000L);
    }

    private void j() {
        this.f30264c.clear();
        c cVar = this.f30263b;
        if (cVar != null) {
            u(cVar);
            this.f30263b = null;
        }
    }

    private boolean k() {
        c cVar = this.f30263b;
        if (cVar == null || !cVar.d()) {
            return false;
        }
        j();
        r();
        return true;
    }

    private void l() {
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                Collection.EL.removeIf(this.f30268g, new Predicate() { // from class: v4.v1
                    public /* synthetic */ Predicate and(Predicate predicate) {
                        return Predicate$CC.$default$and(this, predicate);
                    }

                    public /* synthetic */ Predicate negate() {
                        return Predicate$CC.$default$negate(this);
                    }

                    public /* synthetic */ Predicate or(Predicate predicate) {
                        return Predicate$CC.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return y1.c(this.f30220a, (y1.c) obj);
                    }
                });
                k();
                return;
            }
        } catch (NoClassDefFoundError e10) {
            e10.printStackTrace();
        }
        ArrayList<c> arrayList = new ArrayList();
        for (c cVar : this.f30268g) {
            if (cVar.d()) {
                arrayList.add(cVar);
            }
        }
        for (c cVar2 : arrayList) {
            this.f30268g.remove(cVar2);
            u(cVar2);
        }
        k();
    }

    private static char m(byte b10) {
        int i10 = b10 & MessagePack.Code.EXT_TIMESTAMP;
        if (i10 < 10) {
            return (char) (i10 + 48);
        }
        switch (i10) {
            case 11:
                return '#';
            case 12:
                return 'A';
            case 13:
                return 'B';
            case 14:
                return 'C';
            case 15:
                return 'D';
            default:
                return '*';
        }
    }

    private int o() {
        d5.a aVarV;
        l1 l1Var = this.f30267f;
        if (!(l1Var instanceof c0)) {
            return 0;
        }
        c0 c0Var = (c0) l1Var;
        k0 k0VarY = c0Var.Y();
        if (!k0VarY.f29913b || (aVarV = c0Var.V(k0VarY.f29919h)) == null) {
            return 0;
        }
        return aVarV.K();
    }

    public void u(c cVar) {
        if (Cfg.f5476a) {
            s3.b.h("PacketSender", "send fail:" + cVar.c().toString());
        }
        d5.g.v(cVar.f30280a, 4);
    }

    private void v(final c cVar) {
        if (Cfg.f5476a) {
            s3.b.h("PacketSender", "send success:" + cVar.c().toString());
        }
        d5.g.v(cVar.f30280a, 3);
        this.f30273l = SystemClock.elapsedRealtime();
        if (cVar.c() instanceof w5.a) {
            final w5.a aVar = (w5.a) cVar.c();
            w5.c cVarC = aVar.C();
            String strK = cVarC != null ? cVarC.f31219d.k() : "";
            if (aVar.O() == a.g.MESSAGE && !a6.w.b(aVar.G()) && Objects.equals(strK, this.f30267f.U())) {
                this.f30265d.post(new Runnable() { // from class: v4.w1
                    @Override // java.lang.Runnable
                    public final void run() {
                        y1.d(this.f30228a, aVar, cVar);
                    }
                });
            }
        }
    }

    public boolean y(boolean z10) {
        this.f30272k = false;
        if (k()) {
            return false;
        }
        if (z10) {
            this.f30266e = 0;
            if (Cfg.f5476a) {
                s3.b.h("PacketSender", "retry times:" + this.f30270i);
            }
        } else {
            this.f30266e++;
            this.f30270i = 0;
        }
        if (this.f30266e < 0) {
            this.f30266e = 0;
        }
        if (this.f30266e >= this.f30264c.size()) {
            this.f30264c.clear();
            c cVar = this.f30263b;
            if (cVar != null) {
                v(cVar);
            }
            this.f30263b = null;
        }
        if (this.f30264c.isEmpty()) {
            return false;
        }
        this.f30267f.a(v.HT_SEND_DATA, (byte[]) this.f30264c.get(this.f30266e));
        this.f30265d.postDelayed(this.f30274m, 4000L);
        return true;
    }

    public long n() {
        return this.f30273l;
    }

    protected boolean p() {
        l();
        return this.f30268g.isEmpty();
    }

    public void q(g3.d dVar) {
        Uri uriO;
        int i10;
        byte[] bArrI = dVar.i();
        if (bArrI != null) {
            if (bArrI.length >= 2) {
                if (Cfg.f5476a) {
                    s3.b.b("PacketSender", "rx form dev:" + a6.w.d(bArrI, 1, bArrI.length - 1));
                }
                this.f30276o = null;
                try {
                    int iO = o();
                    int i11 = bArrI[1] & MessagePack.Code.EXT_TIMESTAMP;
                    if (i11 == 223) {
                        StringBuilder sb2 = new StringBuilder();
                        for (int i12 = 2; i12 < bArrI.length; i12++) {
                            sb2.append(m(bArrI[i12]));
                        }
                        uriO = d5.g.o(this.f30267f.q(), iO, 2, System.currentTimeMillis(), 0, sb2.toString(), null, null);
                        i10 = iO;
                    } else {
                        if (i11 == 239 || i11 == 255) {
                            return;
                        }
                        w5.h hVarJ = w5.h.j(bArrI, 1, bArrI.length - 1);
                        if (Cfg.f5476a) {
                            s3.b.b("PacketSender", "rx form dev:" + a6.w.d(bArrI, 1, bArrI.length - 1));
                            s3.b.h("PacketSender", "rx form dev:" + hVarJ);
                        }
                        i10 = iO;
                        uriO = d5.g.q(this.f30267f.q(), 0L, i10, 2, hVarJ);
                    }
                    if (i10 == 0) {
                        this.f30276o = uriO;
                        this.f30277p = SystemClock.elapsedRealtime();
                        return;
                    }
                    return;
                } catch (w5.g e10) {
                    s3.b.e("PacketSender", "onDeviceSend", e10);
                    return;
                }
            }
        }
        s3.b.b("PacketSender", "无效数据：长度小于2");
    }

    void r() {
        if (!com.dw.util.concurrent.b.a()) {
            this.f30265d.post(new s1(this));
            return;
        }
        if (Cfg.f5476a) {
            s3.b.b("PacketSender", "onReadyTx:isEmpty=" + p() + ",WaitSendStart=" + this.f30271j);
        }
        if ((this.f30272k && y(true)) || p() || this.f30271j) {
            return;
        }
        this.f30271j = true;
        this.f30265d.postDelayed(new t1(this), (long) (Math.random() * 2000.0d));
    }

    void s(g3.d dVar) {
        this.f30265d.removeCallbacks(this.f30274m);
        if (Cfg.f5476a) {
            s3.b.b("PacketSender", "rx ack:" + dVar.l());
        }
        if (dVar.l() == a.b.SUCCESS) {
            y(false);
            return;
        }
        if (dVar.l() != a.b.INCORRECT_STATE) {
            j();
        } else if (this.f30267f.s0()) {
            this.f30265d.postDelayed(new Runnable() { // from class: v4.x1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f30247a.y(true);
                }
            }, 50L);
        } else {
            this.f30272k = true;
        }
    }

    public void t(final w5.a aVar) {
        this.f30265d.post(new Runnable() { // from class: v4.u1
            @Override // java.lang.Runnable
            public final void run() {
                this.f30173a.f30269h.remove(aVar.G());
            }
        });
    }

    public void w() {
        int iO;
        Uri uri = this.f30276o;
        this.f30276o = null;
        if (uri == null || SystemClock.elapsedRealtime() - this.f30277p > 1000 || (iO = o()) == 0) {
            return;
        }
        d5.g.w(uri, iO);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void x(w5.h r9, int r10, boolean r11, v4.s r12) {
        /*
            r8 = this;
            if (r11 == 0) goto L2d
            v4.l1 r0 = r8.f30267f
            boolean r1 = r0 instanceof v4.c0
            if (r1 == 0) goto L1a
            v4.c0 r0 = (v4.c0) r0
            int r1 = r0.T2(r12)
            v4.r r0 = r0.d2(r1)
            if (r0 == 0) goto L1a
            int r0 = r0.A()
            r5 = r0
            goto L1c
        L1a:
            r0 = 0
            r5 = 0
        L1c:
            v4.l1 r0 = r8.f30267f
            long r1 = r0.q()
            r3 = 0
            r6 = 2
            r7 = r9
            android.net.Uri r9 = d5.g.q(r1, r3, r5, r6, r7)
            r1 = r7
        L2b:
            r4 = r9
            goto L30
        L2d:
            r1 = r9
            r9 = 0
            goto L2b
        L30:
            java.util.concurrent.ConcurrentLinkedQueue r9 = r8.f30268g
            v4.y1$c r0 = new v4.y1$c
            long r2 = (long) r10
            r6 = r11
            r5 = r12
            r0.<init>(r1, r2, r4, r5, r6)
            r9.add(r0)
            android.os.Handler r9 = r8.f30265d
            v4.s1 r10 = new v4.s1
            r10.<init>(r8)
            r9.post(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v4.y1.x(w5.h, int, boolean, v4.s):void");
    }

    protected void z() {
        this.f30271j = false;
        if (p()) {
            return;
        }
        if (!this.f30267f.n()) {
            if (this.f30267f.l() == n0.c.Idle) {
                return;
            }
            this.f30267f.v(false);
            return;
        }
        if (this.f30264c.isEmpty() && this.f30267f.s0()) {
            this.f30263b = null;
            while (!this.f30268g.isEmpty() && this.f30263b == null) {
                this.f30263b = (c) this.f30268g.poll();
            }
            c cVar = this.f30263b;
            if (cVar == null) {
                return;
            }
            this.f30266e = -1;
            int i10 = cVar.c().i();
            byte[] bArr = new byte[i10];
            try {
                this.f30263b.c().k(bArr, 0);
                l1 l1Var = this.f30267f;
                int iT2 = l1Var instanceof c0 ? ((c0) l1Var).T2(this.f30263b.f30283d) : -1;
                int i11 = iT2 >= 0 ? 1 : 0;
                byte b10 = 0;
                int i12 = 0;
                while (i10 > 0) {
                    int iMin = Math.min(53 - i11, i10);
                    i10 -= iMin;
                    int i13 = iMin + 1 + i11;
                    byte[] bArr2 = new byte[i13];
                    byte b11 = (byte) (b10 + 1);
                    bArr2[0] = b10;
                    if (i10 == 0) {
                        bArr2[0] = (byte) (b10 | 128);
                    }
                    if (i11 != 0) {
                        bArr2[0] = (byte) (bArr2[0] | 64);
                        bArr2[i13 - 1] = (byte) iT2;
                    }
                    System.arraycopy(bArr, i12, bArr2, 1, iMin);
                    i12 += iMin;
                    this.f30264c.add(bArr2);
                    b10 = b11;
                    i11 = 0;
                }
                y(false);
            } catch (w5.f e10) {
                this.f30263b = null;
                e10.printStackTrace();
                this.f30265d.post(new t1(this));
            }
        }
    }
}
