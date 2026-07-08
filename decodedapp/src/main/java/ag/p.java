package ag;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final jf.d f567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final he.m f568c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final jf.h f569d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final jf.j f570e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final jf.a f571f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final cg.s f572g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final w0 f573h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final k0 f574i;

    public p(n nVar, jf.d dVar, he.m mVar, jf.h hVar, jf.j jVar, jf.a aVar, cg.s sVar, w0 w0Var, List list) {
        String strC;
        rd.m.e(nVar, "components");
        rd.m.e(dVar, "nameResolver");
        rd.m.e(mVar, "containingDeclaration");
        rd.m.e(hVar, "typeTable");
        rd.m.e(jVar, "versionRequirementTable");
        rd.m.e(aVar, "metadataVersion");
        rd.m.e(list, "typeParameters");
        this.f566a = nVar;
        this.f567b = dVar;
        this.f568c = mVar;
        this.f569d = hVar;
        this.f570e = jVar;
        this.f571f = aVar;
        this.f572g = sVar;
        this.f573h = new w0(this, w0Var, list, "Deserializer for \"" + mVar.getName() + '\"', (sVar == null || (strC = sVar.c()) == null) ? "[container not found]" : strC);
        this.f574i = new k0(this);
    }

    public static /* synthetic */ p b(p pVar, he.m mVar, List list, jf.d dVar, jf.h hVar, jf.j jVar, jf.a aVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            dVar = pVar.f567b;
        }
        jf.d dVar2 = dVar;
        if ((i10 & 8) != 0) {
            hVar = pVar.f569d;
        }
        jf.h hVar2 = hVar;
        if ((i10 & 16) != 0) {
            jVar = pVar.f570e;
        }
        jf.j jVar2 = jVar;
        if ((i10 & 32) != 0) {
            aVar = pVar.f571f;
        }
        return pVar.a(mVar, list, dVar2, hVar2, jVar2, aVar);
    }

    public final p a(he.m mVar, List list, jf.d dVar, jf.h hVar, jf.j jVar, jf.a aVar) {
        rd.m.e(mVar, "descriptor");
        rd.m.e(list, "typeParameterProtos");
        rd.m.e(dVar, "nameResolver");
        rd.m.e(hVar, "typeTable");
        rd.m.e(jVar, "versionRequirementTable");
        rd.m.e(aVar, "metadataVersion");
        return new p(this.f566a, dVar, mVar, hVar, jf.k.b(aVar) ? jVar : this.f570e, aVar, this.f572g, this.f573h, list);
    }

    public final n c() {
        return this.f566a;
    }

    public final cg.s d() {
        return this.f572g;
    }

    public final he.m e() {
        return this.f568c;
    }

    public final k0 f() {
        return this.f574i;
    }

    public final jf.d g() {
        return this.f567b;
    }

    public final dg.n h() {
        return this.f566a.u();
    }

    public final w0 i() {
        return this.f573h;
    }

    public final jf.h j() {
        return this.f569d;
    }

    public final jf.j k() {
        return this.f570e;
    }
}
