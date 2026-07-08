package rd;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i0 implements yd.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f25952a = new a(null);

    public static final class a {

        /* JADX INFO: renamed from: rd.i0$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0357a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f25953a;

            static {
                int[] iArr = new int[yd.p.values().length];
                try {
                    iArr[yd.p.f32530a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[yd.p.f32531b.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[yd.p.f32532c.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f25953a = iArr;
            }
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final String a(yd.n nVar) {
            m.e(nVar, "typeParameter");
            StringBuilder sb2 = new StringBuilder();
            int i10 = C0357a.f25953a[nVar.n().ordinal()];
            if (i10 == 1) {
                dd.d0 d0Var = dd.d0.f10897a;
            } else if (i10 == 2) {
                sb2.append("in ");
            } else {
                if (i10 != 3) {
                    throw new dd.o();
                }
                sb2.append("out ");
            }
            sb2.append(nVar.getName());
            return sb2.toString();
        }

        private a() {
        }
    }
}
