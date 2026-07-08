package ig;

import eg.m2;

/* JADX INFO: loaded from: classes3.dex */
public abstract class s {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16118a;

        static {
            int[] iArr = new int[m2.values().length];
            try {
                iArr[m2.f12140e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m2.f12141f.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[m2.f12142g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f16118a = iArr;
        }
    }

    public static final v a(m2 m2Var) {
        rd.m.e(m2Var, "<this>");
        int i10 = a.f16118a[m2Var.ordinal()];
        if (i10 == 1) {
            return v.f16121d;
        }
        if (i10 == 2) {
            return v.f16119b;
        }
        if (i10 == 3) {
            return v.f16120c;
        }
        throw new dd.o();
    }
}
