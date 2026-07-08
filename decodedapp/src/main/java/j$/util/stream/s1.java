package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class s1 implements l5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f18158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f18159b;

    @Override // j$.util.stream.l5
    public /* synthetic */ void accept(double d10) {
        v3.C();
        throw null;
    }

    @Override // j$.util.stream.l5
    public /* synthetic */ void accept(int i10) {
        v3.J();
        throw null;
    }

    @Override // j$.util.stream.l5
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
    public final /* synthetic */ void end() {
    }

    public s1(t1 t1Var) {
        this.f18159b = !t1Var.f18170b;
    }

    @Override // j$.util.stream.l5
    public final boolean e() {
        return this.f18158a;
    }
}
