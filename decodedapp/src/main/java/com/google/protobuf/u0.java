package com.google.protobuf;

import j$.util.DesugarCollections;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public class u0 extends d implements v0, RandomAccess {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final u0 f10115c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v0 f10116d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f10117b;

    static {
        u0 u0Var = new u0(false);
        f10115c = u0Var;
        f10116d = u0Var;
    }

    private u0(boolean z10) {
        super(z10);
        this.f10117b = Collections.EMPTY_LIST;
    }

    private static String d(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof l ? ((l) obj).N() : o0.l((byte[]) obj);
    }

    public static u0 e() {
        return f10115c;
    }

    @Override // com.google.protobuf.d, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void add(int i10, String str) {
        b();
        this.f10117b.add(i10, str);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        b();
        this.f10117b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public String get(int i10) {
        Object obj = this.f10117b.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            String strN = lVar.N();
            if (lVar.o()) {
                this.f10117b.set(i10, strN);
            }
            return strN;
        }
        byte[] bArr = (byte[]) obj;
        String strL = o0.l(bArr);
        if (o0.j(bArr)) {
            this.f10117b.set(i10, strL);
        }
        return strL;
    }

    @Override // com.google.protobuf.o0.j
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public u0 v(int i10) {
        if (i10 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i10);
        arrayList.addAll(this.f10117b);
        return new u0(arrayList);
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public String remove(int i10) {
        b();
        Object objRemove = this.f10117b.remove(i10);
        ((AbstractList) this).modCount++;
        return d(objRemove);
    }

    @Override // com.google.protobuf.v0
    public Object h0(int i10) {
        return this.f10117b.get(i10);
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public String set(int i10, String str) {
        b();
        return d(this.f10117b.set(i10, str));
    }

    @Override // com.google.protobuf.v0
    public List k() {
        return DesugarCollections.unmodifiableList(this.f10117b);
    }

    @Override // com.google.protobuf.v0
    public v0 n() {
        return p0() ? new x2(this) : this;
    }

    @Override // com.google.protobuf.d, com.google.protobuf.o0.j
    public /* bridge */ /* synthetic */ boolean p0() {
        return super.p0();
    }

    @Override // com.google.protobuf.d, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.protobuf.d, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f10117b.size();
    }

    @Override // com.google.protobuf.v0
    public void w(l lVar) {
        b();
        this.f10117b.add(lVar);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection collection) {
        b();
        if (collection instanceof v0) {
            collection = ((v0) collection).k();
        }
        boolean zAddAll = this.f10117b.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.google.protobuf.d, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    public u0(int i10) {
        this(new ArrayList(i10));
    }

    public u0(v0 v0Var) {
        this.f10117b = new ArrayList(v0Var.size());
        addAll(v0Var);
    }

    private u0(ArrayList arrayList) {
        this.f10117b = arrayList;
    }
}
