package i0;

import android.os.CancellationSignal;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f15646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f15647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f15648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f15649d;

    public interface a {
        void onCancel();
    }

    private void d() {
        while (this.f15649d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public void a() {
        synchronized (this) {
            try {
                if (this.f15646a) {
                    return;
                }
                this.f15646a = true;
                this.f15649d = true;
                a aVar = this.f15647b;
                Object obj = this.f15648c;
                if (aVar != null) {
                    try {
                        aVar.onCancel();
                    } catch (Throwable th2) {
                        synchronized (this) {
                            this.f15649d = false;
                            notifyAll();
                            throw th2;
                        }
                    }
                }
                if (obj != null) {
                    ((CancellationSignal) obj).cancel();
                }
                synchronized (this) {
                    this.f15649d = false;
                    notifyAll();
                }
            } finally {
            }
        }
    }

    public Object b() {
        Object obj;
        synchronized (this) {
            try {
                if (this.f15648c == null) {
                    CancellationSignal cancellationSignal = new CancellationSignal();
                    this.f15648c = cancellationSignal;
                    if (this.f15646a) {
                        cancellationSignal.cancel();
                    }
                }
                obj = this.f15648c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }

    public void c(a aVar) {
        synchronized (this) {
            try {
                d();
                if (this.f15647b == aVar) {
                    return;
                }
                this.f15647b = aVar;
                if (this.f15646a && aVar != null) {
                    aVar.onCancel();
                }
            } finally {
            }
        }
    }
}
