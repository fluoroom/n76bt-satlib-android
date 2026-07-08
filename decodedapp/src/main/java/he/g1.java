package he;

/* JADX INFO: loaded from: classes3.dex */
public interface g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g1 f15281a = new a();

    static class a implements g1 {
        a() {
        }

        private static /* synthetic */ void d(int i10) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/descriptors/SourceElement$1", "getContainingFile"));
        }

        @Override // he.g1
        public h1 a() {
            h1 h1Var = h1.f15282a;
            if (h1Var == null) {
                d(0);
            }
            return h1Var;
        }

        public String toString() {
            return "NO_SOURCE";
        }
    }

    h1 a();
}
