package a6;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends Handler {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Looper f319c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Handler f320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeakReference f321b;

    protected static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f322a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f323b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public l f324c;

        protected a() {
        }
    }

    /* JADX INFO: renamed from: a6.b$b, reason: collision with other inner class name */
    protected class HandlerC0008b extends Handler {
        public HandlerC0008b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            a aVar = (a) message.obj;
            aVar.f322a = aVar.f324c.a(aVar.f323b);
            Message messageObtainMessage = b.this.obtainMessage(message.what);
            messageObtainMessage.obj = aVar;
            messageObtainMessage.sendToTarget();
        }
    }

    public b() {
        a();
    }

    private void a() {
        synchronized (b.class) {
            try {
                if (f319c == null) {
                    HandlerThread handlerThread = new HandlerThread("AsyncCallWorker", 10);
                    handlerThread.start();
                    f319c = handlerThread.getLooper();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f320a = new HandlerC0008b(f319c);
    }

    protected abstract void b(int i10, Object obj);

    public void c(int i10, l lVar, Object obj) {
        d(i10, lVar, obj, 0L);
    }

    public void d(int i10, l lVar, Object obj, long j10) {
        Message messageObtainMessage = this.f320a.obtainMessage(i10);
        a aVar = new a();
        aVar.f324c = lVar;
        aVar.f323b = obj;
        messageObtainMessage.obj = aVar;
        this.f320a.sendMessageDelayed(messageObtainMessage, j10);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        int i10 = message.what;
        Object obj = ((a) message.obj).f322a;
        WeakReference weakReference = this.f321b;
        if (weakReference != null) {
            android.support.v4.media.session.b.a(weakReference.get());
            this.f321b = null;
        }
        b(i10, obj);
    }
}
