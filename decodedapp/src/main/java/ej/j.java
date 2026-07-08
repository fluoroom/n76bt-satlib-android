package ej;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicReference;
import kj.r0;
import org.msgpack.core.MessagePack;
import yj.b0;
import yj.c0;
import yj.w;
import zj.j1;
import zj.x0;
import zj.y0;

/* JADX INFO: loaded from: classes3.dex */
public class j extends gj.a implements ej.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final zj.j f12665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicReference f12666d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final e f12667e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final e f12668f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final c0 f12669g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final r0 f12670h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private yj.b f12671i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private yj.b f12672j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private double f12673k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private double f12674l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f12675m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f12676n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f12677o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f12678p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private double f12679q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private b0 f12680r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f12681s;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12682a;

        static {
            int[] iArr = new int[e.values().length];
            f12682a = iArr;
            try {
                iArr[e.SOLAR_SYSTEM_BARYCENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12682a[e.EARTH_MOON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12682a[e.EARTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12682a[e.MOON.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12682a[e.SUN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12682a[e.MERCURY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12682a[e.VENUS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f12682a[e.MARS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f12682a[e.JUPITER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f12682a[e.SATURN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f12682a[e.URANUS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f12682a[e.NEPTUNE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f12682a[e.PLUTO.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    private class b implements gj.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Map f12683a;

        private b() {
        }

        @Override // gj.e
        public void a(InputStream inputStream, String str) {
            byte[] bArrL = j.this.L(inputStream, str);
            byte[] bArr = new byte[bArrL.length];
            if (!j.this.M(inputStream, bArr, 0)) {
                throw new hj.a(hj.f.UNABLE_TO_READ_JPL_HEADER, str);
            }
            this.f12683a = j.this.J(bArrL, bArr);
        }

        public Map b() {
            return this.f12683a;
        }

        @Override // gj.e
        public boolean c() {
            return this.f12683a == null;
        }

        /* synthetic */ b(j jVar, a aVar) {
            this();
        }
    }

    private class c implements gj.e, j1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SortedSet f12685a = new TreeSet(new yj.g());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private yj.b f12686b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private yj.b f12687c;

        c() {
        }

        private yj.b d(byte[] bArr) {
            int i10 = 0;
            yj.b bVarB = j.this.B(bArr, 0);
            if (bVarB.compareTo(j.this.f12671i) < 0) {
                throw new hj.a(hj.f.OUT_OF_RANGE_EPHEMERIDES_DATE_BEFORE, bVarB, j.this.f12671i, j.this.f12672j, Double.valueOf(j.this.f12671i.X(bVarB)));
            }
            yj.b bVarB2 = j.this.B(bArr, 8);
            if (bVarB2.compareTo(j.this.f12672j) > 0) {
                throw new hj.a(hj.f.OUT_OF_RANGE_EPHEMERIDES_DATE_AFTER, bVarB2, j.this.f12671i, j.this.f12672j, Double.valueOf(bVarB2.X(j.this.f12672j)));
            }
            if (bVarB.compareTo(this.f12687c) > 0 || bVarB2.compareTo(this.f12686b) < 0) {
                return bVarB2;
            }
            int i11 = j.this.f12677o;
            int i12 = j.this.f12676n;
            int i13 = j.this.f12675m;
            double d10 = j.this.f12674l;
            yj.b bVar = bVarB;
            int i14 = 0;
            while (i14 < i11) {
                yj.b bVarA = i14 == i11 + (-1) ? bVarB2 : bVarB.a(((double) (i14 + 1)) * d10);
                double[] dArr = new double[i12];
                double[] dArr2 = new double[i12];
                double[] dArr3 = new double[i12];
                while (i10 < i12) {
                    int i15 = i10;
                    int i16 = ((((j.this.f12678p * i14) * i12) + i13) + i15) - 1;
                    dArr[i15] = j.this.f12679q * j.this.C(bArr, i16 * 8);
                    dArr2[i15] = j.this.f12679q * j.this.C(bArr, (i16 + i12) * 8);
                    dArr3[i15] = j.this.f12679q * j.this.C(bArr, (i16 + (i12 * 2)) * 8);
                    i10 = i15 + 1;
                    i11 = i11;
                }
                this.f12685a.add(new o(bVar, j.this.f12680r, d10, dArr, dArr2, dArr3));
                i14++;
                bVar = bVarA;
                i11 = i11;
                i10 = 0;
            }
            return bVarB;
        }

        @Override // gj.e
        public void a(InputStream inputStream, String str) {
            byte[] bArrL = j.this.L(inputStream, str);
            byte[] bArr = new byte[bArrL.length];
            if (!j.this.M(inputStream, bArr, 0)) {
                throw new hj.a(hj.f.UNABLE_TO_READ_JPL_HEADER, str);
            }
            if (j.this.f12666d.get() == null) {
                androidx.lifecycle.b.a(j.this.f12666d, null, j.this.J(bArrL, bArr));
            }
            double dC = j.this.C(bArrL, 2680) * 1000.0d;
            if (dC < 1.4E11d || dC > 1.6E11d) {
                throw new hj.a(hj.f.NOT_A_JPL_EPHEMERIDES_BINARY_FILE, str);
            }
            if (aj.d.b(j.this.F() - dC) >= 10.0d) {
                throw new hj.a(hj.f.INCONSISTENT_ASTRONOMICAL_UNIT_IN_FILES, Double.valueOf(j.this.F()), Double.valueOf(dC));
            }
            double dC2 = j.this.C(bArrL, 2688);
            if (dC2 < 80.0d || dC2 > 82.0d) {
                throw new hj.a(hj.f.NOT_A_JPL_EPHEMERIDES_BINARY_FILE, str);
            }
            if (aj.d.b(j.this.H() - dC2) >= 1.0E-5d) {
                throw new hj.a(hj.f.INCONSISTENT_EARTH_MOON_RATIO_IN_FILES, Double.valueOf(j.this.H()), Double.valueOf(dC2));
            }
            j.this.K(bArrL, str);
            if (j.this.f12671i.compareTo(this.f12687c) >= 0 || j.this.f12672j.compareTo(this.f12686b) <= 0) {
                return;
            }
            byte[] bArr2 = new byte[bArrL.length];
            while (j.this.M(inputStream, bArr2, 0) && d(bArr2).compareTo(this.f12687c) <= 0) {
            }
        }

        @Override // zj.j1
        public List b(yj.b bVar, yj.b bVar2) {
            try {
                this.f12685a.clear();
                if (bVar == null) {
                    this.f12686b = bVar2.a(-4320000.0d);
                    this.f12687c = bVar2.a(4320000.0d);
                } else if (bVar.compareTo(bVar2) <= 0) {
                    this.f12686b = bVar;
                    this.f12687c = bVar2;
                } else {
                    this.f12686b = bVar2;
                    this.f12687c = bVar;
                }
                if (j.this.d(this)) {
                    return new ArrayList(this.f12685a);
                }
                throw new hj.a(hj.f.NO_JPL_EPHEMERIDES_BINARY_FILES_FOUND, new Object[0]);
            } catch (hj.a e10) {
                throw new hj.g(e10);
            }
        }

        @Override // gj.e
        public boolean c() {
            if (j.this.f12667e == e.EARTH) {
                return false;
            }
            return this.f12685a.isEmpty() || ((o) this.f12685a.first()).getDate().compareTo(this.f12686b) >= 0 || ((o) this.f12685a.last()).getDate().compareTo(this.f12687c) <= 0;
        }
    }

    private class d implements f {
        private d() {
        }

        private o c(yj.b bVar) {
            try {
                return (o) j.this.f12665c.b(bVar).findFirst().get();
            } catch (hj.g e10) {
                o oVar = (o) j.this.f12665c.k();
                if (oVar.h(bVar)) {
                    return oVar;
                }
                throw e10;
            }
        }

        @Override // ej.j.f
        public xi.f a(yj.b bVar) {
            return c(bVar).b(bVar);
        }

        @Override // ej.j.f
        public y0 b(yj.b bVar) {
            return c(bVar).c(bVar);
        }

        /* synthetic */ d(j jVar, a aVar) {
            this();
        }
    }

    public enum e {
        SOLAR_SYSTEM_BARYCENTER,
        SUN,
        MERCURY,
        VENUS,
        EARTH_MOON,
        EARTH,
        MOON,
        MARS,
        JUPITER,
        SATURN,
        URANUS,
        NEPTUNE,
        PLUTO
    }

    public interface f {
        xi.f a(yj.b bVar);

        y0 b(yj.b bVar);
    }

    private static class g implements f {
        private g() {
        }

        @Override // ej.j.f
        public /* synthetic */ xi.f a(yj.b bVar) {
            return k.a(this, bVar);
        }

        @Override // ej.j.f
        public y0 b(yj.b bVar) {
            return y0.f33561d;
        }

        /* synthetic */ g(a aVar) {
            this();
        }
    }

    public j(String str, e eVar, gj.g gVar, c0 c0Var, r0 r0Var) {
        super(str, gVar);
        this.f12669g = c0Var;
        this.f12670h = r0Var;
        this.f12666d = new AtomicReference();
        this.f12667e = eVar;
        if (eVar == e.SOLAR_SYSTEM_BARYCENTER) {
            this.f12668f = e.EARTH_MOON;
        } else if (eVar == e.EARTH_MOON) {
            this.f12668f = e.MOON;
        } else {
            this.f12668f = eVar;
        }
        this.f12665c = new zj.j(2, x0.a(), Double.POSITIVE_INFINITY, 4320000.0d, new c());
        this.f12673k = Double.NaN;
        this.f12674l = Double.NaN;
    }

    private void A(byte[] bArr) {
        this.f12681s = true;
        if ((((long) D(bArr, 2840)) & 4294967295L) > 32768) {
            this.f12681s = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public yj.b B(byte[] bArr, int i10) {
        double dC = C(bArr, i10);
        int iU = (int) aj.d.u(dC);
        double d10 = ((dC + 0.5d) - ((double) iU)) * 86400.0d;
        if (d10 >= 86400.0d) {
            iU++;
            d10 -= 86400.0d;
        }
        return new yj.b(new yj.i(yj.i.f32660d, iU), new w(d10), this.f12680r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public double C(byte[] bArr, int i10) {
        long j10 = ((long) bArr[i10]) & 255;
        long j11 = ((long) bArr[i10 + 1]) & 255;
        long j12 = ((long) bArr[i10 + 2]) & 255;
        long j13 = ((long) bArr[i10 + 3]) & 255;
        long j14 = ((long) bArr[i10 + 4]) & 255;
        long j15 = ((long) bArr[i10 + 5]) & 255;
        long j16 = ((long) bArr[i10 + 6]) & 255;
        long j17 = ((long) bArr[i10 + 7]) & 255;
        return Double.longBitsToDouble(this.f12681s ? j17 | (j10 << 56) | (j11 << 48) | (j12 << 40) | (j13 << 32) | (j14 << 24) | (j15 << 16) | (j16 << 8) : (j17 << 56) | (j16 << 48) | (j15 << 40) | (j14 << 32) | (j13 << 24) | (j12 << 16) | (j11 << 8) | j10);
    }

    private int D(byte[] bArr, int i10) {
        int i11 = bArr[i10] & MessagePack.Code.EXT_TIMESTAMP;
        int i12 = bArr[i10 + 1] & MessagePack.Code.EXT_TIMESTAMP;
        int i13 = bArr[i10 + 2] & MessagePack.Code.EXT_TIMESTAMP;
        int i14 = bArr[i10 + 3] & MessagePack.Code.EXT_TIMESTAMP;
        return this.f12681s ? i14 | (i11 << 24) | (i12 << 16) | (i13 << 8) : (i14 << 24) | (i13 << 16) | (i12 << 8) | i11;
    }

    private String E(byte[] bArr, int i10, int i11) {
        return new String(bArr, i10, i11, StandardCharsets.US_ASCII).trim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map J(byte[] bArr, byte[] bArr2) {
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < 400; i10++) {
            String strE = E(bArr, (i10 * 6) + 252, 6);
            if (strE.length() == 0) {
                break;
            }
            map.put(strE, Double.valueOf(C(bArr2, i10 * 8)));
        }
        if (!map.containsKey("AU")) {
            map.put("AU", Double.valueOf(C(bArr, 2680)));
        }
        if (!map.containsKey("EMRAT")) {
            map.put("EMRAT", Double.valueOf(C(bArr, 2688)));
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K(byte[] bArr, String str) {
        int iD = D(bArr, 2840);
        this.f12678p = 3;
        this.f12679q = bk.k.f4185k.a(1.0d);
        this.f12680r = this.f12669g.d();
        if (iD == 100) {
            double dG = G("FORMAT");
            if (!Double.isNaN(dG) && ((int) aj.d.a(dG, 10.0d)) != 1) {
                this.f12678p = 6;
            }
            double dG2 = G("UNITE");
            if (!Double.isNaN(dG2) && ((int) dG2) == 0) {
                this.f12679q = F();
            }
            double dG3 = G("TIMESC");
            if (!Double.isNaN(dG3) && ((int) dG3) == 1) {
                this.f12680r = this.f12669g.a();
            }
        }
        this.f12671i = B(bArr, 2652);
        yj.b bVarB = B(bArr, 2660);
        this.f12672j = bVarB;
        boolean z10 = bVarB.compareTo(this.f12671i) > 0;
        for (int i10 = 0; i10 < 12; i10++) {
            int i11 = i10 * 12;
            int iD2 = D(bArr, i11 + 2696);
            int iD3 = D(bArr, i11 + 2700);
            int iD4 = D(bArr, i11 + 2704);
            z10 = z10 && iD2 >= 0 && iD3 >= 0 && iD4 >= 0;
            if ((i10 == 0 && this.f12668f == e.MERCURY) || ((i10 == 1 && this.f12668f == e.VENUS) || ((i10 == 2 && this.f12668f == e.EARTH_MOON) || ((i10 == 3 && this.f12668f == e.MARS) || ((i10 == 4 && this.f12668f == e.JUPITER) || ((i10 == 5 && this.f12668f == e.SATURN) || ((i10 == 6 && this.f12668f == e.URANUS) || ((i10 == 7 && this.f12668f == e.NEPTUNE) || ((i10 == 8 && this.f12668f == e.PLUTO) || ((i10 == 9 && this.f12668f == e.MOON) || (i10 == 10 && this.f12668f == e.SUN))))))))))) {
                this.f12675m = iD2;
                this.f12676n = iD3;
                this.f12677o = iD4;
            }
        }
        double dC = C(bArr, 2668);
        boolean z11 = z10 && dC > 0.0d && dC < 100.0d;
        this.f12674l = (dC / ((double) this.f12677o)) * 86400.0d;
        if (Double.isNaN(this.f12673k)) {
            this.f12673k = this.f12674l;
        } else {
            this.f12673k = aj.d.B(this.f12673k, this.f12674l);
        }
        if (!z11) {
            throw new hj.a(hj.f.NOT_A_JPL_EPHEMERIDES_BINARY_FILE, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public byte[] L(InputStream inputStream, String str) {
        byte[] bArr = new byte[2860];
        if (!M(inputStream, bArr, 0)) {
            throw new hj.a(hj.f.UNABLE_TO_READ_JPL_HEADER, str);
        }
        A(bArr);
        int iD = D(bArr, 2840) == 100 ? D(bArr, 2856) << 3 : z(bArr, str);
        if (iD <= 0) {
            throw new hj.a(hj.f.UNABLE_TO_READ_JPL_HEADER, str);
        }
        byte[] bArr2 = new byte[iD];
        System.arraycopy(bArr, 0, bArr2, 0, 2860);
        if (M(inputStream, bArr2, 2860)) {
            return bArr2;
        }
        throw new hj.a(hj.f.UNABLE_TO_READ_JPL_HEADER, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean M(InputStream inputStream, byte[] bArr, int i10) throws IOException {
        while (i10 != bArr.length) {
            int i11 = inputStream.read(bArr, i10, bArr.length - i10);
            if (i11 < 0) {
                return false;
            }
            i10 += i11;
        }
        return true;
    }

    private int z(byte[] bArr, String str) {
        int i10 = 0;
        boolean z10 = true;
        int i11 = 0;
        while (true) {
            if (i10 >= 12) {
                break;
            }
            int i12 = i10 != 11 ? 3 : 2;
            int i13 = i10 * 12;
            int iD = D(bArr, i13 + 2700);
            int iD2 = D(bArr, i13 + 2704);
            z10 = z10 && (iD >= 0 || iD2 >= 0);
            i11 += iD * iD2 * i12;
            i10++;
        }
        int iD3 = D(bArr, 2848);
        int iD4 = D(bArr, 2852);
        boolean z11 = z10 && (iD3 >= 0 || iD4 >= 0);
        int i14 = (i11 + (((iD3 * iD4) * 3) + 2)) << 3;
        if (!z11 || i14 <= 0) {
            throw new hj.a(hj.f.NOT_A_JPL_EPHEMERIDES_BINARY_FILE, str);
        }
        return i14;
    }

    public double F() {
        return bk.k.f4185k.a(G("AU"));
    }

    public double G(String... strArr) {
        Map mapB = (Map) this.f12666d.get();
        if (mapB == null) {
            b bVar = new b(this, null);
            if (!d(bVar)) {
                throw new hj.a(hj.f.NO_JPL_EPHEMERIDES_BINARY_FILES_FOUND, new Object[0]);
            }
            mapB = bVar.b();
            androidx.lifecycle.b.a(this.f12666d, null, mapB);
        }
        for (String str : strArr) {
            if (mapB.containsKey(str)) {
                return ((Double) mapB.get(str)).doubleValue();
            }
        }
        return Double.NaN;
    }

    public double H() {
        return G("EMRAT");
    }

    public double I(e eVar) {
        double dG;
        switch (a.f12682a[eVar.ordinal()]) {
            case 1:
                return I(e.SUN) + I(e.MERCURY) + I(e.VENUS) + I(e.EARTH_MOON) + I(e.MARS) + I(e.JUPITER) + I(e.SATURN) + I(e.URANUS) + I(e.NEPTUNE) + I(e.PLUTO);
            case 2:
                dG = G("GMB", "GM_EMB");
                break;
            case 3:
                return H() * I(e.MOON);
            case 4:
                return I(e.EARTH_MOON) / (H() + 1.0d);
            case 5:
                dG = G("GMS", "GM_Sun");
                break;
            case 6:
                dG = G("GM1", "GM_Mer");
                break;
            case 7:
                dG = G("GM2", "GM_Ven");
                break;
            case 8:
                dG = G("GM4", "GM_Mar");
                break;
            case 9:
                dG = G("GM5", "GM_Jup");
                break;
            case 10:
                dG = G("GM6", "GM_Sat");
                break;
            case 11:
                dG = G("GM7", "GM_Ura");
                break;
            case 12:
                dG = G("GM8", "GM_Nep");
                break;
            case 13:
                dG = G("GM9", "GM_Plu");
                break;
            default:
                throw new hj.e(null);
        }
        double dF = F();
        return (((dG * dF) * dF) * dF) / 7.46496E9d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v0, types: [ej.j$a] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    @Override // ej.d
    public ej.c b(String str) {
        r0 r0VarL;
        f dVar;
        double dH;
        double dI = I(this.f12667e);
        p pVarB = p.b(this.f12667e, this.f12669g);
        int i10 = a.f12682a[this.f12667e.ordinal()];
        ?? A = 0;
        A = 0;
        A = 0;
        A = 0;
        if (i10 != 1) {
            dH = 1.0d;
            if (i10 == 2) {
                dH = 1.0d / (H() + 1.0d);
                r0VarL = this.f12670h;
                dVar = new d(this, A);
            } else if (i10 == 3) {
                r0VarL = this.f12670h;
                dVar = new g(A);
            } else if (i10 != 4) {
                r0VarL = new j(f(), e.SOLAR_SYSTEM_BARYCENTER, e(), this.f12669g, this.f12670h).b("solar system barycenter").l();
                dVar = new d(this, A);
            } else {
                r0VarL = this.f12670h;
                dVar = new d(this, A);
            }
        } else {
            r0VarL = new j(f(), e.EARTH_MOON, e(), this.f12669g, this.f12670h).b("Earth-Moon barycenter").l();
            dVar = new d(this, A);
            dH = -1.0d;
            A = kj.j1.ICRF.a();
        }
        return new i(str, f(), this.f12667e, dVar, dI, dH, pVarB, r0VarL, A, null);
    }
}
