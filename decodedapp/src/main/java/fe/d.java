package fe;

import dg.n;
import ed.q;
import fe.f;
import java.util.List;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends xf.f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(n nVar, b bVar) {
        super(nVar, bVar);
        m.e(nVar, "storageManager");
        m.e(bVar, "containingClass");
    }

    @Override // xf.f
    protected List j() {
        he.e eVarM = m();
        m.c(eVarM, "null cannot be cast to non-null type org.jetbrains.kotlin.builtins.functions.FunctionClassDescriptor");
        f fVarU0 = ((b) eVarM).U0();
        return m.a(fVarU0, f.a.f13005f) ? q.e(e.N.a((b) m(), false)) : m.a(fVarU0, f.d.f13008f) ? q.e(e.N.a((b) m(), true)) : q.k();
    }
}
