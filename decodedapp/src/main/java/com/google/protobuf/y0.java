package com.google.protobuf;

/* JADX INFO: loaded from: classes3.dex */
final class y0 implements i2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final k1 f10155b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k1 f10156a;

    class a implements k1 {
        a() {
        }

        @Override // com.google.protobuf.k1
        public j1 a(Class cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // com.google.protobuf.k1
        public boolean b(Class cls) {
            return false;
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f10157a;

        static {
            int[] iArr = new int[b2.values().length];
            f10157a = iArr;
            try {
                iArr[b2.PROTO3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private static class c implements k1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private k1[] f10158a;

        c(k1... k1VarArr) {
            this.f10158a = k1VarArr;
        }

        @Override // com.google.protobuf.k1
        public j1 a(Class cls) {
            for (k1 k1Var : this.f10158a) {
                if (k1Var.b(cls)) {
                    return k1Var.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        @Override // com.google.protobuf.k1
        public boolean b(Class cls) {
            for (k1 k1Var : this.f10158a) {
                if (k1Var.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public y0() {
        this(c());
    }

    private static boolean b(j1 j1Var) {
        return b.f10157a[j1Var.c().ordinal()] != 1;
    }

    private static k1 c() {
        return new c(i0.c(), d());
    }

    private static k1 d() {
        try {
            int i10 = p.f9257d;
            return (k1) p.class.getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            return f10155b;
        }
    }

    private static h2 e(Class cls, j1 j1Var) {
        return j0.class.isAssignableFrom(cls) ? b(j1Var) ? q1.x(cls, j1Var, w1.b(), w0.b(), j2.L(), c0.b(), h1.b()) : q1.x(cls, j1Var, w1.b(), w0.b(), j2.L(), null, h1.b()) : b(j1Var) ? q1.x(cls, j1Var, w1.a(), w0.a(), j2.K(), c0.a(), h1.a()) : q1.x(cls, j1Var, w1.a(), w0.a(), j2.K(), null, h1.a());
    }

    @Override // com.google.protobuf.i2
    public h2 a(Class cls) {
        j2.H(cls);
        j1 j1VarA = this.f10156a.a(cls);
        return j1VarA.a() ? j0.class.isAssignableFrom(cls) ? r1.g(j2.L(), c0.b(), j1VarA.b()) : r1.g(j2.K(), c0.a(), j1VarA.b()) : e(cls, j1VarA);
    }

    private y0(k1 k1Var) {
        this.f10156a = (k1) o0.b(k1Var, "messageInfoFactory");
    }
}
