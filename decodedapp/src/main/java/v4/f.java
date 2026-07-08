package v4;

import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import androidx.appcompat.widget.ActivityChooserView;
import com.dw.ht.Cfg;
import p3.b;
import v4.d;
import v4.l1;

/* JADX INFO: loaded from: classes.dex */
class f extends m5.c implements b.a {
    private static final boolean G = Cfg.f5476a;
    private long A;
    private m5.h B;
    private final l1.d C;
    private boolean D;
    private d E;
    private final Runnable F;

    /* JADX INFO: renamed from: r */
    private int f29853r;

    /* JADX INFO: renamed from: s */
    private boolean f29854s;

    /* JADX INFO: renamed from: t */
    private int f29855t;

    /* JADX INFO: renamed from: u */
    private final int f29856u;

    /* JADX INFO: renamed from: v */
    private final int f29857v;

    /* JADX INFO: renamed from: w */
    private final g f29858w;

    /* JADX INFO: renamed from: x */
    private long f29859x;

    /* JADX INFO: renamed from: y */
    private int f29860y;

    /* JADX INFO: renamed from: z */
    private int f29861z;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (f.this.z()) {
                f.this.f29858w.A1();
            }
        }
    }

    public f(g gVar) {
        super("AMT:" + gVar.getName());
        this.f29853r = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.f29854s = true;
        this.f29855t = 3276;
        this.f29856u = 32000;
        this.f29857v = 9600000;
        this.F = new a();
        if (G) {
            Log.d("AMT", "new for: " + gVar.getName());
        }
        this.f29858w = gVar;
        this.C = gVar.e0();
        B(gVar.z1());
    }

    private void A() {
        if (this.D) {
            d.a aVarI = this.E.i();
            g gVar = this.f29858w;
            new y(gVar, 0, this.B, (int) ((((long) this.f29860y) * 1000) / 32000), this.f29859x, gVar.q(), 0L, null, aVarI.b(), aVarI.c(), aVarI.a()).execute(new Void[0]);
            this.B = null;
            this.f29860y = 0;
            this.D = false;
        }
    }

    public void B(float f10) {
        this.f29855t = (int) (f10 * 32767.0f);
    }

    @Override // com.dw.util.concurrent.a
    public boolean onInit() {
        Process.setThreadPriority(-16);
        Thread.currentThread().setPriority(10);
        if (AudioTrack.getMinBufferSize(32000, 4, 2) <= 0) {
            return false;
        }
        if (G) {
            Log.d("AMT", "start for: " + this.f29858w.getName());
        }
        this.E = new d(32000);
        return true;
    }

    @Override // com.dw.util.concurrent.a
    protected void onStop() {
        A();
        d dVar = this.E;
        if (dVar != null) {
            dVar.g();
        }
        this.f29858w.O(false);
        super.onStop();
    }

    @Override // m5.c
    protected void v(short[] sArr, int i10, int i11) {
        int iMax;
        if (i11 <= 0) {
            return;
        }
        int i12 = i11 + i10;
        if (o5.d.a()) {
            iMax = 0;
        } else {
            iMax = 0;
            for (int i13 = i10; i13 < i12; i13++) {
                iMax = Math.max(iMax, Math.abs((int) sArr[i13]));
            }
        }
        this.f29861z = iMax;
        if (iMax > this.f29855t) {
            this.f29853r = 0;
            this.f29854s = false;
            this.A = SystemClock.elapsedRealtime();
            this.f29858w.f29943a.removeCallbacks(this.F);
        } else {
            int i14 = this.f29853r;
            if (i14 < 32000) {
                int i15 = i14 + i11;
                this.f29853r = i15;
                if (i15 >= 32000 && !this.f29854s) {
                    this.f29858w.f29943a.postDelayed(this.F, 5000L);
                    this.f29854s = true;
                }
            }
        }
        if (this.f29854s) {
            A();
        } else {
            if (!this.D) {
                this.f29859x = System.currentTimeMillis();
                this.f29860y = 0;
                if (Cfg.h0() && this.B == null) {
                    m5.h hVar = new m5.h();
                    this.B = hVar;
                    hVar.start();
                }
            }
            this.D = true;
            this.f29860y += i11;
            m5.h hVar2 = this.B;
            if (hVar2 != null) {
                hVar2.write(sArr, i10, i11);
            }
        }
        if (this.f29860y > 9600000) {
            A();
        }
        this.C.a(sArr, i10, i11);
        this.E.b(sArr, i10, i11);
    }

    @Override // p3.b.a
    public int w() {
        int i10 = this.f29861z;
        this.f29861z = 0;
        return i10;
    }

    public boolean z() {
        return SystemClock.elapsedRealtime() - this.A > 5000;
    }
}
