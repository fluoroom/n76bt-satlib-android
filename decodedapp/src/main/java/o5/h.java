package o5;

import android.location.Location;
import com.dw.ht.Cfg;
import com.facebook.stetho.websocket.CloseCodes;
import com.google.android.gms.maps.model.LatLng;
import java.util.Arrays;
import java.util.Locale;
import rd.g0;
import rd.m;
import z4.w;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f23196a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final double f23197b = 0.9144d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final double f23198c = ((double) 1) / 0.9144d;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final double f23199d = 0.621371192d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final double f23200e = 1.609344d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f23201a = new a("auto", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f23202b = new a("kmph", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f23203c = new a("mps", 2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f23204d = new a("kmps", 3);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ a[] f23205e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ kd.a f23206f;

        static {
            a[] aVarArrA = a();
            f23205e = aVarArrA;
            f23206f = kd.b.a(aVarArrA);
        }

        private a(String str, int i10) {
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f23201a, f23202b, f23203c, f23204d};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f23205e.clone();
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23207a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.f23202b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.f23203c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.f23204d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f23207a = iArr;
        }
    }

    private h() {
    }

    public static final double a(w wVar, w wVar2, w wVar3) {
        double dA;
        double dC;
        double dC2;
        double d10;
        m.e(wVar, "p");
        m.e(wVar2, "lineBegin");
        m.e(wVar3, "lineEnd");
        double dA2 = wVar.a() - wVar2.a();
        double dC3 = wVar.c() - wVar2.c();
        double dA3 = wVar3.a() - wVar2.a();
        double dC4 = wVar3.c() - wVar2.c();
        double d11 = ((dA2 * dA3) + (dC3 * dC4)) / ((dA3 * dA3) + (dC4 * dC4));
        if (d11 < 0.0d || (wVar2.a() == wVar3.a() && wVar2.c() == wVar3.c())) {
            dA = wVar2.a();
            dC = wVar2.c();
        } else {
            if (d11 <= 1.0d) {
                double dA4 = wVar2.a() + (dA3 * d11);
                dC2 = wVar2.c() + (d11 * dC4);
                d10 = dA4;
                return b(wVar.a(), wVar.c(), d10, dC2);
            }
            dA = wVar3.a();
            dC = wVar3.c();
        }
        dC2 = dC;
        d10 = dA;
        return b(wVar.a(), wVar.c(), d10, dC2);
    }

    public static final float b(double d10, double d11, double d12, double d13) {
        double d14 = d10 * 0.01745329251994329d;
        double d15 = d11 * 0.01745329251994329d;
        double d16 = d12 * 0.01745329251994329d;
        double d17 = 0.01745329251994329d * d13;
        try {
            double dSin = Math.sin(d14);
            double dSin2 = Math.sin(d15);
            double dCos = Math.cos(d14);
            double dCos2 = Math.cos(d15);
            double dSin3 = Math.sin(d16);
            double dSin4 = Math.sin(d17);
            double dCos3 = Math.cos(d16);
            double dCos4 = Math.cos(d17);
            double[] dArr = {dCos * dCos2, dCos2 * dSin, dSin2};
            double[] dArr2 = {dCos3 * dCos4, dCos4 * dSin3, dSin4};
            double d18 = dArr[0];
            double d19 = dArr2[0];
            double d20 = (d18 - d19) * (d18 - d19);
            double d21 = dArr[1];
            double d22 = dArr2[1];
            double d23 = d20 + ((d21 - d22) * (d21 - d22));
            double d24 = dArr[2];
            double d25 = dArr2[2];
            return (float) (Math.asin(Math.sqrt(d23 + ((d24 - d25) * (d24 - d25))) / 2.0d) * 1.27420015798544E7d);
        } catch (Throwable th2) {
            th2.printStackTrace();
            return 0.0f;
        }
    }

    public static final float c(LatLng latLng, LatLng latLng2) {
        m.e(latLng, "start");
        m.e(latLng2, "end");
        return b(latLng.f7321b, latLng.f7320a, latLng2.f7321b, latLng2.f7320a);
    }

    public static final String d(double d10) {
        if (Cfg.f5482d) {
            if (d10 >= 1000.0d) {
                g0 g0Var = g0.f25951a;
                String str = String.format(Locale.ENGLISH, "%.2fkm", Arrays.copyOf(new Object[]{Double.valueOf(d10 / ((double) CloseCodes.NORMAL_CLOSURE))}, 1));
                m.d(str, "format(...)");
                return str;
            }
            g0 g0Var2 = g0.f25951a;
            String str2 = String.format(Locale.ENGLISH, "%.0fm", Arrays.copyOf(new Object[]{Double.valueOf(d10)}, 1));
            m.d(str2, "format(...)");
            return str2;
        }
        if (!Cfg.O().getImperialUnits()) {
            if (d10 >= 10000.0d) {
                g0 g0Var3 = g0.f25951a;
                String str3 = String.format(Locale.ENGLISH, "%.1fkm", Arrays.copyOf(new Object[]{Double.valueOf(d10 / ((double) CloseCodes.NORMAL_CLOSURE))}, 1));
                m.d(str3, "format(...)");
                return str3;
            }
            if (d10 >= 1000.0d) {
                g0 g0Var4 = g0.f25951a;
                String str4 = String.format(Locale.ENGLISH, "%.2fkm", Arrays.copyOf(new Object[]{Double.valueOf(d10 / ((double) CloseCodes.NORMAL_CLOSURE))}, 1));
                m.d(str4, "format(...)");
                return str4;
            }
            g0 g0Var5 = g0.f25951a;
            String str5 = String.format(Locale.ENGLISH, "%.0fm", Arrays.copyOf(new Object[]{Double.valueOf(d10)}, 1));
            m.d(str5, "format(...)");
            return str5;
        }
        double d11 = f23198c * d10;
        if (d11 >= 17600.0d) {
            g0 g0Var6 = g0.f25951a;
            String str6 = String.format(Locale.ENGLISH, "%.1fmi", Arrays.copyOf(new Object[]{Double.valueOf(d11 / ((double) 1760))}, 1));
            m.d(str6, "format(...)");
            return str6;
        }
        if (d11 >= 1760.0d) {
            g0 g0Var7 = g0.f25951a;
            String str7 = String.format(Locale.ENGLISH, "%.2fmi", Arrays.copyOf(new Object[]{Double.valueOf(d11 / ((double) 1760))}, 1));
            m.d(str7, "format(...)");
            return str7;
        }
        g0 g0Var8 = g0.f25951a;
        String str8 = String.format(Locale.ENGLISH, "%.0fyd", Arrays.copyOf(new Object[]{Double.valueOf(d10)}, 1));
        m.d(str8, "format(...)");
        return str8;
    }

    public static final String e(float f10) {
        return d(f10);
    }

    public static final String f(int i10) {
        return d(i10);
    }

    public static final String i(double d10) {
        double dAbs = Math.abs(d10);
        g0 g0Var = g0.f25951a;
        String str = String.format(Locale.ENGLISH, "%d°%06.3f'%s", Arrays.copyOf(new Object[]{Integer.valueOf((int) dAbs), Double.valueOf((dAbs % ((double) 1)) * ((double) 60)), d10 >= 0.0d ? "N" : "S"}, 3));
        m.d(str, "format(...)");
        return str;
    }

    public static final String j(double d10) {
        double dAbs = Math.abs(d10);
        g0 g0Var = g0.f25951a;
        double d11 = 1;
        double d12 = 60;
        String str = String.format(Locale.ENGLISH, "%d°%02d'%05.2f\"%s", Arrays.copyOf(new Object[]{Integer.valueOf((int) dAbs), Integer.valueOf((int) ((dAbs % d11) * d12)), Double.valueOf(((dAbs * d12) % d11) * d12), d10 >= 0.0d ? "N" : "S"}, 4));
        m.d(str, "format(...)");
        return str;
    }

    public static final String k(double d10) {
        double dAbs = Math.abs(d10);
        g0 g0Var = g0.f25951a;
        String str = String.format(Locale.ENGLISH, "%d°%06.3f'%s", Arrays.copyOf(new Object[]{Integer.valueOf((int) dAbs), Double.valueOf((dAbs % ((double) 1)) * ((double) 60)), d10 >= 0.0d ? "E" : "W"}, 3));
        m.d(str, "format(...)");
        return str;
    }

    public static final String l(double d10) {
        double dAbs = Math.abs(d10);
        g0 g0Var = g0.f25951a;
        double d11 = 1;
        double d12 = 60;
        String str = String.format(Locale.ENGLISH, "%d°%02d'%05.2f\"%s", Arrays.copyOf(new Object[]{Integer.valueOf((int) dAbs), Integer.valueOf((int) ((dAbs % d11) * d12)), Double.valueOf(((dAbs * d12) % d11) * d12), d10 >= 0.0d ? "E" : "W"}, 4));
        m.d(str, "format(...)");
        return str;
    }

    public static final String m(double d10) {
        return o(d10, null, 2, null);
    }

    public static final String n(double d10, a aVar) {
        m.e(aVar, "unit");
        if (d10 == 0.0d || Math.abs(d10) > Double.MAX_VALUE) {
            return null;
        }
        double d11 = 3.6d * d10;
        int i10 = b.f23207a[aVar.ordinal()];
        if (i10 == 1) {
            g0 g0Var = g0.f25951a;
            String str = String.format(Locale.getDefault(), "%.1fkm/h", Arrays.copyOf(new Object[]{Double.valueOf(d11)}, 1));
            m.d(str, "format(...)");
            return str;
        }
        if (i10 == 2) {
            g0 g0Var2 = g0.f25951a;
            String str2 = String.format(Locale.getDefault(), "%.0fm/s", Arrays.copyOf(new Object[]{Double.valueOf(d10)}, 1));
            m.d(str2, "format(...)");
            return str2;
        }
        if (i10 == 3) {
            g0 g0Var3 = g0.f25951a;
            String str3 = String.format(Locale.getDefault(), "%.3fkm/s", Arrays.copyOf(new Object[]{Double.valueOf(d10 / ((double) CloseCodes.NORMAL_CLOSURE))}, 1));
            m.d(str3, "format(...)");
            return str3;
        }
        if (Math.abs(d11) < 3600.0d) {
            g0 g0Var4 = g0.f25951a;
            String str4 = String.format(Locale.getDefault(), "%.1fkm/h", Arrays.copyOf(new Object[]{Double.valueOf(d11)}, 1));
            m.d(str4, "format(...)");
            return str4;
        }
        g0 g0Var5 = g0.f25951a;
        String str5 = String.format(Locale.getDefault(), "%.3fkm/s", Arrays.copyOf(new Object[]{Double.valueOf(d10 / ((double) CloseCodes.NORMAL_CLOSURE))}, 1));
        m.d(str5, "format(...)");
        return str5;
    }

    public static /* synthetic */ String o(double d10, a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            aVar = a.f23201a;
        }
        return n(d10, aVar);
    }

    public static final String p(Location location, int i10) {
        m.e(location, "loc");
        if (i10 == -1) {
            return p(location, 1) + " alt=" + ((int) location.getAltitude()) + " speed=" + location.getSpeed() + " bearing=" + location.getBearing() + " acc=" + location.getAccuracy() + " time=" + location.getTime();
        }
        if (i10 == 0) {
            g0 g0Var = g0.f25951a;
            String str = String.format(Locale.US, "%.5f %.5f", Arrays.copyOf(new Object[]{Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude())}, 2));
            m.d(str, "format(...)");
            return str;
        }
        if (i10 == 1) {
            return i(location.getLatitude()) + ' ' + k(location.getLongitude());
        }
        if (i10 != 2) {
            throw new RuntimeException();
        }
        return j(location.getLatitude()) + ' ' + l(location.getLongitude());
    }

    public static final String q(LatLng latLng, int i10) {
        m.e(latLng, "loc");
        if (i10 == 1) {
            return i(latLng.f7320a) + ' ' + k(latLng.f7321b);
        }
        if (i10 != 2) {
            throw new RuntimeException();
        }
        return j(latLng.f7320a) + ' ' + l(latLng.f7321b);
    }

    public final double g() {
        return f23199d;
    }

    public final double h() {
        return f23200e;
    }
}
