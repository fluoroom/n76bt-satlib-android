package a3;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.d;
import e3.l;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import k2.j;
import k2.k;
import k2.q;
import k2.v;

/* JADX INFO: loaded from: classes.dex */
public final class h implements c, b3.g, g {
    private static final boolean D = Log.isLoggable("GlideRequest", 2);
    private int A;
    private boolean B;
    private RuntimeException C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f3.c f237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f238d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d f239e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Context f240f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.bumptech.glide.e f241g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Object f242h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Class f243i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final a3.a f244j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f245k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f246l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final com.bumptech.glide.h f247m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final b3.h f248n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final List f249o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final c3.c f250p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Executor f251q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private v f252r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private k.d f253s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f254t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private volatile k f255u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private a f256v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Drawable f257w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Drawable f258x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Drawable f259y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f260z;

    private enum a {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    private h(Context context, com.bumptech.glide.e eVar, Object obj, Object obj2, Class cls, a3.a aVar, int i10, int i11, com.bumptech.glide.h hVar, b3.h hVar2, e eVar2, List list, d dVar, k kVar, c3.c cVar, Executor executor) {
        this.f236b = D ? String.valueOf(super.hashCode()) : null;
        this.f237c = f3.c.a();
        this.f238d = obj;
        this.f240f = context;
        this.f241g = eVar;
        this.f242h = obj2;
        this.f243i = cls;
        this.f244j = aVar;
        this.f245k = i10;
        this.f246l = i11;
        this.f247m = hVar;
        this.f248n = hVar2;
        this.f249o = list;
        this.f239e = dVar;
        this.f255u = kVar;
        this.f250p = cVar;
        this.f251q = executor;
        this.f256v = a.PENDING;
        if (this.C == null && eVar.g().a(d.c.class)) {
            this.C = new RuntimeException("Glide request origin trace");
        }
    }

