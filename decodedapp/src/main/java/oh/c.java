package oh;

import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    public static final int a(String str, int i10) {
        m.e(str, "<this>");
        char cCharAt = str.charAt(i10);
        return (cCharAt << 7) + str.charAt(i10 + 1);
    }
}
