package com.dw.ht.activitys;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.appcompat.widget.RtlSpacingHelper;

/* JADX INFO: loaded from: classes.dex */
public class a extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC0085a f5618a;

    /* JADX INFO: renamed from: com.dw.ht.activitys.a$a, reason: collision with other inner class name */
    public interface InterfaceC0085a {
        void O();

        void j();
    }

    public a(InterfaceC0085a interfaceC0085a) {
        this.f5618a = interfaceC0085a;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
            int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", RtlSpacingHelper.UNDEFINED);
            if (intExtra == 10) {
                this.f5618a.O();
            } else if (intExtra == 12) {
                this.f5618a.j();
            }
        }
    }
}
