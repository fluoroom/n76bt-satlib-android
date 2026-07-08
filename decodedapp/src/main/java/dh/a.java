package dh;

import ah.h;
import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static a f11094c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f11095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f11096b;

    /* JADX INFO: renamed from: dh.a$a, reason: collision with other inner class name */
    private static final class C0149a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final C0149a f11097a = new C0149a();

        private C0149a() {
        }

        @Override // dh.a.b
        public void a(int i10, String str, String str2) {
            Log.println(i10, str, str2);
        }

        @Override // dh.a.b
        public String b(Throwable th2) {
            return Log.getStackTraceString(th2);
        }

        @Override // dh.a.b
        public boolean isLoggable(String str, int i10) {
            return Log.isLoggable(str, i10);
        }
    }

    public interface b {
        void a(int i10, String str, String str2);

        String b(Throwable th2);

        boolean isLoggable(String str, int i10);
    }

    a(b bVar) {
        this.f11095a = (b) h.d(bVar);
        int i10 = 7;
        while (i10 >= 2 && this.f11095a.isLoggable("AppAuth", i10)) {
            i10--;
        }
        this.f11096b = i10 + 1;
    }

    public static void a(String str, Object... objArr) {
        d().f(3, null, str, objArr);
    }

    public static void b(Throwable th2, String str, Object... objArr) {
        d().f(3, th2, str, objArr);
    }

    public static void c(String str, Object... objArr) {
        d().f(6, null, str, objArr);
    }

    public static synchronized a d() {
        try {
            if (f11094c == null) {
                f11094c = new a(C0149a.f11097a);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f11094c;
    }

    public static void e(String str, Object... objArr) {
        d().f(4, null, str, objArr);
    }

    public static void g(String str, Object... objArr) {
        d().f(5, null, str, objArr);
    }

    public void f(int i10, Throwable th2, String str, Object... objArr) {
        if (this.f11096b > i10) {
            return;
        }
        if (objArr != null && objArr.length >= 1) {
            str = String.format(str, objArr);
        }
        if (th2 != null) {
            str = str + "\n" + this.f11095a.b(th2);
        }
        this.f11095a.a(i10, "AppAuth", str);
    }
}
