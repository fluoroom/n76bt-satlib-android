package ic;

import hc.j;
import java.util.concurrent.Callable;
import lc.b;
import mc.d;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile d f16018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile d f16019b;

    static Object a(d dVar, Object obj) {
        try {
            return dVar.apply(obj);
        } catch (Throwable th2) {
            throw b.a(th2);
        }
    }

    static j b(d dVar, Callable callable) {
        j jVar = (j) a(dVar, callable);
        if (jVar != null) {
            return jVar;
        }
        throw new NullPointerException("Scheduler Callable returned null");
    }

    static j c(Callable callable) {
        try {
            j jVar = (j) callable.call();
            if (jVar != null) {
                return jVar;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Throwable th2) {
            throw b.a(th2);
        }
    }

    public static j d(Callable callable) {
        if (callable == null) {
            throw new NullPointerException("scheduler == null");
        }
        d dVar = f16018a;
        return dVar == null ? c(callable) : b(dVar, callable);
    }

    public static j e(j jVar) {
        if (jVar == null) {
            throw new NullPointerException("scheduler == null");
        }
        d dVar = f16019b;
        return dVar == null ? jVar : (j) a(dVar, jVar);
    }
}
