package com.dw.ht;

import a0.k;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.SystemClock;
import com.benshikj.ht.R;
import com.dw.android.app.FragmentShowActivity;
import com.dw.ht.fragments.DeviceFragment;
import java.util.ArrayList;
import java.util.Iterator;
import n5.o0;
import org.greenrobot.eventbus.ThreadMode;
import v4.l1;
import v4.n0;

/* JADX INFO: loaded from: classes.dex */
public class LocationShareService extends l implements r5.c {

    /* JADX INFO: renamed from: r */
    private static c f5542r;

    /* JADX INFO: renamed from: s */
    private static long f5543s;

    /* JADX INFO: renamed from: c */
    private o5.g f5544c;

    /* JADX INFO: renamed from: e */
    private long f5546e;

    /* JADX INFO: renamed from: f */
    private long f5547f;

    /* JADX INFO: renamed from: h */
    private long f5549h;

    /* JADX INFO: renamed from: g */
    private final Runnable f5548g = new a();

    /* JADX INFO: renamed from: d */
    private final Handler f5545d = new Handler();

    public static class Receiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            l1 l1VarU = v4.u.u();
            if (l1VarU == null) {
                return;
            }
            FragmentShowActivity.j2(context, null, null, o0.class, DeviceFragment.b5(l1VarU.q()));
        }
    }

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LocationShareService locationShareService = LocationShareService.this;
            locationShareService.m(locationShareService.f5544c.o());
        }
    }

    public enum b {
        SingleUpdate
    }

    private static class c implements n0.d {
        private c() {
        }

        @Override // v4.n0.d
        public /* synthetic */ void M(v4.n0 n0Var, g3.d dVar) {
            v4.o0.d(this, n0Var, dVar);
        }

        @Override // v4.n0.d
        public void W0(v4.n0 n0Var) {
            Location locationC;
            i0(n0Var);
            if (n0Var.l() != n0.c.Connected || (locationC = o5.g.C(Main.f5555g)) == null) {
                return;
            }
            n0Var.p(locationC);
        }

        @Override // v4.n0.d
        public /* synthetic */ void h0(v4.n0 n0Var) {
            v4.o0.e(this, n0Var);
        }

        @Override // v4.n0.d
        public void i0(v4.n0 n0Var) {
            LocationShareService.p();
        }

        @Override // v4.n0.d
        public void j0(v4.n0 n0Var, v4.k0 k0Var, v4.k0 k0Var2) {
            if (k0Var.f29912a || !k0Var2.f29912a) {
                return;
            }
            i0(n0Var);
        }

        @Override // v4.n0.d
        public /* synthetic */ void o0(v4.n0 n0Var) {
            v4.o0.a(this, n0Var);
        }

        /* synthetic */ c(a aVar) {
            this();
        }
    }

    private static long i() {
        boolean zK = k();
        long jMin = Long.MAX_VALUE;
        for (l1 l1Var : v4.u.w().A()) {
            if (l1Var.n() && l1Var.x0()) {
                v4.q qVarT = l1Var.T();
                if (!zK) {
                    if (qVarT.r()) {
                        jMin = Math.min(jMin, 300000L);
                    }
                    if (qVarT.j() && qVarT.t() != 0) {
                        jMin = Math.min(jMin, qVarT.t());
                    }
                } else {
                    if (qVarT.r()) {
                        return 1000L;
                    }
                    if (qVarT.j() && qVarT.t() != 0) {
                        return 1000L;
                    }
                }
            }
        }
        return jMin;
    }

    public static void j() {
        if (f5542r != null) {
            return;
        }
        f5542r = new c(null);
        v4.u.w().E(f5542r);
    }

    public static boolean k() {
        return Cfg.f5482d || k0.f();
    }

    private void l() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - this.f5549h < 1000) {
            return;
        }
        this.f5546e = 0L;
        this.f5549h = jElapsedRealtime;
        this.f5544c.v();
    }

    public void m(Location location) {
        if (location == null) {
            return;
        }
        long jI = i();
        if (this.f5547f != jI) {
            n(jI);
        }
        if (System.currentTimeMillis() - this.f5546e < this.f5547f * 0.8f) {
            return;
        }
        try {
            ArrayList arrayListP = v4.u.w().p();
            if (arrayListP.isEmpty()) {
                o();
            } else {
                Iterator it = arrayListP.iterator();
                while (it.hasNext()) {
                    ((l1) it.next()).p(location);
                }
                this.f5546e = System.currentTimeMillis();
            }
        } finally {
            this.f5545d.removeCallbacks(this.f5548g);
            this.f5545d.postDelayed(this.f5548g, this.f5547f);
        }
    }

    private void n(long j10) {
        this.f5547f = j10;
        if (j10 == Long.MAX_VALUE) {
            this.f5544c.z();
        } else {
            this.f5544c.u(j10, k() ? 5.0f : 50.0f);
        }
    }

    private void o() {
        this.f5544c.z();
    }

    public static void p() {
        long jI = i();
        if (f5543s == jI) {
            return;
        }
        f5543s = jI;
        Intent intent = new Intent(Main.f5555g, (Class<?>) LocationShareService.class);
        if (jI == Long.MAX_VALUE) {
            Main.f5555g.stopService(intent);
        } else {
            l3.f.e(Main.f5555g, intent);
        }
    }

    @Override // r5.c
    public /* synthetic */ void a(Location location, Location location2) {
        r5.b.a(this, location, location2);
    }

    @Override // com.dw.ht.l
    public void f() {
        this.f5544c.z();
        this.f5545d.removeCallbacks(this.f5548g);
        mi.c.e().t(this);
        ((NotificationManager) getSystemService("notification")).cancel(2131231110);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.dw.ht.l, android.app.Service
    public void onCreate() {
        super.onCreate();
        Notification notificationC = new k.d(this, l3.e.f20374b).q(-2).i(PendingIntent.getActivity(this, 0, FragmentShowActivity.d2(this, null, o0.class), 67108864)).k(getString(R.string.locationShareServiceIsRunning)).s(2131231110).c();
        try {
            startForeground(R.string.locationShareServiceIsRunning, notificationC);
        } catch (Exception unused) {
            ((NotificationManager) getSystemService("notification")).notify(2131231110, notificationC);
        }
        this.f5544c = new o5.g(this, this);
        mi.c.e().q(this);
    }

    @Override // r5.c, android.location.LocationListener
    public void onLocationChanged(Location location) {
        if (location == null) {
            return;
        }
        m(location);
    }

    @mi.m(threadMode = ThreadMode.MAIN_ORDERED)
    public void onMessageEvent(b bVar) {
        if (bVar == b.SingleUpdate) {
            l();
        }
    }

    @Override // android.location.LocationListener
    public void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public void onProviderEnabled(String str) {
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        n(i());
        return 1;
    }

    @Override // android.location.LocationListener
    public void onStatusChanged(String str, int i10, Bundle bundle) {
    }
}
