package yj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kj.d1;

/* JADX INFO: loaded from: classes3.dex */
public class m extends e {

    /* JADX INFO: renamed from: c */
    private final d1 f32691c;

    /* JADX INFO: renamed from: d */
    private final List f32692d = new ArrayList();

    /* JADX INFO: renamed from: e */
    private final AtomicReference f32693e = new AtomicReference();

    /* JADX INFO: renamed from: f */
    private final AtomicReference f32694f = new AtomicReference();

    /* JADX INFO: renamed from: g */
    private final AtomicReference f32695g = new AtomicReference();

    /* JADX INFO: renamed from: h */
    private final AtomicReference f32696h = new AtomicReference();

    /* JADX INFO: renamed from: i */
    private final AtomicReference f32697i = new AtomicReference();

    /* JADX INFO: renamed from: j */
    private final AtomicReference f32698j = new AtomicReference();

    /* JADX INFO: renamed from: k */
    private final AtomicReference f32699k = new AtomicReference();

    /* JADX INFO: renamed from: l */
    private final AtomicReference f32700l = new AtomicReference();

    /* JADX INFO: renamed from: m */
    private final AtomicReference f32701m = new AtomicReference();

    /* JADX INFO: renamed from: n */
    private final AtomicReference f32702n = new AtomicReference();

    /* JADX INFO: renamed from: o */
    private final AtomicReference f32703o = new AtomicReference();

    /* JADX INFO: renamed from: p */
    private final AtomicReference f32704p = new AtomicReference();

    public m(d1 d1Var) {
        this.f32691c = d1Var;
    }

    public void A() {
        synchronized (this) {
            gj.g gVarD = this.f32691c.d();
            B(new s("^tai-utc\\.dat$", gVarD));
            B(new l0(gVarD));
            B(new a("^LeapSecond\\.dat$", gVarD));
        }
    }

    public void B(n0 n0Var) {
        synchronized (this) {
            this.f32692d.add(n0Var);
        }
    }

    @Override // yj.c0
    public t a() {
        t tVar = (t) this.f32702n.get();
        if (tVar != null) {
            return tVar;
        }
        androidx.lifecycle.b.a(this.f32702n, null, new t(d(), l()));
        return (t) this.f32702n.get();
    }

    @Override // yj.c0
    public o b() {
        o oVar = (o) this.f32703o.get();
        if (oVar != null) {
            return oVar;
        }
        androidx.lifecycle.b.a(this.f32703o, null, new o());
        return (o) this.f32703o.get();
    }

    @Override // yj.c0
    public u d() {
        u uVar = (u) this.f32701m.get();
        if (uVar != null) {
            return uVar;
        }
        androidx.lifecycle.b.a(this.f32701m, null, new u(h(), c()));
        return (u) this.f32701m.get();
    }

    @Override // yj.c0
    public k0 e() {
        k0 k0Var;
        k0 k0Var2 = (k0) this.f32693e.get();
        if (k0Var2 != null) {
            return k0Var2;
        }
        synchronized (this) {
            try {
                if (this.f32693e.get() == null) {
                    List listC = Collections.EMPTY_LIST;
                    if (this.f32692d.isEmpty()) {
                        A();
                    }
                    Iterator it = this.f32692d.iterator();
                    while (it.hasNext()) {
                        listC = ((n0) it.next()).c();
                        if (!listC.isEmpty()) {
                            break;
                        }
                    }
                    if (listC.isEmpty()) {
                        throw new hj.a(hj.f.NO_IERS_UTC_TAI_HISTORY_DATA_LOADED, new Object[0]);
                    }
                    androidx.lifecycle.b.a(this.f32693e, null, new k0(l(), listC));
                }
                k0Var = (k0) this.f32693e.get();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return k0Var;
    }

    @Override // yj.e, yj.c0
    public i0 f(zj.s sVar, boolean z10) {
        i0 i0VarF;
        synchronized (this) {
            i0VarF = super.f(sVar, z10);
        }
        return i0VarF;
    }

    @Override // yj.c0
    public k g() {
        k kVar = (k) this.f32699k.get();
        if (kVar != null) {
            return kVar;
        }
        androidx.lifecycle.b.a(this.f32699k, null, new k());
        return (k) this.f32699k.get();
    }

    @Override // yj.c0
    public v h() {
        v vVar = (v) this.f32695g.get();
        if (vVar != null) {
            return vVar;
        }
        androidx.lifecycle.b.a(this.f32695g, null, new v());
        return (v) this.f32695g.get();
    }

    @Override // yj.c0
    public l i() {
        l lVar = (l) this.f32696h.get();
        if (lVar != null) {
            return lVar;
        }
        androidx.lifecycle.b.a(this.f32696h, null, new l());
        return (l) this.f32696h.get();
    }

    @Override // yj.c0
    public q j() {
        q qVar = (q) this.f32698j.get();
        if (qVar != null) {
            return qVar;
        }
        androidx.lifecycle.b.a(this.f32698j, null, new q());
        return (q) this.f32698j.get();
    }

    @Override // yj.c0
    public f k() {
        f fVar = (f) this.f32704p.get();
        if (fVar != null) {
            return fVar;
        }
        androidx.lifecycle.b.a(this.f32704p, null, new f());
        return (f) this.f32704p.get();
    }

    @Override // yj.c0
    public r l() {
        r rVar = (r) this.f32694f.get();
        if (rVar != null) {
            return rVar;
        }
        androidx.lifecycle.b.a(this.f32694f, null, new r());
        return (r) this.f32694f.get();
    }

    @Override // yj.e
    protected kj.z p(zj.s sVar, boolean z10) {
        return this.f32691c.e(sVar, z10, this);
    }

    @Override // yj.e
    public i0 z(kj.z zVar) {
        return super.z(zVar);
    }
}
