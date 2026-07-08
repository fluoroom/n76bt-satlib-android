package ef;

import ef.a0;
import kf.a;
import lf.d;
import of.i;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {
    public static final a0 a(gf.o oVar, jf.d dVar, jf.h hVar, boolean z10, boolean z11, boolean z12) {
        rd.m.e(oVar, "proto");
        rd.m.e(dVar, "nameResolver");
        rd.m.e(hVar, "typeTable");
        i.f fVar = kf.a.f19836d;
        rd.m.d(fVar, "propertySignature");
        a.d dVar2 = (a.d) jf.f.a(oVar, fVar);
        if (dVar2 == null) {
            return null;
        }
        if (z10) {
            d.a aVarC = lf.h.f20571a.c(oVar, dVar, hVar, z12);
            if (aVarC == null) {
                return null;
            }
            return a0.f11939b.b(aVarC);
        }
        if (!z11 || !dVar2.K()) {
            return null;
        }
        a0.a aVar = a0.f11939b;
        a.c cVarA = dVar2.A();
        rd.m.d(cVarA, "getSyntheticMethod(...)");
        return aVar.c(dVar, cVarA);
    }

    public static /* synthetic */ a0 b(gf.o oVar, jf.d dVar, jf.h hVar, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        if ((i10 & 16) != 0) {
            z11 = false;
        }
        if ((i10 & 32) != 0) {
            z12 = true;
        }
        return a(oVar, dVar, hVar, z10, z11, z12);
    }
}
