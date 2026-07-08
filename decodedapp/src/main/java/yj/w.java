package yj;

import java.io.IOException;
import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public class w implements Serializable, Comparable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final w f32743e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final w f32744f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final w f32745g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final ak.a f32746h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final ak.a[] f32747r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final long[] f32748s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final y[] f32749t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final Pattern f32750u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final y f32751v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f32752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f32753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final y f32754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f32755d;

    static {
        y yVar = y.f32756c;
        f32743e = new w(0, 0, yVar);
        f32744f = new w(12, 0, yVar);
        f32745g = new w(0, 0, y.f32768x);
        f32746h = new ak.a(2, true);
        f32747r = new ak.a[]{null, new ak.a(1, true), new ak.a(2, true), new ak.a(3, true), new ak.a(4, true), new ak.a(5, true), new ak.a(6, true), new ak.a(7, true), new ak.a(8, true), new ak.a(9, true), new ak.a(10, true), new ak.a(11, true), new ak.a(12, true), new ak.a(13, true), new ak.a(14, true), new ak.a(15, true), new ak.a(16, true), new ak.a(17, true), new ak.a(18, true)};
        f32748s = new long[]{1000000000000000000L, 100000000000000000L, 10000000000000000L, 1000000000000000L, 100000000000000L, 10000000000000L, 1000000000000L, 100000000000L, 10000000000L, 1000000000, 100000000, 10000000, 1000000, 100000, 10000, 1000, 100, 10, 1};
        f32749t = new y[]{new y(59L, 500000000000000000L), new y(59L, 950000000000000000L), new y(59L, 995000000000000000L), new y(59L, 999500000000000000L), new y(59L, 999950000000000000L), new y(59L, 999995000000000000L), new y(59L, 999999500000000000L), new y(59L, 999999950000000000L), new y(59L, 999999995000000000L), new y(59L, 999999999500000000L), new y(59L, 999999999950000000L), new y(59L, 999999999995000000L), new y(59L, 999999999999500000L), new y(59L, 999999999999950000L), new y(59L, 999999999999995000L), new y(59L, 999999999999999500L), new y(59L, 999999999999999950L), new y(59L, 999999999999999995L)};
        f32750u = Pattern.compile("^(\\d\\d):?(\\d\\d):?(\\d\\d(?:[.,]\\d+)?)?(?:Z|([-+]\\d\\d(?::?\\d\\d)?))?$");
        f32751v = new y(86340L, 0L);
    }

    public w(int i10, int i11, double d10) {
        this(i10, i11, new y(d10));
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(w wVar) {
        return j().compareTo(wVar.j());
    }

    public String d() {
        try {
            int iC = aj.d.c(this.f32755d) / 60;
            int iC2 = aj.d.c(this.f32755d) % 60;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f32755d < 0 ? '-' : '+');
            ak.a aVar = f32746h;
            aVar.a(sb2, iC);
            sb2.append(':');
            aVar.a(sb2, iC2);
            return sb2.toString();
        } catch (IOException e10) {
            throw new hj.e(e10);
        }
    }

    public int e() {
        return this.f32752a;
    }

    public boolean equals(Object obj) {
        try {
            w wVar = (w) obj;
            if (wVar != null && this.f32752a == wVar.f32752a && this.f32753b == wVar.f32753b && this.f32754c.compareTo(wVar.f32754c) == 0) {
                if (this.f32755d == wVar.f32755d) {
                    return true;
                }
            }
        } catch (ClassCastException unused) {
        }
        return false;
    }

    public int f() {
        return this.f32753b;
    }

    public int g() {
        return this.f32755d;
    }

    public double h() {
        return j().Q();
    }

    public int hashCode() {
        return ((this.f32752a << 16) ^ ((this.f32753b - this.f32755d) << 8)) ^ this.f32754c.hashCode();
    }

    public y i() {
        return this.f32754c;
    }

    public y j() {
        return new y((((long) (this.f32753b - this.f32755d)) * 60) + (((long) this.f32752a) * 3600), 0L).j(this.f32754c);
    }

    public String k() {
        String strL = l(18);
        int length = strL.length();
        do {
            length--;
            if (length <= 11) {
                break;
            }
        } while (strL.charAt(length) == '0');
        return strL.substring(0, length + 1);
    }

    String l(int i10) {
        try {
            StringBuilder sb2 = new StringBuilder();
            if (this.f32754c.A()) {
                w wVar = new w(this.f32752a, this.f32753b, this.f32754c.w(i10));
                ak.a aVar = f32746h;
                aVar.a(sb2, wVar.f32752a);
                sb2.append(':');
                aVar.a(sb2, wVar.f32753b);
                sb2.append(':');
                aVar.a(sb2, wVar.f32754c.x());
                if (i10 > 0) {
                    sb2.append('.');
                    ak.a[] aVarArr = f32747r;
                    int iE = aj.d.E(aVarArr.length - 1, i10);
                    aVarArr[iE].a(sb2, wVar.f32754c.v() / f32748s[iE]);
                }
            } else {
                ak.a aVar2 = f32746h;
                aVar2.a(sb2, this.f32752a);
                sb2.append(':');
                aVar2.a(sb2, this.f32753b);
                sb2.append(":NaN");
            }
            return sb2.toString();
        } catch (IOException e10) {
            throw new hj.e(e10);
        }
    }

    public String toString() {
        return k() + d();
    }

    public w(int i10, int i11, y yVar) {
        this(i10, i11, yVar, 0);
    }

    public w(int i10, int i11, y yVar, int i12) {
        if (i10 >= 0 && i10 <= 23 && i11 >= 0 && i11 <= 59 && yVar.x() >= 0 && yVar.x() < 62) {
            this.f32752a = i10;
            this.f32753b = i11;
            this.f32754c = yVar;
            this.f32755d = i12;
            return;
        }
        throw new hj.c(hj.f.NON_EXISTENT_HMS_TIME, Integer.valueOf(i10), Integer.valueOf(i11), Double.valueOf(yVar.Q()));
    }

    public w(double d10) {
        this(new y(d10));
    }

    public w(y yVar) {
        if (yVar.compareTo(y.f32756c) >= 0) {
            if (yVar.compareTo(y.f32766v) >= 0) {
                y yVar2 = y.f32767w;
                if (yVar.compareTo(yVar2) < 0) {
                    this.f32752a = 23;
                    this.f32753b = 59;
                    this.f32754c = yVar.O(f32751v);
                } else {
                    throw new hj.c(hj.f.OUT_OF_RANGE_SECONDS_NUMBER_DETAIL, Double.valueOf(yVar.Q()), 0, Long.valueOf(yVar2.x()));
                }
            } else {
                this.f32752a = ((int) yVar.x()) / 3600;
                this.f32753b = (((int) yVar.x()) % 3600) / 60;
                this.f32754c = yVar.O(new y((r2 * 3600) + (r1 * 60), 0L));
            }
            this.f32755d = 0;
            return;
        }
        throw new hj.c(hj.f.OUT_OF_RANGE_SECONDS_NUMBER_DETAIL, Double.valueOf(yVar.Q()), 0, Long.valueOf(y.f32767w.x()));
    }

    public w(y yVar, y yVar2, int i10) {
        this.f32755d = 0;
        if (yVar.D()) {
            this.f32752a = 0;
            this.f32753b = 0;
            this.f32754c = yVar;
            return;
        }
        y yVar3 = y.f32756c;
        if (yVar.compareTo(yVar3) < 0 || yVar.compareTo(y.f32766v) >= 0) {
            throw new hj.c(hj.f.OUT_OF_RANGE_SECONDS_NUMBER_DETAIL, Double.valueOf(yVar.Q()), 0, Double.valueOf(86400.0d));
        }
        int i11 = i10 - 60;
        if (yVar2.x() * ((long) i11) >= 0 && aj.d.d(yVar2.x()) <= aj.d.c(i11)) {
            int iX = (int) yVar.x();
            int i12 = iX / 3600;
            this.f32752a = i12;
            this.f32753b = (iX - (i12 * 3600)) / 60;
            y yVarJ = new y(r3 - (r7 * 60), yVar.v()).j(yVar2);
            if (yVarJ.compareTo(yVar3) < 0) {
                throw new hj.c(hj.f.OUT_OF_RANGE_SECONDS_NUMBER_DETAIL, yVarJ, 0, Integer.valueOf(i10));
            }
            if (yVarJ.x() < i10) {
                this.f32754c = yVarJ;
                return;
            } else {
                this.f32754c = new y(i10 - 1, 999999999999999999L);
                return;
            }
        }
        throw new hj.c(hj.f.OUT_OF_RANGE_SECONDS_NUMBER_DETAIL, yVar2, 0, Integer.valueOf(i11));
    }
}
