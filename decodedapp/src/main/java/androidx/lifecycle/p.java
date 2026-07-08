package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f2669a = new p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicBoolean f2670b = new AtomicBoolean(false);

    public static final class a extends i {
        @Override // androidx.lifecycle.i, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            rd.m.e(activity, "activity");
            h0.INSTANCE.c(activity);
        }
    }

    private p() {
    }

    public static final void a(Context context) {
        rd.m.e(context, "context");
        if (f2670b.getAndSet(true)) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        rd.m.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new a());
    }
}
