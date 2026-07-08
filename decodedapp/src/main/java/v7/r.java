package v7;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static r f30469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final s f30470c = new s(0, false, false, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private s f30471a;

    private r() {
    }

    public static synchronized r b() {
        try {
            if (f30469b == null) {
                f30469b = new r();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f30469b;
    }

    public s a() {
        return this.f30471a;
    }

    public final synchronized void c(s sVar) {
        if (sVar == null) {
            this.f30471a = f30470c;
            return;
        }
        s sVar2 = this.f30471a;
        if (sVar2 == null || sVar2.g() < sVar.g()) {
            this.f30471a = sVar;
        }
    }
}
