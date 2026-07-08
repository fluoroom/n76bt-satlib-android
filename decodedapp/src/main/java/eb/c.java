package eb;

import android.content.Context;
import android.content.SharedPreferences;
import kb.f;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f11735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f11736b;

    private c(String str, Context context) {
        jb.a.i("openSDK_LOG.QQAuth", "new QQAuth() --start");
        this.f11736b = new b(str);
        this.f11735a = new a(this.f11736b);
        db.a.c(context, this.f11736b);
        b(context, "3.5.17.lite");
        jb.a.i("openSDK_LOG.QQAuth", "new QQAuth() --end");
    }

    public static c a(String str, Context context) {
        f.c(context.getApplicationContext());
        jb.a.i("openSDK_LOG.QQAuth", "QQAuth -- createInstance() --start");
        c cVar = new c(str, context);
        jb.a.i("openSDK_LOG.QQAuth", "QQAuth -- createInstance()  --end");
        return cVar;
    }

    public static void b(Context context, String str) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("BuglySdkInfos", 0).edit();
        editorEdit.putString("bcb3903995", str);
        editorEdit.apply();
    }

    public b c() {
        return this.f11736b;
    }
}
