package s9;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n {

    class a extends f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Iterable f27058b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f27059c;

        /* JADX INFO: renamed from: s9.n$a$a, reason: collision with other inner class name */
        class C0372a implements Iterator {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            boolean f27060a = true;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Iterator f27061b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ a f27062c;

            C0372a(a aVar, Iterator it) {
                this.f27061b = it;
                this.f27062c = aVar;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f27061b.hasNext();
            }

            @Override // java.util.Iterator
            public Object next() {
                Object next = this.f27061b.next();
                this.f27060a = false;
                return next;
            }

            @Override // java.util.Iterator
            public void remove() {
                c.c(!this.f27060a);
                this.f27061b.remove();
            }
        }

        a(Iterable iterable, int i10) {
            this.f27058b = iterable;
            this.f27059c = i10;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            Iterable iterable = this.f27058b;
            if (iterable instanceof List) {
                List list = (List) iterable;
                return list.subList(Math.min(list.size(), this.f27059c), list.size()).iterator();
            }
            Iterator it = iterable.iterator();
            o.a(it, this.f27059c);
            return new C0372a(this, it);
        }
    }

    class b extends f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Iterable f27063b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f27064c;

        b(Iterable iterable, int i10) {
            this.f27063b = iterable;
            this.f27064c = i10;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return o.f(this.f27063b.iterator(), this.f27064c);
        }
    }

    public static Iterable a(Iterable iterable, Iterable iterable2) {
        return f.b(iterable, iterable2);
    }

    public static Iterable b(Iterable iterable, int i10) {
        r9.l.n(iterable);
        r9.l.e(i10 >= 0, "limit is negative");
        return new b(iterable, i10);
    }

    public static Iterable c(Iterable iterable, int i10) {
        r9.l.n(iterable);
        r9.l.e(i10 >= 0, "number to skip cannot be negative");
        return new a(iterable, i10);
    }

    public static String d(Iterable iterable) {
        return o.h(iterable.iterator());
    }
}
