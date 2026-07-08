package tg;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class q1 extends hd.a implements f1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q1 f27858b = new q1();

    private q1() {
        super(f1.f27816q);
    }

    @Override // tg.f1
    public n X(p pVar) {
        return r1.f27865a;
    }

    @Override // tg.f1
    public boolean c() {
        return true;
    }

    @Override // tg.f1
    public CancellationException s() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // tg.f1
    public boolean start() {
        return false;
    }

    public String toString() {
        return "NonCancellable";
    }

    @Override // tg.f1
    public q0 x(boolean z10, boolean z11, qd.l lVar) {
        return r1.f27865a;
    }

    @Override // tg.f1
    public void h0(CancellationException cancellationException) {
    }
}
