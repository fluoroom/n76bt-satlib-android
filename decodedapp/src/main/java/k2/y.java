package k2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f19135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f19136b = new Handler(Looper.getMainLooper(), new a());

    private static final class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((v) message.obj).c();
            return true;
        }
    }

    y() {
    }

    synchronized void a(v vVar, boolean z10) {
        try {
            if (this.f19135a || z10) {
                this.f19136b.obtainMessage(1, vVar).sendToTarget();
            } else {
                this.f19135a = true;
                vVar.c();
                this.f19135a = false;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
