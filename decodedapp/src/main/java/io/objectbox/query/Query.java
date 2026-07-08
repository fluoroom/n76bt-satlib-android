package io.objectbox.query;

import ec.f;
import fc.k;
import io.objectbox.BoxStore;
import io.objectbox.query.Query;
import java.io.Closeable;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public class Query<T> implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.objectbox.a f17393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BoxStore f17394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f17395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f17396d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Comparator f17397e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f17398f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    volatile long f17399g;

    Query(io.objectbox.a aVar, long j10, List list, f fVar, Comparator comparator) {
        this.f17393a = aVar;
        BoxStore boxStoreJ = aVar.j();
        this.f17394b = boxStoreJ;
        this.f17398f = boxStoreJ.w0();
        this.f17399g = j10;
        this.f17395c = new c(this, aVar);
        this.f17396d = list;
        this.f17397e = comparator;
    }

    public static /* synthetic */ List a(Query query, long j10, long j11) throws Exception {
        List<T> listNativeFind = query.nativeFind(query.f17399g, query.r(), j10, j11);
        query.h0(listNativeFind);
        return listNativeFind;
    }

    public static /* synthetic */ Object k(Query query) {
        Object objNativeFindFirst = query.nativeFindFirst(query.f17399g, query.r());
        query.T(objNativeFindFirst);
        return objNativeFindFirst;
    }

    public static /* synthetic */ List l(Query query) throws Exception {
        List<T> listNativeFind = query.nativeFind(query.f17399g, query.r(), 0L, 0L);
        query.h0(listNativeFind);
        Comparator comparator = query.f17397e;
        if (comparator != null) {
            Collections.sort(listNativeFind, comparator);
        }
        return listNativeFind;
    }

    private void q() {
        if (this.f17399g == 0) {
            throw new IllegalStateException("This query is closed. Build and use a new one.");
        }
    }

    private void s() {
        if (this.f17397e != null) {
            throw new UnsupportedOperationException("Does not work with a sorting comparator. Only find() supports sorting with a comparator.");
        }
    }

    private void v() {
    }

    private void w() {
        v();
        s();
    }

    public List G(final long j10, final long j11) {
        w();
        return (List) n(new Callable() { // from class: ec.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Query.a(this.f11737a, j10, j11);
            }
        });
    }

    public Object H() {
        w();
        return n(new Callable() { // from class: ec.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Query.k(this.f11742a);
            }
        });
    }

    public long S() {
        q();
        v();
        return ((Long) this.f17393a.m(new cc.a() { // from class: ec.e
            @Override // cc.a
            public final Object a(long j10) {
                Query query = this.f11743a;
                return Long.valueOf(query.nativeRemove(query.f17399g, j10));
            }
        })).longValue();
    }

    void T(Object obj) {
        List list = this.f17396d;
        if (list == null || obj == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            W(obj, null);
        }
    }

    void W(Object obj, a aVar) {
        if (this.f17396d != null) {
            throw null;
        }
    }

    void X(Object obj, int i10) {
        Iterator it = this.f17396d.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f17395c.h();
        if (this.f17399g != 0) {
            long j10 = this.f17399g;
            this.f17399g = 0L;
            nativeDestroy(j10);
        }
    }

    public long count() {
        q();
        v();
        return ((Long) this.f17393a.l(new cc.a() { // from class: ec.c
            @Override // cc.a
            public final Object a(long j10) {
                Query query = this.f11741a;
                return Long.valueOf(query.nativeCount(query.f17399g, j10));
            }
        })).longValue();
    }

    protected void finalize() throws Throwable {
        close();
        super.finalize();
    }

    void h0(List list) {
        if (this.f17396d != null) {
            Iterator it = list.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                X(it.next(), i10);
                i10++;
            }
        }
    }

    Object n(Callable callable) {
        q();
        return this.f17394b.n(callable, this.f17398f, 10, true);
    }

    native long nativeCount(long j10, long j11);

    native void nativeDestroy(long j10);

    native List<T> nativeFind(long j10, long j11, long j12, long j13) throws Exception;

    native Object nativeFindFirst(long j10, long j11);

    native long nativeRemove(long j10, long j11);

    public k p0() {
        q();
        return new k(this.f17395c, null);
    }

    long r() {
        return io.objectbox.c.a(this.f17393a);
    }

    public List x() {
        return (List) n(new Callable() { // from class: ec.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Query.l(this.f11740a);
            }
        });
    }
}
