package b7;

/* JADX INFO: loaded from: classes.dex */
public abstract class u extends a7.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final a7.f f3733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final p6.d f3734b;

    protected u(a7.f fVar, p6.d dVar) {
        this.f3733a = fVar;
        this.f3734b = dVar;
    }

    @Override // a7.h
    public String b() {
        return null;
    }

    @Override // a7.h
    public n6.c g(e6.g gVar, n6.c cVar) {
        i(cVar);
        if (cVar.f22548c == null) {
            return null;
        }
        return gVar.h1(cVar);
    }

    @Override // a7.h
    public n6.c h(e6.g gVar, n6.c cVar) {
        if (cVar == null) {
            return null;
        }
        return gVar.i1(cVar);
    }

    protected void i(n6.c cVar) {
        if (cVar.f22548c == null) {
            Object obj = cVar.f22546a;
            Class cls = cVar.f22547b;
            cVar.f22548c = cls == null ? k(obj) : l(obj, cls);
        }
    }

    protected String k(Object obj) {
        String strA = this.f3733a.a(obj);
        if (strA == null) {
            j(obj);
        }
        return strA;
    }

    protected String l(Object obj, Class cls) {
        String strE = this.f3733a.e(obj, cls);
        if (strE == null) {
            j(obj);
        }
        return strE;
    }

    protected void j(Object obj) {
    }
}
