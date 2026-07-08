package qg;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class r extends m {

    public static final class a implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterator f25204a;

        public a(Iterator it) {
            this.f25204a = it;
        }

        @Override // qg.h
        public Iterator iterator() {
            return this.f25204a;
        }
    }

    public static final class b implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f25205a;

        public b(Object obj) {
            this.f25205a = obj;
        }

        @Override // qg.h
        public Iterator iterator() {
            return new c(this.f25205a);
        }
    }

    public static final class c implements Iterator, sd.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f25206a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f25207b;

        c(Object obj) {
            this.f25207b = obj;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f25206a;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!this.f25206a) {
                throw new NoSuchElementException();
            }
            this.f25206a = false;
            return this.f25207b;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static h g(Iterator it) {
        rd.m.e(it, "<this>");
        return h(new a(it));
    }

    public static final h h(h hVar) {
        rd.m.e(hVar, "<this>");
        return hVar instanceof qg.a ? hVar : new qg.a(hVar);
    }

    public static h i() {
        return d.f25177a;
    }

    public static final h j(h hVar) {
        rd.m.e(hVar, "<this>");
        return k(hVar, new qd.l() { // from class: qg.p
            @Override // qd.l
            public final Object l(Object obj) {
                return r.l((h) obj);
            }
        });
    }

    private static final h k(h hVar, qd.l lVar) {
        return hVar instanceof w ? ((w) hVar).d(lVar) : new f(hVar, new qd.l() { // from class: qg.q
            @Override // qd.l
            public final Object l(Object obj) {
                return r.m(obj);
            }
        }, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterator l(h hVar) {
        rd.m.e(hVar, "it");
        return hVar.iterator();
    }

    public static h n(final Object obj, qd.l lVar) {
        rd.m.e(lVar, "nextFunction");
        return obj == null ? d.f25177a : new g(new qd.a() { // from class: qg.n
            @Override // qd.a
            public final Object a() {
                return r.q(obj);
            }
        }, lVar);
    }

    public static h o(final qd.a aVar) {
        rd.m.e(aVar, "nextFunction");
        return h(new g(aVar, new qd.l() { // from class: qg.o
            @Override // qd.l
            public final Object l(Object obj) {
                return r.p(aVar, obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object p(qd.a aVar, Object obj) {
        rd.m.e(obj, "it");
        return aVar.a();
    }

    public static final h r(Object obj) {
        return new b(obj);
    }

    public static h s(Object... objArr) {
        rd.m.e(objArr, "elements");
        return ed.j.x(objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object m(Object obj) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object q(Object obj) {
        return obj;
    }
}
