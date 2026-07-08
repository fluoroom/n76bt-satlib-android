package yj;

import androidx.appcompat.widget.ActivityChooserView;
import androidx.appcompat.widget.RtlSpacingHelper;
import java.io.IOException;
import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public class i implements Serializable, Comparable {
    private static final h C;
    private static final h D;
    private static final h E;
    private static final f F;
    private static final f G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f32674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f32675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f32676c;
    private static final ak.a A = new ak.a(4, true);
    private static final ak.a B = new ak.a(2, true);
    private static final Pattern H = Pattern.compile("^(-?\\d\\d\\d\\d)-?(\\d\\d)-?(\\d\\d)$");
    private static final Pattern I = Pattern.compile("^(-?\\d\\d\\d\\d)-?(\\d\\d\\d)$");
    private static final Pattern J = Pattern.compile("^(-?\\d\\d\\d\\d)-?W(\\d\\d)-?(\\d)$");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f32660d = new i(-4712, 1, 1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i f32661e = new i(1858, 11, 17);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final i f32662f = new i(1950, 1, 1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final i f32663g = new i(1958, 1, 1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final i f32664h = new i(1999, 8, 22);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final i f32665r = new i(1980, 1, 6);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final i f32666s = new i(1980, 1, 6);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final i f32667t = new i(1999, 8, 22);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final i f32668u = new i(2006, 1, 1);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final i f32669v = new i(1996, 1, 1);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final i f32670w = new i(2000, 1, 1);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final i f32671x = new i(1970, 1, 1);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final i f32672y = new i(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final i f32673z = new i(RtlSpacingHelper.UNDEFINED);

    private static class b implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final int[] f32677a = {0, 0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};

        private b() {
        }

        @Override // yj.i.f
        public int a(int i10, int i11) {
            return i11 + f32677a[i10];
        }

        @Override // yj.i.f
        public int b(int i10, int i11) {
            return i10 - f32677a[i11];
        }

        @Override // yj.i.f
        public int c(int i10) {
            if (i10 < 32) {
                return 1;
            }
            return ((i10 * 10) + 323) / 306;
        }
    }

    private static class c implements h {
        private c() {
        }

        @Override // yj.i.h
        public boolean a(int i10) {
            if (i10 % 4 == 0) {
                return i10 % 400 == 0 || i10 % 100 != 0;
            }
            return false;
        }

        @Override // yj.i.h
        public int b(int i10) {
            return ((((i10 * 365) + (i10 / 4)) - (i10 / 100)) + (i10 / 400)) - 730120;
        }

        @Override // yj.i.h
        public int c(int i10) {
            int i11 = (int) (((((long) i10) * 400) + 292194288) / 146097);
            return i10 <= b(i11 + (-1)) ? i11 - 1 : i11;
        }
    }

    private static class d implements h {
        private d() {
        }

        @Override // yj.i.h
        public boolean a(int i10) {
            return i10 % 4 == 0;
        }

        @Override // yj.i.h
        public int b(int i10) {
            return ((i10 * 365) + (i10 / 4)) - 730122;
        }

        @Override // yj.i.h
        public int c(int i10) {
            return (int) (((((long) i10) * 4) + 2921948) / 1461);
        }
    }

    private static class e implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final int[] f32678a = {0, 0, 31, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335};

        private e() {
        }

        @Override // yj.i.f
        public int a(int i10, int i11) {
            return i11 + f32678a[i10];
        }

        @Override // yj.i.f
        public int b(int i10, int i11) {
            return i10 - f32678a[i11];
        }

        @Override // yj.i.f
        public int c(int i10) {
            if (i10 < 32) {
                return 1;
            }
            return ((i10 * 10) + 313) / 306;
        }
    }

    private interface f {
        int a(int i10, int i11);

        int b(int i10, int i11);

        int c(int i10);
    }

    private static class g implements h {
        private g() {
        }

        @Override // yj.i.h
        public boolean a(int i10) {
            return i10 % 4 == 0;
        }

        @Override // yj.i.h
        public int b(int i10) {
            return ((i10 * 365) + ((i10 + 1) / 4)) - 730123;
        }

        @Override // yj.i.h
        public int c(int i10) {
            return (int) (-(((((long) i10) * (-4)) - 2920488) / 1461));
        }
    }

    private interface h {
        boolean a(int i10);

        int b(int i10);

        int c(int i10);
    }

    static {
        C = new g();
        D = new d();
        E = new c();
        F = new e();
        G = new b();
    }

    public i(int i10, int i11, int i12) {
        if (i11 < 1 || i11 > 12) {
            throw new hj.c(hj.f.NON_EXISTENT_MONTH, Integer.valueOf(i11));
        }
        this.f32674a = i10;
        this.f32675b = i11;
        this.f32676c = i12;
        i iVar = new i(f());
        if (i10 != iVar.f32674a || i11 != iVar.f32675b || i12 != iVar.f32676c) {
            throw new hj.c(hj.f.NON_EXISTENT_YEAR_MONTH_DAY, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(i iVar) {
        int iF = f();
        int iF2 = iVar.f();
        if (iF < iF2) {
            return -1;
        }
        return iF > iF2 ? 1 : 0;
    }

    public int d() {
        return this.f32676c;
    }

    public int e() {
        return f() - new i(this.f32674a - 1, 12, 31).f();
    }

    public boolean equals(Object obj) {
        try {
            i iVar = (i) obj;
            if (iVar != null && this.f32674a == iVar.f32674a && this.f32675b == iVar.f32675b) {
                if (this.f32676c == iVar.f32676c) {
                    return true;
                }
            }
        } catch (ClassCastException unused) {
        }
        return false;
    }

    public int f() {
        int i10;
        h hVar = E;
        int i11 = this.f32674a;
        if (i11 < 1583) {
            if (i11 < 1) {
                hVar = C;
            } else if (i11 < 1582 || (i10 = this.f32675b) < 10 || (i10 < 11 && this.f32676c < 5)) {
                hVar = D;
            }
        }
        return hVar.b(this.f32674a - 1) + (hVar.a(i11) ? F : G).a(this.f32675b, this.f32676c);
    }

    public int g() {
        return f() + 51544;
    }

    public int h() {
        return this.f32675b;
    }

    public int hashCode() {
        return ((this.f32674a << 16) ^ (this.f32675b << 8)) ^ this.f32676c;
    }

    public int i() {
        return this.f32674a;
    }

    public String toString() {
        try {
            StringBuilder sb2 = new StringBuilder();
            A.a(sb2, this.f32674a);
            sb2.append('-');
            ak.a aVar = B;
            aVar.a(sb2, this.f32675b);
            sb2.append('-');
            aVar.a(sb2, this.f32676c);
            return sb2.toString();
        } catch (IOException e10) {
            throw new hj.e(e10);
        }
    }

    public i(int i10, n nVar, int i11) {
        this(i10, nVar.getNumber(), i11);
    }

    public i(int i10, int i11) {
        this(f32670w, new i(i10 - 1, 12, 31).f() + i11);
        if (i11 != e()) {
            throw new hj.c(hj.f.NON_EXISTENT_DAY_NUMBER_IN_YEAR, Integer.valueOf(i11), Integer.valueOf(i10));
        }
    }

    public i(int i10) {
        h hVar = E;
        if (i10 < -152384) {
            if (i10 > -730122) {
                hVar = D;
            } else {
                hVar = C;
            }
        }
        int iC = hVar.c(i10);
        this.f32674a = iC;
        int iB = i10 - hVar.b(iC - 1);
        f fVar = hVar.a(iC) ? F : G;
        int iC2 = fVar.c(iB);
        this.f32675b = iC2;
        this.f32676c = fVar.b(iB, iC2);
    }

    public i(i iVar, int i10) {
        this(iVar.f() + i10);
    }
}
