package ya;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f32457a = new b();

    private b() {
    }

    public static /* synthetic */ Rect e(b bVar, Context context, WindowManager windowManager, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            windowManager = null;
        }
        return bVar.d(context, windowManager);
    }

    private final boolean j(Context context) {
        Object systemService = context.getSystemService("window");
        m.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        int i10 = displayMetrics.heightPixels;
        int i11 = displayMetrics.widthPixels;
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics2);
        int i12 = displayMetrics2.heightPixels;
        int i13 = displayMetrics2.widthPixels;
        if (c(context) + i12 > i10) {
            return false;
        }
        return i11 - i13 > 0 || i10 - i12 > 0;
    }

    private final boolean k(Context context) {
        return Settings.Global.getInt(context.getContentResolver(), "navigationbar_is_min", 0) != 0;
    }

    private final boolean m(Context context) {
        return Settings.Global.getInt(context.getContentResolver(), "force_fsg_nav_bar", 0) != 0;
    }

    private final boolean n(Context context) {
        return Settings.Secure.getInt(context.getContentResolver(), "navigation_gesture_on", 0) != 0;
    }

    public final int a(Context context, float f10) {
        m.e(context, "context");
        return (int) ((f10 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public final int b(Context context) {
        m.e(context, "context");
        if (i(context)) {
            return c(context);
        }
        return 0;
    }

    public final int c(Context context) {
        m.e(context, "context");
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public final Rect d(Context context, WindowManager windowManager) {
        m.e(context, "context");
        if (windowManager == null) {
            Object systemService = context.getSystemService("window");
            m.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            windowManager = (WindowManager) systemService;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            return new Rect(windowManager.getCurrentWindowMetrics().getBounds());
        }
        Rect rect = new Rect();
        windowManager.getDefaultDisplay().getRectSize(rect);
        return rect;
    }

    public final int f(Context context) {
        m.e(context, "context");
        return g(context).y;
    }

    public final Point g(Context context) {
        m.e(context, "context");
        Point point = new Point();
        Object systemService = context.getSystemService("window");
        m.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        ((WindowManager) systemService).getDefaultDisplay().getRealSize(point);
        return point;
    }

    public final int h(Context context) {
        m.e(context, "context");
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public final boolean i(Context context) {
        m.e(context, "context");
        if (c(context) == 0) {
            return false;
        }
        xa.f fVar = xa.f.f31845a;
        if (fVar.b() && k(context)) {
            return false;
        }
        if (fVar.d() && m(context)) {
            return false;
        }
        if (fVar.f() && n(context)) {
            return false;
        }
        return j(context);
    }

    public final boolean l(Context context) {
        m.e(context, "context");
        return context.getResources().getConfiguration().orientation == 2;
    }

    public final int o(View view) {
        m.e(view, "view");
        Context applicationContext = view.getContext().getApplicationContext();
        m.d(applicationContext, "getApplicationContext(...)");
        return h(applicationContext);
    }
}
