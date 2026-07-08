package j$.util.stream;

import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class f1 extends i1 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f17976s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f17977t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f1(a aVar, int i10, Object obj, int i11) {
        super(aVar, i10);
        this.f17976s = i11;
        this.f17977t = obj;
    }

    @Override // j$.util.stream.a
    public final l5 Q0(int i10, l5 l5Var) {
        switch (this.f17976s) {
            case 0:
                return new e1(this, l5Var);
            case 1:
                return new c1(this, l5Var, 5);
            case 2:
                return new y4(this, l5Var);
            default:
                return new m(this, l5Var, 5);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(j1 j1Var, LongConsumer longConsumer) {
        super(j1Var, 0);
        this.f17976s = 1;
        this.f17977t = longConsumer;
    }
}
