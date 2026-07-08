package jb;

import android.text.TextUtils;
import android.util.Log;
import jb.f;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static a f18582c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f18583d = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f18584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected c f18585b;

    private a() {
    }

    private String a(String str) {
        return TextUtils.isEmpty(str) ? "" : f.a(str) ? "xxxxxx" : str;
    }

    private void c() {
        this.f18585b = new c(new d(e.f18621m, e.f18615g, e.f18616h, e.f18611c, e.f18617i, 10, e.f18613e, e.f18622n));
    }

    public static final void d(String str, String str2) {
        h().b(2, str, str2, null);
    }

    public static final void e(String str, String str2, Throwable th2) {
        h().b(2, str, str2, th2);
    }

    public static final void f(String str, String str2) {
        h().b(16, str, str2, null);
    }

    public static final void g(String str, String str2, Throwable th2) {
        h().b(16, str, str2, th2);
    }

    public static a h() {
        if (f18582c == null) {
            synchronized (a.class) {
                try {
                    if (f18582c == null) {
                        a aVar = new a();
                        f18582c = aVar;
                        aVar.c();
                        f18583d = true;
                    }
                } finally {
                }
            }
        }
        return f18582c;
    }

    public static final void i(String str, String str2) {
        h().b(4, str, str2, null);
    }

    public static final void j(String str, String str2) {
        h().b(1, str, str2, null);
    }

    public static final void k(String str, String str2, Throwable th2) {
        h().b(1, str, str2, th2);
    }

    public static final void l(String str, String str2) {
        h().b(8, str, str2, null);
    }

    protected void b(int i10, String str, String str2, Throwable th2) {
        if (f18583d) {
            String strD = kb.f.d();
            if (!TextUtils.isEmpty(strD)) {
                String str3 = strD + " SDK_VERSION:3.5.17.lite";
                if (this.f18585b == null) {
                    return;
                }
                g.f18624d.b(32, Thread.currentThread(), System.currentTimeMillis(), "openSDK_LOG", str3, null);
                this.f18585b.b(32, Thread.currentThread(), System.currentTimeMillis(), "openSDK_LOG", str3, null);
                f18583d = false;
            }
        }
        g.f18624d.b(i10, Thread.currentThread(), System.currentTimeMillis(), str, str2, th2);
        if (f.a.a(e.f18610b, i10)) {
            c cVar = this.f18585b;
            if (cVar == null) {
                return;
            } else {
                cVar.b(i10, Thread.currentThread(), System.currentTimeMillis(), str, str2, th2);
            }
        }
        b bVar = this.f18584a;
        if (bVar != null) {
            try {
                bVar.b(i10, Thread.currentThread(), System.currentTimeMillis(), str, a(str2), th2);
            } catch (Exception e10) {
                Log.e(str, "Exception", e10);
            }
        }
    }
}
