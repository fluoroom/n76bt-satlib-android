package wa;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.util.Log;
import rd.m;
import xa.d;
import xa.e;
import xa.f;
import ya.g;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f31375a = new c();

    private c() {
    }

    public static final boolean a(Context context) {
        m.e(context, "context");
        if (Build.VERSION.SDK_INT >= 23) {
            return f31375a.d(context);
        }
        f fVar = f.f31845a;
        if (fVar.b()) {
            return f31375a.e(context);
        }
        if (fVar.d()) {
            return f31375a.g(context);
        }
        if (fVar.e()) {
            return f31375a.h(context);
        }
        if (fVar.c()) {
            return f31375a.f(context);
        }
        if (fVar.a()) {
            return f31375a.i(context);
        }
        return true;
    }

    private final void b(Fragment fragment) {
        if (f.f31845a.c()) {
            xa.b.a(fragment);
            return;
        }
        if (Build.VERSION.SDK_INT < 23) {
            g.f32466a.a("PermissionUtils--->", "user manually refuse OVERLAY_PERMISSION");
            return;
        }
        try {
            c(fragment);
        } catch (Exception e10) {
            g gVar = g.f32466a;
            String stackTraceString = Log.getStackTraceString(e10);
            m.d(stackTraceString, "getStackTraceString(...)");
            gVar.c("PermissionUtils--->", stackTraceString);
        }
    }

    public static final void c(Fragment fragment) {
        m.e(fragment, "fragment");
        try {
            Intent intent = new Intent(Settings.class.getDeclaredField("ACTION_MANAGE_OVERLAY_PERMISSION").get(null).toString());
            intent.setData(Uri.parse("package:" + fragment.getActivity().getPackageName()));
            fragment.startActivityForResult(intent, 199);
        } catch (Exception e10) {
            g.f32466a.c("PermissionUtils--->", String.valueOf(e10));
        }
    }

    private final boolean d(Context context) {
        if (f.f31845a.c()) {
            return f(context);
        }
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        try {
            Object objInvoke = Settings.class.getDeclaredMethod("canDrawOverlays", Context.class).invoke(null, context);
            m.c(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
            return ((Boolean) objInvoke).booleanValue();
        } catch (Exception e10) {
            Log.e("PermissionUtils--->", Log.getStackTraceString(e10));
            return true;
        }
    }

    private final boolean e(Context context) {
        return xa.a.b(context);
    }

    private final boolean f(Context context) {
        return xa.b.b(context);
    }

    private final boolean g(Context context) {
        return xa.c.b(context);
    }

    private final boolean h(Context context) {
        return d.b(context);
    }

    private final boolean i(Context context) {
        return e.b(context);
    }

    public static final void j(Activity activity, va.g gVar) {
        m.e(activity, "activity");
        m.e(gVar, "onPermissionResult");
        b.f31373a.a(activity, gVar);
    }

    public final void k(Fragment fragment) {
        m.e(fragment, "fragment");
        if (Build.VERSION.SDK_INT >= 23) {
            b(fragment);
            return;
        }
        f fVar = f.f31845a;
        if (fVar.b()) {
            xa.a.a(fragment);
            return;
        }
        if (fVar.d()) {
            xa.c.a(fragment);
            return;
        }
        if (fVar.e()) {
            d.a(fragment);
            return;
        }
        if (fVar.c()) {
            xa.b.a(fragment);
        } else if (fVar.a()) {
            e.a(fragment);
        } else {
            g.f32466a.e("PermissionUtils--->", "原生 Android 6.0 以下无需权限申请");
        }
    }
}
