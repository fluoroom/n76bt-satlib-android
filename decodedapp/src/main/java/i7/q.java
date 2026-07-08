package i7;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f15917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private q f15918b;

    public q(Object obj, q qVar) {
        this.f15917a = obj;
        this.f15918b = qVar;
    }

    public void a(q qVar) {
        if (this.f15918b != null) {
            throw new IllegalStateException();
        }
        this.f15918b = qVar;
    }

    public q b() {
        return this.f15918b;
    }

    public Object c() {
        return this.f15917a;
    }
}
