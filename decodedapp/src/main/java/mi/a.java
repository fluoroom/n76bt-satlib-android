package mi;

/* JADX INFO: loaded from: classes3.dex */
class a implements Runnable, l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f22276a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f22277b;

    a(c cVar) {
        this.f22277b = cVar;
    }

    @Override // mi.l
    public void a(q qVar, Object obj) {
        this.f22276a.a(j.a(qVar, obj));
        this.f22277b.f().execute(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        j jVarB = this.f22276a.b();
        if (jVarB == null) {
            throw new IllegalStateException("No pending post available");
        }
        this.f22277b.i(jVarB);
    }
}
