package tg;

/* JADX INFO: loaded from: classes3.dex */
public final class l0 extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Throwable f27832a;

    public l0(Throwable th2, a0 a0Var, hd.i iVar) {
        super("Coroutine dispatcher " + a0Var + " threw an exception, context = " + iVar, th2);
        this.f27832a = th2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f27832a;
    }
}
