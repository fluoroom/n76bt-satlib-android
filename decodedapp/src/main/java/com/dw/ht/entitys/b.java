package com.dw.ht.entitys;

import com.dw.ht.entitys.FactorySettingsCursor;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes.dex */
public final class b implements yb.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f5727a = FactorySettings.class;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final cc.b f5728b = new FactorySettingsCursor.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final a f5729c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f5730d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final io.objectbox.e f5731e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final io.objectbox.e f5732f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final io.objectbox.e f5733g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final io.objectbox.e f5734h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final io.objectbox.e f5735r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final io.objectbox.e f5736s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final io.objectbox.e f5737t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final io.objectbox.e[] f5738u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final io.objectbox.e f5739v;

    static final class a implements cc.c {
        a() {
        }

        public long a(FactorySettings factorySettings) {
            return factorySettings.getId();
        }
    }

    static {
        b bVar = new b();
        f5730d = bVar;
        io.objectbox.e eVar = new io.objectbox.e(bVar, 0, 1, Long.TYPE, Name.MARK, true, Name.MARK);
        f5731e = eVar;
        io.objectbox.e eVar2 = new io.objectbox.e(bVar, 1, 2, String.class, "name");
        f5732f = eVar2;
        io.objectbox.e eVar3 = new io.objectbox.e(bVar, 2, 3, Integer.TYPE, "freqRangeCount");
        f5733g = eVar3;
        io.objectbox.e eVar4 = new io.objectbox.e(bVar, 3, 4, byte[].class, "settings");
        f5734h = eVar4;
        io.objectbox.e eVar5 = new io.objectbox.e(bVar, 4, 5, byte[].class, "iba");
        f5735r = eVar5;
        io.objectbox.e eVar6 = new io.objectbox.e(bVar, 5, 6, byte[].class, "vco");
        f5736s = eVar6;
        io.objectbox.e eVar7 = new io.objectbox.e(bVar, 6, 7, byte[].class, "settings2");
        f5737t = eVar7;
        f5738u = new io.objectbox.e[]{eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7};
        f5739v = eVar;
    }

    @Override // yb.b
    public io.objectbox.e[] B() {
        return f5738u;
    }

    @Override // yb.b
    public Class E() {
        return f5727a;
    }

    @Override // yb.b
    public String J() {
        return "FactorySettings";
    }

    @Override // yb.b
    public cc.b M() {
        return f5728b;
    }

    @Override // yb.b
    public cc.c u() {
        return f5729c;
    }
}
