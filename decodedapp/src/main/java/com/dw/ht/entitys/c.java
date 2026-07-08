package com.dw.ht.entitys;

import com.dw.ht.entitys.IIChannelCursor;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes.dex */
public final class c implements yb.b {
    public static final io.objectbox.e A;
    public static final io.objectbox.e B;
    public static final io.objectbox.e[] C;
    public static final io.objectbox.e D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f5740a = IIChannel.class;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final cc.b f5741b = new IIChannelCursor.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final a f5742c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f5743d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final io.objectbox.e f5744e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final io.objectbox.e f5745f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final io.objectbox.e f5746g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final io.objectbox.e f5747h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final io.objectbox.e f5748r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final io.objectbox.e f5749s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final io.objectbox.e f5750t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final io.objectbox.e f5751u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final io.objectbox.e f5752v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final io.objectbox.e f5753w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final io.objectbox.e f5754x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final io.objectbox.e f5755y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final io.objectbox.e f5756z;

    static final class a implements cc.c {
        a() {
        }

        public long a(IIChannel iIChannel) {
            return iIChannel.getId();
        }
    }

    static {
        c cVar = new c();
        f5743d = cVar;
        Class cls = Long.TYPE;
        io.objectbox.e eVar = new io.objectbox.e(cVar, 0, 1, cls, Name.MARK, true, Name.MARK);
        f5744e = eVar;
        io.objectbox.e eVar2 = new io.objectbox.e(cVar, 1, 2, cls, "userId");
        f5745f = eVar2;
        io.objectbox.e eVar3 = new io.objectbox.e(cVar, 2, 3, cls, "ownUserId");
        f5746g = eVar3;
        io.objectbox.e eVar4 = new io.objectbox.e(cVar, 3, 4, cls, "channelId");
        f5747h = eVar4;
        io.objectbox.e eVar5 = new io.objectbox.e(cVar, 4, 5, String.class, "name");
        f5748r = eVar5;
        Class cls2 = Boolean.TYPE;
        io.objectbox.e eVar6 = new io.objectbox.e(cVar, 5, 6, cls2, "monitor");
        f5749s = eVar6;
        io.objectbox.e eVar7 = new io.objectbox.e(cVar, 6, 7, cls2, "autoConnect");
        f5750t = eVar7;
        io.objectbox.e eVar8 = new io.objectbox.e(cVar, 7, 8, cls2, "ban");
        f5751u = eVar8;
        io.objectbox.e eVar9 = new io.objectbox.e(cVar, 8, 9, cls2, "isAdmin");
        f5752v = eVar9;
        Class cls3 = Integer.TYPE;
        io.objectbox.e eVar10 = new io.objectbox.e(cVar, 9, 10, cls3, "txFreq");
        f5753w = eVar10;
        io.objectbox.e eVar11 = new io.objectbox.e(cVar, 10, 11, cls3, "rxFreq");
        f5754x = eVar11;
        io.objectbox.e eVar12 = new io.objectbox.e(cVar, 11, 12, cls3, "txSubAudio");
        f5755y = eVar12;
        io.objectbox.e eVar13 = new io.objectbox.e(cVar, 12, 13, cls3, "rxSubAudio");
        f5756z = eVar13;
        io.objectbox.e eVar14 = new io.objectbox.e(cVar, 13, 14, cls3, "bandwidth");
        A = eVar14;
        io.objectbox.e eVar15 = new io.objectbox.e(cVar, 14, 15, cls2, "haveNewMessage");
        B = eVar15;
        C = new io.objectbox.e[]{eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, eVar9, eVar10, eVar11, eVar12, eVar13, eVar14, eVar15};
        D = eVar;
    }

    @Override // yb.b
    public io.objectbox.e[] B() {
        return C;
    }

    @Override // yb.b
    public Class E() {
        return f5740a;
    }

    @Override // yb.b
    public String J() {
        return "IIChannel";
    }

    @Override // yb.b
    public cc.b M() {
        return f5741b;
    }

    @Override // yb.b
    public cc.c u() {
        return f5742c;
    }
}
