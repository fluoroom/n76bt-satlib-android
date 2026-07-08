package mi;

/* JADX INFO: loaded from: classes3.dex */
final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object f22357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final o f22358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    volatile boolean f22359c = true;

    q(Object obj, o oVar) {
        this.f22357a = obj;
        this.f22358b = oVar;
    }

    public boolean equals(Object obj) {
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (this.f22357a == qVar.f22357a && this.f22358b.equals(qVar.f22358b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f22357a.hashCode() + this.f22358b.f22344f.hashCode();
    }
}
