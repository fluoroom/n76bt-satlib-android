package re;

import ed.q;
import gf.t;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jf.h;
import jf.j;
import rd.m;
import se.n;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final jf.d f25980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f25981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j f25982c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f25983d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final e f25984e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f25985f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f25986g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f25987h;

    public e(jf.d dVar, h hVar, j jVar, boolean z10, e eVar, List list) {
        m.e(dVar, "strings");
        m.e(hVar, "types");
        m.e(jVar, "versionRequirements");
        m.e(list, "contextExtensions");
        this.f25980a = dVar;
        this.f25981b = hVar;
        this.f25982c = jVar;
        this.f25983d = z10;
        this.f25984e = eVar;
        this.f25985f = list;
        this.f25986g = new LinkedHashMap();
        this.f25987h = n.f27327a.c();
    }

    public final String a(int i10) {
        return f.a(this.f25980a, i10);
    }

    public final String b(int i10) {
        return this.f25980a.getString(i10);
    }

    public final List c() {
        return this.f25987h;
    }

    public final boolean d() {
        return this.f25983d;
    }

    public final jf.d e() {
        return this.f25980a;
    }

    public final Integer f(int i10) {
        Integer num = (Integer) this.f25986g.get(Integer.valueOf(i10));
        if (num != null) {
            return num;
        }
        e eVar = this.f25984e;
        if (eVar != null) {
            return eVar.f(i10);
        }
        return null;
    }

    public final h g() {
        return this.f25981b;
    }

    public final j h() {
        return this.f25982c;
    }

    public final e i(List list) {
        m.e(list, "typeParameters");
        e eVar = new e(this.f25980a, this.f25981b, this.f25982c, this.f25983d, this, this.f25985f);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            t tVar = (t) it.next();
            eVar.f25986g.put(Integer.valueOf(tVar.R()), Integer.valueOf(tVar.Q()));
        }
        return eVar;
    }

    public /* synthetic */ e(jf.d dVar, h hVar, j jVar, boolean z10, e eVar, List list, int i10, rd.h hVar2) {
        this(dVar, hVar, jVar, z10, (i10 & 16) != 0 ? null : eVar, (i10 & 32) != 0 ? q.k() : list);
    }
}
