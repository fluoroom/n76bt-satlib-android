package j$.util.stream;

import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class u0 extends z0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f18190s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f18191t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(a aVar, int i10, Object obj, int i11) {
        super(aVar, i10);
        this.f18190s = i11;
        this.f18191t = obj;
    }

    @Override // j$.util.stream.a
    public final l5 Q0(int i10, l5 l5Var) {
        switch (this.f18190s) {
            case 0:
                return new t0(this, l5Var, 1);
            case 1:
                return new w0(this, l5Var);
            case 2:
                return new m(this, l5Var, 4);
            default:
                return new y4(this, l5Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(a1 a1Var, IntConsumer intConsumer) {
        super(a1Var, 0);
        this.f18190s = 0;
        this.f18191t = intConsumer;
    }
}
