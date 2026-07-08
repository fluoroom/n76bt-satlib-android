package com.google.protobuf;

import com.google.protobuf.a;
import j$.util.DesugarCollections;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public class g2 implements a.b {

    /* JADX INFO: renamed from: a */
    private a.b f9015a;

    /* JADX INFO: renamed from: b */
    private List f9016b;

    /* JADX INFO: renamed from: c */
    private boolean f9017c;

    /* JADX INFO: renamed from: d */
    private List f9018d;

    /* JADX INFO: renamed from: e */
    private boolean f9019e;

    /* JADX INFO: renamed from: f */
    private b f9020f;

    /* JADX INFO: renamed from: g */
    private a f9021g;

    /* JADX INFO: renamed from: h */
    private c f9022h;

    private static class a extends AbstractList implements List, RandomAccess {

        /* JADX INFO: renamed from: a */
        g2 f9023a;

        a(g2 g2Var) {
            this.f9023a = g2Var;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: b */
        public a.AbstractC0131a get(int i10) {
            return this.f9023a.l(i10);
        }

        void c() {
            ((AbstractList) this).modCount++;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f9023a.n();
        }
    }

    private static class b extends AbstractList implements List, RandomAccess {

        /* JADX INFO: renamed from: a */
        g2 f9024a;

        b(g2 g2Var) {
            this.f9024a = g2Var;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: b */
        public com.google.protobuf.a get(int i10) {
            return this.f9024a.o(i10);
        }

        void c() {
            ((AbstractList) this).modCount++;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f9024a.n();
        }
    }

    private static class c extends AbstractList implements List, RandomAccess {

        /* JADX INFO: renamed from: a */
        g2 f9025a;

        c(g2 g2Var) {
            this.f9025a = g2Var;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: b */
        public o1 get(int i10) {
            return this.f9025a.r(i10);
        }

        void c() {
            ((AbstractList) this).modCount++;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f9025a.n();
        }
    }

    public g2(List list, boolean z10, a.b bVar, boolean z11) {
        this.f9016b = list;
        this.f9017c = z10;
        this.f9015a = bVar;
        this.f9019e = z11;
    }

    private void j() {
        if (this.f9018d == null) {
            this.f9018d = new ArrayList(this.f9016b.size());
            for (int i10 = 0; i10 < this.f9016b.size(); i10++) {
                this.f9018d.add(null);
            }
        }
    }

    private void k() {
        if (this.f9017c) {
            return;
        }
        this.f9016b = new ArrayList(this.f9016b);
        this.f9017c = true;
    }

    private com.google.protobuf.a p(int i10, boolean z10) {
        List list = this.f9018d;
        if (list == null) {
            return (com.google.protobuf.a) this.f9016b.get(i10);
        }
        k2 k2Var = (k2) list.get(i10);
        return k2Var == null ? (com.google.protobuf.a) this.f9016b.get(i10) : z10 ? k2Var.b() : k2Var.f();
    }

    private void t() {
        b bVar = this.f9020f;
        if (bVar != null) {
            bVar.c();
        }
        a aVar = this.f9021g;
        if (aVar != null) {
            aVar.c();
        }
        c cVar = this.f9022h;
        if (cVar != null) {
            cVar.c();
        }
    }

    private void v() {
        a.b bVar;
        if (!this.f9019e || (bVar = this.f9015a) == null) {
            return;
        }
        bVar.a();
        this.f9019e = false;
    }

    @Override // com.google.protobuf.a.b
    public void a() {
        v();
    }

    public g2 b(Iterable iterable) {
        int size;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            o0.a((com.google.protobuf.a) it.next());
        }
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.isEmpty()) {
                return this;
            }
            size = collection.size();
        } else {
            size = -1;
        }
        k();
        if (size >= 0) {
            List list = this.f9016b;
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            }
        }
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            f((com.google.protobuf.a) it2.next());
        }
        v();
        t();
        return this;
    }

    public a.AbstractC0131a c(int i10, com.google.protobuf.a aVar) {
        k();
        j();
        k2 k2Var = new k2(aVar, this, this.f9019e);
        this.f9016b.add(i10, null);
        this.f9018d.add(i10, k2Var);
        v();
        t();
        return k2Var.e();
    }

    public a.AbstractC0131a d(com.google.protobuf.a aVar) {
        k();
        j();
        k2 k2Var = new k2(aVar, this, this.f9019e);
        this.f9016b.add(null);
        this.f9018d.add(k2Var);
        v();
        t();
        return k2Var.e();
    }

    public g2 e(int i10, com.google.protobuf.a aVar) {
        o0.a(aVar);
        k();
        this.f9016b.add(i10, aVar);
        List list = this.f9018d;
        if (list != null) {
            list.add(i10, null);
        }
        v();
        t();
        return this;
    }

    public g2 f(com.google.protobuf.a aVar) {
        o0.a(aVar);
        k();
        this.f9016b.add(aVar);
        List list = this.f9018d;
        if (list != null) {
            list.add(null);
        }
        v();
        t();
        return this;
    }

    public List g() {
        this.f9019e = true;
        boolean z10 = this.f9017c;
        if (!z10 && this.f9018d == null) {
            return this.f9016b;
        }
        if (!z10) {
            for (int i10 = 0; i10 < this.f9016b.size(); i10++) {
                i1 i1Var = (i1) this.f9016b.get(i10);
                k2 k2Var = (k2) this.f9018d.get(i10);
                if (k2Var == null || k2Var.b() == i1Var) {
                }
            }
            return this.f9016b;
        }
        k();
        for (int i11 = 0; i11 < this.f9016b.size(); i11++) {
            this.f9016b.set(i11, p(i11, true));
        }
        List listUnmodifiableList = DesugarCollections.unmodifiableList(this.f9016b);
        this.f9016b = listUnmodifiableList;
        this.f9017c = false;
        return listUnmodifiableList;
    }

    public void h() {
        this.f9016b = Collections.EMPTY_LIST;
        this.f9017c = false;
        List<k2> list = this.f9018d;
        if (list != null) {
            for (k2 k2Var : list) {
                if (k2Var != null) {
                    k2Var.d();
                }
            }
            this.f9018d = null;
        }
        v();
        t();
    }

    public void i() {
        this.f9015a = null;
    }

    public a.AbstractC0131a l(int i10) {
        j();
        k2 k2Var = (k2) this.f9018d.get(i10);
        if (k2Var == null) {
            k2 k2Var2 = new k2((com.google.protobuf.a) this.f9016b.get(i10), this, this.f9019e);
            this.f9018d.set(i10, k2Var2);
            k2Var = k2Var2;
        }
        return k2Var.e();
    }

    public List m() {
        if (this.f9021g == null) {
            this.f9021g = new a(this);
        }
        return this.f9021g;
    }

    public int n() {
        return this.f9016b.size();
    }

    public com.google.protobuf.a o(int i10) {
        return p(i10, false);
    }

    public List q() {
        if (this.f9020f == null) {
            this.f9020f = new b(this);
        }
        return this.f9020f;
    }

    public o1 r(int i10) {
        List list = this.f9018d;
        if (list == null) {
            return (o1) this.f9016b.get(i10);
        }
        k2 k2Var = (k2) list.get(i10);
        return k2Var == null ? (o1) this.f9016b.get(i10) : k2Var.g();
    }

    public List s() {
        if (this.f9022h == null) {
            this.f9022h = new c(this);
        }
        return this.f9022h;
    }

    public boolean u() {
        return this.f9016b.isEmpty();
    }

    public void w(int i10) {
        k2 k2Var;
        k();
        this.f9016b.remove(i10);
        List list = this.f9018d;
        if (list != null && (k2Var = (k2) list.remove(i10)) != null) {
            k2Var.d();
        }
        v();
        t();
    }

    public g2 x(int i10, com.google.protobuf.a aVar) {
        k2 k2Var;
        o0.a(aVar);
        k();
        this.f9016b.set(i10, aVar);
        List list = this.f9018d;
        if (list != null && (k2Var = (k2) list.set(i10, null)) != null) {
            k2Var.d();
        }
        v();
        t();
        return this;
    }
}
