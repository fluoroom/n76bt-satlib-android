package com.dw.ht;

import a0.k;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Handler;
import android.os.IBinder;
import android.os.SystemClock;
import android.text.TextUtils;
import com.benshikj.ht.R;
import com.dw.android.app.FragmentShowActivity;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import u5.a;
import v4.l1;
import v4.n1;
import w5.a;
import w5.c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u0000 92\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001:B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0019\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001b\u0010\u0006J\u000f\u0010\u001c\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001c\u0010\u0006J\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010 \u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b \u0010\u000bJ\u0017\u0010#\u001a\u00020\t2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\t2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b%\u0010$J\u0017\u0010&\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b&\u0010\u000fJ\u001f\u0010)\u001a\u00020\t2\u0006\u0010(\u001a\u00020'2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010,R\u0016\u00101\u001a\u00020.8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00105\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00108\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u00107¨\u0006;"}, d2 = {"Lcom/dw/ht/IGateService;", "Lcom/dw/ht/l;", "Lr5/c;", "Lu5/a$b;", "Lu5/a$c;", "<init>", "()V", "Landroid/location/Location;", "location", "Ldd/d0;", "k", "(Landroid/location/Location;)V", "Lw5/c;", "p", "l", "(Lw5/c;)V", "Lu5/a$g;", "status", "m", "(Lu5/a$g;)V", "Landroid/content/Intent;", "intent", "", "flags", "startId", "onStartCommand", "(Landroid/content/Intent;II)I", "onCreate", "f", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "onLocationChanged", "", "provider", "onProviderEnabled", "(Ljava/lang/String;)V", "onProviderDisabled", "b", "Lu5/a;", "iGate", "c", "(Lu5/a;Lu5/a$g;)V", "Landroid/os/Handler;", "Landroid/os/Handler;", "mHandler", "Lo5/g;", "d", "Lo5/g;", "mLocationClient", "Ljava/lang/Runnable;", "e", "Ljava/lang/Runnable;", "mSendLocation", "", "J", "lastSendTime", "g", "a", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IGateService extends l implements r5.c, a.b, a.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static u5.a f5534h;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private o5.g mLocationClient;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final w5.e f5535r = new w5.e(3600000, 36000);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Handler mHandler = new Handler();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Runnable mSendLocation = new Runnable() { // from class: com.dw.ht.r
        @Override // java.lang.Runnable
        public final void run() {
            IGateService.j(this.f6675a);
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private long lastSendTime = -10000000;

    /* JADX INFO: renamed from: com.dw.ht.IGateService$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(rd.h hVar) {
            this();
        }

        private final boolean b() {
            if (TextUtils.isEmpty(Cfg.r()) || TextUtils.isEmpty(Cfg.A())) {
                return false;
            }
            return (Cfg.b0() || Cfg.Y() || Cfg.a0()) && Cfg.Z();
        }

        public final a.C0394a a() {
            return new a.C0394a(Cfg.B(), Cfg.s(), Cfg.A(), Integer.valueOf(Cfg.a0() ? Cfg.z() : 0));
        }

        public final void c(Context context) {
            rd.m.e(context, "context");
            Intent intent = new Intent(context, (Class<?>) IGateService.class);
            if (b()) {
                l3.f.e(context, intent);
            } else {
                context.stopService(intent);
            }
        }

        public final boolean d(w5.a aVar) {
            c.a aVar2;
            String strK;
            rd.m.e(aVar, "p");
            u5.a aVar3 = IGateService.f5534h;
            if (aVar3 == null) {
                return false;
            }
            w5.c cVarC = aVar.C();
            if (cVarC != null && (aVar2 = cVarC.f31219d) != null && (strK = aVar2.k()) != null) {
                IGateService.f5535r.a(strK.hashCode());
            }
            return aVar3.r(aVar);
        }

        private Companion() {
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5540a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f5541b;

        static {
            int[] iArr = new int[a.g.values().length];
            try {
                iArr[a.g.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.g.MESSAGE_ACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f5540a = iArr;
            int[] iArr2 = new int[a.g.values().length];
            try {
                iArr2[a.g.Connecting.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[a.g.Connected.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[a.g.ConnectionFailed.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[a.g.Disconnected.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            f5541b = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(IGateService iGateService) {
        iGateService.k(o5.g.f23195s.a(iGateService));
    }

    private final void k(Location location) {
        try {
            u5.a aVar = f5534h;
            if (aVar == null) {
                this.mHandler.removeCallbacks(this.mSendLocation);
                if (location == null) {
                    this.mHandler.postDelayed(this.mSendLocation, 5000L);
                    return;
                } else {
                    if (Cfg.g0()) {
                        this.mHandler.postDelayed(this.mSendLocation, Cfg.J());
                        return;
                    }
                    return;
                }
            }
            if (location == null) {
                this.mHandler.removeCallbacks(this.mSendLocation);
                this.mHandler.postDelayed(this.mSendLocation, 5000L);
                return;
            }
            if (aVar.m() != a.g.Connected) {
                this.mHandler.removeCallbacks(this.mSendLocation);
                if (Cfg.g0()) {
                    this.mHandler.postDelayed(this.mSendLocation, Cfg.J());
                    return;
                }
                return;
            }
            if (SystemClock.elapsedRealtime() - this.lastSendTime < Cfg.J() * 0.8f) {
                this.mHandler.removeCallbacks(this.mSendLocation);
                if (Cfg.g0()) {
                    this.mHandler.postDelayed(this.mSendLocation, Cfg.J());
                    return;
                }
                return;
            }
            w5.a aVarA = o5.b.a(location, null);
            if (aVar.r(aVarA)) {
                this.lastSendTime = SystemClock.elapsedRealtime();
                d5.d.p(aVarA, 2, -1);
                s3.b.b("IGateService", "sendLocation 成功");
            } else {
                s3.b.b("IGateService", "sendLocation 失败");
            }
            this.mHandler.removeCallbacks(this.mSendLocation);
            if (Cfg.g0()) {
                this.mHandler.postDelayed(this.mSendLocation, Cfg.J());
            }
        } catch (Throwable th2) {
            this.mHandler.removeCallbacks(this.mSendLocation);
            if (location == null) {
                this.mHandler.postDelayed(this.mSendLocation, 5000L);
            } else if (Cfg.g0()) {
                this.mHandler.postDelayed(this.mSendLocation, Cfg.J());
            }
            throw th2;
        }
    }

    private final void l(w5.c p10) {
        v4.u uVarW = v4.u.w();
        rd.m.d(uVarW, "getInstance(...)");
        Collection<l1> collectionA = uVarW.A();
        rd.m.d(collectionA, "getLinks(...)");
        if (collectionA.isEmpty()) {
            return;
        }
        for (l1 l1Var : collectionA) {
            if (!(l1Var instanceof n1)) {
                l1Var.S0(p10, v4.s.f30103c);
            }
        }
    }

    private final void m(a.g status) {
        int i10;
        s3.b.b("IGateService", "status: " + status);
        k.d dVarK = new k.d(this, l3.e.f20374b).q(-2).i(PendingIntent.getActivity(this, 0, FragmentShowActivity.d2(this, "", s4.i.class), 67108864)).k(getString(R.string.iGateServiceIsRunning));
        int i11 = b.f5541b[status.ordinal()];
        if (i11 == 1) {
            i10 = R.string.connecting;
        } else if (i11 == 2) {
            i10 = R.string.connected;
        } else if (i11 == 3) {
            i10 = R.string.connection_failed;
        } else {
            if (i11 != 4) {
                throw new dd.o();
            }
            i10 = R.string.disconnected;
        }
        Notification notificationC = dVarK.j(getString(i10)).s(2131231108).c();
        rd.m.d(notificationC, "build(...)");
        try {
            startForeground(R.string.iGateServiceIsRunning, notificationC);
        } catch (Exception unused) {
            Object systemService = getSystemService("notification");
            rd.m.c(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            ((NotificationManager) systemService).notify(2131231108, notificationC);
        }
    }

    @Override // r5.c
    public /* synthetic */ void a(Location location, Location location2) {
        r5.b.a(this, location, location2);
    }

    @Override // u5.a.b
    public void b(w5.c p10) {
        String strH;
        rd.m.e(p10, "p");
        w5.h hVar = p10.f31316b;
        if (hVar instanceof w5.a) {
            rd.m.c(hVar, "null cannot be cast to non-null type com.dw.net.packet.APRS");
            w5.a aVar = (w5.a) hVar;
            if ((aVar.O() == a.g.MESSAGE || aVar.O() == a.g.MESSAGE_ACK) && (strH = aVar.H()) != null && strH.length() > 0) {
                if (a6.q.d(aVar.H(), Cfg.s()) || a6.q.d(aVar.H(), Cfg.r())) {
                    d5.g.r(281474976710656L, 0L, 0, p10);
                    String strG = aVar.G();
                    if (strG != null) {
                        a.g gVarO = aVar.O();
                        int i10 = gVarO == null ? -1 : b.f5540a[gVarO.ordinal()];
                        if (i10 == 1) {
                            w5.a aVarA = new a.C0414a().f(strG).h(Cfg.s()).e(p10.f31219d.k()).j(a.g.MESSAGE_ACK).a();
                            Companion companion = INSTANCE;
                            rd.m.b(aVarA);
                            if (companion.d(aVarA)) {
                                d5.g.q(0L, 0L, -1, 2, p10);
                            }
                        } else if (i10 == 2) {
                            Iterator it = v4.u.w().A().iterator();
                            while (it.hasNext()) {
                                ((l1) it.next()).b0().t(aVar);
                            }
                        }
                    }
                } else if (Cfg.Y()) {
                    if (f5535r.d(aVar.H() != null ? r1.hashCode() : 0)) {
                        l(p10);
                    }
                }
            }
        }
        d5.d.p(p10, 1, 0);
    }

    @Override // u5.a.c
    public void c(u5.a iGate, a.g status) {
        rd.m.e(iGate, "iGate");
        rd.m.e(status, "status");
        if (status == a.g.Connected) {
            this.lastSendTime = -10000000L;
            k(o5.g.f23195s.a(this));
        }
        m(status);
    }

    @Override // com.dw.ht.l
    public void f() {
        s3.b.h("IGateService", "onDestroy");
        u5.a aVar = f5534h;
        if (aVar != null) {
            aVar.l();
        }
        o5.g gVar = null;
        f5534h = null;
        o5.g gVar2 = this.mLocationClient;
        if (gVar2 == null) {
            rd.m.o("mLocationClient");
        } else {
            gVar = gVar2;
        }
        gVar.z();
        this.mHandler.removeCallbacks(this.mSendLocation);
        Object systemService = getSystemService("notification");
        rd.m.c(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).cancel(2131231108);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        rd.m.e(intent, "intent");
        return null;
    }

    @Override // com.dw.ht.l, android.app.Service
    public void onCreate() {
        s3.b.h("IGateService", "onCreate");
        super.onCreate();
        m(a.g.Disconnected);
        u5.a aVar = new u5.a(INSTANCE.a());
        f5534h = aVar;
        aVar.t(this);
        u5.a aVar2 = f5534h;
        if (aVar2 != null) {
            aVar2.u(this);
        }
        this.mLocationClient = new o5.g(this, this);
    }

    @Override // r5.c, android.location.LocationListener
    public void onLocationChanged(Location location) {
        k(location);
    }

    @Override // android.location.LocationListener
    public void onProviderDisabled(String provider) {
        rd.m.e(provider, "provider");
    }

    @Override // android.location.LocationListener
    public void onProviderEnabled(String provider) {
        rd.m.e(provider, "provider");
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int flags, int startId) {
        s3.b.h("IGateService", "onStart");
        u5.a aVar = f5534h;
        rd.m.b(aVar);
        this.lastSendTime = -10000000L;
        o5.g gVar = this.mLocationClient;
        o5.g gVar2 = null;
        if (gVar == null) {
            rd.m.o("mLocationClient");
            gVar = null;
        }
        gVar.z();
        aVar.s(INSTANCE.a());
        aVar.w();
        if (1 != Cfg.O().getAprsLocationSource() && Cfg.g0()) {
            o5.g gVar3 = this.mLocationClient;
            if (gVar3 == null) {
                rd.m.o("mLocationClient");
            } else {
                gVar2 = gVar3;
            }
            gVar2.u(Cfg.J(), 50.0f);
        }
        if (aVar.m() == a.g.Connected) {
            this.mSendLocation.run();
        }
        return 1;
    }
}
