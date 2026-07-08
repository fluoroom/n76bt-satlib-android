package dd;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class l {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10908a;

        static {
            int[] iArr = new int[n.values().length];
            try {
                iArr[n.f10909a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n.f10910b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[n.f10911c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f10908a = iArr;
        }
    }

    public static j a(n nVar, qd.a aVar) {
        rd.m.e(nVar, "mode");
        rd.m.e(aVar, "initializer");
        int i10 = a.f10908a[nVar.ordinal()];
        int i11 = 2;
        if (i10 == 1) {
            rd.h hVar = null;
            return new u(aVar, hVar, i11, hVar);
        }
        if (i10 == 2) {
            return new t(aVar);
        }
        if (i10 == 3) {
            return new e0(aVar);
        }
        throw new o();
    }

    public static j b(qd.a aVar) {
        rd.m.e(aVar, "initializer");
        rd.h hVar = null;
        return new u(aVar, hVar, 2, hVar);
    }
}
