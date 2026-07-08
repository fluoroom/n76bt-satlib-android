package hc;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c implements ck.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final int f15231a = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    public static int c() {
        return f15231a;
    }

    public static c d(e eVar, a aVar) {
        oc.b.c(eVar, "source is null");
        oc.b.c(aVar, "mode is null");
        return yc.a.j(new rc.c(eVar, aVar));
    }

    public static c e() {
        return yc.a.j(rc.d.f25870b);
    }

    public static c h(Object obj) {
        oc.b.c(obj, "item is null");
        return yc.a.j(new rc.f(obj));
    }

    @Override // ck.a
    public final void a(ck.b bVar) {
        if (bVar instanceof f) {
            l((f) bVar);
        } else {
            oc.b.c(bVar, "s is null");
            l(new vc.d(bVar));
        }
    }

    public final void b() {
        rc.b.a(this);
    }

    public final c f(mc.d dVar, int i10) {
        return g(dVar, false, i10, c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final c g(mc.d dVar, boolean z10, int i10, int i11) {
        oc.b.c(dVar, "mapper is null");
        oc.b.d(i10, "maxConcurrency");
        oc.b.d(i11, "bufferSize");
        if (!(this instanceof pc.e)) {
            return yc.a.j(new rc.e(this, dVar, z10, i10, i11));
        }
        Object objCall = ((pc.e) this).call();
        return objCall == null ? e() : rc.i.a(objCall, dVar);
    }

    public final c i(mc.d dVar) {
        oc.b.c(dVar, "mapper is null");
        return yc.a.j(new rc.g(this, dVar));
    }

    public final c j(j jVar) {
        return k(jVar, false, c());
    }

    public final c k(j jVar, boolean z10, int i10) {
        oc.b.c(jVar, "scheduler is null");
        oc.b.d(i10, "bufferSize");
        return yc.a.j(new rc.h(this, jVar, z10, i10));
    }

    public final void l(f fVar) {
        oc.b.c(fVar, "s is null");
        try {
            ck.b bVarQ = yc.a.q(this, fVar);
            oc.b.c(bVarQ, "The RxJavaPlugins.onSubscribe hook returned a null FlowableSubscriber. Please check the handler provided to RxJavaPlugins.setOnFlowableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            m(bVarQ);
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

    protected abstract void m(ck.b bVar);
}
