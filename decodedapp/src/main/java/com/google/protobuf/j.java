package com.google.protobuf;

import androidx.appcompat.widget.ActivityChooserView;
import com.google.protobuf.o0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
final class j extends d implements o0.a, RandomAccess, a2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final j f9038d = new j(new boolean[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean[] f9039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f9040c;

    j() {
        this(new boolean[10], 0, true);
    }

    private void e(int i10, boolean z10) {
        int i11;
        b();
        if (i10 < 0 || i10 > (i11 = this.f9040c)) {
            throw new IndexOutOfBoundsException(l(i10));
        }
        boolean[] zArr = this.f9039b;
        if (i11 < zArr.length) {
            System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[((i11 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            System.arraycopy(this.f9039b, i10, zArr2, i10 + 1, this.f9040c - i10);
            this.f9039b = zArr2;
        }
        this.f9039b[i10] = z10;
        this.f9040c++;
        ((AbstractList) this).modCount++;
    }

    public static j g() {
        return f9038d;
    }

    private void h(int i10) {
        if (i10 < 0 || i10 >= this.f9040c) {
            throw new IndexOutOfBoundsException(l(i10));
        }
    }

    private String l(int i10) {
        return "Index:" + i10 + ", Size:" + this.f9040c;
    }

    @Override // com.google.protobuf.d, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        b();
        o0.a(collection);
        if (!(collection instanceof j)) {
            return super.addAll(collection);
        }
        j jVar = (j) collection;
        int i10 = jVar.f9040c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f9040c;
        if (ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        boolean[] zArr = this.f9039b;
        if (i12 > zArr.length) {
            this.f9039b = Arrays.copyOf(zArr, i12);
        }
        System.arraycopy(jVar.f9039b, 0, this.f9039b, this.f9040c, jVar.f9040c);
        this.f9040c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Boolean bool) {
        e(i10, bool.booleanValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean add(Boolean bool) {
        f(bool.booleanValue());
        return true;
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return super.equals(obj);
        }
        j jVar = (j) obj;
        if (this.f9040c != jVar.f9040c) {
            return false;
        }
        boolean[] zArr = jVar.f9039b;
        for (int i10 = 0; i10 < this.f9040c; i10++) {
            if (this.f9039b[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public void f(boolean z10) {
        b();
        int i10 = this.f9040c;
        boolean[] zArr = this.f9039b;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[((i10 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f9039b = zArr2;
        }
        boolean[] zArr3 = this.f9039b;
        int i11 = this.f9040c;
        this.f9040c = i11 + 1;
        zArr3[i11] = z10;
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iD = 1;
        for (int i10 = 0; i10 < this.f9040c; i10++) {
            iD = (iD * 31) + o0.d(this.f9039b[i10]);
        }
        return iD;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Boolean get(int i10) {
        return Boolean.valueOf(j(i10));
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f9039b[i10] == zBooleanValue) {
                return i10;
            }
        }
        return -1;
    }

    public boolean j(int i10) {
        h(i10);
        return this.f9039b[i10];
    }

    @Override // com.google.protobuf.o0.j
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public o0.a v(int i10) {
        if (i10 >= this.f9040c) {
            return new j(Arrays.copyOf(this.f9039b, i10), this.f9040c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Boolean remove(int i10) {
        b();
        h(i10);
        boolean[] zArr = this.f9039b;
        boolean z10 = zArr[i10];
        if (i10 < this.f9040c - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (r2 - i10) - 1);
        }
        this.f9040c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public Boolean set(int i10, Boolean bool) {
        return Boolean.valueOf(q(i10, bool.booleanValue()));
    }

    public boolean q(int i10, boolean z10) {
        b();
        h(i10);
        boolean[] zArr = this.f9039b;
        boolean z11 = zArr[i10];
        zArr[i10] = z10;
        return z11;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        b();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f9039b;
        System.arraycopy(zArr, i11, zArr, i10, this.f9040c - i11);
        this.f9040c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f9040c;
    }

    private j(boolean[] zArr, int i10, boolean z10) {
        super(z10);
        this.f9039b = zArr;
        this.f9040c = i10;
    }
}
