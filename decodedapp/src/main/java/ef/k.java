package ef;

import ag.b0;
import ag.o;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import ef.d0;
import ge.k;
import he.m0;
import je.a;
import je.c;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: b */
    public static final a f12015b = new a(null);

    /* JADX INFO: renamed from: a */
    private final ag.n f12016a;

    public static final class a {

        /* JADX INFO: renamed from: ef.k$a$a */
        public static final class C0163a {

            /* JADX INFO: renamed from: a */
            private final k f12017a;

            /* JADX INFO: renamed from: b */
            private final n f12018b;

            public C0163a(k kVar, n nVar) {
                rd.m.e(kVar, "deserializationComponentsForJava");
                rd.m.e(nVar, "deserializedDescriptorResolver");
                this.f12017a = kVar;
                this.f12018b = nVar;
            }

            public final k a() {
                return this.f12017a;
            }

            public final n b() {
                return this.f12018b;
            }
        }

        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        public final C0163a a(v vVar, v vVar2, ve.u uVar, String str, ag.w wVar, bf.b bVar) {
            rd.m.e(vVar, "kotlinClassFinder");
            rd.m.e(vVar2, "jvmBuiltInsKotlinClassFinder");
            rd.m.e(uVar, "javaClassFinder");
            rd.m.e(str, "moduleName");
            rd.m.e(wVar, "errorReporter");
            rd.m.e(bVar, "javaSourceElementFactory");
            dg.f fVar = new dg.f("DeserializationComponentsForJava.ModuleData");
            ge.k kVar = new ge.k(fVar, k.a.f13837a);
            mf.f fVarK = mf.f.k('<' + str + '>');
            rd.m.d(fVarK, "special(...)");
            ke.f0 f0Var = new ke.f0(fVarK, fVar, kVar, null, null, null, 56, null);
            kVar.F0(f0Var);
            kVar.N0(f0Var, true);
            n nVar = new n();
            ye.o oVar = new ye.o();
            m0 m0Var = new m0(fVar, f0Var);
            ye.j jVarB = l.b(uVar, f0Var, fVar, m0Var, vVar, nVar, wVar, bVar, oVar, (WXMediaMessage.TITLE_LENGTH_LIMIT & WXMediaMessage.TITLE_LENGTH_LIMIT) != 0 ? d0.a.f11953a : null);
            k kVarA = l.a(f0Var, fVar, m0Var, jVarB, vVar, nVar, wVar, jf.c.f18690i);
            nVar.p(kVarA);
            we.j jVar = we.j.f31416a;
            rd.m.d(jVar, "EMPTY");
            vf.c cVar = new vf.c(jVarB, jVar);
            oVar.c(cVar);
            ge.w wVar2 = new ge.w(fVar, vVar2, f0Var, m0Var, kVar.M0(), kVar.M0(), o.a.f556a, fg.p.f13077b.a(), new wf.b(fVar, ed.q.k()));
            f0Var.W0(f0Var);
            f0Var.O0(new ke.l(ed.q.n(cVar.a(), wVar2), "CompositeProvider@RuntimeModuleData for " + f0Var));
            return new C0163a(kVarA, nVar);
        }

        private a() {
        }
    }

    public k(dg.n nVar, he.h0 h0Var, ag.o oVar, o oVar2, h hVar, ye.j jVar, m0 m0Var, ag.w wVar, pe.c cVar, ag.m mVar, fg.p pVar, hg.a aVar) {
        je.c cVarM0;
        je.a aVarM0;
        rd.m.e(nVar, "storageManager");
        rd.m.e(h0Var, "moduleDescriptor");
        rd.m.e(oVar, "configuration");
        rd.m.e(oVar2, "classDataFinder");
        rd.m.e(hVar, "annotationAndConstantLoader");
        rd.m.e(jVar, "packageFragmentProvider");
        rd.m.e(m0Var, "notFoundClasses");
        rd.m.e(wVar, "errorReporter");
        rd.m.e(cVar, "lookupTracker");
        rd.m.e(mVar, "contractDeserializer");
        rd.m.e(pVar, "kotlinTypeChecker");
        rd.m.e(aVar, "typeAttributeTranslators");
        ee.i iVarO = h0Var.o();
        ge.k kVar = iVarO instanceof ge.k ? (ge.k) iVarO : null;
        this.f12016a = new ag.n(nVar, h0Var, oVar, oVar2, hVar, jVar, b0.a.f463a, wVar, cVar, p.f12029a, ed.q.k(), m0Var, mVar, (kVar == null || (aVarM0 = kVar.M0()) == null) ? a.C0241a.f18650a : aVarM0, (kVar == null || (cVarM0 = kVar.M0()) == null) ? c.b.f18652a : cVarM0, lf.h.f20571a.a(), pVar, new wf.b(nVar, ed.q.k()), aVar.a(), ag.z.f613a);
    }

    public final ag.n a() {
        return this.f12016a;
    }
}
