package gj;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public class b0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String[] f14532g = {"-", "−"};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String[] f14533h = {"+"};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String[] f14534i = {"*", "×"};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String[] f14535j = {"°", "◦"};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String[] f14536k = {"″", "''", "\""};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String[] f14537l = {"⁰", "¹", "²", "³", "⁴", "⁵", "⁶", "⁷", "⁸", "⁹"};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String[] f14538m = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Pattern f14539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Matcher f14540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f14541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f14542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f14543e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final a f14544f;

    public enum a {
        RADIANS(1.0d),
        DEGREES(aj.d.Z(1.0d)),
        ARC_SECONDS(aj.d.Z(2.777777777777778E-4d)),
        MILLI_ARC_SECONDS(aj.d.Z(2.7777777777777776E-7d)),
        MICRO_ARC_SECONDS(aj.d.Z(2.7777777777777777E-10d)),
        NO_UNITS(1.0d);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final double f14552a;

        a(double d10) {
            this.f14552a = d10;
        }

        public double a(double d10) {
            return d10 * this.f14552a;
        }
    }

    public b0(char c10, a aVar) {
        this.f14544f = aVar;
        String strB = b(g(d(f14535j, f14536k)));
        String strB2 = b(g(d(f14532g, f14533h)));
        String str = "\\.\\p{Digit}*" + i("[eE]" + i(strB2, false) + "\\p{Digit}+", false);
        this.f14539a = Pattern.compile("\\p{Space}*" + i(strB2, true) + "\\p{Space}*" + b(c(c("\\p{Digit}+", true) + c(strB, true) + c(str, true), false), c(c(b(c("\\p{Digit}+" + i(str, false), false), c(str, false)), true) + i(strB, true), false)) + "\\p{Space}*" + i(i(b(g(f14534i)), false) + "\\p{Space}*" + c10 + b("\\^" + a(g(f14538m)), a(g(f14537l))), true));
    }

    private String a(CharSequence... charSequenceArr) {
        return c(b(charSequenceArr) + "*", true);
    }

    private String b(CharSequence... charSequenceArr) {
        StringBuilder sb2 = new StringBuilder();
        for (CharSequence charSequence : charSequenceArr) {
            if (sb2.length() > 0) {
                sb2.append('|');
            }
            sb2.append(charSequence);
        }
        return c(sb2, false);
    }

    private String c(CharSequence charSequence, boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z10 ? "(" : "(?:");
        sb2.append((Object) charSequence);
        sb2.append(")");
        return sb2.toString();
    }

    private String[] d(String[] strArr, String[] strArr2) {
        String[] strArr3 = new String[strArr.length + strArr2.length];
        System.arraycopy(strArr, 0, strArr3, 0, strArr.length);
        System.arraycopy(strArr2, 0, strArr3, strArr.length, strArr2.length);
        return strArr3;
    }

    private boolean f(String str) {
        String strGroup;
        a aVar;
        Matcher matcher = this.f14540b;
        matcher.region(this.f14541c, matcher.regionEnd());
        if (!this.f14540b.lookingAt()) {
            this.f14542d = Double.NaN;
            this.f14543e = -1;
            return false;
        }
        double d10 = h(str, this.f14540b.start(1), f14532g) >= 0 ? -1.0d : 1.0d;
        if (this.f14540b.start(3) >= 0) {
            strGroup = this.f14540b.group(2) + this.f14540b.group(4);
            aVar = h(str, this.f14540b.start(3), f14535j) >= 0 ? a.DEGREES : a.ARC_SECONDS;
        } else {
            strGroup = this.f14540b.group(5);
            aVar = h(str, this.f14540b.start(6), f14535j) >= 0 ? a.DEGREES : h(str, this.f14540b.start(6), f14536k) >= 0 ? a.ARC_SECONDS : this.f14544f;
        }
        this.f14542d = d10 * aVar.a(Double.parseDouble(strGroup));
        if (this.f14540b.start(7) >= this.f14540b.end(7)) {
            this.f14543e = 0;
        } else if (this.f14540b.start(8) < this.f14540b.end(8)) {
            this.f14543e = 0;
            for (int iStart = this.f14540b.start(8); iStart < this.f14540b.end(8); iStart++) {
                this.f14543e = (this.f14543e * 10) + h(str, iStart, f14538m);
            }
        } else if (this.f14540b.start(9) < this.f14540b.end(9)) {
            this.f14543e = 0;
            for (int iStart2 = this.f14540b.start(9); iStart2 < this.f14540b.end(9); iStart2++) {
                this.f14543e = (this.f14543e * 10) + h(str, iStart2, f14537l);
            }
        } else {
            this.f14543e = 1;
        }
        this.f14541c = this.f14540b.end();
        return true;
    }

    private String[] g(String... strArr) {
        String[] strArr2 = new String[strArr.length];
        for (int i10 = 0; i10 < strArr.length; i10++) {
            strArr2[i10] = "\\Q" + strArr[i10] + "\\E";
        }
        return strArr2;
    }

    private int h(String str, int i10, String[] strArr) {
        for (int i11 = 0; i11 < strArr.length; i11++) {
            if (str.startsWith(strArr[i11], i10)) {
                return i11;
            }
        }
        return -1;
    }

    private String i(CharSequence charSequence, boolean z10) {
        String str = c(charSequence, false) + "?";
        return z10 ? c(str, true) : str;
    }

    public double[] e(String str) {
        HashMap map = new HashMap();
        this.f14540b = this.f14539a.matcher(str);
        this.f14541c = 0;
        int iC = -1;
        while (f(str)) {
            iC = aj.d.C(iC, this.f14543e);
            map.put(Integer.valueOf(this.f14543e), Double.valueOf(this.f14542d));
        }
        if (iC < 0) {
            return null;
        }
        double[] dArr = new double[iC + 1];
        for (Map.Entry entry : map.entrySet()) {
            dArr[((Integer) entry.getKey()).intValue()] = ((Double) entry.getValue()).doubleValue();
        }
        return dArr;
    }
}
