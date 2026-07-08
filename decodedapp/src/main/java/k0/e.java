package k0;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k0.d f18908a = new C0248e(null, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k0.d f18909b = new C0248e(null, true);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k0.d f18910c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k0.d f18911d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k0.d f18912e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final k0.d f18913f;

    private static class a implements c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final a f18914b = new a(true);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f18915a;

        private a(boolean z10) {
            this.f18915a = z10;
        }

        @Override // k0.e.c
        public int a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            boolean z10 = false;
            while (i10 < i12) {
                int iA = e.a(Character.getDirectionality(charSequence.charAt(i10)));
                if (iA != 0) {
                    if (iA != 1) {
                        continue;
                        i10++;
                    } else if (!this.f18915a) {
                        return 1;
                    }
                } else if (this.f18915a) {
                    return 0;
                }
                z10 = true;
                i10++;
            }
            if (z10) {
                return this.f18915a ? 1 : 0;
            }
            return 2;
        }
    }

    private static class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final b f18916a = new b();

        private b() {
        }

        @Override // k0.e.c
        public int a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            int iB = 2;
            while (i10 < i12 && iB == 2) {
                iB = e.b(Character.getDirectionality(charSequence.charAt(i10)));
                i10++;
            }
            return iB;
        }
    }

    private interface c {
        int a(CharSequence charSequence, int i10, int i11);
    }

    private static abstract class d implements k0.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f18917a;

        d(c cVar) {
            this.f18917a = cVar;
        }

        private boolean b(CharSequence charSequence, int i10, int i11) {
            int iA = this.f18917a.a(charSequence, i10, i11);
            if (iA == 0) {
                return true;
            }
            if (iA != 1) {
                return a();
            }
            return false;
        }

        protected abstract boolean a();

        @Override // k0.d
        public boolean isRtl(CharSequence charSequence, int i10, int i11) {
            if (charSequence == null || i10 < 0 || i11 < 0 || charSequence.length() - i11 < i10) {
                throw new IllegalArgumentException();
            }
            return this.f18917a == null ? a() : b(charSequence, i10, i11);
        }
    }

    /* JADX INFO: renamed from: k0.e$e, reason: collision with other inner class name */
    private static class C0248e extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f18918b;

        C0248e(c cVar, boolean z10) {
            super(cVar);
            this.f18918b = z10;
        }

        @Override // k0.e.d
        protected boolean a() {
            return this.f18918b;
        }
    }

    private static class f extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final f f18919b = new f();

        f() {
            super(null);
        }

        @Override // k0.e.d
        protected boolean a() {
            return k0.f.a(Locale.getDefault()) == 1;
        }
    }

    static {
        b bVar = b.f18916a;
        f18910c = new C0248e(bVar, false);
        f18911d = new C0248e(bVar, true);
        f18912e = new C0248e(a.f18914b, false);
        f18913f = f.f18919b;
    }

    static int a(int i10) {
        if (i10 != 0) {
            return (i10 == 1 || i10 == 2) ? 0 : 2;
        }
        return 1;
    }

    static int b(int i10) {
        if (i10 != 0) {
            if (i10 == 1 || i10 == 2) {
                return 0;
            }
            switch (i10) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
