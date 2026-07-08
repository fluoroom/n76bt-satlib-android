package bh;

import android.content.ComponentName;
import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f4058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference f4059b = new AtomicReference();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CountDownLatch f4060c = new CountDownLatch(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private p.b f4061d;

    class a extends p.b {
        a() {
        }

        private void c(p.a aVar) {
            i.this.f4059b.set(aVar);
            i.this.f4060c.countDown();
        }

        @Override // p.b
        public void a(ComponentName componentName, p.a aVar) {
            dh.a.a("CustomTabsService is connected", new Object[0]);
            aVar.b(0L);
            c(aVar);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            dh.a.a("CustomTabsService is disconnected", new Object[0]);
            c(null);
        }
    }

    public i(Context context) {
        this.f4058a = new WeakReference(context);
    }

    public synchronized void c(String str) {
        try {
            if (this.f4061d != null) {
                return;
            }
            this.f4061d = new a();
            Context context = (Context) this.f4058a.get();
            if (context == null || !p.a.a(context, str, this.f4061d)) {
                dh.a.e("Unable to bind custom tabs service", new Object[0]);
                this.f4060c.countDown();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void d() {
        try {
            if (this.f4061d == null) {
                return;
            }
            Context context = (Context) this.f4058a.get();
            if (context != null) {
                context.unbindService(this.f4061d);
            }
            this.f4059b.set(null);
            dh.a.a("CustomTabsService is disconnected", new Object[0]);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
