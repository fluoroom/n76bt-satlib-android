package ci;

/* JADX INFO: loaded from: classes3.dex */
abstract class o {
    static String a(String str) {
        if (str.startsWith("\"")) {
            str = str.substring(1, str.length());
        }
        return str.endsWith("\"") ? str.substring(0, str.length() - 1) : str;
    }

    static String b(String str) {
        if (str == null) {
            return null;
        }
        return str.startsWith("--") ? str.substring(2, str.length()) : str.startsWith("-") ? str.substring(1, str.length()) : str;
    }
}
