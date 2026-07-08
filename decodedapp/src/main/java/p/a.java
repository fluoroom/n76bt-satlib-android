package p;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a.a f23837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ComponentName f23838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f23839c;

    a(a.a aVar, ComponentName componentName, Context context) {
        this.f23837a = aVar;
        this.f23838b = componentName;
        this.f23839c = context;
    }

    public static boolean a(Context context, String str, b bVar) {
        bVar.b(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, bVar, 33);
    }

    public boolean b(long j10) {
        try {
            return this.f23837a.t0(j10);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
