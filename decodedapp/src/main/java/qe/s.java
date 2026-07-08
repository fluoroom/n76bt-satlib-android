package qe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f25055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f25056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f25057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private v f25058d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f25059e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f25060f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f25061g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public v f25062h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f25063i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private k f25064j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List f25065k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List f25066l;

    public s(int i10, String str) {
        rd.m.e(str, "name");
        this.f25055a = i10;
        this.f25056b = str;
        this.f25057c = new ArrayList(0);
        this.f25059e = new ArrayList(0);
        this.f25060f = new ArrayList(0);
        this.f25061g = new ArrayList();
        this.f25063i = new ArrayList(0);
        this.f25065k = new ArrayList(0);
        List listC = se.n.f27327a.c();
        ArrayList arrayList = new ArrayList(ed.q.v(listC, 10));
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(((se.n) it.next()).i());
        }
        this.f25066l = arrayList;
    }

    public final List a() {
        return this.f25065k;
    }

    public final List b() {
        return this.f25060f;
    }

    public final List c() {
        return this.f25059e;
    }

    public final List d() {
        return this.f25066l;
    }

    public final int e() {
        return this.f25055a;
    }

    public final List f() {
        return this.f25057c;
    }

    public final List g() {
        return this.f25061g;
    }

    public final List h() {
        return this.f25063i;
    }

    public final void i(k kVar) {
        this.f25064j = kVar;
    }

    public final void j(int i10) {
        this.f25055a = i10;
    }

    public final void k(v vVar) {
        this.f25058d = vVar;
    }

    public final void l(v vVar) {
        rd.m.e(vVar, "<set-?>");
        this.f25062h = vVar;
    }
}
