package fc;

/* JADX INFO: loaded from: classes3.dex */
class e implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile boolean f12915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f12916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f12917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f12918d;

    e(b bVar, Object obj, a aVar) {
        this.f12916b = bVar;
        this.f12917c = obj;
        this.f12918d = aVar;
    }

    public boolean a() {
        return this.f12915a;
    }

    @Override // fc.d
    public synchronized void cancel() {
        this.f12915a = true;
        b bVar = this.f12916b;
        if (bVar != null) {
            bVar.a(this.f12918d, this.f12917c);
            this.f12916b = null;
            this.f12918d = null;
            this.f12917c = null;
        }
    }
}
