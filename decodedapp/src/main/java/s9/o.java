package s9;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o {

    class a implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f27065a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f27066b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Iterator f27067c;

        a(int i10, Iterator it) {
            this.f27066b = i10;
            this.f27067c = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f27065a < this.f27066b && this.f27067c.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f27065a++;
            return this.f27067c.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f27067c.remove();
        }
    }

    private static final class b extends s9.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final c0 f27068d = new b(new Object[0], 0);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Object[] f27069c;

        b(Object[] objArr, int i10) {
            super(objArr.length, i10);
            this.f27069c = objArr;
        }

        @Override // s9.a
        protected Object a(int i10) {
            return this.f27069c[i10];
        }
    }

    private static class c implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Iterator f27070a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Iterator f27071b = o.d();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Iterator f27072c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Deque f27073d;

        c(Iterator it) {
            this.f27072c = (Iterator) r9.l.n(it);
        }

        private Iterator a() {
            while (true) {
                Iterator it = this.f27072c;
                if (it != null && it.hasNext()) {
                    return this.f27072c;
                }
                Deque deque = this.f27073d;
                if (deque == null || deque.isEmpty()) {
                    return null;
                }
                this.f27072c = (Iterator) this.f27073d.removeFirst();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (!((Iterator) r9.l.n(this.f27071b)).hasNext()) {
                Iterator itA = a();
                this.f27072c = itA;
                if (itA == null) {
                    return false;
                }
                Iterator it = (Iterator) itA.next();
                this.f27071b = it;
                if (it instanceof c) {
                    c cVar = (c) it;
                    this.f27071b = cVar.f27071b;
                    if (this.f27073d == null) {
                        this.f27073d = new ArrayDeque();
                    }
                    this.f27073d.addFirst(this.f27072c);
                    if (cVar.f27073d != null) {
                        while (!cVar.f27073d.isEmpty()) {
                            this.f27073d.addFirst((Iterator) cVar.f27073d.removeLast());
                        }
                    }
                    this.f27072c = cVar.f27072c;
                }
            }
            return true;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Iterator it = this.f27071b;
            this.f27070a = it;
            return it.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            Iterator it = this.f27070a;
            if (it == null) {
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            }
            it.remove();
            this.f27070a = null;
        }
    }

    private static final class d extends b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f27074a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f27075b;

        d(Object obj) {
            this.f27074a = obj;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f27075b;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f27075b) {
                throw new NoSuchElementException();
            }
            this.f27075b = true;
            return this.f27074a;
        }
    }

    public static int a(Iterator it, int i10) {
        r9.l.n(it);
        int i11 = 0;
        r9.l.e(i10 >= 0, "numberToAdvance must be nonnegative");
        while (i11 < i10 && it.hasNext()) {
            it.next();
            i11++;
        }
        return i11;
    }

    public static Iterator b(Iterator it) {
        return new c(it);
    }

    public static boolean c(Iterator it, Iterator it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !r9.h.a(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    static b0 d() {
        return e();
    }

    static c0 e() {
        return b.f27068d;
    }

    public static Iterator f(Iterator it, int i10) {
        r9.l.n(it);
        r9.l.e(i10 >= 0, "limit is negative");
        return new a(i10, it);
    }

    public static b0 g(Object obj) {
        return new d(obj);
    }

    public static String h(Iterator it) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        boolean z10 = true;
        while (it.hasNext()) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(it.next());
            z10 = false;
        }
        sb2.append(']');
        return sb2.toString();
    }
}
