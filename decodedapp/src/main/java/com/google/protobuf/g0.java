package com.google.protobuf;

import androidx.appcompat.widget.ActivityChooserView;
import com.google.protobuf.o0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
final class g0 extends d implements o0.f, RandomAccess, a2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final g0 f9012d = new g0(new float[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float[] f9013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f9014c;

    g0() {
        this(new float[10], 0, true);
    }

    private void f(int i10, float f10) {
        int i11;
        b();
        if (i10 < 0 || i10 > (i11 = this.f9014c)) {
            throw new IndexOutOfBoundsException(l(i10));
        }
        float[] fArr = this.f9013b;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
        } else {
            float[] fArr2 = new float[((i11 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.f9013b, i10, fArr2, i10 + 1, this.f9014c - i10);
            this.f9013b = fArr2;
        }
        this.f9013b[i10] = f10;
        this.f9014c++;
        ((AbstractList) this).modCount++;
    }

    public static g0 g() {
        return f9012d;
    }

    private void h(int i10) {
        if (i10 < 0 || i10 >= this.f9014c) {
            throw new IndexOutOfBoundsException(l(i10));
        }
    }

    private String l(int i10) {
        return "Index:" + i10 + ", Size:" + this.f9014c;
    }

    @Override // com.google.protobuf.d, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        b();
        o0.a(collection);
        if (!(collection instanceof g0)) {
            return super.addAll(collection);
        }
        g0 g0Var = (g0) collection;
        int i10 = g0Var.f9014c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f9014c;
        if (ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        float[] fArr = this.f9013b;
        if (i12 > fArr.length) {
            this.f9013b = Arrays.copyOf(fArr, i12);
        }
        System.arraycopy(g0Var.f9013b, 0, this.f9013b, this.f9014c, g0Var.f9014c);
        this.f9014c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Float f10) {
        f(i10, f10.floatValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean add(Float f10) {
        e(f10.floatValue());
        return true;
    }

    public void e(float f10) {
        b();
        int i10 = this.f9014c;
        float[] fArr = this.f9013b;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[((i10 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f9013b = fArr2;
        }
        float[] fArr3 = this.f9013b;
        int i11 = this.f9014c;
        this.f9014c = i11 + 1;
        fArr3[i11] = f10;
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return super.equals(obj);
        }
        g0 g0Var = (g0) obj;
        if (this.f9014c != g0Var.f9014c) {
            return false;
        }
        float[] fArr = g0Var.f9013b;
        for (int i10 = 0; i10 < this.f9014c; i10++) {
            if (Float.floatToIntBits(this.f9013b[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iFloatToIntBits = 1;
        for (int i10 = 0; i10 < this.f9014c; i10++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f9013b[i10]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Float get(int i10) {
        return Float.valueOf(j(i10));
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f9013b[i10] == fFloatValue) {
                return i10;
            }
        }
        return -1;
    }

    public float j(int i10) {
        h(i10);
        return this.f9013b[i10];
    }

    @Override // com.google.protobuf.o0.j
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public o0.f v(int i10) {
        if (i10 >= this.f9014c) {
            return new g0(Arrays.copyOf(this.f9013b, i10), this.f9014c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Float remove(int i10) {
        b();
        h(i10);
        float[] fArr = this.f9013b;
        float f10 = fArr[i10];
        if (i10 < this.f9014c - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (r2 - i10) - 1);
        }
        this.f9014c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public Float set(int i10, Float f10) {
        return Float.valueOf(q(i10, f10.floatValue()));
    }

    public float q(int i10, float f10) {
        b();
        h(i10);
        float[] fArr = this.f9013b;
        float f11 = fArr[i10];
        fArr[i10] = f10;
        return f11;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        b();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f9013b;
        System.arraycopy(fArr, i11, fArr, i10, this.f9014c - i11);
        this.f9014c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f9014c;
    }

    private g0(float[] fArr, int i10, boolean z10) {
        super(z10);
        this.f9013b = fArr;
        this.f9014c = i10;
    }
}
