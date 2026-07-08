package v7;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public abstract class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f30326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f30327b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ c f30328c;

    public a1(c cVar, Object obj) {
        this.f30328c = cVar;
        this.f30326a = obj;
    }

    protected abstract void a(Object obj);

    protected abstract void b();

    public final void c() {
        Object obj;
        synchronized (this) {
            try {
                obj = this.f30326a;
                if (this.f30327b) {
                    Log.w("GmsClient", "Callback proxy " + toString() + " being reused. This is not safe.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (obj != null) {
            a(obj);
        }
        synchronized (this) {
            this.f30327b = true;
        }
        e();
    }

    public final void d() {
        synchronized (this) {
            this.f30326a = null;
        }
    }

    public final void e() {
        d();
        synchronized (this.f30328c.A) {
            this.f30328c.A.remove(this);
        }
    }
}