    private void A(q qVar, int i10) {
        this.f237c.c();
        synchronized (this.f238d) {
            try {
                qVar.k(this.C);
                int iH = this.f241g.h();
                if (iH <= i10) {
                    Log.w("Glide", "Load failed for [" + this.f242h + "] with dimensions [" + this.f260z + "x" + this.A + "]", qVar);
                    if (iH <= 4) {
                        qVar.g("Glide");
                    }
                }
                this.f253s = null;
                this.f256v = a.FAILED;
                x();
                this.B = true;
                try {
                    List list = this.f249o;
                    if (list != null) {
                        Iterator it = list.iterator();
                        if (it.hasNext()) {
                            android.support.v4.media.session.b.a(it.next());
                            t();
                            throw null;
                        }
                    }
                    C();
                    this.B = false;
                    f3.b.f("GlideRequest", this.f235a);
                } catch (Throwable th2) {
                    this.B = false;
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    private void B(v vVar, Object obj, i2.a aVar, boolean z10) {
        boolean zT = t();
        this.f256v = a.COMPLETE;
        this.f252r = vVar;
        if (this.f241g.h() <= 3) {
            Log.d("Glide", "Finished loading " + obj.getClass().getSimpleName() + " from " + aVar + " for " + this.f242h + " with size [" + this.f260z + "x" + this.A + "] in " + e3.g.a(this.f254t) + " ms");
        }
        y();
        this.B = true;
        try {
            List list = this.f249o;
            if (list != null) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    android.support.v4.media.session.b.a(it.next());
                    throw null;
                }
            }
            this.f248n.a(obj, this.f250p.a(aVar, zT));
            this.B = false;
            f3.b.f("GlideRequest", this.f235a);
        } catch (Throwable th2) {
            this.B = false;
            throw th2;
        }
    }

    private void C() {
        if (m()) {
            Drawable drawableR = this.f242h == null ? r() : null;
            if (drawableR == null) {
                drawableR = q();
            }
            if (drawableR == null) {
                drawableR = s();
            }
            this.f248n.e(drawableR);
        }
    }

    private void j() {
        if (this.B) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    private boolean l() {
        d dVar = this.f239e;
        return dVar == null || dVar.j(this);
    }

    private boolean m() {
        d dVar = this.f239e;
        return dVar == null || dVar.f(this);
    }

    private boolean n() {
        d dVar = this.f239e;
        return dVar == null || dVar.h(this);
    }

    private void o() {
        j();
        this.f237c.c();
        this.f248n.i(this);
        k.d dVar = this.f253s;
        if (dVar != null) {
            dVar.a();
            this.f253s = null;
        }
    }

    private void p(Object obj) {
        List list = this.f249o;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
        }
    }

    private Drawable q() {
        if (this.f257w == null) {
            Drawable drawableM = this.f244j.m();
            this.f257w = drawableM;
            if (drawableM == null && this.f244j.k() > 0) {
                this.f257w = u(this.f244j.k());
            }
        }
        return this.f257w;
    }

    private Drawable r() {
        if (this.f259y == null) {
            Drawable drawableN = this.f244j.n();
            this.f259y = drawableN;
            if (drawableN == null && this.f244j.o() > 0) {
                this.f259y = u(this.f244j.o());
            }
        }
        return this.f259y;
    }

    private Drawable s() {
        if (this.f258x == null) {
            Drawable drawableV = this.f244j.v();
            this.f258x = drawableV;
            if (drawableV == null && this.f244j.w() > 0) {
                this.f258x = u(this.f244j.w());
            }
        }
        return this.f258x;
    }

    private boolean t() {
        d dVar = this.f239e;
        return dVar == null || !dVar.getRoot().a();
    }

    private Drawable u(int i10) {
        return t2.d.a(this.f240f, i10, this.f244j.B() != null ? this.f244j.B() : this.f240f.getTheme());
    }

    private void v(String str) {
        Log.v("GlideRequest", str + " this: " + this.f236b);
    }

    private static int w(int i10, float f10) {
        return i10 == Integer.MIN_VALUE ? i10 : Math.round(f10 * i10);
    }

    private void x() {
        d dVar = this.f239e;
        if (dVar != null) {
            dVar.c(this);
        }
    }

    private void y() {
        d dVar = this.f239e;
        if (dVar != null) {
            dVar.b(this);
        }
    }

    public static h z(Context context, com.bumptech.glide.e eVar, Object obj, Object obj2, Class cls, a3.a aVar, int i10, int i11, com.bumptech.glide.h hVar, b3.h hVar2, e eVar2, List list, d dVar, k kVar, c3.c cVar, Executor executor) {
        return new h(context, eVar, obj, obj2, cls, aVar, i10, i11, hVar, hVar2, eVar2, list, dVar, kVar, cVar, executor);
    }

    @Override // a3.c
    public boolean a() {
        boolean z10;
        synchronized (this.f238d) {
            z10 = this.f256v == a.COMPLETE;
        }
        return z10;
    }

    @Override // a3.g
    public void b(q qVar) {
        A(qVar, 5);
    }

    @Override // a3.g
    public void c(v vVar, i2.a aVar, boolean z10) {
        this.f237c.c();
        v vVar2 = null;
        try {
            synchronized (this.f238d) {
                try {
                    this.f253s = null;
                    if (vVar == null) {
                        b(new q("Expected to receive a Resource<R> with an object of " + this.f243i + " inside, but instead got null."));
                        return;
                    }
                    Object obj = vVar.get();
                    try {
                        if (obj == null || !this.f243i.isAssignableFrom(obj.getClass())) {
                            this.f252r = null;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Expected to receive an object of ");
                            sb2.append(this.f243i);
                            sb2.append(" but instead got ");
                            sb2.append(obj != null ? obj.getClass() : "");
                            sb2.append("{");
                            sb2.append(obj);
                            sb2.append("} inside Resource{");
                            sb2.append(vVar);
                            sb2.append("}.");
                            sb2.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                            b(new q(sb2.toString()));
                        } else if (n()) {
                            B(vVar, obj, aVar, z10);
                            return;
                        } else {
                            this.f252r = null;
                            this.f256v = a.COMPLETE;
                            f3.b.f("GlideRequest", this.f235a);
                        }
                        this.f255u.k(vVar);
                    } catch (Throwable th2) {
                        vVar2 = vVar;
                        th = th2;
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            if (vVar2 != null) {
                this.f255u.k(vVar2);
            }
            throw th4;
        }
    }

    @Override // a3.c
    public void clear() {
        synchronized (this.f238d) {
            try {
                j();
                this.f237c.c();
                a aVar = this.f256v;
                a aVar2 = a.CLEARED;
                if (aVar == aVar2) {
                    return;
                }
                o();
                v vVar = this.f252r;
                if (vVar != null) {
                    this.f252r = null;
                } else {
                    vVar = null;
                }
                if (l()) {
                    this.f248n.k(s());
                }
                f3.b.f("GlideRequest", this.f235a);
                this.f256v = aVar2;
                if (vVar != null) {
                    this.f255u.k(vVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // a3.c
    public void d() {
        synchronized (this.f238d) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // a3.c
    public boolean e(c cVar) {
        int i10;
        int i11;
        Object obj;
        Class cls;
        a3.a aVar;
        com.bumptech.glide.h hVar;
        int size;
        int i12;
        int i13;
        Object obj2;
        Class cls2;
        a3.a aVar2;
        com.bumptech.glide.h hVar2;
        int size2;
        if (!(cVar instanceof h)) {
            return false;
        }
        synchronized (this.f238d) {
            try {
                i10 = this.f245k;
                i11 = this.f246l;
                obj = this.f242h;
                cls = this.f243i;
                aVar = this.f244j;
                hVar = this.f247m;
                List list = this.f249o;
                size = list != null ? list.size() : 0;
            } finally {
            }
        }
        h hVar3 = (h) cVar;
        synchronized (hVar3.f238d) {
            try {
                i12 = hVar3.f245k;
                i13 = hVar3.f246l;
                obj2 = hVar3.f242h;
                cls2 = hVar3.f243i;
                aVar2 = hVar3.f244j;
                hVar2 = hVar3.f247m;
                List list2 = hVar3.f249o;
                size2 = list2 != null ? list2.size() : 0;
            } finally {
            }
        }
        return i10 == i12 && i11 == i13 && l.c(obj, obj2) && cls.equals(cls2) && l.b(aVar, aVar2) && hVar == hVar2 && size == size2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // b3.g
    public void f(int i10, int i11) throws Throwable {
        Object obj;
        com.bumptech.glide.h hVar;
        j jVarJ;
        Map mapC;
        boolean zN;
        boolean zJ;
        i2.h hVarR;
        boolean zH;
        boolean zE;
        boolean zD;
        boolean zP;
        Executor executor;
        Object obj2;
        h hVar2 = this;
        hVar2.f237c.c();
        Object obj3 = hVar2.f238d;
        synchronized (obj3) {
            try {
                try {
                    boolean z10 = D;
                    if (z10) {
                        hVar2.v("Got onSizeReady in " + e3.g.a(hVar2.f254t));
                    }
                    if (hVar2.f256v == a.WAITING_FOR_SIZE) {
                        a aVar = a.RUNNING;
                        hVar2.f256v = aVar;
                        float fA = hVar2.f244j.A();
                        hVar2.f260z = w(i10, fA);
                        hVar2.A = w(i11, fA);
                        if (z10) {
                            hVar2.v("finished setup for calling load in " + e3.g.a(hVar2.f254t));
                        }
                        try {
                            k kVar = hVar2.f255u;
                            com.bumptech.glide.e eVar = hVar2.f241g;
                            try {
                                Object obj4 = hVar2.f242h;
                                i2.f fVarZ = hVar2.f244j.z();
                                try {
                                    int i12 = hVar2.f260z;
                                    int i13 = hVar2.A;
                                    Class clsY = hVar2.f244j.y();
                                    Class cls = hVar2.f243i;
                                    try {
                                        hVar = hVar2.f247m;
                                        jVarJ = hVar2.f244j.j();
                                        mapC = hVar2.f244j.C();
                                        zN = hVar2.f244j.N();
                                        zJ = hVar2.f244j.J();
                                        hVarR = hVar2.f244j.r();
                                        zH = hVar2.f244j.H();
                                        zE = hVar2.f244j.E();
                                        zD = hVar2.f244j.D();
                                        zP = hVar2.f244j.p();
                                        executor = hVar2.f251q;
                                        obj2 = obj3;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        obj = obj3;
                                    }
                                    try {
                                        hVar2.f253s = kVar.f(eVar, obj4, fVarZ, i12, i13, clsY, cls, hVar, jVarJ, mapC, zN, zJ, hVarR, zH, zE, zD, zP, hVar2, executor);
                                        if (hVar2.f256v != aVar) {
                                            hVar2.f253s = null;
                                        }
                                        if (z10) {
                                            hVar2.v("finished onSizeReady in " + e3.g.a(hVar2.f254t));
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        obj = obj2;
                                        throw th;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    obj = obj3;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                obj = obj3;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            obj = obj3;
                        }
                    }
                } catch (Throwable th7) {
                    th = th7;
                    obj = obj3;
                }
            } catch (Throwable th8) {
                th = th8;
                obj = hVar2;
            }
        }
    }

    @Override // a3.c
    public boolean g() {
        boolean z10;
        synchronized (this.f238d) {
            z10 = this.f256v == a.CLEARED;
        }
        return z10;
    }

    @Override // a3.g
    public Object h() {
        this.f237c.c();
        return this.f238d;
    }

    @Override // a3.c
    public void i() {
        synchronized (this.f238d) {
            try {
                j();
                this.f237c.c();
                this.f254t = e3.g.b();
                Object obj = this.f242h;
                if (obj == null) {
                    if (l.t(this.f245k, this.f246l)) {
                        this.f260z = this.f245k;
                        this.A = this.f246l;
                    }
                    A(new q("Received null model"), r() == null ? 5 : 3);
                    return;
                }
                a aVar = this.f256v;
                a aVar2 = a.RUNNING;
                if (aVar == aVar2) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (aVar == a.COMPLETE) {
                    c(this.f252r, i2.a.MEMORY_CACHE, false);
                    return;
                }
                p(obj);
                this.f235a = f3.b.b("GlideRequest");
                a aVar3 = a.WAITING_FOR_SIZE;
                this.f256v = aVar3;
                if (l.t(this.f245k, this.f246l)) {
                    f(this.f245k, this.f246l);
                } else {
                    this.f248n.d(this);
                }
                a aVar4 = this.f256v;
                if ((aVar4 == aVar2 || aVar4 == aVar3) && m()) {
                    this.f248n.h(s());
                }
                if (D) {
                    v("finished run method in " + e3.g.a(this.f254t));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // a3.c
    public boolean isRunning() {
        boolean z10;
        synchronized (this.f238d) {
            try {
                a aVar = this.f256v;
                z10 = aVar == a.RUNNING || aVar == a.WAITING_FOR_SIZE;
            } finally {
            }
        }
        return z10;
    }

    @Override // a3.c
    public boolean k() {
        boolean z10;
        synchronized (this.f238d) {
            z10 = this.f256v == a.COMPLETE;
        }
        return z10;
    }

    public String toString() {
        Object obj;
        Class cls;
        synchronized (this.f238d) {
            obj = this.f242h;
            cls = this.f243i;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}
