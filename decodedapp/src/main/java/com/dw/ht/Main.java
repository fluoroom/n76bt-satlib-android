package com.dw.ht;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.DialogInterface;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.SystemClock;
import android.widget.Toast;
import androidx.appcompat.app.c;
import com.benshikj.ht.R;
import com.dw.android.app.FragmentShowActivity;
import com.dw.ht.Cfg;
import com.dw.ht.Main;
import com.dw.ht.factory.DeviceIDWriterFragment;
import com.dw.ht.fragments.DeviceFragment;
import com.dw.ht.ii.IIService;
import com.dw.ht.provider.a;
import e5.a;
import g4.f;
import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import w5.d;

/* JADX INFO: loaded from: classes.dex */
public class Main extends h1.b {

    /* JADX INFO: renamed from: e */
    public static final String[] f5553e;

    /* JADX INFO: renamed from: f */
    private static Boolean f5554f;

    /* JADX INFO: renamed from: g */
    public static Main f5555g;

    /* JADX INFO: renamed from: h */
    public static ContentResolver f5556h;

    /* JADX INFO: renamed from: r */
    private static long f5557r;

    /* JADX INFO: renamed from: s */
    private static long f5558s;

    /* JADX INFO: renamed from: a */
    private final Handler f5559a = new Handler();

    /* JADX INFO: renamed from: b */
    private final Runnable f5560b = new a();

    /* JADX INFO: renamed from: c */
    private final Runnable f5561c = new b();

    /* JADX INFO: renamed from: d */
    private boolean f5562d;

    class a implements Runnable {
        a() {
        }

        public static /* synthetic */ Object a(a aVar, int i10, Boolean bool) {
            Main.this.n(i10);
            return null;
        }

        @Override // java.lang.Runnable
        public void run() {
            Main.this.f5559a.removeCallbacks(this);
            final int audioStorageDays = Cfg.O().getAudioStorageDays();
            if (audioStorageDays < 1) {
                return;
            }
            hc.g.c(Boolean.TRUE).e(zc.a.b()).d(new mc.d() { // from class: com.dw.ht.y
                @Override // mc.d
                public final Object apply(Object obj) {
                    return Main.a.a(this.f6885a, audioStorageDays, (Boolean) obj);
                }
            }).g();
            Main.this.f5559a.postDelayed(this, 3600000L);
        }
    }

    class b implements Runnable {
        b() {
        }

        public static /* synthetic */ Object a(b bVar, String str, int i10, Boolean bool) {
            ContentResolver contentResolver = Main.this.getContentResolver();
            ArrayList arrayListY = Cfg.y();
            ContentValues contentValues = new ContentValues(1);
            contentValues.put("have_pic", (Integer) 1);
            g4.f fVarG = new f.b().i("_id", arrayListY).g();
            contentResolver.update(a.d.f6668a, contentValues, fVarG.n(), fVarG.k());
            Cfg.K().edit().putInt(str, i10).apply();
            return null;
        }

        @Override // java.lang.Runnable
        public void run() {
            Main.this.f5559a.removeCallbacks(this);
            final String str = "Session.HavePicBind";
            final int i10 = 2;
            if (Cfg.K().getInt("Session.HavePicBind", 0) >= 2) {
                return;
            }
            hc.g.c(Boolean.TRUE).e(zc.a.b()).d(new mc.d() { // from class: com.dw.ht.z
                @Override // mc.d
                public final Object apply(Object obj) {
                    return Main.b.a(this.f6887a, str, i10, (Boolean) obj);
                }
            }).g();
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.permission.RECORD_AUDIO");
        arrayList.add("android.permission.MODIFY_AUDIO_SETTINGS");
        arrayList.add("android.permission.BROADCAST_STICKY");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 31 || k()) {
            arrayList.add("android.permission.BLUETOOTH");
            arrayList.add("android.permission.BLUETOOTH_ADMIN");
        } else {
            arrayList.add("android.permission.BLUETOOTH_SCAN");
            arrayList.add("android.permission.BLUETOOTH_CONNECT");
        }
        if (i10 >= 33) {
            arrayList.add("android.permission.POST_NOTIFICATIONS");
        }
        f5553e = (String[]) arrayList.toArray(d4.c.f10567g);
    }

