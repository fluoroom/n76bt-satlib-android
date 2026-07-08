package tg;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public final class m0 extends xg.v {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f27844e = AtomicIntegerFieldUpdater.newUpdater(m0.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    public m0(hd.i iVar, hd.e eVar) {
        super(iVar, eVar);
    }

    private final boolean C0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f27844e;
        do {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f27844e.compareAndSet(this, 0, 2));
        return true;
    }

    private final boolean D0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f27844e;
        do {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f27844e.compareAndSet(this, 0, 1));
        return true;
    }

    public final Object A0() {
        if (D0()) {
            return id.b.e();
        }
        Object objH = m1.h(K());
        if (objH instanceof s) {
            throw ((s) objH).f27867a;
        }
        return objH;
    }

    @Override // xg.v, tg.l1
    protected void i(Object obj) throws l0 {
        v0(obj);
    }

    @Override // xg.v, tg.a
    protected void v0(Object obj) throws l0 {
        if (C0()) {
            return;
        }
        xg.g.b(id.b.c(this.f32147d), u.a(obj, this.f32147d));
    }
}
