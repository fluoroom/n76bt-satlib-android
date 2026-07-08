package w4;

import com.benshikj.ht.R;
import com.dw.ht.Main;
import rd.h;
import rd.m;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0413c f31091e = new C0413c(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Integer[] f31092f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Integer[] f31093g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f31094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f31095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f31096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f31097d;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f31123a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0412a f31098b = new C0412a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final a f31099c = new a(0);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final a f31100d = new a(1);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final a f31101e = new a(2);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final a f31102f = new a(3);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final a f31103g = new a(4);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final a f31104h = new a(5);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final a f31105i = new a(6);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final a f31106j = new a(7);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final a f31107k = new a(8);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final a f31108l = new a(9);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final a f31109m = new a(10);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final a f31110n = new a(11);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final a f31111o = new a(12);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final a f31112p = new a(13);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final a f31113q = new a(14);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final a f31114r = new a(15);

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static final a f31115s = new a(16);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final a f31116t = new a(17);

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private static final a f31117u = new a(18);

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private static final a f31118v = new a(19);

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private static final a f31119w = new a(20);

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private static final a f31120x = new a(21);

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private static final a f31121y = new a(22);

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private static final a f31122z = new a(23);
        private static final a A = new a(65535);

        /* JADX INFO: renamed from: w4.c$a$a, reason: collision with other inner class name */
        public static final class C0412a {
            public /* synthetic */ C0412a(h hVar) {
                this();
            }

            public final a a() {
                return a.f31099c;
            }

            public final a b() {
                return a.f31108l;
            }

            public final a c(int i10) {
                return i10 <= 0 ? a() : new a(i10, null);
            }

            private C0412a() {
            }
        }

        public /* synthetic */ a(int i10, h hVar) {
            this(i10);
        }

        public final int c() {
            return this.f31123a;
        }

        public final int d() {
            return this.f31123a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f31123a == ((a) obj).f31123a;
        }

        public int hashCode() {
            return this.f31123a;
        }

        private a(int i10) {
            this.f31123a = i10;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f31124a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f31125b = new b("INVALID", 0);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f31126c = new b("SHORT", 1);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f31127d = new b("LONG", 2);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final b f31128e = new b("VERY_LONG", 3);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f31129f = new b("DOUBLE", 4);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f31130g = new b("REPEAT", 5);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final b f31131h = new b("LOW_TO_HIGH", 6);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final b f31132r = new b("HIGH_TO_LOW", 7);

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final b f31133s = new b("SHORT_SINGLE", 8);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final b f31134t = new b("LONG_RELEASE", 9);

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final b f31135u = new b("VERY_LONG_RELEASE", 10);

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final b f31136v = new b("VERY_VERY_LONG", 11);

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final b f31137w = new b("VERY_VERY_LONG_RELEASE", 12);

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final b f31138x = new b("TRIPLE", 13);

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private static final /* synthetic */ b[] f31139y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private static final /* synthetic */ kd.a f31140z;

        public static final class a {
            public /* synthetic */ a(h hVar) {
                this();
            }

            public final b a(int i10) {
                return (i10 < 0 || i10 >= b.d().size()) ? b.f31125b : (b) b.d().get(i10);
            }

            private a() {
            }
        }

        static {
            b[] bVarArrA = a();
            f31139y = bVarArrA;
            f31140z = kd.b.a(bVarArrA);
            f31124a = new a(null);
        }

        private b(String str, int i10) {
        }

        private static final /* synthetic */ b[] a() {
            return new b[]{f31125b, f31126c, f31127d, f31128e, f31129f, f31130g, f31131h, f31132r, f31133s, f31134t, f31135u, f31136v, f31137w, f31138x};
        }

        public static kd.a d() {
            return f31140z;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f31139y.clone();
        }
    }

    /* JADX INFO: renamed from: w4.c$c, reason: collision with other inner class name */
    public static final class C0413c {
        public /* synthetic */ C0413c(h hVar) {
            this();
        }

        private final int c(a aVar) {
            return aVar.c() < c.f31093g.length ? c.f31093g[aVar.c()].intValue() : R.string.unknown;
        }

        public final c[] a(byte[] bArr, int i10, int i11) {
            m.e(bArr, "data");
            c[] cVarArr = new c[(i11 - i10) / 2];
            int i12 = 0;
            while (i10 < i11 - 1) {
                cVarArr[i12] = new c(bArr, i10);
                i10 += 2;
                i12++;
            }
            return cVarArr;
        }

        public final String b(a aVar) {
            String string;
            m.e(aVar, "action");
            int iC = c(aVar);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Main.f5555g.getString(iC));
            if (aVar.c() < c.f31093g.length) {
                string = "";
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append('(');
                sb3.append(aVar.c());
                sb3.append(')');
                string = sb3.toString();
            }
            sb2.append(string);
            return sb2.toString();
        }

        public final int d(b bVar) {
            m.e(bVar, "bt");
            return bVar.ordinal() < c.f31092f.length ? c.f31092f[bVar.ordinal()].intValue() : R.string.unknown;
        }

        private C0413c() {
        }
    }

    static {
        Integer numValueOf = Integer.valueOf(R.string.disable);
        Integer numValueOf2 = Integer.valueOf(R.string.unknown);
        f31092f = new Integer[]{numValueOf, numValueOf2, Integer.valueOf(R.string.bt_long), numValueOf2, Integer.valueOf(R.string.bt_double_click), numValueOf2, Integer.valueOf(R.string.bt_press_down), numValueOf2, Integer.valueOf(R.string.bt_short_single), numValueOf2, numValueOf2, numValueOf2, numValueOf2};
        f31093g = new Integer[]{numValueOf, Integer.valueOf(R.string.alarm), Integer.valueOf(R.string.alarm_and_mute), Integer.valueOf(R.string.toggle_offline), Integer.valueOf(R.string.toggle_radio_tx), Integer.valueOf(R.string.toggle_tx_power), Integer.valueOf(R.string.toggle_fm), Integer.valueOf(R.string.prev_channel), Integer.valueOf(R.string.next_channel), Integer.valueOf(R.string.t_call), Integer.valueOf(R.string.prev_region), Integer.valueOf(R.string.next_region), Integer.valueOf(R.string.toggle_ch_scan), Integer.valueOf(R.string.main_ptt), Integer.valueOf(R.string.sub_ptt), Integer.valueOf(R.string.toggle_monitor), Integer.valueOf(R.string.bt_pairing), Integer.valueOf(R.string.toggle_double_ch), Integer.valueOf(R.string.toggle_ab_ch), Integer.valueOf(R.string.sendLocation), Integer.valueOf(R.string.one_click_link), Integer.valueOf(R.string.vol_down), Integer.valueOf(R.string.vol_up), Integer.valueOf(R.string.toggle_mute), Integer.valueOf(R.string.toggle_vox), Integer.valueOf(R.string.toggle_kiss), Integer.valueOf(R.string.release_ptt), Integer.valueOf(R.string.toggle_vfo), Integer.valueOf(R.string.toggle_rev), Integer.valueOf(R.string.squelch_up), Integer.valueOf(R.string.squelch_down), Integer.valueOf(R.string.show_squelch)};
    }

    public c(byte[] bArr, int i10) {
        m.e(bArr, "data");
        byte b10 = bArr[i10];
        this.f31094a = (b10 >> 4) & 15;
        this.f31095b = b.f31124a.a(b10 & 15);
        this.f31096c = a.f31098b.c(bArr[i10 + 1]);
    }

    public final a c() {
        return this.f31097d ? a.f31098b.a() : this.f31096c;
    }

    public final int d() {
        return this.f31094a;
    }

    public final b e() {
        return this.f31095b;
    }

    public final boolean f() {
        return this.f31097d;
    }

    public final void g(a aVar) {
        m.e(aVar, "<set-?>");
        this.f31096c = aVar;
    }

    public final void h(boolean z10) {
        this.f31097d = z10;
    }
}
