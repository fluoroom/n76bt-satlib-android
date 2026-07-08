package j$.util.stream;

import j$.util.DesugarArrays;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
public class j2 implements g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f18026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18027b;

    @Override // j$.util.stream.g2
    public final /* synthetic */ g2 i(long j10, long j11, IntFunction intFunction) {
        return v3.V(this, j10, j11, intFunction);
    }

    @Override // j$.util.stream.g2
    public final /* synthetic */ int o() {
        return 0;
    }

    @Override // j$.util.stream.g2
    public final g2 a(int i10) {
        throw new IndexOutOfBoundsException();
    }

    public j2(long j10, IntFunction intFunction) {
        if (j10 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f18026a = (Object[]) intFunction.apply((int) j10);
        this.f18027b = 0;
    }

    public j2(Object[] objArr) {
        this.f18026a = objArr;
        this.f18027b = objArr.length;
    }

    @Override // j$.util.stream.g2
    public final Spliterator spliterator() {
        return DesugarArrays.a(this.f18026a, 0, this.f18027b);
    }

    @Override // j$.util.stream.g2
    public final void k(Object[] objArr, int i10) {
        System.arraycopy(this.f18026a, 0, objArr, i10, this.f18027b);
    }

    @Override // j$.util.stream.g2
    public final Object[] m(IntFunction intFunction) {
        Object[] objArr = this.f18026a;
        if (objArr.length == this.f18027b) {
            return objArr;
        }
        throw new IllegalStateException();
    }

    @Override // j$.util.stream.g2
    public final long count() {
        return this.f18027b;
    }

    @Override // j$.util.stream.g2
    public final void forEach(Consumer consumer) {
        for (int i10 = 0; i10 < this.f18027b; i10++) {
            consumer.n(this.f18026a[i10]);
        }
    }

    public String toString() {
        Object[] objArr = this.f18026a;
        return String.format("ArrayNode[%d][%s]", Integer.valueOf(objArr.length - this.f18027b), Arrays.toString(objArr));
    }
}
