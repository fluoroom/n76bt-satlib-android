package com.google.protobuf;

import androidx.appcompat.widget.ActivityChooserView;
import com.google.protobuf.o0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
final class s extends d implements o0.b, RandomAccess, a2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final s f10087d = new s(new double[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double[] f10088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f10089c;

    s() {
        this(new double[10], 0, true);
    }

    private void f(int i10, double d10) {
        int i11;
        b();
        if (i10 < 0 || i10 > (i11 = this.f10089c)) {
            throw new IndexOutOfBoundsException(l(i10));
        }
        double[] dArr = this.f10088b;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[((i11 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.f10088b, i10, dArr2, i10 + 1, this.f10089c - i10);
            this.f10088b = dArr2;
        }
        this.f10088b[i10] = d10;
        this.f10089c++;
        ((AbstractList) this).modCount++;
    }

    public static s g() {
        return f10087d;
    }

    private void h(int i10) {
        if (i10 < 0 || i10 >= this.f10089c) {
            throw new IndexOutOfBoundsException(l(i10));
        }
    }

    private String l(int i10) {
        return "Index:" + i10 + ", Size:" + this.f10089c;
    }

    @Override // com.google.protobuf.d, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        b();
        o0.a(collection);
        if (!(collection instanceof s)) {
            return super.addAll(collection);
        }
        s sVar = (s) collection;
        int i10 = sVar.f10089c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f10089c;
        if (ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        double[] dArr = this.f10088b;
        if (i12 > dArr.length) {
            this.f10088b = Arrays.copyOf(dArr, i12);
        }
        System.arraycopy(sVar.f10088b, 0, this.f10088b, this.f10089c, sVar.f10089c);
        this.f10089c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Double d10) {
        f(i10, d10.doubleValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean add(Double d10) {
        e(d10.doubleValue());
        return true;
    }

    public void e(double d10) {
        b();
        int i10 = this.f10089c;
        double[] dArr = this.f10088b;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[((i10 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f10088b = dArr2;
        }
        double[] dArr3 = this.f10088b;
        int i11 = this.f10089c;
        this.f10089c = i11 + 1;
        dArr3[i11] = d10;
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return super.equals(obj);
        }
        s sVar = (s) obj;
        if (this.f10089c != sVar.f10089c) {
            return false;
        }
        double[] dArr = sVar.f10088b;
        for (int i10 = 0; i10 < this.f10089c; i10++) {
            if (Double.doubleToLongBits(this.f10088b[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f10089c; i11++) {
            i10 = (i10 * 31) + o0.i(Double.doubleToLongBits(this.f10088b[i11]));
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Double get(int i10) {
        return Double.valueOf(j(i10));
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f10088b[i10] == dDoubleValue) {
                return i10;
            }
        }
        return -1;
    }

    public double j(int i10) {
        h(i10);
        return this.f10088b[i10];
    }

    @Override // com.google.protobuf.o0.j
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public o0.b v(int i10) {
        if (i10 >= this.f10089c) {
            return new s(Arrays.copyOf(this.f10088b, i10), this.f10089c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Double remove(int i10) {
        b();
        h(i10);
        double[] dArr = this.f10088b;
        double d10 = dArr[i10];
        if (i10 < this.f10089c - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (r3 - i10) - 1);
        }
        this.f10089c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public Double set(int i10, Double d10) {
        return Double.valueOf(q(i10, d10.doubleValue()));
    }

    public double q(int i10, double d10) {
        b();
        h(i10);
        double[] dArr = this.f10088b;
        double d11 = dArr[i10];
        dArr[i10] = d10;
        return d11;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        b();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f10088b;
        System.arraycopy(dArr, i11, dArr, i10, this.f10089c - i11);
        this.f10089c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f10089c;
    }

    private s(double[] dArr, int i10, boolean z10) {
        super(z10);
        this.f10088b = dArr;
        this.f10089c = i10;
    }
}
