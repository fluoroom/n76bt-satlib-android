package fg;

import eg.t1;
import fg.f;
import fg.g;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static final t1 a(boolean z10, boolean z11, b bVar, f fVar, g gVar) {
        rd.m.e(bVar, "typeSystemContext");
        rd.m.e(fVar, "kotlinTypePreparator");
        rd.m.e(gVar, "kotlinTypeRefiner");
        return new t1(z10, z11, false, true, bVar, fVar, gVar);
    }

    public static /* synthetic */ t1 b(boolean z10, boolean z11, b bVar, f fVar, g gVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        if ((i10 & 4) != 0) {
            bVar = s.f13084a;
        }
        if ((i10 & 8) != 0) {
            fVar = f.a.f13058a;
        }
        if ((i10 & 16) != 0) {
            gVar = g.a.f13059a;
        }
        return a(z10, z11, bVar, fVar, gVar);
    }
}
