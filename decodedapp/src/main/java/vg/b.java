package vg;

import dd.d0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import rd.m;
import xg.x;

/* JADX INFO: loaded from: classes3.dex */
final class b extends wg.a implements a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f30747c = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f30748b;

    public b(Object obj) {
        this._state$volatile = obj;
    }

    private final boolean c(Object obj, Object obj2) {
        int i10;
        wg.b[] bVarArrA;
        synchronized (this) {
            Object obj3 = f30747c.get(this);
            if (obj != null && !m.a(obj3, obj)) {
                return false;
            }
            if (m.a(obj3, obj2)) {
                return true;
            }
            f30747c.set(this, obj2);
            int i11 = this.f30748b;
            if ((i11 & 1) != 0) {
                this.f30748b = i11 + 2;
                return true;
            }
            int i12 = i11 + 1;
            this.f30748b = i12;
            wg.b[] bVarArrA2 = a();
            d0 d0Var = d0.f10897a;
            while (true) {
                d[] dVarArr = (d[]) bVarArrA2;
                if (dVarArr != null) {
                    for (d dVar : dVarArr) {
                    }
                }
                synchronized (this) {
                    i10 = this.f30748b;
                    if (i10 == i12) {
                        this.f30748b = i12 + 1;
                        return true;
                    }
                    bVarArrA = a();
                    d0 d0Var2 = d0.f10897a;
                }
                bVarArrA2 = bVarArrA;
                i12 = i10;
            }
        }
    }

    @Override // vg.a
    public Object getValue() {
        x xVar = wg.c.f31433a;
        Object obj = f30747c.get(this);
        if (obj == xVar) {
            return null;
        }
        return obj;
    }

    @Override // vg.a
    public void setValue(Object obj) {
        if (obj == null) {
            obj = wg.c.f31433a;
        }
        c(null, obj);
    }
}
