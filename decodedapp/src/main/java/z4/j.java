package z4;

import com.benshikj.ht.R;
import com.dw.ht.Main;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f32937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f32938b = new j("Standard", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f32939c = new j("Satellite", 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j f32940d = new j("Terrain", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j f32941e = new j("SatelliteTianditu", 3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final j f32942f = new j("TerrainOpenTopoMap", 4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final j f32943g = new j("SatelliteNative", 5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ j[] f32944h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ kd.a f32945r;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        public final j a(int i10) {
            return (i10 < 0 || j.values().length <= i10) ? j.f32938b : j.values()[i10];
        }

        private a() {
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32946a;

        static {
            int[] iArr = new int[j.values().length];
            try {
                iArr[j.f32938b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j.f32939c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j.f32940d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[j.f32941e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[j.f32942f.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[j.f32943g.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f32946a = iArr;
        }
    }

    static {
        j[] jVarArrA = a();
        f32944h = jVarArrA;
        f32945r = kd.b.a(jVarArrA);
        f32937a = new a(null);
    }

    private j(String str, int i10) {
    }

    private static final /* synthetic */ j[] a() {
        return new j[]{f32938b, f32939c, f32940d, f32941e, f32942f, f32943g};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f32944h.clone();
    }

    public final i d() {
        switch (b.f32946a[ordinal()]) {
            case 1:
            case 2:
            case 4:
            case 6:
                return i.f32932c;
            case 3:
            case 5:
                return i.f32931b;
            default:
                throw new dd.o();
        }
    }

    public final CharSequence e() {
        int i10;
        Main main = Main.f5555g;
        switch (b.f32946a[ordinal()]) {
            case 1:
                i10 = R.string.map;
                break;
            case 2:
                i10 = R.string.satelliteGoogle;
                break;
            case 3:
                i10 = R.string.terrainGoogle;
                break;
            case 4:
                i10 = R.string.satelliteTianditu;
                break;
            case 5:
                i10 = R.string.terrainOpenTopoMap;
                break;
            case 6:
                i10 = R.string.satellite;
                break;
            default:
                throw new dd.o();
        }
        String string = main.getString(i10);
        rd.m.d(string, "getString(...)");
        return string;
    }

    public final int f() {
        int i10 = b.f32946a[ordinal()];
        if (i10 != 4) {
            return i10 != 5 ? 20 : 17;
        }
        return 18;
    }

    public final CharSequence g() {
        if (b.f32946a[ordinal()] != 5) {
            return "";
        }
        CharSequence text = Main.f5555g.getText(R.string.signatureOpenTopoMap);
        rd.m.d(text, "getText(...)");
        return text;
    }

    public final boolean h() {
        return m.l(this);
    }

    public final boolean i() {
        int i10 = b.f32946a[ordinal()];
        return i10 == 2 || i10 == 4 || i10 == 6;
    }
}
