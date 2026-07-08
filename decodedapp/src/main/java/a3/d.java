package a3;

/* JADX INFO: loaded from: classes.dex */
public interface d {

    public enum a {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f234a;

        a(boolean z10) {
            this.f234a = z10;
        }

        boolean d() {
            return this.f234a;
        }
    }

    boolean a();

    void b(c cVar);

    void c(c cVar);

    boolean f(c cVar);

    d getRoot();

    boolean h(c cVar);

    boolean j(c cVar);
}
