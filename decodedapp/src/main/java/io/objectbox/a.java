package io.objectbox;

import io.objectbox.query.QueryBuilder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BoxStore f17348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f17349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final ThreadLocal f17350c = new ThreadLocal();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ThreadLocal f17351d = new ThreadLocal();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final cc.c f17352e;

    a(BoxStore boxStore, Class cls) {
        this.f17348a = boxStore;
        this.f17349b = cls;
        this.f17352e = boxStore.W(cls).u();
    }

    public void a() {
        Cursor cursor = (Cursor) this.f17351d.get();
        if (cursor != null) {
            cursor.close();
            cursor.r().close();
            this.f17351d.remove();
        }
    }

    void b(Cursor cursor) {
        if (this.f17350c.get() == null) {
            cursor.close();
            cursor.r().k();
        }
    }

    public long c() {
        return d(0L);
    }

    public long d(long j10) {
        Cursor cursorI = i();
        try {
            return cursorI.a(j10);
        } finally {
            s(cursorI);
        }
    }

    public Object e(long j10) {
        Cursor cursorI = i();
        try {
            return cursorI.l(j10);
        } finally {
            s(cursorI);
        }
    }

    Cursor f() {
        Transaction transaction = (Transaction) this.f17348a.A.get();
        if (transaction == null) {
            return null;
        }
        if (transaction.isClosed()) {
            throw new IllegalStateException("Active TX is closed");
        }
        Cursor cursor = (Cursor) this.f17350c.get();
        if (cursor != null && !cursor.r().isClosed()) {
            return cursor;
        }
        Cursor cursorL = transaction.l(this.f17349b);
        this.f17350c.set(cursorL);
        return cursorL;
    }

    public List g() {
        ArrayList arrayList = new ArrayList();
        Cursor cursorI = i();
        try {
            for (Object objK = cursorI.k(); objK != null; objK = cursorI.v()) {
                arrayList.add(objK);
            }
            return arrayList;
        } finally {
            s(cursorI);
        }
    }

    public Class h() {
        return this.f17349b;
    }

    Cursor i() {
        Cursor cursorF = f();
        if (cursorF != null) {
            return cursorF;
        }
        Cursor cursor = (Cursor) this.f17351d.get();
        if (cursor == null) {
            Cursor cursorL = this.f17348a.c().l(this.f17349b);
            this.f17351d.set(cursorL);
            return cursorL;
        }
        Transaction transaction = cursor.f17334a;
        if (transaction.isClosed() || !transaction.s()) {
            throw new IllegalStateException("Illegal reader TX state");
        }
        transaction.w();
        cursor.x();
        return cursor;
    }

    public BoxStore j() {
        return this.f17348a;
    }

    Cursor k() {
        Cursor cursorF = f();
        if (cursorF != null) {
            return cursorF;
        }
        Transaction transactionE = this.f17348a.e();
        try {
            return transactionE.l(this.f17349b);
        } catch (RuntimeException e10) {
            transactionE.close();
            throw e10;
        }
    }

    public Object l(cc.a aVar) {
        Cursor cursorI = i();
        try {
            return aVar.a(cursorI.s());
        } finally {
            s(cursorI);
        }
    }

    public Object m(cc.a aVar) {
        Cursor cursorK = k();
        try {
            Object objA = aVar.a(cursorK.s());
            b(cursorK);
            return objA;
        } finally {
            t(cursorK);
        }
    }

    public long n(Object obj) {
        Cursor cursorK = k();
        try {
            long jW = cursorK.w(obj);
            b(cursorK);
            return jW;
        } finally {
            t(cursorK);
        }
    }

    public void o(Collection collection) {
        if (collection == null || collection.isEmpty()) {
            return;
        }
        Cursor cursorK = k();
        try {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                cursorK.w(it.next());
            }
            b(cursorK);
            t(cursorK);
        } catch (Throwable th2) {
            t(cursorK);
            throw th2;
        }
    }

    public void p(Collection collection, int i10) {
        if (i10 < 1) {
            throw new IllegalArgumentException("Batch size must be 1 or greater but was " + i10);
        }
        if (collection == null) {
            return;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Cursor cursorK = k();
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                if (i11 >= i10) {
                    break;
                }
                try {
                    if (!it.hasNext()) {
                        break;
                    }
                    cursorK.w(it.next());
                    i11 = i12;
                } catch (Throwable th2) {
                    t(cursorK);
                    throw th2;
                }
            }
            b(cursorK);
            t(cursorK);
        }
    }

    public QueryBuilder q() {
        return new QueryBuilder(this, this.f17348a.p0(), this.f17348a.S(this.f17349b));
    }

    void r(Transaction transaction) {
        Cursor cursor = (Cursor) this.f17350c.get();
        if (cursor == null || cursor.r() != transaction) {
            return;
        }
        this.f17350c.remove();
        cursor.close();
    }

    void s(Cursor cursor) {
        if (this.f17350c.get() == null) {
            Transaction transactionR = cursor.r();
            if (transactionR.isClosed() || transactionR.s() || !transactionR.r()) {
                throw new IllegalStateException("Illegal reader TX state");
            }
            transactionR.v();
        }
    }

    void t(Cursor cursor) {
        if (this.f17350c.get() == null) {
            Transaction transactionR = cursor.r();
            if (transactionR.isClosed()) {
                return;
            }
            cursor.close();
            transactionR.a();
            transactionR.close();
        }
    }

    public void u(Collection collection) {
        if (collection == null || collection.isEmpty()) {
            return;
        }
        Cursor cursorK = k();
        try {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                cursorK.e(cursorK.n(it.next()));
            }
            b(cursorK);
            t(cursorK);
        } catch (Throwable th2) {
            t(cursorK);
            throw th2;
        }
    }

    public boolean v(long j10) {
        Cursor cursorK = k();
        try {
            boolean zE = cursorK.e(j10);
            b(cursorK);
            return zE;
        } finally {
            t(cursorK);
        }
    }

    public boolean w(Object obj) {
        Cursor cursorK = k();
        try {
            boolean zE = cursorK.e(cursorK.n(obj));
            b(cursorK);
            return zE;
        } finally {
            t(cursorK);
        }
    }

    public void x() {
        Cursor cursorK = k();
        try {
            cursorK.c();
            b(cursorK);
        } finally {
            t(cursorK);
        }
    }

    void y(Transaction transaction) {
        Cursor cursor = (Cursor) this.f17350c.get();
        if (cursor != null) {
            this.f17350c.remove();
            cursor.close();
        }
    }
}
