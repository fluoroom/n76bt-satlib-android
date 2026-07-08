package com.dw.ht.entitys;

import com.dw.ht.entitys.MarkerCursor;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes.dex */
public final class e implements yb.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f5767a = Marker.class;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final cc.b f5768b = new MarkerCursor.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final a f5769c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f5770d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final io.objectbox.e f5771e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final io.objectbox.e f5772f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final io.objectbox.e f5773g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final io.objectbox.e f5774h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final io.objectbox.e f5775r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final io.objectbox.e f5776s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final io.objectbox.e f5777t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final io.objectbox.e f5778u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final io.objectbox.e f5779v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final io.objectbox.e f5780w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final io.objectbox.e f5781x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final io.objectbox.e[] f5782y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final io.objectbox.e f5783z;

    static final class a implements cc.c {
        a() {
        }

        public long a(Marker marker) {
            return marker.getId();
        }
    }

    static {
        e eVar = new e();
        f5770d = eVar;
        Class cls = Long.TYPE;
        io.objectbox.e eVar2 = new io.objectbox.e(eVar, 0, 1, cls, Name.MARK, true, Name.MARK);
        f5771e = eVar2;
        Class cls2 = Double.TYPE;
        io.objectbox.e eVar3 = new io.objectbox.e(eVar, 1, 2, cls2, "latitude");
        f5772f = eVar3;
        io.objectbox.e eVar4 = new io.objectbox.e(eVar, 2, 3, cls2, "longitude");
        f5773g = eVar4;
        io.objectbox.e eVar5 = new io.objectbox.e(eVar, 3, 4, Double.class, "altitude");
        f5774h = eVar5;
        io.objectbox.e eVar6 = new io.objectbox.e(eVar, 4, 5, Float.class, "accuracy");
        f5775r = eVar6;
        io.objectbox.e eVar7 = new io.objectbox.e(eVar, 5, 6, Float.class, "speed");
        f5776s = eVar7;
        io.objectbox.e eVar8 = new io.objectbox.e(eVar, 6, 7, Float.class, "course");
        f5777t = eVar8;
        io.objectbox.e eVar9 = new io.objectbox.e(eVar, 7, 8, cls, "date");
        f5778u = eVar9;
        io.objectbox.e eVar10 = new io.objectbox.e(eVar, 8, 9, String.class, "title");
        f5779v = eVar10;
        io.objectbox.e eVar11 = new io.objectbox.e(eVar, 9, 10, String.class, "text");
        f5780w = eVar11;
        io.objectbox.e eVar12 = new io.objectbox.e(eVar, 10, 11, String.class, "picture");
        f5781x = eVar12;
        f5782y = new io.objectbox.e[]{eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, eVar9, eVar10, eVar11, eVar12};
        f5783z = eVar2;
    }

    @Override // yb.b
    public io.objectbox.e[] B() {
        return f5782y;
    }

    @Override // yb.b
    public Class E() {
        return f5767a;
    }

    @Override // yb.b
    public String J() {
        return "Marker";
    }

    @Override // yb.b
    public cc.b M() {
        return f5768b;
    }

    @Override // yb.b
    public cc.c u() {
        return f5769c;
    }
}
