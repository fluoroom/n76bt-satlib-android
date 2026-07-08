package com.dw.ht.fragments;

import a6.k;
import a6.o;
import a6.q;
import a6.t;
import a6.w;
import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Rect;
import android.location.Location;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.c;
import androidx.fragment.app.p;
import androidx.loader.app.a;
import c5.a0;
import c5.b0;
import c5.c0;
import c5.x;
import c5.y;
import com.benshikj.ht.R;
import com.dw.android.app.FragmentShowActivity;
import com.dw.ht.Cfg;
import com.dw.ht.TrackRecordingService;
import com.dw.ht.entitys.Marker;
import com.dw.ht.fragments.MapToolbarFragment;
import com.dw.ht.fragments.j;
import com.dw.ht.j0;
import com.dw.ht.map.ui.a;
import com.dw.ht.provider.a;
import com.dw.ht.s;
import com.dw.ht.satellite.b;
import com.dw.widget.ActionButton;
import com.ekito.simpleKML.model.Kml;
import com.facebook.stetho.server.http.HttpStatus;
import com.facebook.stetho.websocket.CloseCodes;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import d.k0;
import d5.d;
import g1.c;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import s4.d4;
import v3.e0;
import v3.f0;
import v4.u;
import z4.h;
import z4.m;
import z4.v;
import z4.y;

/* JADX INFO: loaded from: classes.dex */
public abstract class j extends f0 implements a.InterfaceC0037a, a.InterfaceC0095a {
    private c6.g I0;
    private SimpleCursorAdapter J0;
    private ArrayAdapter K0;
    private ArrayAdapter L0;
    private kc.b M0;
    private kc.b N0;
    private b0 X0;
    private boolean Y0;
    private d5.i Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    private g f6263a1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private kc.b f6267e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    private TrackRecordingService.b f6268f1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    private kc.b f6274l1;
    protected boolean O0 = false;
    protected boolean P0 = false;
    protected Rect Q0 = new Rect();
    protected m R0 = m.b();
    protected final ArrayList S0 = o.a();
    private final ArrayList T0 = o.a();
    private final ArrayList U0 = o.a();
    private final ArrayList V0 = o.a();
    private x W0 = x.FOLLOWING;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    protected c5.a f6264b1 = new c5.a();

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    private y f6265c1 = null;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    protected boolean f6266d1 = false;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    private ArrayList f6269g1 = new ArrayList();

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    private int f6270h1 = 1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    private long f6271i1 = 0;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    ArrayList f6272j1 = new ArrayList();

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    private final Runnable f6273k1 = new Runnable() { // from class: s4.x4
        @Override // java.lang.Runnable
        public final void run() {
            this.f26846a.S5();
        }
    };

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    boolean f6275m1 = false;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    private final Runnable f6276n1 = new Runnable() { // from class: s4.e4
        @Override // java.lang.Runnable
        public final void run() {
            this.f26413a.P5(false);
        }
    };

    class a implements TrackRecordingService.b {
        a() {
        }

        @Override // com.dw.ht.TrackRecordingService.b
        public void a(Marker marker) {
            j.this.f6269g1.add(marker);
            j.this.Q5(false);
        }

        @Override // com.dw.ht.TrackRecordingService.b
        public void b(Marker marker) {
            if (marker.getTitle() != null) {
                j.this.U0.add(new b0(marker.j(), marker.getTitle()));
                j.this.R5();
            }
        }
    }

    class b implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int[] f6278a;

