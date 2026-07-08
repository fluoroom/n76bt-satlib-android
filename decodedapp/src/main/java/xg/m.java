package xg;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f32131a = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile;

    public m(boolean z10) {
        this._cur$volatile = new n(8, z10);
    }

    public final boolean a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f32131a;
        while (true) {
            n nVar = (n) atomicReferenceFieldUpdater.get(this);
            int iA = nVar.a(obj);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                androidx.concurrent.futures.b.a(f32131a, this, nVar, nVar.l());
            } else if (iA == 2) {
                return false;
            }
        }
    }

    public final void b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f32131a;
        while (true) {
            n nVar = (n) atomicReferenceFieldUpdater.get(this);
            if (nVar.d()) {
                return;
            } else {
                androidx.concurrent.futures.b.a(f32131a, this, nVar, nVar.l());
            }
        }
    }

    public final int c() {
        return ((n) f32131a.get(this)).g();
    }

    public final Object e() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f32131a;
        while (true) {
            n nVar = (n) atomicReferenceFieldUpdater.get(this);
            Object objM = nVar.m();
            if (objM != n.f32135h) {
                return objM;
            }
            androidx.concurrent.futures.b.a(f32131a, this, nVar, nVar.l());
        }
    }
}
