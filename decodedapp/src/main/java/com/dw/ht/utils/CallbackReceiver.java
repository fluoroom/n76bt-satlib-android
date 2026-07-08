package com.dw.ht.utils;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import v4.g;

/* JADX INFO: loaded from: classes.dex */
public class CallbackReceiver extends BroadcastReceiver {

    public enum a {
        UNKNOWN,
        DISCONNECT_AUDIO_LINK;

        public static a d(int i10) {
            return (i10 < 0 || i10 >= values().length) ? UNKNOWN : values()[i10];
        }
    }

    public static PendingIntent a(Context context, a aVar) {
        Intent intent = new Intent(context, (Class<?>) CallbackReceiver.class);
        intent.putExtra("AID", aVar.ordinal());
        intent.setData(Uri.parse(intent.toUri(1)));
        return PendingIntent.getBroadcast(context, 0, intent, 67108864);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (a.d(intent.getIntExtra("AID", 0)).ordinal() != 1) {
            return;
        }
        g.y1().O(true);
    }
}
