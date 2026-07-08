package l6;

import e6.l;

/* JADX INFO: loaded from: classes.dex */
public class e extends l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final e f20462d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected a f20463e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected e f20464f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected String f20465g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected Object f20466h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected boolean f20467i;

    protected e(int i10, e eVar, a aVar) {
        this.f11558a = i10;
        this.f20462d = eVar;
        this.f20463e = aVar;
        this.f11559b = -1;
    }

    private final void m(a aVar, String str) throws e6.f {
        if (aVar.c(str)) {
            Object objB = aVar.b();
            throw new e6.f("Duplicate field '" + str + "'", objB instanceof e6.g ? (e6.g) objB : null);
        }
    }

    public static e s(a aVar) {
        return new e(0, null, aVar);
    }

    @Override // e6.l
    public final String b() {
        return this.f20465g;
    }

    @Override // e6.l
    public Object c() {
        return this.f20466h;
    }

    @Override // e6.l
    public void k(Object obj) {
        this.f20466h = obj;
    }

    public e n() {
        this.f20466h = null;
        return this.f20462d;
    }

    public e o() {
        e eVar = this.f20464f;
        if (eVar != null) {
            return eVar.v(1);
        }
        a aVar = this.f20463e;
        e eVar2 = new e(1, this, aVar == null ? null : aVar.a());
        this.f20464f = eVar2;
        return eVar2;
    }

    public e p(Object obj) {
        e eVar = this.f20464f;
        if (eVar != null) {
            return eVar.w(1, obj);
        }
        a aVar = this.f20463e;
        e eVar2 = new e(1, this, aVar == null ? null : aVar.a(), obj);
        this.f20464f = eVar2;
        return eVar2;
    }

    public e q() {
        e eVar = this.f20464f;
        if (eVar != null) {
            return eVar.v(2);
        }
        a aVar = this.f20463e;
        e eVar2 = new e(2, this, aVar == null ? null : aVar.a());
        this.f20464f = eVar2;
        return eVar2;
    }

    public e r(Object obj) {
        e eVar = this.f20464f;
        if (eVar != null) {
            return eVar.w(2, obj);
        }
        a aVar = this.f20463e;
        e eVar2 = new e(2, this, aVar == null ? null : aVar.a(), obj);
        this.f20464f = eVar2;
        return eVar2;
    }

    public a t() {
        return this.f20463e;
    }

    @Override // e6.l
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final e f() {
        return this.f20462d;
    }

    public e v(int i10) {
        this.f11558a = i10;
        this.f11559b = -1;
        this.f20465g = null;
        this.f20467i = false;
        this.f20466h = null;
        a aVar = this.f20463e;
        if (aVar != null) {
            aVar.d();
        }
        return this;
    }

    public e w(int i10, Object obj) {
        this.f11558a = i10;
        this.f11559b = -1;
        this.f20465g = null;
        this.f20467i = false;
        this.f20466h = obj;
        a aVar = this.f20463e;
        if (aVar != null) {
            aVar.d();
        }
        return this;
    }

    public e x(a aVar) {
        this.f20463e = aVar;
        return this;
    }

    public int y(String str) throws e6.f {
        if (this.f11558a != 2 || this.f20467i) {
            return 4;
        }
        this.f20467i = true;
        this.f20465g = str;
        a aVar = this.f20463e;
        if (aVar != null) {
            m(aVar, str);
        }
        return this.f11559b < 0 ? 0 : 1;
    }

    public int z() {
        int i10 = this.f11558a;
        if (i10 == 2) {
            if (!this.f20467i) {
                return 5;
            }
            this.f20467i = false;
            this.f11559b++;
            return 2;
        }
        if (i10 == 1) {
            int i11 = this.f11559b;
            this.f11559b = i11 + 1;
            return i11 < 0 ? 0 : 1;
        }
        int i12 = this.f11559b + 1;
        this.f11559b = i12;
        return i12 == 0 ? 0 : 3;
    }

    protected e(int i10, e eVar, a aVar, Object obj) {
        this.f11558a = i10;
        this.f20462d = eVar;
        this.f20463e = aVar;
        this.f11559b = -1;
        this.f20466h = obj;
    }
}
