package rg;

import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class g0 extends f0 {
    public static final String X0(String str, int i10) {
        rd.m.e(str, "<this>");
        if (i10 >= 0) {
            String strSubstring = str.substring(xd.d.c(i10, str.length()));
            rd.m.d(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    public static String Y0(String str, int i10) {
        rd.m.e(str, "<this>");
        if (i10 >= 0) {
            return a1(str, xd.d.b(str.length() - i10, 0));
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    public static char Z0(CharSequence charSequence) {
        rd.m.e(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(e0.W(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static String a1(String str, int i10) {
        rd.m.e(str, "<this>");
        if (i10 >= 0) {
            String strSubstring = str.substring(0, xd.d.c(i10, str.length()));
            rd.m.d(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }
}
