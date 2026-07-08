package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class q0 implements g8, h8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f18128a;

    public /* synthetic */ void accept(double d10) {
        v3.C();
        throw null;
    }

    public /* synthetic */ void accept(int i10) {
        v3.J();
        throw null;
    }

    public /* synthetic */ void accept(long j10) {
        v3.K();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.l5
    public final /* synthetic */ void c(long j10) {
    }

    @Override // j$.util.stream.l5
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.l5
    public final /* synthetic */ void end() {
    }

    public q0(boolean z10) {
        this.f18128a = z10;
    }

    @Override // j$.util.stream.g8
    public final int v() {
        if (this.f18128a) {
            return 0;
        }
        return y6.f18269r;
    }

    public final void a(v3 v3Var, Spliterator spliterator) {
        if (this.f18128a) {
            new r0(v3Var, spliterator, this).invoke();
        } else {
            new s0(v3Var, spliterator, v3Var.G0(this)).invoke();
        }
    }
}
