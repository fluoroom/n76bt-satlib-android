package m2;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f20940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f20941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f20942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f20943d;

    public static final class a {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        static final int f20944i;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Context f20945a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ActivityManager f20946b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        c f20947c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        float f20949e;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f20948d = 2.0f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        float f20950f = 0.4f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        float f20951g = 0.33f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f20952h = 4194304;

        static {
            f20944i = Build.VERSION.SDK_INT < 26 ? 4 : 1;
        }

        public a(Context context) {
            this.f20949e = f20944i;
            this.f20945a = context;
            this.f20946b = (ActivityManager) context.getSystemService("activity");
            this.f20947c = new b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT < 26 || !i.e(this.f20946b)) {
                return;
            }
            this.f20949e = 0.0f;
        }

        public i a() {
            return new i(this);
        }
    }

    private static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final DisplayMetrics f20953a;

        b(DisplayMetrics displayMetrics) {
            this.f20953a = displayMetrics;
        }

        @Override // m2.i.c
        public int a() {
            return this.f20953a.heightPixels;
        }

        @Override // m2.i.c
        public int b() {
            return this.f20953a.widthPixels;
        }
    }

    interface c {
        int a();

        int b();
    }

    i(a aVar) {
        this.f20942c = aVar.f20945a;
        int i10 = e(aVar.f20946b) ? aVar.f20952h / 2 : aVar.f20952h;
        this.f20943d = i10;
        int iC = c(aVar.f20946b, aVar.f20950f, aVar.f20951g);
        float fB = aVar.f20947c.b() * aVar.f20947c.a() * 4;
        int iRound = Math.round(aVar.f20949e * fB);
        int iRound2 = Math.round(fB * aVar.f20948d);
        int i11 = iC - i10;
        int i12 = iRound2 + iRound;
        if (i12 <= i11) {
            this.f20941b = iRound2;
            this.f20940a = iRound;
        } else {
            float f10 = i11;
            float f11 = aVar.f20949e;
            float f12 = aVar.f20948d;
            float f13 = f10 / (f11 + f12);
            this.f20941b = Math.round(f12 * f13);
            this.f20940a = Math.round(f13 * aVar.f20949e);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Calculation complete, Calculated memory cache size: ");
            sb2.append(f(this.f20941b));
            sb2.append(", pool size: ");
            sb2.append(f(this.f20940a));
            sb2.append(", byte array size: ");
            sb2.append(f(i10));
            sb2.append(", memory class limited? ");
            sb2.append(i12 > iC);
            sb2.append(", max size: ");
            sb2.append(f(iC));
            sb2.append(", memoryClass: ");
            sb2.append(aVar.f20946b.getMemoryClass());
            sb2.append(", isLowMemoryDevice: ");
            sb2.append(e(aVar.f20946b));
            Log.d("MemorySizeCalculator", sb2.toString());
        }
    }

    private static int c(ActivityManager activityManager, float f10, float f11) {
        float memoryClass = activityManager.getMemoryClass() * 1048576;
        if (e(activityManager)) {
            f10 = f11;
        }
        return Math.round(memoryClass * f10);
    }

    static boolean e(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }

    private String f(int i10) {
        return Formatter.formatFileSize(this.f20942c, i10);
    }

    public int a() {
        return this.f20943d;
    }

    public int b() {
        return this.f20940a;
    }

    public int d() {
        return this.f20941b;
    }
}
