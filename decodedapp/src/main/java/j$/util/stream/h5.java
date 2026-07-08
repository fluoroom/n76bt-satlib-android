package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h5 implements l5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l5 f18003a;

    @Override // j$.util.stream.l5
    public final /* synthetic */ void accept(double d10) {
        v3.C();
        throw null;
    }

    @Override // j$.util.stream.l5
    public final /* synthetic */ void accept(int i10) {
        v3.J();
        throw null;
    }

    @Override // j$.util.stream.l5
    public final /* synthetic */ void accept(long j10) {
        v3.K();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public h5(l5 l5Var) {
        this.f18003a = (l5) Objects.requireNonNull(l5Var);
    }

    @Override // j$.util.stream.l5
    public void c(long j10) {
        this.f18003a.c(j10);
    }

    @Override // j$.util.stream.l5
    public void end() {
        this.f18003a.end();
    }

    @Override // j$.util.stream.l5
    public boolean e() {
        return this.f18003a.e();
    }
}
