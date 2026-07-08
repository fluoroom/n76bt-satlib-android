package ag;

import ag.v;
import java.util.List;
import je.a;
import je.c;

/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: a */
    private final dg.n f525a;

    /* JADX INFO: renamed from: b */
    private final he.h0 f526b;

    /* JADX INFO: renamed from: c */
    private final o f527c;

    /* JADX INFO: renamed from: d */
    private final j f528d;

    /* JADX INFO: renamed from: e */
    private final e f529e;

    /* JADX INFO: renamed from: f */
    private final he.o0 f530f;

    /* JADX INFO: renamed from: g */
    private final b0 f531g;

    /* JADX INFO: renamed from: h */
    private final w f532h;

    /* JADX INFO: renamed from: i */
    private final pe.c f533i;

    /* JADX INFO: renamed from: j */
    private final x f534j;

    /* JADX INFO: renamed from: k */
    private final Iterable f535k;

    /* JADX INFO: renamed from: l */
    private final he.m0 f536l;

    /* JADX INFO: renamed from: m */
    private final m f537m;

    /* JADX INFO: renamed from: n */
    private final je.a f538n;

    /* JADX INFO: renamed from: o */
    private final je.c f539o;

    /* JADX INFO: renamed from: p */
    private final of.g f540p;

    /* JADX INFO: renamed from: q */
    private final fg.p f541q;

    /* JADX INFO: renamed from: r */
    private final wf.a f542r;

    /* JADX INFO: renamed from: s */
    private final List f543s;

    /* JADX INFO: renamed from: t */
    private final v f544t;

    /* JADX INFO: renamed from: u */
    private final l f545u;

    public n(dg.n nVar, he.h0 h0Var, o oVar, j jVar, e eVar, he.o0 o0Var, b0 b0Var, w wVar, pe.c cVar, x xVar, Iterable iterable, he.m0 m0Var, m mVar, je.a aVar, je.c cVar2, of.g gVar, fg.p pVar, wf.a aVar2, List list, v vVar) {
        rd.m.e(nVar, "storageManager");
        rd.m.e(h0Var, "moduleDescriptor");
        rd.m.e(oVar, "configuration");
        rd.m.e(jVar, "classDataFinder");
        rd.m.e(eVar, "annotationAndConstantLoader");
        rd.m.e(o0Var, "packageFragmentProvider");
        rd.m.e(b0Var, "localClassifierTypeSettings");
        rd.m.e(wVar, "errorReporter");
        rd.m.e(cVar, "lookupTracker");
        rd.m.e(xVar, "flexibleTypeDeserializer");
        rd.m.e(iterable, "fictitiousClassDescriptorFactories");
        rd.m.e(m0Var, "notFoundClasses");
        rd.m.e(mVar, "contractDeserializer");
        rd.m.e(aVar, "additionalClassPartsProvider");
        rd.m.e(cVar2, "platformDependentDeclarationFilter");
        rd.m.e(gVar, "extensionRegistryLite");
        rd.m.e(pVar, "kotlinTypeChecker");
        rd.m.e(aVar2, "samConversionResolver");
        rd.m.e(list, "typeAttributeTranslators");
        rd.m.e(vVar, "enumEntriesDeserializationSupport");
        this.f525a = nVar;
        this.f526b = h0Var;
        this.f527c = oVar;
        this.f528d = jVar;
        this.f529e = eVar;
        this.f530f = o0Var;
        this.f531g = b0Var;
        this.f532h = wVar;
        this.f533i = cVar;
        this.f534j = xVar;
        this.f535k = iterable;
        this.f536l = m0Var;
        this.f537m = mVar;
        this.f538n = aVar;
        this.f539o = cVar2;
        this.f540p = gVar;
        this.f541q = pVar;
        this.f542r = aVar2;
        this.f543s = list;
        this.f544t = vVar;
        this.f545u = new l(this);
    }

    public final p a(he.n0 n0Var, jf.d dVar, jf.h hVar, jf.j jVar, jf.a aVar, cg.s sVar) {
        rd.m.e(n0Var, "descriptor");
        rd.m.e(dVar, "nameResolver");
        rd.m.e(hVar, "typeTable");
        rd.m.e(jVar, "versionRequirementTable");
        rd.m.e(aVar, "metadataVersion");
        return new p(this, dVar, n0Var, hVar, jVar, aVar, sVar, null, ed.q.k());
    }

    public final he.e b(mf.b bVar) {
        rd.m.e(bVar, "classId");
        return l.f(this.f545u, bVar, null, 2, null);
    }

    public final je.a c() {
        return this.f538n;
    }

    public final e d() {
        return this.f529e;
    }

    public final j e() {
        return this.f528d;
    }

    public final l f() {
        return this.f545u;
    }

    public final o g() {
        return this.f527c;
    }

    public final m h() {
        return this.f537m;
    }

    public final v i() {
        return this.f544t;
    }

    public final w j() {
        return this.f532h;
    }

    public final of.g k() {
        return this.f540p;
    }

    public final Iterable l() {
        return this.f535k;
    }

    public final x m() {
        return this.f534j;
    }

    public final fg.p n() {
        return this.f541q;
    }

    public final b0 o() {
        return this.f531g;
    }

    public final pe.c p() {
        return this.f533i;
    }

    public final he.h0 q() {
        return this.f526b;
    }

    public final he.m0 r() {
        return this.f536l;
    }

    public final he.o0 s() {
        return this.f530f;
    }

    public final je.c t() {
        return this.f539o;
    }

    public final dg.n u() {
        return this.f525a;
    }

    public final List v() {
        return this.f543s;
    }

    public /* synthetic */ n(dg.n nVar, he.h0 h0Var, o oVar, j jVar, e eVar, he.o0 o0Var, b0 b0Var, w wVar, pe.c cVar, x xVar, Iterable iterable, he.m0 m0Var, m mVar, je.a aVar, je.c cVar2, of.g gVar, fg.p pVar, wf.a aVar2, List list, v vVar, int i10, rd.h hVar) {
        this(nVar, h0Var, oVar, jVar, eVar, o0Var, b0Var, wVar, cVar, xVar, iterable, m0Var, mVar, (i10 & 8192) != 0 ? a.C0241a.f18650a : aVar, (i10 & 16384) != 0 ? c.a.f18651a : cVar2, gVar, (65536 & i10) != 0 ? fg.p.f13077b.a() : pVar, aVar2, (262144 & i10) != 0 ? ed.q.e(eg.x.f12218a) : list, (i10 & 524288) != 0 ? v.a.f595a : vVar);
    }
}
