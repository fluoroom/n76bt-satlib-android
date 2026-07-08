package ke;

/* JADX INFO: loaded from: classes3.dex */
public interface i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f19682a = a.f19683a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f19683a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final he.g0 f19684b = new he.g0("PackageViewDescriptorFactory");

        private a() {
        }

        public final he.g0 a() {
            return f19684b;
        }
    }

    public static final class b implements i0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f19685b = new b();

        private b() {
        }

        @Override // ke.i0
        public he.u0 a(f0 f0Var, mf.c cVar, dg.n nVar) {
            rd.m.e(f0Var, "module");
            rd.m.e(cVar, "fqName");
            rd.m.e(nVar, "storageManager");
            return new x(f0Var, cVar, nVar);
        }
    }

    he.u0 a(f0 f0Var, mf.c cVar, dg.n nVar);
}
