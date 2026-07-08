package j$.util.stream;

import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
public abstract class q2 extends i2 implements f2 {
    @Override // j$.util.stream.g2
    public final /* synthetic */ Object[] m(IntFunction intFunction) {
        return v3.L(this, intFunction);
    }

    @Override // j$.util.stream.f2
    public final void g(Object obj) {
        ((f2) this.f18012a).g(obj);
        ((f2) this.f18013b).g(obj);
    }

    @Override // j$.util.stream.f2
    public final void f(int i10, Object obj) {
        g2 g2Var = this.f18012a;
        ((f2) g2Var).f(i10, obj);
        ((f2) this.f18013b).f(i10 + ((int) ((f2) g2Var).count()), obj);
    }

    @Override // j$.util.stream.f2
    public final Object b() {
        long j10 = this.f18014c;
        if (j10 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object objNewArray = newArray((int) j10);
        f(0, objNewArray);
        return objNewArray;
    }

    public final String toString() {
        long j10 = this.f18014c;
        return j10 < 32 ? String.format("%s[%s.%s]", getClass().getName(), this.f18012a, this.f18013b) : String.format("%s[size=%d]", getClass().getName(), Long.valueOf(j10));
    }
}
