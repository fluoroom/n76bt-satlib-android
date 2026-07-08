package com.dw.ht.entitys;

import com.dw.ht.entitys.LinkSettingsCursor;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes.dex */
public final class d implements yb.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f5757a = LinkSettings.class;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final cc.b f5758b = new LinkSettingsCursor.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final a f5759c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f5760d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final io.objectbox.e f5761e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final io.objectbox.e f5762f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final io.objectbox.e f5763g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final io.objectbox.e f5764h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final io.objectbox.e[] f5765r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final io.objectbox.e f5766s;

    static final class a implements cc.c {
        a() {
        }

        public long a(LinkSettings linkSettings) {
            return linkSettings.getId();
        }
    }

    static {
        d dVar = new d();
        f5760d = dVar;
        Class cls = Long.TYPE;
        io.objectbox.e eVar = new io.objectbox.e(dVar, 0, 1, cls, Name.MARK, true, Name.MARK);
        f5761e = eVar;
        io.objectbox.e eVar2 = new io.objectbox.e(dVar, 1, 4, cls, "linkId");
        f5762f = eVar2;
        io.objectbox.e eVar3 = new io.objectbox.e(dVar, 2, 3, Boolean.class, "syncSignalingSettings");
        f5763g = eVar3;
        io.objectbox.e eVar4 = new io.objectbox.e(dVar, 3, 5, Boolean.TYPE, "monitor");
        f5764h = eVar4;
        f5765r = new io.objectbox.e[]{eVar, eVar2, eVar3, eVar4};
        f5766s = eVar;
    }

    @Override // yb.b
    public io.objectbox.e[] B() {
        return f5765r;
    }

    @Override // yb.b
    public Class E() {
        return f5757a;
    }

    @Override // yb.b
    public String J() {
        return "LinkSettings";
    }

    @Override // yb.b
    public cc.b M() {
        return f5758b;
    }

    @Override // yb.b
    public cc.c u() {
        return f5759c;
    }
}
