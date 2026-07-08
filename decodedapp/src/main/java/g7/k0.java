package g7;

import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public class k0 extends h0 {
    public k0() {
        super(TimeZone.class);
    }

    @Override // g7.i0, p6.p
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void f(TimeZone timeZone, e6.g gVar, p6.d0 d0Var) {
        gVar.d1(timeZone.getID());
    }

    @Override // g7.h0, p6.p
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void g(TimeZone timeZone, e6.g gVar, p6.d0 d0Var, a7.h hVar) {
        n6.c cVarG = hVar.g(gVar, hVar.f(timeZone, TimeZone.class, e6.m.VALUE_STRING));
        f(timeZone, gVar, d0Var);
        hVar.h(gVar, cVarG);
    }
}
