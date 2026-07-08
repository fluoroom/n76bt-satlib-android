package j7;

import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ConcurrentMap;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: loaded from: classes.dex */
public final class c extends AbstractMap implements ConcurrentMap, Serializable, j$.util.concurrent.ConcurrentMap {
    static final int A;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    static final int f18477y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    static final int f18478z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ConcurrentMap f18479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f18480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long[] f18481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final j7.b f18482d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final AtomicLong f18483e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final AtomicLong f18484f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final Lock f18485g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Queue f18486h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final AtomicLongArray f18487r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final AtomicLongArray f18488s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final AtomicReferenceArray f18489t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    final AtomicReference f18490u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    transient Set f18491v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    transient Collection f18492w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    transient Set f18493x;

    final class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final i f18494a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f18495b;

        b(i iVar, int i10) {
            this.f18495b = i10;
            this.f18494a = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            AtomicLong atomicLong = c.this.f18483e;
            atomicLong.lazySet(atomicLong.get() + ((long) this.f18495b));
            if (((n) this.f18494a.get()).b()) {
                c.this.f18482d.add(this.f18494a);
                c.this.n();
            }
        }
    }

    /* JADX INFO: renamed from: j7.c$c, reason: collision with other inner class name */
    public static final class C0236c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f18499c = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f18498b = 16;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f18497a = 16;

        public c a() {
            c.g(this.f18499c >= 0);
            return new c(this);
        }

        public C0236c b(int i10) {
            c.e(i10 > 0);
            this.f18497a = i10;
            return this;
        }

        public C0236c c(int i10) {
            c.e(i10 >= 0);
            this.f18498b = i10;
            return this;
        }

        public C0236c d(long j10) {
            c.e(j10 >= 0);
            this.f18499c = j10;
            return this;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    static abstract class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f18500a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f18501b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f18502c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ d[] f18503d;

        enum a extends d {
            a(String str, int i10) {
                super(str, i10);
            }

            @Override // j7.c.d
            boolean a(boolean z10) {
                return !z10;
            }
        }

        enum b extends d {
            b(String str, int i10) {
                super(str, i10);
            }

            @Override // j7.c.d
            boolean a(boolean z10) {
                return true;
            }
        }

        /* JADX INFO: renamed from: j7.c$d$c, reason: collision with other inner class name */
        enum C0237c extends d {
            C0237c(String str, int i10) {
                super(str, i10);
            }

            @Override // j7.c.d
            boolean a(boolean z10) {
                return false;
            }
        }

        static {
            a aVar = new a("IDLE", 0);
            f18500a = aVar;
            b bVar = new b("REQUIRED", 1);
            f18501b = bVar;
            C0237c c0237c = new C0237c("PROCESSING", 2);
            f18502c = c0237c;
            f18503d = new d[]{aVar, bVar, c0237c};
        }

        private d(String str, int i10) {
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f18503d.clone();
        }

        abstract boolean a(boolean z10);
    }

    final class e implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Iterator f18504a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        i f18505b;

        e() {
            this.f18504a = c.this.f18479a.values().iterator();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            this.f18505b = (i) this.f18504a.next();
            return c.this.new o(this.f18505b);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f18504a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            c.g(this.f18505b != null);
            c.this.remove(this.f18505b.f18514a);
            this.f18505b = null;
        }
    }

    final class f extends AbstractSet {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final c f18507a;

        f() {
            this.f18507a = c.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry entry) {
            throw new UnsupportedOperationException("ConcurrentLinkedHashMap does not allow add to be called on entrySet()");
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.f18507a.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            i iVar = (i) this.f18507a.f18479a.get(entry.getKey());
            return iVar != null && iVar.f().equals(entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return c.this.new e();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f18507a.remove(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f18507a.size();
        }
    }

    final class g implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Iterator f18509a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f18510b;

        g() {
            this.f18509a = c.this.f18479a.keySet().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f18509a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            Object next = this.f18509a.next();
            this.f18510b = next;
            return next;
        }

        @Override // java.util.Iterator
        public void remove() {
            c.g(this.f18510b != null);
            c.this.remove(this.f18510b);
            this.f18510b = null;
        }
    }

    final class h extends AbstractSet {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final c f18512a;

        h() {
            this.f18512a = c.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.f18512a.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return c.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return c.this.new g();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return this.f18512a.remove(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f18512a.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return this.f18512a.f18479a.keySet().toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray(Object[] objArr) {
            return this.f18512a.f18479a.keySet().toArray(objArr);
        }
    }

    static final class i extends AtomicReference implements j7.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f18514a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        i f18515b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        i f18516c;

        i(Object obj, n nVar) {
            super(nVar);
            this.f18514a = obj;
        }

        @Override // j7.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public i getNext() {
            return this.f18516c;
        }

        @Override // j7.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public i b() {
            return this.f18515b;
        }

        Object f() {
            return ((n) get()).f18527b;
        }

        @Override // j7.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void a(i iVar) {
            this.f18516c = iVar;
        }

        @Override // j7.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void c(i iVar) {
            this.f18515b = iVar;
        }
    }

    final class j implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final i f18517a;

        j(i iVar) {
            this.f18517a = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.f18482d.E(this.f18517a);
            c.this.p(this.f18517a);
        }
    }

    final class k implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f18519a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final i f18520b;

        k(i iVar, int i10) {
            this.f18519a = i10;
            this.f18520b = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            AtomicLong atomicLong = c.this.f18483e;
            atomicLong.lazySet(atomicLong.get() + ((long) this.f18519a));
            c.this.c(this.f18520b);
            c.this.n();
        }
    }

    final class l implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Iterator f18522a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        i f18523b;

        l() {
            this.f18522a = c.this.f18479a.values().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f18522a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            i iVar = (i) this.f18522a.next();
            this.f18523b = iVar;
            return iVar.f();
        }

        @Override // java.util.Iterator
        public void remove() {
            c.g(this.f18523b != null);
            c.this.remove(this.f18523b.f18514a);
            this.f18523b = null;
        }
    }

    final class m extends AbstractCollection {
        m() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            c.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return c.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return c.this.new l();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return c.this.size();
        }
    }

    static final class n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f18526a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Object f18527b;

        n(Object obj, int i10) {
            this.f18526a = i10;
            this.f18527b = obj;
        }

        boolean a(Object obj) {
            Object obj2 = this.f18527b;
            return obj == obj2 || obj2.equals(obj);
        }

        boolean b() {
            return this.f18526a > 0;
        }
    }

    final class o extends AbstractMap.SimpleEntry {
        o(i iVar) {
            super(iVar.f18514a, iVar.f());
        }

        @Override // java.util.AbstractMap.SimpleEntry, java.util.Map.Entry
        public Object setValue(Object obj) {
            c.this.put(getKey(), obj);
            return super.setValue(obj);
        }
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        f18477y = iAvailableProcessors;
        int iMin = Math.min(4, d(iAvailableProcessors));
        f18478z = iMin;
        A = iMin - 1;
    }

    c(C0236c c0236c) {
        int i10 = c0236c.f18497a;
        this.f18480b = i10;
        this.f18484f = new AtomicLong(Math.min(c0236c.f18499c, 9223372034707292160L));
        this.f18479a = new ConcurrentHashMap(c0236c.f18498b, 0.75f, i10);
        this.f18485g = new ReentrantLock();
        this.f18483e = new AtomicLong();
        this.f18482d = new j7.b();
        this.f18486h = new ConcurrentLinkedQueue();
        this.f18490u = new AtomicReference(d.f18500a);
        int i11 = f18478z;
        this.f18481c = new long[i11];
        this.f18487r = new AtomicLongArray(i11);
        this.f18488s = new AtomicLongArray(i11);
        this.f18489t = new AtomicReferenceArray(i11 * 16);
    }

    static int d(int i10) {
        return 1 << (32 - Integer.numberOfLeadingZeros(i10 - 1));
    }

    static void e(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    static void f(Object obj) {
        obj.getClass();
    }

    static void g(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    static int s() {
        return A & ((int) Thread.currentThread().getId());
    }

    private static int t(int i10, int i11) {
        return (i10 * 16) + i11;
    }

    void a(i iVar) {
        int iS = s();
        i(iS, v(iS, iVar));
    }

    void b(Runnable runnable) {
        this.f18486h.add(runnable);
        this.f18490u.lazySet(d.f18501b);
        w();
    }

    void c(i iVar) {
        if (this.f18482d.f(iVar)) {
            this.f18482d.m(iVar);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f18485g.lock();
        while (true) {
            try {
                i iVar = (i) this.f18482d.poll();
                if (iVar == null) {
                    break;
                }
                this.f18479a.remove(iVar.f18514a, iVar);
                p(iVar);
            } catch (Throwable th2) {
                this.f18485g.unlock();
                throw th2;
            }
        }
        for (int i10 = 0; i10 < this.f18489t.length(); i10++) {
            this.f18489t.lazySet(i10, null);
        }
        while (true) {
            Runnable runnable = (Runnable) this.f18486h.poll();
            if (runnable == null) {
                this.f18485g.unlock();
                return;
            }
            runnable.run();
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return ConcurrentMap.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return ConcurrentMap.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return ConcurrentMap.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f18479a.containsKey(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        f(obj);
        Iterator it = this.f18479a.values().iterator();
        while (it.hasNext()) {
            if (((i) it.next()).f().equals(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        Set set = this.f18493x;
        if (set != null) {
            return set;
        }
        f fVar = new f();
        this.f18493x = fVar;
        return fVar;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        ConcurrentMap.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        i iVar = (i) this.f18479a.get(obj);
        if (iVar == null) {
            return null;
        }
        a(iVar);
        return iVar.f();
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return ConcurrentMap.CC.$default$getOrDefault(this, obj, obj2);
    }

    void h() {
        k();
        l();
    }

    void i(int i10, long j10) {
        if (((d) this.f18490u.get()).a(j10 - this.f18488s.get(i10) < 4)) {
            w();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return this.f18479a.isEmpty();
    }

    void j(int i10) {
        long j10 = this.f18487r.get(i10);
        for (int i11 = 0; i11 < 8; i11++) {
            int iT = t(i10, (int) (this.f18481c[i10] & 15));
            i iVar = (i) this.f18489t.get(iT);
            if (iVar == null) {
                break;
            }
            this.f18489t.lazySet(iT, null);
            c(iVar);
            long[] jArr = this.f18481c;
            jArr[i10] = jArr[i10] + 1;
        }
        this.f18488s.lazySet(i10, j10);
    }

    void k() {
        int id2 = (int) Thread.currentThread().getId();
        int i10 = f18478z + id2;
        while (id2 < i10) {
            j(A & id2);
            id2++;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set set = this.f18491v;
        if (set != null) {
            return set;
        }
        h hVar = new h();
        this.f18491v = hVar;
        return hVar;
    }

    void l() {
        Runnable runnable;
        for (int i10 = 0; i10 < 16 && (runnable = (Runnable) this.f18486h.poll()) != null; i10++) {
            runnable.run();
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return ConcurrentMap.CC.$default$merge(this, obj, obj2, biFunction);
    }

    void n() {
        i iVar;
        while (o() && (iVar = (i) this.f18482d.poll()) != null) {
            this.f18479a.remove(iVar.f18514a, iVar);
            p(iVar);
        }
    }

    boolean o() {
        return this.f18483e.get() > this.f18484f.get();
    }

    void p(i iVar) {
        n nVar;
        do {
            nVar = (n) iVar.get();
        } while (!iVar.compareAndSet(nVar, new n(nVar.f18527b, 0)));
        AtomicLong atomicLong = this.f18483e;
        atomicLong.lazySet(atomicLong.get() - ((long) Math.abs(nVar.f18526a)));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        return r(obj, obj2, false);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public Object putIfAbsent(Object obj, Object obj2) {
        return r(obj, obj2, true);
    }

    void q(i iVar) {
        n nVar;
        do {
            nVar = (n) iVar.get();
            if (!nVar.b()) {
                return;
            }
        } while (!iVar.compareAndSet(nVar, new n(nVar.f18527b, -nVar.f18526a)));
    }

    Object r(Object obj, Object obj2, boolean z10) {
        n nVar;
        f(obj);
        f(obj2);
        n nVar2 = new n(obj2, 1);
        i iVar = new i(obj, nVar2);
        while (true) {
            i iVar2 = (i) this.f18479a.putIfAbsent(iVar.f18514a, iVar);
            if (iVar2 == null) {
                b(new b(iVar, 1));
                return null;
            }
            if (z10) {
                a(iVar2);
                return iVar2.f();
            }
            do {
                nVar = (n) iVar2.get();
                if (!nVar.b()) {
                    break;
                }
            } while (!iVar2.compareAndSet(nVar, nVar2));
            int i10 = 1 - nVar.f18526a;
            if (i10 == 0) {
                a(iVar2);
            } else {
                b(new k(iVar2, i10));
            }
            return nVar.f18527b;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        i iVar = (i) this.f18479a.remove(obj);
        if (iVar == null) {
            return null;
        }
        q(iVar);
        b(new j(iVar));
        return iVar.f();
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public Object replace(Object obj, Object obj2) {
        n nVar;
        f(obj);
        f(obj2);
        n nVar2 = new n(obj2, 1);
        i iVar = (i) this.f18479a.get(obj);
        if (iVar == null) {
            return null;
        }
        do {
            nVar = (n) iVar.get();
            if (!nVar.b()) {
                return null;
            }
        } while (!iVar.compareAndSet(nVar, nVar2));
        int i10 = 1 - nVar.f18526a;
        if (i10 == 0) {
            a(iVar);
        } else {
            b(new k(iVar, i10));
        }
        return nVar.f18527b;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        ConcurrentMap.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f18479a.size();
    }

    long v(int i10, i iVar) {
        long j10 = this.f18487r.get(i10);
        this.f18487r.lazySet(i10, 1 + j10);
        this.f18489t.lazySet(t(i10, (int) (15 & j10)), iVar);
        return j10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection values() {
        Collection collection = this.f18492w;
        if (collection != null) {
            return collection;
        }
        m mVar = new m();
        this.f18492w = mVar;
        return mVar;
    }

    void w() {
        if (this.f18485g.tryLock()) {
            try {
                AtomicReference atomicReference = this.f18490u;
                d dVar = d.f18502c;
                atomicReference.lazySet(dVar);
                h();
                androidx.lifecycle.b.a(this.f18490u, dVar, d.f18500a);
                this.f18485g.unlock();
            } catch (Throwable th2) {
                androidx.lifecycle.b.a(this.f18490u, d.f18502c, d.f18500a);
                this.f18485g.unlock();
                throw th2;
            }
        }
    }

    boolean x(i iVar, n nVar) {
        if (nVar.b()) {
            return iVar.compareAndSet(nVar, new n(nVar.f18527b, -nVar.f18526a));
        }
        return false;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public boolean remove(Object obj, Object obj2) {
        i iVar = (i) this.f18479a.get(obj);
        if (iVar != null && obj2 != null) {
            n nVar = (n) iVar.get();
            while (true) {
                if (!nVar.a(obj2)) {
                    break;
                }
                if (x(iVar, nVar)) {
                    if (this.f18479a.remove(obj, iVar)) {
                        b(new j(iVar));
                        return true;
                    }
                } else {
                    nVar = (n) iVar.get();
                    if (!nVar.b()) {
                        break;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public boolean replace(Object obj, Object obj2, Object obj3) {
        n nVar;
        f(obj);
        f(obj2);
        f(obj3);
        n nVar2 = new n(obj3, 1);
        i iVar = (i) this.f18479a.get(obj);
        if (iVar == null) {
            return false;
        }
        do {
            nVar = (n) iVar.get();
            if (!nVar.b() || !nVar.a(obj2)) {
                return false;
            }
        } while (!iVar.compareAndSet(nVar, nVar2));
        int i10 = 1 - nVar.f18526a;
        if (i10 == 0) {
            a(iVar);
        } else {
            b(new k(iVar, i10));
        }
        return true;
    }
}
