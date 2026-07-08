package og;

import ed.r0;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import rd.h0;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends ed.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f23578c = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f23579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f23580b;

    private static final class a implements Iterator, sd.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Iterator f23581a;

        public a(Object[] objArr) {
            m.e(objArr, "array");
            this.f23581a = rd.c.a(objArr);
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f23581a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return this.f23581a.next();
        }
    }

    public static final class b {
        public /* synthetic */ b(rd.h hVar) {
            this();
        }

        public final k a() {
            return new k(null);
        }

        public final k b(Collection collection) {
            m.e(collection, "set");
            k kVar = new k(null);
            kVar.addAll(collection);
            return kVar;
        }

        private b() {
        }
    }

    private static final class c implements Iterator, sd.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f23582a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f23583b = true;

        public c(Object obj) {
            this.f23582a = obj;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f23583b;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!this.f23583b) {
                throw new NoSuchElementException();
            }
            this.f23583b = false;
            return this.f23582a;
        }
    }

    public /* synthetic */ k(rd.h hVar) {
        this();
    }

    public static final k c() {
        return f23578c.a();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        Object obj2;
        if (size() == 0) {
            this.f23579a = obj;
        } else if (size() == 1) {
            if (m.a(this.f23579a, obj)) {
                return false;
            }
            this.f23579a = new Object[]{this.f23579a, obj};
        } else if (size() < 5) {
            Object obj3 = this.f23579a;
            m.c(obj3, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            Object[] objArr = (Object[]) obj3;
            if (ed.j.z(objArr, obj)) {
                return false;
            }
            if (size() == 4) {
                LinkedHashSet linkedHashSetE = r0.e(Arrays.copyOf(objArr, objArr.length));
                linkedHashSetE.add(obj);
                obj2 = linkedHashSetE;
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(objArr, size() + 1);
                m.d(objArrCopyOf, "copyOf(...)");
                objArrCopyOf[objArrCopyOf.length - 1] = obj;
                obj2 = objArrCopyOf;
            }
            this.f23579a = obj2;
        } else {
            Object obj4 = this.f23579a;
            m.c(obj4, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
            if (!h0.b(obj4).add(obj)) {
                return false;
            }
        }
        d(size() + 1);
        return true;
    }

    @Override // ed.g
    public int b() {
        return this.f23580b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f23579a = null;
        d(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (size() == 0) {
            return false;
        }
        if (size() == 1) {
            return m.a(this.f23579a, obj);
        }
        if (size() < 5) {
            Object obj2 = this.f23579a;
            m.c(obj2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return ed.j.z((Object[]) obj2, obj);
        }
        Object obj3 = this.f23579a;
        m.c(obj3, "null cannot be cast to non-null type kotlin.collections.Set<T of org.jetbrains.kotlin.utils.SmartSet>");
        return ((Set) obj3).contains(obj);
    }

    public void d(int i10) {
        this.f23580b = i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        if (size() == 0) {
            return Collections.EMPTY_SET.iterator();
        }
        if (size() == 1) {
            return new c(this.f23579a);
        }
        if (size() < 5) {
            Object obj = this.f23579a;
            m.c(obj, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return new a((Object[]) obj);
        }
        Object obj2 = this.f23579a;
        m.c(obj2, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
        return h0.b(obj2).iterator();
    }

    private k() {
    }
}
