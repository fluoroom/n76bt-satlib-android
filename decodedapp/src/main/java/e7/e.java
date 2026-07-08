package e7;

import java.util.Collections;
import java.util.List;
import p6.b0;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final c[] f11637i = new c[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final p6.c f11638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected b0 f11639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected List f11640c = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected c[] f11641d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected a f11642e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected Object f11643f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected x6.k f11644g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected f7.i f11645h;

    public e(p6.c cVar) {
        this.f11638a = cVar;
    }

    public p6.p a() {
        c[] cVarArr;
        if (this.f11644g != null && this.f11639b.L(p6.r.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
            this.f11644g.i(this.f11639b.L(p6.r.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        a aVar = this.f11642e;
        if (aVar != null) {
            aVar.a(this.f11639b);
        }
        List list = this.f11640c;
        if (list == null || list.isEmpty()) {
            if (this.f11642e == null && this.f11645h == null) {
                return null;
            }
            cVarArr = f11637i;
        } else {
            List list2 = this.f11640c;
            cVarArr = (c[]) list2.toArray(new c[list2.size()]);
            if (this.f11639b.L(p6.r.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
                for (c cVar : cVarArr) {
                    cVar.o(this.f11639b);
                }
            }
        }
        c[] cVarArr2 = this.f11641d;
        if (cVarArr2 == null || cVarArr2.length == this.f11640c.size()) {
            return new d(this.f11638a.z(), this, cVarArr, this.f11641d);
        }
        throw new IllegalStateException(String.format("Mismatch between `properties` size (%d), `filteredProperties` (%s): should have as many (or `null` for latter)", Integer.valueOf(this.f11640c.size()), Integer.valueOf(this.f11641d.length)));
    }

    public d b() {
        return d.S(this.f11638a.z(), this);
    }

    public a c() {
        return this.f11642e;
    }

    public p6.c d() {
        return this.f11638a;
    }

    public Object e() {
        return this.f11643f;
    }

    public f7.i f() {
        return this.f11645h;
    }

    public List g() {
        return this.f11640c;
    }

    public x6.k h() {
        return this.f11644g;
    }

    public void i(a aVar) {
        this.f11642e = aVar;
    }

    protected void j(b0 b0Var) {
        this.f11639b = b0Var;
    }

    public void k(Object obj) {
        this.f11643f = obj;
    }

    public void l(c[] cVarArr) {
        if (cVarArr != null && cVarArr.length != this.f11640c.size()) {
            throw new IllegalArgumentException(String.format("Trying to set %d filtered properties; must match length of non-filtered `properties` (%d)", Integer.valueOf(cVarArr.length), Integer.valueOf(this.f11640c.size())));
        }
        this.f11641d = cVarArr;
    }

    public void m(f7.i iVar) {
        this.f11645h = iVar;
    }

    public void n(List list) {
        this.f11640c = list;
    }

    public void o(x6.k kVar) {
        if (this.f11644g == null) {
            this.f11644g = kVar;
            return;
        }
        throw new IllegalArgumentException("Multiple type ids specified with " + this.f11644g + " and " + kVar);
    }
}
