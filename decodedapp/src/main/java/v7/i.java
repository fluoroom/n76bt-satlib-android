package v7;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f30408a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f30409b = 9;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static n1 f30410c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static HandlerThread f30411d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Executor f30412e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f30413f = false;

    public static i a(Context context) {
        synchronized (f30408a) {
            try {
                if (f30410c == null) {
                    f30410c = new n1(context.getApplicationContext(), f30413f ? b().getLooper() : context.getMainLooper(), f30412e);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f30410c;
    }

    public static HandlerThread b() {
        synchronized (f30408a) {
            try {
                HandlerThread handlerThread = f30411d;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", f30409b);
                f30411d = handlerThread2;
                handlerThread2.start();
                return f30411d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected abstract s7.a c(j1 j1Var, ServiceConnection serviceConnection, String str, Executor executor);

    protected abstract void d(j1 j1Var, ServiceConnection serviceConnection, String str);

    public final void e(String str, String str2, int i10, ServiceConnection serviceConnection, String str3, boolean z10) {
        d(new j1(str, str2, 4225, z10), serviceConnection, str3);
    }
}
