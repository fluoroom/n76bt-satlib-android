package v4;

import android.os.Process;
import android.os.SystemClock;
import java.io.IOException;
import java.io.OutputStream;
import org.msgpack.core.MessagePack;
import v4.n0;

/* JADX INFO: loaded from: classes.dex */
public abstract class t extends com.dw.util.concurrent.a {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    static final boolean f30139u = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final b6.a f30140e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final byte[] f30141f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final c0 f30142g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected OutputStream f30143h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected s0 f30144r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f30145s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f30146t;

    t(c0 c0Var, String str) {
        super(str);
        this.f30141f = new byte[4096];
        this.f30143h = null;
        this.f30142g = c0Var;
        this.f30140e = new b6.a(4096);
        if (f30139u) {
            s3.b.b("ConnectThread", "new " + str);
        }
    }

    public boolean A(byte[] bArr, int i10, int i11) {
        if (this.f30140e.b() < i11) {
            s3.b.b("ConnectThread", "缓存不足");
            return false;
        }
        int iD = (this.f30142g.Q.f29640g < 48 || i11 <= 0) ? x5.a.d(bArr, i10, i11, this.f30141f, 0, false) : x5.a.c(((bArr[i10] & MessagePack.Code.EXT_TIMESTAMP) << 8) | (bArr[i10 + 1] & MessagePack.Code.EXT_TIMESTAMP), false, this.f30141f, 0, bArr, i10 + 2, i11 - 2);
        if (this.f30140e.b() < iD) {
            s3.b.b("ConnectThread", "缓存不足");
            return false;
        }
        this.f30140e.m(this.f30141f, 0, iD);
        return true;
    }

    @Override // com.dw.util.concurrent.a
    public void doInBackground() {
        Process.setThreadPriority(-16);
        Thread.currentThread().setPriority(10);
        try {
            int iU = u();
            byte[] bArr = new byte[iU];
            while (!isCancelled()) {
                this.f30140e.i(1, 0L);
                int iL = this.f30140e.l(bArr, 0, iU);
                if (iL > 0) {
                    this.f30143h.flush();
                    this.f30143h.write(bArr, 0, iL);
                    if (f30139u) {
                        this.f30146t += iL;
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        long j10 = jElapsedRealtime - this.f30145s;
                        if (j10 > 1000) {
                            this.f30145s = jElapsedRealtime;
                            long j11 = (((long) (this.f30146t * 8)) * 1000) / j10;
                            s3.b.b("ConnectThread", "带宽：" + j11 + "bit/s " + (j11 / 8) + "byte/s ");
                            this.f30146t = 0;
                        }
                        s3.b.b("ConnectThread", "发送:" + iL + "字节");
                    }
                }
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.dw.util.concurrent.a
    protected void onCancel() {
        super.onCancel();
        a6.m.b(this.f30143h);
        this.f30140e.j();
    }

    @Override // com.dw.util.concurrent.a
    protected void onStop() {
        if (this.f30142g.R() == n0.c.Connecting) {
            y(n0.c.ConnectionFailed);
        }
        a6.m.b(this.f30143h);
        this.f30142g.q2(this);
        super.onStop();
    }

    public s0 t() {
        return this.f30144r;
    }

    protected int u() {
        return 768;
    }

    public boolean v() {
        s0 s0Var = this.f30144r;
        return s0Var != null && s0Var.n();
    }

    public boolean x() {
        return this.f30140e.c() == 0;
    }

    protected void y(n0.c cVar) {
        if (!isCancelled() && this.f30142g.Z == this) {
            this.f30142g.Z0(cVar);
        }
    }

    public boolean z(int i10, long j10) {
        return this.f30140e.h((i10 * 2) + 6, j10);
    }
}
