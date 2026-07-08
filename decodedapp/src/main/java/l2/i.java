package l2;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class i implements l2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f20338a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f20339b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f20340c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f20341d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f20342e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f20343f;

    private static final class a implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f20344a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f20345b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Class f20346c;

        a(b bVar) {
            this.f20344a = bVar;
        }

        @Override // l2.m
        public void a() {
            this.f20344a.c(this);
        }

        void b(int i10, Class cls) {
            this.f20345b = i10;
            this.f20346c = cls;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f20345b == aVar.f20345b && this.f20346c == aVar.f20346c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i10 = this.f20345b * 31;
            Class cls = this.f20346c;
            return i10 + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            return "Key{size=" + this.f20345b + "array=" + this.f20346c + '}';
        }
    }

    private static final class b extends c {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // l2.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a() {
            return new a(this);
        }

        a e(int i10, Class cls) {
            a aVar = (a) b();
            aVar.b(i10, cls);
            return aVar;
        }
    }

    public i(int i10) {
        this.f20342e = i10;
    }

    private void e(int i10, Class cls) {
        NavigableMap navigableMapL = l(cls);
        Integer num = (Integer) navigableMapL.get(Integer.valueOf(i10));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapL.remove(Integer.valueOf(i10));
                return;
            } else {
                navigableMapL.put(Integer.valueOf(i10), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i10 + ", this: " + this);
    }

    private void f() {
        g(this.f20342e);
    }

    private void g(int i10) {
        while (this.f20343f > i10) {
            Object objF = this.f20338a.f();
            e3.k.e(objF);
            l2.a aVarH = h(objF);
            this.f20343f -= aVarH.c(objF) * aVarH.b();
            e(aVarH.c(objF), objF.getClass());
            if (Log.isLoggable(aVarH.a(), 2)) {
                Log.v(aVarH.a(), "evicted: " + aVarH.c(objF));
            }
        }
    }

    private l2.a h(Object obj) {
        return i(obj.getClass());
    }

    private l2.a i(Class cls) {
        l2.a fVar;
        l2.a aVar = (l2.a) this.f20341d.get(cls);
        if (aVar != null) {
            return aVar;
        }
        if (cls.equals(int[].class)) {
            fVar = new h();
        } else {
            if (!cls.equals(byte[].class)) {
                throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
            }
            fVar = new f();
        }
        this.f20341d.put(cls, fVar);
        return fVar;
    }

    private Object j(a aVar) {
        return this.f20338a.a(aVar);
    }

    private Object k(a aVar, Class cls) {
        l2.a aVarI = i(cls);
        Object objJ = j(aVar);
        if (objJ != null) {
            this.f20343f -= aVarI.c(objJ) * aVarI.b();
            e(aVarI.c(objJ), cls);
        }
        if (objJ != null) {
            return objJ;
        }
        if (Log.isLoggable(aVarI.a(), 2)) {
            Log.v(aVarI.a(), "Allocated " + aVar.f20345b + " bytes");
        }
        return aVarI.newArray(aVar.f20345b);
    }

    private NavigableMap l(Class cls) {
        NavigableMap navigableMap = (NavigableMap) this.f20340c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f20340c.put(cls, treeMap);
        return treeMap;
    }

    private boolean m() {
        int i10 = this.f20343f;
        return i10 == 0 || this.f20342e / i10 >= 2;
    }

    private boolean n(int i10) {
        return i10 <= this.f20342e / 2;
    }

    private boolean o(int i10, Integer num) {
        if (num != null) {
            return m() || num.intValue() <= i10 * 8;
        }
        return false;
    }

    @Override // l2.b
    public synchronized void a(int i10) {
        try {
            if (i10 >= 40) {
                b();
            } else if (i10 >= 20 || i10 == 15) {
                g(this.f20342e / 2);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // l2.b
    public synchronized void b() {
        g(0);
    }

    @Override // l2.b
    public synchronized Object c(int i10, Class cls) {
        return k(this.f20339b.e(i10, cls), cls);
    }

    @Override // l2.b
    public synchronized Object d(int i10, Class cls) {
        Integer num;
        try {
            num = (Integer) l(cls).ceilingKey(Integer.valueOf(i10));
        } catch (Throwable th2) {
            throw th2;
        }
        return k(o(i10, num) ? this.f20339b.e(num.intValue(), cls) : this.f20339b.e(i10, cls), cls);
    }

    @Override // l2.b
    public synchronized void put(Object obj) {
        Class<?> cls = obj.getClass();
        l2.a aVarI = i(cls);
        int iC = aVarI.c(obj);
        int iB = aVarI.b() * iC;
        if (n(iB)) {
            a aVarE = this.f20339b.e(iC, cls);
            this.f20338a.d(aVarE, obj);
            NavigableMap navigableMapL = l(cls);
            Integer num = (Integer) navigableMapL.get(Integer.valueOf(aVarE.f20345b));
            Integer numValueOf = Integer.valueOf(aVarE.f20345b);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapL.put(numValueOf, Integer.valueOf(iIntValue));
            this.f20343f += iB;
            f();
        }
    }
}
