package m5;

import android.media.AudioRecord;
import android.os.Process;
import com.dw.ht.Cfg;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends com.dw.util.concurrent.a {

    /* JADX INFO: renamed from: e */
    private final o5.c f21716e;

    /* JADX INFO: renamed from: f */
    private volatile boolean f21717f;

    /* JADX INFO: renamed from: g */
    private Object f21718g;

    /* JADX INFO: renamed from: h */
    private final Object f21719h;

    public c(String str) {
        super(str);
        this.f21719h = new Object();
        this.f21716e = o5.c.a(Cfg.f5500m, t());
    }

    @Override // com.dw.util.concurrent.a
    protected void doInBackground() {
        Process.setThreadPriority(-16);
        Thread.currentThread().setPriority(10);
        int minBufferSize = AudioRecord.getMinBufferSize(t(), 16, 2);
        try {
            if (minBufferSize <= 0) {
                return;
            }
            try {
                short[] sArr = new short[minBufferSize];
                while (!isCancelled()) {
                    if (this.f21718g == null) {
                        Thread.sleep(500L);
                        this.f21718g = this.f21716e.c();
                    }
                    int iB = this.f21716e.b(sArr, 0, minBufferSize, this.f21718g);
                    if (iB < 0) {
                        this.f21716e.d(this.f21718g);
                        this.f21718g = null;
                    }
                    synchronized (this.f21719h) {
                        try {
                            if (this.f21717f) {
                                this.f21716e.d(this.f21718g);
                                this.f21718g = null;
                                this.f21719h.wait();
                                iB = 0;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    if (iB >= 0) {
                        v(sArr, 0, iB);
                    }
                }
                this.f21716e.d(this.f21718g);
            } catch (InterruptedException unused) {
                this.f21716e.d(this.f21718g);
            } catch (Exception e10) {
                e10.printStackTrace();
                this.f21716e.d(this.f21718g);
            }
        } catch (Throwable th3) {
            this.f21716e.d(this.f21718g);
            throw th3;
        }
    }

    @Override // com.dw.util.concurrent.a
    protected void onCancel() {
        super.onCancel();
        synchronized (this.f21719h) {
            this.f21719h.notifyAll();
        }
    }

    public int t() {
        return 32000;
    }

    public void u() {
        synchronized (this.f21719h) {
            this.f21717f = true;
        }
    }

    protected abstract void v(short[] sArr, int i10, int i11);

    public void x() {
        synchronized (this.f21719h) {
            try {
                if (this.f21717f) {
                    this.f21717f = false;
                    this.f21719h.notifyAll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
