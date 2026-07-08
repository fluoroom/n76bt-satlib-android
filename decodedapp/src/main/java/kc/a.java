package kc;

import java.util.ArrayList;
import xc.g;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements b, nc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    g f19621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    volatile boolean f19622b;

    @Override // nc.a
    public boolean a(b bVar) {
        oc.b.c(bVar, "Disposable item is null");
        if (this.f19622b) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f19622b) {
                    return false;
                }
                g gVar = this.f19621a;
                if (gVar != null && gVar.e(bVar)) {
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    @Override // nc.a
    public boolean b(b bVar) {
        if (!a(bVar)) {
            return false;
        }
        bVar.dispose();
        return true;
    }

    @Override // nc.a
    public boolean c(b bVar) {
        oc.b.c(bVar, "d is null");
        if (!this.f19622b) {
            synchronized (this) {
                try {
                    if (!this.f19622b) {
                        g gVar = this.f19621a;
                        if (gVar == null) {
                            gVar = new g();
                            this.f19621a = gVar;
                        }
                        gVar.a(bVar);
                        return true;
                    }
                } finally {
                }
            }
        }
        bVar.dispose();
        return false;
    }

    @Override // kc.b
    public boolean d() {
        return this.f19622b;
    }

    @Override // kc.b
    public void dispose() {
        if (this.f19622b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f19622b) {
                    return;
                }
                this.f19622b = true;
                g gVar = this.f19621a;
                this.f19621a = null;
                e(gVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void e(g gVar) {
        if (gVar == null) {
            return;
        }
        ArrayList arrayList = null;
        for (Object obj : gVar.b()) {
            if (obj instanceof b) {
                try {
                    ((b) obj).dispose();
                } catch (Throwable th2) {
                    lc.b.b(th2);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th2);
                }
            }
        }
        if (arrayList != null) {
            if (arrayList.size() != 1) {
                throw new lc.a(arrayList);
            }
            throw xc.e.d((Throwable) arrayList.get(0));
        }
    }
}
