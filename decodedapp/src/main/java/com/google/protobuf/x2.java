package com.google.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public class x2 extends AbstractList implements v0, RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v0 f10142a;

    class a implements ListIterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ListIterator f10143a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f10144b;

        a(int i10) {
            this.f10144b = i10;
            this.f10143a = x2.this.f10142a.listIterator(i10);
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public String next() {
            return (String) this.f10143a.next();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return (String) this.f10143a.previous();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f10143a.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f10143a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f10143a.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f10143a.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    class b implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Iterator f10146a;

        b() {
            this.f10146a = x2.this.f10142a.iterator();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            return (String) this.f10146a.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f10146a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public x2(v0 v0Var) {
        this.f10142a = v0Var;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public String get(int i10) {
        return (String) this.f10142a.get(i10);
    }

    @Override // com.google.protobuf.v0
    public Object h0(int i10) {
        return this.f10142a.h0(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new b();
    }

    @Override // com.google.protobuf.v0
    public List k() {
        return this.f10142a.k();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i10) {
        return new a(i10);
    }

    @Override // com.google.protobuf.v0
    public v0 n() {
        return this;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f10142a.size();
    }

    @Override // com.google.protobuf.v0
    public void w(l lVar) {
        throw new UnsupportedOperationException();
    }
}
