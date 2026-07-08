package rj;

import j$.util.Objects;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import yj.b0;
import yj.f0;
import yj.g0;
import yj.i;
import yj.j;
import yj.w;
import yj.y;
import zj.a1;
import zj.b1;
import zj.c1;

/* JADX INFO: loaded from: classes3.dex */
public class e implements g0, c1 {
    private static final double E = aj.d.O(1.0d, -20);
    private static final Pattern F = Pattern.compile("1 [ 0-9A-Z&&[^IO]][ 0-9]{4}[A-Z] [ 0-9]{5}[ A-Z]{3} [ 0-9]{5}[.][ 0-9]{8} (?:(?:[ 0+-][.][ 0-9]{8})|(?: [ +-][.][ 0-9]{7})) [ +-][ 0-9]{5}[+-][ 0-9] [ +-][ 0-9]{5}[+-][ 0-9] [ 0-9] [ 0-9]{4}[ 0-9]");
    private static final Pattern G = Pattern.compile("2 [ 0-9A-Z&&[^IO]][ 0-9]{4} [ 0-9]{3}[.][ 0-9]{4} [ 0-9]{3}[.][ 0-9]{4} [ 0-9]{7} [ 0-9]{3}[.][ 0-9]{4} [ 0-9]{3}[.][ 0-9]{4} [ 0-9]{2}[.][ 0-9]{13}[ 0-9]");
    private static final DecimalFormatSymbols H = new DecimalFormatSymbols(Locale.US);
    private String A;
    private String B;
    private final b0 C;
    private final transient a1 D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f26176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final char f26177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f26178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f26179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f26180e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f26181f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f26182g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final yj.b f26183h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final double f26184r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final double f26185s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final double f26186t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final double f26187u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final double f26188v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final double f26189w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final double f26190x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final double f26191y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final int f26192z;

    public e(String str, String str2) {
        this(str, str2, gj.c.a().d().e());
    }

    public static boolean L(String str, String str2) {
        if (str == null || str.length() != 69 || str2 == null || str2.length() != 69 || !F.matcher(str).matches() || !G.matcher(str2).matches()) {
            return false;
        }
        int iJ = j(str) % 10;
        if (Integer.parseInt(str.substring(68)) != iJ) {
            throw new hj.a(hj.f.TLE_CHECKSUM_ERROR, 1, Integer.toString(iJ), str.substring(68), str);
        }
        int iJ2 = j(str2) % 10;
        if (Integer.parseInt(str2.substring(68)) == iJ2) {
            return true;
        }
        throw new hj.a(hj.f.TLE_CHECKSUM_ERROR, 2, Integer.toString(iJ2), str2.substring(68), str2);
    }

