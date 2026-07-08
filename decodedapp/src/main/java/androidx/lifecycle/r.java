package androidx.lifecycle;

import tg.w1;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {
    public static final n a(m mVar) {
        o oVar;
        rd.m.e(mVar, "<this>");
        do {
            o oVar2 = (o) mVar.c().b();
            if (oVar2 != null) {
                return oVar2;
            }
            oVar = new o(mVar, w1.b(null, 1, null).l(tg.p0.c().v0()));
        } while (!mVar.c().a(null, oVar));
        oVar.b();
        return oVar;
    }
}
