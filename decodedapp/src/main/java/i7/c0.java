package i7;

/* JADX INFO: loaded from: classes.dex */
public class c0 extends e6.l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final e6.l f15871d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final e6.h f15872e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected String f15873f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected Object f15874g;

    protected c0(e6.l lVar, i6.e eVar) {
        super(lVar);
        this.f15871d = lVar.f();
        this.f15873f = lVar.b();
        this.f15874g = lVar.c();
        if (lVar instanceof l6.c) {
            this.f15872e = ((l6.c) lVar).w(eVar);
        } else {
            this.f15872e = e6.h.f11524g;
        }
    }

    public static c0 o(e6.l lVar) {
        return lVar == null ? new c0() : new c0(lVar, i6.e.r());
    }

    @Override // e6.l
    public String b() {
        return this.f15873f;
    }

    @Override // e6.l
    public Object c() {
        return this.f15874g;
    }

    @Override // e6.l
    public e6.l f() {
        return this.f15871d;
    }

    @Override // e6.l
    public void k(Object obj) {
        this.f15874g = obj;
    }

    public c0 m() {
        this.f11559b++;
        return new c0(this, 1, -1);
    }

    public c0 n() {
        this.f11559b++;
        return new c0(this, 2, -1);
    }

    public c0 p() {
        e6.l lVar = this.f15871d;
        return lVar instanceof c0 ? (c0) lVar : lVar == null ? new c0() : new c0(lVar, this.f15872e);
    }

    public void q(String str) {
        this.f15873f = str;
    }

    public void r() {
        this.f11559b++;
    }

    protected c0(e6.l lVar, e6.h hVar) {
        super(lVar);
        this.f15871d = lVar.f();
        this.f15873f = lVar.b();
        this.f15874g = lVar.c();
        this.f15872e = hVar;
    }

    protected c0() {
        super(0, -1);
        this.f15871d = null;
        this.f15872e = e6.h.f11524g;
    }

    protected c0(c0 c0Var, int i10, int i11) {
        super(i10, i11);
        this.f15871d = c0Var;
        this.f15872e = c0Var.f15872e;
    }
}
