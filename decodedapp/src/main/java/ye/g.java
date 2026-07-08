package ye;

import ed.q;
import ee.o;
import ie.h;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements ie.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f32576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final cf.d f32577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f32578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final dg.h f32579d;

    public g(k kVar, cf.d dVar, boolean z10) {
        rd.m.e(kVar, "c");
        rd.m.e(dVar, "annotationOwner");
        this.f32576a = kVar;
        this.f32577b = dVar;
        this.f32578c = z10;
        this.f32579d = kVar.a().u().h(new f(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ie.c c(g gVar, cf.a aVar) {
        rd.m.e(aVar, "annotation");
        return we.d.f31403a.e(aVar, gVar.f32576a, gVar.f32578c);
    }

    @Override // ie.h
    public boolean H(mf.c cVar) {
        return h.b.b(this, cVar);
    }

    @Override // ie.h
    public ie.c a(mf.c cVar) {
        ie.c cVar2;
        rd.m.e(cVar, "fqName");
        cf.a aVarA = this.f32577b.a(cVar);
        return (aVarA == null || (cVar2 = (ie.c) this.f32579d.l(aVarA)) == null) ? we.d.f31403a.a(cVar, this.f32577b, this.f32576a) : cVar2;
    }

    @Override // ie.h
    public boolean isEmpty() {
        return this.f32577b.getAnnotations().isEmpty() && !this.f32577b.m();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return qg.k.z(qg.k.K(qg.k.H(q.S(this.f32577b.getAnnotations()), this.f32579d), we.d.f31403a.a(o.a.f11909y, this.f32577b, this.f32576a))).iterator();
    }

    public /* synthetic */ g(k kVar, cf.d dVar, boolean z10, int i10, rd.h hVar) {
        this(kVar, dVar, (i10 & 4) != 0 ? false : z10);
    }
}
