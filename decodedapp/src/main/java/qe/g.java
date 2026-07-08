package qe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f24984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f24985b;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f24992i;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f24997n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private v f24998o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final List f25002s;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f24986c = new ArrayList(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f24987d = new ArrayList(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f24988e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f24989f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f24990g = new ArrayList(0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f24991h = new ArrayList(1);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List f24993j = new ArrayList(0);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List f24994k = new ArrayList(0);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List f24995l = new ArrayList(0);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List f24996m = new ArrayList(0);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final List f24999p = new ArrayList(0);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final List f25000q = new ArrayList(0);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final List f25001r = new ArrayList(0);

    public g() {
        List listC = se.n.f27327a.c();
        ArrayList arrayList = new ArrayList(ed.q.v(listC, 10));
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(((se.n) it.next()).h());
        }
        this.f25002s = arrayList;
    }

    @Override // qe.l
    public List a() {
        return this.f24989f;
    }

    @Override // qe.l
    public List b() {
        return this.f24988e;
    }

    @Override // qe.l
    public List c() {
        return this.f24990g;
    }

    public final List d() {
        return this.f24999p;
    }

    public final List e() {
        return this.f24991h;
    }

    public final List f() {
        return this.f25000q;
    }

    public final List g() {
        return this.f24994k;
    }

    public final List h() {
        return this.f25002s;
    }

    public final int i() {
        return this.f24984a;
    }

    public final List j() {
        return this.f24995l;
    }

    public final String k() {
        String str = this.f24985b;
        if (str != null) {
            return str;
        }
        rd.m.o("name");
        return null;
    }

    public final List l() {
        return this.f24993j;
    }

    public final List m() {
        return this.f24996m;
    }

    public final List n() {
        return this.f24987d;
    }

    public final List o() {
        return this.f24986c;
    }

    public final List p() {
        return this.f25001r;
    }

    public final void q(String str) {
        this.f24992i = str;
    }

    public final void r(int i10) {
        this.f24984a = i10;
    }

    public final void s(String str) {
        this.f24997n = str;
    }

    public final void t(v vVar) {
        this.f24998o = vVar;
    }

    public final void u(String str) {
        rd.m.e(str, "<set-?>");
        this.f24985b = str;
    }
}
