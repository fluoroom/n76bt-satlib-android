package v4;

import android.content.ContentUris;
import android.media.AudioRecord;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import com.dw.ht.Cfg;
import com.dw.mdc.Encoder;
import com.dw.mdc.Packet;
import com.facebook.stetho.server.http.HttpStatus;
import com.facebook.stetho.websocket.CloseCodes;
import java.util.Locale;
import v4.l1;
import x4.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class l extends com.dw.util.concurrent.a {
    private int A;
    private m5.b B;
    private long C;
    private int D;
    private boolean E;
    private boolean F;
    boolean G;

    /* JADX INFO: renamed from: e */
    protected final l1 f29928e;

    /* JADX INFO: renamed from: f */
    private final boolean f29929f;

    /* JADX INFO: renamed from: g */
    private kc.b f29930g;

    /* JADX INFO: renamed from: h */
    boolean f29931h;

    /* JADX INFO: renamed from: r */
    private Encoder f29932r;

    /* JADX INFO: renamed from: s */
    private AudioTrack f29933s;

    /* JADX INFO: renamed from: t */
    private m5.h f29934t;

    /* JADX INFO: renamed from: u */
    private x4.a f29935u;

    /* JADX INFO: renamed from: v */
    private short[] f29936v;

    /* JADX INFO: renamed from: w */
    private boolean f29937w;

    /* JADX INFO: renamed from: x */
    private int f29938x;

    /* JADX INFO: renamed from: y */
    private l1.h f29939y;

    /* JADX INFO: renamed from: z */
    private long f29940z;

    public l(l1 l1Var, String str) {
        super(str + ":" + l1Var.getName());
        this.f29931h = false;
        this.f29938x = 0;
        this.A = 32000;
        this.D = -1;
        this.G = false;
        this.f29928e = l1Var;
        if (!D() || Cfg.v() == 0) {
            this.f29932r = null;
            this.f29929f = false;
        } else {
            Encoder encoder = new Encoder(32000);
            this.f29932r = encoder;
            encoder.d(Packet.i(true, Cfg.v()));
            this.f29929f = !this.f29931h;
        }
        this.f29937w = l1Var.o0();
    }

    private void M(int i10) {
        a.C0425a c0425aA;
        if (this.f29937w) {
            if (this.f29940z == 0) {
                this.f29940z = SystemClock.elapsedRealtime();
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f29940z;
            long j10 = (((long) this.f29938x) * 1000) / ((long) this.A);
            if (j10 > jElapsedRealtime) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("流控制：休眠");
                long j11 = j10 - jElapsedRealtime;
                sb2.append(j11);
                sb2.append("ms");
                s3.b.b("AudioSendThread", sb2.toString());
                if (!sleepMs(j11)) {
                    return;
                }
            }
        }
        this.f29938x += i10;
        m5.h hVar = this.f29934t;
        if (hVar != null) {
            hVar.write(this.f29936v, 0, i10);
        }
        AudioTrack audioTrack = this.f29933s;
        if (audioTrack != null) {
            audioTrack.write(this.f29936v, 0, i10);
        }
        m5.b bVar = this.B;
        if (bVar != null) {
            bVar.S(this.f29936v, 0, i10);
        }
        x4.a aVar = this.f29935u;
        if (aVar == null || (c0425aA = aVar.a(this.f29936v, 0, i10)) == null) {
            return;
        }
        if (Cfg.f5476a && !this.G) {
            s3.b.b("AudioSendThread", String.format(Locale.getDefault(), "数据:%d,PCM数据:%d,PCM样本:%d,音频时长:%.1fms，压缩比%d%%", Integer.valueOf(c0425aA.f31615b), Integer.valueOf(this.f29938x * 2), Integer.valueOf(this.f29938x), Float.valueOf((this.f29938x * 1000.0f) / 32000.0f), Integer.valueOf((c0425aA.f31615b * 50) / this.f29938x)));
            this.G = true;
        }
        N(c0425aA.f31614a, c0425aA.f31615b, c0425aA.f31616c);
    }

    private void N(byte[] bArr, int i10, long j10) {
        while (this.f29928e.i()) {
            if (isCancelled() && !this.f29929f) {
                return;
            }
            if (!this.f29928e.q1(i10, 1000L)) {
                s3.b.b("AudioSendThread", "等待输出缓存");
            } else {
                if (!this.f29928e.i()) {
                    return;
                }
                if (isCancelled() && !this.f29929f) {
                    return;
                }
                int i11 = this.D;
                if (i11 >= 0) {
                    if (this.f29928e.X0((short) 50, (short) i11)) {
                        this.D = -1;
                    } else {
                        continue;
                    }
                }
                byte[] bArr2 = bArr;
                int i12 = i10;
                long j11 = j10;
                if (this.f29928e.s1(bArr2, 0, i12, j11)) {
                    return;
                }
                bArr = bArr2;
                i10 = i12;
                j10 = j11;
            }
        }
    }

    public static /* synthetic */ void t(Throwable th2) {
        if (Cfg.f5476a) {
            th2.printStackTrace();
        }
    }

    public static /* synthetic */ m5.b u(l lVar, int i10, l1 l1Var) {
        lVar.getClass();
        if (!l1Var.i()) {
            l1Var.L(false);
        }
        while (!l1Var.i()) {
            try {
                Thread.sleep(50L);
                if (lVar.isCancelled()) {
                    throw new IllegalStateException("建立语音连接前取消");
                }
            } catch (InterruptedException unused) {
                throw new IllegalStateException("建立语音连接前中止");
            }
        }
        m5.b bVar = new m5.b(l1Var, lVar.f29928e.getName() + "->" + l1Var.getName());
        bVar.K(i10);
        return bVar;
    }

    public static /* synthetic */ void v(l lVar, l1 l1Var, m5.b bVar) {
        if (lVar.isCancelled()) {
            return;
        }
        if (l1Var.n1(bVar, true)) {
            lVar.I(bVar);
        } else {
            bVar.cancel();
        }
    }

    private void y() {
        int minBufferSize;
        if (this.f29933s != null || (minBufferSize = AudioTrack.getMinBufferSize(32000, 4, 2)) <= 0) {
            return;
        }
        AudioTrack audioTrack = new AudioTrack(3, 32000, 4, 2, minBufferSize, 1);
        this.f29933s = audioTrack;
        try {
            audioTrack.play();
            o5.d.b();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    protected w5.h A() {
        return null;
    }

    l1.h B() {
        return this.f29939y;
    }

    protected String C() {
        return null;
    }

    protected boolean D() {
        return false;
    }

    protected int E() {
        if (this.f29928e instanceof o) {
            return HttpStatus.HTTP_INTERNAL_SERVER_ERROR;
        }
        return 0;
    }

    protected int F() {
        return (this.f29928e.f29947e * 32000) / CloseCodes.NORMAL_CLOSURE;
    }

    protected boolean G() {
        return Cfg.h0() && !this.E;
    }

    public void H(boolean z10) {
        this.f29937w = z10;
    }

    public void I(m5.b bVar) {
        m5.b bVar2 = this.B;
        if (bVar2 == bVar) {
            return;
        }
        if (bVar2 != null) {
            bVar2.cancel();
        }
        this.B = bVar;
        if (isCancelled()) {
            bVar.cancel();
        }
    }

    public void J(boolean z10, boolean z11) {
        if (this.f29928e.d().f29640g < 48) {
            z11 = false;
        }
        this.E = z10;
        this.F = z11;
        x4.a aVar = this.f29935u;
        if (aVar != null) {
            aVar.f(z10, z11);
        }
    }

    public void K(int i10) {
        this.D = i10;
    }

    protected boolean L() {
        return false;
    }

    @Override // com.dw.util.concurrent.a
    protected void doInBackground() {
        z3.a aVar;
        a.C0425a c0425aD;
        int iA;
        Encoder encoder;
        Process.setThreadPriority(-16);
        Thread.currentThread().setPriority(10);
        this.C = System.currentTimeMillis();
        int iE = (E() * 32000) / CloseCodes.NORMAL_CLOSURE;
        int iF = F();
        if (iF > 0) {
            aVar = new z3.a(32000, 1200.0d, (short) 10922);
        } else {
            aVar = null;
            iF = 0;
        }
        while (this.f29928e.i()) {
            if (isCancelled()) {
                iA = -1;
            } else if (iE > 0) {
                d4.a.d(this.f29936v, (short) 0);
                iA = Math.min(this.f29936v.length, iE);
                iE -= iA;
            } else if (iF > 0) {
                short[] sArr = this.f29936v;
                iA = aVar.e(sArr, 0, Math.min(sArr.length, iF));
                iF -= iA;
            } else {
                short[] sArr2 = this.f29936v;
                iA = read(sArr2, 0, sArr2.length);
            }
            if ((this.f29931h || iA < 0) && (encoder = this.f29932r) != null) {
                short[] sArr3 = this.f29936v;
                iA = encoder.a(sArr3, 0, sArr3.length);
                if (iA < 1) {
                    this.f29932r.b();
                    this.f29932r = null;
                }
            }
            if (iA < 0) {
                x4.a aVar2 = this.f29935u;
                if (aVar2 == null || aVar2.c() == 0) {
                    break;
                }
                d4.a.d(this.f29936v, (short) 0);
                iA = this.f29935u.b() - this.f29935u.c();
            }
            if (iA > 0) {
                M(iA);
            }
        }
        x4.a aVar3 = this.f29935u;
        if (aVar3 == null || (c0425aD = aVar3.d()) == null) {
            return;
        }
        N(c0425aD.f31614a, c0425aD.f31615b, c0425aD.f31616c);
    }

    @Override // com.dw.util.concurrent.a
    protected void onCancel() {
        super.onCancel();
        m5.b bVar = this.B;
        if (bVar != null) {
            bVar.cancel();
        }
    }

    @Override // com.dw.util.concurrent.a
    protected boolean onInit() {
        x4.a aVarM = this.f29928e.M(L());
        this.f29935u = aVarM;
        if (aVarM != null) {
            this.f29936v = new short[aVarM.b()];
            this.f29935u.f(this.E, this.F);
        } else {
            this.f29936v = new short[AudioRecord.getMinBufferSize(32000, 16, 2) / 2];
            y();
        }
        if (G()) {
            m5.h hVar = new m5.h();
            this.f29934t = hVar;
            hVar.start();
        }
        return super.onInit();
    }

    @Override // com.dw.util.concurrent.a
    protected void onStop() {
        r rVarX1;
        try {
            if (this.f29938x > 0 && G()) {
                l1 l1Var = this.f29928e;
                Uri uriO = d5.g.o(this.f29928e.q(), (!(l1Var instanceof c0) || (rVarX1 = ((c0) l1Var).X1()) == null) ? 0 : rVarX1.A(), 3, this.C, (this.f29938x * CloseCodes.NORMAL_CLOSURE) / 32000, C(), null, A());
                m5.h hVar = this.f29934t;
                if (hVar != null) {
                    if (uriO != null) {
                        hVar.r(ContentUris.parseId(uriO));
                    } else {
                        hVar.discard();
                    }
                    this.f29934t = null;
                }
            }
        } catch (Error unused) {
        }
        Encoder encoder = this.f29932r;
        if (encoder != null) {
            encoder.b();
        }
        m5.h hVar2 = this.f29934t;
        if (hVar2 != null) {
            hVar2.discard();
        }
        x4.a aVar = this.f29935u;
        if (aVar != null) {
            aVar.e();
        }
        this.f29928e.V0((short) 1);
        if (this.f29933s != null) {
            long jNanoTime = System.nanoTime();
            while (this.f29933s.getPlaybackHeadPosition() < this.f29938x && System.nanoTime() - jNanoTime < 5000000000L) {
                sleepMs(10L);
            }
            sleepMs(100L);
            this.f29933s.release();
            this.f29933s = null;
            o5.d.c();
        }
        m5.b bVar = this.B;
        if (bVar != null) {
            bVar.cancel();
        }
        super.onStop();
    }

    protected abstract int read(short[] sArr, int i10, int i11);

    protected boolean sleepMs(long j10) {
        try {
            Thread.sleep(j10);
            return true;
        } catch (InterruptedException unused) {
            return false;
        }
    }

    protected void x(l1.h hVar) {
        this.f29939y = hVar;
        cancel();
    }

    public void z(final l1 l1Var, final int i10) {
        if (this.f29930g != null) {
            return;
        }
        this.f29930g = hc.g.c(l1Var).e(zc.a.b()).d(new mc.d() { // from class: v4.i
            @Override // mc.d
            public final Object apply(Object obj) {
                return l.u(this.f29880a, i10, (l1) obj);
            }
        }).e(jc.a.a()).i(new mc.c() { // from class: v4.j
            @Override // mc.c
            public final void accept(Object obj) {
                l.v(this.f29904a, l1Var, (m5.b) obj);
            }
        }, new mc.c() { // from class: v4.k
            @Override // mc.c
            public final void accept(Object obj) {
                l.t((Throwable) obj);
            }
        });
    }
}
