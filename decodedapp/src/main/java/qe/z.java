package qe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f25112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f25113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v f25114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private v f25115d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private f f25116e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f25117f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f25118g;

    public z(int i10, String str) {
        rd.m.e(str, "name");
        this.f25112a = i10;
        this.f25113b = str;
        this.f25117f = new ArrayList(0);
        List listC = se.n.f27327a.c();
        ArrayList arrayList = new ArrayList();
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            ((se.n) it.next()).o();
        }
        this.f25118g = arrayList;
    }

    public final List a() {
        return this.f25117f;
    }

    public final int b() {
        return this.f25112a;
    }

    public final void c(f fVar) {
        this.f25116e = fVar;
    }

    public final void d(int i10) {
        this.f25112a = i10;
    }

    public final void e(v vVar) {
        rd.m.e(vVar, "<set-?>");
        this.f25114c = vVar;
    }

    public final void f(v vVar) {
        this.f25115d = vVar;
    }
}
