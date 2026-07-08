package r5;

import a6.q;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;
import d4.f;
import dd.d0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import org.greenrobot.eventbus.ThreadMode;
import rd.g0;
import rd.h;
import rd.m;
import v3.c0;
import v3.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static long f25459k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static boolean f25460l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static Location f25461m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static LocationManager f25462n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static BroadcastReceiver f25464p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static int f25466r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r5.c f25467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f25468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f25469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f25470d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f25471e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f25472f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f25473g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final b f25474h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f25475i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C0352a f25458j = new C0352a(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final f f25463o = new f();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final ArrayList f25465q = new ArrayList();

    /* JADX INFO: renamed from: r5.a$a, reason: collision with other inner class name */
    public static final class C0352a {
        public /* synthetic */ C0352a(h hVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String e(Context context) {
            LocationManager locationManagerH = h(context);
            if (locationManagerH == null) {
                return null;
            }
            try {
                if (locationManagerH.isProviderEnabled("gps")) {
                    return "gps";
                }
                if (locationManagerH.isProviderEnabled("network")) {
                    return "network";
                }
                if (locationManagerH.isProviderEnabled("passive")) {
                    return "passive";
                }
                return null;
            } catch (Exception e10) {
                e10.printStackTrace();
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final synchronized LocationManager h(Context context) {
            Context applicationContext = context.getApplicationContext();
            if (a.f25462n == null) {
                if (b0.b.a(applicationContext, "android.permission.ACCESS_FINE_LOCATION") != 0 && b0.b.a(applicationContext, "android.permission.ACCESS_COARSE_LOCATION") != 0) {
                    return null;
                }
                Object systemService = applicationContext.getSystemService("location");
                m.c(systemService, "null cannot be cast to non-null type android.location.LocationManager");
                a.f25462n = (LocationManager) systemService;
            }
            return a.f25462n;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void k(Context context) {
            if (a.f25464p != null) {
                return;
            }
            synchronized (a.f25463o) {
                try {
                    if (a.f25464p == null) {
                        a.f25464p = new c();
                        IntentFilter intentFilter = new IntentFilter();
                        intentFilter.addAction("android.location.PROVIDERS_CHANGED");
                        context.getApplicationContext().registerReceiver(a.f25464p, intentFilter);
                    }
                    d0 d0Var = d0.f10897a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        private final boolean o(Location location) {
            if (location == null) {
                return false;
            }
            return (location.getLatitude() == 0.0d && location.getLongitude() == 0.0d) ? false : true;
        }

        private final Location p(Context context) {
            LocationManager locationManagerH;
            try {
                String strE = e(context);
                if (strE == null || (locationManagerH = h(context)) == null) {
                    return null;
                }
                Location lastKnownLocation = locationManagerH.getLastKnownLocation(strE);
                if (lastKnownLocation == null) {
                    Iterator<String> it = locationManagerH.getAllProviders().iterator();
                    while (it.hasNext()) {
                        lastKnownLocation = locationManagerH.getLastKnownLocation(it.next());
                        if (lastKnownLocation != null) {
                            return lastKnownLocation;
                        }
                    }
                }
                return lastKnownLocation;
            } catch (SecurityException e10) {
                e10.printStackTrace();
                return null;
            }
        }

        public static /* synthetic */ Location s(C0352a c0352a, Location location, a aVar, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                aVar = null;
            }
            return c0352a.r(location, aVar);
        }

        public final void d(Context context, d dVar) {
            m.e(context, "context");
            m.e(dVar, "listener");
            k(context);
            a.f25465q.add(dVar);
        }

        public final boolean f() {
            return a.f25460l;
        }

        public final Location g(Context context) {
            if (context != null && (a.f25461m == null || a.f25466r == 0)) {
                s(this, p(context), null, 2, null);
            }
            return a.f25461m;
        }

        public final void i(Activity activity) {
            m.e(activity, "context");
            j.e(activity, new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
        }

        public final void j(Context context) {
            m.e(context, "context");
            if (a.f25462n == null && h(context) != null) {
                synchronized (a.f25463o) {
                    try {
                        a.f25463o.b();
                        Iterator<E> it = a.f25463o.iterator();
                        m.d(it, "iterator(...)");
                        while (it.hasNext()) {
                            a aVar = (a) it.next();
                            if (aVar != null) {
                                aVar.A();
                            }
                        }
                        d0 d0Var = d0.f10897a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        public final boolean l(Location location, Location location2) {
            if (!o(location)) {
                return false;
            }
            if (location2 == null) {
                return true;
            }
            m.b(location);
            long time = location.getTime() - location2.getTime();
            boolean z10 = time > 120000;
            boolean z11 = time < -120000;
            boolean z12 = time > 0;
            if (z10) {
                return true;
            }
            if (z11) {
                return false;
            }
            int accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
            boolean z13 = accuracy > 0;
            boolean z14 = accuracy < 0;
            boolean z15 = accuracy > 200;
            boolean zD = q.d(location.getProvider(), location2.getProvider());
            if (z14) {
                return true;
            }
            if (!z12 || z13) {
                return z12 && !z15 && zD;
            }
            return true;
        }

        public final boolean m(Context context) {
            m.e(context, "context");
            LocationManager locationManagerH = h(context);
            if (locationManagerH == null) {
                return false;
            }
            return locationManagerH.isProviderEnabled("gps") || locationManagerH.isProviderEnabled("network");
        }

        public final boolean n(Context context) {
            m.e(context, "context");
            LocationManager locationManagerH = h(context);
            if (locationManagerH == null) {
                return false;
            }
            return locationManagerH.isProviderEnabled("gps");
        }

        public final void q(boolean z10) {
            a.f25460l = z10;
        }

        public final Location r(Location location, a aVar) {
            r5.c cVarP;
            if (m.a(location, a.f25461m) || location == null) {
                return a.f25461m;
            }
            if (m.a(location.getProvider(), "gps")) {
                a.f25459k = SystemClock.elapsedRealtime();
            }
            if (l(location, a.f25461m)) {
                if (f()) {
                    Log.d("LocationClient", "better location from:" + location.getProvider());
                }
                if (location.getProvider() == "lbs") {
                    if (location.hasAltitude() && location.getAltitude() == 0.0d) {
                        location.removeAltitude();
                    }
                    if (location.hasBearing() && location.getBearing() == 0.0d) {
                        location.removeBearing();
                    }
                    if (location.hasSpeed() && location.getSpeed() == 0.0d) {
                        location.removeSpeed();
                    }
                }
                Location location2 = a.f25461m;
                if (location2 != null && location.getTime() - location2.getTime() < 120000) {
                    if (!location.hasAltitude() && location2.hasAltitude()) {
                        location.setAltitude(location2.getAltitude());
                    }
                    if (!location.hasBearing() && location2.hasBearing()) {
                        location.setBearing(location2.getBearing());
                    }
                    if (!location.hasSpeed() && location2.hasSpeed()) {
                        location.setSpeed(location2.getSpeed());
                    }
                }
                a.f25461m = location;
                synchronized (a.f25463o) {
                    try {
                        Iterator<E> it = a.f25463o.iterator();
                        m.d(it, "iterator(...)");
                        while (it.hasNext()) {
                            a aVar2 = (a) it.next();
                            if (aVar2 != null && aVar2.r() && !m.a(aVar2, aVar) && (cVarP = aVar2.p()) != null) {
                                cVarP.a(location, location);
                            }
                        }
                        d0 d0Var = d0.f10897a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } else if (f()) {
                Log.d("LocationClient", "not better location:" + location.getProvider());
            }
            return a.f25461m;
        }

        private C0352a() {
        }
    }

    public static final class b implements r5.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference f25476a;

        public b(a aVar) {
            m.e(aVar, "client");
            this.f25476a = new WeakReference(aVar);
        }

        @Override // r5.c
        public /* synthetic */ void a(Location location, Location location2) {
            r5.b.a(this, location, location2);
        }

        @Override // r5.c, android.location.LocationListener
        public void onLocationChanged(Location location) {
            a aVar;
            if (location == null || (aVar = (a) this.f25476a.get()) == null) {
                return;
            }
            aVar.s(location);
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(String str) {
            m.e(str, "provider");
            if (a.f25458j.f()) {
                Log.d("LocationClient", "onProviderDisabled:" + str);
            }
            a aVar = (a) this.f25476a.get();
            if (aVar != null) {
                aVar.A();
            }
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(String str) {
            m.e(str, "provider");
            if (a.f25458j.f()) {
                Log.d("LocationClient", "onProviderEnabled:" + str);
            }
            a aVar = (a) this.f25476a.get();
            if (aVar != null) {
                aVar.A();
            }
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String str, int i10, Bundle bundle) {
            m.e(str, "provider");
            m.e(bundle, "extras");
            if (a.f25458j.f()) {
                g0 g0Var = g0.f25951a;
                String str2 = String.format(Locale.getDefault(), "onStatusChanged:p=%s,s=%d", Arrays.copyOf(new Object[]{str, Integer.valueOf(i10)}, 2));
                m.d(str2, "format(...)");
                Log.d("LocationClient", str2);
            }
        }
    }

    public static final class c extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            m.e(context, "context");
            m.e(intent, "intent");
            LocationManager locationManagerH = a.f25458j.h(context);
            if (locationManagerH == null) {
                return;
            }
            String stringExtra = intent.getStringExtra("android.location.extra.PROVIDER_NAME");
            if (TextUtils.isEmpty(stringExtra)) {
                return;
            }
            m.b(stringExtra);
            Log.d("LocationClient", stringExtra + "=>" + locationManagerH.isProviderEnabled(stringExtra));
            synchronized (a.f25463o) {
                try {
                    a.f25463o.b();
                    Iterator<E> it = a.f25463o.iterator();
                    m.d(it, "iterator(...)");
                    while (it.hasNext()) {
                        a aVar = (a) it.next();
                        if (aVar != null) {
                            aVar.A();
                        }
                    }
                    Iterator it2 = a.f25465q.iterator();
                    m.d(it2, "iterator(...)");
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        m.d(next, "next(...)");
                        ((d) next).a();
                    }
                    d0 d0Var = d0.f10897a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public a(Context context, r5.c cVar) {
        m.e(context, "context");
        this.f25467a = cVar;
        this.f25468b = context.getApplicationContext();
        this.f25474h = new b(this);
        f fVar = f25463o;
        synchronized (fVar) {
            fVar.b();
            fVar.add(this);
            f25458j.k(context);
            d0 d0Var = d0.f10897a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean A() {
        t();
        Context context = this.f25468b;
        if (context == null || !this.f25470d) {
            return false;
        }
        if (this.f25469c) {
            x(false);
        }
        C0352a c0352a = f25458j;
        LocationManager locationManagerH = c0352a.h(context);
        if (locationManagerH == null) {
            w(true);
            return false;
        }
        String strE = c0352a.e(context);
        this.f25471e = strE;
        if (strE == null) {
            return false;
        }
        try {
            Log.d("LocationClient", "start:" + strE + ", min_t:" + (this.f25472f / 1000.0f) + ",min_d:" + this.f25473g);
            String str = this.f25471e;
            m.b(str);
            locationManagerH.requestLocationUpdates(str, this.f25472f, this.f25473g, this.f25474h);
            if (q.d(this.f25471e, "gps")) {
                try {
                    if (locationManagerH.isProviderEnabled("network")) {
                        Log.d("LocationClient", "start:network, min_t:" + (this.f25472f / 1000.0f) + ",min_d:" + this.f25473g);
                        locationManagerH.requestLocationUpdates("network", this.f25472f, this.f25473g, this.f25474h);
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
            x(true);
            Location location = f25461m;
            if (location != null) {
                s(location);
            }
            return true;
        } catch (IllegalArgumentException e11) {
            e11.printStackTrace();
            Toast.makeText(context, "无法获取位置", 0).show();
            LocationManager locationManager = f25462n;
            if (locationManager != null) {
                locationManager.removeUpdates(this.f25474h);
            }
            return false;
        } catch (SecurityException e12) {
            e12.printStackTrace();
            Toast.makeText(context, "无法获取位置", 0).show();
            LocationManager locationManager2 = f25462n;
            if (locationManager2 != null) {
                locationManager2.removeUpdates(this.f25474h);
            }
            return false;
        }
    }

    public static final void n(Context context, d dVar) {
        f25458j.d(context, dVar);
    }

    public static final boolean q(Context context) {
        return f25458j.n(context);
    }

    private final void w(boolean z10) {
        if (z10 == this.f25475i) {
            return;
        }
        this.f25475i = z10;
        if (z10) {
            mi.c.e().q(this);
        } else {
            mi.c.e().t(this);
        }
    }

    private final void x(boolean z10) {
        if (z10 == this.f25469c) {
            return;
        }
        this.f25469c = z10;
        if (z10) {
            int i10 = f25466r + 1;
            f25466r = i10;
            Log.d("LocationClient", "startUpdate:" + i10);
            return;
        }
        int i11 = f25466r - 1;
        f25466r = i11;
        Log.d("LocationClient", "stopUpdate:" + i11);
        LocationManager locationManager = f25462n;
        if (locationManager != null) {
            locationManager.removeUpdates(this.f25474h);
        }
    }

    private final void y(boolean z10) {
        if (this.f25470d == z10) {
            return;
        }
        this.f25470d = z10;
        if (!z10) {
            x(false);
        }
        t();
    }

    public final Location o() {
        return f25458j.g(this.f25468b);
    }

    @mi.m(threadMode = ThreadMode.MAIN_ORDERED)
    public final void onMessageEvent(c0 c0Var) {
        m.e(c0Var, "event");
        if (c0Var.b() != 2) {
            return;
        }
        for (int i10 : c0Var.a()) {
            if (i10 != 0) {
                return;
            }
        }
        A();
    }

    public final r5.c p() {
        return this.f25467a;
    }

    public final boolean r() {
        return this.f25470d;
    }

    public void s(Location location) {
        r5.c cVar;
        m.e(location, "location");
        if (f25460l) {
            Log.d("LocationClient", "new    location from:" + location.getProvider() + " delay: " + (System.currentTimeMillis() - location.getTime()));
        }
        f25458j.r(location, this);
        Location location2 = f25461m;
        if (location2 == null || (cVar = this.f25467a) == null) {
            return;
        }
        cVar.a(location2, location);
    }

    public final boolean u(long j10, float f10) {
        y(true);
        this.f25472f = j10;
        this.f25473g = f10;
        Log.d("LocationClient", "request:min_t:" + j10 + "ms,min_d:" + f10 + "m");
        return A();
    }

    public final void v() {
        LocationManager locationManager;
        try {
            String str = this.f25471e;
            if (str == null || (locationManager = f25462n) == null) {
                return;
            }
            locationManager.requestSingleUpdate(str, this.f25474h, Looper.getMainLooper());
        } catch (SecurityException e10) {
            e10.printStackTrace();
        }
    }

    public final void z() {
        Log.d("LocationClient", "stop");
        y(false);
        x(false);
        w(false);
    }

    public void t() {
    }
}
