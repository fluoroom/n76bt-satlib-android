package com.dw.ht.entitys;

import com.dw.ht.entitys.RegionBindCursor;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes.dex */
public final class f implements yb.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f5784a = RegionBind.class;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final cc.b f5785b = new RegionBindCursor.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final a f5786c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f5787d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final io.objectbox.e f5788e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final io.objectbox.e f5789f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final io.objectbox.e f5790g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final io.objectbox.e f5791h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final io.objectbox.e[] f5792r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final io.objectbox.e f5793s;

    static final class a implements cc.c {
        a() {
        }

        public long a(RegionBind regionBind) {
            return regionBind.getId();
        }
    }

    static {
        f fVar = new f();
        f5787d = fVar;
        Class cls = Long.TYPE;
        io.objectbox.e eVar = new io.objectbox.e(fVar, 0, 1, cls, Name.MARK, true, Name.MARK);
        f5788e = eVar;
        io.objectbox.e eVar2 = new io.objectbox.e(fVar, 1, 2, cls, "devID");
        f5789f = eVar2;
        io.objectbox.e eVar3 = new io.objectbox.e(fVar, 2, 4, Integer.TYPE, "devRegion");
        f5790g = eVar3;
        io.objectbox.e eVar4 = new io.objectbox.e(fVar, 3, 5, cls, "regionID");
        f5791h = eVar4;
        f5792r = new io.objectbox.e[]{eVar, eVar2, eVar3, eVar4};
        f5793s = eVar;
    }

    @Override // yb.b
    public io.objectbox.e[] B() {
        return f5792r;
    }

    @Override // yb.b
    public Class E() {
        return f5784a;
    }

    @Override // yb.b
    public String J() {
        return "RegionBind";
    }

    @Override // yb.b
    public cc.b M() {
        return f5785b;
    }

    @Override // yb.b
    public cc.c u() {
        return f5786c;
    }
}
