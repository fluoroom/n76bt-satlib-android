package v3;

import android.app.Activity;
import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static WeakReference f29570a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static WeakReference f29571b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f29572c = false;

    public static Activity b(Context context) {
        Activity activity;
        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        WeakReference weakReference = f29570a;
        return (weakReference == null || (activity = (Activity) weakReference.get()) == null) ? c() : activity;
    }

    public static Activity c() {
        WeakReference weakReference = f29571b;
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }

    public static void d(Application application) {
        if (f29572c) {
            return;
        }
        f29572c = true;
        application.registerActivityLifecycleCallbacks(new a());
    }

    public static boolean e(Context context, Intent intent) {
        Activity activityB = b(context);
        if (activityB != null) {
            context = activityB;
        }
        intent.addFlags(activityB != null ? 0 : 268468224);
        try {
            context.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(context, k3.j.f19241i, 1).show();
            return false;
        } catch (SecurityException e10) {
            Toast.makeText(context, "Security Exception", 1).show();
            e10.printStackTrace();
            return false;
        }
    }

    public static boolean f(androidx.fragment.app.o oVar, Intent intent) {
        try {
            oVar.O3(intent);
            return true;
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(oVar.e1(), k3.j.f19241i, 1).show();
            return false;
        } catch (SecurityException unused2) {
            Toast.makeText(oVar.e1(), "Security Exception", 1).show();
            return false;
        }
    }

    public static boolean g(Activity activity, Intent intent, int i10) {
        try {
            activity.startActivityForResult(intent, i10);
            return true;
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(activity, k3.j.f19241i, 1).show();
            return false;
        } catch (SecurityException unused2) {
            Toast.makeText(activity, "Security Exception", 1).show();
            return false;
        }
    }

    class a implements Application.ActivityLifecycleCallbacks {
        a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            j.f29571b = new WeakReference(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
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
