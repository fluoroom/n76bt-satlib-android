package com.dw.ht;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyManager;
import com.benshikj.ii.II;

/* JADX INFO: loaded from: classes.dex */
public abstract class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f6349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile boolean f6350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile int f6351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile boolean f6352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile int f6353e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static volatile boolean f6354f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final BroadcastReceiver f6355g = new a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final d4.f f6356h = new d4.f();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static PhoneStateListener f6357i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final d f6358j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static boolean f6359k;

    class a extends BroadcastReceiver {
        a() {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0012  */
        @Override // android.content.BroadcastReceiver
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onReceive(android.content.Context r7, android.content.Intent r8) {
            /*
                r6 = this;
                java.lang.String r0 = r8.getAction()
                if (r0 != 0) goto L7
                goto L51
            L7:
                int r1 = r0.hashCode()
                r2 = 2
                r3 = -1
                r4 = 1
                r5 = 0
                switch(r1) {
                    case -1886648615: goto L35;
                    case -1538406691: goto L2a;
                    case -1172645946: goto L1f;
                    case 1019184907: goto L14;
                    default: goto L12;
                }
            L12:
                r0 = -1
                goto L3f
            L14:
                java.lang.String r1 = "android.intent.action.ACTION_POWER_CONNECTED"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L1d
                goto L12
            L1d:
                r0 = 3
                goto L3f
            L1f:
                java.lang.String r1 = "android.net.conn.CONNECTIVITY_CHANGE"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L28
                goto L12
            L28:
                r0 = 2
                goto L3f
            L2a:
                java.lang.String r1 = "android.intent.action.BATTERY_CHANGED"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L33
                goto L12
            L33:
                r0 = 1
                goto L3f
            L35:
                java.lang.String r1 = "android.intent.action.ACTION_POWER_DISCONNECTED"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L3e
                goto L12
            L3e:
                r0 = 0
            L3f:
                switch(r0) {
                    case 0: goto L8f;
                    case 1: goto L76;
                    case 2: goto L47;
                    case 3: goto L43;
                    default: goto L42;
                }
            L42:
                goto L51
            L43:
                com.dw.ht.k0.a(r4)
                return
            L47:
                java.lang.String r8 = "connectivity"
                java.lang.Object r7 = r7.getSystemService(r8)
                android.net.ConnectivityManager r7 = (android.net.ConnectivityManager) r7
                if (r7 != 0) goto L52
            L51:
                return
            L52:
                android.net.NetworkInfo r7 = r7.getActiveNetworkInfo()
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r0 = "Active:"
                r8.append(r0)
                r8.append(r7)
                java.lang.String r8 = r8.toString()
                java.lang.String r0 = "PhoneStatus"
                s3.b.b(r0, r8)
                if (r7 != 0) goto L72
                com.dw.ht.k0.b(r5)
                return
            L72:
                com.dw.ht.k0.b(r4)
                return
            L76:
                java.lang.String r7 = "voltage"
                int r7 = r8.getIntExtra(r7, r5)
                com.dw.ht.k0.f6351c = r7
                java.lang.String r7 = "status"
                int r7 = r8.getIntExtra(r7, r3)
                if (r7 == r2) goto L8b
                r8 = 5
                if (r7 != r8) goto L8a
                goto L8b
            L8a:
                r4 = 0
            L8b:
                com.dw.ht.k0.a(r4)
                return
            L8f:
                com.dw.ht.k0.a(r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dw.ht.k0.a.onReceive(android.content.Context, android.content.Intent):void");
        }
    }

    class b extends PhoneStateListener {
        b() {
        }

        @Override // android.telephony.PhoneStateListener
        public void onCallStateChanged(int i10, String str) {
            k0.f6350b = i10 != 0;
            s3.b.b("PhoneStatus", "onCallStateChanged:" + i10);
        }
    }

    public enum c {
        NetworkStatusChanged
    }

    private static class d extends TelephonyCallback implements TelephonyCallback.CallStateListener {
        private d() {
        }

        @Override // android.telephony.TelephonyCallback.CallStateListener
        public void onCallStateChanged(int i10) {
            k0.f6350b = i10 != 0;
            s3.b.b("PhoneStatus", "onCallStateChanged:" + i10);
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    static {
        f6358j = Build.VERSION.SDK_INT >= 31 ? new d(0 == true ? 1 : 0) : null;
    }

    public static boolean c() {
        return f6354f;
    }

    public static void d(Context context) {
        s3.b.b("PhoneStatus", "init");
        if (f6349a != null) {
            return;
        }
        f6349a = context.getApplicationContext();
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
        intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        b0.b.j(f6349a, f6355g, intentFilter, 2);
        i();
    }

    public static boolean e() {
        return !f6350b && f6353e == 0;
    }

    public static boolean f() {
        return f6352d;
    }

    public static synchronized void g(Object obj) {
        d4.f fVar = f6356h;
        fVar.add(obj);
        fVar.b();
        f6353e = fVar.size();
    }

    public static synchronized void h(Object obj) {
        d4.f fVar = f6356h;
        fVar.remove(obj);
        fVar.b();
        f6353e = fVar.size();
    }

    public static void i() {
        if (f6359k) {
            return;
        }
        TelephonyManager telephonyManager = (TelephonyManager) f6349a.getSystemService("phone");
        if (telephonyManager == null) {
            s3.b.d("PhoneStatus", "have no TelephonyManager");
            return;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                telephonyManager.registerTelephonyCallback(f6349a.getMainExecutor(), f6358j);
                f6359k = true;
            } catch (SecurityException unused) {
            }
        } else {
            b bVar = new b();
            f6357i = bVar;
            telephonyManager.listen(bVar, 32);
            f6359k = true;
        }
        s3.b.b("PhoneStatus", "registerPhoneStateListener");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void j(boolean z10) {
        II iiA = com.dw.ht.ii.a.a();
        if (iiA != null) {
            iiA.onNetworkStatusChanged(z10);
        }
        if (f6354f == z10) {
            return;
        }
        f6354f = z10;
        mi.c.e().m(c.NetworkStatusChanged);
        f5.d.f12792a.i(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void k(boolean z10) {
        if (f6352d == z10) {
            return;
        }
        s3.b.b("PhoneStatus", "powerConnected:" + z10);
        f6352d = z10;
        LocationShareService.p();
        TrackRecordingService.z();
    }
}
