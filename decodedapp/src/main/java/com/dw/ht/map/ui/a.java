package com.dw.ht.map.ui;

import android.graphics.Point;
import android.graphics.Rect;
import android.location.Location;
import c5.b0;
import c5.x;
import c5.y;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;
import java.util.List;
import z4.j;

/* JADX INFO: loaded from: classes.dex */
public interface a {

    /* JADX INFO: renamed from: com.dw.ht.map.ui.a$a, reason: collision with other inner class name */
    public interface InterfaceC0095a {
        boolean G0(b0 b0Var, boolean z10);

        void Y(LatLng latLng, LatLng latLng2, float f10);

        void b(int i10);

        void c0(Object obj);

        void q0(x xVar);
    }

    void A0(Rect rect);

    void C0(InterfaceC0095a interfaceC0095a);

    void G(LatLngBounds latLngBounds, Rect rect);

    void H(LatLng latLng, float f10);

    float I0();

    LatLng J0(Point point);

    void L0(y yVar);

    void O();

    void P(Location location);

    void P0(double d10);

    void R(y yVar);

    void U0(x xVar);

    void d0(List list);

    LatLngBounds l();

    void m(ArrayList arrayList);

    void n(ArrayList arrayList, Long l10);

    Location o();

    int p();

    void r0();

    void setMapLayer(j jVar);

    j v0();

    void w0(float f10);

    void x0();

    void z(long j10);
}
