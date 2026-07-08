package com.dw.ht;

import a0.k;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.os.IBinder;
import c5.q0;
import com.benshikj.ht.R;
import com.dw.android.app.FragmentShowActivity;
import com.dw.ht.Cfg;
import com.dw.ht.entitys.Marker;
import com.ekito.simpleKML.model.Coordinate;
import com.ekito.simpleKML.model.Coordinates;
import com.ekito.simpleKML.model.Document;
import com.ekito.simpleKML.model.Kml;
import com.ekito.simpleKML.model.LineString;
import com.ekito.simpleKML.model.Placemark;
import com.ekito.simpleKML.model.Point;
import com.facebook.stetho.websocket.CloseCodes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import tg.z0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0013\u0018\u0000 \u00172\u00020\u00012\u00020\u0002:\u0002Z[B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\u000e2\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010\"\u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001fH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u000eH\u0016¢\u0006\u0004\b$\u0010\u0004J\u000f\u0010%\u001a\u00020\u000eH\u0016¢\u0006\u0004\b%\u0010\u0004J\u0019\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b'\u0010(J\u0019\u0010)\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b)\u0010\u0014J\u0017\u0010,\u001a\u00020\u00192\b\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b,\u0010-J'\u00102\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020*2\u0006\u0010/\u001a\u00020\u001f2\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020*H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020*H\u0016¢\u0006\u0004\b6\u00105R\u0018\u00109\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R&\u0010<\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010@\u001a\u00020=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010C\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010BR:\u0010H\u001a&\u0012\f\u0012\n E*\u0004\u0018\u00010\u00060\u0006 E*\u0012\u0012\f\u0012\n E*\u0004\u0018\u00010\u00060\u0006\u0018\u00010D0D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\"\u0010P\u001a\u00020I8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u0018\u0010R\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010QR\u0016\u0010U\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010W\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010VR\u0016\u0010Y\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010V¨\u0006\\"}, d2 = {"Lcom/dw/ht/TrackRecordingService;", "Lcom/dw/ht/l;", "Lr5/c;", "<init>", "()V", "Ljava/util/ArrayList;", "Lcom/dw/ht/entitys/Marker;", "Lkotlin/collections/ArrayList;", "q", "()Ljava/util/ArrayList;", "", "w", "()Ljava/util/List;", "mark", "Ldd/d0;", "o", "(Lcom/dw/ht/entitys/Marker;)V", "Landroid/location/Location;", "location", "r", "(Landroid/location/Location;)V", "", "interval", "v", "(J)V", "", "sync", "t", "(Z)V", "Landroid/content/Intent;", "intent", "", "flags", "startId", "onStartCommand", "(Landroid/content/Intent;II)I", "onCreate", "f", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "onLocationChanged", "", "name", "p", "(Ljava/lang/String;)Z", "provider", "status", "Landroid/os/Bundle;", "extras", "onStatusChanged", "(Ljava/lang/String;ILandroid/os/Bundle;)V", "onProviderEnabled", "(Ljava/lang/String;)V", "onProviderDisabled", "c", "Lcom/dw/ht/entitys/Marker;", "lastMark", "d", "Ljava/util/ArrayList;", "marks", "", "e", "Ljava/lang/Object;", "markLock", "Lo5/g;", "Lo5/g;", "mLocationClient", "Lio/objectbox/a;", "kotlin.jvm.PlatformType", "g", "Lio/objectbox/a;", "markerBox", "", "h", "D", "getLongitude", "()D", "setLongitude", "(D)V", "longitude", "Landroid/location/Location;", "lastLocation", "s", "Z", "justAcceptGPS", "J", "points", "u", "total", "b", "a", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TrackRecordingService extends l implements r5.c {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static TrackRecordingService f5573x;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Marker lastMark;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private o5.g mLocationClient;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private Location lastLocation;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private long points;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private long total;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static int f5572w = CloseCodes.NORMAL_CLOSURE;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static ArrayList f5574y = a6.o.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private ArrayList marks = new ArrayList(f5572w);

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Object markLock = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private io.objectbox.a markerBox = j0.i().k(Marker.class);

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private double longitude = -179.0d;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private boolean justAcceptGPS = true;

    /* JADX INFO: renamed from: com.dw.ht.TrackRecordingService$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: com.dw.ht.TrackRecordingService$a$a, reason: collision with other inner class name */
        static final class C0084a extends jd.m implements qd.p {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f5585e;

            C0084a(hd.e eVar) {
                super(2, eVar);
            }

            @Override // jd.a
            public final hd.e g(Object obj, hd.e eVar) {
                return new C0084a(eVar);
            }

            @Override // jd.a
            public final Object o(Object obj) throws Throwable {
                id.b.e();
                if (this.f5585e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dd.s.b(obj);
                TrackRecordingService.INSTANCE.e();
                return dd.d0.f10897a;
            }

            @Override // qd.p
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public final Object s(tg.d0 d0Var, hd.e eVar) {
                return ((C0084a) g(d0Var, eVar)).o(dd.d0.f10897a);
            }
        }

        public /* synthetic */ Companion(rd.h hVar) {
            this();
        }

        private final Kml h() {
            List<Marker> listG = j0.i().k(Marker.class).g();
            ArrayList arrayListA = a6.o.a();
            rd.m.d(arrayListA, "newArrayList(...)");
            Coordinates coordinates = new Coordinates();
            Marker marker = null;
            float fB = 0.0f;
            for (Marker marker2 : listG) {
                Coordinate coordinate = new Coordinate(Double.valueOf(marker2.getLongitude()), Double.valueOf(marker2.getLatitude()), marker2.getAltitude());
                coordinates.getList().add(coordinate);
                if (marker2.getTitle() != null) {
                    Placemark placemark = new Placemark();
                    Point point = new Point();
                    point.setCoordinates(coordinate);
                    placemark.setGeometry(point);
                    placemark.setName(marker2.getTitle());
                    arrayListA.add(placemark);
                }
                if (marker != null) {
                    fB += o5.h.b(marker2.getLongitude(), marker2.getLatitude(), marker.getLongitude(), marker.getLatitude());
                }
                if (coordinates.getList().size() >= 1000) {
                    LineString lineString = new LineString();
                    lineString.setCoordinates(coordinates);
                    Placemark placemark2 = new Placemark();
                    placemark2.setGeometry(lineString);
                    arrayListA.add(placemark2);
                    coordinates = new Coordinates();
                    coordinates.getList().add(coordinate);
                }
                marker = marker2;
            }
            if (coordinates.getList().size() >= 1) {
                LineString lineString2 = new LineString();
                lineString2.setCoordinates(coordinates);
                Placemark placemark3 = new Placemark();
                placemark3.setGeometry(lineString2);
                arrayListA.add(placemark3);
            }
            Document document = new Document();
            document.setFeatureList(arrayListA);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a6.m.f());
            sb2.append(fB > 0.0f ? '-' + o5.h.e(fB) : "");
            document.setName(sb2.toString());
            Kml kml = new Kml();
            kml.setFeature(document);
            return kml;
        }

        public final int a() {
            return TrackRecordingService.f5572w;
        }

        public final TrackRecordingService b() {
            return TrackRecordingService.f5573x;
        }

        public final boolean c() {
            return Cfg.f5482d || k0.f();
        }

        public final ArrayList d(b bVar) {
            ArrayList arrayListQ;
            rd.m.e(bVar, "cb");
            TrackRecordingService.f5574y.add(bVar);
            TrackRecordingService trackRecordingServiceB = b();
            return (trackRecordingServiceB == null || (arrayListQ = trackRecordingServiceB.q()) == null) ? new ArrayList() : arrayListQ;
        }

        public final void e() throws Throwable {
            try {
                a6.t.d("mark to kml");
                TrackRecordingService trackRecordingServiceB = b();
                if (trackRecordingServiceB != null) {
                    TrackRecordingService.u(trackRecordingServiceB, false, 1, null);
                }
                z4.h.i().f(h());
                j0.i().k(Marker.class).x();
                a6.t.b("mark to kml", "TrackRecordingService");
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public final void f(int i10) {
            if (i10 < 10) {
                i10 = 10;
            }
            TrackRecordingService.f5572w = i10;
        }

        public final void g(boolean z10) {
            Cfg.Settings settingsO = Cfg.O();
            if (settingsO.recordingTrack == z10) {
                return;
            }
            settingsO.recordingTrack = z10;
            Cfg.O0(settingsO);
            k();
            if (!z10) {
                tg.g.b(z0.f27881a, null, null, new C0084a(null), 3, null);
            }
            mi.c.e().m(Cfg.a.TrackRecordStatusChanged);
        }

        public final void i() {
            g(!Cfg.O().recordingTrack);
        }

        public final void j(b bVar) {
            rd.m.e(bVar, "cb");
            TrackRecordingService.f5574y.remove(bVar);
        }

        public final void k() {
            Intent intent = new Intent(Main.f5555g, (Class<?>) TrackRecordingService.class);
            if (Cfg.O().recordingTrack) {
                l3.f.e(Main.f5555g, intent);
            } else {
                Main.f5555g.stopService(intent);
            }
        }

        private Companion() {
        }
    }

    public interface b {
        void a(Marker marker);

        void b(Marker marker);
    }

    static final class c extends jd.m implements qd.p {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f5586e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f5587f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ TrackRecordingService f5588g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(List list, TrackRecordingService trackRecordingService, hd.e eVar) {
            super(2, eVar);
            this.f5587f = list;
            this.f5588g = trackRecordingService;
        }

        @Override // jd.a
        public final hd.e g(Object obj, hd.e eVar) {
            return new c(this.f5587f, this.f5588g, eVar);
        }

        @Override // jd.a
        public final Object o(Object obj) {
            id.b.e();
            if (this.f5586e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dd.s.b(obj);
            List listE = Cfg.k0().e(this.f5587f);
            this.f5588g.points -= (long) (this.f5587f.size() - listE.size());
            this.f5588g.markerBox.p(listE, listE.size());
            return dd.d0.f10897a;
        }

        @Override // qd.p
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public final Object s(tg.d0 d0Var, hd.e eVar) {
            return ((c) g(d0Var, eVar)).o(dd.d0.f10897a);
        }
    }

    private final void o(Marker mark) {
        synchronized (this.markLock) {
            this.marks.add(mark);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ArrayList q() {
        ArrayList arrayList;
        synchronized (this.markLock) {
            Object objClone = this.marks.clone();
            rd.m.c(objClone, "null cannot be cast to non-null type java.util.ArrayList<com.dw.ht.entitys.Marker>");
            arrayList = (ArrayList) objClone;
        }
        return arrayList;
    }

    private final void r(Location location) {
        long j10;
        Location location2 = this.lastLocation;
        this.total++;
        if (location2 != null) {
            float fDistanceTo = location2.distanceTo(location);
            j10 = 1;
            String str = String.format("onLocationChanged %s%d(%d) %.1f%% 距离：%.1f 精度：%.1f => %.1f %s 海拔：%.0fm 航向：%.0f 速度：%.1fkm/h %.2f,%.2f", Arrays.copyOf(new Object[]{(fDistanceTo > (((float) 1) + location.getAccuracy()) ? 1 : (fDistanceTo == (((float) 1) + location.getAccuracy()) ? 0 : -1)) < 0 ? "-" : "+", Long.valueOf(this.points), Long.valueOf(this.total), Double.valueOf((this.points * ((double) 100)) / this.total), Float.valueOf(fDistanceTo), Float.valueOf(location2.getAccuracy()), Float.valueOf(location.getAccuracy()), location.getProvider(), Double.valueOf(location.getAltitude()), Float.valueOf(location.getBearing()), Double.valueOf(((double) location.getSpeed()) * 3.6d), Double.valueOf(location.getLongitude()), Double.valueOf(location.getLatitude())}, 13));
            rd.m.d(str, "format(...)");
            s3.b.b("TrackRecordingService", str);
        } else {
            j10 = 1;
            s3.b.b("TrackRecordingService", "onLocationChanged");
        }
        this.points += j10;
        this.lastLocation = location;
        Marker marker = new Marker(0L, 0.0d, 0.0d, null, null, null, null, 0L, null, null, null, 2047, null);
        if (location.hasAltitude()) {
            marker.p(Double.valueOf(location.getAltitude()));
        }
        if (location.hasBearing()) {
            marker.q(Float.valueOf(location.getBearing()));
        }
        if (location.hasSpeed()) {
            marker.t(Float.valueOf(location.getSpeed()));
        }
        if (location.hasAccuracy()) {
            marker.o(Float.valueOf(location.getAccuracy()));
        }
        marker.d(location.getLongitude());
        marker.b(location.getLatitude());
        marker.r(location.getTime());
        this.lastMark = marker;
        o(marker);
        if (this.marks.size() >= f5572w) {
            t(false);
        }
        ArrayList arrayList = f5574y;
        rd.m.d(arrayList, "callbacks");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(marker);
        }
    }

    public static final ArrayList s(b bVar) {
        return INSTANCE.d(bVar);
    }

    private final void t(boolean sync) {
        List listW = w();
        if (listW.isEmpty()) {
            return;
        }
        if (!sync) {
            tg.g.b(z0.f27881a, null, null, new c(listW, this, null), 3, null);
            return;
        }
        List listE = Cfg.k0().e(listW);
        this.points -= (long) (listW.size() - listE.size());
        this.markerBox.p(listE, listE.size());
    }

    static /* synthetic */ void u(TrackRecordingService trackRecordingService, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        trackRecordingService.t(z10);
    }

    private final void v(long interval) {
        float f10 = INSTANCE.c() ? 5.0f : 50.0f;
        s3.b.b("TrackRecordingService", " request update interval:" + (interval / ((long) CloseCodes.NORMAL_CLOSURE)) + "s, min distance:" + f10);
        o5.g gVar = this.mLocationClient;
        if (gVar != null) {
            gVar.u(interval, f10);
        }
    }

    private final List w() {
        ArrayList arrayList;
        synchronized (this.markLock) {
            arrayList = this.marks;
            this.marks = new ArrayList(f5572w);
        }
        return arrayList;
    }

    public static final void x() {
        INSTANCE.i();
    }

    public static final void y(b bVar) {
        INSTANCE.j(bVar);
    }

    public static final void z() {
        INSTANCE.k();
    }

    @Override // r5.c
    public /* synthetic */ void a(Location location, Location location2) {
        r5.b.a(this, location, location2);
    }

    @Override // com.dw.ht.l
    public void f() {
        u(this, false, 1, null);
        f5573x = null;
        o5.g gVar = this.mLocationClient;
        if (gVar != null) {
            gVar.z();
        }
        Object systemService = getSystemService("notification");
        rd.m.c(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).cancel(R.drawable.ic_stat_track_rec);
        s3.b.b("TrackRecordingService", "on destroy");
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        rd.m.e(intent, "intent");
        return null;
    }

    @Override // com.dw.ht.l, android.app.Service
    public void onCreate() {
        s3.b.b("TrackRecordingService", "on create");
        super.onCreate();
        Notification notificationC = new k.d(this, l3.e.f20374b).q(-2).i(PendingIntent.getActivity(this, 0, FragmentShowActivity.d2(this, null, q0.class), 67108864)).k(getString(R.string.recording_track)).s(R.drawable.ic_stat_track_rec).c();
        rd.m.d(notificationC, "build(...)");
        try {
            startForeground(R.drawable.ic_stat_track_rec, notificationC);
        } catch (Exception unused) {
            Object systemService = getSystemService("notification");
            rd.m.c(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            ((NotificationManager) systemService).notify(R.drawable.ic_stat_track_rec, notificationC);
        }
        f5573x = this;
        this.mLocationClient = new o5.g(this, this);
    }

    @Override // r5.c, android.location.LocationListener
    public void onLocationChanged(Location location) {
        Location locationD = o5.g.f23195s.d(location, this.mLocationClient);
        if (locationD == null) {
            return;
        }
        if (!this.justAcceptGPS || rd.m.a(locationD.getProvider(), "gps")) {
            r(locationD);
            return;
        }
        s3.b.b("TrackRecordingService", "onLocationChanged 忽略 provider: " + locationD.getProvider());
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
        s3.b.b("TrackRecordingService", "start");
        v(1000L);
        return 1;
    }

    @Override // android.location.LocationListener
    public void onStatusChanged(String provider, int status, Bundle extras) {
        rd.m.e(provider, "provider");
        rd.m.e(extras, "extras");
    }

    public final boolean p(String name) {
        Marker marker = this.lastMark;
        if (marker == null) {
            return false;
        }
        marker.u(name);
        if (marker.getId() != 0) {
            this.markerBox.n(marker);
        }
        ArrayList arrayList = f5574y;
        rd.m.d(arrayList, "callbacks");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((b) it.next()).b(marker);
        }
        return true;
    }
}
