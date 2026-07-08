package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import x2.o;

/* JADX INFO: loaded from: classes.dex */
public class c implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: t */
    private static volatile c f5087t;

    /* JADX INFO: renamed from: u */
    private static volatile boolean f5088u;

    /* JADX INFO: renamed from: a */
    private final k2.k f5089a;

    /* JADX INFO: renamed from: b */
    private final l2.d f5090b;

    /* JADX INFO: renamed from: c */
    private final m2.h f5091c;

    /* JADX INFO: renamed from: d */
    private final e f5092d;

    /* JADX INFO: renamed from: e */
    private final l2.b f5093e;

    /* JADX INFO: renamed from: f */
    private final o f5094f;

    /* JADX INFO: renamed from: g */
    private final x2.c f5095g;

    /* JADX INFO: renamed from: r */
    private final a f5097r;

    /* JADX INFO: renamed from: h */
    private final List f5096h = new ArrayList();

    /* JADX INFO: renamed from: s */
    private g f5098s = g.NORMAL;

    public interface a {
        a3.f build();
    }

    c(Context context, k2.k kVar, m2.h hVar, l2.d dVar, l2.b bVar, o oVar, x2.c cVar, int i10, a aVar, Map map, List list, List list2, y2.a aVar2, f fVar) {
        this.f5089a = kVar;
        this.f5090b = dVar;
        this.f5093e = bVar;
        this.f5091c = hVar;
        this.f5094f = oVar;
        this.f5095g = cVar;
        this.f5097r = aVar;
        this.f5092d = new e(context, bVar, k.d(this, list2, aVar2), new b3.f(), aVar, map, list, kVar, fVar, i10);
    }

    static void a(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        if (f5088u) {
            throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
        }
        f5088u = true;
        try {
            m(context, generatedAppGlideModule);
        } finally {
            f5088u = false;
        }
    }

    public static c c(Context context) {
        if (f5087t == null) {
            GeneratedAppGlideModule generatedAppGlideModuleD = d(context.getApplicationContext());
            synchronized (c.class) {
                try {
                    if (f5087t == null) {
                        a(context, generatedAppGlideModuleD);
                    }
                } finally {
                }
            }
        }
        return f5087t;
    }

    private static GeneratedAppGlideModule d(Context context) {
        try {
            return (GeneratedAppGlideModule) GeneratedAppGlideModuleImpl.class.getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            if (!Log.isLoggable("Glide", 5)) {
                return null;
            }
            Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            return null;
        } catch (IllegalAccessException e10) {
            q(e10);
            return null;
        } catch (InstantiationException e11) {
            q(e11);
            return null;
        } catch (NoSuchMethodException e12) {
            q(e12);
            return null;
        } catch (InvocationTargetException e13) {
            q(e13);
            return null;
        }
    }

    private static o l(Context context) {
        e3.k.f(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return c(context).k();
    }

    private static void m(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        n(context, new d(), generatedAppGlideModule);
    }

    private static void n(Context context, d dVar, GeneratedAppGlideModule generatedAppGlideModule) {
        Context applicationContext = context.getApplicationContext();
        List listB = Collections.EMPTY_LIST;
        if (generatedAppGlideModule == null || generatedAppGlideModule.c()) {
            listB = new y2.d(applicationContext).b();
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.d().isEmpty()) {
            generatedAppGlideModule.d();
            Iterator it = listB.iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                throw null;
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator it2 = listB.iterator();
            if (it2.hasNext()) {
                android.support.v4.media.session.b.a(it2.next());
                new StringBuilder().append("Discovered GlideModule from manifest: ");
                throw null;
            }
        }
        dVar.b(generatedAppGlideModule != null ? generatedAppGlideModule.e() : null);
        Iterator it3 = listB.iterator();
        if (it3.hasNext()) {
            android.support.v4.media.session.b.a(it3.next());
            throw null;
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.b(applicationContext, dVar);
        }
        c cVarA = dVar.a(applicationContext, listB, generatedAppGlideModule);
        applicationContext.registerComponentCallbacks(cVarA);
        f5087t = cVarA;
    }

    private static void q(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    public static m t(Context context) {
        return l(context).d(context);
    }

    public void b() {
        e3.l.a();
        this.f5091c.b();
        this.f5090b.b();
        this.f5093e.b();
    }

    public l2.b e() {
        return this.f5093e;
    }

    public l2.d f() {
        return this.f5090b;
    }

    x2.c g() {
        return this.f5095g;
    }

    public Context h() {
        return this.f5092d.getBaseContext();
    }

    e i() {
        return this.f5092d;
    }

    public j j() {
        return this.f5092d.i();
    }

    public o k() {
        return this.f5094f;
    }

    void o(m mVar) {
        synchronized (this.f5096h) {
            try {
                if (this.f5096h.contains(mVar)) {
                    throw new IllegalStateException("Cannot register already registered manager");
                }
                this.f5096h.add(mVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        b();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        r(i10);
    }

    boolean p(b3.h hVar) {
        synchronized (this.f5096h) {
            try {
                Iterator it = this.f5096h.iterator();
                while (it.hasNext()) {
                    if (((m) it.next()).A(hVar)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void r(int i10) {
        e3.l.a();
        synchronized (this.f5096h) {
            try {
                Iterator it = this.f5096h.iterator();
                while (it.hasNext()) {
                    ((m) it.next()).onTrimMemory(i10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f5091c.a(i10);
        this.f5090b.a(i10);
        this.f5093e.a(i10);
    }

    void s(m mVar) {
        synchronized (this.f5096h) {
            try {
                if (!this.f5096h.contains(mVar)) {
                    throw new IllegalStateException("Cannot unregister not yet registered manager");
                }
                this.f5096h.remove(mVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
