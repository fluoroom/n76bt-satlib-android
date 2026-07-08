package ye;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public vf.c f32594a;

    @Override // ye.n
    public he.e a(cf.g gVar) {
        rd.m.e(gVar, "javaClass");
        return b().b(gVar);
    }

    public final vf.c b() {
        vf.c cVar = this.f32594a;
        if (cVar != null) {
            return cVar;
        }
        rd.m.o("resolver");
        return null;
    }

    public final void c(vf.c cVar) {
        rd.m.e(cVar, "<set-?>");
        this.f32594a = cVar;
    }
}
