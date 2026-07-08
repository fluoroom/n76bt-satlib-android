package qe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f25023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f25024b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f25025c = new ArrayList(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f25026d = new ArrayList(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f25027e;

    public j(int i10) {
        this.f25023a = i10;
        List listC = se.n.f27327a.c();
        ArrayList arrayList = new ArrayList(ed.q.v(listC, 10));
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(((se.n) it.next()).p());
        }
        this.f25027e = arrayList;
    }

    public final List a() {
        return this.f25026d;
    }

    public final List b() {
        return this.f25027e;
    }

    public final int c() {
        return this.f25023a;
    }

    public final List d() {
        return this.f25024b;
    }

    public final List e() {
        return this.f25025c;
    }

    public final void f(int i10) {
        this.f25023a = i10;
    }
}
