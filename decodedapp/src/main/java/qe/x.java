package qe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f25102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f25103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f25104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a0 f25105d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f25106e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f25107f;

    public x(int i10, String str, int i11, a0 a0Var) {
        rd.m.e(str, "name");
        rd.m.e(a0Var, "variance");
        this.f25102a = i10;
        this.f25103b = str;
        this.f25104c = i11;
        this.f25105d = a0Var;
        this.f25106e = new ArrayList(1);
        List listC = se.n.f27327a.c();
        ArrayList arrayList = new ArrayList(ed.q.v(listC, 10));
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(((se.n) it.next()).l());
        }
        this.f25107f = arrayList;
    }

    public final List a() {
        return this.f25107f;
    }

    public final int b() {
        return this.f25102a;
    }

    public final List c() {
        return this.f25106e;
    }

    public final void d(int i10) {
        this.f25102a = i10;
    }
}
