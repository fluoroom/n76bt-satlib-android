package qe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jf.b;

/* JADX INFO: loaded from: classes3.dex */
public final class t {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    static final /* synthetic */ yd.j[] f25067r = {rd.c0.d(new rd.q(t.class, "_hasSetter", "get_hasSetter()Z", 0)), rd.c0.d(new rd.q(t.class, "_hasGetter", "get_hasGetter()Z", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f25068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f25069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final re.a f25070c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final re.a f25071d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final u f25072e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private u f25073f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f25074g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private v f25075h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f25076i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List f25077j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private z f25078k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public v f25079l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List f25080m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f25081n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final List f25082o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final List f25083p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final List f25084q;

    public t(int i10, String str, int i11, int i12) {
        rd.m.e(str, "name");
        this.f25068a = i10;
        this.f25069b = str;
        b.C0243b c0243b = jf.b.A;
        rd.m.d(c0243b, "HAS_SETTER");
        this.f25070c = re.c.g(new re.d(c0243b));
        b.C0243b c0243b2 = jf.b.f18685z;
        rd.m.d(c0243b2, "HAS_GETTER");
        this.f25071d = re.c.g(new re.d(c0243b2));
        u uVar = new u(i11);
        q(true);
        this.f25072e = uVar;
        this.f25073f = l() ? new u(i12) : null;
        this.f25074g = new ArrayList(0);
        this.f25076i = new ArrayList(0);
        this.f25077j = new ArrayList(0);
        this.f25080m = new ArrayList(0);
        this.f25081n = new ArrayList(0);
        this.f25082o = new ArrayList(0);
        this.f25083p = new ArrayList(0);
        List listC = se.n.f27327a.c();
        ArrayList arrayList = new ArrayList(ed.q.v(listC, 10));
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(((se.n) it.next()).b());
        }
        this.f25084q = arrayList;
    }

    private final boolean l() {
        return this.f25070c.a(this, f25067r[0]);
    }

    private final void q(boolean z10) {
        this.f25071d.b(this, f25067r[1], z10);
    }

    public final List a() {
        return this.f25081n;
    }

    public final List b() {
        return this.f25082o;
    }

    public final List c() {
        return this.f25077j;
    }

    public final List d() {
        return this.f25083p;
    }

    public final List e() {
        return this.f25076i;
    }

    public final List f() {
        return this.f25084q;
    }

    public final int g() {
        return this.f25068a;
    }

    public final u h() {
        return this.f25072e;
    }

    public final u i() {
        return this.f25073f;
    }

    public final List j() {
        return this.f25074g;
    }

    public final List k() {
        return this.f25080m;
    }

    public final void m(int i10) {
        this.f25068a = i10;
    }

    public final void n(v vVar) {
        this.f25075h = vVar;
    }

    public final void o(v vVar) {
        rd.m.e(vVar, "<set-?>");
        this.f25079l = vVar;
    }

    public final void p(z zVar) {
        this.f25078k = zVar;
    }
}
