package fd;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements Map, Serializable, sd.b {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final a f12950w = new a(null);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final d f12951x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object[] f12952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object[] f12953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int[] f12954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int[] f12955d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f12956e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f12957f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f12958g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f12959h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f12960r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private fd.f f12961s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private g f12962t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private fd.e f12963u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f12964v;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int c(int i10) {
            return Integer.highestOneBit(xd.d.b(i10, 1) * 3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int d(int i10) {
            return Integer.numberOfLeadingZeros(i10) + 1;
        }

        public final d e() {
            return d.f12951x;
        }

        private a() {
        }
    }

    public static final class b extends C0180d implements Iterator, sd.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d dVar) {
            super(dVar);
            m.e(dVar, "map");
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public c next() {
            c();
            if (d() >= f().f12957f) {
                throw new NoSuchElementException();
            }
            int iD = d();
            h(iD + 1);
            i(iD);
            c cVar = new c(f(), e());
            g();
            return cVar;
        }

        public final void k(StringBuilder sb2) {
            m.e(sb2, "sb");
            if (d() >= f().f12957f) {
                throw new NoSuchElementException();
            }
            int iD = d();
            h(iD + 1);
            i(iD);
            Object obj = f().f12952a[e()];
            if (obj == f()) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj);
            }
            sb2.append('=');
            Object[] objArr = f().f12953b;
            m.b(objArr);
            Object obj2 = objArr[e()];
            if (obj2 == f()) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj2);
            }
            g();
        }

        public final int l() {
            if (d() >= f().f12957f) {
                throw new NoSuchElementException();
            }
            int iD = d();
            h(iD + 1);
            i(iD);
            Object obj = f().f12952a[e()];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = f().f12953b;
            m.b(objArr);
            Object obj2 = objArr[e()];
            int iHashCode2 = iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
            g();
            return iHashCode2;
        }
    }

    public static final class c implements Map.Entry, sd.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f12965a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f12966b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f12967c;

        public c(d dVar, int i10) {
            m.e(dVar, "map");
            this.f12965a = dVar;
            this.f12966b = i10;
            this.f12967c = dVar.f12959h;
        }

        private final void b() {
            if (this.f12965a.f12959h != this.f12967c) {
                throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
            }
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return m.a(entry.getKey(), getKey()) && m.a(entry.getValue(), getValue());
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            b();
            return this.f12965a.f12952a[this.f12966b];
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            b();
            Object[] objArr = this.f12965a.f12953b;
            m.b(objArr);
            return objArr[this.f12966b];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Object key = getKey();
            int iHashCode = key != null ? key.hashCode() : 0;
            Object value = getValue();
            return iHashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            b();
            this.f12965a.n();
            Object[] objArrK = this.f12965a.k();
            int i10 = this.f12966b;
            Object obj2 = objArrK[i10];
            objArrK[i10] = obj;
            return obj2;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getKey());
            sb2.append('=');
            sb2.append(getValue());
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: fd.d$d, reason: collision with other inner class name */
    public static class C0180d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f12968a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f12969b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f12970c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f12971d;

        public C0180d(d dVar) {
            m.e(dVar, "map");
            this.f12968a = dVar;
            this.f12970c = -1;
            this.f12971d = dVar.f12959h;
            g();
        }

        public final void c() {
            if (this.f12968a.f12959h != this.f12971d) {
                throw new ConcurrentModificationException();
            }
        }

        public final int d() {
            return this.f12969b;
        }

        public final int e() {
            return this.f12970c;
        }

        public final d f() {
            return this.f12968a;
        }

        public final void g() {
            while (this.f12969b < this.f12968a.f12957f) {
                int[] iArr = this.f12968a.f12954c;
                int i10 = this.f12969b;
                if (iArr[i10] >= 0) {
                    return;
                } else {
                    this.f12969b = i10 + 1;
                }
            }
        }

        public final void h(int i10) {
            this.f12969b = i10;
        }

        public final boolean hasNext() {
            return this.f12969b < this.f12968a.f12957f;
        }

        public final void i(int i10) {
            this.f12970c = i10;
        }

        public final void remove() {
            c();
            if (this.f12970c == -1) {
                throw new IllegalStateException("Call next() before removing element from the iterator.");
            }
            this.f12968a.n();
            this.f12968a.X(this.f12970c);
            this.f12970c = -1;
            this.f12971d = this.f12968a.f12959h;
        }
    }

    public static final class e extends C0180d implements Iterator, sd.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d dVar) {
            super(dVar);
            m.e(dVar, "map");
        }

        @Override // java.util.Iterator
        public Object next() {
            c();
            if (d() >= f().f12957f) {
                throw new NoSuchElementException();
            }
            int iD = d();
            h(iD + 1);
            i(iD);
            Object obj = f().f12952a[e()];
            g();
            return obj;
        }
    }

    public static final class f extends C0180d implements Iterator, sd.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(d dVar) {
            super(dVar);
            m.e(dVar, "map");
        }

        @Override // java.util.Iterator
        public Object next() {
            c();
            if (d() >= f().f12957f) {
                throw new NoSuchElementException();
            }
            int iD = d();
            h(iD + 1);
            i(iD);
            Object[] objArr = f().f12953b;
            m.b(objArr);
            Object obj = objArr[e()];
            g();
            return obj;
        }
    }

    static {
        d dVar = new d(0);
        dVar.f12964v = true;
        f12951x = dVar;
    }

    private d(Object[] objArr, Object[] objArr2, int[] iArr, int[] iArr2, int i10, int i11) {
        this.f12952a = objArr;
        this.f12953b = objArr2;
        this.f12954c = iArr;
        this.f12955d = iArr2;
        this.f12956e = i10;
        this.f12957f = i11;
        this.f12958g = f12950w.d(C());
    }

    private final int C() {
        return this.f12955d.length;
    }

    private final int L(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f12958g;
    }

    private final boolean O(Collection collection) {
        boolean z10 = false;
        if (collection.isEmpty()) {
            return false;
        }
        t(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (Q((Map.Entry) it.next())) {
                z10 = true;
            }
        }
        return z10;
    }

    private final boolean Q(Map.Entry entry) {
        int iJ = j(entry.getKey());
        Object[] objArrK = k();
        if (iJ >= 0) {
            objArrK[iJ] = entry.getValue();
            return true;
        }
        int i10 = (-iJ) - 1;
        if (m.a(entry.getValue(), objArrK[i10])) {
            return false;
        }
        objArrK[i10] = entry.getValue();
        return true;
    }

    private final boolean R(int i10) {
        int iL = L(this.f12952a[i10]);
        int i11 = this.f12956e;
        while (true) {
            int[] iArr = this.f12955d;
            if (iArr[iL] == 0) {
                iArr[iL] = i10 + 1;
                this.f12954c[i10] = iL;
                return true;
            }
            i11--;
            if (i11 < 0) {
                return false;
            }
            iL = iL == 0 ? C() - 1 : iL - 1;
        }
    }

    private final void S() {
        this.f12959h++;
    }

    private final void T(int i10) {
        S();
        int i11 = 0;
        if (this.f12957f > size()) {
            o(false);
        }
        this.f12955d = new int[i10];
        this.f12958g = f12950w.d(i10);
        while (i11 < this.f12957f) {
            int i12 = i11 + 1;
            if (!R(i11)) {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
            i11 = i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X(int i10) {
        fd.c.f(this.f12952a, i10);
        Object[] objArr = this.f12953b;
        if (objArr != null) {
            fd.c.f(objArr, i10);
        }
        Y(this.f12954c[i10]);
        this.f12954c[i10] = -1;
        this.f12960r = size() - 1;
        S();
    }

    private final void Y(int i10) {
        int iC = xd.d.c(this.f12956e * 2, C() / 2);
        int i11 = 0;
        int i12 = i10;
        do {
            i10 = i10 == 0 ? C() - 1 : i10 - 1;
            i11++;
            if (i11 > this.f12956e) {
                this.f12955d[i12] = 0;
                return;
            }
            int[] iArr = this.f12955d;
            int i13 = iArr[i10];
            if (i13 == 0) {
                iArr[i12] = 0;
                return;
            }
            if (i13 < 0) {
                iArr[i12] = -1;
            } else {
                int i14 = i13 - 1;
                if (((L(this.f12952a[i14]) - i10) & (C() - 1)) >= i11) {
                    this.f12955d[i12] = i13;
                    this.f12954c[i14] = i12;
                }
                iC--;
            }
            i12 = i10;
            i11 = 0;
            iC--;
        } while (iC >= 0);
        this.f12955d[i12] = -1;
    }

    private final boolean b0(int i10) {
        int iZ = z();
        int i11 = this.f12957f;
        int i12 = iZ - i11;
        int size = i11 - size();
        return i12 < i10 && i12 + size >= i10 && size >= z() / 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] k() {
        Object[] objArr = this.f12953b;
        if (objArr != null) {
            return objArr;
        }
        Object[] objArrD = fd.c.d(z());
        this.f12953b = objArrD;
        return objArrD;
    }

    private final void o(boolean z10) {
        int i10;
        Object[] objArr = this.f12953b;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i10 = this.f12957f;
            if (i11 >= i10) {
                break;
            }
            int[] iArr = this.f12954c;
            int i13 = iArr[i11];
            if (i13 >= 0) {
                Object[] objArr2 = this.f12952a;
                objArr2[i12] = objArr2[i11];
                if (objArr != null) {
                    objArr[i12] = objArr[i11];
                }
                if (z10) {
                    iArr[i12] = i13;
                    this.f12955d[i13] = i12 + 1;
                }
                i12++;
            }
            i11++;
        }
        fd.c.g(this.f12952a, i12, i10);
        if (objArr != null) {
            fd.c.g(objArr, i12, this.f12957f);
        }
        this.f12957f = i12;
    }

    private final boolean r(Map map) {
        return size() == map.size() && p(map.entrySet());
    }

    private final void s(int i10) {
        if (i10 < 0) {
            throw new OutOfMemoryError();
        }
        if (i10 > z()) {
            int iE = ed.d.f11750a.e(z(), i10);
            this.f12952a = fd.c.e(this.f12952a, iE);
            Object[] objArr = this.f12953b;
            this.f12953b = objArr != null ? fd.c.e(objArr, iE) : null;
            int[] iArrCopyOf = Arrays.copyOf(this.f12954c, iE);
            m.d(iArrCopyOf, "copyOf(...)");
            this.f12954c = iArrCopyOf;
            int iC = f12950w.c(iE);
            if (iC > C()) {
                T(iC);
            }
        }
    }

    private final void t(int i10) {
        if (b0(i10)) {
            o(true);
        } else {
            s(this.f12957f + i10);
        }
    }

    private final int w(Object obj) {
        int iL = L(obj);
        int i10 = this.f12956e;
        while (true) {
            int i11 = this.f12955d[iL];
            if (i11 == 0) {
                return -1;
            }
            if (i11 > 0) {
                int i12 = i11 - 1;
                if (m.a(this.f12952a[i12], obj)) {
                    return i12;
                }
            }
            i10--;
            if (i10 < 0) {
                return -1;
            }
            iL = iL == 0 ? C() - 1 : iL - 1;
        }
    }

    private final int x(Object obj) {
        int i10 = this.f12957f;
        while (true) {
            i10--;
            if (i10 < 0) {
                return -1;
            }
            if (this.f12954c[i10] >= 0) {
                Object[] objArr = this.f12953b;
                m.b(objArr);
                if (m.a(objArr[i10], obj)) {
                    return i10;
                }
            }
        }
    }

    public Set A() {
        fd.e eVar = this.f12963u;
        if (eVar != null) {
            return eVar;
        }
        fd.e eVar2 = new fd.e(this);
        this.f12963u = eVar2;
        return eVar2;
    }

    public Set D() {
        fd.f fVar = this.f12961s;
        if (fVar != null) {
            return fVar;
        }
        fd.f fVar2 = new fd.f(this);
        this.f12961s = fVar2;
        return fVar2;
    }

    public int G() {
        return this.f12960r;
    }

    public Collection K() {
        g gVar = this.f12962t;
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(this);
        this.f12962t = gVar2;
        return gVar2;
    }

    public final e N() {
        return new e(this);
    }

    public final boolean W(Map.Entry entry) {
        m.e(entry, "entry");
        n();
        int iW = w(entry.getKey());
        if (iW < 0) {
            return false;
        }
        Object[] objArr = this.f12953b;
        m.b(objArr);
        if (!m.a(objArr[iW], entry.getValue())) {
            return false;
        }
        X(iW);
        return true;
    }

    public final boolean Z(Object obj) {
        n();
        int iW = w(obj);
        if (iW < 0) {
            return false;
        }
        X(iW);
        return true;
    }

    public final boolean a0(Object obj) {
        n();
        int iX = x(obj);
        if (iX < 0) {
            return false;
        }
        X(iX);
        return true;
    }

    public final f c0() {
        return new f(this);
    }

    @Override // java.util.Map
    public void clear() {
        n();
        int i10 = this.f12957f - 1;
        if (i10 >= 0) {
            int i11 = 0;
            while (true) {
                int[] iArr = this.f12954c;
                int i12 = iArr[i11];
                if (i12 >= 0) {
                    this.f12955d[i12] = 0;
                    iArr[i11] = -1;
                }
                if (i11 == i10) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        fd.c.g(this.f12952a, 0, this.f12957f);
        Object[] objArr = this.f12953b;
        if (objArr != null) {
            fd.c.g(objArr, 0, this.f12957f);
        }
        this.f12960r = 0;
        this.f12957f = 0;
        S();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return w(obj) >= 0;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return x(obj) >= 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return A();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof Map) && r((Map) obj);
        }
        return true;
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        int iW = w(obj);
        if (iW < 0) {
            return null;
        }
        Object[] objArr = this.f12953b;
        m.b(objArr);
        return objArr[iW];
    }

    @Override // java.util.Map
    public int hashCode() {
        b bVarV = v();
        int iL = 0;
        while (bVarV.hasNext()) {
            iL += bVarV.l();
        }
        return iL;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    public final int j(Object obj) {
        n();
        while (true) {
            int iL = L(obj);
            int iC = xd.d.c(this.f12956e * 2, C() / 2);
            int i10 = 0;
            while (true) {
                int i11 = this.f12955d[iL];
                if (i11 <= 0) {
                    if (this.f12957f < z()) {
                        int i12 = this.f12957f;
                        int i13 = i12 + 1;
                        this.f12957f = i13;
                        this.f12952a[i12] = obj;
                        this.f12954c[i12] = iL;
                        this.f12955d[iL] = i13;
                        this.f12960r = size() + 1;
                        S();
                        if (i10 > this.f12956e) {
                            this.f12956e = i10;
                        }
                        return i12;
                    }
                    t(1);
                } else {
                    if (m.a(this.f12952a[i11 - 1], obj)) {
                        return -i11;
                    }
                    i10++;
                    if (i10 > iC) {
                        T(C() * 2);
                        break;
                    }
                    iL = iL == 0 ? C() - 1 : iL - 1;
                }
            }
        }
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return D();
    }

    public final Map l() {
        n();
        this.f12964v = true;
        if (size() > 0) {
            return this;
        }
        d dVar = f12951x;
        m.c(dVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return dVar;
    }

    public final void n() {
        if (this.f12964v) {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean p(Collection collection) {
        m.e(collection, "m");
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!q((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        n();
        int iJ = j(obj);
        Object[] objArrK = k();
        if (iJ >= 0) {
            objArrK[iJ] = obj2;
            return null;
        }
        int i10 = (-iJ) - 1;
        Object obj3 = objArrK[i10];
        objArrK[i10] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        m.e(map, "from");
        n();
        O(map.entrySet());
    }

    public final boolean q(Map.Entry entry) {
        m.e(entry, "entry");
        int iW = w(entry.getKey());
        if (iW < 0) {
            return false;
        }
        Object[] objArr = this.f12953b;
        m.b(objArr);
        return m.a(objArr[iW], entry.getValue());
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        n();
        int iW = w(obj);
        if (iW < 0) {
            return null;
        }
        Object[] objArr = this.f12953b;
        m.b(objArr);
        Object obj2 = objArr[iW];
        X(iW);
        return obj2;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return G();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder((size() * 3) + 2);
        sb2.append("{");
        b bVarV = v();
        int i10 = 0;
        while (bVarV.hasNext()) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            bVarV.k(sb2);
            i10++;
        }
        sb2.append("}");
        String string = sb2.toString();
        m.d(string, "toString(...)");
        return string;
    }

    public final b v() {
        return new b(this);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return K();
    }

    public final int z() {
        return this.f12952a.length;
    }

    public d() {
        this(8);
    }

    public d(int i10) {
        this(fd.c.d(i10), null, new int[i10], new int[f12950w.c(i10)], 2, 0);
    }
}
