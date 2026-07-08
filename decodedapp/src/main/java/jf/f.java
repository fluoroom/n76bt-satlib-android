package jf;

import of.i;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {
    public static final Object a(i.d dVar, i.f fVar) {
        m.e(dVar, "<this>");
        m.e(fVar, "extension");
        if (dVar.s(fVar)) {
            return dVar.p(fVar);
        }
        return null;
    }

    public static final Object b(i.d dVar, i.f fVar, int i10) {
        m.e(dVar, "<this>");
        m.e(fVar, "extension");
        if (i10 < dVar.r(fVar)) {
            return dVar.q(fVar, i10);
        }
        return null;
    }
}
