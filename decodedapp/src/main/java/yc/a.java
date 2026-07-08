package yc;

import hc.g;
import hc.i;
import hc.j;
import java.util.concurrent.Callable;
import lc.f;
import mc.c;
import mc.d;
import oc.b;
import xc.e;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static volatile c f32506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static volatile d f32507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static volatile d f32508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static volatile d f32509d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static volatile d f32510e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static volatile d f32511f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static volatile d f32512g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static volatile d f32513h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static volatile d f32514i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static volatile d f32515j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static volatile boolean f32516k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static volatile boolean f32517l;

    static Object a(d dVar, Object obj) {
        try {
            return dVar.apply(obj);
        } catch (Throwable th2) {
            throw e.d(th2);
        }
    }

    static j b(d dVar, Callable callable) {
        return (j) b.c(a(dVar, callable), "Scheduler Callable result can't be null");
    }

    static j c(Callable callable) {
        try {
            return (j) b.c(callable.call(), "Scheduler Callable result can't be null");
        } catch (Throwable th2) {
            throw e.d(th2);
        }
    }

    public static j d(Callable callable) {
        b.c(callable, "Scheduler Callable can't be null");
        d dVar = f32508c;
        return dVar == null ? c(callable) : b(dVar, callable);
    }

    public static j e(Callable callable) {
        b.c(callable, "Scheduler Callable can't be null");
        d dVar = f32510e;
        return dVar == null ? c(callable) : b(dVar, callable);
    }

    public static j f(Callable callable) {
        b.c(callable, "Scheduler Callable can't be null");
        d dVar = f32511f;
        return dVar == null ? c(callable) : b(dVar, callable);
    }

    public static j g(Callable callable) {
        b.c(callable, "Scheduler Callable can't be null");
        d dVar = f32509d;
        return dVar == null ? c(callable) : b(dVar, callable);
    }

    static boolean h(Throwable th2) {
        return (th2 instanceof lc.d) || (th2 instanceof lc.c) || (th2 instanceof IllegalStateException) || (th2 instanceof NullPointerException) || (th2 instanceof IllegalArgumentException) || (th2 instanceof lc.a);
    }

    public static boolean i() {
        return f32517l;
    }

    public static hc.c j(hc.c cVar) {
        d dVar = f32514i;
        return dVar != null ? (hc.c) a(dVar, cVar) : cVar;
    }

    public static g k(g gVar) {
        d dVar = f32515j;
        return dVar != null ? (g) a(dVar, gVar) : gVar;
    }

    public static boolean l() {
        return false;
    }

    public static j m(j jVar) {
        d dVar = f32512g;
        return dVar == null ? jVar : (j) a(dVar, jVar);
    }

    public static void n(Throwable th2) {
        c cVar = f32506a;
        if (th2 == null) {
            th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!h(th2)) {
            th2 = new f(th2);
        }
        if (cVar != null) {
            try {
                cVar.accept(th2);
                return;
            } catch (Throwable th3) {
                th3.printStackTrace();
                t(th3);
            }
        }
        th2.printStackTrace();
        t(th2);
    }

    public static j o(j jVar) {
        d dVar = f32513h;
        return dVar == null ? jVar : (j) a(dVar, jVar);
    }

    public static Runnable p(Runnable runnable) {
        b.c(runnable, "run is null");
        d dVar = f32507b;
        return dVar == null ? runnable : (Runnable) a(dVar, runnable);
    }

    public static void s(c cVar) {
        if (f32516k) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f32506a = cVar;
    }

    static void t(Throwable th2) {
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th2);
    }

    public static ck.b q(hc.c cVar, ck.b bVar) {
        return bVar;
    }

    public static i r(g gVar, i iVar) {
        return iVar;
    }
}
