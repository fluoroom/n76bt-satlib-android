package com.dw.ht;

import android.content.Context;
import com.dw.ht.entitys.FactorySettings;
import com.dw.ht.entitys.LinkSettings;
import com.dw.ht.entitys.RegionBind;
import com.dw.ht.entitys.Satellite;
import com.dw.ht.entitys.SatelliteRadioConfiguration;
import io.objectbox.BoxStore;

/* JADX INFO: loaded from: classes.dex */
public final class j0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static BoxStore f6342b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j0 f6341a = new j0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final dd.j f6343c = dd.k.b(new qd.a() { // from class: com.dw.ht.e0
        @Override // qd.a
        public final Object a() {
            return j0.r();
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final dd.j f6344d = dd.k.b(new qd.a() { // from class: com.dw.ht.f0
        @Override // qd.a
        public final Object a() {
            return j0.g();
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final dd.j f6345e = dd.k.b(new qd.a() { // from class: com.dw.ht.g0
        @Override // qd.a
        public final Object a() {
            return j0.t();
        }
    });

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final dd.j f6346f = dd.k.b(new qd.a() { // from class: com.dw.ht.h0
        @Override // qd.a
        public final Object a() {
            return j0.u();
        }
    });

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final dd.j f6347g = dd.k.b(new qd.a() { // from class: com.dw.ht.i0
        @Override // qd.a
        public final Object a() {
            return j0.p();
        }
    });

    private j0() {
    }

    public static final void f(Context context) {
        rd.m.e(context, "context");
        BoxStore boxStoreB = a0.k().a(context.getApplicationContext()).b();
        rd.m.d(boxStoreB, "build(...)");
        f6342b = boxStoreB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final io.objectbox.a g() {
        return i().k(FactorySettings.class);
    }

    public static final RegionBind h(long j10, int i10) {
        return (RegionBind) f6341a.m().q().e(com.dw.ht.entitys.f.f5789f, j10).e(com.dw.ht.entitys.f.f5790g, i10).a().H();
    }

    public static final BoxStore i() {
        BoxStore boxStore = f6342b;
        if (boxStore != null) {
            return boxStore;
        }
        rd.m.o("boxStore");
        return null;
    }

    public static final LinkSettings k(long j10) {
        LinkSettings linkSettings = (LinkSettings) f6341a.l().q().e(com.dw.ht.entitys.d.f5762f, j10).a().H();
        return linkSettings == null ? new LinkSettings(0L, j10, null, false, 13, null) : linkSettings;
    }

    private final io.objectbox.a m() {
        Object value = f6343c.getValue();
        rd.m.d(value, "getValue(...)");
        return (io.objectbox.a) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final io.objectbox.a p() {
        return i().k(LinkSettings.class);
    }

    public static final void q(LinkSettings linkSettings) {
        rd.m.e(linkSettings, "settings");
        f6341a.l().n(linkSettings);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final io.objectbox.a r() {
        return i().k(RegionBind.class);
    }

    public static final void s(long j10) {
        LinkSettings linkSettingsK = k(j10);
        if (linkSettingsK.getId() > 0) {
            f6341a.l().w(linkSettingsK);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final io.objectbox.a t() {
        return i().k(Satellite.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final io.objectbox.a u() {
        return i().k(SatelliteRadioConfiguration.class);
    }

    public static final void v(long j10, int i10, long j11) {
        long j12;
        RegionBind regionBindH = h(j10, i10);
        if (regionBindH == null) {
            j12 = j11;
            regionBindH = new RegionBind(0L, j10, i10, j12);
        } else {
            j12 = j11;
        }
        regionBindH.f(j12);
        f6341a.m().n(regionBindH);
    }

    public final io.objectbox.a j() {
        Object value = f6344d.getValue();
        rd.m.d(value, "getValue(...)");
        return (io.objectbox.a) value;
    }

    public final io.objectbox.a l() {
        Object value = f6347g.getValue();
        rd.m.d(value, "getValue(...)");
        return (io.objectbox.a) value;
    }

    public final io.objectbox.a n() {
        Object value = f6345e.getValue();
        rd.m.d(value, "getValue(...)");
        return (io.objectbox.a) value;
    }

    public final io.objectbox.a o() {
        Object value = f6346f.getValue();
        rd.m.d(value, "getValue(...)");
        return (io.objectbox.a) value;
    }
}
