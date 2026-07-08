package e3;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private volatile Object f11419a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f11420b;

        a(b bVar) {
            this.f11420b = bVar;
        }

        @Override // e3.f.b
        public Object get() {
            if (this.f11419a == null) {
                synchronized (this) {
                    try {
                        if (this.f11419a == null) {
                            this.f11419a = k.e(this.f11420b.get());
                        }
                    } finally {
                    }
                }
            }
            return this.f11419a;
        }
    }

    public interface b {
        Object get();
    }

    public static b a(b bVar) {
        return new a(bVar);
    }
}
