package ag;

import eg.m2;
import gf.c;
import gf.r;
import gf.t;

/* JADX INFO: loaded from: classes3.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o0 f557a = new o0();

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f558a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f559b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f560c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f561d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f562e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int[] f563f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ int[] f564g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ int[] f565h;

        static {
            int[] iArr = new int[gf.l.values().length];
            try {
                iArr[gf.l.FINAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[gf.l.OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[gf.l.ABSTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[gf.l.SEALED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f558a = iArr;
            int[] iArr2 = new int[he.e0.values().length];
            try {
                iArr2[he.e0.f15259b.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[he.e0.f15261d.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[he.e0.f15262e.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[he.e0.f15260c.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            f559b = iArr2;
            int[] iArr3 = new int[gf.y.values().length];
            try {
                iArr3[gf.y.INTERNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[gf.y.PRIVATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[gf.y.PRIVATE_TO_THIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[gf.y.PROTECTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[gf.y.PUBLIC.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[gf.y.LOCAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            f560c = iArr3;
            int[] iArr4 = new int[c.EnumC0201c.values().length];
            try {
                iArr4[c.EnumC0201c.CLASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[c.EnumC0201c.INTERFACE.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[c.EnumC0201c.ENUM_CLASS.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[c.EnumC0201c.ENUM_ENTRY.ordinal()] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[c.EnumC0201c.ANNOTATION_CLASS.ordinal()] = 5;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr4[c.EnumC0201c.OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr4[c.EnumC0201c.COMPANION_OBJECT.ordinal()] = 7;
            } catch (NoSuchFieldError unused21) {
            }
            f561d = iArr4;
            int[] iArr5 = new int[he.f.values().length];
            try {
                iArr5[he.f.f15271b.ordinal()] = 1;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr5[he.f.f15272c.ordinal()] = 2;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr5[he.f.f15273d.ordinal()] = 3;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr5[he.f.f15274e.ordinal()] = 4;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr5[he.f.f15275f.ordinal()] = 5;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr5[he.f.f15276g.ordinal()] = 6;
            } catch (NoSuchFieldError unused27) {
            }
            f562e = iArr5;
            int[] iArr6 = new int[t.c.values().length];
            try {
                iArr6[t.c.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr6[t.c.OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr6[t.c.INV.ordinal()] = 3;
            } catch (NoSuchFieldError unused30) {
            }
            f563f = iArr6;
            int[] iArr7 = new int[r.b.c.values().length];
            try {
                iArr7[r.b.c.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr7[r.b.c.OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr7[r.b.c.INV.ordinal()] = 3;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr7[r.b.c.STAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused34) {
            }
            f564g = iArr7;
            int[] iArr8 = new int[m2.values().length];
            try {
                iArr8[m2.f12141f.ordinal()] = 1;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr8[m2.f12142g.ordinal()] = 2;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr8[m2.f12140e.ordinal()] = 3;
            } catch (NoSuchFieldError unused37) {
            }
            f565h = iArr8;
        }
    }

    private o0() {
    }

    public final he.f a(c.EnumC0201c enumC0201c) {
        switch (enumC0201c == null ? -1 : a.f561d[enumC0201c.ordinal()]) {
            case 1:
                return he.f.f15271b;
            case 2:
                return he.f.f15272c;
            case 3:
                return he.f.f15273d;
            case 4:
                return he.f.f15274e;
            case 5:
                return he.f.f15275f;
            case 6:
            case 7:
                return he.f.f15276g;
            default:
                return he.f.f15271b;
        }
    }

    public final he.e0 b(gf.l lVar) {
        int i10 = lVar == null ? -1 : a.f558a[lVar.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? he.e0.f15259b : he.e0.f15260c : he.e0.f15262e : he.e0.f15261d : he.e0.f15259b;
    }

    public final m2 c(r.b.c cVar) {
        rd.m.e(cVar, "projection");
        int i10 = a.f564g[cVar.ordinal()];
        if (i10 == 1) {
            return m2.f12141f;
        }
        if (i10 == 2) {
            return m2.f12142g;
        }
        if (i10 == 3) {
            return m2.f12140e;
        }
        if (i10 != 4) {
            throw new dd.o();
        }
        throw new IllegalArgumentException("Only IN, OUT and INV are supported. Actual argument: " + cVar);
    }

    public final m2 d(t.c cVar) {
        rd.m.e(cVar, "variance");
        int i10 = a.f563f[cVar.ordinal()];
        if (i10 == 1) {
            return m2.f12141f;
        }
        if (i10 == 2) {
            return m2.f12142g;
        }
        if (i10 == 3) {
            return m2.f12140e;
        }
        throw new dd.o();
    }
}
