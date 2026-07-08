package b8;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c f3738b = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f3739a = null;

    public static b a(Context context) {
        return f3738b.b(context);
    }

    public final synchronized b b(Context context) {
        try {
            if (this.f3739a == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                this.f3739a = new b(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f3739a;
    }
}
