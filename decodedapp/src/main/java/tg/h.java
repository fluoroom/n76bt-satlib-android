package tg;

/* JADX INFO: loaded from: classes3.dex */
public interface h extends s1 {

    public static final class a implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final qd.l f27819a;

        public a(qd.l lVar) {
            this.f27819a = lVar;
        }

        @Override // tg.h
        public void a(Throwable th2) {
            this.f27819a.l(th2);
        }

        public String toString() {
            return "CancelHandler.UserSupplied[" + h0.a(this.f27819a) + '@' + h0.b(this) + ']';
        }
    }

    void a(Throwable th2);
}
