package nd;

import vd.c;

/* JADX INFO: loaded from: classes3.dex */
public class a extends md.a {

    /* JADX INFO: renamed from: nd.a$a, reason: collision with other inner class name */
    private static final class C0302a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0302a f22665a = new C0302a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Integer f22666b;

        static {
            Object obj;
            Integer num = null;
            try {
                obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Throwable unused) {
            }
            Integer num2 = obj instanceof Integer ? (Integer) obj : null;
            if (num2 != null && num2.intValue() > 0) {
                num = num2;
            }
            f22666b = num;
        }

        private C0302a() {
        }
    }

    private final boolean c(int i10) {
        Integer num = C0302a.f22666b;
        return num == null || num.intValue() >= i10;
    }

    @Override // ld.a
    public c b() {
        return c(34) ? new wd.a() : super.b();
    }
}
