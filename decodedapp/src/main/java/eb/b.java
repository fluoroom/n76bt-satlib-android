package eb;

import android.content.SharedPreferences;
import android.util.Base64;
import kb.f;
import kb.k;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static SharedPreferences f11727g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f11728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f11729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f11730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f11731d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f11732e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private kb.c f11733f;

    class a extends Thread {
        a() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            b.this.c("create");
        }
    }

    public b(String str) {
        this.f11728a = str;
        try {
            new a().start();
        } catch (Exception unused) {
        }
    }

    private static synchronized SharedPreferences a() {
        try {
            if (f11727g == null) {
                f11727g = f.a().getSharedPreferences("token_info_file", 0);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f11727g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void c(String str) {
        if (this.f11733f == null) {
            jb.a.i("openSDK_LOG.QQToken", "initAESUtils " + str);
            this.f11733f = new kb.c(f.a());
            jb.a.i("openSDK_LOG.QQToken", "initAESUtils " + str + " end");
        }
    }

    private static String d(String str) {
        return Base64.encodeToString(k.u(str), 2) + "_aes_google";
    }

    private static String e(String str) {
        return Base64.encodeToString(k.u(str), 2) + "_spkey";
    }

    public String f() {
        return this.f11729b;
    }

    public String g() {
        return this.f11728a;
    }

    public String h() {
        return this.f11730c;
    }

    public void i(String str) {
        SharedPreferences.Editor editorEdit = a().edit();
        editorEdit.remove(e(str));
        editorEdit.remove(e(str));
        editorEdit.remove(d(str));
        editorEdit.apply();
        jb.a.i("openSDK_LOG.QQToken", "removeSession sucess");
    }

    public void j(String str, String str2) {
        this.f11729b = str;
        this.f11732e = 0L;
        if (str2 != null) {
            this.f11732e = System.currentTimeMillis() + (Long.parseLong(str2) * 1000);
        }
    }

    public void k(String str) {
        this.f11730c = str;
        ib.b.a().d(str);
    }
}
