package ge;

import ag.b0;
import ag.x;
import ag.z;
import he.h0;
import he.m0;
import java.io.InputStream;
import pe.c;

/* JADX INFO: loaded from: classes3.dex */
public final class w extends ag.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f13877f = new a(null);

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(dg.n nVar, ef.v vVar, h0 h0Var, m0 m0Var, je.a aVar, je.c cVar, ag.o oVar, fg.p pVar, wf.a aVar2) {
        super(nVar, vVar, h0Var);
        rd.m.e(nVar, "storageManager");
        rd.m.e(vVar, "finder");
        rd.m.e(h0Var, "moduleDescriptor");
        rd.m.e(m0Var, "notFoundClasses");
        rd.m.e(aVar, "additionalClassPartsProvider");
        rd.m.e(cVar, "platformDependentDeclarationFilter");
        rd.m.e(oVar, "deserializationConfiguration");
        rd.m.e(pVar, "kotlinTypeChecker");
        rd.m.e(aVar2, "samConversionResolver");
        ag.q qVar = new ag.q(this);
        bg.a aVar3 = bg.a.f4041r;
        ag.f fVar = new ag.f(h0Var, m0Var, aVar3);
        b0.a aVar4 = b0.a.f463a;
        ag.w wVar = ag.w.f597a;
        rd.m.d(wVar, "DO_NOTHING");
        k(new ag.n(nVar, h0Var, oVar, qVar, fVar, this, aVar4, wVar, c.a.f24112a, x.a.f606a, ed.q.n(new fe.a(nVar, h0Var), new g(nVar, h0Var, null, 4, null)), m0Var, ag.m.f518a.a(), aVar, cVar, aVar3.e(), pVar, aVar2, null, z.f613a, 262144, null));
    }

    @Override // ag.c
    protected ag.r e(mf.c cVar) {
        rd.m.e(cVar, "fqName");
        InputStream inputStreamC = h().c(cVar);
        if (inputStreamC != null) {
            return bg.c.f4043x.a(cVar, j(), i(), inputStreamC, false);
        }
        return null;
    }
}
