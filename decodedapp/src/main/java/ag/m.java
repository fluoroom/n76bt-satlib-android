package ag;

/* JADX INFO: loaded from: classes3.dex */
public interface m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f518a = a.f519a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f519a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final m f520b = new C0011a();

        /* JADX INFO: renamed from: ag.m$a$a, reason: collision with other inner class name */
        public static final class C0011a implements m {
            C0011a() {
            }

            @Override // ag.m
            public dd.q a(gf.j jVar, he.z zVar, jf.h hVar, w0 w0Var) {
                rd.m.e(jVar, "proto");
                rd.m.e(zVar, "ownerFunction");
                rd.m.e(hVar, "typeTable");
                rd.m.e(w0Var, "typeDeserializer");
                return null;
            }
        }

        private a() {
        }

        public final m a() {
            return f520b;
        }
    }

    dd.q a(gf.j jVar, he.z zVar, jf.h hVar, w0 w0Var);
}
