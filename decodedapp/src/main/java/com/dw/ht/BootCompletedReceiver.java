package com.dw.ht;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.dw.ht.Cfg;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/dw/ht/BootCompletedReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Ldd/d0;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BootCompletedReceiver extends BroadcastReceiver {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void b() {
        Main main = Main.f5555g;
        if (main != null) {
            main.i();
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        rd.m.e(context, "context");
        rd.m.e(intent, "intent");
        if (Cfg.f5482d) {
            return;
        }
        boolean zA = rd.m.a("android.intent.action.BOOT_COMPLETED", intent.getAction());
        Cfg.Settings settingsO = Cfg.O();
        s3.b.b("BootCompletedReceiver", "runAtSystemStartup:" + settingsO.runAtSystemStartup + " isBoot:" + zA);
        if (settingsO.runAtSystemStartup && zA) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.dw.ht.j
            @Override // java.lang.Runnable
            public final void run() {
                BootCompletedReceiver.b();
            }
        });
    }
}
