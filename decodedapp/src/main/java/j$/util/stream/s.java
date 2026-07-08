package j$.util.stream;

/* JADX INFO: loaded from: classes2.dex */
public final class s extends z {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f18153s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(a aVar, int i10, int i11) {
        super(aVar, i10);
        this.f18153s = i11;
    }

    @Override // j$.util.stream.a
    public final l5 Q0(int i10, l5 l5Var) {
        switch (this.f18153s) {
            case 0:
                return new q(this, l5Var, 1);
            case 1:
                return l5Var;
            case 2:
                return new q(this, l5Var, 4);
            case 3:
                return new v0(1, l5Var);
            case 4:
                return new t0(this, l5Var, 4);
            case 5:
                return new d1(l5Var);
            default:
                return new c1(this, l5Var, 3);
        }
    }
}
