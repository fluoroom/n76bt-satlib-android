package com.dw.ht.map.entitys;

import cc.c;
import com.dw.ht.map.entitys.ETagCursor;
import com.dw.ht.map.entitys.SatelliteOfflineMapItem;
import io.objectbox.e;
import org.simpleframework.xml.strategy.Name;
import z4.j;

/* JADX INFO: loaded from: classes.dex */
public final class a implements yb.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f6566a = ETag.class;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final cc.b f6567b = new ETagCursor.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final C0094a f6568c = new C0094a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f6569d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f6570e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f6571f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final e f6572g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final e f6573h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final e f6574r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final e f6575s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final e[] f6576t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final e f6577u;

    /* JADX INFO: renamed from: com.dw.ht.map.entitys.a$a, reason: collision with other inner class name */
    static final class C0094a implements c {
        C0094a() {
        }

        public long a(ETag eTag) {
            return eTag.getId();
        }
    }

    static {
        a aVar = new a();
        f6569d = aVar;
        e eVar = new e(aVar, 0, 1, Long.TYPE, Name.MARK, true, Name.MARK);
        f6570e = eVar;
        Class cls = Integer.TYPE;
        e eVar2 = new e(aVar, 1, 2, cls, "mapLayer", false, "mapLayer", SatelliteOfflineMapItem.MapLayerConverter.class, j.class);
        f6571f = eVar2;
        e eVar3 = new e(aVar, 2, 3, cls, "x");
        f6572g = eVar3;
        e eVar4 = new e(aVar, 3, 4, cls, "y");
        f6573h = eVar4;
        e eVar5 = new e(aVar, 4, 5, cls, "z");
        f6574r = eVar5;
        e eVar6 = new e(aVar, 5, 6, String.class, "tag");
        f6575s = eVar6;
        f6576t = new e[]{eVar, eVar2, eVar3, eVar4, eVar5, eVar6};
        f6577u = eVar;
    }

    @Override // yb.b
    public e[] B() {
        return f6576t;
    }

    @Override // yb.b
    public Class E() {
        return f6566a;
    }

    @Override // yb.b
    public String J() {
        return "ETag";
    }

    @Override // yb.b
    public cc.b M() {
        return f6567b;
    }

    @Override // yb.b
    public c u() {
        return f6568c;
    }
}
