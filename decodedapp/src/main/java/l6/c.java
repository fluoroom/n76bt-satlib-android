package l6;

import e6.h;
import e6.i;
import e6.j;
import e6.l;

/* JADX INFO: loaded from: classes.dex */
public final class c extends l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final c f20438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected a f20439e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected c f20440f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected String f20441g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected Object f20442h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected int f20443i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected int f20444j;

    public c(c cVar, int i10, a aVar, int i11, int i12, int i13) {
        this.f20438d = cVar;
        this.f20439e = aVar;
        this.f11558a = i11;
        this.f20443i = i12;
        this.f20444j = i13;
        this.f11559b = -1;
        this.f11560c = i10;
    }

    private void m(a aVar, String str) throws i {
        if (aVar.c(str)) {
            Object objB = aVar.b();
            throw new i(objB instanceof j ? (j) objB : null, "Duplicate field '" + str + "'");
        }
    }

    public static c q(a aVar) {
        return new c(null, 0, aVar, 0, 1, 0);
    }

    @Override // e6.l
    public String b() {
        return this.f20441g;
    }

    @Override // e6.l
    public Object c() {
        return this.f20442h;
    }

    @Override // e6.l
    public void k(Object obj) {
        this.f20442h = obj;
    }

    public c n() {
        this.f20442h = null;
        return this.f20438d;
    }

    public c o(int i10, int i11) {
        c cVar = this.f20440f;
        if (cVar != null) {
            cVar.u(1, i10, i11);
            return cVar;
        }
        int i12 = this.f11560c + 1;
        a aVar = this.f20439e;
        c cVar2 = new c(this, i12, aVar == null ? null : aVar.a(), 1, i10, i11);
        this.f20440f = cVar2;
        return cVar2;
    }

    public c p(int i10, int i11) {
        c cVar = this.f20440f;
        if (cVar != null) {
            cVar.u(2, i10, i11);
            return cVar;
        }
        int i12 = this.f11560c + 1;
        a aVar = this.f20439e;
        c cVar2 = new c(this, i12, aVar == null ? null : aVar.a(), 2, i10, i11);
        this.f20440f = cVar2;
        return cVar2;
    }

    public boolean r() {
        int i10 = this.f11559b + 1;
        this.f11559b = i10;
        return this.f11558a != 0 && i10 > 0;
    }

    public a s() {
        return this.f20439e;
    }

    @Override // e6.l
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public c f() {
        return this.f20438d;
    }

    public void u(int i10, int i11, int i12) {
        this.f11558a = i10;
        this.f11559b = -1;
        this.f20443i = i11;
        this.f20444j = i12;
        this.f20441g = null;
        this.f20442h = null;
        a aVar = this.f20439e;
        if (aVar != null) {
            aVar.d();
        }
    }

    public void v(String str) throws i {
        this.f20441g = str;
        a aVar = this.f20439e;
        if (aVar != null) {
            m(aVar, str);
        }
    }

    public h w(i6.e eVar) {
        return new h(eVar, -1L, this.f20443i, this.f20444j);
    }

    public c x(a aVar) {
        this.f20439e = aVar;
        return this;
    }
}
