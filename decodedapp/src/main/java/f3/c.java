package f3;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    private static class b extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private volatile boolean f12778a;

        b() {
            super();
        }

        @Override // f3.c
        public void b(boolean z10) {
            this.f12778a = z10;
        }

        @Override // f3.c
        public void c() {
            if (this.f12778a) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    public static c a() {
        return new b();
    }

    abstract void b(boolean z10);

    public abstract void c();

    private c() {
    }
}
