package com.google.protobuf;

import androidx.appcompat.widget.ActivityChooserView;
import com.google.protobuf.o0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
final class n0 extends d implements o0.g, RandomAccess, a2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final n0 f9201d = new n0(new int[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f9202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f9203c;

    n0() {
        this(new int[10], 0, true);
    }

    private void e(int i10, int i11) {
        int i12;
        b();
        if (i10 < 0 || i10 > (i12 = this.f9203c)) {
            throw new IndexOutOfBoundsException(i(i10));
        }
        int[] iArr = this.f9202b;
        if (i12 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i12 - i10);
        } else {
            int[] iArr2 = new int[((i12 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f9202b, i10, iArr2, i10 + 1, this.f9203c - i10);
            this.f9202b = iArr2;
        }
        this.f9202b[i10] = i11;
        this.f9203c++;
        ((AbstractList) this).modCount++;
    }

    public static n0 f() {
        return f9201d;
    }

    private void g(int i10) {
        if (i10 < 0 || i10 >= this.f9203c) {
            throw new IndexOutOfBoundsException(i(i10));
        }
    }

    private String i(int i10) {
        return "Index:" + i10 + ", Size:" + this.f9203c;
    }

    @Override // com.google.protobuf.d, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        b();
        o0.a(collection);
        if (!(collection instanceof n0)) {
            return super.addAll(collection);
        }
        n0 n0Var = (n0) collection;
        int i10 = n0Var.f9203c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f9203c;
        if (ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f9202b;
        if (i12 > iArr.length) {
            this.f9202b = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(n0Var.f9202b, 0, this.f9202b, this.f9203c, n0Var.f9203c);
        this.f9203c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Integer num) {
        e(i10, num.intValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean add(Integer num) {
        x(num.intValue());
        return true;
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return super.equals(obj);
        }
        n0 n0Var = (n0) obj;
        if (this.f9203c != n0Var.f9203c) {
            return false;
        }
        int[] iArr = n0Var.f9202b;
        for (int i10 = 0; i10 < this.f9203c; i10++) {
            if (this.f9202b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.o0.g
    public int getInt(int i10) {
        g(i10);
        return this.f9202b[i10];
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Integer get(int i10) {
        return Integer.valueOf(getInt(i10));
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f9203c; i11++) {
            i10 = (i10 * 31) + this.f9202b[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f9202b[i10] == iIntValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.o0.j
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public o0.g v(int i10) {
        if (i10 >= this.f9203c) {
            return new n0(Arrays.copyOf(this.f9202b, i10), this.f9203c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Integer remove(int i10) {
        b();
        g(i10);
        int[] iArr = this.f9202b;
        int i11 = iArr[i10];
        if (i10 < this.f9203c - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (r2 - i10) - 1);
        }
        this.f9203c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Integer set(int i10, Integer num) {
        return Integer.valueOf(o(i10, num.intValue()));
    }

    public int o(int i10, int i11) {
        b();
        g(i10);
        int[] iArr = this.f9202b;
        int i12 = iArr[i10];
        iArr[i10] = i11;
        return i12;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        b();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f9202b;
        System.arraycopy(iArr, i11, iArr, i10, this.f9203c - i11);
        this.f9203c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f9203c;
    }

    @Override // com.google.protobuf.o0.g
    public void x(int i10) {
        b();
        int i11 = this.f9203c;
        int[] iArr = this.f9202b;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f9202b = iArr2;
        }
        int[] iArr3 = this.f9202b;
        int i12 = this.f9203c;
        this.f9203c = i12 + 1;
        iArr3[i12] = i10;
    }

    private n0(int[] iArr, int i10, boolean z10) {
        super(z10);
        this.f9202b = iArr;
        this.f9203c = i10;
    }
}