    private void b() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('1');
        sb2.append(' ');
        sb2.append(b.c(this.f26176a, "satelliteNumber-1"));
        sb2.append(this.f26177b);
        sb2.append(' ');
        sb2.append(b.a("launchYear", this.f26178c % 100, '0', 2, true, this.f26176a));
        sb2.append(b.a("launchNumber", this.f26179d, '0', 3, true, this.f26176a));
        sb2.append(b.b("launchPiece", this.f26180e, ' ', 3, false, this.f26176a));
        sb2.append(' ');
        j jVarY = this.f26183h.Y(this.C);
        int iM = (int) aj.d.M((jVarY.e().h() * 31250.0d) / 27.0d);
        if (iM >= 100000000) {
            jVarY = this.f26183h.a(86400.0d).Y(this.C);
            iM -= 100000000;
        }
        sb2.append(b.a("year", jVarY.d().i() % 100, '0', 2, true, this.f26176a));
        sb2.append(b.a("day", jVarY.d().e(), '0', 3, true, this.f26176a));
        sb2.append('.');
        sb2.append(b.a("fraction", iM, '0', 8, true, this.f26176a));
        sb2.append(' ');
        sb2.append(b.b("meanMotionFirstDerivative", new DecimalFormat(".00000000", H).format((this.f26185s * 1.86624E9d) / 3.141592653589793d), ' ', 10, true, this.f26176a));
        sb2.append(' ');
        sb2.append(k("meanMotionSecondDerivative", (this.f26186t * 5.3747712E13d) / 3.141592653589793d, 5, ' ', 8, true));
        sb2.append(' ');
        sb2.append(k("B*", l(), 5, ' ', 8, true));
        sb2.append(' ');
        sb2.append(this.f26181f);
        sb2.append(' ');
        sb2.append(b.a("elementNumber", this.f26182g, ' ', 4, true, this.f26176a));
        sb2.append(j(sb2));
        this.A = sb2.toString();
    }

    private void c() {
        StringBuilder sb2 = new StringBuilder();
        DecimalFormatSymbols decimalFormatSymbols = H;
        DecimalFormat decimalFormat = new DecimalFormat("##0.0000", decimalFormatSymbols);
        DecimalFormat decimalFormat2 = new DecimalFormat("#0.00000000", decimalFormatSymbols);
        sb2.append('2');
        sb2.append(' ');
        sb2.append(b.c(this.f26176a, "satelliteNumber-2"));
        sb2.append(' ');
        sb2.append(b.b("inclination", decimalFormat.format(aj.d.Y(this.f26188v)), ' ', 8, true, this.f26176a));
        sb2.append(' ');
        sb2.append(b.b("raan", decimalFormat.format(aj.d.Y(this.f26190x)), ' ', 8, true, this.f26176a));
        sb2.append(' ');
        sb2.append(b.a("eccentricity", (int) aj.d.M(this.f26187u * 1.0E7d), '0', 7, true, this.f26176a));
        sb2.append(' ');
        sb2.append(b.b("pa", decimalFormat.format(aj.d.Y(this.f26189w)), ' ', 8, true, this.f26176a));
        sb2.append(' ');
        sb2.append(b.b("meanAnomaly", decimalFormat.format(aj.d.Y(this.f26191y)), ' ', 8, true, this.f26176a));
        sb2.append(' ');
        sb2.append(b.b("meanMotion", decimalFormat2.format((this.f26184r * 43200.0d) / 3.141592653589793d), ' ', 11, true, this.f26176a));
        sb2.append(b.a("revolutionNumberAtEpoch", this.f26192z, ' ', 5, true, this.f26176a));
        sb2.append(j(sb2));
        this.B = sb2.toString();
    }

    private static int j(CharSequence charSequence) {
        int iDigit = 0;
        for (int i10 = 0; i10 < 68; i10++) {
            char cCharAt = charSequence.charAt(i10);
            if (Character.isDigit(cCharAt)) {
                iDigit += Character.digit(cCharAt, 10);
            } else if (cCharAt == '-') {
                iDigit++;
            }
        }
        return iDigit % 10;
    }

    private String k(String str, double d10, int i10, char c10, int i11, boolean z10) {
        int i12;
        double dB = aj.d.b(d10);
        int iL = dB < 1.0E-9d ? -9 : (int) aj.d.l(aj.d.A(dB));
        long jN = aj.d.N(aj.d.J(10.0d, i10 - iL) * dB);
        if (jN == 0) {
            i12 = 0;
        } else {
            if (jN > aj.a.e(10, i10) - 1) {
                iL++;
                jN = aj.d.N(dB * aj.d.J(10.0d, i10 - iL));
            }
            i12 = iL;
        }
        String strA = b.a(str, (int) jN, '0', i10, true, this.f26176a);
        String string = Integer.toString(aj.d.c(i12));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(d10 < 0.0d ? '-' : ' ');
        sb2.append(strA);
        sb2.append(i12 > 0 ? '+' : '-');
        sb2.append(string);
        return b.b(str, sb2.toString(), c10, i11, z10, this.f26176a);
    }

    public String A() {
        if (this.B == null) {
            c();
        }
        return this.B;
    }

    public double B() {
        return this.f26191y;
    }

    public double C() {
        return this.f26184r;
    }

    public double D() {
        return this.f26185s;
    }

    public double E() {
        return this.f26186t;
    }

    public /* synthetic */ a1 F(String str) {
        return b1.a(this, str);
    }

    public double G() {
        return this.f26189w;
    }

    public double H() {
        return this.f26190x;
    }

    public int I() {
        return this.f26192z;
    }

    public int J() {
        return this.f26176a;
    }

    public b0 K() {
        return this.C;
    }

    @Override // zj.c1
    public List a() {
        return Collections.singletonList(this.D);
    }

    @Override // yj.g0
    public /* synthetic */ double e(g0 g0Var) {
        return f0.a(this, g0Var);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f26176a == eVar.f26176a && this.f26177b == eVar.f26177b && this.f26178c == eVar.f26178c && this.f26179d == eVar.f26179d && Objects.equals(this.f26180e, eVar.f26180e) && this.f26181f == eVar.f26181f && this.f26182g == eVar.f26182g && Objects.equals(this.f26183h, eVar.f26183h) && this.f26184r == eVar.f26184r && this.f26185s == eVar.f26185s && this.f26186t == eVar.f26186t && this.f26187u == eVar.f26187u && this.f26188v == eVar.f26188v && this.f26189w == eVar.f26189w && this.f26190x == eVar.f26190x && this.f26191y == eVar.f26191y && this.f26192z == eVar.f26192z && l() == eVar.l();
    }

    @Override // yj.g0
    public yj.b getDate() {
        return this.f26183h;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f26176a), Character.valueOf(this.f26177b), Integer.valueOf(this.f26178c), Integer.valueOf(this.f26179d), this.f26180e, Integer.valueOf(this.f26181f), Integer.valueOf(this.f26182g), this.f26183h, Double.valueOf(this.f26184r), Double.valueOf(this.f26185s), Double.valueOf(this.f26186t), Double.valueOf(this.f26187u), Double.valueOf(this.f26188v), Double.valueOf(this.f26189w), Double.valueOf(this.f26190x), Double.valueOf(this.f26191y), Integer.valueOf(this.f26192z), Double.valueOf(l()));
    }

    public double l() {
        return this.D.d(getDate());
    }

    public double m(yj.b bVar) {
        return this.D.d(bVar);
    }

    public char o() {
        return this.f26177b;
    }

    public double p() {
        return this.f26187u;
    }

    public int t() {
        return this.f26182g;
    }

    public String toString() {
        return z() + System.getProperty("line.separator") + A();
    }

    public int u() {
        return this.f26181f;
    }

    public double v() {
        return this.f26188v;
    }

    public int w() {
        return this.f26179d;
    }

    public String x() {
        return this.f26180e;
    }

    public int y() {
        return this.f26178c;
    }

    public String z() {
        if (this.A == null) {
            b();
        }
        return this.A;
    }

    public e(String str, String str2, b0 b0Var) {
        int iF = b.f(str, 2, 5);
        this.f26176a = iF;
        if (iF != b.f(str2, 2, 5)) {
            throw new hj.a(hj.f.TLE_LINES_DO_NOT_REFER_TO_SAME_OBJECT, str, str2);
        }
        this.f26177b = str.charAt(7);
        this.f26178c = b.g(str, 9);
        this.f26179d = b.e(str, 11, 3);
        this.f26180e = str.substring(14, 17).trim();
        this.f26181f = b.e(str, 62, 1);
        this.f26182g = b.e(str, 64, 4);
        this.f26183h = new yj.b(new i(b.g(str, 18), b.e(str, 20, 3)), new w(new y(((long) b.e(str, 24, 8)) * 864000, y.f32760g)), b0Var);
        this.f26184r = (b.d(str2, 52, 11) * 3.141592653589793d) / 43200.0d;
        this.f26185s = (b.d(str, 33, 10) * 3.141592653589793d) / 1.86624E9d;
        this.f26186t = (Double.parseDouble((str.substring(44, 45) + '.' + str.substring(45, 50) + 'e' + str.substring(50, 52)).replace(' ', '0')) * 3.141592653589793d) / 5.3747712E13d;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(".");
        sb2.append(str2.substring(26, 33).replace(' ', '0'));
        this.f26187u = Double.parseDouble(sb2.toString());
        this.f26188v = aj.d.Z(b.d(str2, 8, 8));
        this.f26189w = aj.d.Z(b.d(str2, 34, 8));
        this.f26190x = aj.d.Z(Double.parseDouble(str2.substring(17, 25).replace(' ', '0')));
        this.f26191y = aj.d.Z(b.d(str2, 43, 8));
        this.f26192z = b.e(str2, 63, 5);
        double d10 = Double.parseDouble((str.substring(53, 54) + '.' + str.substring(54, 59) + 'e' + str.substring(59, 61)).replace(' ', '0'));
        this.A = str;
        this.B = str2;
        this.C = b0Var;
        this.D = new a1("BSTAR", d10, E, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
    }

    public e(int i10, char c10, int i11, int i12, String str, int i13, int i14, yj.b bVar, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, int i15, double d18, b0 b0Var) {
        this.f26176a = i10;
        this.f26177b = c10;
        this.f26178c = i11;
        this.f26179d = i12;
        this.f26180e = str;
        this.f26181f = i13;
        this.f26182g = i14;
        this.f26183h = bVar;
        this.f26184r = d10;
        this.f26185s = d11;
        this.f26186t = d12;
        this.f26188v = d14;
        this.f26190x = aj.j.f(d16, 3.141592653589793d);
        this.f26187u = d13;
        this.f26189w = aj.j.f(d15, 3.141592653589793d);
        this.f26191y = aj.j.f(d17, 3.141592653589793d);
        this.f26192z = i15;
        this.A = null;
        this.B = null;
        this.C = b0Var;
        this.D = new a1("BSTAR", d18, E, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
    }
}
