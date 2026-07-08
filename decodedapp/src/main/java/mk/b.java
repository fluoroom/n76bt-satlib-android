package mk;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22360a;

        static {
            int[] iArr = new int[fk.b.values().length];
            f22360a = iArr;
            try {
                iArr[fk.b.NAME_DESC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22360a[fk.b.SIZE_ASC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22360a[fk.b.SIZE_DESC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22360a[fk.b.DATE_ASC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22360a[fk.b.DATE_DESC.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static mk.a a(fk.b bVar) {
        int i10 = a.f22360a[bVar.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? new e() : new d() : new c() : new h() : new g() : new f();
    }
}
