package com.dw.ht.alarms;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.util.Log;
import com.dw.ht.l;
import k4.c;
import k4.d;
import k4.e;
import l3.f;
import v4.g;

/* JADX INFO: loaded from: classes.dex */
public class AlarmService extends l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TelephonyManager f5633e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f5634f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f5631c = new Handler();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Runnable f5632d = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private k4.b f5635g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private PhoneStateListener f5636h = new b();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AlarmService.this.m();
        }
    }

    class b extends PhoneStateListener {
        b() {
        }

        @Override // android.telephony.PhoneStateListener
        public void onCallStateChanged(int i10, String str) {
            if (i10 == 0 || i10 == AlarmService.this.f5634f) {
                return;
            }
            AlarmService alarmService = AlarmService.this;
            AlarmService.l(alarmService, alarmService.f5635g);
            AlarmService alarmService2 = AlarmService.this;
            e.a(alarmService2, alarmService2.f5635g);
        }
    }

    public static void j(Context context, k4.b bVar) {
        Intent intentA = k4.b.a(context, AlarmService.class, bVar.f19384c);
        intentA.setAction("START_ALARM");
        k4.a.a(context);
        f.d(context, intentA);
    }

    private void k(k4.b bVar) {
        this.f5631c.removeCallbacks(this.f5632d);
        Log.v("AlarmService", "AlarmService.start with instance: " + bVar.f19384c);
        k4.b bVar2 = this.f5635g;
        if (bVar2 != null) {
            e.a(this, bVar2);
            m();
        }
        k4.a.a(this);
        this.f5635g = bVar;
        d.a(this, bVar);
        this.f5634f = this.f5633e.getCallState();
        this.f5633e.listen(this.f5636h, 32);
        boolean z10 = this.f5634f != 0;
        if (!g.y1().i()) {
            c.b(this, this.f5635g, z10);
        }
        this.f5631c.postDelayed(this.f5632d, 60000L);
    }

    public static void l(Context context, k4.b bVar) {
        Intent intentA = k4.b.a(context, AlarmService.class, bVar.f19384c);
        intentA.setAction("STOP_ALARM");
        f.d(context, intentA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        if (this.f5635g == null) {
            Log.v("AlarmService", "There is no current alarm to stop");
            return;
        }
        Log.v("AlarmService", "AlarmService.stop with instance: " + this.f5635g.f19384c);
        c.d(this);
        this.f5633e.listen(this.f5636h, 0);
        this.f5635g = null;
        k4.a.c();
    }

    @Override // com.dw.ht.l
    public void f() {
        Log.v("AlarmService", "AlarmService.onDestroy() called");
        m();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.dw.ht.l, android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f5633e = (TelephonyManager) getSystemService("phone");
        f.a(this);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        Log.v("AlarmService", "AlarmService.onStartCommand() with intent: " + intent.toString());
        long jB = k4.b.b(intent.getData());
        if ("START_ALARM".equals(intent.getAction())) {
            k4.b bVarC = k4.b.c(getContentResolver(), jB);
            if (bVarC == null) {
                Log.e("AlarmService", "No instance found to start alarm: " + jB);
                if (this.f5635g != null) {
                    k4.a.c();
                }
                return 2;
            }
            k4.b bVar = this.f5635g;
            if (bVar != null && bVar.f19384c == jB) {
                Log.e("AlarmService", "Alarm already started for instance: " + jB);
                return 2;
            }
            k(bVarC);
        } else if ("STOP_ALARM".equals(intent.getAction())) {
            k4.b bVar2 = this.f5635g;
            if (bVar2 != null && bVar2.f19384c != jB) {
                Log.e("AlarmService", "Can't stop alarm for instance: " + jB + " because current alarm is: " + this.f5635g.f19384c);
                return 2;
            }
            stopSelf();
        }
        return 2;
    }

    @Override // android.app.Service
    public void onTimeout(int i10) {
        super.onTimeout(i10);
        s3.b.b("AlarmService", "onTimeout");
        stopSelf(i10);
    }
}
