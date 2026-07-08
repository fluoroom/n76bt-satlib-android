package a0;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static final Class f6a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final Field f7b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected static final Field f8c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected static final Method f9d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected static final Method f10e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected static final Method f11f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Handler f12g = new Handler(Looper.getMainLooper());

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C0003d f13a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f14b;

        a(C0003d c0003d, Object obj) {
            this.f13a = c0003d;
            this.f14b = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f13a.f19a = this.f14b;
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Application f15a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C0003d f16b;

        b(Application application, C0003d c0003d) {
            this.f15a = application;
            this.f16b = c0003d;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f15a.unregisterActivityLifecycleCallbacks(this.f16b);
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f17a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f18b;

        c(Object obj, Object obj2) {
            this.f17a = obj;
            this.f18b = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = d.f9d;
                if (method != null) {
                    method.invoke(this.f17a, this.f18b, Boolean.FALSE, "AppCompat recreation");
                } else {
                    d.f10e.invoke(this.f17a, this.f18b, Boolean.FALSE);
                }
            } catch (RuntimeException e10) {
                if (e10.getClass() == RuntimeException.class && e10.getMessage() != null && e10.getMessage().startsWith("Unable to stop")) {
                    throw e10;
                }
            } catch (Throwable th2) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th2);
            }
        }
    }

    static {
        Class clsA = a();
        f6a = clsA;
        f7b = b();
        f8c = f();
        f9d = d(clsA);
        f10e = c(clsA);
        f11f = e(clsA);
    }

    private static Class a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method c(Class cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method d(Class cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method e(Class cls) {
        if (g() && cls != null) {
            try {
                Class<?> cls2 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls2, Configuration.class, Configuration.class, cls2, cls2);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static Field f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean g() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 == 26 || i10 == 27;
    }

    protected static boolean h(Object obj, int i10, Activity activity) {
        try {
            Object obj2 = f8c.get(activity);
            if (obj2 == obj && activity.hashCode() == i10) {
                f12g.postAtFrontOfQueue(new c(f7b.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th2) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th2);
            return false;
        }
    }

    static boolean i(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (g() && f11f == null) {
            return false;
        }
        if (f10e == null && f9d == null) {
            return false;
        }
        try {
            Object obj2 = f8c.get(activity);
            if (obj2 == null || (obj = f7b.get(activity)) == null) {
                return false;
            }
            Application application = activity.getApplication();
            C0003d c0003d = new C0003d(activity);
            application.registerActivityLifecycleCallbacks(c0003d);
            Handler handler = f12g;
            handler.post(new a(c0003d, obj2));
            try {
                if (g()) {
                    Method method = f11f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                handler.post(new b(application, c0003d));
                return true;
            } catch (Throwable th2) {
                f12g.post(new b(application, c0003d));
                throw th2;
            }
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a0.d$d, reason: collision with other inner class name */
    private static final class C0003d implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f19a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Activity f20b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f21c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f22d = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f23e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f24f = false;

        C0003d(Activity activity) {
            this.f20b = activity;
            this.f21c = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f20b == activity) {
                this.f20b = null;
                this.f23e = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f23e || this.f24f || this.f22d || !d.h(this.f19a, this.f21c, activity)) {
                return;
            }
            this.f24f = true;
            this.f19a = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f20b == activity) {
                this.f22d = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }
}
