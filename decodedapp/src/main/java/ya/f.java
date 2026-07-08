package ya;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import dd.d0;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f32462a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Application f32463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f32464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static WeakReference f32465d;

    public static final class a implements Application.ActivityLifecycleCallbacks {
        a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            m.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            m.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            m.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            m.e(activity, "activity");
            WeakReference weakReference = f.f32465d;
            if (weakReference != null) {
                weakReference.clear();
            }
            f.f32465d = new WeakReference(activity);
            f.f32462a.h(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            m.e(activity, "activity");
            m.e(bundle, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            m.e(activity, "activity");
            f.f32464c++;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            m.e(activity, "activity");
            f.f32464c--;
            f.f32462a.g(activity);
        }
    }

    private f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(Activity activity) {
        WindowManager.LayoutParams layoutParamsS;
        IBinder iBinder;
        View decorView;
        if (activity.isFinishing() || !j()) {
            Iterator it = sa.e.f27124a.f().entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                sa.d dVar = (sa.d) entry.getValue();
                if (activity.isFinishing() && (layoutParamsS = dVar.s()) != null && (iBinder = layoutParamsS.token) != null) {
                    Window window = activity.getWindow();
                    if (m.a(iBinder, (window == null || (decorView = window.getDecorView()) == null) ? null : decorView.getWindowToken())) {
                        sa.e.f27124a.c(str, true);
                    }
                }
                ta.a aVarQ = dVar.q();
                f fVar = f32462a;
                if (!fVar.j() && dVar.q().x() != ua.a.f28999a) {
                    fVar.m(aVarQ.x() != ua.a.f29000b && aVarQ.u(), str);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(Activity activity) {
        Iterator it = sa.e.f27124a.f().entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            ta.a aVarQ = ((sa.d) entry.getValue()).q();
            if (aVarQ.x() != ua.a.f28999a) {
                if (aVarQ.x() == ua.a.f29001c) {
                    f32462a.m(false, str);
                } else if (aVarQ.u()) {
                    f32462a.m(!aVarQ.f().contains(activity.getComponentName().getClassName()), str);
                }
            }
        }
    }

    private final d0 m(boolean z10, String str) {
        return sa.e.i(sa.e.f27124a, z10, str, false, 4, null);
    }

    public final Activity i() {
        WeakReference weakReference = f32465d;
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }

    public final boolean j() {
        return f32464c > 0;
    }

    public final void k(Application application) {
        m.e(application, "<set-?>");
        f32463b = application;
    }

    public final void l(Application application) {
        m.e(application, "application");
        k(application);
        application.registerActivityLifecycleCallbacks(new a());
    }
}
