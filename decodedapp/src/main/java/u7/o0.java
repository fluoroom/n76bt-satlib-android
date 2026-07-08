package u7;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class o0 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Context f28484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n0 f28485b;

    public o0(n0 n0Var) {
        this.f28485b = n0Var;
    }

    public final void a(Context context) {
        this.f28484a = context;
    }

    public final synchronized void b() {
        try {
            Context context = this.f28484a;
            if (context != null) {
                context.unregisterReceiver(this);
            }
            this.f28484a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f28485b.a();
            b();
        }
    }
}
