package com.benshikj.ii;

import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import b2.a;
import com.benshikj.ii.IILink;
import j$.util.Objects;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class AudioSendThread extends com.dw.util.concurrent.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final IILink f4971e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b2.a f4972f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private short[] f4973g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f4974h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f4975r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private IILink.Reason f4976s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f4977t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f4978u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f4979v;

    public AudioSendThread(IILink iILink, String str) {
        super(str);
        this.f4979v = false;
        this.f4971e = iILink;
    }

    private void t(int i10) {
        if (this.f4974h) {
            if (this.f4977t == 0) {
                this.f4977t = SystemClock.elapsedRealtime();
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f4977t;
            long j10 = ((long) this.f4975r) * 1000;
            Objects.requireNonNull(this.f4971e.f5065ii.config);
            long j11 = j10 / 48000;
            if (j11 > jElapsedRealtime) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("流控制：休眠");
                long j12 = j11 - jElapsedRealtime;
                sb2.append(j12);
                sb2.append("ms");
                Log.d("AudioSendThread", sb2.toString());
                if (!sleepMs(j12)) {
                    return;
                }
            }
        }
        this.f4975r += i10;
        a.C0055a c0055aA = this.f4972f.a(this.f4973g, 0, i10);
        if (c0055aA == null) {
            return;
        }
        if (Configuration.DEBUG && !this.f4979v) {
            Objects.requireNonNull(this.f4971e.f5065ii.config);
            Log.d("AudioSendThread", String.format(Locale.getDefault(), "数据:%d,PCM数据:%d,PCM样本:%d,音频时长:%.1fms，压缩比%d%%", Integer.valueOf(c0055aA.f3648b), Integer.valueOf(this.f4975r * 2), Integer.valueOf(this.f4975r), Float.valueOf((this.f4975r * 1000.0f) / 48000.0f), Integer.valueOf((c0055aA.f3648b * 50) / this.f4975r)));
            this.f4979v = true;
        }
        u(c0055aA.f3647a, c0055aA.f3648b, c0055aA.f3649c);
    }

    private void u(byte[] bArr, int i10, long j10) {
        while (this.f4971e.getConnected() && !isCancelled()) {
            byte[] bArr2 = bArr;
            int i11 = i10;
            long j11 = j10;
            if (this.f4971e.write(bArr2, 0, i11, j11)) {
                return;
            }
            bArr = bArr2;
            i10 = i11;
            j10 = j11;
        }
    }

    protected void cancel(IILink.Reason reason) {
        this.f4976s = reason;
        cancel();
    }

    @Override // com.dw.util.concurrent.a
    protected void doInBackground() {
        int iB;
        Process.setThreadPriority(-16);
        Thread.currentThread().setPriority(10);
        this.f4978u = System.currentTimeMillis();
        b2.a aVar = this.f4972f;
        if (aVar == null) {
            return;
        }
        while (this.f4971e.getConnected()) {
            if (isCancelled()) {
                iB = -1;
            } else {
                short[] sArr = this.f4973g;
                iB = read(sArr, 0, sArr.length);
            }
            if (iB < 0) {
                if (aVar.c() == 0) {
                    break;
                }
                d4.a.d(this.f4973g, (short) 0);
                iB = aVar.b() - aVar.c();
            }
            if (iB > 0) {
                t(iB);
            }
        }
        a.C0055a c0055aD = aVar.d();
        if (c0055aD != null) {
            u(c0055aD.f3647a, c0055aD.f3648b, c0055aD.f3649c);
        }
    }

    public IILink.Reason getStopReason() {
        return this.f4976s;
    }

    @Override // com.dw.util.concurrent.a
    protected boolean onInit() throws InterruptedException {
        int bitRates = this.f4971e.getBitRates();
        Objects.requireNonNull(this.f4971e.f5065ii.config);
        Objects.requireNonNull(this.f4971e.f5065ii.config);
        b2.b bVar = new b2.b(bitRates, 48000, 48000);
        this.f4972f = bVar;
        this.f4973g = new short[bVar.b()];
        return super.onInit();
    }

    @Override // com.dw.util.concurrent.a
    protected void onStop() {
        b2.a aVar = this.f4972f;
        if (aVar != null) {
            aVar.e();
        }
        this.f4971e.sendCom(1);
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
}
