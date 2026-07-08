package ve;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class x {

    /* JADX INFO: renamed from: a */
    private static final List f30712a;

    /* JADX INFO: renamed from: b */
    private static final List f30713b;

    /* JADX INFO: renamed from: c */
    private static final Map f30714c;

    /* JADX INFO: renamed from: d */
    private static final Map f30715d;

    /* JADX INFO: renamed from: e */
    private static final Map f30716e;

    static {
        c cVar = c.f30558c;
        List listN = ed.q.n(c.f30559d, c.f30557b, cVar, c.f30561f, c.f30560e);
        f30712a = listN;
        List listE = ed.q.e(cVar);
        f30713b = listE;
        mf.c cVarK = k0.k();
        df.k kVar = df.k.f10999c;
        Map mapL = ed.k0.l(dd.w.a(cVarK, new w(new df.l(kVar, false, 2, null), listN, false)), dd.w.a(k0.i(), new w(new df.l(kVar, false, 2, null), listN, false)), dd.w.a(k0.j(), new w(new df.l(df.k.f10997a, false, 2, null), listN, false, 4, null)));
        f30714c = mapL;
        Map mapL2 = ed.k0.l(dd.w.a(k0.d(), new w(new df.l(kVar, false, 2, null), listE, false, 4, null)), dd.w.a(k0.e(), new w(new df.l(df.k.f10998b, false, 2, null), listE, false, 4, null)));
        f30715d = mapL2;
        f30716e = ed.k0.o(mapL, mapL2);
    }

    public static final Map a() {
        return f30716e;
    }

    public static final Map b() {
        return f30714c;
    }
}
