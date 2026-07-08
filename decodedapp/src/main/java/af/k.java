package af;

import d.h0;
import eg.a2;
import eg.b1;
import eg.c1;
import eg.i0;
import eg.q1;
import eg.r0;
import eg.z1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import pf.n;
import pf.w;
import rd.m;
import rg.q;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends i0 implements b1 {
    private k(c1 c1Var, c1 c1Var2, boolean z10) {
        super(c1Var, c1Var2);
        if (z10) {
            return;
        }
        fg.e.f13057a.a(c1Var, c1Var2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence b1(String str) {
        m.e(str, "it");
        return "(raw) " + str;
    }

    private static final boolean c1(String str, String str2) {
        return m.a(str, q.v0(str2, "out ")) || m.a(str2, "*");
    }

    private static final List d1(n nVar, r0 r0Var) {
        List listL0 = r0Var.L0();
        ArrayList arrayList = new ArrayList(ed.q.v(listL0, 10));
        Iterator it = listL0.iterator();
        while (it.hasNext()) {
            arrayList.add(nVar.T((a2) it.next()));
        }
        return arrayList;
    }

    private static final String e1(String str, String str2) {
        if (!q.O(str, '<', false, 2, null)) {
            return str;
        }
        return q.S0(str, '<', null, 2, null) + '<' + str2 + '>' + q.O0(str, '>', null, 2, null);
    }

    @Override // eg.i0
    public c1 U0() {
        return V0();
    }

    @Override // eg.i0
    public String X0(n nVar, w wVar) {
        m.e(nVar, "renderer");
        m.e(wVar, "options");
        String strS = nVar.S(V0());
        String strS2 = nVar.S(W0());
        if (wVar.l()) {
            return "raw (" + strS + ".." + strS2 + ')';
        }
        if (W0().L0().isEmpty()) {
            return nVar.P(strS, strS2, jg.d.n(this));
        }
        List listD1 = d1(nVar, V0());
        List listD12 = d1(nVar, W0());
        String strI0 = ed.q.i0(listD1, ", ", null, null, 0, null, j.f459a, 30, null);
        List<dd.q> listQ0 = ed.q.Q0(listD1, listD12);
        if (h0.a(listQ0) && listQ0.isEmpty()) {
            strS2 = e1(strS2, strI0);
        } else {
            for (dd.q qVar : listQ0) {
                if (!c1((String) qVar.c(), (String) qVar.d())) {
                    break;
                }
            }
            strS2 = e1(strS2, strI0);
        }
        String strE1 = e1(strS, strI0);
        return m.a(strE1, strS2) ? strE1 : nVar.P(strE1, strS2, jg.d.n(this));
    }

    @Override // eg.l2
    /* JADX INFO: renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public k R0(boolean z10) {
        return new k(V0().R0(z10), W0().R0(z10));
    }

    @Override // eg.l2
    /* JADX INFO: renamed from: a1, reason: merged with bridge method [inline-methods] */
    public i0 X0(fg.g gVar) {
        m.e(gVar, "kotlinTypeRefiner");
        r0 r0VarA = gVar.a(V0());
        m.c(r0VarA, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        r0 r0VarA2 = gVar.a(W0());
        m.c(r0VarA2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new k((c1) r0VarA, (c1) r0VarA2, true);
    }

    @Override // eg.l2
    /* JADX INFO: renamed from: f1, reason: merged with bridge method [inline-methods] */
    public k T0(q1 q1Var) {
        m.e(q1Var, "newAttributes");
        return new k(V0().T0(q1Var), W0().T0(q1Var));
    }

    @Override // eg.i0, eg.r0
    public xf.k p() {
        he.h hVarQ = N0().q();
        z1 z1Var = null;
        byte b10 = 0;
        he.e eVar = hVarQ instanceof he.e ? (he.e) hVarQ : null;
        if (eVar != null) {
            xf.k kVarO = eVar.O(new i(z1Var, 1, b10 == true ? 1 : 0));
            m.d(kVarO, "getMemberScope(...)");
            return kVarO;
        }
        throw new IllegalStateException(("Incorrect classifier: " + N0().q()).toString());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(c1 c1Var, c1 c1Var2) {
        this(c1Var, c1Var2, false);
        m.e(c1Var, "lowerBound");
        m.e(c1Var2, "upperBound");
    }
}
