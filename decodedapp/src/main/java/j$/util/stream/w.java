package j$.util.stream;

import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class w extends z {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f18229s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f18230t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(a aVar, int i10, Object obj, int i11) {
        super(aVar, i10);
        this.f18229s = i11;
        this.f18230t = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(a0 a0Var, DoubleConsumer doubleConsumer) {
        super(a0Var, 0);
        this.f18229s = 1;
        this.f18230t = doubleConsumer;
    }

    @Override // j$.util.stream.a
    public final l5 Q0(int i10, l5 l5Var) {
        switch (this.f18229s) {
            case 0:
                return new v(this, l5Var);
            case 1:
                return new q(this, l5Var, 5);
            case 2:
                return new m(this, l5Var, 6);
            default:
                return new y4(this, l5Var);
        }
    }
}
