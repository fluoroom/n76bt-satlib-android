package j$.util.stream;

import j$.util.DesugarArrays;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class m6 implements Spliterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18088d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object[] f18089e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v6 f18090f;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 16464;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.util.c.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return j$.util.c.e(this, i10);
    }

    public m6(v6 v6Var, int i10, int i11, int i12, int i13) {
        this.f18090f = v6Var;
        this.f18085a = i10;
        this.f18086b = i11;
        this.f18087c = i12;
        this.f18088d = i13;
        Object[][] objArr = v6Var.f18225f;
        this.f18089e = objArr == null ? v6Var.f18224e : objArr[i10];
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        int i10 = this.f18085a;
        int i11 = this.f18088d;
        int i12 = this.f18086b;
        if (i10 == i12) {
            return ((long) i11) - ((long) this.f18087c);
        }
        long[] jArr = this.f18090f.f17937d;
        return ((jArr[i12] + ((long) i11)) - jArr[i10]) - ((long) this.f18087c);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Objects.requireNonNull(consumer);
        int i10 = this.f18085a;
        int i11 = this.f18086b;
        if (i10 >= i11 && (i10 != i11 || this.f18087c >= this.f18088d)) {
            return false;
        }
        Object[] objArr = this.f18089e;
        int i12 = this.f18087c;
        this.f18087c = i12 + 1;
        consumer.n(objArr[i12]);
        if (this.f18087c == this.f18089e.length) {
            this.f18087c = 0;
            int i13 = this.f18085a + 1;
            this.f18085a = i13;
            Object[][] objArr2 = this.f18090f.f18225f;
            if (objArr2 != null && i13 <= i11) {
                this.f18089e = objArr2[i13];
            }
        }
        return true;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        v6 v6Var;
        Objects.requireNonNull(consumer);
        int i10 = this.f18085a;
        int i11 = this.f18088d;
        int i12 = this.f18086b;
        if (i10 < i12 || (i10 == i12 && this.f18087c < i11)) {
            int i13 = this.f18087c;
            while (true) {
                v6Var = this.f18090f;
                if (i10 >= i12) {
                    break;
                }
                Object[] objArr = v6Var.f18225f[i10];
                while (i13 < objArr.length) {
                    consumer.n(objArr[i13]);
                    i13++;
                }
                i10++;
                i13 = 0;
            }
            Object[] objArr2 = this.f18085a == i12 ? this.f18089e : v6Var.f18225f[i12];
            while (i13 < i11) {
                consumer.n(objArr2[i13]);
                i13++;
            }
            this.f18085a = i12;
            this.f18087c = i11;
        }
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int i10 = this.f18085a;
        int i11 = this.f18086b;
        if (i10 < i11) {
            int i12 = i11 - 1;
            int i13 = this.f18087c;
            v6 v6Var = this.f18090f;
            m6 m6Var = new m6(v6Var, i10, i12, i13, v6Var.f18225f[i12].length);
            this.f18085a = i11;
            this.f18087c = 0;
            this.f18089e = v6Var.f18225f[i11];
            return m6Var;
        }
        if (i10 != i11) {
            return null;
        }
        int i14 = this.f18087c;
        int i15 = (this.f18088d - i14) / 2;
        if (i15 == 0) {
            return null;
        }
        j$.util.j1 j1VarA = DesugarArrays.a(this.f18089e, i14, i14 + i15);
        this.f18087c += i15;
        return j1VarA;
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }
}
