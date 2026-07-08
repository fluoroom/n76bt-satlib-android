package com.dw.ht.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import v4.u;

/* JADX INFO: loaded from: classes.dex */
public class BTStateMonitor extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent != null && intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 10) == 12) {
            u.I();
        }
    }
}
