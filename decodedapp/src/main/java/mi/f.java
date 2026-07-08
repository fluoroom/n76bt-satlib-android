package mi;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes3.dex */
public class f extends Handler implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f22323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f22324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f22325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f22326d;

    public f(c cVar, Looper looper, int i10) {
        super(looper);
        this.f22325c = cVar;
        this.f22324b = i10;
        this.f22323a = new k();
    }

    @Override // mi.l
    public void a(q qVar, Object obj) {
        j jVarA = j.a(qVar, obj);
        synchronized (this) {
            try {
                this.f22323a.a(jVarA);
                if (!this.f22326d) {
                    this.f22326d = true;
                    if (!sendMessage(obtainMessage())) {
                        throw new e("Could not send handler message");
                    }
                }
            } finally {
            }
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            do {
                j jVarB = this.f22323a.b();
                if (jVarB == null) {
                    synchronized (this) {
                        jVarB = this.f22323a.b();
                        if (jVarB == null) {
                            this.f22326d = false;
                            return;
                        }
                    }
                }
                this.f22325c.i(jVarB);
            } while (SystemClock.uptimeMillis() - jUptimeMillis < this.f22324b);
            if (!sendMessage(obtainMessage())) {
                throw new e("Could not send handler message");
            }
            this.f22326d = true;
        } catch (Throwable th2) {
            this.f22326d = false;
            throw th2;
        }
    }
}
