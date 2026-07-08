package com.dw.ht.ii;

import a0.k;
import a6.a0;
import a6.w;
import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.IBinder;
import android.os.SystemClock;
import android.util.Log;
import com.benshikj.ht.R;
import com.benshikj.ii.II;
import com.dw.ht.BTActivity;
import com.dw.ht.Main;
import com.dw.ht.l;
import d5.g;
import kotlin.Metadata;
import l3.e;
import l3.f;
import org.greenrobot.eventbus.ThreadMode;
import rd.h;
import rd.m;
import v4.n1;
import v4.u;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 /2\u00020\u0001:\u0003!01B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0003J)\u0010\u0018\u001a\u00020\u00152\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\u0003J\r\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u0003J\u0017\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u001e\u0010\u001fR\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010.\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010-¨\u00062"}, d2 = {"Lcom/dw/ht/ii/IIService;", "Lcom/dw/ht/l;", "<init>", "()V", "", "delayMillis", "Ldd/d0;", "l", "(J)V", "k", "Landroid/content/Intent;", "intent", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "Lg5/c;", "msg", "", "j", "(Lg5/c;)Z", "onCreate", "", "flags", "startId", "onStartCommand", "(Landroid/content/Intent;II)I", "f", "m", "Lv4/u$c;", "event", "onMessageEvent", "(Lv4/u$c;)V", "Landroid/app/AlarmManager;", "c", "Landroid/app/AlarmManager;", "alarmManager", "Landroid/app/PendingIntent;", "d", "Landroid/app/PendingIntent;", "sendHeartbeatOperation", "Lv4/u;", "e", "Lv4/u;", "cm", "Lv4/n1;", "Lv4/n1;", "currentLink", "g", "b", "a", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IIService extends l {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static IIService f6311h;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private AlarmManager alarmManager;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private PendingIntent sendHeartbeatOperation;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final u cm;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private n1 currentLink;

    /* JADX INFO: renamed from: com.dw.ht.ii.IIService$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(h hVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void e(IIService iIService) {
            if (m.a(IIService.f6311h, iIService)) {
                return;
            }
            IIService.f6311h = iIService;
            s3.b.b("IIService", "linked=" + b());
            mi.c.e().m(b.f6316a);
        }

        public final boolean b() {
            return IIService.f6311h != null;
        }

        public final void c() {
            Main main = Main.f5555g;
            m.d(main, "sMain");
            Intent intent = new Intent(main, (Class<?>) IIService.class);
            if (a.a() != null) {
                f.e(main, intent);
            } else {
                main.stopService(intent);
            }
        }

        public final boolean d(g5.c cVar) {
            m.e(cVar, "msg");
            IIService iIService = IIService.f6311h;
            if (iIService == null) {
                return false;
            }
            return iIService.j(cVar);
        }

        private Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f6316a = new b("LinkStatusChanged", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ b[] f6317b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ kd.a f6318c;

        static {
            b[] bVarArrA = a();
            f6317b = bVarArrA;
            f6318c = kd.b.a(bVarArrA);
        }

        private b(String str, int i10) {
        }

        private static final /* synthetic */ b[] a() {
            return new b[]{f6316a};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f6317b.clone();
        }
    }

    public final class c extends a0 {
        public c(Context context) {
            super(context, 10000, "HeartbeatSender");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            m.e(voidArr, "voids");
            II iiA = a.a();
            if (iiA == null) {
                return null;
            }
            iiA.sendHeartbeat();
            return null;
        }
    }

    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6320a;

        static {
            int[] iArr = new int[u.c.values().length];
            try {
                iArr[u.c.CurrentLinkChanged.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f6320a = iArr;
        }
    }

    public IIService() {
        u uVarW = u.w();
        m.d(uVarW, "getInstance(...)");
        this.cm = uVarW;
    }

    public static final boolean i() {
        return INSTANCE.b();
    }

    private final void k() {
        k.d dVarS = new k.d(this, e.f20374b).q(-2).i(PendingIntent.getActivity(this, 0, new Intent(this, (Class<?>) BTActivity.class), 67108864)).k(getString(R.string.internetIntercom)).s(2131231109);
        m.d(dVarS, "setSmallIcon(...)");
        n1 n1Var = this.currentLink;
        String name = n1Var != null ? n1Var.getName() : null;
        if (!w.b(name)) {
            dVarS.j(name);
        }
        Notification notificationC = dVarS.c();
        m.d(notificationC, "build(...)");
        try {
            startForeground(R.string.internetIntercom, notificationC);
        } catch (Exception unused) {
            Object systemService = getSystemService("notification");
            m.c(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            ((NotificationManager) systemService).notify(2131231109, notificationC);
        }
    }

    private final void l(long delayMillis) {
        AlarmManager alarmManager = this.alarmManager;
        if (alarmManager != null) {
            long j10 = delayMillis / ((long) 4);
            long jElapsedRealtime = SystemClock.elapsedRealtime() + (((long) 3) * j10);
            PendingIntent pendingIntent = this.sendHeartbeatOperation;
            if (pendingIntent == null) {
                m.o("sendHeartbeatOperation");
                pendingIntent = null;
            }
            alarmManager.setWindow(2, jElapsedRealtime, j10, pendingIntent);
        }
    }

    @Override // com.dw.ht.l
    public void f() {
        s3.b.h("IIService", "onDestroy");
        g.s("IIS:onDestroy");
        mi.c.e().t(this);
        m();
        Object systemService = getSystemService("notification");
        m.c(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).cancel(2131231109);
        INSTANCE.e(null);
    }

    public final boolean j(g5.c msg) {
        m.e(msg, "msg");
        II iiA = a.a();
        if (iiA != null) {
            iiA.send(msg.a());
        }
        if (!u4.a0.f28040a) {
            return true;
        }
        s3.b.b("IIService", "send:" + msg);
        return true;
    }

    public final void m() {
        AlarmManager alarmManager = this.alarmManager;
        if (alarmManager != null) {
            PendingIntent pendingIntent = this.sendHeartbeatOperation;
            if (pendingIntent == null) {
                m.o("sendHeartbeatOperation");
                pendingIntent = null;
            }
            alarmManager.cancel(pendingIntent);
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        m.e(intent, "intent");
        return null;
    }

    @Override // com.dw.ht.l, android.app.Service
    public void onCreate() {
        s3.b.h("IIService", "onCreate");
        super.onCreate();
        this.currentLink = this.cm.t();
        k();
        INSTANCE.e(this);
        mi.c.e().q(this);
        Intent intent = new Intent(this, (Class<?>) IIService.class);
        intent.putExtra("SEND_HEARTBEAT", true);
        intent.setData(Uri.parse(intent.toUri(1)));
        PendingIntent service = PendingIntent.getService(this, 0, intent, 67108864);
        m.d(service, "getService(...)");
        this.sendHeartbeatOperation = service;
        Object systemService = getSystemService("alarm");
        m.c(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
        this.alarmManager = (AlarmManager) systemService;
        l(10000L);
        g.s("IIS:onCreate");
    }

    @mi.m(threadMode = ThreadMode.MAIN_ORDERED)
    public final void onMessageEvent(u.c event) {
        m.e(event, "event");
        if (d.f6320a[event.ordinal()] != 1 || m.a(this.currentLink, this.cm.t())) {
            return;
        }
        this.currentLink = this.cm.t();
        k();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int flags, int startId) {
        s3.b.h("IIService", "onStartCommand");
        if (intent == null || !intent.getBooleanExtra("SEND_HEARTBEAT", false)) {
            return 1;
        }
        Log.d("IIService", "SEND_HEARTBEAT");
        new c(this).execute(new Void[0]);
        II iiA = a.a();
        if (iiA == null) {
            return 1;
        }
        l((long) (((double) iiA.config.heartbeatInterval) * 0.9d));
        return 1;
    }
}
