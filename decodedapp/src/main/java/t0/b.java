package t0;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final ThreadLocal f27391j = new ThreadLocal();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private h f27396e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public e f27400i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.collection.i f27392a = new androidx.collection.i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ArrayList f27393b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C0381b f27394c = new C0381b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Runnable f27395d = new Runnable() { // from class: t0.a
        @Override // java.lang.Runnable
        public final void run() {
            this.f27390a.f27394c.a();
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    long f27397f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f27398g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f27399h = 1.0f;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0.b$b, reason: collision with other inner class name */
    class C0381b {
        private C0381b() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a() {
            b.this.f27397f = SystemClock.uptimeMillis();
            b bVar = b.this;
            bVar.f(bVar.f27397f);
            if (b.this.f27393b.size() > 0) {
                b.this.f27396e.a(b.this.f27395d);
            }
        }
    }

    interface c {
        boolean a(long j10);
    }

    public class d implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ValueAnimator.DurationScaleChangeListener f27402a;

        public d() {
        }

        @Override // t0.b.e
        public boolean a() {
            if (this.f27402a != null) {
                return true;
            }
            ValueAnimator.DurationScaleChangeListener durationScaleChangeListener = new ValueAnimator.DurationScaleChangeListener() { // from class: t0.c
                @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                public final void onChanged(float f10) {
                    b.this.f27399h = f10;
                }
            };
            this.f27402a = durationScaleChangeListener;
            return ValueAnimator.registerDurationScaleChangeListener(durationScaleChangeListener);
        }

        @Override // t0.b.e
        public boolean b() {
            boolean zUnregisterDurationScaleChangeListener = ValueAnimator.unregisterDurationScaleChangeListener(this.f27402a);
            this.f27402a = null;
            return zUnregisterDurationScaleChangeListener;
        }
    }

    public interface e {
        boolean a();

        boolean b();
    }

    static final class f implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Choreographer f27404a = Choreographer.getInstance();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Looper f27405b = Looper.myLooper();

        f() {
        }

        @Override // t0.h
        public void a(final Runnable runnable) {
            this.f27404a.postFrameCallback(new Choreographer.FrameCallback() { // from class: t0.d
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j10) {
                    runnable.run();
                }
            });
        }

        @Override // t0.h
        public boolean b() {
            return Thread.currentThread() == this.f27405b.getThread();
        }
    }

    public b(h hVar) {
        this.f27396e = hVar;
    }

    private void e() {
        if (this.f27398g) {
            for (int size = this.f27393b.size() - 1; size >= 0; size--) {
                if (this.f27393b.get(size) == null) {
                    this.f27393b.remove(size);
                }
            }
            if (this.f27393b.size() == 0 && Build.VERSION.SDK_INT >= 33) {
                this.f27400i.b();
            }
            this.f27398g = false;
        }
    }

    static b h() {
        ThreadLocal threadLocal = f27391j;
        if (threadLocal.get() == null) {
            threadLocal.set(new b(new f()));
        }
        return (b) threadLocal.get();
    }

    private boolean i(c cVar, long j10) {
        Long l10 = (Long) this.f27392a.get(cVar);
        if (l10 == null) {
            return true;
        }
        if (l10.longValue() >= j10) {
            return false;
        }
        this.f27392a.remove(cVar);
        return true;
    }

    void d(c cVar, long j10) {
        if (this.f27393b.size() == 0) {
            this.f27396e.a(this.f27395d);
            if (Build.VERSION.SDK_INT >= 33) {
                this.f27399h = ValueAnimator.getDurationScale();
                if (this.f27400i == null) {
                    this.f27400i = new d();
                }
                this.f27400i.a();
            }
        }
        if (!this.f27393b.contains(cVar)) {
            this.f27393b.add(cVar);
        }
        if (j10 > 0) {
            this.f27392a.put(cVar, Long.valueOf(SystemClock.uptimeMillis() + j10));
        }
    }

    void f(long j10) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        for (int i10 = 0; i10 < this.f27393b.size(); i10++) {
            c cVar = (c) this.f27393b.get(i10);
            if (cVar != null && i(cVar, jUptimeMillis)) {
                cVar.a(j10);
            }
        }
        e();
    }

    public float g() {
        return this.f27399h;
    }

    boolean j() {
        return this.f27396e.b();
    }

    void k(c cVar) {
        this.f27392a.remove(cVar);
        int iIndexOf = this.f27393b.indexOf(cVar);
        if (iIndexOf >= 0) {
            this.f27393b.set(iIndexOf, null);
            this.f27398g = true;
        }
    }
}
