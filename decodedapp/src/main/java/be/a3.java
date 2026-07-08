package be;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a3 {
    public static final yd.c a(ClassLoader classLoader, String str) {
        rd.m.e(classLoader, "<this>");
        rd.m.e(str, "name");
        Class clsO = l3.o(classLoader, b(str), 0, 2, null);
        if (clsO != null) {
            return pd.a.e(clsO);
        }
        return null;
    }

    public static final mf.b b(String str) {
        rd.m.e(str, "<this>");
        boolean zJ = rg.q.J(str, ".", false, 2, null);
        if (zJ) {
            str = str.substring(1);
            rd.m.d(str, "substring(...)");
        }
        return new mf.b(new mf.c(rg.q.E(rg.q.U0(str, '/', ""), '/', '.', false, 4, null)), new mf.c(rg.q.O0(str, '/', null, 2, null)), zJ);
    }

    public static final String c(String str) {
        rd.m.e(str, "<this>");
        if (!rg.q.J(str, ".", false, 2, null)) {
            return rg.q.O0(rg.q.O0(str, '/', null, 2, null), '.', null, 2, null);
        }
        throw new IllegalArgumentException(("Local class is not supported: " + str).toString());
    }
}
