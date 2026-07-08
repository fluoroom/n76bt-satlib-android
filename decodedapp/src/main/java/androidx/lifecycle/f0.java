package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.h0;
import androidx.lifecycle.m;

/* JADX INFO: loaded from: classes.dex */
public final class f0 implements t {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final b f2616r = new b(null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final f0 f2617s = new f0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f2618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f2619b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Handler f2622e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f2620c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f2621d = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final v f2623f = new v(this);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Runnable f2624g = new Runnable() { // from class: androidx.lifecycle.e0
        @Override // java.lang.Runnable
        public final void run() {
            f0.j(this.f2615a);
        }
    };

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final h0.a f2625h = new d();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f2626a = new a();

        private a() {
        }

        public static final void a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            rd.m.e(activity, "activity");
            rd.m.e(activityLifecycleCallbacks, "callback");
            activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }

    public static final class b {
        public /* synthetic */ b(rd.h hVar) {
            this();
        }

        public final t a() {
            return f0.f2617s;
        }

        public final void b(Context context) {
            rd.m.e(context, "context");
            f0.f2617s.i(context);
        }

        private b() {
        }
    }

    public static final class c extends i {

        public static final class a extends i {
            final /* synthetic */ f0 this$0;

            a(f0 f0Var) {
                this.this$0 = f0Var;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(Activity activity) {
                rd.m.e(activity, "activity");
                this.this$0.f();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(Activity activity) {
                rd.m.e(activity, "activity");
                this.this$0.g();
            }
        }

        c() {
        }

        @Override // androidx.lifecycle.i, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            rd.m.e(activity, "activity");
            if (Build.VERSION.SDK_INT < 29) {
                h0.INSTANCE.b(activity).e(f0.this.f2625h);
            }
        }

        @Override // androidx.lifecycle.i, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            rd.m.e(activity, "activity");
            f0.this.e();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            rd.m.e(activity, "activity");
            a.a(activity, new a(f0.this));
        }

        @Override // androidx.lifecycle.i, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            rd.m.e(activity, "activity");
            f0.this.h();
        }
    }

    public static final class d implements h0.a {
        d() {
        }

        @Override // androidx.lifecycle.h0.a
        public void b() {
            f0.this.g();
        }

        @Override // androidx.lifecycle.h0.a
        public void d() {
            f0.this.f();
        }

        @Override // androidx.lifecycle.h0.a
        public void e() {
        }
    }

    private f0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(f0 f0Var) {
        f0Var.k();
        f0Var.l();
    }

    @Override // androidx.lifecycle.t
    public m S0() {
        return this.f2623f;
    }

    public final void e() {
        int i10 = this.f2619b - 1;
        this.f2619b = i10;
        if (i10 == 0) {
            Handler handler = this.f2622e;
            rd.m.b(handler);
            handler.postDelayed(this.f2624g, 700L);
        }
    }

    public final void f() {
        int i10 = this.f2619b + 1;
        this.f2619b = i10;
        if (i10 == 1) {
            if (this.f2620c) {
                this.f2623f.i(m.a.ON_RESUME);
                this.f2620c = false;
            } else {
                Handler handler = this.f2622e;
                rd.m.b(handler);
                handler.removeCallbacks(this.f2624g);
            }
        }
    }

    public final void g() {
        int i10 = this.f2618a + 1;
        this.f2618a = i10;
        if (i10 == 1 && this.f2621d) {
            this.f2623f.i(m.a.ON_START);
            this.f2621d = false;
        }
    }

    public final void h() {
        this.f2618a--;
        l();
    }

    public final void i(Context context) {
        rd.m.e(context, "context");
        this.f2622e = new Handler();
        this.f2623f.i(m.a.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        rd.m.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new c());
    }

    public final void k() {
        if (this.f2619b == 0) {
            this.f2620c = true;
            this.f2623f.i(m.a.ON_PAUSE);
        }
    }

    public final void l() {
        if (this.f2618a == 0 && this.f2620c) {
            this.f2623f.i(m.a.ON_STOP);
            this.f2621d = true;
        }
    }
}
