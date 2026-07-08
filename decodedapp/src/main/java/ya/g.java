package ya;

import android.util.Log;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f32466a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f32467b = "EasyFloat--->";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f32468c = true;

    private g() {
    }

    public final void a(String str, String str2) {
        m.e(str, "tag");
        m.e(str2, "msg");
        if (f32468c) {
            Log.d(str, str2);
        }
    }

    public final void b(Object obj) {
        m.e(obj, "msg");
        c(f32467b, obj.toString());
    }

    public final void c(String str, String str2) {
        m.e(str, "tag");
        m.e(str2, "msg");
        if (f32468c) {
            Log.e(str, str2);
        }
    }

    public final void d(Object obj) {
        m.e(obj, "msg");
        e(f32467b, obj.toString());
    }

    public final void e(String str, String str2) {
        m.e(str, "tag");
        m.e(str2, "msg");
        if (f32468c) {
            Log.i(str, str2);
        }
    }

    public final void f(Object obj) {
        m.e(obj, "msg");
        g(f32467b, obj.toString());
    }

    public final void g(String str, String str2) {
        m.e(str, "tag");
        m.e(str2, "msg");
        if (f32468c) {
            Log.w(str, str2);
        }
    }
}
