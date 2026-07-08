package com.dw.ht.entitys;

import com.dw.ht.entitys.SatelliteCursor;
import d5.a;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes.dex */
public final class h implements yb.b {
    public static final io.objectbox.e A;
    public static final io.objectbox.e B;
    public static final io.objectbox.e C;
    public static final io.objectbox.e[] D;
    public static final io.objectbox.e E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f5811a = Satellite.class;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final cc.b f5812b = new SatelliteCursor.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final a f5813c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h f5814d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final io.objectbox.e f5815e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final io.objectbox.e f5816f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final io.objectbox.e f5817g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final io.objectbox.e f5818h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final io.objectbox.e f5819r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final io.objectbox.e f5820s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final io.objectbox.e f5821t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final io.objectbox.e f5822u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final io.objectbox.e f5823v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final io.objectbox.e f5824w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final io.objectbox.e f5825x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final io.objectbox.e f5826y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final io.objectbox.e f5827z;

    static final class a implements cc.c {
        a() {
        }

        public long a(Satellite satellite) {
            return satellite.getId();
        }
    }

    static {
        h hVar = new h();
        f5814d = hVar;
        Class cls = Long.TYPE;
        io.objectbox.e eVar = new io.objectbox.e(hVar, 0, 1, cls, Name.MARK, true, Name.MARK);
        f5815e = eVar;
        io.objectbox.e eVar2 = new io.objectbox.e(hVar, 1, 2, String.class, "name");
        f5816f = eVar2;
        Class cls2 = Integer.TYPE;
        io.objectbox.e eVar3 = new io.objectbox.e(hVar, 2, 3, cls2, "noradCatID");
        f5817g = eVar3;
        io.objectbox.e eVar4 = new io.objectbox.e(hVar, 3, 5, String.class, "tleLine1");
        f5818h = eVar4;
        io.objectbox.e eVar5 = new io.objectbox.e(hVar, 4, 6, String.class, "tleLine2");
        f5819r = eVar5;
        Class cls3 = Boolean.TYPE;
        io.objectbox.e eVar6 = new io.objectbox.e(hVar, 5, 9, cls3, "starred");
        f5820s = eVar6;
        io.objectbox.e eVar7 = new io.objectbox.e(hVar, 6, 8, cls3, "showTrack");
        f5821t = eVar7;
        io.objectbox.e eVar8 = new io.objectbox.e(hVar, 7, 18, String.class, "rfConfigName");
        f5822u = eVar8;
        io.objectbox.e eVar9 = new io.objectbox.e(hVar, 8, 10, cls2, "txFreq");
        f5823v = eVar9;
        io.objectbox.e eVar10 = new io.objectbox.e(hVar, 9, 11, cls2, "rxFreq");
        f5824w = eVar10;
        io.objectbox.e eVar11 = new io.objectbox.e(hVar, 10, 12, cls2, "txModulation", false, "txModulation", ModulationConverter.class, a.d.class);
        f5825x = eVar11;
        io.objectbox.e eVar12 = new io.objectbox.e(hVar, 11, 13, cls2, "rxModulation", false, "rxModulation", ModulationConverter.class, a.d.class);
        f5826y = eVar12;
        io.objectbox.e eVar13 = new io.objectbox.e(hVar, 12, 14, cls2, "txSubAudio");
        f5827z = eVar13;
        io.objectbox.e eVar14 = new io.objectbox.e(hVar, 13, 15, cls2, "rxSubAudio");
        A = eVar14;
        io.objectbox.e eVar15 = new io.objectbox.e(hVar, 14, 16, cls2, "bandwidth");
        B = eVar15;
        io.objectbox.e eVar16 = new io.objectbox.e(hVar, 15, 17, cls, "updatedAt");
        C = eVar16;
        D = new io.objectbox.e[]{eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, eVar9, eVar10, eVar11, eVar12, eVar13, eVar14, eVar15, eVar16};
        E = eVar;
    }

    @Override // yb.b
    public io.objectbox.e[] B() {
        return D;
    }

    @Override // yb.b
    public Class E() {
        return f5811a;
    }

    @Override // yb.b
    public String J() {
        return "Satellite";
    }

    @Override // yb.b
    public cc.b M() {
        return f5812b;
    }

    @Override // yb.b
    public cc.c u() {
        return f5813c;
    }
}
