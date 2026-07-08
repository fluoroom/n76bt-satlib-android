package j$.util.stream;

import j$.util.Spliterator;

/* JADX INFO: loaded from: classes2.dex */
public final class c4 extends v3 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f17941h;

    public /* synthetic */ c4(int i10) {
        this.f17941h = i10;
    }

    @Override // j$.util.stream.v3
    public final q4 D0() {
        switch (this.f17941h) {
            case 0:
                return new u4();
            case 1:
                return new s4();
            case 2:
                return new v4();
            default:
                return new t4();
        }
    }

    @Override // j$.util.stream.v3, j$.util.stream.g8
    public final Object f(a aVar, Spliterator spliterator) {
        switch (this.f17941h) {
            case 0:
                if (!y6.SIZED.l(aVar.f17893m)) {
                }
                break;
            case 1:
                if (!y6.SIZED.l(aVar.f17893m)) {
                }
                break;
            case 2:
                if (!y6.SIZED.l(aVar.f17893m)) {
                }
                break;
            default:
                if (!y6.SIZED.l(aVar.f17893m)) {
                }
                break;
        }
        return (Long) super.f(aVar, spliterator);
    }

    @Override // j$.util.stream.v3, j$.util.stream.g8
    public final Object i(v3 v3Var, Spliterator spliterator) {
        switch (this.f17941h) {
            case 0:
                if (!y6.SIZED.l(((a) v3Var).f17893m)) {
                }
                break;
            case 1:
                if (!y6.SIZED.l(((a) v3Var).f17893m)) {
                }
                break;
            case 2:
                if (!y6.SIZED.l(((a) v3Var).f17893m)) {
                }
                break;
            default:
                if (!y6.SIZED.l(((a) v3Var).f17893m)) {
                }
                break;
        }
        return (Long) super.i(v3Var, spliterator);
    }

    @Override // j$.util.stream.v3, j$.util.stream.g8
    public final int v() {
        switch (this.f17941h) {
        }
        return y6.f18269r;
    }
}
