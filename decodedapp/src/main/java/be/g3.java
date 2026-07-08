package be;

import java.io.IOException;
import java.util.List;
import yd.i;

/* JADX INFO: loaded from: classes3.dex */
public final class g3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g3 f3870a = new g3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final pf.n f3871b = pf.n.f24180h;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3872a;

        static {
            int[] iArr = new int[i.a.values().length];
            try {
                iArr[i.a.f32521c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[i.a.f32519a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[i.a.f32522d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f3872a = iArr;
        }
    }

    private g3() {
    }

    private final void c(StringBuilder sb2, he.b1 b1Var) {
        if (b1Var != null) {
            eg.r0 type = b1Var.getType();
            rd.m.d(type, "getType(...)");
            sb2.append(l(type));
            sb2.append(".");
        }
    }

    private final void d(StringBuilder sb2, he.a aVar) {
        he.b1 b1VarI = l3.i(aVar);
        he.b1 b1VarL0 = aVar.l0();
        c(sb2, b1VarI);
        boolean z10 = (b1VarI == null || b1VarL0 == null) ? false : true;
        if (z10) {
            sb2.append("(");
        }
        c(sb2, b1VarL0);
        if (z10) {
            sb2.append(")");
        }
    }

    private final String e(he.a aVar) {
        if (aVar instanceof he.y0) {
            return k((he.y0) aVar);
        }
        if (aVar instanceof he.z) {
            return f((he.z) aVar);
        }
        throw new IllegalStateException(("Illegal callable: " + aVar).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence g(he.s1 s1Var) {
        g3 g3Var = f3870a;
        eg.r0 type = s1Var.getType();
        rd.m.d(type, "getType(...)");
        return g3Var.l(type);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence i(he.s1 s1Var) {
        g3 g3Var = f3870a;
        eg.r0 type = s1Var.getType();
        rd.m.d(type, "getType(...)");
        return g3Var.l(type);
    }

    public final String f(he.z zVar) throws IOException {
        rd.m.e(zVar, "descriptor");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("fun ");
        g3 g3Var = f3870a;
        g3Var.d(sb2, zVar);
        pf.n nVar = f3871b;
        mf.f name = zVar.getName();
        rd.m.d(name, "getName(...)");
        sb2.append(nVar.R(name, true));
        List listI = zVar.i();
        rd.m.d(listI, "getValueParameters(...)");
        ed.b0.f0(listI, sb2, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : "(", (124 & 8) == 0 ? ")" : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : e3.f3857a);
        sb2.append(": ");
        eg.r0 r0VarG = zVar.g();
        rd.m.b(r0VarG);
        sb2.append(g3Var.l(r0VarG));
        return sb2.toString();
    }

    public final String h(he.z zVar) throws IOException {
        rd.m.e(zVar, "invoke");
        StringBuilder sb2 = new StringBuilder();
        g3 g3Var = f3870a;
        g3Var.d(sb2, zVar);
        List listI = zVar.i();
        rd.m.d(listI, "getValueParameters(...)");
        ed.b0.f0(listI, sb2, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : "(", (124 & 8) == 0 ? ")" : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : f3.f3865a);
        sb2.append(" -> ");
        eg.r0 r0VarG = zVar.g();
        rd.m.b(r0VarG);
        sb2.append(g3Var.l(r0VarG));
        return sb2.toString();
    }

    public final String j(z1 z1Var) {
        rd.m.e(z1Var, "parameter");
        StringBuilder sb2 = new StringBuilder();
        int i10 = a.f3872a[z1Var.j().ordinal()];
        if (i10 == 1) {
            sb2.append("extension receiver parameter");
        } else if (i10 == 2) {
            sb2.append("instance parameter");
        } else {
            if (i10 != 3) {
                throw new dd.o();
            }
            sb2.append("parameter #" + z1Var.getIndex() + ' ' + z1Var.getName());
        }
        sb2.append(" of ");
        sb2.append(f3870a.e(z1Var.h().Q()));
        return sb2.toString();
    }

    public final String k(he.y0 y0Var) {
        rd.m.e(y0Var, "descriptor");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(y0Var.j0() ? "var " : "val ");
        g3 g3Var = f3870a;
        g3Var.d(sb2, y0Var);
        pf.n nVar = f3871b;
        mf.f name = y0Var.getName();
        rd.m.d(name, "getName(...)");
        sb2.append(nVar.R(name, true));
        sb2.append(": ");
        eg.r0 type = y0Var.getType();
        rd.m.d(type, "getType(...)");
        sb2.append(g3Var.l(type));
        return sb2.toString();
    }

    public final String l(eg.r0 r0Var) {
        rd.m.e(r0Var, "type");
        return f3871b.S(r0Var);
    }
}
