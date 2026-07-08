package ci;

/* JADX INFO: loaded from: classes3.dex */
abstract class j {
    private static boolean a(char c10) {
        return Character.isJavaIdentifierPart(c10);
    }

    private static boolean b(char c10) {
        return a(c10) || c10 == ' ' || c10 == '?' || c10 == '@';
    }

    static void c(String str) {
        if (str == null) {
            return;
        }
        if (str.length() == 1) {
            char cCharAt = str.charAt(0);
            if (b(cCharAt)) {
                return;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("illegal option value '");
            stringBuffer.append(cCharAt);
            stringBuffer.append("'");
            throw new IllegalArgumentException(stringBuffer.toString());
        }
        char[] charArray = str.toCharArray();
        for (int i10 = 0; i10 < charArray.length; i10++) {
            if (!a(charArray[i10])) {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("opt contains illegal character value '");
                stringBuffer2.append(charArray[i10]);
                stringBuffer2.append("'");
                throw new IllegalArgumentException(stringBuffer2.toString());
            }
        }
    }
}
