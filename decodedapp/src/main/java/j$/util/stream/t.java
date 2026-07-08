package j$.util.stream;

/* JADX INFO: loaded from: classes2.dex */
public final class t extends z0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f18165s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(a aVar, int i10, int i11) {
        super(aVar, i10);
        this.f18165s = i11;
    }

    @Override // j$.util.stream.a
    public final l5 Q0(int i10, l5 l5Var) {
        switch (this.f18165s) {
            case 0:
                return new q(this, l5Var, 2);
            case 1:
                return new t0(this, l5Var, 2);
            case 2:
                return l5Var;
            case 3:
                return new t0(this, l5Var, 5);
            default:
                return new c1(this, l5Var, 2);
        }
    }
}
