package u1;

/* JADX INFO: loaded from: classes.dex */
abstract class c {
    static String[] a(String str) {
        if (str == null) {
            throw new v1.a("The token is null.");
        }
        int iIndexOf = str.indexOf(46);
        if (iIndexOf == -1) {
            throw b(0);
        }
        int i10 = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(46, i10);
        if (iIndexOf2 == -1) {
            throw b(2);
        }
        int i11 = iIndexOf2 + 1;
        if (str.indexOf(46, i11) == -1) {
            return new String[]{str.substring(0, iIndexOf), str.substring(i10, iIndexOf2), str.substring(i11)};
        }
        throw b("> 3");
    }

    private static v1.a b(Object obj) {
        return new v1.a(String.format("The token was expected to have 3 parts, but got %s.", obj));
    }
}
