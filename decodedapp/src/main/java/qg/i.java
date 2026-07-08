package qg;

import dd.d0;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
final class i extends j implements Iterator, hd.e, sd.a {

    /* JADX INFO: renamed from: a */
    private int f25197a;

    /* JADX INFO: renamed from: b */
    private Object f25198b;

    /* JADX INFO: renamed from: c */
    private Iterator f25199c;

    /* JADX INFO: renamed from: d */
    private hd.e f25200d;

    private final Throwable h() {
        int i10 = this.f25197a;
        if (i10 == 4) {
            return new NoSuchElementException();
        }
        if (i10 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f25197a);
    }

    private final Object i() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    @Override // qg.j
    public Object c(Object obj, hd.e eVar) {
        this.f25198b = obj;
        this.f25197a = 3;
        this.f25200d = eVar;
        Object objE = id.b.e();
        if (objE == id.b.e()) {
            jd.h.c(eVar);
        }
        return objE == id.b.e() ? objE : d0.f10897a;
    }

    @Override // hd.e
    public void d(Object obj) {
        dd.s.b(obj);
        this.f25197a = 4;
    }

    @Override // qg.j
    public Object f(Iterator it, hd.e eVar) {
        if (!it.hasNext()) {
            return d0.f10897a;
        }
        this.f25199c = it;
        this.f25197a = 2;
        this.f25200d = eVar;
        Object objE = id.b.e();
        if (objE == id.b.e()) {
            jd.h.c(eVar);
        }
        return objE == id.b.e() ? objE : d0.f10897a;
    }

    @Override // hd.e
    public hd.i getContext() {
        return hd.j.f15243a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() throws Throwable {
        while (true) {
            int i10 = this.f25197a;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2 || i10 == 3) {
                        return true;
                    }
                    if (i10 == 4) {
                        return false;
                    }
                    throw h();
                }
                Iterator it = this.f25199c;
                rd.m.b(it);
                if (it.hasNext()) {
                    this.f25197a = 2;
                    return true;
                }
                this.f25199c = null;
            }
            this.f25197a = 5;
            hd.e eVar = this.f25200d;
            rd.m.b(eVar);
            this.f25200d = null;
            eVar.d(dd.r.a(d0.f10897a));
        }
    }

    public final void j(hd.e eVar) {
        this.f25200d = eVar;
    }

    @Override // java.util.Iterator
    public Object next() throws Throwable {
        int i10 = this.f25197a;
        if (i10 == 0 || i10 == 1) {
            return i();
        }
        if (i10 == 2) {
            this.f25197a = 1;
            Iterator it = this.f25199c;
            rd.m.b(it);
            return it.next();
        }
        if (i10 != 3) {
            throw h();
        }
        this.f25197a = 0;
        Object obj = this.f25198b;
        this.f25198b = null;
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
