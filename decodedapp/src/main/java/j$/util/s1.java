package j$.util;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String[] f17880d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f17881e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f17882f;

    public s1(CharSequence charSequence) {
        Objects.requireNonNull("", "The prefix must not be null");
        Objects.requireNonNull(charSequence, "The delimiter must not be null");
        Objects.requireNonNull("", "The suffix must not be null");
        this.f17877a = "";
        this.f17878b = charSequence.toString();
        this.f17879c = "";
    }

    public static int c(String str, char[] cArr, int i10) {
        int length = str.length();
        str.getChars(0, length, cArr, i10);
        return length;
    }

    public final String toString() {
        String[] strArr = this.f17880d;
        int i10 = this.f17881e;
        String str = this.f17877a;
        int length = str.length();
        String str2 = this.f17879c;
        int length2 = str2.length() + length;
        if (length2 == 0) {
            b();
            return i10 == 0 ? "" : strArr[0];
        }
        char[] cArr = new char[this.f17882f + length2];
        int iC = c(str, cArr, 0);
        if (i10 > 0) {
            int iC2 = c(strArr[0], cArr, iC) + iC;
            for (int i11 = 1; i11 < i10; i11++) {
                int iC3 = c(this.f17878b, cArr, iC2) + iC2;
                iC2 = c(strArr[i11], cArr, iC3) + iC3;
            }
            iC = iC2;
        }
        c(str2, cArr, iC);
        return new String(cArr);
    }

    public final void a(CharSequence charSequence) {
        String strValueOf = String.valueOf(charSequence);
        String[] strArr = this.f17880d;
        if (strArr == null) {
            this.f17880d = new String[8];
        } else {
            int i10 = this.f17881e;
            if (i10 == strArr.length) {
                this.f17880d = (String[]) Arrays.copyOf(strArr, i10 * 2);
            }
            this.f17882f = this.f17878b.length() + this.f17882f;
        }
        this.f17882f = strValueOf.length() + this.f17882f;
        String[] strArr2 = this.f17880d;
        int i11 = this.f17881e;
        this.f17881e = i11 + 1;
        strArr2[i11] = strValueOf;
    }

    public final void b() {
        String[] strArr;
        if (this.f17881e > 1) {
            char[] cArr = new char[this.f17882f];
            int iC = c(this.f17880d[0], cArr, 0);
            int i10 = 1;
            do {
                int iC2 = c(this.f17878b, cArr, iC) + iC;
                iC = c(this.f17880d[i10], cArr, iC2) + iC2;
                strArr = this.f17880d;
                strArr[i10] = null;
                i10++;
            } while (i10 < this.f17881e);
            this.f17881e = 1;
            strArr[0] = new String(cArr);
        }
    }
}