    public static /* synthetic */ void a(boolean z10, Activity activity, v4.n0 n0Var, DialogInterface dialogInterface, int i10) {
        if (z10) {
            FragmentShowActivity.i2(activity, activity.getString(R.string.writeID), DeviceIDWriterFragment.class, DeviceFragment.b5(n0Var.q()));
        }
    }

    public static /* synthetic */ void d(v4.n0 n0Var, DialogInterface dialogInterface, int i10) {
        if (n0Var instanceof a.f) {
            ((a.f) n0Var).y();
        }
    }

    public static /* synthetic */ void e(final Main main, final v4.n0 n0Var, String str) {
        if (main.f5562d) {
            return;
        }
        final String string = main.getString(R.string.devIsUnauthorized, v4.m0.j(n0Var.q()));
        if (str != null) {
            string = string + "\n" + str;
        }
        final Activity activityB = v3.j.b(main);
        if (activityB == null) {
            Toast.makeText(main, string, 1).show();
            return;
        }
        main.f5562d = true;
        final boolean z10 = Cfg.f5486f;
        new c.a(activityB).z(n0Var.getName()).k(string).m(z10 ? R.string.writeID : android.R.string.cancel, new DialogInterface.OnClickListener() { // from class: com.dw.ht.u
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                Main.a(z10, activityB, n0Var, dialogInterface, i10);
            }
        }).o(R.string.copyText, new DialogInterface.OnClickListener() { // from class: com.dw.ht.v
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                a6.e.a(activityB, string, null, null);
            }
        }).t(R.string.retry, new DialogInterface.OnClickListener() { // from class: com.dw.ht.w
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                Main.d(n0Var, dialogInterface, i10);
            }
        }).r(new DialogInterface.OnDismissListener() { // from class: com.dw.ht.x
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f6884a.f5562d = false;
            }
        }).C();
    }

    private static boolean f() {
        try {
            Class<?> cls = Class.forName("com.huawei.system.BuildEx");
            Object objInvoke = cls.getMethod("getOsBrand", null).invoke(cls, null);
            if (objInvoke == null) {
                return false;
            }
            return "harmony".equalsIgnoreCase(objInvoke.toString());
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean k() {
        Boolean bool = f5554f;
        if (bool != null) {
            return bool.booleanValue();
        }
        Boolean boolValueOf = Boolean.valueOf(f());
        f5554f = boolValueOf;
        return boolValueOf.booleanValue();
    }

    public static void l(String str) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = jElapsedRealtime - f5557r;
        long j11 = jElapsedRealtime - f5558s;
        f5558s = jElapsedRealtime;
        s3.b.b("RunningTime", String.format(Locale.getDefault(), "%d:%02d:%02d.%03d + %dms %s", Long.valueOf(j10 / 3600000), Long.valueOf((j10 % 3600000) / 60000), Long.valueOf((j10 % 60000) / 1000), Long.valueOf(j10 % 1000), Long.valueOf(j11), str));
    }

    public void n(int i10) {
        if (i10 <= 0) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - (((long) i10) * 86400000);
        ContentResolver contentResolver = getContentResolver();
        g4.f fVar = new g4.f("duration>0");
        fVar.h(new g4.f("date<" + jCurrentTimeMillis));
        Cursor cursorQuery = contentResolver.query(a.d.f6668a, new String[]{"_id"}, fVar.n(), fVar.k(), null);
        ArrayList arrayListA = a6.o.a();
        for (long j10 : g4.d.b(cursorQuery, 0)) {
            File fileN = Cfg.n(j10);
            if (fileN != null && fileN.isFile()) {
                fileN.delete();
            }
            File fileI = Cfg.I(j10);
            if (fileI != null && fileI.isFile()) {
                arrayListA.add(String.valueOf(j10));
            }
        }
        g4.f fVarClone = fVar.clone();
        fVarClone.h(new f.b().b("_id", (String[]) arrayListA.toArray(d4.c.f10567g)).g());
        fVarClone.h(new g4.f("text IS NULL OR text=''"));
        Uri uri = a.d.f6668a;
        contentResolver.delete(uri, fVarClone.n(), fVarClone.k());
        ContentValues contentValues = new ContentValues();
        contentValues.put("duration", (Integer) 0);
        contentValues.put("audio", (byte[]) null);
        contentResolver.update(uri, contentValues, fVar.n(), fVar.k());
    }

    private void p() {
    }

    public static void q() {
        IGateService.INSTANCE.c(f5555g);
        LocationShareService.j();
        TrackRecordingService.z();
        IIService.INSTANCE.c();
        RadioService.INSTANCE.b();
    }

    public void i() {
        Cfg.Settings settingsO = Cfg.O();
        s3.b.b("Main", "exit runAtSystemStartup:" + settingsO.runAtSystemStartup);
        if (settingsO.runAtSystemStartup) {
            settingsO.runAtSystemStartup = false;
            Cfg.i();
        }
        l.e();
        System.exit(0);
    }

    public void j() {
        d.C0417d.f31279c = getString(R.string.call);
        d.C0417d.f31277a = getString(R.string.alarm);
        d.C0417d.f31278b = getString(R.string.alarm_and_mute);
        d.C0417d.f31281e = getString(R.string.check_position);
        d.C0417d.f31280d = getString(R.string.search_nearby_people);
    }

    public void m() {
        this.f5560b.run();
    }

    public void o(final v4.n0 n0Var, final String str) {
        Runnable runnable = new Runnable() { // from class: com.dw.ht.t
            @Override // java.lang.Runnable
            public final void run() {
                Main.e(this.f6766a, n0Var, str);
            }
        };
        if (this.f5559a.getLooper().getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            this.f5559a.post(runnable);
        }
    }

    @Override // android.app.Application
    public void onCreate() {
        s3.b.b("Main", "onCreate");
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        f5557r = jElapsedRealtime;
        f5558s = jElapsedRealtime;
        f5555g = this;
        f5556h = getContentResolver();
        super.onCreate();
        i5.e.a(this);
        z4.m.k(this);
        j();
        j0.f(this);
        if (getPackageName().endsWith("factory")) {
            Cfg.f5480c = true;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            h5.c.d(this);
        }
        androidx.appcompat.app.h.L(true);
        k3.a.f19146a.b(this, new File(Environment.getExternalStorageDirectory(), "/BS/HT/err.log"), "dwpcom@gmail.com", R.string.error_report_email_explain);
        yc.a.s(new s());
        Cfg.U(this);
        if (i10 < 33) {
            androidx.appcompat.app.h.K(Cfg.O().getLocaleList());
        }
        p.f6649f.a(this);
        if (Cfg.f5476a) {
            s3.b.m(2);
            u5.a.f28164l = 2;
        } else {
            s3.b.m(4);
        }
        com.dw.ht.user.b bVar = com.dw.ht.user.b.f6853a;
        if (Cfg.f5476a) {
            s3.b.b("UserInfo", bVar.toString());
        }
        k0.d(this);
        v4.u.b();
        n4.b.d();
        n4.m.c(this);
        s3.c.g(this);
        v3.j.d(this);
        q();
        p();
        this.f5559a.postDelayed(this.f5561c, 30000L);
        this.f5559a.postDelayed(this.f5560b, 60000L);
        l("Main onCreate exit");
        d5.g.s("启动");
    }
}
