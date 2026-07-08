package com.dw.ht.entitys;

import com.dw.ht.entitys.SatelliteRadioConfigurationCursor;
import d5.a;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes.dex */
public final class g implements yb.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f5794a = SatelliteRadioConfiguration.class;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final cc.b f5795b = new SatelliteRadioConfigurationCursor.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final a f5796c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f5797d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final io.objectbox.e f5798e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final io.objectbox.e f5799f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final io.objectbox.e f5800g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final io.objectbox.e f5801h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final io.objectbox.e f5802r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final io.objectbox.e f5803s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final io.objectbox.e f5804t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final io.objectbox.e f5805u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final io.objectbox.e f5806v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final io.objectbox.e f5807w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final io.objectbox.e f5808x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final io.objectbox.e[] f5809y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final io.objectbox.e f5810z;

    static final class a implements cc.c {
        a() {
        }

        public long a(SatelliteRadioConfiguration satelliteRadioConfiguration) {
            return satelliteRadioConfiguration.getId();
        }
    }

    static {
        g gVar = new g();
        f5797d = gVar;
        io.objectbox.e eVar = new io.objectbox.e(gVar, 0, 1, Long.TYPE, Name.MARK, true, Name.MARK);
        f5798e = eVar;
        io.objectbox.e eVar2 = new io.objectbox.e(gVar, 1, 2, String.class, "name");
        f5799f = eVar2;
        Class cls = Integer.TYPE;
        io.objectbox.e eVar3 = new io.objectbox.e(gVar, 2, 3, cls, "noradCatID");
        f5800g = eVar3;
        io.objectbox.e eVar4 = new io.objectbox.e(gVar, 3, 4, cls, "downlinkFreq");
        f5801h = eVar4;
        io.objectbox.e eVar5 = new io.objectbox.e(gVar, 4, 5, cls, "uplinkFreq");
        f5802r = eVar5;
        io.objectbox.e eVar6 = new io.objectbox.e(gVar, 5, 6, cls, "downlinkSubAudio");
        f5803s = eVar6;
        io.objectbox.e eVar7 = new io.objectbox.e(gVar, 6, 7, cls, "uplinkSubAudio");
        f5804t = eVar7;
        io.objectbox.e eVar8 = new io.objectbox.e(gVar, 7, 8, cls, "downlinkMod", false, "downlinkMod", ModulationConverter.class, a.d.class);
        f5805u = eVar8;
        io.objectbox.e eVar9 = new io.objectbox.e(gVar, 8, 9, cls, "uplinkMod", false, "uplinkMod", ModulationConverter.class, a.d.class);
        f5806v = eVar9;
        io.objectbox.e eVar10 = new io.objectbox.e(gVar, 9, 10, cls, "bandwidth");
        f5807w = eVar10;
        io.objectbox.e eVar11 = new io.objectbox.e(gVar, 10, 11, Boolean.TYPE, "isCreatedByUser");
        f5808x = eVar11;
        f5809y = new io.objectbox.e[]{eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, eVar9, eVar10, eVar11};
        f5810z = eVar;
    }

    @Override // yb.b
    public io.objectbox.e[] B() {
        return f5809y;
    }

    @Override // yb.b
    public Class E() {
        return f5794a;
    }

    @Override // yb.b
    public String J() {
        return "SatelliteRadioConfiguration";
    }

    @Override // yb.b
    public cc.b M() {
        return f5795b;
    }

    @Override // yb.b
    public cc.c u() {
        return f5796c;
    }
}
