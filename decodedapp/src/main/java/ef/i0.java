package ef;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import eg.m2;

/* JADX INFO: loaded from: classes3.dex */
public final class i0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f11994k = new a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final i0 f11995l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final i0 f11996m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final i0 f11997n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final i0 f11998o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final i0 f11999p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final i0 f12000q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final i0 f12001r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final i0 f12002s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final i0 f12003t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f12004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f12005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f12006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f12007d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f12008e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final i0 f12009f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f12010g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final i0 f12011h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final i0 f12012i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f12013j;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        private a() {
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12014a;

        static {
            int[] iArr = new int[m2.values().length];
            try {
                iArr[m2.f12141f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m2.f12140e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f12014a = iArr;
        }
    }

    static {
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        i0 i0Var = new i0(z10, z11, z12, z13, z14, null, false, null, null, z15, 1023, null);
        f11995l = i0Var;
        i0 i0Var2 = new i0(false, false, z15, false, false, null, false, null, null, true, 511, null);
        f11996m = i0Var2;
        f11997n = new i0(false, true, false, false, false, null, false, null, null, false, 1021, null);
        f11998o = new i0(z10, z11, z12, z13, z14, i0Var, false, null, null, z15, 988, null);
        f11999p = new i0(false, false, z15, false, false, i0Var2, false, null, null, true, 476, null);
        rd.h hVar = null;
        boolean z16 = false;
        i0 i0Var3 = null;
        i0 i0Var4 = null;
        f12000q = new i0(z10, true, z12, z13, z14, i0Var, z16, i0Var3, i0Var4, z15, 988, hVar);
        boolean z17 = false;
        boolean z18 = true;
        f12001r = new i0(z10, z17, z12, z18, z14, i0Var, z16, i0Var3, i0Var4, z15, 983, hVar);
        f12002s = new i0(z10, z17, z12, z18, z14, i0Var, z16, i0Var3, i0Var4, z15, 919, hVar);
        f12003t = new i0(z10, z17, true, false, z14, i0Var, z16, i0Var3, i0Var4, z15, 984, hVar);
    }

    public i0(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, i0 i0Var, boolean z15, i0 i0Var2, i0 i0Var3, boolean z16) {
        this.f12004a = z10;
        this.f12005b = z11;
        this.f12006c = z12;
        this.f12007d = z13;
        this.f12008e = z14;
        this.f12009f = i0Var;
        this.f12010g = z15;
        this.f12011h = i0Var2;
        this.f12012i = i0Var3;
        this.f12013j = z16;
    }

    public final boolean a() {
        return this.f12010g;
    }

    public final boolean b() {
        return this.f12013j;
    }

    public final boolean c() {
        return this.f12005b;
    }

    public final boolean d() {
        return this.f12004a;
    }

    public final boolean e() {
        return this.f12006c;
    }

    public final i0 f(m2 m2Var, boolean z10) {
        rd.m.e(m2Var, "effectiveVariance");
        if (!z10 || !this.f12006c) {
            int i10 = b.f12014a[m2Var.ordinal()];
            if (i10 == 1) {
                i0 i0Var = this.f12011h;
                if (i0Var != null) {
                    return i0Var;
                }
            } else if (i10 != 2) {
                i0 i0Var2 = this.f12009f;
                if (i0Var2 != null) {
                    return i0Var2;
                }
            } else {
                i0 i0Var3 = this.f12012i;
                if (i0Var3 != null) {
                    return i0Var3;
                }
            }
        }
        return this;
    }

    public final i0 g() {
        return new i0(this.f12004a, true, this.f12006c, this.f12007d, this.f12008e, this.f12009f, this.f12010g, this.f12011h, this.f12012i, false, WXMediaMessage.TITLE_LENGTH_LIMIT, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ i0(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, i0 i0Var, boolean z15, i0 i0Var2, i0 i0Var3, boolean z16, int i10, rd.h hVar) {
        z10 = (i10 & 1) != 0 ? true : z10;
        z11 = (i10 & 2) != 0 ? true : z11;
        z12 = (i10 & 4) != 0 ? false : z12;
        z13 = (i10 & 8) != 0 ? false : z13;
        z14 = (i10 & 16) != 0 ? false : z14;
        i0Var = (i10 & 32) != 0 ? null : i0Var;
        this(z10, z11, z12, z13, z14, i0Var, (i10 & 64) != 0 ? true : z15, (i10 & 128) != 0 ? i0Var : i0Var2, (i10 & 256) != 0 ? i0Var : i0Var3, (i10 & WXMediaMessage.TITLE_LENGTH_LIMIT) != 0 ? false : z16);
    }
}
