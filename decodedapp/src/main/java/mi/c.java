package mi;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.logging.Level;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    static volatile c f22281s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final d f22282t = new d();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final Map f22283u = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f22284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f22285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f22286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ThreadLocal f22287d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final h f22288e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final l f22289f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final mi.b f22290g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final mi.a f22291h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final p f22292i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ExecutorService f22293j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f22294k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f22295l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f22296m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f22297n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f22298o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f22299p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f22300q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final g f22301r;

    class a extends ThreadLocal {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0291c initialValue() {
            return new C0291c();
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22303a;

        static {
            int[] iArr = new int[ThreadMode.values().length];
            f22303a = iArr;
            try {
                iArr[ThreadMode.POSTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22303a[ThreadMode.MAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22303a[ThreadMode.MAIN_ORDERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22303a[ThreadMode.BACKGROUND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22303a[ThreadMode.ASYNC.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: mi.c$c, reason: collision with other inner class name */
    static final class C0291c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final List f22304a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f22305b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f22306c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        q f22307d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f22308e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f22309f;

        C0291c() {
        }
    }

    public c() {
        this(f22282t);
    }

    static void a(List list, Class[] clsArr) {
        for (Class cls : clsArr) {
            if (!list.contains(cls)) {
                list.add(cls);
                a(list, cls.getInterfaces());
            }
        }
    }

    public static d b() {
        return new d();
    }

    private void d(q qVar, Object obj) {
        if (obj != null) {
            p(qVar, obj, k());
        }
    }

    public static c e() {
        c cVar;
        c cVar2 = f22281s;
        if (cVar2 != null) {
            return cVar2;
        }
        synchronized (c.class) {
            try {
                cVar = f22281s;
                if (cVar == null) {
                    cVar = new c();
                    f22281s = cVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }

    private void h(q qVar, Object obj, Throwable th2) {
        if (!(obj instanceof n)) {
            if (this.f22294k) {
                throw new e("Invoking subscriber failed", th2);
            }
            if (this.f22295l) {
                this.f22301r.b(Level.SEVERE, "Could not dispatch event: " + obj.getClass() + " to subscribing class " + qVar.f22357a.getClass(), th2);
            }
            if (this.f22297n) {
                m(new n(this, th2, obj, qVar.f22357a));
                return;
            }
            return;
        }
        if (this.f22295l) {
            g gVar = this.f22301r;
            Level level = Level.SEVERE;
            gVar.b(level, "SubscriberExceptionEvent subscriber " + qVar.f22357a.getClass() + " threw an exception", th2);
            n nVar = (n) obj;
            this.f22301r.b(level, "Initial event " + nVar.f22337c + " caused exception in " + nVar.f22338d, nVar.f22336b);
        }
    }

    private boolean k() {
        h hVar = this.f22288e;
        return hVar == null || hVar.b();
    }

    private static List l(Class cls) {
        List arrayList;
        Map map = f22283u;
        synchronized (map) {
            try {
                arrayList = (List) map.get(cls);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    for (Class superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
                        arrayList.add(superclass);
                        a(arrayList, superclass.getInterfaces());
                    }
                    f22283u.put(cls, arrayList);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return arrayList;
    }

    private void n(Object obj, C0291c c0291c) {
        boolean zO;
        Class<?> cls = obj.getClass();
        if (this.f22299p) {
            List listL = l(cls);
            int size = listL.size();
            zO = false;
            for (int i10 = 0; i10 < size; i10++) {
                zO |= o(obj, c0291c, (Class) listL.get(i10));
            }
        } else {
            zO = o(obj, c0291c, cls);
        }
        if (zO) {
            return;
        }
        if (this.f22296m) {
            this.f22301r.a(Level.FINE, "No subscribers registered for event " + cls);
        }
        if (!this.f22298o || cls == i.class || cls == n.class) {
            return;
        }
        m(new i(this, obj));
    }

    private boolean o(Object obj, C0291c c0291c, Class cls) {
        CopyOnWriteArrayList<q> copyOnWriteArrayList;
        synchronized (this) {
            copyOnWriteArrayList = (CopyOnWriteArrayList) this.f22284a.get(cls);
        }
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        for (q qVar : copyOnWriteArrayList) {
            c0291c.f22308e = obj;
            c0291c.f22307d = qVar;
            try {
                p(qVar, obj, c0291c.f22306c);
                if (c0291c.f22309f) {
                    return true;
                }
            } finally {
                c0291c.f22308e = null;
                c0291c.f22307d = null;
                c0291c.f22309f = false;
            }
        }
        return true;
    }

    private void p(q qVar, Object obj, boolean z10) {
        int i10 = b.f22303a[qVar.f22358b.f22340b.ordinal()];
        if (i10 == 1) {
            j(qVar, obj);
            return;
        }
        if (i10 == 2) {
            if (z10) {
                j(qVar, obj);
                return;
            } else {
                this.f22289f.a(qVar, obj);
                return;
            }
        }
        if (i10 == 3) {
            l lVar = this.f22289f;
            if (lVar != null) {
                lVar.a(qVar, obj);
                return;
            } else {
                j(qVar, obj);
                return;
            }
        }
        if (i10 == 4) {
            if (z10) {
                this.f22290g.a(qVar, obj);
                return;
            } else {
                j(qVar, obj);
                return;
            }
        }
        if (i10 == 5) {
            this.f22291h.a(qVar, obj);
            return;
        }
        throw new IllegalStateException("Unknown thread mode: " + qVar.f22358b.f22340b);
    }

    private void s(Object obj, o oVar) {
        Class cls = oVar.f22341c;
        q qVar = new q(obj, oVar);
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f22284a.get(cls);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList();
            this.f22284a.put(cls, copyOnWriteArrayList);
        } else if (copyOnWriteArrayList.contains(qVar)) {
            throw new e("Subscriber " + obj.getClass() + " already registered to event " + cls);
        }
        int size = copyOnWriteArrayList.size();
        for (int i10 = 0; i10 <= size; i10++) {
            if (i10 == size || oVar.f22342d > ((q) copyOnWriteArrayList.get(i10)).f22358b.f22342d) {
                copyOnWriteArrayList.add(i10, qVar);
                break;
            }
        }
        List arrayList = (List) this.f22285b.get(obj);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f22285b.put(obj, arrayList);
        }
        arrayList.add(cls);
        if (oVar.f22343e) {
            if (!this.f22299p) {
                d(qVar, this.f22286c.get(cls));
                return;
            }
            for (Map.Entry entry : this.f22286c.entrySet()) {
                if (cls.isAssignableFrom((Class) entry.getKey())) {
                    d(qVar, entry.getValue());
                }
            }
        }
    }

    private void u(Object obj, Class cls) {
        List list = (List) this.f22284a.get(cls);
        if (list != null) {
            int size = list.size();
            int i10 = 0;
            while (i10 < size) {
                q qVar = (q) list.get(i10);
                if (qVar.f22357a == obj) {
                    qVar.f22359c = false;
                    list.remove(i10);
                    i10--;
                    size--;
                }
                i10++;
            }
        }
    }

    public void c(Object obj) {
        C0291c c0291c = (C0291c) this.f22287d.get();
        if (!c0291c.f22305b) {
            throw new e("This method may only be called from inside event handling methods on the posting thread");
        }
        if (obj == null) {
            throw new e("Event may not be null");
        }
        if (c0291c.f22308e != obj) {
            throw new e("Only the currently handled event may be aborted");
        }
        if (c0291c.f22307d.f22358b.f22340b != ThreadMode.POSTING) {
            throw new e(" event handlers may only abort the incoming event");
        }
        c0291c.f22309f = true;
    }

    ExecutorService f() {
        return this.f22293j;
    }

    public g g() {
        return this.f22301r;
    }

    void i(j jVar) {
        Object obj = jVar.f22330a;
        q qVar = jVar.f22331b;
        j.b(jVar);
        if (qVar.f22359c) {
            j(qVar, obj);
        }
    }

    void j(q qVar, Object obj) {
        try {
            qVar.f22358b.f22339a.invoke(qVar.f22357a, obj);
        } catch (IllegalAccessException e10) {
            throw new IllegalStateException("Unexpected exception", e10);
        } catch (InvocationTargetException e11) {
            h(qVar, obj, e11.getCause());
        }
    }

    public void m(Object obj) {
        C0291c c0291c = (C0291c) this.f22287d.get();
        List list = c0291c.f22304a;
        list.add(obj);
        if (c0291c.f22305b) {
            return;
        }
        c0291c.f22306c = k();
        c0291c.f22305b = true;
        if (c0291c.f22309f) {
            throw new e("Internal error. Abort state was not reset");
        }
        while (true) {
            try {
                if (list.isEmpty()) {
                    return;
                } else {
                    n(list.remove(0), c0291c);
                }
            } finally {
                c0291c.f22305b = false;
                c0291c.f22306c = false;
            }
        }
    }

    public void q(Object obj) {
        if (ni.b.c() && !ni.b.a()) {
            throw new RuntimeException("It looks like you are using EventBus on Android, make sure to add the \"eventbus\" Android library to your dependencies.");
        }
        List listA = this.f22292i.a(obj.getClass());
        synchronized (this) {
            try {
                Iterator it = listA.iterator();
                while (it.hasNext()) {
                    s(obj, (o) it.next());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void r() {
        synchronized (this.f22286c) {
            this.f22286c.clear();
        }
    }

    public synchronized void t(Object obj) {
        try {
            List list = (List) this.f22285b.get(obj);
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    u(obj, (Class) it.next());
                }
                this.f22285b.remove(obj);
            } else {
                this.f22301r.a(Level.WARNING, "Subscriber to unregister was not registered before: " + obj.getClass());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public String toString() {
        return "EventBus[indexCount=" + this.f22300q + ", eventInheritance=" + this.f22299p + "]";
    }

    c(d dVar) {
        this.f22287d = new a();
        this.f22301r = dVar.b();
        this.f22284a = new HashMap();
        this.f22285b = new HashMap();
        this.f22286c = new ConcurrentHashMap();
        h hVarC = dVar.c();
        this.f22288e = hVarC;
        this.f22289f = hVarC != null ? hVarC.a(this) : null;
        this.f22290g = new mi.b(this);
        this.f22291h = new mi.a(this);
        List list = dVar.f22320j;
        this.f22300q = list != null ? list.size() : 0;
        this.f22292i = new p(dVar.f22320j, dVar.f22318h, dVar.f22317g);
        this.f22295l = dVar.f22311a;
        this.f22296m = dVar.f22312b;
        this.f22297n = dVar.f22313c;
        this.f22298o = dVar.f22314d;
        this.f22294k = dVar.f22315e;
        this.f22299p = dVar.f22316f;
        this.f22293j = dVar.f22319i;
    }
}
