package tg;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 extends Enum {

    /* JADX INFO: renamed from: a */
    public static final f0 f27809a = new f0("DEFAULT", 0);

    /* JADX INFO: renamed from: b */
    public static final f0 f27810b = new f0("LAZY", 1);

    /* JADX INFO: renamed from: c */
    public static final f0 f27811c = new f0("ATOMIC", 2);

    /* JADX INFO: renamed from: d */
    public static final f0 f27812d = new f0("UNDISPATCHED", 3);

    /* JADX INFO: renamed from: e */
    private static final /* synthetic */ f0[] f27813e;

    /* JADX INFO: renamed from: f */
    private static final /* synthetic */ kd.a f27814f;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f27815a;

        static {
            int[] iArr = new int[f0.values().length];
            try {
                iArr[f0.f27809a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f0.f27811c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f0.f27812d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[f0.f27810b.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f27815a = iArr;
        }
    }

    static {
        f0[] f0VarArrA = a();
        f27813e = f0VarArrA;
        f27814f = kd.b.a(f0VarArrA);
    }

    private f0(String str, int i10) {
        super(str, i10);
    }

    private static final /* synthetic */ f0[] a() {
        return new f0[]{f27809a, f27810b, f27811c, f27812d};
    }

    public static f0 valueOf(String str) {
        return (f0) Enum.valueOf(f0.class, str);
    }

    public static f0[] values() {
        return (f0[]) f27813e.clone();
    }

    public final void d(qd.p pVar, Object obj, hd.e eVar) {
        int i10 = a.f27815a[ordinal()];
        if (i10 == 1) {
            yg.a.c(pVar, obj, eVar);
            return;
        }
        if (i10 == 2) {
            hd.g.a(pVar, obj, eVar);
        } else if (i10 == 3) {
            yg.b.c(pVar, obj, eVar);
        } else if (i10 != 4) {
            throw new dd.o();
        }
    }

    public final boolean e() {
        return this == f27810b;
    }
}
