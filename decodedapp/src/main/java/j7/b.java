package j7;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
final class b extends AbstractCollection implements Deque {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    j7.a f18471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    j7.a f18472b;

    class a extends c {
        a(j7.a aVar) {
            super(aVar);
        }

        @Override // j7.b.c
        j7.a a() {
            return this.f18475a.getNext();
        }
    }

    /* JADX INFO: renamed from: j7.b$b, reason: collision with other inner class name */
    class C0235b extends c {
        C0235b(j7.a aVar) {
            super(aVar);
        }

        @Override // j7.b.c
        j7.a a() {
            return this.f18475a.b();
        }
    }

    abstract class c implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        j7.a f18475a;

        c(j7.a aVar) {
            this.f18475a = aVar;
        }

        abstract j7.a a();

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public j7.a next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            j7.a aVar = this.f18475a;
            this.f18475a = a();
            return aVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f18475a != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    b() {
    }

    @Override // java.util.Deque
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public j7.a pollLast() {
        if (isEmpty()) {
            return null;
        }
        return L();
    }

    @Override // java.util.Deque
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public j7.a pop() {
        return removeFirst();
    }

    @Override // java.util.Deque
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public void push(j7.a aVar) {
        addFirst(aVar);
    }

    @Override // java.util.Deque, java.util.Queue
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public j7.a remove() {
        return removeFirst();
    }

    boolean E(j7.a aVar) {
        if (!f(aVar)) {
            return false;
        }
        J(aVar);
        return true;
    }

    @Override // java.util.Deque
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public j7.a removeFirst() {
        e();
        return pollFirst();
    }

    @Override // java.util.Deque
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public j7.a removeLast() {
        e();
        return pollLast();
    }

    void J(j7.a aVar) {
        j7.a aVarB = aVar.b();
        j7.a next = aVar.getNext();
        if (aVarB == null) {
            this.f18471a = next;
        } else {
            aVarB.a(next);
            aVar.c(null);
        }
        if (next == null) {
            this.f18472b = aVarB;
        } else {
            next.c(aVarB);
            aVar.a(null);
        }
    }

    j7.a K() {
        j7.a aVar = this.f18471a;
        j7.a next = aVar.getNext();
        aVar.a(null);
        this.f18471a = next;
        if (next == null) {
            this.f18472b = null;
            return aVar;
        }
        next.c(null);
        return aVar;
    }

    j7.a L() {
        j7.a aVar = this.f18472b;
        j7.a aVarB = aVar.b();
        aVar.c(null);
        this.f18472b = aVarB;
        if (aVarB == null) {
            this.f18471a = null;
            return aVar;
        }
        aVarB.a(null);
        return aVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Deque, java.util.Queue
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean add(j7.a aVar) {
        return offerLast(aVar);
    }

    @Override // java.util.Deque
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void addFirst(j7.a aVar) {
        if (!offerFirst(aVar)) {
            throw new IllegalArgumentException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        j7.a aVar = this.f18471a;
        while (aVar != null) {
            j7.a next = aVar.getNext();
            aVar.c(null);
            aVar.a(null);
            aVar = next;
        }
        this.f18472b = null;
        this.f18471a = null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Deque
    public boolean contains(Object obj) {
        return (obj instanceof j7.a) && f((j7.a) obj);
    }

    @Override // java.util.Deque
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void addLast(j7.a aVar) {
        if (!offerLast(aVar)) {
            throw new IllegalArgumentException();
        }
    }

    @Override // java.util.Deque
    public Iterator descendingIterator() {
        return new C0235b(this.f18472b);
    }

    void e() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
    }

    boolean f(j7.a aVar) {
        return (aVar.b() == null && aVar.getNext() == null && aVar != this.f18471a) ? false : true;
    }

    @Override // java.util.Deque, java.util.Queue
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public j7.a element() {
        return getFirst();
    }

    @Override // java.util.Deque
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public j7.a getFirst() {
        e();
        return peekFirst();
    }

    @Override // java.util.Deque
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public j7.a getLast() {
        e();
        return peekLast();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.f18471a == null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Deque
    public Iterator iterator() {
        return new a(this.f18471a);
    }

    void j(j7.a aVar) {
        j7.a aVar2 = this.f18471a;
        this.f18471a = aVar;
        if (aVar2 == null) {
            this.f18472b = aVar;
        } else {
            aVar2.c(aVar);
            aVar.a(aVar2);
        }
    }

    void l(j7.a aVar) {
        j7.a aVar2 = this.f18472b;
        this.f18472b = aVar;
        if (aVar2 == null) {
            this.f18471a = aVar;
        } else {
            aVar2.a(aVar);
            aVar.c(aVar2);
        }
    }

    public void m(j7.a aVar) {
        if (aVar != this.f18472b) {
            J(aVar);
            l(aVar);
        }
    }

    @Override // java.util.Deque, java.util.Queue
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public boolean offer(j7.a aVar) {
        return offerLast(aVar);
    }

    @Override // java.util.Deque
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public boolean offerFirst(j7.a aVar) {
        if (f(aVar)) {
            return false;
        }
        j(aVar);
        return true;
    }

    @Override // java.util.Deque
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean offerLast(j7.a aVar) {
        if (f(aVar)) {
            return false;
        }
        l(aVar);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Deque
    public boolean removeFirstOccurrence(Object obj) {
        return remove(obj);
    }

    @Override // java.util.Deque
    public boolean removeLastOccurrence(Object obj) {
        return remove(obj);
    }

    @Override // java.util.Deque, java.util.Queue
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public j7.a peek() {
        return peekFirst();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Deque
    public int size() {
        int i10 = 0;
        for (j7.a next = this.f18471a; next != null; next = next.getNext()) {
            i10++;
        }
        return i10;
    }

    @Override // java.util.Deque
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public j7.a peekFirst() {
        return this.f18471a;
    }

    @Override // java.util.Deque
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public j7.a peekLast() {
        return this.f18472b;
    }

    @Override // java.util.Deque, java.util.Queue
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public j7.a poll() {
        return pollFirst();
    }

    @Override // java.util.Deque
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public j7.a pollFirst() {
        if (isEmpty()) {
            return null;
        }
        return K();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Deque
    public boolean remove(Object obj) {
        return (obj instanceof j7.a) && E((j7.a) obj);
    }
}
