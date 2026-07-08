package ue;

import gf.o;
import gf.r;
import gf.v;
import java.util.List;
import kf.a;
import lf.d;
import of.i;
import qe.q;
import qe.s;
import qe.t;
import qe.u;
import qe.w;
import qe.x;
import qe.z;
import rd.m;
import se.i;
import se.j;
import se.k;
import se.l;
import se.n;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements n {
    @Override // se.n
    public i a() {
        return null;
    }

    @Override // se.n
    public se.h b() {
        return new f();
    }

    @Override // se.n
    public void c(q qVar, gf.h hVar, re.e eVar) {
        m.e(qVar, "kmEnumEntry");
        m.e(hVar, "proto");
        m.e(eVar, "c");
        for (gf.b bVar : hVar.H()) {
            List listA = qVar.a();
            m.b(bVar);
            listA.add(re.f.b(bVar, eVar.e()));
        }
    }

    @Override // se.n
    public se.d d() {
        return null;
    }

    @Override // se.n
    public j e() {
        return new g();
    }

    @Override // se.n
    public void f(t tVar, o oVar, re.e eVar) {
        m.e(tVar, "kmProperty");
        m.e(oVar, "proto");
        m.e(eVar, "c");
        f fVarD = c.d(tVar);
        List<gf.b> listT0 = oVar.t0();
        m.d(listT0, "getAnnotationList(...)");
        List listA = tVar.a();
        for (gf.b bVar : listT0) {
            m.b(bVar);
            listA.add(re.f.b(bVar, eVar.e()));
        }
        List<gf.b> listQ0 = oVar.Q0();
        m.d(listQ0, "getGetterAnnotationList(...)");
        List listA2 = tVar.h().a();
        for (gf.b bVar2 : listQ0) {
            m.b(bVar2);
            listA2.add(re.f.b(bVar2, eVar.e()));
        }
        u uVarI = tVar.i();
        if (uVarI != null) {
            List<gf.b> listA1 = oVar.a1();
            m.d(listA1, "getSetterAnnotationList(...)");
            List listA3 = uVarI.a();
            for (gf.b bVar3 : listA1) {
                m.b(bVar3);
                listA3.add(re.f.b(bVar3, eVar.e()));
            }
        }
        List<gf.b> listM0 = oVar.M0();
        m.d(listM0, "getExtensionReceiverAnnotationList(...)");
        List listE = tVar.e();
        for (gf.b bVar4 : listM0) {
            m.b(bVar4);
            listE.add(re.f.b(bVar4, eVar.e()));
        }
        List<gf.b> listW0 = oVar.w0();
        m.d(listW0, "getBackingFieldAnnotationList(...)");
        List listB = tVar.b();
        for (gf.b bVar5 : listW0) {
            m.b(bVar5);
            listB.add(re.f.b(bVar5, eVar.e()));
        }
        List<gf.b> listJ0 = oVar.J0();
        m.d(listJ0, "getDelegateFieldAnnotationList(...)");
        List listD = tVar.d();
        for (gf.b bVar6 : listJ0) {
            m.b(bVar6);
            listD.add(re.f.b(bVar6, eVar.e()));
        }
        d.a aVarD = lf.h.d(lf.h.f20571a, oVar, eVar.e(), eVar.g(), false, 8, null);
        i.f fVar = kf.a.f19836d;
        m.d(fVar, "propertySignature");
        a.d dVar = (a.d) jf.f.a(oVar, fVar);
        a.c cVarX = (dVar == null || !dVar.G()) ? null : dVar.x();
        a.c cVarZ = (dVar == null || !dVar.H()) ? null : dVar.z();
        Object objP = oVar.p(kf.a.f19837e);
        m.d(objP, "getExtension(...)");
        fVarD.c(((Number) objP).intValue());
        fVarD.a(aVarD != null ? te.c.a(aVarD) : null);
        fVarD.b(cVarX != null ? new te.d(eVar.b(cVarX.s()), eVar.b(cVarX.r())) : null);
        fVarD.d(cVarZ != null ? new te.d(eVar.b(cVarZ.s()), eVar.b(cVarZ.r())) : null);
        a.c cVarA = (dVar == null || !dVar.K()) ? null : dVar.A();
        fVarD.e(cVarA != null ? new te.d(eVar.b(cVarA.s()), eVar.b(cVarA.r())) : null);
        a.c cVarV = (dVar == null || !dVar.C()) ? null : dVar.v();
        fVarD.f(cVarV != null ? new te.d(eVar.b(cVarV.s()), eVar.b(cVarV.r())) : null);
    }

    @Override // se.n
    public void g(s sVar, gf.j jVar, re.e eVar) {
        m.e(sVar, "kmFunction");
        m.e(jVar, "proto");
        m.e(eVar, "c");
        d dVarC = c.c(sVar);
        List<gf.b> listM0 = jVar.m0();
        m.d(listM0, "getAnnotationList(...)");
        List listA = sVar.a();
        for (gf.b bVar : listM0) {
            m.b(bVar);
            listA.add(re.f.b(bVar, eVar.e()));
        }
        List<gf.b> listA0 = jVar.A0();
        m.d(listA0, "getExtensionReceiverAnnotationList(...)");
        List listC = sVar.c();
        for (gf.b bVar2 : listA0) {
            m.b(bVar2);
            listC.add(re.f.b(bVar2, eVar.e()));
        }
        d.b bVarE = lf.h.f20571a.e(jVar, eVar.e(), eVar.g());
        dVarC.b(bVarE != null ? te.c.b(bVarE) : null);
        i.f fVar = kf.a.f19835c;
        m.d(fVar, "lambdaClassOriginName");
        Integer num = (Integer) jf.f.a(jVar, fVar);
        if (num != null) {
            dVarC.a(eVar.b(num.intValue()));
        }
    }

    @Override // se.n
    public se.b h() {
        return new a();
    }

    @Override // se.n
    public se.g i() {
        return new d();
    }

    @Override // se.n
    public void j(z zVar, v vVar, re.e eVar) {
        m.e(zVar, "kmValueParameter");
        m.e(vVar, "proto");
        m.e(eVar, "c");
        List<gf.b> listR = vVar.R();
        m.d(listR, "getAnnotationList(...)");
        List listA = zVar.a();
        for (gf.b bVar : listR) {
            m.b(bVar);
            listA.add(re.f.b(bVar, eVar.e()));
        }
    }

    @Override // se.n
    public void k(w wVar, gf.s sVar, re.e eVar) {
        m.e(wVar, "kmTypeAlias");
        m.e(sVar, "proto");
        m.e(eVar, "c");
    }

    @Override // se.n
    public k l() {
        return new h();
    }

    @Override // se.n
    public void m(x xVar, gf.t tVar, re.e eVar) {
        m.e(xVar, "kmTypeParameter");
        m.e(tVar, "proto");
        m.e(eVar, "c");
        h hVarF = c.f(xVar);
        for (gf.b bVar : (List) tVar.p(kf.a.f19840h)) {
            List listA = hVarF.a();
            m.b(bVar);
            listA.add(re.f.b(bVar, eVar.e()));
        }
    }

    @Override // se.n
    public void n(qe.v vVar, r rVar, re.e eVar) {
        m.e(vVar, "kmType");
        m.e(rVar, "proto");
        m.e(eVar, "c");
        g gVarE = c.e(vVar);
        Object objP = rVar.p(kf.a.f19839g);
        m.d(objP, "getExtension(...)");
        gVarE.b(((Boolean) objP).booleanValue());
        for (gf.b bVar : (List) rVar.p(kf.a.f19838f)) {
            List listA = gVarE.a();
            m.b(bVar);
            listA.add(re.f.b(bVar, eVar.e()));
        }
    }

    @Override // se.n
    public l o() {
        return null;
    }

    @Override // se.n
    public se.c p() {
        return new b();
    }

    @Override // se.n
    public void q(qe.j jVar, gf.e eVar, re.e eVar2) {
        m.e(jVar, "kmConstructor");
        m.e(eVar, "proto");
        m.e(eVar2, "c");
        b bVarB = c.b(jVar);
        List<gf.b> listR = eVar.R();
        m.d(listR, "getAnnotationList(...)");
        List listA = jVar.a();
        for (gf.b bVar : listR) {
            m.b(bVar);
            listA.add(re.f.b(bVar, eVar2.e()));
        }
        d.b bVarB2 = lf.h.f20571a.b(eVar, eVar2.e(), eVar2.g());
        bVarB.a(bVarB2 != null ? te.c.b(bVarB2) : null);
    }

    @Override // se.n
    public void r(qe.g gVar, gf.c cVar, re.e eVar) {
        String strB;
        m.e(gVar, "kmClass");
        m.e(cVar, "proto");
        m.e(eVar, "c");
        a aVarA = c.a(gVar);
        List<gf.b> listD0 = cVar.D0();
        m.d(listD0, "getAnnotationList(...)");
        List listD = gVar.d();
        for (gf.b bVar : listD0) {
            m.b(bVar);
            listD.add(re.f.b(bVar, eVar.e()));
        }
        i.f fVar = kf.a.f19843k;
        m.d(fVar, "anonymousObjectOriginName");
        Integer num = (Integer) jf.f.a(cVar, fVar);
        if (num != null) {
            aVarA.c(eVar.b(num.intValue()));
        }
        for (o oVar : (List) cVar.p(kf.a.f19842j)) {
            List listB = aVarA.b();
            m.b(oVar);
            listB.add(re.g.p(oVar, eVar));
        }
        i.f fVar2 = kf.a.f19841i;
        m.d(fVar2, "classModuleName");
        Integer num2 = (Integer) jf.f.a(cVar, fVar2);
        if (num2 == null || (strB = eVar.b(num2.intValue())) == null) {
            strB = "main";
        }
        aVarA.e(strB);
        i.f fVar3 = kf.a.f19844l;
        m.d(fVar3, "jvmClassFlags");
        Integer num3 = (Integer) jf.f.a(cVar, fVar3);
        if (num3 != null) {
            aVarA.d(num3.intValue());
        }
    }
}
