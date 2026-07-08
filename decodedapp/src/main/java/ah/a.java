package ah;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f614d = new b().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bh.d f615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ch.a f616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f617c;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private bh.d f618a = bh.a.f4045a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ch.a f619b = ch.b.f4890a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f620c;

        public a a() {
            return new a(this.f618a, this.f619b, Boolean.valueOf(this.f620c));
        }

        public b b(bh.d dVar) {
            h.e(dVar, "browserMatcher cannot be null");
            this.f618a = dVar;
            return this;
        }
    }

    public bh.d a() {
        return this.f615a;
    }

    public ch.a b() {
        return this.f616b;
    }

    public boolean c() {
        return this.f617c;
    }

    private a(bh.d dVar, ch.a aVar, Boolean bool) {
        this.f615a = dVar;
        this.f616b = aVar;
        this.f617c = bool.booleanValue();
    }
}
