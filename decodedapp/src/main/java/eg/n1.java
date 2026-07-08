package eg;

/* JADX INFO: loaded from: classes3.dex */
public interface n1 {

    public static final class a implements n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f12151a = new a();

        private a() {
        }

        @Override // eg.n1
        public void a(ie.c cVar) {
            rd.m.e(cVar, "annotation");
        }

        @Override // eg.n1
        public void b(he.k1 k1Var) {
            rd.m.e(k1Var, "typeAlias");
        }

        @Override // eg.n1
        public void c(he.k1 k1Var, he.l1 l1Var, r0 r0Var) {
            rd.m.e(k1Var, "typeAlias");
            rd.m.e(r0Var, "substitutedArgument");
        }

        @Override // eg.n1
        public void d(f2 f2Var, r0 r0Var, r0 r0Var2, he.l1 l1Var) {
            rd.m.e(f2Var, "substitutor");
            rd.m.e(r0Var, "unsubstitutedArgument");
            rd.m.e(r0Var2, "argument");
            rd.m.e(l1Var, "typeParameter");
        }
    }

    void a(ie.c cVar);

    void b(he.k1 k1Var);

    void c(he.k1 k1Var, he.l1 l1Var, r0 r0Var);

    void d(f2 f2Var, r0 r0Var, r0 r0Var2, he.l1 l1Var);
}
