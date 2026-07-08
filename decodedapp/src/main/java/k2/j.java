package k2;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f19025a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f19026b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f19027c = new c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j f19028d = new d();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j f19029e = new e();

    class a extends j {
        a() {
        }

        @Override // k2.j
        public boolean a() {
            return true;
        }

        @Override // k2.j
        public boolean b() {
            return true;
        }

        @Override // k2.j
        public boolean c(i2.a aVar) {
            return aVar == i2.a.REMOTE;
        }

        @Override // k2.j
        public boolean d(boolean z10, i2.a aVar, i2.c cVar) {
            return (aVar == i2.a.RESOURCE_DISK_CACHE || aVar == i2.a.MEMORY_CACHE) ? false : true;
        }
    }

    class b extends j {
        b() {
        }

        @Override // k2.j
        public boolean a() {
            return false;
        }

        @Override // k2.j
        public boolean b() {
            return false;
        }

        @Override // k2.j
        public boolean c(i2.a aVar) {
            return false;
        }

        @Override // k2.j
        public boolean d(boolean z10, i2.a aVar, i2.c cVar) {
            return false;
        }
    }

    class c extends j {
        c() {
        }

        @Override // k2.j
        public boolean a() {
            return true;
        }

        @Override // k2.j
        public boolean b() {
            return false;
        }

        @Override // k2.j
        public boolean c(i2.a aVar) {
            return (aVar == i2.a.DATA_DISK_CACHE || aVar == i2.a.MEMORY_CACHE) ? false : true;
        }

        @Override // k2.j
        public boolean d(boolean z10, i2.a aVar, i2.c cVar) {
            return false;
        }
    }

    class d extends j {
        d() {
        }

        @Override // k2.j
        public boolean a() {
            return false;
        }

        @Override // k2.j
        public boolean b() {
            return true;
        }

        @Override // k2.j
        public boolean c(i2.a aVar) {
            return false;
        }

        @Override // k2.j
        public boolean d(boolean z10, i2.a aVar, i2.c cVar) {
            return (aVar == i2.a.RESOURCE_DISK_CACHE || aVar == i2.a.MEMORY_CACHE) ? false : true;
        }
    }

    class e extends j {
        e() {
        }

        @Override // k2.j
        public boolean a() {
            return true;
        }

        @Override // k2.j
        public boolean b() {
            return true;
        }

        @Override // k2.j
        public boolean c(i2.a aVar) {
            return aVar == i2.a.REMOTE;
        }

        @Override // k2.j
        public boolean d(boolean z10, i2.a aVar, i2.c cVar) {
            return ((z10 && aVar == i2.a.DATA_DISK_CACHE) || aVar == i2.a.LOCAL) && cVar == i2.c.TRANSFORMED;
        }
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c(i2.a aVar);

    public abstract boolean d(boolean z10, i2.a aVar, i2.c cVar);
}
