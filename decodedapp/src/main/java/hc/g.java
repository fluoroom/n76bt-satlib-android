package hc;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g implements h {
    public static int b() {
        return c.c();
    }

    public static g c(Object obj) {
        oc.b.c(obj, "The item is null");
        return yc.a.k(new sc.b(obj));
    }

    private g n(long j10, TimeUnit timeUnit, h hVar, j jVar) {
        oc.b.c(timeUnit, "timeUnit is null");
        oc.b.c(jVar, "scheduler is null");
        return yc.a.k(new sc.g(this, j10, timeUnit, jVar, hVar));
    }

    @Override // hc.h
    public final void a(i iVar) {
        oc.b.c(iVar, "observer is null");
        try {
            i iVarR = yc.a.r(this, iVar);
            oc.b.c(iVarR, "The RxJavaPlugins.onSubscribe hook returned a null Observer. Please change the handler provided to RxJavaPlugins.setOnObservableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            k(iVarR);
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th2) {
            lc.b.b(th2);
            yc.a.n(th2);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    public final g d(mc.d dVar) {
        oc.b.c(dVar, "mapper is null");
        return yc.a.k(new sc.c(this, dVar));
    }

    public final g e(j jVar) {
        return f(jVar, false, b());
    }

    public final g f(j jVar, boolean z10, int i10) {
        oc.b.c(jVar, "scheduler is null");
        oc.b.d(i10, "bufferSize");
        return yc.a.k(new sc.d(this, jVar, z10, i10));
    }

    public final kc.b g() {
        return j(oc.a.a(), oc.a.f23407f, oc.a.f23404c, oc.a.a());
    }

    public final kc.b h(mc.c cVar) {
        return j(cVar, oc.a.f23407f, oc.a.f23404c, oc.a.a());
    }

    public final kc.b i(mc.c cVar, mc.c cVar2) {
        return j(cVar, cVar2, oc.a.f23404c, oc.a.a());
    }

    public final kc.b j(mc.c cVar, mc.c cVar2, mc.a aVar, mc.c cVar3) {
        oc.b.c(cVar, "onNext is null");
        oc.b.c(cVar2, "onError is null");
        oc.b.c(aVar, "onComplete is null");
        oc.b.c(cVar3, "onSubscribe is null");
        qc.c cVar4 = new qc.c(cVar, cVar2, aVar, cVar3);
        a(cVar4);
        return cVar4;
    }

    protected abstract void k(i iVar);

    public final g l(j jVar) {
        oc.b.c(jVar, "scheduler is null");
        return yc.a.k(new sc.f(this, jVar));
    }

    public final g m(long j10, TimeUnit timeUnit) {
        return n(j10, timeUnit, null, zc.a.a());
    }
}
