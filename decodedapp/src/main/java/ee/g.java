package ee;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f11786h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final dd.j f11787i = dd.k.b(f.f11785a);

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        public final g a() {
            return (g) g.f11787i.getValue();
        }

        private a() {
        }
    }

    public g(boolean z10) {
        super(new dg.f("DefaultBuiltIns"));
        if (z10) {
            f(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g G0() {
        return new g(false, 1, null);
    }

    public /* synthetic */ g(boolean z10, int i10, rd.h hVar) {
        this((i10 & 1) != 0 ? true : z10);
    }
}
