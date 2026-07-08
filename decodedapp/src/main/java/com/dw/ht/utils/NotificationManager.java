package com.dw.ht.utils;

import a0.k;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.benshikj.ht.R;
import com.dw.ht.BTActivity;
import com.dw.ht.activitys.IncomingActivity;
import com.dw.ht.activitys.MessageListActivity;
import com.dw.ht.alarms.AlarmService;
import d5.g;
import java.util.Collection;
import k4.b;
import kotlin.Metadata;
import l3.e;
import rd.m;
import v3.j;
import v4.l1;
import v4.u;
import v4.v;

/* JADX INFO: loaded from: classes.dex */
public final class NotificationManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final NotificationManager f6876a = new NotificationManager();

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/dw/ht/utils/NotificationManager$Receiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Ldd/d0;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Receiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            m.e(context, "context");
            m.e(intent, "intent");
            int intExtra = intent.getIntExtra("action", 0);
            g gVarJ = g.j(context.getContentResolver(), intent.getLongExtra("android.intent.extra.UID", 0L));
            NotificationManager.f6876a.a(context, intent.getStringExtra("android.intent.extra.TITLE"));
            if (gVarJ != null) {
                AlarmService.l(context, new b(gVarJ));
            }
            Collection<l1> collectionA = u.w().A();
            m.d(collectionA, "getLinks(...)");
            for (l1 l1Var : collectionA) {
                if (l1Var.n()) {
                    l1Var.a(v.STOP_RINGING, new byte[0]);
                }
            }
            if (intExtra == 0) {
                j.e(context, new Intent(context, (Class<?>) BTActivity.class));
            }
        }
    }

    private NotificationManager() {
    }

    private final PendingIntent b(Context context, int i10, g gVar) {
        Intent intent = new Intent();
        intent.putExtra("android.intent.extra.TITLE", gVar.f10599a);
        intent.putExtra("android.intent.extra.UID", gVar.f10611m);
        intent.putExtra("action", i10);
        intent.setData(Uri.parse(intent.toUri(1)));
        if (i10 != 0) {
            intent.setClass(context, Receiver.class);
            return PendingIntent.getBroadcast(context, 0, intent, 67108864);
        }
        intent.setClass(context, BTActivity.class);
        intent.setAction(BTActivity.INSTANCE.a());
        return PendingIntent.getActivity(context, 0, intent, 67108864);
    }

    public final void a(Context context, String str) {
        m.e(context, "context");
        Object systemService = context.getSystemService("notification");
        m.c(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        android.app.NotificationManager notificationManager = (android.app.NotificationManager) systemService;
        if (str != null && str.length() == 0) {
            notificationManager.cancel(null, 2131231106);
            notificationManager.cancel(null, R.drawable.ic_stat_alarm);
        }
        notificationManager.cancel(str, 2131231106);
        notificationManager.cancel(str, R.drawable.ic_stat_alarm);
    }

    public final void c(Context context, g gVar) {
        m.e(context, "context");
        m.e(gVar, "session");
        Object systemService = context.getSystemService("notification");
        m.c(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        String string = context.getString(R.string.alarmFrom, gVar.f10599a);
        m.d(string, "getString(...)");
        PendingIntent pendingIntentB = b(context, 0, gVar);
        Intent intent = new Intent(context, (Class<?>) IncomingActivity.class);
        intent.putExtra("android.intent.extra.TEXT", string);
        intent.putExtra("android.intent.extra.TITLE", gVar.f10599a);
        intent.putExtra("android.intent.extra.UID", gVar.f10611m);
        intent.setData(Uri.parse(intent.toUri(1)));
        Notification notificationC = new k.d(context, "call").s(R.drawable.ic_stat_alarm).k(string).q(1).n(PendingIntent.getActivity(context, 0, intent, 67108864), true).i(pendingIntentB).p(true).v(System.currentTimeMillis()).a(2131230945, context.getString(R.string.ignore), b(context, 1, gVar)).c();
        m.d(notificationC, "build(...)");
        ((android.app.NotificationManager) systemService).notify(gVar.f10599a, R.drawable.ic_stat_alarm, notificationC);
    }

    public final void d(Context context, g gVar) {
        m.e(context, "context");
        m.e(gVar, "session");
        Object systemService = context.getSystemService("notification");
        m.c(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        String string = context.getString(R.string.callFrom, gVar.f10599a);
        m.d(string, "getString(...)");
        PendingIntent pendingIntentB = b(context, 0, gVar);
        Intent intent = new Intent(context, (Class<?>) IncomingActivity.class);
        intent.putExtra("android.intent.extra.TEXT", string);
        intent.putExtra("android.intent.extra.TITLE", gVar.f10599a);
        intent.putExtra("android.intent.extra.UID", gVar.f10611m);
        intent.setData(Uri.parse(intent.toUri(1)));
        Notification notificationC = new k.d(context, "call").s(2131231106).k(string).q(1).n(PendingIntent.getActivity(context, 0, intent, 67108864), true).i(pendingIntentB).p(true).v(System.currentTimeMillis()).a(2131230945, context.getString(R.string.ignore), b(context, 1, gVar)).c();
        m.d(notificationC, "build(...)");
        ((android.app.NotificationManager) systemService).notify(gVar.f10599a, 2131231106, notificationC);
    }

    public final void e(Context context) {
        m.e(context, "context");
        Object systemService = context.getSystemService("notification");
        m.c(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        android.app.NotificationManager notificationManager = (android.app.NotificationManager) systemService;
        g[] gVarArrM = g.m(context.getContentResolver());
        if (gVarArrM == null || gVarArrM.length == 0) {
            notificationManager.cancel(2131231111);
            return;
        }
        k.e eVar = new k.e("");
        for (g gVar : gVarArrM) {
            eVar.h(gVar.f10610l, gVar.f10612n, gVar.f10599a);
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.putExtra("com.dw.ht.intent.extras.DEV_ID", gVarArrM[0].f10633q);
        intent.putExtra("com.dw.ht.intent.extras.DATA_ID", gVarArrM[0].f10611m);
        intent.putExtra("com.dw.ht.intent.extras.TO", gVarArrM[0].f10599a);
        intent.setClass(context, MessageListActivity.class);
        intent.setData(Uri.parse(intent.toUri(1)));
        Notification notificationC = new k.d(context, e.f20373a).l(-1).s(2131231111).k(context.getString(R.string.message_count_notification, String.valueOf(gVarArrM.length))).i(PendingIntent.getActivity(context, 0, intent, 67108864)).t(eVar).g(true).c();
        m.d(notificationC, "build(...)");
        notificationManager.notify(2131231111, notificationC);
    }
}
