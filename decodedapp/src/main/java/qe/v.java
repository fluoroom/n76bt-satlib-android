package qe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f25087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h f25088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f25089c = new ArrayList(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private v f25090d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private v f25091e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private r f25092f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f25093g;

    public v(int i10) {
        this.f25087a = i10;
        List listC = se.n.f27327a.c();
        ArrayList arrayList = new ArrayList(ed.q.v(listC, 10));
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(((se.n) it.next()).e());
        }
        this.f25093g = arrayList;
    }

    public final List a() {
        return this.f25089c;
    }

    public final h b() {
        h hVar = this.f25088b;
        if (hVar != null) {
            return hVar;
        }
        rd.m.o("classifier");
        return null;
    }

    public final List c() {
        return this.f25093g;
    }

    public final int d() {
        return this.f25087a;
    }

    public final void e(v vVar) {
        this.f25090d = vVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!rd.m.a(v.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        rd.m.c(obj, "null cannot be cast to non-null type kotlin.metadata.KmType");
        v vVar = (v) obj;
        return this.f25087a == vVar.f25087a && rd.m.a(b(), vVar.b()) && rd.m.a(this.f25089c, vVar.f25089c) && rd.m.a(this.f25091e, vVar.f25091e) && rd.m.a(this.f25090d, vVar.f25090d) && rd.m.a(this.f25092f, vVar.f25092f) && rd.m.a(this.f25093g, vVar.f25093g);
    }

    public final void f(h hVar) {
        rd.m.e(hVar, "<set-?>");
        this.f25088b = hVar;
    }

    public final void g(int i10) {
        this.f25087a = i10;
    }

    public final void h(r rVar) {
        this.f25092f = rVar;
    }

    public int hashCode() {
        return (((this.f25087a * 31) + b().hashCode()) * 31) + this.f25089c.hashCode();
    }

    public final void i(v vVar) {
        this.f25091e = vVar;
    }
}
