package io.grpc.internal;

/* JADX INFO: loaded from: classes3.dex */
abstract class z implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qb.s f17266a;

    protected z(qb.s sVar) {
        this.f17266a = sVar;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        qb.s sVarB = this.f17266a.b();
        try {
            a();
        } finally {
            this.f17266a.f(sVarB);
        }
    }
}
