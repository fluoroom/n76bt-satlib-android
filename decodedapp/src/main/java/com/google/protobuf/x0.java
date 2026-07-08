package com.google.protobuf;

import androidx.appcompat.widget.ActivityChooserView;
import com.google.protobuf.o0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
final class x0 extends d implements o0.i, RandomAccess, a2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final x0 f10138d = new x0(new long[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long[] f10139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f10140c;

    x0() {
        this(new long[10], 0, true);
    }

    private void e(int i10, long j10) {
        int i11;
        b();
        if (i10 < 0 || i10 > (i11 = this.f10140c)) {
            throw new IndexOutOfBoundsException(i(i10));
        }
        long[] jArr = this.f10139b;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[((i11 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f10139b, i10, jArr2, i10 + 1, this.f10140c - i10);
            this.f10139b = jArr2;
        }
        this.f10139b[i10] = j10;
        this.f10140c++;
        ((AbstractList) this).modCount++;
    }

    public static x0 f() {
        return f10138d;
    }

    private void g(int i10) {
        if (i10 < 0 || i10 >= this.f10140c) {
            throw new IndexOutOfBoundsException(i(i10));
        }
    }

    private String i(int i10) {
        return "Index:" + i10 + ", Size:" + this.f10140c;
    }

    @Override // com.google.protobuf.o0.i
    public void G(long j10) {
        b();
        int i10 = this.f10140c;
        long[] jArr = this.f10139b;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[((i10 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f10139b = jArr2;
        }
        long[] jArr3 = this.f10139b;
        int i11 = this.f10140c;
        this.f10140c = i11 + 1;
        jArr3[i11] = j10;
    }

    @Override // com.google.protobuf.o0.i
    public long W(int i10, long j10) {
        b();
        g(i10);
        long[] jArr = this.f10139b;
        long j11 = jArr[i10];
        jArr[i10] = j10;
        return j11;
    }

    @Override // com.google.protobuf.d, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        b();
        o0.a(collection);
        if (!(collection instanceof x0)) {
            return super.addAll(collection);
        }
        x0 x0Var = (x0) collection;
        int i10 = x0Var.f10140c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f10140c;
        if (ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        long[] jArr = this.f10139b;
        if (i12 > jArr.length) {
            this.f10139b = Arrays.copyOf(jArr, i12);
        }
        System.arraycopy(x0Var.f10139b, 0, this.f10139b, this.f10140c, x0Var.f10140c);
        this.f10140c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Long l10) {
        e(i10, l10.longValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean add(Long l10) {
        G(l10.longValue());
        return true;
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return super.equals(obj);
        }
        x0 x0Var = (x0) obj;
        if (this.f10140c != x0Var.f10140c) {
            return false;
        }
        long[] jArr = x0Var.f10139b;
        for (int i10 = 0; i10 < this.f10140c; i10++) {
            if (this.f10139b[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.o0.i
    public long getLong(int i10) {
        g(i10);
        return this.f10139b[i10];
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Long get(int i10) {
        return Long.valueOf(getLong(i10));
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f10140c; i11++) {
            i10 = (i10 * 31) + o0.i(this.f10139b[i11]);
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f10139b[i10] == jLongValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.o0.j
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public o0.i v(int i10) {
        if (i10 >= this.f10140c) {
            return new x0(Arrays.copyOf(this.f10139b, i10), this.f10140c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Long remove(int i10) {
        b();
        g(i10);
        long[] jArr = this.f10139b;
        long j10 = jArr[i10];
        if (i10 < this.f10140c - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (r3 - i10) - 1);
        }
        this.f10140c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Long set(int i10, Long l10) {
        return Long.valueOf(W(i10, l10.longValue()));
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        b();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f10139b;
        System.arraycopy(jArr, i11, jArr, i10, this.f10140c - i11);
        this.f10140c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f10140c;
    }

    private x0(long[] jArr, int i10, boolean z10) {
        super(z10);
        this.f10139b = jArr;
        this.f10140c = i10;
    }
}