        b(int[] iArr) {
            this.f6278a = iArr;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
            Cfg.P0(this.f6278a[i10]);
            j.this.I5();
        }
    }

    class c extends ArrayAdapter {
        c(Context context, int i10, int i11) {
            super(context, i10, i11);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            android.support.v4.media.session.b.a(getItem(i10));
            throw null;
        }
    }

    static /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f6281a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f6282b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f6283c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final /* synthetic */ int[] f6284d;

        static {
            int[] iArr = new int[Cfg.a.values().length];
            f6284d = iArr;
            try {
                iArr[Cfg.a.ShowSpaceStationChanged.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6284d[Cfg.a.ShowAmateurRadioSatelliteChanged.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6284d[Cfg.a.TrackRecordStatusChanged.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[d.b.values().length];
            f6283c = iArr2;
            try {
                iArr2[d.b.LastRxLocationChanged.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6283c[d.b.ShowTrackChanged.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr3 = new int[MapToolbarFragment.a.values().length];
            f6282b = iArr3;
            try {
                iArr3[MapToolbarFragment.a.f6182a.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6282b[MapToolbarFragment.a.f6183b.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f6282b[MapToolbarFragment.a.f6184c.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr4 = new int[x.values().length];
            f6281a = iArr4;
            try {
                iArr4[x.LOCATION_ROTATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public enum e {
        OnLocationChanged
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private LatLngBounds f6287a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private d5.c f6288b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f6289c;

        public f(d5.c cVar) {
            this(cVar, false);
        }

        public f(d5.c cVar, boolean z10) {
            this.f6288b = cVar;
            this.f6289c = z10;
        }

        public f(LatLngBounds latLngBounds) {
            this.f6287a = latLngBounds;
        }
    }

    public static class g extends n3.b {
        private static final Comparator G = new Comparator() { // from class: s4.y4
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(((c5.b0) obj).l(), ((c5.b0) obj2).l());
            }
        };
        final c.a A;
        private final int B;
        private int C;
        private float D;
        private LatLng E;
        private LatLng F;

        public static class a extends g4.g {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            ArrayList f6290e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ArrayList arrayList) {
                super(null, 0);
                this.f6290e = arrayList;
                Collections.sort(arrayList, g.G);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((b0) arrayList.get(i10)).t(i10);
                }
            }
        }

        public g(Context context) {
            super(context, a.b.f6666a, d.c.f10625a, null, null, "longitude,latitude");
            this.C = 0;
            c.a aVar = new c.a();
            this.A = aVar;
            this.B = k.g(context, 12.0f);
            i().getContentResolver().registerContentObserver(N(), true, aVar);
            e0();
            Y(HttpStatus.HTTP_INTERNAL_SERVER_ERROR);
        }

        private b0 c0(LatLng latLng, ArrayList arrayList) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                b0 b0Var = (b0) it.next();
                if (o5.h.c(latLng, b0Var.i()) < this.C) {
                    return b0Var;
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e0() {
            LatLng latLng;
            g4.f fVar = new g4.f();
            LatLng latLng2 = this.F;
            if (latLng2 == null || (latLng = this.E) == null) {
                fVar.h(new g4.f("1==0"));
            } else {
                if (latLng.f7321b < latLng2.f7321b) {
                    fVar.h(new g4.f("latitude>" + this.E.f7320a + " AND latitude<" + this.F.f7320a + " AND longitude>" + this.E.f7321b + " AND longitude<" + this.F.f7321b));
                } else {
                    fVar.h(new g4.f("latitude>" + this.E.f7320a + " AND latitude<" + this.F.f7320a));
                    fVar.h(new g4.f("longitude<" + this.E.f7321b + " OR longitude>" + this.F.f7321b));
                }
                fVar.h(new g4.f("latitude IS NOT NULL AND longitude IS NOT NULL"));
                fVar.h(new g4.f("latitude <> 0 OR longitude <> 0"));
                if (Cfg.c0()) {
                    fVar.h(new g4.f("starred==1"));
                }
            }
            int iD = Cfg.D();
            if (iD != 0) {
                fVar.h(new g4.f("date>" + (System.currentTimeMillis() - ((long) iD))));
            }
            R(fVar.n());
            S(fVar.k());
            p();
        }

        @Override // g1.b, g1.a
        public void B() {
        }

        @Override // n3.b, g1.b, g1.a
        /* JADX INFO: renamed from: O */
        public Cursor H() {
            Cursor cursorH = super.H();
            if (cursorH == null) {
                return null;
            }
            ArrayList<b0> arrayListA = o.a();
            long jCurrentTimeMillis = System.currentTimeMillis() - 300000;
            while (cursorH.moveToNext()) {
                d5.d dVar = new d5.d(cursorH);
                LatLng latLngG = dVar.g();
                if (latLngG != null) {
                    b0 b0Var = new b0(latLngG, dVar.f10599a, dVar.f10607i, dVar.f10611m, dVar.f10613o);
                    b0Var.t(dVar.f10612n);
                    if (Cfg.f5482d && dVar.f10612n < jCurrentTimeMillis) {
                        b0Var.s(true);
                    }
                    arrayListA.add(b0Var);
                }
            }
            cursorH.close();
            if (arrayListA.size() < 50 || this.C < 10 || Cfg.f5511u) {
                return new a(arrayListA);
            }
            ArrayList arrayListA2 = o.a();
            for (b0 b0Var2 : arrayListA) {
                b0 b0VarC0 = c0(b0Var2.i(), arrayListA2);
                if (b0VarC0 != null) {
                    b0VarC0.c(b0Var2);
                } else {
                    arrayListA2.add(b0Var2);
                }
            }
            return new a(arrayListA2);
        }

        @Override // g1.b, g1.a
        /* JADX INFO: renamed from: P */
        public void I(Cursor cursor) {
            if (cursor == null || cursor.isClosed()) {
                return;
            }
            f(cursor);
        }

        public void d0(LatLng latLng, LatLng latLng2, float f10) {
            float f11 = this.D;
            if (f11 == 0.0f) {
                this.D = f10;
            } else {
                float f12 = f10 / f11;
                if (f12 < 1.0f) {
                    f12 = 1.0f / f12;
                }
                if (f12 > 1.5d) {
                    this.D = f10;
                }
            }
            int i10 = (int) (this.B * this.D);
            if (i10 == this.C && q.f(this.F, latLng) && q.f(this.E, latLng2)) {
                return;
            }
            this.C = i10;
            this.F = latLng;
            this.E = latLng2;
            e0();
        }

        @Override // g1.b, g1.c
        protected void r() {
            super.r();
            i().getContentResolver().unregisterContentObserver(this.A);
        }
    }

    public enum h {
        Search
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        d5.h f6293a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ArrayList f6294b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Marker f6295c;

        public i(d5.h hVar, ArrayList arrayList, Marker marker) {
            this.f6293a = hVar;
            this.f6294b = arrayList;
            this.f6295c = marker;
        }
    }

    public static /* synthetic */ boolean G4(ActionButton actionButton, View view) {
        TrackRecordingService.x();
        actionButton.setSelected(Cfg.O().recordingTrack);
        return true;
    }

    public static /* synthetic */ void H4(j jVar, View view, int i10, c0 c0Var) {
        jVar.getClass();
        Iterator it = c0Var.c().iterator();
        while (it.hasNext()) {
            jVar.J5((String) it.next());
        }
        for (String str : c0Var.e().keySet()) {
            jVar.O5((d5.h) c0Var.e().get(str), str);
        }
        if (jVar.V0.size() != 0 || c0Var.d().size() != 0) {
            jVar.V0.clear();
            jVar.V0.addAll(c0Var.d());
            jVar.R5();
        }
        jVar.f6274l1 = null;
        view.postDelayed(jVar.f6273k1, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void I4(com.dw.ht.fragments.j r0, android.widget.AdapterView r1, android.view.View r2, int r3, long r4) {
        /*
            r0.getClass()
            android.widget.Adapter r1 = r1.getAdapter()
            java.lang.Object r1 = r1.getItem(r3)
            if (r1 != 0) goto Le
            return
        Le:
            boolean r2 = r1 instanceof com.dw.ht.satellite.a
            if (r2 == 0) goto L3c
            com.dw.ht.satellite.a r1 = (com.dw.ht.satellite.a) r1
            com.dw.ht.satellite.a$a r2 = r1.g()
            if (r2 == 0) goto L4c
            int r1 = r1.f()
            com.dw.ht.satellite.b.v(r1)
            android.location.Location r1 = new android.location.Location
            java.lang.String r3 = "o"
            r1.<init>(r3)
            double r3 = r2.f()
            r1.setLongitude(r3)
            double r2 = r2.e()
            r1.setLatitude(r2)
            r2 = 1086324736(0x40c00000, float:6.0)
            r0.e5(r1, r2)
            goto L4c
        L3c:
            boolean r2 = r1 instanceof android.database.Cursor
            if (r2 == 0) goto L4c
            d5.d r2 = new d5.d
            android.database.Cursor r1 = (android.database.Cursor) r1
            r2.<init>(r1)
            android.location.Location r1 = r2.a()
            goto L4d
        L4c:
            r1 = 0
        L4d:
            if (r1 == 0) goto L54
            r2 = 1099956224(0x41900000, float:18.0)
            r0.e5(r1, r2)
        L54:
            r0.p0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dw.ht.fragments.j.I4(com.dw.ht.fragments.j, android.widget.AdapterView, android.view.View, int, long):void");
    }

    public static /* synthetic */ void J4(j jVar, Throwable th2) {
        jVar.getClass();
        th2.printStackTrace();
        jVar.K0.clear();
    }

    public static /* synthetic */ void K4(j jVar, View view, int i10, Throwable th2) {
        jVar.getClass();
        th2.printStackTrace();
        jVar.f6274l1 = null;
        view.postDelayed(jVar.f6273k1, i10);
    }

    private void K5(String str) {
        if (w.b(str)) {
            return;
        }
        this.L0.clear();
        this.L0.addAll(com.dw.ht.satellite.b.O(str));
    }

    public static /* synthetic */ void M4(j jVar, i iVar) {
        jVar.getClass();
        t.d("update track");
        Marker marker = iVar.f6295c;
        if (marker != null) {
            jVar.f6269g1.add(0, marker);
        }
        jVar.O5(iVar.f6293a, "rec");
        if (iVar.f6294b.size() != jVar.U0.size()) {
            jVar.U0.clear();
            jVar.U0.addAll(iVar.f6294b);
            jVar.R5();
        }
        jVar.Q5(false);
        t.b("update track", "MapFragment");
    }

    public static /* synthetic */ c0 N4(j jVar, int[] iArr) {
        c0 c0Var = new c0(jVar.f6264b1.f4304z);
        c0Var.b(iArr);
        return c0Var;
    }

    public static /* synthetic */ void O4(final j jVar, h.c cVar) {
        jVar.getClass();
        Kml kmlG = cVar.g();
        if (kmlG == null) {
            return;
        }
        final LatLngBounds latLngBoundsA = b5.a.a(kmlG);
        if (jVar.T1() == null || latLngBoundsA == null) {
            return;
        }
        jVar.T1().post(new Runnable() { // from class: s4.p4
            @Override // java.lang.Runnable
            public final void run() {
                this.f26656a.G(latLngBoundsA, null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P5(boolean z10) {
        TextView textViewG5 = g5();
        if (textViewG5 == null) {
            return;
        }
        Location locationC = o5.g.C(k1());
        if (locationC != null && !z10 && System.currentTimeMillis() - locationC.getTime() > 120000) {
            locationC = null;
        }
        String strP = locationC != null ? o5.h.p(locationC, 2) : "";
        textViewG5.setText(strP);
        textViewG5.removeCallbacks(this.f6276n1);
        if (w.b(strP)) {
            return;
        }
        textViewG5.postDelayed(this.f6276n1, 180000L);
    }

    public static /* synthetic */ i Q4(j jVar, Boolean bool) {
        jVar.getClass();
        t.d("loadMarkers");
        List<Marker> listG = j0.i().k(Marker.class).g();
        t.b("loadMarkers", "MapFragment");
        m mVar = jVar.R0;
        d5.h hVar = new d5.h();
        ArrayList arrayListA = o.a();
        t.d("gps -> amp");
        for (Marker marker : listG) {
            hVar.a(mVar.a(marker.j()));
            if (marker.getTitle() != null) {
                arrayListA.add(new b0(marker.j(), marker.getTitle()));
            }
        }
        Marker marker2 = listG.size() > 0 ? (Marker) listG.get(listG.size() - 1) : null;
        for (Marker marker3 : jVar.f6269g1) {
            if (marker3.getTitle() != null) {
                arrayListA.add(new b0(marker3.j(), marker3.getTitle()));
            }
        }
        t.c("gps -> amp", "MapFragment", " size:" + listG.size());
        return new i(hVar, arrayListA, marker2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q5(boolean z10) {
        if (z10 || SystemClock.elapsedRealtime() - this.f6271i1 >= 800) {
            t.d("setTrack");
            d5.h hVar = new d5.h();
            v vVarK0 = Cfg.k0();
            for (Marker marker : this.f6269g1) {
                this.f6272j1.add(new z4.x(marker.getLatitude(), marker.getLongitude(), marker.e(), marker.getDate(), marker.getSpeed(), marker.getAccuracy()));
            }
            for (z4.w wVar : vVarK0.e(this.f6272j1)) {
                hVar.a(this.R0.a(new LatLng(wVar.getLatitude(), wVar.getLongitude())));
            }
            if (!this.f6269g1.isEmpty()) {
                hVar.a(this.R0.a(((Marker) this.f6269g1.get(r4.size() - 1)).j()));
            }
            O5(hVar, "rec" + this.f6270h1);
            t.c("setTrack", "MapFragment", " count:" + this.f6269g1.size());
            int size = this.f6269g1.size();
            if (size > TrackRecordingService.INSTANCE.a()) {
                Marker marker2 = (Marker) this.f6269g1.get(size - 1);
                this.f6269g1.clear();
                this.f6269g1.add(marker2);
                this.f6270h1++;
            }
            this.f6272j1.clear();
            this.f6271i1 = SystemClock.elapsedRealtime();
        }
    }

    public static /* synthetic */ Cursor R4(ContentResolver contentResolver, String str) {
        g4.f fVar = new g4.f("_from LIKE ? AND (latitude <> 0 OR longitude <> 0)", new String[]{"%" + str + "%"});
        if (Cfg.c0()) {
            fVar.h(new g4.f("starred==1"));
        }
        return contentResolver.query(a.b.f6666a, d.c.f10625a, fVar.n(), fVar.k(), "_from");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R5() {
        this.S0.clear();
        b0 b0Var = this.X0;
        if (b0Var != null) {
            this.S0.add(b0Var);
        }
        this.S0.addAll(this.T0);
        this.S0.addAll(this.U0);
        this.S0.addAll(this.V0);
        D5();
    }

    public static /* synthetic */ void S4(j jVar, y.b[] bVarArr) {
        jVar.K0.clear();
        jVar.K0.addAll(bVarArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S5() {
        final View viewT1 = T1();
        if (viewT1 == null || !this.Y0) {
            return;
        }
        int[] iArrE = this.f6264b1.f4302x;
        if (iArrE == null) {
            iArrE = com.dw.ht.satellite.b.E();
        }
        if (iArrE.length == 0) {
            if (this.V0.size() != 0) {
                this.V0.clear();
                R5();
                return;
            }
            return;
        }
        final int i10 = this.f6264b1.f4303y;
        if (i10 <= 0) {
            i10 = CloseCodes.NORMAL_CLOSURE;
        }
        viewT1.removeCallbacks(this.f6273k1);
        this.f6274l1 = hc.g.c(iArrE).e(zc.a.b()).d(new mc.d() { // from class: s4.f4
            @Override // mc.d
            public final Object apply(Object obj) {
                return com.dw.ht.fragments.j.N4(this.f26425a, (int[]) obj);
            }
        }).e(jc.a.a()).i(new mc.c() { // from class: s4.g4
            @Override // mc.c
            public final void accept(Object obj) {
                com.dw.ht.fragments.j.H4(this.f26468a, viewT1, i10, (c5.c0) obj);
            }
        }, new mc.c() { // from class: s4.h4
            @Override // mc.c
            public final void accept(Object obj) {
                com.dw.ht.fragments.j.K4(this.f26508a, viewT1, i10, (Throwable) obj);
            }
        });
    }

    public static /* synthetic */ y.b[] W4(y.c cVar) {
        throw null;
    }

    private void Z4(String str) {
        kc.b bVar = this.N0;
        if (bVar != null) {
            bVar.dispose();
        }
        if (Cfg.f5511u || w.b(str)) {
            return;
        }
        hc.g gVarE = hc.g.c(str).e(zc.a.b());
        final z4.y yVar = z4.y.f33000a;
        Objects.requireNonNull(yVar);
        this.N0 = gVarE.d(new mc.d() { // from class: s4.j4
            @Override // mc.d
            public final Object apply(Object obj) throws JSONException {
                yVar.a((String) obj);
                return null;
            }
        }).d(new mc.d() { // from class: s4.k4
            @Override // mc.d
            public final Object apply(Object obj) {
                android.support.v4.media.session.b.a(obj);
                return com.dw.ht.fragments.j.W4(null);
            }
        }).e(jc.a.a()).i(new mc.c() { // from class: s4.l4
            @Override // mc.c
            public final void accept(Object obj) {
                com.dw.ht.fragments.j.S4(this.f26562a, (y.b[]) obj);
            }
        }, new mc.c() { // from class: s4.m4
            @Override // mc.c
            public final void accept(Object obj) {
                com.dw.ht.fragments.j.J4(this.f26607a, (Throwable) obj);
            }
        });
    }

    public static Intent j5(Context context) {
        return k5(context, null);
    }

    public static Intent k5(Context context, String str) {
        return FragmentShowActivity.e2(context, "", m.e(), new c5.a().k(true).h(str).b());
    }

    private void w5() {
        if (this.f6267e1 != null) {
            return;
        }
        if (this.f6268f1 == null) {
            a aVar = new a();
            this.f6268f1 = aVar;
            this.f6269g1 = TrackRecordingService.s(aVar);
        }
        this.f6267e1 = hc.g.c(Boolean.TRUE).e(zc.a.a()).d(new mc.d() { // from class: s4.n4
            @Override // mc.d
            public final Object apply(Object obj) {
                return com.dw.ht.fragments.j.Q4(this.f26617a, (Boolean) obj);
            }
        }).e(jc.a.a()).i(new mc.c() { // from class: com.dw.ht.fragments.i
            @Override // mc.c
            public final void accept(Object obj) {
                j.M4(this.f6262a, (j.i) obj);
            }
        }, new s());
    }

    public static j x5(boolean z10) {
        return y5(z10, true);
    }

    public static j y5(boolean z10, boolean z11) {
        return new c5.a().p(z10).q(z11).c();
    }

    public void A5() {
        P5(true);
    }

    protected void B5(z4.j jVar, z4.j jVar2) {
        if (jVar.h() != jVar2.h()) {
            d5.i iVar = this.Z0;
            if (iVar != null) {
                iVar.p();
            }
            Q5(true);
        }
    }

    @Override // v3.f0
    protected void C4() {
        super.C4();
        if (B4() == null) {
            return;
        }
        B4().setVisibility(8);
        mi.c.e().m(h.Search);
    }

    protected abstract void C5();

    protected abstract void D5();

    @Override // v3.f0
    protected void E4() {
        super.E4();
        if (B4() == null) {
            return;
        }
        B4().setVisibility(0);
        mi.c.e().m(h.Search);
    }

    protected abstract void E5(Location location);

    @Override // androidx.fragment.app.o
    public boolean F2(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.do_action) {
            p pVarE1 = e1();
            if (pVarE1 != null) {
                Intent intent = new Intent();
                Location locationP5 = p5();
                if (locationP5 != null) {
                    intent.putExtra("longitude", locationP5.getLongitude());
                    intent.putExtra("latitude", locationP5.getLatitude());
                    pVarE1.setResult(-1, intent);
                } else {
                    Toast.makeText(pVarE1, "获取位置失败", 0).show();
                    pVarE1.setResult(0);
                }
                pVarE1.finish();
                return true;
            }
        } else if (itemId == R.id.route && this.X0 != null) {
            o5.f.b(x3(), this.X0.getTitle(), this.X0.h(), this.X0.j());
            return true;
        }
        return super.F2(menuItem);
    }

    public void F5(ActionButton actionButton) {
        Cfg.L0(!Cfg.g0());
        actionButton.setSelected(Cfg.g0());
    }

    public abstract void G(LatLngBounds latLngBounds, Rect rect);

    @Override // com.dw.ht.map.ui.a.InterfaceC0095a
    public boolean G0(b0 b0Var, boolean z10) {
        s4.s sVar;
        k0 k0VarE1 = e1();
        if ((k0VarE1 instanceof a0) && ((a0) k0VarE1).h(this, b0Var, z10)) {
            return true;
        }
        if (b0Var == null || b0Var.f() == 0 || (sVar = (s4.s) X3(s4.s.class, z10)) == null) {
            return false;
        }
        sVar.x4(b0Var.f());
        if (z10) {
            i4(3);
        }
        return true;
    }

    public void G5(ActionButton actionButton) {
        Cfg.D0(!Cfg.c0());
        actionButton.setSelected(Cfg.c0());
        I5();
        actionButton.setContentDescription(N1(Cfg.c0() ? R.string.onlyShowFollowingUsers : R.string.showAllUsers));
    }

    public abstract void H(LatLng latLng, float f10);

    @Override // v3.v, androidx.fragment.app.o
    public void H2() {
        super.H2();
        this.Y0 = false;
        q0(l5());
    }

    public void H5(View view) {
        int iD = Cfg.D();
        int[] intArray = H1().getIntArray(R.array.show_icon_times);
        new c.a(view.getContext()).y(R.string.showRecent).v(R.array.show_icon_time_names, intArray[intArray.length + (-1)] == 0 ? iD == 0 ? intArray.length - 1 : Arrays.binarySearch(intArray, 0, intArray.length - 1, iD) : Arrays.binarySearch(intArray, 0, intArray.length, iD), new b(intArray)).C();
    }

    protected void I5() {
        g gVar = this.f6263a1;
        if (gVar != null) {
            gVar.e0();
        }
    }

    protected abstract void J5(String str);

    @Override // androidx.loader.app.a.InterfaceC0037a
    public void K(g1.c cVar, Object obj) {
        int iJ = cVar.j();
        if (iJ == 0) {
            this.T0.clear();
            if (obj != null && (obj instanceof g.a)) {
                this.T0.addAll(((g.a) obj).f6290e);
            }
            R5();
            return;
        }
        if (iJ == 1) {
            z5((Cursor) obj);
        } else {
            if (iJ != 2) {
                return;
            }
            O5((d5.h) obj, "user");
        }
    }

    public abstract void L0(c5.y yVar);

    public void L5(int i10, int i11, int i12, int i13) {
        this.Q0 = new Rect(i10, i11, i12, i13);
    }

    @Override // v3.m0, v3.v, androidx.fragment.app.o
    public void M2() {
        super.M2();
        this.Y0 = true;
        ActionButton actionButtonR5 = r5();
        if (actionButtonR5 != null) {
            actionButtonR5.setSelected(Cfg.c0());
            actionButtonR5.setContentDescription(N1(Cfg.c0() ? R.string.onlyShowFollowingUsers : R.string.showAllUsers));
        }
        ActionButton actionButtonQ5 = q5();
        if (actionButtonQ5 != null) {
            actionButtonQ5.setSelected(Cfg.g0());
        }
        ActionButton actionButtonT5 = t5();
        if (actionButtonT5 != null) {
            actionButtonT5.setSelected(Cfg.O().recordingTrack);
        }
        q0(l5());
        if (Cfg.f5482d) {
            g gVar = this.f6263a1;
            if (gVar != null) {
                gVar.p();
            }
            if (l5() != x.LOCATION_ROTATE) {
                U0(x.FOLLOWING);
            }
        }
        w5();
        if (!Cfg.O().recordingTrack) {
            J5("rec");
            this.f6269g1.clear();
        }
        Q5(true);
        S5();
        c5.a aVar = this.f6264b1;
        if (!this.f6266d1) {
            x xVarF = aVar.f();
            if (xVarF != null) {
                U0(xVarF);
            }
            z4.j jVarG = aVar.g();
            if (jVarG != null) {
                setMapLayer(jVarG);
            }
            if (d4.a(aVar.f4298t)) {
                H(new LatLng(0.0d, 0.0d), aVar.f4298t);
            }
        }
        c5.y yVar = this.f6265c1;
        if (yVar != null) {
            L0(yVar);
            if (this.f6275m1) {
                this.f6265c1 = null;
            }
        }
    }

    @Override // v3.f0, v3.v, androidx.fragment.app.o
    public void M3(boolean z10) {
        super.M3(z10);
        q0(l5());
    }

    public void M5(boolean z10) {
        this.O0 = z10;
    }

    @Override // v3.f0, v3.v, androidx.fragment.app.o
    public void N2(Bundle bundle) {
        super.N2(bundle);
        c5.y yVar = new c5.y();
        R(yVar);
        yVar.j(this.W0);
        bundle.putParcelable("map_status", yVar);
    }

    public void N5(boolean z10) {
        this.P0 = z10;
    }

    @Override // androidx.fragment.app.o
    public void O2() {
        super.O2();
        mi.c.e().q(this);
    }

    protected abstract void O5(d5.h hVar, String str);

    @Override // androidx.fragment.app.o
    public void P2() {
        super.P2();
        mi.c.e().t(this);
    }

    @Override // v3.v, androidx.fragment.app.i0, androidx.fragment.app.o
    public void Q2(View view, Bundle bundle) {
        super.Q2(view, bundle);
        final ActionButton actionButtonR5 = r5();
        final ActionButton actionButtonQ5 = q5();
        ListView listViewB4 = B4();
        final ActionButton actionButtonT5 = t5();
        if (s5() != null) {
            s5().setOnClickListener(new View.OnClickListener() { // from class: s4.r4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f26722a.H5(view2);
                }
            });
        }
        if (actionButtonT5 != null) {
            actionButtonT5.setOnClickListener(new View.OnClickListener() { // from class: s4.s4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    com.dw.ht.fragments.j jVar = this.f26761a;
                    jVar.startActivityForResult(FragmentShowActivity.d2(jVar.k1(), "", c5.q0.class), 2);
                }
            });
            actionButtonT5.setOnLongClickListener(new View.OnLongClickListener() { // from class: s4.t4
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    return com.dw.ht.fragments.j.G4(actionButtonT5, view2);
                }
            });
        }
        if (actionButtonR5 != null) {
            actionButtonR5.setSelected(Cfg.c0());
            if (!v5()) {
                actionButtonR5.setVisibility(8);
            }
            actionButtonR5.setOnClickListener(new View.OnClickListener() { // from class: s4.u4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f26787a.G5(actionButtonR5);
                }
            });
        }
        if (actionButtonQ5 != null) {
            actionButtonQ5.setVisibility(8);
            actionButtonQ5.setOnClickListener(new View.OnClickListener() { // from class: s4.v4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f26811a.F5(actionButtonQ5);
                }
            });
        }
        if (listViewB4 != null) {
            listViewB4.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: s4.w4
                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view2, int i10, long j10) {
                    com.dw.ht.fragments.j.I4(this.f26825a, adapterView, view2, i10, j10);
                }
            });
        }
    }

    public abstract void R(c5.y yVar);

    @Override // androidx.fragment.app.o
    public void R2(Bundle bundle) {
        super.R2(bundle);
        if (bundle != null) {
            c5.y yVar = (c5.y) bundle.getParcelable("map_status");
            this.f6265c1 = yVar;
            this.f6266d1 = true;
            if (yVar != null) {
                U0(yVar.e());
            }
        }
    }

    @Override // androidx.loader.app.a.InterfaceC0037a
    public g1.c S(int i10, Bundle bundle) {
        if (i10 == 0) {
            return new g(k1());
        }
        if (i10 == 1) {
            return new n3.b(x3(), a.b.f6666a, d.c.f10625a, null, null, "date DESC");
        }
        if (i10 != 2) {
            throw new IllegalStateException("Unexpected value: " + i10);
        }
        d5.d dVarH = d5.d.h();
        long j10 = -1;
        String str = null;
        if (dVarH != null) {
            long j11 = dVarH.f10613o;
            if (j11 != 0) {
                j10 = j11;
            } else {
                str = dVarH.f10599a;
                if (!w.b(str)) {
                    j10 = 0;
                }
            }
        }
        long jD = Cfg.D();
        if (jD < 1) {
            jD = System.currentTimeMillis();
        }
        d5.i iVar = new d5.i(k1(), str, j10);
        iVar.R(jD);
        return iVar;
    }

    public final void U0(x xVar) {
        if (xVar == this.W0) {
            return;
        }
        this.W0 = xVar;
        q0(l5());
    }

    @Override // com.dw.ht.map.ui.a.InterfaceC0095a
    public void Y(LatLng latLng, LatLng latLng2, float f10) {
        g gVar = this.f6263a1;
        if (gVar != null) {
            gVar.d0(latLng, latLng2, f10);
        }
    }

    @Override // com.dw.ht.map.ui.a.InterfaceC0095a
    public void b(int i10) {
        if (i10 == 1 && l5().d()) {
            U0(x.NORMAL);
        }
    }

    @Override // com.dw.ht.map.ui.a.InterfaceC0095a
    public void c0(Object obj) {
        this.f6275m1 = true;
        c5.y yVar = this.f6265c1;
        if (yVar != null) {
            L0(yVar);
        }
    }

    @Override // v3.f0, v3.v
    protected boolean c4() {
        return super.c4();
    }

    public void e5(Location location, float f10) {
        if (location == null) {
            return;
        }
        H(new LatLng(location.getLatitude(), location.getLongitude()), f10);
    }

    public abstract void f5(d5.c cVar);

    protected abstract TextView g5();

    @Override // v3.f0, v3.e0
    public e0 getSearchable() {
        if (v5()) {
            return this;
        }
        return null;
    }

    @Override // v3.f0, v3.e0
    public void h(String str) {
        super.h(str);
        ListView listViewB4 = B4();
        if (listViewB4 == null) {
            return;
        }
        if (this.I0 == null) {
            this.J0 = new SimpleCursorAdapter(k1(), android.R.layout.simple_list_item_1, null, new String[]{"_from"}, new int[]{android.R.id.text1}, 0);
            this.K0 = new c(x3(), R.layout.list_item_2, R.id.text1);
            this.L0 = new ArrayAdapter(k1(), android.R.layout.simple_list_item_1);
            c6.g gVar = new c6.g(new BaseAdapter[]{this.L0, this.J0, this.K0});
            this.I0 = gVar;
            listViewB4.setAdapter((ListAdapter) gVar);
        }
        kc.b bVar = this.M0;
        if (bVar != null) {
            bVar.dispose();
        }
        if (w.b(str)) {
            this.J0.changeCursor(null);
            this.K0.clear();
            this.L0.clear();
        } else {
            K5(str);
            Z4(str);
            final ContentResolver contentResolver = x3().getContentResolver();
            this.M0 = hc.g.c(str).e(zc.a.b()).d(new mc.d() { // from class: s4.o4
                @Override // mc.d
                public final Object apply(Object obj) {
                    return com.dw.ht.fragments.j.R4(contentResolver, (String) obj);
                }
            }).e(jc.a.a()).i(new mc.c() { // from class: s4.q4
                @Override // mc.c
                public final void accept(Object obj) {
                    this.f26674a.J0.changeCursor((Cursor) obj);
                }
            }, new s());
        }
    }

    protected b0 h5() {
        return this.X0;
    }

    public Location i5() {
        return o5.g.C(k1());
    }

    public x l5() {
        return (b4() && this.Y0) ? this.W0 : x.DISABLE;
    }

    @Override // androidx.fragment.app.o
    public void m2(int i10, int i11, Intent intent) {
        if (i10 != 2) {
            super.m2(i10, i11, intent);
            return;
        }
        if (i11 != -1 || intent == null) {
            return;
        }
        final h.c cVarG = z4.h.i().g(intent.getStringExtra("android.intent.extra.TEXT"));
        if (cVarG != null) {
            AsyncTask.execute(new Runnable() { // from class: s4.i4
                @Override // java.lang.Runnable
                public final void run() {
                    com.dw.ht.fragments.j.O4(this.f26524a, cVarG);
                }
            });
        }
    }

    public x m5() {
        return this.W0;
    }

    protected abstract ActionButton n5();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // v3.f0
    /* JADX INFO: renamed from: o5, reason: merged with bridge method [inline-methods] */
    public abstract ListView B4();

    @mi.m(threadMode = ThreadMode.MAIN_ORDERED)
    public void onMessageEvent(f fVar) {
        if (fVar.f6287a != null) {
            G(fVar.f6287a, null);
            return;
        }
        if (fVar.f6288b != null) {
            if (!fVar.f6289c) {
                f5(fVar.f6288b);
                return;
            }
            if (fVar.f6288b.f10611m < 0) {
                com.dw.ht.satellite.b.Q((int) (-fVar.f6288b.f10611m));
                e5(fVar.f6288b.a(), 6.0f);
            }
            z(fVar.f6288b.f10611m);
            s4.s sVar = (s4.s) X3(s4.s.class, true);
            if (sVar == null) {
                return;
            }
            sVar.x4(fVar.f6288b.f10611m);
            i4(3);
        }
    }

    public abstract Location p5();

    @Override // com.dw.ht.map.ui.a.InterfaceC0095a
    public void q0(x xVar) {
        mi.c.e().m(xVar);
        ActionButton actionButtonN5 = n5();
        if (actionButtonN5 == null) {
            return;
        }
        if (d.f6281a[xVar.ordinal()] != 1) {
            actionButtonN5.setImageResource(R.drawable.ic_my_location_black_24dp);
            actionButtonN5.setSelected(xVar == x.FOLLOWING);
        } else {
            actionButtonN5.setImageResource(R.drawable.ic_compass_outline);
            actionButtonN5.setSelected(true);
        }
    }

    protected abstract ActionButton q5();

    @Override // v3.f0, v3.v, androidx.fragment.app.o
    public void r2(Bundle bundle) {
        d5.d dVarK;
        LatLng latLngG;
        super.r2(bundle);
        Bundle bundleI1 = i1();
        c5.a aVar = bundleI1 != null ? (c5.a) bundleI1.getParcelable("args") : null;
        if (aVar == null) {
            aVar = new c5.a();
        }
        this.f6264b1 = aVar;
        M5(aVar.f4295h);
        N5(aVar.f4296r);
        if (aVar.f4294g) {
            G3(true);
            z4(N1(R.string.selectLocation));
        }
        long j10 = aVar.f4293f;
        if (j10 != 0 && (dVarK = d5.d.k(j10)) != null && (latLngG = dVarK.g()) != null) {
            this.X0 = new b0(latLngG, dVarK.f10599a, dVarK.f10607i, dVarK.f10611m, dVarK.f10613o);
        }
        Location location = aVar.f4289b;
        if (location == null) {
            androidx.loader.app.a aVarX1 = x1();
            this.f6263a1 = (g) aVarX1.c(0, null, this);
            this.Z0 = (d5.i) aVarX1.c(2, null, this);
        } else {
            b0 b0Var = new b0(location, aVar.f4290c, aVar.f4291d, 0L, aVar.f4288a);
            this.X0 = b0Var;
            b0Var.q(aVar.f4292e);
            this.S0.add(this.X0);
            G3(true);
        }
    }

    protected abstract ActionButton r5();

    protected abstract ActionButton s5();

    @Override // androidx.loader.app.a.InterfaceC0037a
    public void t0(g1.c cVar) {
        int iJ = cVar.j();
        if (iJ == 1) {
            z5(null);
        } else {
            if (iJ != 2) {
                return;
            }
            O5(null, "user");
        }
    }

    protected abstract ActionButton t5();

    @Override // androidx.fragment.app.o
    public void u2(Menu menu, MenuInflater menuInflater) {
        super.u2(menu, menuInflater);
        if (!u5()) {
            if (this.X0 != null) {
                menuInflater.inflate(R.menu.navigation, menu);
            }
        } else {
            menuInflater.inflate(R.menu.get_location, menu);
            if (w.b(this.f6264b1.A)) {
                return;
            }
            menu.findItem(R.id.do_action).setTitle(this.f6264b1.A);
        }
    }

    protected boolean u5() {
        return this.f6264b1.f4294g;
    }

    protected boolean v5() {
        return (this.f6263a1 == null || u5()) ? false : true;
    }

    @Override // v3.v, androidx.fragment.app.o
    public void w2() {
        super.w2();
        kc.b bVar = this.f6267e1;
        if (bVar != null && !bVar.d()) {
            this.f6267e1.dispose();
        }
        TrackRecordingService.b bVar2 = this.f6268f1;
        if (bVar2 != null) {
            TrackRecordingService.y(bVar2);
            this.f6268f1 = null;
        }
        SimpleCursorAdapter simpleCursorAdapter = this.J0;
        if (simpleCursorAdapter != null) {
            simpleCursorAdapter.changeCursor(null);
        }
    }

    public abstract void z(long j10);

    protected void z5(Cursor cursor) {
    }

    @mi.m(threadMode = ThreadMode.MAIN_ORDERED)
    public void onMessageEvent(MapToolbarFragment.a aVar) {
        int i10 = d.f6282b[aVar.ordinal()];
        if (i10 == 1) {
            C5();
            return;
        }
        if (i10 == 2) {
            if (r5() != null) {
                r5().setSelected(Cfg.c0());
                r5().setContentDescription(N1(Cfg.c0() ? R.string.onlyShowFollowingUsers : R.string.showAllUsers));
            }
            I5();
            return;
        }
        if (i10 != 3) {
            return;
        }
        I5();
        if (this.Z0 != null) {
            long jD = Cfg.D();
            if (jD < 1) {
                jD = System.currentTimeMillis();
            }
            this.Z0.R(jD);
        }
    }

    @mi.m(threadMode = ThreadMode.MAIN_ORDERED)
    public void onMessageEvent(u.c cVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    @mi.m(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN_ORDERED)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMessageEvent(d5.d.b r9) {
        /*
            r8 = this;
            int[] r0 = com.dw.ht.fragments.j.d.f6283c
            int r9 = r9.ordinal()
            r9 = r0[r9]
            r0 = 1
            if (r9 == r0) goto L44
            r0 = 2
            if (r9 == r0) goto Lf
            goto L4f
        Lf:
            d5.i r9 = r8.Z0
            if (r9 != 0) goto L14
            goto L4f
        L14:
            d5.d r9 = d5.d.h()
            r0 = 0
            r1 = -1
            if (r9 == 0) goto L33
            long r3 = r9.f10613o
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L27
            r9 = r0
            goto L35
        L27:
            java.lang.String r9 = r9.f10599a
            boolean r3 = a6.w.b(r9)
            if (r3 != 0) goto L31
            r3 = r5
            goto L35
        L31:
            r3 = r1
            goto L35
        L33:
            r9 = r0
            goto L31
        L35:
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 != 0) goto L3e
            java.lang.String r1 = "user"
            r8.O5(r0, r1)
        L3e:
            d5.i r0 = r8.Z0
            r0.Q(r9, r3)
            return
        L44:
            boolean r9 = r8.u5()
            if (r9 != 0) goto L4f
            android.location.Location r9 = d5.d.f10615t
            r8.E5(r9)
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dw.ht.fragments.j.onMessageEvent(d5.d$b):void");
    }

    @mi.m(threadMode = ThreadMode.MAIN_ORDERED)
    public void setMapLayer(z4.j jVar) {
    }

    @mi.m(threadMode = ThreadMode.MAIN_ORDERED)
    public void onMessageEvent(b.a aVar) {
        if (aVar == b.a.f6706c) {
            int iX = com.dw.ht.satellite.b.x();
            if (iX != 0) {
                long j10 = -iX;
                z(j10);
                s4.s sVar = (s4.s) X3(s4.s.class, true);
                if (sVar == null) {
                    return;
                }
                sVar.x4(j10);
                i4(3);
                return;
            }
            return;
        }
        J5("satellite-");
        S5();
    }

    @mi.m(threadMode = ThreadMode.MAIN_ORDERED)
    public void onMessageEvent(Cfg.a aVar) {
        int i10 = d.f6284d[aVar.ordinal()];
        if (i10 != 1 && i10 != 2) {
            if (i10 == 3 && !Cfg.O().recordingTrack) {
                J5("rec");
                this.f6269g1.clear();
                return;
            }
            return;
        }
        J5("satellite-");
        S5();
    }

    @mi.m(threadMode = ThreadMode.MAIN_ORDERED)
    public void onMessageEvent(e eVar) {
        A5();
    }
}
