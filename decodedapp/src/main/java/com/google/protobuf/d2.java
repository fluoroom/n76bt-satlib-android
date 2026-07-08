package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
final class d2 extends d implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final d2 f8943d = new d2(new Object[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object[] f8944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f8945c;

    private d2(Object[] objArr, int i10, boolean z10) {
        super(z10);
        this.f8944b = objArr;
        this.f8945c = i10;
    }

    private static Object[] c(int i10) {
        return new Object[i10];
    }

    public static d2 d() {
        return f8943d;
    }

    private void e(int i10) {
        if (i10 < 0 || i10 >= this.f8945c) {
            throw new IndexOutOfBoundsException(f(i10));
        }
    }

    private String f(int i10) {
        return "Index:" + i10 + ", Size:" + this.f8945c;
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        b();
        int i10 = this.f8945c;
        Object[] objArr = this.f8944b;
        if (i10 == objArr.length) {
            this.f8944b = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f8944b;
        int i11 = this.f8945c;
        this.f8945c = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.protobuf.o0.j
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public d2 v(int i10) {
        if (i10 >= this.f8945c) {
            return new d2(Arrays.copyOf(this.f8944b, i10), this.f8945c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        e(i10);
        return this.f8944b[i10];
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.List
    public Object remove(int i10) {
        b();
        e(i10);
        Object[] objArr = this.f8944b;
        Object obj = objArr[i10];
        if (i10 < this.f8945c - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (r2 - i10) - 1);
        }
        this.f8945c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        b();
        e(i10);
        Object[] objArr = this.f8944b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f8945c;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        int i11;
        b();
        if (i10 >= 0 && i10 <= (i11 = this.f8945c)) {
            Object[] objArr = this.f8944b;
            if (i11 < objArr.length) {
                System.arraycopy(objArr, i10, objArr, i10 + 1, i11 - i10);
            } else {
                Object[] objArrC = c(((i11 * 3) / 2) + 1);
                System.arraycopy(this.f8944b, 0, objArrC, 0, i10);
                System.arraycopy(this.f8944b, i10, objArrC, i10 + 1, this.f8945c - i10);
                this.f8944b = objArrC;
            }
            this.f8944b[i10] = obj;
            this.f8945c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(f(i10));
    }
}
