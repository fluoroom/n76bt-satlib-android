package mi;

/* JADX INFO: loaded from: classes3.dex */
final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private j f22333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private j f22334b;

    k() {
    }

    synchronized void a(j jVar) {
        try {
            if (jVar == null) {
                throw new NullPointerException("null cannot be enqueued");
            }
            j jVar2 = this.f22334b;
            if (jVar2 != null) {
                jVar2.f22332c = jVar;
                this.f22334b = jVar;
            } else {
                if (this.f22333a != null) {
                    throw new IllegalStateException("Head present, but no tail");
                }
                this.f22334b = jVar;
                this.f22333a = jVar;
            }
            notifyAll();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    synchronized j b() {
        j jVar;
        jVar = this.f22333a;
        if (jVar != null) {
            j jVar2 = jVar.f22332c;
            this.f22333a = jVar2;
            if (jVar2 == null) {
                this.f22334b = null;
            }
        }
        return jVar;
    }

    synchronized j c(int i10) {
        try {
            if (this.f22333a == null) {
                wait(i10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return b();
    }
}
