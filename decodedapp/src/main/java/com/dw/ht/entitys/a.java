package com.dw.ht.entitys;

import com.dw.ht.entitys.ChannelBondCursor;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes.dex */
public final class a implements yb.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f5714a = ChannelBond.class;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final cc.b f5715b = new ChannelBondCursor.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final C0087a f5716c = new C0087a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f5717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final io.objectbox.e f5718e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final io.objectbox.e f5719f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final io.objectbox.e f5720g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final io.objectbox.e f5721h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final io.objectbox.e f5722r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final io.objectbox.e f5723s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final io.objectbox.e f5724t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final io.objectbox.e[] f5725u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final io.objectbox.e f5726v;

    /* JADX INFO: renamed from: com.dw.ht.entitys.a$a, reason: collision with other inner class name */
    static final class C0087a implements cc.c {
        C0087a() {
        }

        public long a(ChannelBond channelBond) {
            return channelBond.getId();
        }
    }

    static {
        a aVar = new a();
        f5717d = aVar;
        Class cls = Long.TYPE;
        io.objectbox.e eVar = new io.objectbox.e(aVar, 0, 1, cls, Name.MARK, true, Name.MARK);
        f5718e = eVar;
        io.objectbox.e eVar2 = new io.objectbox.e(aVar, 1, 2, cls, "networkChannelId");
        f5719f = eVar2;
        io.objectbox.e eVar3 = new io.objectbox.e(aVar, 2, 3, cls, "devId");
        f5720g = eVar3;
        Class cls2 = Integer.TYPE;
        io.objectbox.e eVar4 = new io.objectbox.e(aVar, 3, 4, cls2, "devChannel");
        f5721h = eVar4;
        Class cls3 = Boolean.TYPE;
        io.objectbox.e eVar5 = new io.objectbox.e(aVar, 4, 5, cls3, "routing");
        f5722r = eVar5;
        io.objectbox.e eVar6 = new io.objectbox.e(aVar, 5, 6, cls3, "syncRfConfig");
        f5723s = eVar6;
        io.objectbox.e eVar7 = new io.objectbox.e(aVar, 6, 7, cls2, "devRegion");
        f5724t = eVar7;
        f5725u = new io.objectbox.e[]{eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7};
        f5726v = eVar;
    }

    @Override // yb.b
    public io.objectbox.e[] B() {
        return f5725u;
    }

    @Override // yb.b
    public Class E() {
        return f5714a;
    }

    @Override // yb.b
    public String J() {
        return "ChannelBond";
    }

    @Override // yb.b
    public cc.b M() {
        return f5715b;
    }

    @Override // yb.b
    public cc.c u() {
        return f5716c;
    }
}
