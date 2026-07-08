package k2;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k2.h;
import o2.n;

/* JADX INFO: loaded from: classes.dex */
final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f18963a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f18964b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.bumptech.glide.e f18965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f18966d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f18967e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f18968f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Class f18969g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private h.e f18970h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private i2.h f18971i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Map f18972j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Class f18973k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f18974l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f18975m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private i2.f f18976n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private com.bumptech.glide.h f18977o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private j f18978p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f18979q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f18980r;

    g() {
    }

    void a() {
        this.f18965c = null;
        this.f18966d = null;
        this.f18976n = null;
        this.f18969g = null;
        this.f18973k = null;
        this.f18971i = null;
        this.f18977o = null;
        this.f18972j = null;
        this.f18978p = null;
        this.f18963a.clear();
        this.f18974l = false;
        this.f18964b.clear();
        this.f18975m = false;
    }

    l2.b b() {
        return this.f18965c.b();
    }

    List c() {
        if (!this.f18975m) {
            this.f18975m = true;
            this.f18964b.clear();
            List listG = g();
            int size = listG.size();
            for (int i10 = 0; i10 < size; i10++) {
                n.a aVar = (n.a) listG.get(i10);
                if (!this.f18964b.contains(aVar.f23122a)) {
                    this.f18964b.add(aVar.f23122a);
                }
                for (int i11 = 0; i11 < aVar.f23123b.size(); i11++) {
                    if (!this.f18964b.contains(aVar.f23123b.get(i11))) {
                        this.f18964b.add((i2.f) aVar.f23123b.get(i11));
                    }
                }
            }
        }
        return this.f18964b;
    }

    m2.a d() {
        return this.f18970h.a();
    }

    j e() {
        return this.f18978p;
    }

    int f() {
        return this.f18968f;
    }

    List g() {
        if (!this.f18974l) {
            this.f18974l = true;
            this.f18963a.clear();
            List listI = this.f18965c.i().i(this.f18966d);
            int size = listI.size();
            for (int i10 = 0; i10 < size; i10++) {
                n.a aVarB = ((o2.n) listI.get(i10)).b(this.f18966d, this.f18967e, this.f18968f, this.f18971i);
                if (aVarB != null) {
                    this.f18963a.add(aVarB);
                }
            }
        }
        return this.f18963a;
    }

    t h(Class cls) {
        return this.f18965c.i().h(cls, this.f18969g, this.f18973k);
    }

    Class i() {
        return this.f18966d.getClass();
    }

    List j(File file) {
        return this.f18965c.i().i(file);
    }

    i2.h k() {
        return this.f18971i;
    }

    com.bumptech.glide.h l() {
        return this.f18977o;
    }

    List m() {
        return this.f18965c.i().j(this.f18966d.getClass(), this.f18969g, this.f18973k);
    }

    i2.k n(v vVar) {
        return this.f18965c.i().k(vVar);
    }

    com.bumptech.glide.load.data.e o(Object obj) {
        return this.f18965c.i().l(obj);
    }

    i2.f p() {
        return this.f18976n;
    }

    i2.d q(Object obj) {
        return this.f18965c.i().m(obj);
    }

    Class r() {
        return this.f18973k;
    }

    i2.l s(Class cls) {
        i2.l lVar = (i2.l) this.f18972j.get(cls);
        if (lVar == null) {
            Iterator it = this.f18972j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    lVar = (i2.l) entry.getValue();
                    break;
                }
            }
        }
        if (lVar != null) {
            return lVar;
        }
        if (!this.f18972j.isEmpty() || !this.f18979q) {
            return q2.e.c();
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    int t() {
        return this.f18967e;
    }

    boolean u(Class cls) {
        return h(cls) != null;
    }

    void v(com.bumptech.glide.e eVar, Object obj, i2.f fVar, int i10, int i11, j jVar, Class cls, Class cls2, com.bumptech.glide.h hVar, i2.h hVar2, Map map, boolean z10, boolean z11, h.e eVar2) {
        this.f18965c = eVar;
        this.f18966d = obj;
        this.f18976n = fVar;
        this.f18967e = i10;
        this.f18968f = i11;
        this.f18978p = jVar;
        this.f18969g = cls;
        this.f18970h = eVar2;
        this.f18973k = cls2;
        this.f18977o = hVar;
        this.f18971i = hVar2;
        this.f18972j = map;
        this.f18979q = z10;
        this.f18980r = z11;
    }

    boolean w(v vVar) {
        return this.f18965c.i().n(vVar);
    }

    boolean x() {
        return this.f18980r;
    }

    boolean y(i2.f fVar) {
        List listG = g();
        int size = listG.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((n.a) listG.get(i10)).f23122a.equals(fVar)) {
                return true;
            }
        }
        return false;
    }
}
