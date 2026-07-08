package j$.util.stream;

import j$.util.Spliterator;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public abstract class u6 extends c implements Iterable, j$.lang.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f18198e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object[] f18199f;

    public abstract Object newArray(int i10);

    public abstract void p(Object obj, int i10, int i11, Object obj2);

    public abstract int q(Object obj);

    public abstract Spliterator spliterator();

    @Override // java.lang.Iterable
    public final /* synthetic */ java.util.Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    public abstract Object[] t();

    public u6(int i10) {
        super(i10);
        this.f18198e = newArray(1 << this.f17934a);
    }

    public u6() {
        this.f18198e = newArray(16);
    }

    public final void s(long j10) {
        long jQ;
        int i10 = this.f17936c;
        if (i10 == 0) {
            jQ = q(this.f18198e);
        } else {
            jQ = ((long) q(this.f18199f[i10])) + this.f17937d[i10];
        }
        if (j10 > jQ) {
            if (this.f18199f == null) {
                Object[] objArrT = t();
                this.f18199f = objArrT;
                this.f17937d = new long[8];
                objArrT[0] = this.f18198e;
            }
            int i11 = this.f17936c + 1;
            while (j10 > jQ) {
                Object[] objArr = this.f18199f;
                if (i11 >= objArr.length) {
                    int length = objArr.length * 2;
                    this.f18199f = Arrays.copyOf(objArr, length);
                    this.f17937d = Arrays.copyOf(this.f17937d, length);
                }
                int iMin = this.f17934a;
                if (i11 != 0 && i11 != 1) {
                    iMin = Math.min((iMin + i11) - 1, 30);
                }
                int i12 = 1 << iMin;
                this.f18199f[i11] = newArray(i12);
                long[] jArr = this.f17937d;
                int i13 = i11 - 1;
                jArr[i11] = jArr[i13] + ((long) q(this.f18199f[i13]));
                jQ += (long) i12;
                i11++;
            }
        }
    }

    public final int r(long j10) {
        if (this.f17936c == 0) {
            if (j10 < this.f17935b) {
                return 0;
            }
            throw new IndexOutOfBoundsException(Long.toString(j10));
        }
        if (j10 >= count()) {
            throw new IndexOutOfBoundsException(Long.toString(j10));
        }
        for (int i10 = 0; i10 <= this.f17936c; i10++) {
            if (j10 < this.f17937d[i10] + ((long) q(this.f18199f[i10]))) {
                return i10;
            }
        }
        throw new IndexOutOfBoundsException(Long.toString(j10));
    }

    public void f(int i10, Object obj) {
        long j10 = i10;
        long jCount = count() + j10;
        if (jCount > q(obj) || jCount < j10) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.f17936c == 0) {
            System.arraycopy(this.f18198e, 0, obj, i10, this.f17935b);
            return;
        }
        for (int i11 = 0; i11 < this.f17936c; i11++) {
            Object obj2 = this.f18199f[i11];
            System.arraycopy(obj2, 0, obj, i10, q(obj2));
            i10 += q(this.f18199f[i11]);
        }
        int i12 = this.f17935b;
        if (i12 > 0) {
            System.arraycopy(this.f18198e, 0, obj, i10, i12);
        }
    }

    public Object b() {
        long jCount = count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object objNewArray = newArray((int) jCount);
        f(0, objNewArray);
        return objNewArray;
    }

    public final void u() {
        long jQ;
        if (this.f17935b == q(this.f18198e)) {
            if (this.f18199f == null) {
                Object[] objArrT = t();
                this.f18199f = objArrT;
                this.f17937d = new long[8];
                objArrT[0] = this.f18198e;
            }
            int i10 = this.f17936c;
            int i11 = i10 + 1;
            Object[] objArr = this.f18199f;
            if (i11 >= objArr.length || objArr[i11] == null) {
                if (i10 == 0) {
                    jQ = q(this.f18198e);
                } else {
                    jQ = ((long) q(objArr[i10])) + this.f17937d[i10];
                }
                s(jQ + 1);
            }
            this.f17935b = 0;
            int i12 = this.f17936c + 1;
            this.f17936c = i12;
            this.f18198e = this.f18199f[i12];
        }
    }

    @Override // j$.util.stream.c
    public final void clear() {
        Object[] objArr = this.f18199f;
        if (objArr != null) {
            this.f18198e = objArr[0];
            this.f18199f = null;
            this.f17937d = null;
        }
        this.f17935b = 0;
        this.f17936c = 0;
    }

    public void g(Object obj) {
        for (int i10 = 0; i10 < this.f17936c; i10++) {
            Object obj2 = this.f18199f[i10];
            p(obj2, 0, q(obj2), obj);
        }
        p(this.f18198e, 0, this.f17935b, obj);
    }
}
