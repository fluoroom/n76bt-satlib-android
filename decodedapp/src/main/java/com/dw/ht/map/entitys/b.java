package com.dw.ht.map.entitys;

import cc.c;
import com.dw.ht.map.entitys.SatelliteOfflineMapItem;
import com.dw.ht.map.entitys.SatelliteOfflineMapItemCursor;
import io.objectbox.e;
import org.simpleframework.xml.strategy.Name;
import z4.j;

/* JADX INFO: loaded from: classes.dex */
public final class b implements yb.b {
    public static final e A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f6578a = SatelliteOfflineMapItem.class;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final cc.b f6579b = new SatelliteOfflineMapItemCursor.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final a f6580c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f6581d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f6582e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f6583f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final e f6584g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final e f6585h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final e f6586r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final e f6587s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final e f6588t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final e f6589u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final e f6590v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final e f6591w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final e f6592x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final e f6593y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final e[] f6594z;

    static final class a implements c {
        a() {
        }

        public long a(SatelliteOfflineMapItem satelliteOfflineMapItem) {
            return satelliteOfflineMapItem.getId();
        }
    }

    static {
        b bVar = new b();
        f6581d = bVar;
        Class cls = Long.TYPE;
        e eVar = new e(bVar, 0, 1, cls, Name.MARK, true, Name.MARK);
        f6582e = eVar;
        e eVar2 = new e(bVar, 1, 2, String.class, "title");
        f6583f = eVar2;
        Class cls2 = Integer.TYPE;
        e eVar3 = new e(bVar, 2, 8, cls2, "zoom");
        f6584g = eVar3;
        e eVar4 = new e(bVar, 3, 9, cls2, "status", false, "status", SatelliteOfflineMapItem.StatusConverter.class, SatelliteOfflineMapItem.a.class);
        f6585h = eVar4;
        e eVar5 = new e(bVar, 4, 10, cls, "latest_update");
        f6586r = eVar5;
        Class cls3 = Double.TYPE;
        e eVar6 = new e(bVar, 5, 4, cls3, "southwest_latitude");
        f6587s = eVar6;
        e eVar7 = new e(bVar, 6, 5, cls3, "southwest_longitude");
        f6588t = eVar7;
        e eVar8 = new e(bVar, 7, 6, cls3, "northeast_latitude");
        f6589u = eVar8;
        e eVar9 = new e(bVar, 8, 7, cls3, "northeast_longitude");
        f6590v = eVar9;
        Class cls4 = Boolean.TYPE;
        e eVar10 = new e(bVar, 9, 12, cls4, "justDownloadInWifi");
        f6591w = eVar10;
        e eVar11 = new e(bVar, 10, 11, cls4, "_terrainMode");
        f6592x = eVar11;
        e eVar12 = new e(bVar, 11, 13, cls2, "mapLayer", false, "mapLayer", SatelliteOfflineMapItem.MapLayerConverter.class, j.class);
        f6593y = eVar12;
        f6594z = new e[]{eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, eVar9, eVar10, eVar11, eVar12};
        A = eVar;
    }

    @Override // yb.b
    public e[] B() {
        return f6594z;
    }

    @Override // yb.b
    public Class E() {
        return f6578a;
    }

    @Override // yb.b
    public String J() {
        return "SatelliteOfflineMapItem";
    }

    @Override // yb.b
    public cc.b M() {
        return f6579b;
    }

    @Override // yb.b
    public c u() {
        return f6580c;
    }
}
