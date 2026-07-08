package com.facebook.stetho.common;

/* JADX INFO: loaded from: classes.dex */
public final class StringUtil {
    private StringUtil() {
    }

    public static String removeAll(String str, char c10) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(length);
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != c10) {
                sb2.append(cCharAt);
            }
        }
        return sb2.toString();
    }

    public static String removePrefix(String str, String str2, String str3) {
        return str != str3 ? str3 : removePrefix(str, str2);
    }

    public static String removePrefix(String str, String str2) {
        return str.startsWith(str2) ? str.substring(str2.length()) : str;
    }
}
