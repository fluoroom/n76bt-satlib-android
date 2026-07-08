package f4;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f12779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final char f12780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f12781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f12782d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f12783e;

    public a(String str, char c10) {
        this.f12779a = str;
        this.f12780b = c10;
        String strValueOf = String.valueOf(c10);
        this.f12781c = strValueOf;
        this.f12782d = strValueOf + strValueOf;
    }

    private String b() {
        if (this.f12783e == null) {
            String strQuote = Pattern.quote(this.f12779a);
            String strQuote2 = Pattern.quote(this.f12781c);
            this.f12783e = String.format("%s(?=([^%s]*%s[^%s]*%s)*[^%s]*$)", strQuote, strQuote2, strQuote2, strQuote2, strQuote2, strQuote2);
        }
        return this.f12783e;
    }

    protected String a(String str) {
        if (str == null) {
            return "";
        }
        int length = str.length();
        String strReplaceAll = str.replaceAll(this.f12781c, this.f12782d);
        if (strReplaceAll.length() != length) {
            return this.f12781c + strReplaceAll + this.f12781c;
        }
        if (!strReplaceAll.contains(this.f12779a) && !strReplaceAll.contains("\n")) {
            return strReplaceAll;
        }
        return this.f12781c + strReplaceAll + this.f12781c;
    }

    public boolean c(String str) {
        int length;
        if (str == null || (length = str.length()) == 0) {
            return true;
        }
        int i10 = 0;
        while (true) {
            int i11 = length - 1;
            if (length <= 0) {
                break;
            }
            if (str.charAt(i11) == this.f12780b) {
                i10++;
            }
            length = i11;
        }
        return i10 % 2 == 0;
    }

    public String[] d(String str) {
        String[] strArrSplit = str.split(b());
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            String strReplaceAll = strArrSplit[i10].replaceAll(this.f12782d, this.f12781c);
            if (strReplaceAll.length() > 1 && strReplaceAll.startsWith(this.f12781c) && strReplaceAll.endsWith(this.f12781c)) {
                strReplaceAll = strReplaceAll.substring(1, strReplaceAll.length() - 1);
            }
            strArrSplit[i10] = strReplaceAll;
        }
        if (!str.endsWith(this.f12779a)) {
            return strArrSplit;
        }
        String[] strArr = new String[strArrSplit.length + 1];
        System.arraycopy(strArrSplit, 0, strArr, 0, strArrSplit.length);
        strArr[strArrSplit.length] = "";
        return strArr;
    }

    public String e(String[] strArr, int i10) {
        return f(strArr, i10, true);
    }

    public String f(String[] strArr, int i10, boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        int length = strArr.length;
        int i11 = 0;
        while (i11 < length) {
            sb2.append(a(strArr[i11]));
            if (i11 < i10 - 1) {
                sb2.append(this.f12779a);
            }
            i11++;
        }
        while (i11 < i10 - 1) {
            sb2.append(this.f12779a);
            i11++;
        }
        if (z10) {
            sb2.append("\n");
        }
        return sb2.toString();
    }

    public a() {
        this(",", '\"');
    }
}
