package qe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f25094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f25095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f25096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public v f25097d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public v f25098e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f25099f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f25100g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f25101h;

    public w(int i10, String str) {
        rd.m.e(str, "name");
        this.f25094a = i10;
        this.f25095b = str;
        this.f25096c = new ArrayList(0);
        this.f25099f = new ArrayList(0);
        this.f25100g = new ArrayList(0);
        List listC = se.n.f27327a.c();
        ArrayList arrayList = new ArrayList();
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            ((se.n) it.next()).a();
        }
        this.f25101h = arrayList;
    }

    public final List a() {
        return this.f25099f;
    }

    public final int b() {
        return this.f25094a;
    }

    public final List c() {
        return this.f25096c;
    }

    public final List d() {
        return this.f25100g;
    }

    public final void e(v vVar) {
        rd.m.e(vVar, "<set-?>");
        this.f25098e = vVar;
    }

    public final void f(int i10) {
        this.f25094a = i10;
    }

    public final void g(v vVar) {
        rd.m.e(vVar, "<set-?>");
        this.f25097d = vVar;
    }
}
