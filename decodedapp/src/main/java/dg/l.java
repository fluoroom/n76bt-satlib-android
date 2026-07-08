package dg;

/* JADX INFO: loaded from: classes3.dex */
class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f11092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Thread f11093b = Thread.currentThread();

    l(Object obj) {
        this.f11092a = obj;
    }

    public Object a() {
        if (b()) {
            return this.f11092a;
        }
        throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
    }

    public boolean b() {
        return this.f11093b == Thread.currentThread();
    }
}
