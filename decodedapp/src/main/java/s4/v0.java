package s4;

import android.content.Context;
import android.content.DialogInterface;
import android.location.Location;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.app.c;
import androidx.loader.app.a;
import com.benshikj.ht.R;
import com.dw.ht.Cfg;
import com.dw.ht.map.ui.a;
import com.dw.widget.ActionButton;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;
import kotlin.Metadata;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0006J'\u0010\u000e\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0014\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u00122\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u00072\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\u00072\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J'\u00103\u001a\b\u0012\u0004\u0012\u00020\u0003022\u0006\u00100\u001a\u00020(2\b\u00101\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b3\u00104J'\u00107\u001a\u00020\u00072\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u0003022\b\u00106\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b7\u00108J\u001d\u00109\u001a\u00020\u00072\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u000302H\u0016¢\u0006\u0004\b9\u0010:J+\u0010?\u001a\u00020>2\u0006\u0010!\u001a\u00020;2\b\u0010=\u001a\u0004\u0018\u00010<2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\u0007H\u0016¢\u0006\u0004\bA\u0010\u0006J!\u0010C\u001a\u00020\u00072\u0006\u0010B\u001a\u00020>2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\u0007H\u0016¢\u0006\u0004\bE\u0010\u0006R\u0018\u0010I\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u00106\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010N\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010MR\u0016\u0010Q\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010S\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010PR\u0018\u00105\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010UR\u0016\u0010X\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0018\u0010\\\u001a\u0004\u0018\u00010Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R$\u0010a\u001a\u00020\u00122\u0006\u0010]\u001a\u00020\u00128\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b^\u0010W\"\u0004\b_\u0010`R\u0016\u0010e\u001a\u00020b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010d¨\u0006f"}, d2 = {"Ls4/v0;", "Landroidx/fragment/app/o;", "Landroidx/loader/app/a$a;", "Ld5/h;", "Lcom/dw/ht/map/ui/a$a;", "<init>", "()V", "Ldd/d0;", "V3", "Lcom/google/android/gms/maps/model/LatLng;", "northeast", "southwest", "", "scalePerPixel", "Y", "(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;F)V", "Lc5/b0;", "overlay", "", "byUser", "G0", "(Lc5/b0;Z)Z", "Lc5/x;", "locationMode", "q0", "(Lc5/x;)V", "Landroid/os/Bundle;", "savedInstanceState", "r2", "(Landroid/os/Bundle;)V", "Landroid/view/Menu;", "menu", "Landroid/view/MenuInflater;", "inflater", "u2", "(Landroid/view/Menu;Landroid/view/MenuInflater;)V", "Landroid/view/MenuItem;", "item", "F2", "(Landroid/view/MenuItem;)Z", "", "reason", "b", "(I)V", "", "map", "c0", "(Ljava/lang/Object;)V", Name.MARK, "args", "Lg1/c;", "S", "(ILandroid/os/Bundle;)Lg1/c;", "loader", "data", "X3", "(Lg1/c;Ld5/h;)V", "t0", "(Lg1/c;)V", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "v2", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "y2", "view", "Q2", "(Landroid/view/View;Landroid/os/Bundle;)V", "M2", "Lm4/w;", "o0", "Lm4/w;", "binding", "p0", "Ld5/h;", "Lcom/dw/ht/map/ui/a;", "Lcom/dw/ht/map/ui/a;", "mMap", "r0", "I", "padding", "s0", "color", "Ld5/i;", "Ld5/i;", "u0", "Z", "needChangeCamera", "", "v0", "Ljava/lang/String;", "who", "value", "w0", "Z3", "(Z)V", "mFollowingLast", "", "x0", "J", "uid", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class v0 extends androidx.fragment.app.o implements a.InterfaceC0037a, a.InterfaceC0095a {

    /* JADX INFO: renamed from: o0, reason: collision with root package name and from kotlin metadata */
    private m4.w binding;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    private d5.h data;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    private com.dw.ht.map.ui.a mMap;

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
    private d5.i loader;

    /* JADX INFO: renamed from: v0, reason: collision with root package name and from kotlin metadata */
    private String who;

    /* JADX INFO: renamed from: w0, reason: collision with root package name and from kotlin metadata */
    private boolean mFollowingLast;

    /* JADX INFO: renamed from: x0, reason: collision with root package name and from kotlin metadata */
    private long uid;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    private int padding = 8;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    private int color = -16777216;

    /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata */
    private boolean needChangeCamera = true;

    public static final class a implements z4.t {
        a() {
        }

        @Override // z4.t
        public boolean a(z4.j jVar) {
            rd.m.e(jVar, "newLayer");
            com.dw.ht.map.ui.a aVar = v0.this.mMap;
            if (aVar == null) {
                return false;
            }
            aVar.setMapLayer(jVar);
            return false;
        }
    }

    private final void V3() {
        int iQ = Cfg.Q();
        final int[] intArray = H1().getIntArray(R.array.show_track_times);
        rd.m.d(intArray, "getIntArray(...)");
        new c.a(x3()).y(R.string.showRecent).v(R.array.show_track_time_names, ed.j.K(intArray, iQ), new DialogInterface.OnClickListener() { // from class: s4.u0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                v0.W3(intArray, this, dialogInterface, i10);
            }
        }).C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W3(int[] iArr, v0 v0Var, DialogInterface dialogInterface, int i10) {
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        Cfg.R0(iArr[i10]);
        v0Var.needChangeCamera = true;
        d5.i iVar = v0Var.loader;
        if (iVar != null) {
            iVar.S();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y3(v0 v0Var, View view) {
        z4.l lVar = z4.l.f32949a;
        rd.m.b(view);
        z4.j jVarE = Cfg.E();
        rd.m.d(jVarE, "getMapLayer(...)");
        lVar.b(view, jVarE, v0Var.new a());
    }

    private final void Z3(boolean z10) {
        com.dw.ht.map.ui.a aVar;
        if (this.mFollowingLast == z10) {
            return;
        }
        this.mFollowingLast = z10;
        if (z10) {
            d5.h hVar = this.data;
            Location locationL = hVar != null ? hVar.l() : null;
            if (locationL == null || (aVar = this.mMap) == null) {
                return;
            }
            LatLng latLngO = z4.m.o(locationL);
            rd.m.d(latLngO, "toLatLng(...)");
            aVar.H(latLngO, 18.0f);
        }
    }

    @Override // androidx.fragment.app.o
    public boolean F2(MenuItem item) {
        rd.m.e(item, "item");
        int itemId = item.getItemId();
        if (itemId == R.id.request_loc) {
            Z3(true);
            return super.F2(item);
        }
        if (itemId == R.id.route) {
            d5.h hVar = this.data;
            if ((hVar != null ? hVar.l() : null) != null) {
                Context contextX3 = x3();
                String str = this.who;
                d5.h hVar2 = this.data;
                rd.m.b(hVar2);
                Location locationL = hVar2.l();
                rd.m.b(locationL);
                o5.f.c(contextX3, str, locationL);
            }
        } else {
            if (itemId != R.id.time) {
                return super.F2(item);
            }
            V3();
        }
        return true;
    }

    @Override // com.dw.ht.map.ui.a.InterfaceC0095a
    public boolean G0(c5.b0 overlay, boolean byUser) {
        return true;
    }

    @Override // androidx.fragment.app.o
    public void M2() {
        super.M2();
        com.dw.ht.map.ui.a aVar = this.mMap;
        if (aVar != null) {
            z4.j jVarE = Cfg.E();
            rd.m.d(jVarE, "getMapLayer(...)");
            aVar.setMapLayer(jVarE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.o
    public void Q2(View view, Bundle savedInstanceState) {
        ActionButton actionButton;
        rd.m.e(view, "view");
        super.Q2(view, savedInstanceState);
        l1.i iVarI0 = j1().i0(R.id._map);
        if (iVarI0 == null) {
            androidx.fragment.app.o oVarD = z4.m.d();
            this.mMap = (com.dw.ht.map.ui.a) oVarD;
            j1().o().b(R.id._map, oVarD).i();
        } else {
            this.mMap = (com.dw.ht.map.ui.a) iVarI0;
        }
        com.dw.ht.map.ui.a aVar = this.mMap;
        rd.m.b(aVar);
        aVar.C0(this);
        z4.j jVarE = Cfg.E();
        rd.m.d(jVarE, "getMapLayer(...)");
        aVar.setMapLayer(jVarE);
        Bundle bundleI1 = i1();
        if (bundleI1 != null) {
            this.who = bundleI1.getString("com.dw.ht.intent.extras.FROM");
            this.uid = bundleI1.getLong("com.dw.ht.intent.extras.UID");
        }
        g1.c cVarC = x1().c(0, null, this);
        rd.m.c(cVarC, "null cannot be cast to non-null type com.dw.ht.model.TrackLoader");
        this.loader = (d5.i) cVarC;
        m4.w wVar = this.binding;
        if (wVar == null || (actionButton = wVar.f21649c) == null) {
            return;
        }
        actionButton.setOnClickListener(new View.OnClickListener() { // from class: s4.t0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                v0.Y3(this.f26772a, view2);
            }
        });
    }

    @Override // androidx.loader.app.a.InterfaceC0037a
    public g1.c S(int id2, Bundle args) {
        return new d5.i(x3(), this.who, this.uid);
    }

    @Override // androidx.loader.app.a.InterfaceC0037a
    /* JADX INFO: renamed from: X3, reason: merged with bridge method [inline-methods] */
    public void K(g1.c loader, d5.h data) {
        ArrayList arrayListB;
        androidx.fragment.app.p pVarE1;
        rd.m.e(loader, "loader");
        d5.h hVar = this.data;
        boolean z10 = ((hVar != null ? hVar.l() : null) == null) != ((data != null ? data.l() : null) == null);
        this.data = data;
        if (z10 && (pVarE1 = e1()) != null) {
            pVarE1.invalidateOptionsMenu();
        }
        com.dw.ht.map.ui.a aVar = this.mMap;
        if (aVar == null) {
            return;
        }
        if (data == null) {
            arrayListB = new ArrayList(0);
        } else {
            arrayListB = a6.o.b(data);
            rd.m.d(arrayListB, "newArrayList(...)");
        }
        aVar.m(arrayListB);
        if (data == null) {
            c5.b.a(aVar, new ArrayList(0), null, 2, null);
            return;
        }
        if (data.l() != null) {
            Location locationL = data.l();
            rd.m.b(locationL);
            ArrayList arrayListB2 = a6.o.b(new c5.b0(locationL, "", data.q(), -1L, data.r()));
            rd.m.d(arrayListB2, "newArrayList(...)");
            aVar.n(arrayListB2, this.mFollowingLast ? -1L : null);
        } else {
            ArrayList arrayListA = a6.o.a();
            rd.m.d(arrayListA, "newArrayList(...)");
            c5.b.a(aVar, arrayListA, null, 2, null);
        }
        if (this.needChangeCamera) {
            LatLngBounds latLngBoundsA = data.e().a();
            rd.m.d(latLngBoundsA, "build(...)");
            aVar.G(latLngBoundsA, null);
            this.needChangeCamera = false;
        }
    }

    @Override // com.dw.ht.map.ui.a.InterfaceC0095a
    public void Y(LatLng northeast, LatLng southwest, float scalePerPixel) {
        rd.m.e(northeast, "northeast");
        rd.m.e(southwest, "southwest");
    }

    @Override // com.dw.ht.map.ui.a.InterfaceC0095a
    public void b(int reason) {
        if (reason == 1) {
            Z3(false);
        }
    }

    @Override // com.dw.ht.map.ui.a.InterfaceC0095a
    public void c0(Object map) {
        rd.m.e(map, "map");
    }

    @Override // com.dw.ht.map.ui.a.InterfaceC0095a
    public void q0(c5.x locationMode) {
        rd.m.e(locationMode, "locationMode");
    }

    @Override // androidx.fragment.app.o
    public void r2(Bundle savedInstanceState) {
        super.r2(savedInstanceState);
        G3(true);
        this.padding = a6.k.b(k1(), 32.0f);
        Integer numB = a6.y.b(k1(), R.attr.colorPrimary);
        rd.m.b(numB);
        this.color = numB.intValue();
    }

    @Override // androidx.loader.app.a.InterfaceC0037a
    public void t0(g1.c loader) {
        rd.m.e(loader, "loader");
    }

    @Override // androidx.fragment.app.o
    public void u2(Menu menu, MenuInflater inflater) {
        MenuItem menuItemFindItem;
        rd.m.e(menu, "menu");
        rd.m.e(inflater, "inflater");
        super.u2(menu, inflater);
        inflater.inflate(R.menu.o_track, menu);
        d5.h hVar = this.data;
        if ((hVar != null ? hVar.l() : null) != null || (menuItemFindItem = menu.findItem(R.id.route)) == null) {
            return;
        }
        menuItemFindItem.setVisible(false);
    }

    @Override // androidx.fragment.app.o
    public View v2(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rd.m.e(inflater, "inflater");
        this.needChangeCamera = true;
        m4.w wVarC = m4.w.c(inflater, container, false);
        this.binding = wVarC;
        rd.m.b(wVarC);
        FrameLayout frameLayoutB = wVarC.b();
        rd.m.d(frameLayoutB, "getRoot(...)");
        return frameLayoutB;
    }

    @Override // androidx.fragment.app.o
    public void y2() {
        super.y2();
        this.binding = null;
    }
}
