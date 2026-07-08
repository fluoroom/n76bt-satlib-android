package com.dw.ht.map.ui;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Point;
import android.graphics.Rect;
import android.location.Location;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.o;
import androidx.fragment.app.p;
import c5.b0;
import c5.x;
import com.benshikj.ht.R;
import com.dw.android.widget.NumberPreferenceView;
import com.dw.ht.Cfg;
import com.dw.ht.j0;
import com.dw.ht.map.OfflineMapDownloadService;
import com.dw.ht.map.a;
import com.dw.ht.map.entitys.SatelliteOfflineMapItem;
import com.dw.ht.map.ui.a;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import dd.d0;
import ed.q;
import fc.d;
import io.objectbox.query.Query;
import io.objectbox.query.QueryBuilder;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import l1.i;
import m4.y;
import o5.g;
import o8.c;
import o8.k;
import z4.j;
import z4.m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u00020\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\bJ\u0019\u0010\r\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00132\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\bJ\u000f\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\bJ\u0017\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\tH\u0016¢\u0006\u0004\b\"\u0010\bJ\u000f\u0010#\u001a\u00020\tH\u0016¢\u0006\u0004\b#\u0010\bJ\u001d\u0010%\u001a\u00020\t2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b%\u0010&J'\u0010,\u001a\u00020\t2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J!\u00101\u001a\u00020\u001e2\b\u0010/\u001a\u0004\u0018\u00010.2\u0006\u00100\u001a\u00020\u001eH\u0016¢\u0006\u0004\b1\u00102J\u0017\u00105\u001a\u00020\t2\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106J\u0017\u00109\u001a\u00020\t2\u0006\u00108\u001a\u000207H\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010=\u001a\u00020\t2\u0006\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b=\u0010>R\u0018\u0010B\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010F\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010<\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010HR\u0016\u0010L\u001a\u00020I8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010P\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u001c\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00050Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u001c\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00050U8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bV\u0010W¨\u0006Y"}, d2 = {"Lcom/dw/ht/map/ui/b;", "Landroidx/fragment/app/o;", "Landroid/view/View$OnClickListener;", "Lfc/a;", "", "Lcom/dw/ht/map/entitys/SatelliteOfflineMapItem;", "Lcom/dw/ht/map/ui/a$a;", "<init>", "()V", "Ldd/d0;", "i4", "Landroid/os/Bundle;", "savedInstanceState", "r2", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "v2", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "Q2", "(Landroid/view/View;Landroid/os/Bundle;)V", "M2", "y2", "v", "onClick", "(Landroid/view/View;)V", "", "justWifi", "Z3", "(Z)V", "O2", "P2", "data", "e4", "(Ljava/util/List;)V", "Lcom/google/android/gms/maps/model/LatLng;", "northeast", "southwest", "", "scalePerPixel", "Y", "(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;F)V", "Lc5/b0;", "overlay", "byUser", "G0", "(Lc5/b0;Z)Z", "Lc5/x;", "locationMode", "q0", "(Lc5/x;)V", "", "reason", "b", "(I)V", "", "map", "c0", "(Ljava/lang/Object;)V", "Lm4/y;", "o0", "Lm4/y;", "binding", "Lz4/j;", "p0", "Lz4/j;", "mapLayer", "Lcom/dw/ht/map/ui/a;", "Lcom/dw/ht/map/ui/a;", "Lz4/m;", "r0", "Lz4/m;", "mapUtils", "Lfc/d;", "s0", "Lfc/d;", "dataSubscription", "", "t0", "Ljava/util/List;", "items", "Lio/objectbox/a;", "u0", "Lio/objectbox/a;", "box", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b extends o implements View.OnClickListener, fc.a, a.InterfaceC0095a {

    /* JADX INFO: renamed from: o0, reason: from kotlin metadata */
    private y binding;

    /* JADX INFO: renamed from: q0, reason: from kotlin metadata */
    private a map;

    /* JADX INFO: renamed from: r0, reason: from kotlin metadata */
    private m mapUtils;

    /* JADX INFO: renamed from: s0, reason: from kotlin metadata */
    private d dataSubscription;

    /* JADX INFO: renamed from: u0, reason: from kotlin metadata */
    private io.objectbox.a box;

    /* JADX INFO: renamed from: p0, reason: from kotlin metadata */
    private j mapLayer = j.f32939c;

    /* JADX INFO: renamed from: t0, reason: from kotlin metadata */
    private List items = q.k();

    public static final void a4(b bVar, DialogInterface dialogInterface, int i10) {
        p pVarE1 = bVar.e1();
        if (pVarE1 != null) {
            pVarE1.finish();
        }
    }

    public static final void b4(b bVar, DialogInterface dialogInterface, int i10) {
        bVar.Z3(true);
    }

    public static final void c4(b bVar, DialogInterface dialogInterface, int i10) {
        bVar.Z3(true);
    }

    public static final void d4(b bVar, DialogInterface dialogInterface, int i10) {
        bVar.Z3(false);
    }

    public static final void f4(b bVar) {
        bVar.i4();
    }

    public static final void g4(b bVar, View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        bVar.i4();
    }

    public static final void h4(b bVar, NumberPreferenceView numberPreferenceView, int i10, int i11) {
        rd.m.e(numberPreferenceView, "<unused var>");
        bVar.i4();
    }

    private final void i4() {
        a aVar;
        LatLngBounds latLngBoundsL;
        LatLng latLngJ0;
        y yVar = this.binding;
        if (yVar == null || (aVar = this.map) == null || (latLngBoundsL = aVar.l()) == null) {
            return;
        }
        a.C0092a c0092a = com.dw.ht.map.a.f6530d;
        long jE = c0092a.e(z4.a.d(latLngBoundsL), yVar.f21697c.getNumber());
        float fMin = Math.min(yVar.f21700f.getWidth(), yVar.f21700f.getHeight());
        if (jE == 0) {
            return;
        }
        float fSqrt = (float) Math.sqrt(50000.0d / jE);
        if (fSqrt > 0.6666667f) {
            fSqrt = 0.6666667f;
        }
        if (fMin > 0.0f) {
            float f10 = fMin * fSqrt;
            yVar.f21700f.setHollowHeight(f10);
            yVar.f21700f.setHollowWidth(f10);
        }
        try {
            Rect hollow = yVar.f21700f.getHollow();
            LatLng latLngJ02 = aVar.J0(new Point(hollow.left, hollow.bottom));
            if (latLngJ02 == null || (latLngJ0 = aVar.J0(new Point(hollow.right, hollow.top))) == null) {
                return;
            }
            m mVar = this.mapUtils;
            if (mVar == null) {
                rd.m.o("mapUtils");
                mVar = null;
            }
            LatLngBounds latLngBoundsP = mVar.p(new LatLngBounds(latLngJ02, latLngJ0));
            rd.m.b(latLngBoundsP);
            jE = c0092a.e(z4.a.d(latLngBoundsP), yVar.f21697c.getNumber());
        } catch (IllegalArgumentException e10) {
            e10.printStackTrace();
        }
        a aVar2 = this.map;
        int iP = aVar2 != null ? aVar2.p() : 0;
        String str = "";
        if (iP != 0) {
            str = "" + O1(R.string.estimatedDownloadSize, a6.m.q(jE * ((long) iP))) + '\n';
        }
        yVar.f21699e.setText(str + O1(R.string.currentMapZoomLevelF, Integer.valueOf((int) aVar.I0())));
    }

    @Override // com.dw.ht.map.ui.a.InterfaceC0095a
    public boolean G0(b0 overlay, boolean byUser) {
        return true;
    }

    @Override // androidx.fragment.app.o
    public void M2() {
        NumberPreferenceView numberPreferenceView;
        super.M2();
        y yVar = this.binding;
        if (yVar == null || (numberPreferenceView = yVar.f21697c) == null) {
            return;
        }
        numberPreferenceView.postDelayed(new Runnable() { // from class: c5.g
            @Override // java.lang.Runnable
            public final void run() {
                com.dw.ht.map.ui.b.f4(this.f4330a);
            }
        }, 2000L);
    }

    @Override // androidx.fragment.app.o
    public void O2() {
        super.O2();
        io.objectbox.a aVar = this.box;
        if (aVar == null) {
            rd.m.o("box");
            aVar = null;
        }
        QueryBuilder queryBuilderQ = aVar.q();
        rd.m.d(queryBuilderQ, "builder");
        queryBuilderQ.g(com.dw.ht.map.entitys.b.f6585h, SatelliteOfflineMapItem.a.f6555g.ordinal());
        queryBuilderQ.j(com.dw.ht.map.entitys.b.f6582e);
        Query queryA = queryBuilderQ.a();
        rd.m.d(queryA, "builder.build()");
        this.dataSubscription = queryA.p0().f(zb.a.c()).e(this);
    }

    @Override // androidx.fragment.app.o
    public void P2() {
        super.P2();
        d dVar = this.dataSubscription;
        if (dVar != null) {
            dVar.cancel();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.o
    public void Q2(View view, Bundle savedInstanceState) {
        rd.m.e(view, "view");
        super.Q2(view, savedInstanceState);
        m mVarC = m.c(k1());
        rd.m.d(mVarC, "getInstance(...)");
        this.mapUtils = mVarC;
        i iVarI0 = j1().i0(R.id.mapView);
        if (iVarI0 == null) {
            o oVarD = m.d();
            this.map = (a) oVarD;
            j1().o().b(R.id.mapView, oVarD).i();
        } else {
            this.map = (a) iVarI0;
        }
        a aVar = this.map;
        if (aVar != null) {
            aVar.C0(this);
            aVar.setMapLayer(this.mapLayer);
        }
        y yVar = this.binding;
        if (yVar != null) {
            yVar.f21700f.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: c5.h
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view2, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                    com.dw.ht.map.ui.b.g4(this.f4333a, view2, i10, i11, i12, i13, i14, i15, i16, i17);
                }
            });
            yVar.f21696b.setOnClickListener(this);
            yVar.f21697c.setOnNumberChangeListener(new NumberPreferenceView.c() { // from class: c5.i
                @Override // com.dw.android.widget.NumberPreferenceView.c
                public final void f(NumberPreferenceView numberPreferenceView, int i10, int i11) {
                    com.dw.ht.map.ui.b.h4(this.f4336a, numberPreferenceView, i10, i11);
                }
            });
        }
        Location locationB = g.f23195s.b(k1());
        if (locationB != null) {
            a aVar2 = this.map;
            if (aVar2 != null) {
                aVar2.H(new LatLng(locationB.getLatitude(), locationB.getLongitude()), 15.0f);
                return;
            }
            return;
        }
        a aVar3 = this.map;
        if (aVar3 != null) {
            aVar3.w0(15.0f);
        }
    }

    @Override // com.dw.ht.map.ui.a.InterfaceC0095a
    public void Y(LatLng northeast, LatLng southwest, float scalePerPixel) {
        rd.m.e(northeast, "northeast");
        rd.m.e(southwest, "southwest");
        i4();
    }

    public final void Z3(boolean justWifi) {
        a aVar;
        LatLng latLngJ0;
        y yVar = this.binding;
        if (yVar == null || (aVar = this.map) == null) {
            return;
        }
        Rect hollow = yVar.f21700f.getHollow();
        LatLng latLngJ02 = aVar.J0(new Point(hollow.left, hollow.bottom));
        if (latLngJ02 == null || (latLngJ0 = aVar.J0(new Point(hollow.right, hollow.top))) == null) {
            return;
        }
        m mVar = this.mapUtils;
        if (mVar == null) {
            rd.m.o("mapUtils");
            mVar = null;
        }
        LatLngBounds latLngBoundsP = mVar.p(new LatLngBounds(latLngJ02, latLngJ0));
        io.objectbox.a aVarK = j0.i().k(SatelliteOfflineMapItem.class);
        SatelliteOfflineMapItem satelliteOfflineMapItem = new SatelliteOfflineMapItem(0L, null, 0, null, 0L, 0.0d, 0.0d, 0.0d, 0.0d, false, 1023, null);
        rd.m.b(latLngBoundsP);
        satelliteOfflineMapItem.o(latLngBoundsP);
        satelliteOfflineMapItem.u(yVar.f21697c.getNumber());
        satelliteOfflineMapItem.q(justWifi);
        satelliteOfflineMapItem.r(this.mapLayer);
        aVarK.n(satelliteOfflineMapItem);
        OfflineMapDownloadService.Companion companion = OfflineMapDownloadService.INSTANCE;
        Context contextX3 = x3();
        rd.m.d(contextX3, "requireContext(...)");
        companion.e(contextX3);
        p pVarE1 = e1();
        if (pVarE1 != null) {
            pVarE1.finish();
        }
    }

    @Override // com.dw.ht.map.ui.a.InterfaceC0095a
    public void b(int reason) {
        i4();
    }

    @Override // com.dw.ht.map.ui.a.InterfaceC0095a
    public void c0(Object map) {
        rd.m.e(map, "map");
        c cVar = map instanceof c ? (c) map : null;
        if (cVar != null) {
            k kVarK = cVar.k();
            kVarK.b(false);
            kVarK.b(false);
            kVarK.a(false);
            kVarK.d(false);
            kVarK.c(false);
            cVar.m(false);
            cVar.C(false);
            cVar.n(false);
        }
    }

    @Override // fc.a
    /* JADX INFO: renamed from: e4 */
    public void Q0(List data) {
        rd.m.e(data, "data");
        ArrayList arrayList = new ArrayList();
        for (Object obj : data) {
            if (((SatelliteOfflineMapItem) obj).f() == this.mapLayer) {
                arrayList.add(obj);
            }
        }
        this.items = arrayList;
        a aVar = this.map;
        if (aVar == null) {
            return;
        }
        aVar.d0(arrayList);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v10) {
        rd.m.e(v10, "v");
        OfflineMapDownloadService.Companion companion = OfflineMapDownloadService.INSTANCE;
        Context contextX3 = x3();
        rd.m.d(contextX3, "requireContext(...)");
        if (companion.d(contextX3)) {
            Z3(true);
            d0 d0Var = d0.f10897a;
        } else if (Cfg.f5488g) {
            new AlertDialog.Builder(x3()).setMessage(N1(R.string.wifiRequiredToDownloadMap)).setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() { // from class: c5.c
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    com.dw.ht.map.ui.b.a4(this.f4316a, dialogInterface, i10);
                }
            }).setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: c5.d
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    com.dw.ht.map.ui.b.b4(this.f4323a, dialogInterface, i10);
                }
            }).show();
        } else {
            new AlertDialog.Builder(x3()).setMessage(N1(R.string.downloadByMobileData)).setNegativeButton(R.string.no, new DialogInterface.OnClickListener() { // from class: c5.e
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    com.dw.ht.map.ui.b.c4(this.f4326a, dialogInterface, i10);
                }
            }).setPositiveButton(R.string.yes, new DialogInterface.OnClickListener() { // from class: c5.f
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    com.dw.ht.map.ui.b.d4(this.f4327a, dialogInterface, i10);
                }
            }).show();
        }
    }

    @Override // com.dw.ht.map.ui.a.InterfaceC0095a
    public void q0(x locationMode) {
        rd.m.e(locationMode, "locationMode");
    }

    @Override // androidx.fragment.app.o
    public void r2(Bundle savedInstanceState) {
        super.r2(savedInstanceState);
        io.objectbox.a aVarK = j0.i().k(SatelliteOfflineMapItem.class);
        rd.m.d(aVarK, "boxFor(T::class.java)");
        this.box = aVarK;
        Bundle bundleI1 = i1();
        j jVar = (j) (bundleI1 != null ? bundleI1.getSerializable("layer") : null);
        if (jVar != null) {
            this.mapLayer = jVar;
        }
    }

    @Override // androidx.fragment.app.o
    public View v2(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rd.m.e(inflater, "inflater");
        y yVarC = y.c(inflater, container, false);
        this.binding = yVarC;
        rd.m.b(yVarC);
        ConstraintLayout constraintLayoutB = yVarC.b();
        rd.m.d(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // androidx.fragment.app.o
    public void y2() {
        super.y2();
        this.map = null;
        this.binding = null;
    }
}
