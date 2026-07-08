package io.objectbox.query;

import io.objectbox.e;
import io.objectbox.exception.DbException;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class QueryBuilder<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.objectbox.a f17400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f17401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f17402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f17403d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f17404e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f17405f = a.NONE;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List f17406g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Comparator f17407h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f17408i;

    enum a {
        NONE,
        AND,
        OR
    }

    public QueryBuilder(io.objectbox.a aVar, long j10, String str) {
        this.f17400a = aVar;
        this.f17401b = j10;
        long jNativeCreate = nativeCreate(j10, str);
        this.f17402c = jNativeCreate;
        if (jNativeCreate == 0) {
            throw new DbException("Could not create native query builder");
        }
        this.f17408i = false;
    }

    private void b(long j10) {
        QueryBuilder<T> queryBuilder;
        long j11;
        a aVar = this.f17405f;
        a aVar2 = a.NONE;
        if (aVar != aVar2) {
            queryBuilder = this;
            j11 = j10;
            queryBuilder.f17403d = queryBuilder.nativeCombine(this.f17402c, this.f17403d, j11, aVar == a.OR);
            queryBuilder.f17405f = aVar2;
        } else {
            queryBuilder = this;
            j11 = j10;
            queryBuilder.f17403d = j11;
        }
        queryBuilder.f17404e = j11;
    }

    private void c() {
        if (this.f17405f != a.NONE) {
            throw new IllegalStateException("Another operator is pending. Use operators like and() and or() only between two conditions.");
        }
    }

    private void k() {
        if (this.f17402c == 0) {
            throw new IllegalStateException("This QueryBuilder has already been closed. Please use a new instance.");
        }
    }

    private void l() {
        if (this.f17408i) {
            throw new IllegalStateException("This call is not supported on sub query builders (links)");
        }
    }

    private native long nativeBuild(long j10);

    private native long nativeCombine(long j10, long j11, long j12, boolean z10);

    private native long nativeCreate(long j10, String str);

    private native void nativeDestroy(long j10);

    private native long nativeEqual(long j10, int i10, long j11);

    private native long nativeIn(long j10, int i10, int[] iArr, boolean z10);

    private native long nativeNotEqual(long j10, int i10, long j11);

    private native void nativeOrder(long j10, int i10, int i11);

    public Query a() {
        l();
        k();
        if (this.f17405f != a.NONE) {
            throw new IllegalStateException("Incomplete logic condition. Use or()/and() between two conditions only.");
        }
        long jNativeBuild = nativeBuild(this.f17402c);
        if (jNativeBuild == 0) {
            throw new DbException("Could not create native query");
        }
        Query query = new Query(this.f17400a, jNativeBuild, this.f17406g, null, this.f17407h);
        d();
        return query;
    }

    public synchronized void d() {
        long j10 = this.f17402c;
        if (j10 != 0) {
            this.f17402c = 0L;
            if (!this.f17408i) {
                nativeDestroy(j10);
            }
        }
    }

    public QueryBuilder e(e eVar, long j10) {
        k();
        b(nativeEqual(this.f17402c, eVar.a(), j10));
        return this;
    }

    public QueryBuilder f(e eVar, int[] iArr) {
        k();
        b(nativeIn(this.f17402c, eVar.a(), iArr, false));
        return this;
    }

    protected void finalize() throws Throwable {
        d();
        super.finalize();
    }

    public QueryBuilder g(e eVar, long j10) {
        k();
        b(nativeNotEqual(this.f17402c, eVar.a(), j10));
        return this;
    }

    public QueryBuilder h(e eVar) {
        return i(eVar, 0);
    }

    public QueryBuilder i(e eVar, int i10) {
        l();
        k();
        c();
        nativeOrder(this.f17402c, eVar.a(), i10);
        return this;
    }

    public QueryBuilder j(e eVar) {
        return i(eVar, 1);
    }
}
