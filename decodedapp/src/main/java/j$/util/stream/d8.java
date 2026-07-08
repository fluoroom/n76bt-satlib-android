package j$.util.stream;

/* JADX INFO: loaded from: classes2.dex */
public final class d8 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f17957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f17958b;

    public d8(Runnable runnable, Runnable runnable2) {
        this.f17957a = runnable;
        this.f17958b = runnable2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f17957a.run();
            this.f17958b.run();
        } catch (Throwable th2) {
            try {
                this.f17958b.run();
            } catch (Throwable th3) {
                try {
                    th2.addSuppressed(th3);
                } catch (Throwable unused) {
                }
            }
            throw th2;
        }
    }
}
