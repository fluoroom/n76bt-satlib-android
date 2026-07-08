package com.dw.ht.map;

import a0.k;
import a0.n;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import c5.m0;
import com.benshikj.ht.R;
import com.dw.ht.j0;
import com.dw.ht.k;
import com.dw.ht.map.OfflineMapDownloadService;
import com.dw.ht.map.a;
import com.dw.ht.map.entitys.SatelliteOfflineMapItem;
import com.facebook.stetho.server.http.HttpStatus;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import dd.d0;
import io.objectbox.query.Query;
import io.objectbox.query.QueryBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import l3.e;
import qd.l;
import rd.a0;
import rd.g0;
import rd.h;
import rd.m;
import z4.j;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u0000 \n2\u00020\u0001:\u0004\u001e\"\u0010&B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u0003J\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0003J)\u0010\u0016\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001c\u0010$\u001a\b\u0018\u00010!R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010.\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010+R\u0018\u00102\u001a\u00060/R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00104\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010\u001fR*\u0010<\u001a\u0002052\u0006\u00106\u001a\u0002058\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b7\u0010;R\u0016\u0010>\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b=\u0010\r¨\u0006?"}, d2 = {"Lcom/dw/ht/map/OfflineMapDownloadService;", "Lcom/dw/ht/k;", "<init>", "()V", "Lz4/j;", "layer", "Landroid/app/PendingIntent;", "n", "(Lz4/j;)Landroid/app/PendingIntent;", "Ldd/d0;", "s", "Lcom/dw/ht/map/entitys/SatelliteOfflineMapItem;", "q", "()Lcom/dw/ht/map/entitys/SatelliteOfflineMapItem;", "t", "onCreate", "a", "Landroid/content/Intent;", "intent", "", "flags", "startId", "onStartCommand", "(Landroid/content/Intent;II)I", "onHandleIntent", "(Landroid/content/Intent;)V", "Lio/objectbox/a;", "Lio/objectbox/a;", "box", "Ljava/lang/Object;", "b", "Ljava/lang/Object;", "inDownloadTaskLock", "Lcom/dw/ht/map/OfflineMapDownloadService$c;", "c", "Lcom/dw/ht/map/OfflineMapDownloadService$c;", "downloadTask", "La0/n;", "d", "La0/n;", "manager", "La0/k$a;", "e", "La0/k$a;", "cancelAction", "f", "continueAction", "Lcom/dw/ht/map/OfflineMapDownloadService$d;", "g", "Lcom/dw/ht/map/OfflineMapDownloadService$d;", "wifiReceiver", "h", "wifiLock", "", "value", "r", "Z", "p", "()Z", "(Z)V", "wifiIsConnected", "o", "inDownload", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OfflineMapDownloadService extends k {

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static OfflineMapDownloadService f6492t;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private io.objectbox.a box;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Object inDownloadTaskLock;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private c downloadTask;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private n manager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private k.a cancelAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private k.a continueAction;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final d wifiReceiver;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Object wifiLock;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean wifiIsConnected;

    /* JADX INFO: renamed from: com.dw.ht.map.OfflineMapDownloadService$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final void a(Context context, long j10) {
            m.e(context, "context");
            Intent intent = new Intent(context, (Class<?>) OfflineMapDownloadService.class);
            intent.setAction("com.dw.ht.map.action.CANCEL_DOWNLOAD");
            intent.putExtra("android.intent.extra.UID", j10);
            context.startService(intent);
        }

        public final c b() {
            OfflineMapDownloadService offlineMapDownloadServiceC = c();
            if (offlineMapDownloadServiceC != null) {
                return offlineMapDownloadServiceC.downloadTask;
            }
            return null;
        }

        public final OfflineMapDownloadService c() {
            return OfflineMapDownloadService.f6492t;
        }

        public final boolean d(Context context) {
            m.e(context, "context");
            if (Build.VERSION.SDK_INT < 23) {
                return true;
            }
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService(ConnectivityManager.class);
            NetworkInfo networkInfo = connectivityManager != null ? connectivityManager.getNetworkInfo(1) : null;
            return networkInfo != null && networkInfo.isConnected();
        }

        public final void e(Context context) {
            SatelliteOfflineMapItem satelliteOfflineMapItemO;
            SatelliteOfflineMapItem satelliteOfflineMapItemQ;
            m.e(context, "context");
            OfflineMapDownloadService offlineMapDownloadServiceC = c();
            if (offlineMapDownloadServiceC != null && offlineMapDownloadServiceC.o() != null && (satelliteOfflineMapItemO = offlineMapDownloadServiceC.o()) != null && satelliteOfflineMapItemO.getJustDownloadInWifi() && !offlineMapDownloadServiceC.getWifiIsConnected() && (satelliteOfflineMapItemQ = offlineMapDownloadServiceC.q()) != null && !satelliteOfflineMapItemQ.getJustDownloadInWifi()) {
                offlineMapDownloadServiceC.stopSelf();
            }
            Intent intent = new Intent(context, (Class<?>) OfflineMapDownloadService.class);
            intent.setAction("com.dw.ht.map.action.DOWNLOAD");
            context.startService(intent);
        }

        private Companion() {
        }
    }

    private final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SatelliteOfflineMapItem f6502a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList f6503b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final LatLngBounds f6504c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f6505d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final long f6506e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f6507f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final com.dw.ht.map.b f6508g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final PendingIntent f6509h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final k.d f6510i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f6511j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ OfflineMapDownloadService f6512k;

        public b(OfflineMapDownloadService offlineMapDownloadService, SatelliteOfflineMapItem satelliteOfflineMapItem, ArrayList arrayList) {
            String title;
            m.e(satelliteOfflineMapItem, "item");
            m.e(arrayList, "other");
            this.f6512k = offlineMapDownloadService;
            this.f6502a = satelliteOfflineMapItem;
            this.f6503b = arrayList;
            LatLngBounds latLngBoundsA = satelliteOfflineMapItem.a();
            this.f6504c = latLngBoundsA;
            int zoom = satelliteOfflineMapItem.getZoom();
            this.f6505d = zoom;
            this.f6506e = a.f6530d.e(latLngBoundsA, zoom);
            this.f6508g = com.dw.ht.map.b.f6534a.a(offlineMapDownloadService, satelliteOfflineMapItem.f());
            PendingIntent pendingIntentN = offlineMapDownloadService.n(satelliteOfflineMapItem.f());
            this.f6509h = pendingIntentN;
            k.d dVarP = new k.d(offlineMapDownloadService, e.f20375c).p(true);
            g0 g0Var = g0.f25951a;
            Locale locale = Locale.getDefault();
            String string = offlineMapDownloadService.getString(R.string.deleting_s);
            m.d(string, "getString(...)");
            if (satelliteOfflineMapItem.getTitle().length() == 0) {
                Locale locale2 = Locale.getDefault();
                String string2 = offlineMapDownloadService.getString(R.string.offline_map_i);
                m.d(string2, "getString(...)");
                title = String.format(locale2, string2, Arrays.copyOf(new Object[]{Long.valueOf(satelliteOfflineMapItem.getId())}, 1));
                m.d(title, "format(...)");
            } else {
                title = satelliteOfflineMapItem.getTitle();
            }
            String str = String.format(locale, string, Arrays.copyOf(new Object[]{title}, 1));
            m.d(str, "format(...)");
            k.d dVarR = dVarP.k(str).s(2131231107).i(pendingIntentN).r(HttpStatus.HTTP_OK, 0, true);
            m.d(dVarR, "setProgress(...)");
            this.f6510i = dVarR;
        }

        public final void a(int i10, int i11, int i12) {
            long j10 = this.f6507f + 1;
            this.f6507f = j10;
            int i13 = (int) ((j10 * ((long) HttpStatus.HTTP_OK)) / this.f6506e);
            if (i13 != this.f6511j) {
                this.f6511j = i13;
                this.f6510i.r(HttpStatus.HTTP_OK, i13, false);
                n nVar = this.f6512k.manager;
                if (nVar == null) {
                    m.o("manager");
                    nVar = null;
                }
                nVar.f(2131231107, this.f6510i.c());
            }
            Iterator it = this.f6503b.iterator();
            m.d(it, "iterator(...)");
            while (it.hasNext()) {
                Object next = it.next();
                m.d(next, "next(...)");
                if (a.f6530d.a((LatLngBounds) next, i12, i10, i11)) {
                    return;
                }
            }
            this.f6508g.c(i10, i11, i12);
        }

        public final void b(a aVar, a aVar2) {
            m.e(aVar, "northeast");
            m.e(aVar2, "southwest");
            int iD = a.f6530d.d(aVar.c());
            if (aVar.b() <= aVar2.b()) {
                int iB = aVar.b();
                int iB2 = aVar2.b();
                if (iB > iB2) {
                    return;
                }
                while (true) {
                    c(aVar2, aVar, iB, iD);
                    if (iB == iB2) {
                        return;
                    } else {
                        iB++;
                    }
                }
            } else {
                for (int iB3 = aVar.b(); iB3 < iD; iB3++) {
                    c(aVar2, aVar, iB3, iD);
                }
                int iB4 = aVar2.b();
                if (iB4 < 0) {
                    return;
                }
                int i10 = 0;
                while (true) {
                    c(aVar2, aVar, i10, iD);
                    if (i10 == iB4) {
                        return;
                    } else {
                        i10++;
                    }
                }
            }
        }

        public final void c(a aVar, a aVar2, int i10, int i11) {
            m.e(aVar, "southwest");
            m.e(aVar2, "northeast");
            if (aVar.a() <= aVar2.a()) {
                int iA = aVar.a();
                int iA2 = aVar2.a();
                if (iA > iA2) {
                    return;
                }
                while (true) {
                    a(iA, i10, aVar2.c());
                    if (iA == iA2) {
                        return;
                    } else {
                        iA++;
                    }
                }
            } else {
                for (int iA3 = aVar.a(); iA3 < i11; iA3++) {
                    a(iA3, i10, aVar2.c());
                }
                int iA4 = aVar2.a();
                if (iA4 < 0) {
                    return;
                }
                int i12 = 0;
                while (true) {
                    a(i12, i10, aVar2.c());
                    if (i12 == iA4) {
                        return;
                    } else {
                        i12++;
                    }
                }
            }
        }

        public final void d() {
            n nVar = null;
            io.objectbox.a aVar = null;
            n nVar2 = null;
            if (this.f6506e == 0) {
                io.objectbox.a aVar2 = this.f6512k.box;
                if (aVar2 == null) {
                    m.o("box");
                } else {
                    aVar = aVar2;
                }
                aVar.v(this.f6502a.getId());
                return;
            }
            try {
                n nVar3 = this.f6512k.manager;
                if (nVar3 == null) {
                    m.o("manager");
                    nVar3 = null;
                }
                nVar3.f(2131231107, this.f6510i.c());
                int i10 = this.f6505d;
                if (i10 >= 0) {
                    int i11 = 0;
                    while (true) {
                        a.C0092a c0092a = a.f6530d;
                        LatLng latLng = this.f6504c.f7323b;
                        m.d(latLng, "northeast");
                        a aVarF = c0092a.f(i11, latLng);
                        LatLng latLng2 = this.f6504c.f7322a;
                        m.d(latLng2, "southwest");
                        b(aVarF, c0092a.f(i11, latLng2));
                        if (i11 == i10) {
                            break;
                        } else {
                            i11++;
                        }
                    }
                }
                io.objectbox.a aVar3 = this.f6512k.box;
                if (aVar3 == null) {
                    m.o("box");
                    aVar3 = null;
                }
                aVar3.v(this.f6502a.getId());
                n nVar4 = this.f6512k.manager;
                if (nVar4 == null) {
                    m.o("manager");
                } else {
                    nVar2 = nVar4;
                }
                nVar2.b(2131231107);
            } catch (Throwable th2) {
                n nVar5 = this.f6512k.manager;
                if (nVar5 == null) {
                    m.o("manager");
                } else {
                    nVar = nVar5;
                }
                nVar.b(2131231107);
                throw th2;
            }
        }
    }

    public final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SatelliteOfflineMapItem f6513a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final LatLngBounds f6514b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f6515c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f6516d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f6517e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private AtomicLong f6518f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private AtomicLong f6519g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final com.dw.ht.map.b f6520h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final PendingIntent f6521i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final k.d f6522j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private hc.c f6523k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f6524l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f6525m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private long f6526n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ OfflineMapDownloadService f6527o;

        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f6528a;

            static {
                int[] iArr = new int[SatelliteOfflineMapItem.a.values().length];
                try {
                    iArr[SatelliteOfflineMapItem.a.f6552d.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[SatelliteOfflineMapItem.a.f6550b.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f6528a = iArr;
            }
        }

        public c(OfflineMapDownloadService offlineMapDownloadService, SatelliteOfflineMapItem satelliteOfflineMapItem) {
            m.e(satelliteOfflineMapItem, "item");
            this.f6527o = offlineMapDownloadService;
            this.f6513a = satelliteOfflineMapItem;
            LatLngBounds latLngBoundsA = satelliteOfflineMapItem.a();
            this.f6514b = latLngBoundsA;
            int iMin = Math.min(satelliteOfflineMapItem.getZoom(), satelliteOfflineMapItem.f().f());
            this.f6515c = iMin;
            this.f6516d = com.dw.ht.map.a.f6530d.e(latLngBoundsA, iMin);
            SatelliteOfflineMapItem.a status = satelliteOfflineMapItem.getStatus();
            int i10 = status == null ? -1 : a.f6528a[status.ordinal()];
            this.f6517e = i10 == 1 || i10 == 2;
            this.f6518f = new AtomicLong(0L);
            this.f6519g = new AtomicLong(0L);
            this.f6520h = com.dw.ht.map.b.f6534a.a(offlineMapDownloadService, satelliteOfflineMapItem.f());
            PendingIntent pendingIntentN = offlineMapDownloadService.n(satelliteOfflineMapItem.f());
            this.f6521i = pendingIntentN;
            k.d dVarP = new k.d(offlineMapDownloadService, e.f20375c).p(true);
            g0 g0Var = g0.f25951a;
            Locale locale = Locale.getDefault();
            String string = offlineMapDownloadService.getString(R.string.downloading_s);
            m.d(string, "getString(...)");
            String str = String.format(locale, string, Arrays.copyOf(new Object[]{m()}, 1));
            m.d(str, "format(...)");
            k.d dVarR = dVarP.k(str).s(2131231107).j(a6.m.q(this.f6518f.get())).i(pendingIntentN).r(HttpStatus.HTTP_OK, 0, true);
            k.a aVar = offlineMapDownloadService.cancelAction;
            if (aVar == null) {
                m.o("cancelAction");
                aVar = null;
            }
            k.d dVarB = dVarR.b(aVar);
            m.d(dVarB, "addAction(...)");
            this.f6522j = dVarB;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void s(final c cVar, final a0 a0Var, final hc.d dVar) {
            m.e(dVar, "emitter");
            int i10 = cVar.f6515c;
            if (i10 >= 0) {
                int i11 = 0;
                while (true) {
                    a.C0092a c0092a = com.dw.ht.map.a.f6530d;
                    LatLng latLng = cVar.f6514b.f7323b;
                    m.d(latLng, "northeast");
                    com.dw.ht.map.a aVarF = c0092a.f(i11, latLng);
                    LatLng latLng2 = cVar.f6514b.f7322a;
                    m.d(latLng2, "southwest");
                    cVar.j(aVarF, c0092a.f(i11, latLng2), new mc.c() { // from class: z4.q
                        @Override // mc.c
                        public final void accept(Object obj) throws InterruptedException {
                            OfflineMapDownloadService.c.t(dVar, cVar, a0Var, (com.dw.ht.map.a) obj);
                        }
                    });
                    if (cVar.p() || i11 == i10) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            dVar.onComplete();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void t(hc.d dVar, c cVar, a0 a0Var, com.dw.ht.map.a aVar) throws InterruptedException {
            while (!dVar.isCancelled() && !cVar.p() && dVar.a() <= 0) {
                Thread.sleep(100L);
            }
            if (cVar.p()) {
                return;
            }
            a0Var.f25932a++;
            dVar.onNext(aVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ck.a u(final c cVar, com.dw.ht.map.a aVar) {
            m.e(aVar, "tileIndex");
            hc.c cVarJ = hc.c.h(aVar).j(zc.a.b());
            final l lVar = new l() { // from class: z4.r
                @Override // qd.l
                public final Object l(Object obj) {
                    return OfflineMapDownloadService.c.v(this.f32960a, (com.dw.ht.map.a) obj);
                }
            };
            return cVarJ.i(new mc.d() { // from class: z4.s
                @Override // mc.d
                public final Object apply(Object obj) {
                    return OfflineMapDownloadService.c.w(lVar, obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Boolean v(c cVar, com.dw.ht.map.a aVar) {
            m.e(aVar, "it");
            cVar.h(aVar);
            return Boolean.TRUE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Boolean w(l lVar, Object obj) {
            m.e(obj, "p0");
            return (Boolean) lVar.l(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ck.a x(l lVar, Object obj) {
            m.e(obj, "p0");
            return (ck.a) lVar.l(obj);
        }

        public final void g() {
            n nVar;
            Object obj = this.f6527o.inDownloadTaskLock;
            OfflineMapDownloadService offlineMapDownloadService = this.f6527o;
            synchronized (obj) {
                try {
                    nVar = null;
                    if (m.a(offlineMapDownloadService.downloadTask, this)) {
                        offlineMapDownloadService.downloadTask = null;
                    }
                    d0 d0Var = d0.f10897a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Object obj2 = this.f6527o.wifiLock;
            OfflineMapDownloadService offlineMapDownloadService2 = this.f6527o;
            synchronized (obj2) {
                offlineMapDownloadService2.wifiLock.notifyAll();
            }
            n nVar2 = this.f6527o.manager;
            if (nVar2 == null) {
                m.o("manager");
            } else {
                nVar = nVar2;
            }
            nVar.b(2131231107);
        }

        public final void h(com.dw.ht.map.a aVar) {
            int iD;
            m.e(aVar, "tile");
            n nVar = null;
            if (!this.f6527o.getWifiIsConnected() && this.f6513a.getJustDownloadInWifi()) {
                k.d dVar = this.f6522j;
                OfflineMapDownloadService offlineMapDownloadService = this.f6527o;
                synchronized (dVar) {
                    try {
                        if (p()) {
                            return;
                        }
                        if (!offlineMapDownloadService.getWifiIsConnected() && this.f6513a.getJustDownloadInWifi()) {
                            q(true);
                            ArrayList arrayList = this.f6522j.f44b;
                            k.a aVar2 = offlineMapDownloadService.continueAction;
                            if (aVar2 == null) {
                                m.o("continueAction");
                                aVar2 = null;
                            }
                            arrayList.remove(aVar2);
                            k.d dVarR = this.f6522j.j(offlineMapDownloadService.getString(R.string.waitingForWifi)).r(HttpStatus.HTTP_OK, this.f6525m, false);
                            k.a aVar3 = offlineMapDownloadService.continueAction;
                            if (aVar3 == null) {
                                m.o("continueAction");
                                aVar3 = null;
                            }
                            dVarR.b(aVar3);
                            n nVar2 = offlineMapDownloadService.manager;
                            if (nVar2 == null) {
                                m.o("manager");
                                nVar2 = null;
                            }
                            nVar2.f(2131231107, this.f6522j.c());
                            ArrayList arrayList2 = this.f6522j.f44b;
                            k.a aVar4 = offlineMapDownloadService.continueAction;
                            if (aVar4 == null) {
                                m.o("continueAction");
                                aVar4 = null;
                            }
                            arrayList2.remove(aVar4);
                            synchronized (offlineMapDownloadService.wifiLock) {
                                offlineMapDownloadService.wifiLock.wait();
                                d0 d0Var = d0.f10897a;
                            }
                            q(false);
                        }
                        d0 d0Var2 = d0.f10897a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            if (!p() && (iD = this.f6520h.d(aVar.a(), aVar.b(), aVar.c(), this.f6517e)) >= 0) {
                this.f6518f.addAndGet(iD);
                this.f6519g.addAndGet(1L);
                if (p()) {
                    return;
                }
                int i10 = (int) ((this.f6519g.get() * ((long) HttpStatus.HTTP_OK)) / this.f6516d);
                if (SystemClock.elapsedRealtime() - this.f6526n > 1000) {
                    if (iD == 0 && i10 == this.f6525m) {
                        return;
                    }
                    this.f6525m = i10;
                    k.d dVar2 = this.f6522j;
                    OfflineMapDownloadService offlineMapDownloadService2 = this.f6527o;
                    synchronized (dVar2) {
                        try {
                            k.d dVar3 = this.f6522j;
                            g0 g0Var = g0.f25951a;
                            Locale locale = Locale.getDefault();
                            String strQ = a6.m.q(this.f6518f.get());
                            m.d(strQ, "size(...)");
                            String str = String.format(locale, strQ, Arrays.copyOf(new Object[0], 0));
                            m.d(str, "format(...)");
                            dVar3.j(str).r(HttpStatus.HTTP_OK, this.f6525m, false);
                            n nVar3 = offlineMapDownloadService2.manager;
                            if (nVar3 == null) {
                                m.o("manager");
                            } else {
                                nVar = nVar3;
                            }
                            nVar.f(2131231107, this.f6522j.c());
                            mi.c.e().m(this);
                            d0 d0Var3 = d0.f10897a;
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    this.f6526n = SystemClock.elapsedRealtime();
                }
            }
        }

        public final void i(com.dw.ht.map.a aVar, com.dw.ht.map.a aVar2, int i10, int i11, mc.c cVar) {
            m.e(aVar, "southwest");
            m.e(aVar2, "northeast");
            m.e(cVar, "emitter");
            if (aVar.a() <= aVar2.a()) {
                int iA = aVar.a();
                int iA2 = aVar2.a();
                if (iA <= iA2) {
                    while (!p()) {
                        cVar.accept(new com.dw.ht.map.a(iA, i10, aVar2.c()));
                        if (iA == iA2) {
                            return;
                        } else {
                            iA++;
                        }
                    }
                    return;
                }
                return;
            }
            for (int iA3 = aVar.a(); iA3 < i11; iA3++) {
                if (p()) {
                    return;
                }
                cVar.accept(new com.dw.ht.map.a(iA3, i10, aVar2.c()));
            }
            int iA4 = aVar2.a();
            if (iA4 >= 0) {
                int i12 = 0;
                while (!p()) {
                    cVar.accept(new com.dw.ht.map.a(i12, i10, aVar2.c()));
                    if (i12 == iA4) {
                        return;
                    } else {
                        i12++;
                    }
                }
            }
        }

        public final void j(com.dw.ht.map.a aVar, com.dw.ht.map.a aVar2, mc.c cVar) {
            m.e(aVar, "northeast");
            m.e(aVar2, "southwest");
            m.e(cVar, "emitter");
            int iD = com.dw.ht.map.a.f6530d.d(aVar.c());
            if (aVar.b() > aVar2.b()) {
                for (int iB = aVar.b(); iB < iD; iB++) {
                    if (p()) {
                        return;
                    }
                    i(aVar2, aVar, iB, iD, cVar);
                }
                int iB2 = aVar2.b();
                if (iB2 >= 0) {
                    int i10 = 0;
                    while (!p()) {
                        i(aVar2, aVar, i10, iD, cVar);
                        if (i10 == iB2) {
                            return;
                        } else {
                            i10++;
                        }
                    }
                    return;
                }
                return;
            }
            int iB3 = aVar.b();
            int iB4 = aVar2.b();
            if (iB3 <= iB4) {
                int i11 = iB3;
                while (!p()) {
                    com.dw.ht.map.a aVar3 = aVar;
                    com.dw.ht.map.a aVar4 = aVar2;
                    mc.c cVar2 = cVar;
                    i(aVar4, aVar3, i11, iD, cVar2);
                    if (i11 == iB4) {
                        return;
                    }
                    i11++;
                    aVar2 = aVar4;
                    aVar = aVar3;
                    cVar = cVar2;
                }
            }
        }

        public final int k() {
            return (this.f6525m * 100) / HttpStatus.HTTP_OK;
        }

        public final SatelliteOfflineMapItem l() {
            return this.f6513a;
        }

        public final String m() {
            String title = this.f6513a.getTitle();
            OfflineMapDownloadService offlineMapDownloadService = this.f6527o;
            if (title.length() != 0) {
                return title;
            }
            g0 g0Var = g0.f25951a;
            Locale locale = Locale.getDefault();
            String string = offlineMapDownloadService.getString(R.string.offline_map_i);
            m.d(string, "getString(...)");
            String str = String.format(locale, string, Arrays.copyOf(new Object[]{Long.valueOf(this.f6513a.getId())}, 1));
            m.d(str, "format(...)");
            return str;
        }

        public final String n() {
            String string = this.f6524l ? this.f6527o.getString(R.string.waitingForWifi) : this.f6513a.getStatus() == SatelliteOfflineMapItem.a.f6552d ? this.f6527o.getString(R.string.updating) : this.f6527o.getString(R.string.downloading);
            m.b(string);
            return string + " - " + a6.m.q(this.f6518f.get()) + " (" + k() + "%)";
        }

        public final boolean o() {
            return this.f6524l;
        }

        public final boolean p() {
            return !m.a(this.f6527o.downloadTask, this);
        }

        public final void q(boolean z10) {
            if (this.f6524l == z10) {
                return;
            }
            this.f6524l = z10;
            mi.c.e().m(this);
        }

        public final void r() {
            io.objectbox.a aVar = null;
            if (this.f6516d == 0) {
                this.f6513a.s(SatelliteOfflineMapItem.a.f6553e);
                io.objectbox.a aVar2 = this.f6527o.box;
                if (aVar2 == null) {
                    m.o("box");
                } else {
                    aVar = aVar2;
                }
                aVar.n(this.f6513a);
                return;
            }
            try {
                n nVar = this.f6527o.manager;
                if (nVar == null) {
                    m.o("manager");
                    nVar = null;
                }
                nVar.f(2131231107, this.f6522j.c());
                SatelliteOfflineMapItem satelliteOfflineMapItem = this.f6513a;
                SatelliteOfflineMapItem.a status = satelliteOfflineMapItem.getStatus();
                int i10 = status == null ? -1 : a.f6528a[status.ordinal()];
                satelliteOfflineMapItem.s((i10 == 1 || i10 == 2) ? SatelliteOfflineMapItem.a.f6552d : SatelliteOfflineMapItem.a.f6551c);
                io.objectbox.a aVar3 = this.f6527o.box;
                if (aVar3 == null) {
                    m.o("box");
                    aVar3 = null;
                }
                aVar3.n(this.f6513a);
                final a0 a0Var = new a0();
                hc.c cVarJ = hc.c.d(new hc.e() { // from class: z4.n
                    @Override // hc.e
                    public final void a(hc.d dVar) {
                        OfflineMapDownloadService.c.s(this.f32953a, a0Var, dVar);
                    }
                }, hc.a.BUFFER).j(zc.a.b());
                final l lVar = new l() { // from class: z4.o
                    @Override // qd.l
                    public final Object l(Object obj) {
                        return OfflineMapDownloadService.c.u(this.f32955a, (com.dw.ht.map.a) obj);
                    }
                };
                hc.c cVarF = cVarJ.f(new mc.d() { // from class: z4.p
                    @Override // mc.d
                    public final Object apply(Object obj) {
                        return OfflineMapDownloadService.c.x(lVar, obj);
                    }
                }, 3);
                this.f6523k = cVarF;
                if (cVarF != null) {
                    cVarF.b();
                }
                boolean zP = p();
                Object obj = this.f6527o.inDownloadTaskLock;
                OfflineMapDownloadService offlineMapDownloadService = this.f6527o;
                synchronized (obj) {
                    try {
                        if (m.a(offlineMapDownloadService.downloadTask, this)) {
                            offlineMapDownloadService.downloadTask = null;
                        }
                        d0 d0Var = d0.f10897a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                n nVar2 = this.f6527o.manager;
                if (nVar2 == null) {
                    m.o("manager");
                    nVar2 = null;
                }
                nVar2.b(2131231107);
                if (this.f6519g.get() == this.f6516d) {
                    k.d dVar = new k.d(this.f6527o, e.f20373a);
                    g0 g0Var = g0.f25951a;
                    Locale locale = Locale.getDefault();
                    String string = this.f6527o.getString(R.string.s_download_completed);
                    m.d(string, "getString(...)");
                    String str = String.format(locale, string, Arrays.copyOf(new Object[]{m()}, 1));
                    m.d(str, "format(...)");
                    k.d dVarI = dVar.k(str).s(2131231107).i(this.f6521i);
                    m.d(dVarI, "setContentIntent(...)");
                    n nVar3 = this.f6527o.manager;
                    if (nVar3 == null) {
                        m.o("manager");
                        nVar3 = null;
                    }
                    nVar3.f(2131231107, dVarI.c());
                    this.f6513a.s(SatelliteOfflineMapItem.a.f6553e);
                } else if (zP) {
                    this.f6513a.s(SatelliteOfflineMapItem.a.f6554f);
                } else {
                    k.d dVar2 = new k.d(this.f6527o, e.f20373a);
                    g0 g0Var2 = g0.f25951a;
                    Locale locale2 = Locale.getDefault();
                    String string2 = this.f6527o.getString(R.string.s_download_completed);
                    m.d(string2, "getString(...)");
                    String str2 = String.format(locale2, string2, Arrays.copyOf(new Object[]{m()}, 1));
                    m.d(str2, "format(...)");
                    k.d dVarI2 = dVar2.k(str2).j(this.f6527o.getString(R.string.partialDownloadFailed)).s(2131231107).i(this.f6521i);
                    m.d(dVarI2, "setContentIntent(...)");
                    n nVar4 = this.f6527o.manager;
                    if (nVar4 == null) {
                        m.o("manager");
                        nVar4 = null;
                    }
                    nVar4.f(2131231107, dVarI2.c());
                    this.f6513a.s(SatelliteOfflineMapItem.a.f6554f);
                }
                io.objectbox.a aVar4 = this.f6527o.box;
                if (aVar4 == null) {
                    m.o("box");
                    aVar4 = null;
                }
                SatelliteOfflineMapItem satelliteOfflineMapItem2 = (SatelliteOfflineMapItem) aVar4.e(this.f6513a.getId());
                if (satelliteOfflineMapItem2 == null || satelliteOfflineMapItem2.getStatus() == SatelliteOfflineMapItem.a.f6555g) {
                    return;
                }
                satelliteOfflineMapItem2.s(this.f6513a.getStatus());
                io.objectbox.a aVar5 = this.f6527o.box;
                if (aVar5 == null) {
                    m.o("box");
                } else {
                    aVar = aVar5;
                }
                aVar.n(satelliteOfflineMapItem2);
            } catch (Throwable th3) {
                boolean zP2 = p();
                Object obj2 = this.f6527o.inDownloadTaskLock;
                OfflineMapDownloadService offlineMapDownloadService2 = this.f6527o;
                synchronized (obj2) {
                    try {
                        if (m.a(offlineMapDownloadService2.downloadTask, this)) {
                            offlineMapDownloadService2.downloadTask = null;
                        }
                        d0 d0Var2 = d0.f10897a;
                        n nVar5 = this.f6527o.manager;
                        if (nVar5 == null) {
                            m.o("manager");
                            nVar5 = null;
                        }
                        nVar5.b(2131231107);
                        if (this.f6519g.get() == this.f6516d) {
                            k.d dVar3 = new k.d(this.f6527o, e.f20373a);
                            g0 g0Var3 = g0.f25951a;
                            Locale locale3 = Locale.getDefault();
                            String string3 = this.f6527o.getString(R.string.s_download_completed);
                            m.d(string3, "getString(...)");
                            String str3 = String.format(locale3, string3, Arrays.copyOf(new Object[]{m()}, 1));
                            m.d(str3, "format(...)");
                            k.d dVarI3 = dVar3.k(str3).s(2131231107).i(this.f6521i);
                            m.d(dVarI3, "setContentIntent(...)");
                            n nVar6 = this.f6527o.manager;
                            if (nVar6 == null) {
                                m.o("manager");
                                nVar6 = null;
                            }
                            nVar6.f(2131231107, dVarI3.c());
                            this.f6513a.s(SatelliteOfflineMapItem.a.f6553e);
                        } else if (zP2) {
                            this.f6513a.s(SatelliteOfflineMapItem.a.f6554f);
                        } else {
                            k.d dVar4 = new k.d(this.f6527o, e.f20373a);
                            g0 g0Var4 = g0.f25951a;
                            Locale locale4 = Locale.getDefault();
                            String string4 = this.f6527o.getString(R.string.s_download_completed);
                            m.d(string4, "getString(...)");
                            String str4 = String.format(locale4, string4, Arrays.copyOf(new Object[]{m()}, 1));
                            m.d(str4, "format(...)");
                            k.d dVarI4 = dVar4.k(str4).j(this.f6527o.getString(R.string.partialDownloadFailed)).s(2131231107).i(this.f6521i);
                            m.d(dVarI4, "setContentIntent(...)");
                            n nVar7 = this.f6527o.manager;
                            if (nVar7 == null) {
                                m.o("manager");
                                nVar7 = null;
                            }
                            nVar7.f(2131231107, dVarI4.c());
                            this.f6513a.s(SatelliteOfflineMapItem.a.f6554f);
                        }
                        io.objectbox.a aVar6 = this.f6527o.box;
                        if (aVar6 == null) {
                            m.o("box");
                            aVar6 = null;
                        }
                        SatelliteOfflineMapItem satelliteOfflineMapItem3 = (SatelliteOfflineMapItem) aVar6.e(this.f6513a.getId());
                        if (satelliteOfflineMapItem3 != null && satelliteOfflineMapItem3.getStatus() != SatelliteOfflineMapItem.a.f6555g) {
                            satelliteOfflineMapItem3.s(this.f6513a.getStatus());
                            io.objectbox.a aVar7 = this.f6527o.box;
                            if (aVar7 == null) {
                                m.o("box");
                            } else {
                                aVar = aVar7;
                            }
                            aVar.n(satelliteOfflineMapItem3);
                        }
                        throw th3;
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
            }
        }
    }

    public final class d extends BroadcastReceiver {
        public d() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            m.e(context, "context");
            m.e(intent, "intent");
            OfflineMapDownloadService.this.r(OfflineMapDownloadService.INSTANCE.d(context));
        }
    }

    public OfflineMapDownloadService() {
        super("OfflineMapDownloadService");
        this.inDownloadTaskLock = new Object();
        this.wifiReceiver = new d();
        this.wifiLock = new Object();
        this.wifiIsConnected = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PendingIntent n(j layer) {
        Intent intentA = m0.INSTANCE.a(this, layer);
        intentA.setData(Uri.parse(intentA.toUri(1)));
        PendingIntent activity = PendingIntent.getActivity(this, 0, intentA, 67108864);
        m.d(activity, "getActivity(...)");
        return activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SatelliteOfflineMapItem o() {
        c cVar = this.downloadTask;
        if (cVar != null) {
            return cVar.l();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SatelliteOfflineMapItem q() {
        io.objectbox.a aVar = this.box;
        if (aVar == null) {
            m.o("box");
            aVar = null;
        }
        QueryBuilder queryBuilderQ = aVar.q();
        m.d(queryBuilderQ, "builder");
        io.objectbox.e eVar = com.dw.ht.map.entitys.b.f6585h;
        queryBuilderQ.f(eVar, new int[]{SatelliteOfflineMapItem.a.f6551c.ordinal(), SatelliteOfflineMapItem.a.f6552d.ordinal(), SatelliteOfflineMapItem.a.f6549a.ordinal(), SatelliteOfflineMapItem.a.f6550b.ordinal()});
        queryBuilderQ.h(com.dw.ht.map.entitys.b.f6591w);
        queryBuilderQ.h(eVar);
        Query queryA = queryBuilderQ.a();
        m.d(queryA, "builder.build()");
        List listG = queryA.G(0L, 1L);
        m.d(listG, "find(...)");
        if (listG.size() == 0) {
            return null;
        }
        return (SatelliteOfflineMapItem) listG.get(0);
    }

    private final void s() {
        ArrayList arrayList = new ArrayList();
        io.objectbox.a aVar = this.box;
        io.objectbox.a aVar2 = null;
        if (aVar == null) {
            m.o("box");
            aVar = null;
        }
        QueryBuilder queryBuilderQ = aVar.q();
        m.d(queryBuilderQ, "builder");
        io.objectbox.e eVar = com.dw.ht.map.entitys.b.f6585h;
        queryBuilderQ.f(eVar, new int[]{SatelliteOfflineMapItem.a.f6555g.ordinal()});
        queryBuilderQ.h(eVar);
        Query queryA = queryBuilderQ.a();
        m.d(queryA, "builder.build()");
        List listG = queryA.G(0L, 1L);
        m.d(listG, "find(...)");
        if (listG.size() == 0) {
            return;
        }
        SatelliteOfflineMapItem satelliteOfflineMapItem = (SatelliteOfflineMapItem) listG.get(0);
        io.objectbox.a aVar3 = this.box;
        if (aVar3 == null) {
            m.o("box");
        } else {
            aVar2 = aVar3;
        }
        QueryBuilder queryBuilderQ2 = aVar2.q();
        m.d(queryBuilderQ2, "builder");
        queryBuilderQ2.g(eVar, r6.ordinal());
        Query queryA2 = queryBuilderQ2.a();
        m.d(queryA2, "builder.build()");
        List listX = queryA2.x();
        m.d(listX, "find(...)");
        Iterator it = listX.iterator();
        while (it.hasNext()) {
            arrayList.add(((SatelliteOfflineMapItem) it.next()).a());
        }
        m.b(satelliteOfflineMapItem);
        new b(this, satelliteOfflineMapItem, arrayList).d();
        INSTANCE.e(this);
    }

    private final void t() {
        c cVar;
        SatelliteOfflineMapItem satelliteOfflineMapItemQ = q();
        if (satelliteOfflineMapItemQ == null) {
            s();
            return;
        }
        synchronized (this.inDownloadTaskLock) {
            cVar = new c(this, satelliteOfflineMapItemQ);
            this.downloadTask = cVar;
            d0 d0Var = d0.f10897a;
        }
        cVar.r();
        INSTANCE.e(this);
    }

    @Override // com.dw.ht.k
    public void a() {
        f6492t = null;
        unregisterReceiver(this.wifiReceiver);
    }

    @Override // com.dw.ht.k, android.app.IntentService, android.app.Service
    public void onCreate() {
        super.onCreate();
        io.objectbox.a aVarK = j0.i().k(SatelliteOfflineMapItem.class);
        m.d(aVarK, "boxFor(...)");
        this.box = aVarK;
        n nVarD = n.d(this);
        m.d(nVarD, "from(...)");
        this.manager = nVarD;
        Intent intent = new Intent(this, (Class<?>) OfflineMapDownloadService.class);
        intent.setAction("com.dw.ht.map.action.CANCEL_DOWNLOAD");
        this.cancelAction = new k.a(0, getString(android.R.string.cancel), PendingIntent.getService(this, 0, intent, 67108864));
        Intent intent2 = new Intent(this, (Class<?>) OfflineMapDownloadService.class);
        intent2.setAction("com.dw.ht.map.action.ACTION_CONTINUE_DOWNLOAD");
        this.continueAction = new k.a(0, getString(R.string.Continue), PendingIntent.getService(this, 0, intent2, 67108864));
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        b0.b.j(this, this.wifiReceiver, intentFilter, 2);
        f6492t = this;
    }

    @Override // android.app.IntentService
    protected void onHandleIntent(Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if (action != null && action.hashCode() == 1720930906 && action.equals("com.dw.ht.map.action.DOWNLOAD")) {
            t();
        }
    }

    @Override // android.app.IntentService, android.app.Service
    public int onStartCommand(Intent intent, int flags, int startId) {
        SatelliteOfflineMapItem satelliteOfflineMapItemO;
        c cVar;
        SatelliteOfflineMapItem satelliteOfflineMapItemO2;
        io.objectbox.a aVar = null;
        String action = intent != null ? intent.getAction() : null;
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode != 892667547) {
                if (iHashCode == 1278036265 && action.equals("com.dw.ht.map.action.ACTION_CONTINUE_DOWNLOAD") && (satelliteOfflineMapItemO2 = o()) != null) {
                    satelliteOfflineMapItemO2.q(false);
                    synchronized (this.wifiLock) {
                        this.wifiLock.notifyAll();
                        d0 d0Var = d0.f10897a;
                    }
                    io.objectbox.a aVar2 = this.box;
                    if (aVar2 == null) {
                        m.o("box");
                        aVar2 = null;
                    }
                    SatelliteOfflineMapItem satelliteOfflineMapItem = (SatelliteOfflineMapItem) aVar2.e(satelliteOfflineMapItemO2.getId());
                    if (satelliteOfflineMapItem != null && satelliteOfflineMapItem.getStatus() != SatelliteOfflineMapItem.a.f6555g) {
                        satelliteOfflineMapItem.q(false);
                        io.objectbox.a aVar3 = this.box;
                        if (aVar3 == null) {
                            m.o("box");
                        } else {
                            aVar = aVar3;
                        }
                        aVar.n(satelliteOfflineMapItem);
                    }
                }
            } else if (action.equals("com.dw.ht.map.action.CANCEL_DOWNLOAD") && (satelliteOfflineMapItemO = o()) != null) {
                long longExtra = intent.getLongExtra("android.intent.extra.UID", 0L);
                if ((longExtra == satelliteOfflineMapItemO.getId() || longExtra == 0) && (cVar = this.downloadTask) != null) {
                    cVar.g();
                }
            }
        }
        return super.onStartCommand(intent, flags, startId);
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final boolean getWifiIsConnected() {
        return this.wifiIsConnected;
    }

    public final void r(boolean z10) {
        if (this.wifiIsConnected == z10) {
            return;
        }
        this.wifiIsConnected = z10;
        if (z10) {
            synchronized (this.wifiLock) {
                this.wifiLock.notifyAll();
                d0 d0Var = d0.f10897a;
            }
        }
    }
}
