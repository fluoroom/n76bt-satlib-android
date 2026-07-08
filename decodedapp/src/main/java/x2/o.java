package x2;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Message;
import r2.a0;

/* JADX INFO: loaded from: classes.dex */
public class o implements Handler.Callback {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final b f31563f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile com.bumptech.glide.m f31564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f31565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.collection.a f31566c = new androidx.collection.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i f31567d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final m f31568e;

    class a implements b {
        a() {
        }

        @Override // x2.o.b
        public com.bumptech.glide.m a(com.bumptech.glide.c cVar, j jVar, p pVar, Context context) {
            return new com.bumptech.glide.m(cVar, jVar, pVar, context);
        }
    }

    public interface b {
        com.bumptech.glide.m a(com.bumptech.glide.c cVar, j jVar, p pVar, Context context);
    }

    public o(b bVar) {
        bVar = bVar == null ? f31563f : bVar;
        this.f31565b = bVar;
        this.f31568e = new m(bVar);
        this.f31567d = b();
    }

    private static void a(Activity activity) {
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    private static i b() {
        return (a0.f25313f && a0.f25312e) ? new h() : new f();
    }

    private static Activity c(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return c(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    private com.bumptech.glide.m f(Context context) {
        if (this.f31564a == null) {
            synchronized (this) {
                try {
                    if (this.f31564a == null) {
                        this.f31564a = this.f31565b.a(com.bumptech.glide.c.c(context.getApplicationContext()), new x2.a(), new g(), context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return this.f31564a;
    }

    private static boolean g(Context context) {
        Activity activityC = c(context);
        return activityC == null || !activityC.isFinishing();
    }

    public com.bumptech.glide.m d(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (e3.l.r() && !(context instanceof Application)) {
            if (context instanceof androidx.fragment.app.p) {
                return e((androidx.fragment.app.p) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return d(contextWrapper.getBaseContext());
                }
            }
        }
        return f(context);
    }

    public com.bumptech.glide.m e(androidx.fragment.app.p pVar) {
        if (e3.l.q()) {
            return d(pVar.getApplicationContext());
        }
        a(pVar);
        this.f31567d.a(pVar);
        boolean zG = g(pVar);
        return this.f31568e.b(pVar, com.bumptech.glide.c.c(pVar.getApplicationContext()), pVar.S0(), pVar.N0(), zG);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        return false;
    }
}
