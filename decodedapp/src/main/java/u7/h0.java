package u7;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import t7.a;
import t7.g;
import u7.j;

/* JADX INFO: loaded from: classes.dex */
public final class h0 implements g.a, g.b {

    /* JADX INFO: renamed from: d */
    private final a.f f28431d;

    /* JADX INFO: renamed from: e */
    private final b f28432e;

    /* JADX INFO: renamed from: f */
    private final y f28433f;

    /* JADX INFO: renamed from: i */
    private final int f28436i;

    /* JADX INFO: renamed from: j */
    private final d1 f28437j;

    /* JADX INFO: renamed from: k */
    private boolean f28438k;

    /* JADX INFO: renamed from: o */
    final /* synthetic */ e f28442o;

    /* JADX INFO: renamed from: c */
    private final Queue f28430c = new LinkedList();

    /* JADX INFO: renamed from: g */
    private final Set f28434g = new HashSet();

    /* JADX INFO: renamed from: h */
    private final Map f28435h = new HashMap();

    /* JADX INFO: renamed from: l */
    private final List f28439l = new ArrayList();

    /* JADX INFO: renamed from: m */
    private s7.a f28440m = null;

    /* JADX INFO: renamed from: n */
    private int f28441n = 0;

    public h0(e eVar, t7.f fVar) {
        this.f28442o = eVar;
        a.f fVarS = fVar.s(eVar.f28420w.getLooper(), this);
        this.f28431d = fVarS;
        this.f28432e = fVar.n();
        this.f28433f = new y();
        this.f28436i = fVar.r();
        if (fVarS.o()) {
            this.f28437j = fVar.t(eVar.f28411e, eVar.f28420w);
        } else {
            this.f28437j = null;
        }
    }

    static /* bridge */ /* synthetic */ void B(h0 h0Var, j0 j0Var) {
        if (h0Var.f28439l.contains(j0Var) && !h0Var.f28438k) {
            if (h0Var.f28431d.b()) {
                h0Var.g();
            } else {
                h0Var.E();
            }
        }
    }

    static /* bridge */ /* synthetic */ void C(h0 h0Var, j0 j0Var) {
        s7.c[] cVarArrG;
        if (h0Var.f28439l.remove(j0Var)) {
            h0Var.f28442o.f28420w.removeMessages(15, j0Var);
            h0Var.f28442o.f28420w.removeMessages(16, j0Var);
            s7.c cVar = j0Var.f28451b;
            ArrayList arrayList = new ArrayList(h0Var.f28430c.size());
            for (l1 l1Var : h0Var.f28430c) {
                if ((l1Var instanceof p0) && (cVarArrG = ((p0) l1Var).g(h0Var)) != null && com.google.android.gms.common.util.a.b(cVarArrG, cVar)) {
                    arrayList.add(l1Var);
                }
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                l1 l1Var2 = (l1) arrayList.get(i10);
                h0Var.f28430c.remove(l1Var2);
                l1Var2.b(new t7.l(cVar));
            }
        }
    }

    private final s7.c c(s7.c[] cVarArr) {
        if (cVarArr != null && cVarArr.length != 0) {
            s7.c[] cVarArrM = this.f28431d.m();
            if (cVarArrM == null) {
                cVarArrM = new s7.c[0];
            }
            androidx.collection.a aVar = new androidx.collection.a(cVarArrM.length);
            for (s7.c cVar : cVarArrM) {
                aVar.put(cVar.b(), Long.valueOf(cVar.c()));
            }
            for (s7.c cVar2 : cVarArr) {
                Long l10 = (Long) aVar.get(cVar2.b());
                if (l10 == null || l10.longValue() < cVar2.c()) {
                    return cVar2;
                }
            }
        }
        return null;
    }

    private final void d(s7.a aVar) {
        Iterator it = this.f28434g.iterator();
        if (!it.hasNext()) {
            this.f28434g.clear();
            return;
        }
        android.support.v4.media.session.b.a(it.next());
        if (v7.o.a(aVar, s7.a.f26977e)) {
            this.f28431d.i();
        }
        throw null;
    }

    public final void e(Status status) {
        v7.q.d(this.f28442o.f28420w);
        f(status, null, false);
    }

    private final void f(Status status, Exception exc, boolean z10) {
        v7.q.d(this.f28442o.f28420w);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f28430c.iterator();
        while (it.hasNext()) {
            l1 l1Var = (l1) it.next();
            if (!z10 || l1Var.f28464a == 2) {
                if (status != null) {
                    l1Var.a(status);
                } else {
                    l1Var.b(exc);
                }
                it.remove();
            }
        }
    }

    private final void g() {
        ArrayList arrayList = new ArrayList(this.f28430c);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            l1 l1Var = (l1) arrayList.get(i10);
            if (!this.f28431d.b()) {
                return;
            }
            if (n(l1Var)) {
                this.f28430c.remove(l1Var);
            }
        }
    }

    public final void h() {
        D();
        d(s7.a.f26977e);
        m();
        Iterator it = this.f28435h.values().iterator();
        while (it.hasNext()) {
            u0 u0Var = (u0) it.next();
            if (c(u0Var.f28523a.c()) != null) {
                it.remove();
            } else {
                try {
                    u0Var.f28523a.d(this.f28431d, new t8.h());
                } catch (DeadObjectException unused) {
                    q(3);
                    this.f28431d.f("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException unused2) {
                    it.remove();
                }
            }
        }
        g();
        k();
    }

    public final void i(int i10) {
        D();
        this.f28438k = true;
        this.f28433f.e(i10, this.f28431d.n());
        b bVar = this.f28432e;
        e eVar = this.f28442o;
        eVar.f28420w.sendMessageDelayed(Message.obtain(eVar.f28420w, 9, bVar), 5000L);
        b bVar2 = this.f28432e;
        e eVar2 = this.f28442o;
        eVar2.f28420w.sendMessageDelayed(Message.obtain(eVar2.f28420w, 11, bVar2), 120000L);
        this.f28442o.f28413g.c();
        Iterator it = this.f28435h.values().iterator();
        while (it.hasNext()) {
            ((u0) it.next()).f28525c.run();
        }
    }

    private final void k() {
        this.f28442o.f28420w.removeMessages(12, this.f28432e);
        b bVar = this.f28432e;
        e eVar = this.f28442o;
        eVar.f28420w.sendMessageDelayed(eVar.f28420w.obtainMessage(12, bVar), this.f28442o.f28407a);
    }

    private final void l(l1 l1Var) {
        l1Var.d(this.f28433f, a());
        try {
            l1Var.c(this);
        } catch (DeadObjectException unused) {
            q(1);
            this.f28431d.f("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    private final void m() {
        if (this.f28438k) {
            e eVar = this.f28442o;
            eVar.f28420w.removeMessages(11, this.f28432e);
            e eVar2 = this.f28442o;
            eVar2.f28420w.removeMessages(9, this.f28432e);
            this.f28438k = false;
        }
    }

    private final boolean n(l1 l1Var) {
        if (!(l1Var instanceof p0)) {
            l(l1Var);
            return true;
        }
        p0 p0Var = (p0) l1Var;
        s7.c cVarC = c(p0Var.g(this));
        if (cVarC == null) {
            l(l1Var);
            return true;
        }
        Log.w("GoogleApiManager", this.f28431d.getClass().getName() + " could not execute call because it requires feature (" + cVarC.b() + ", " + cVarC.c() + ").");
        if (!this.f28442o.f28421x || !p0Var.f(this)) {
            p0Var.b(new t7.l(cVarC));
            return true;
        }
        j0 j0Var = new j0(this.f28432e, cVarC, null);
        int iIndexOf = this.f28439l.indexOf(j0Var);
        if (iIndexOf >= 0) {
            j0 j0Var2 = (j0) this.f28439l.get(iIndexOf);
            this.f28442o.f28420w.removeMessages(15, j0Var2);
            e eVar = this.f28442o;
            eVar.f28420w.sendMessageDelayed(Message.obtain(eVar.f28420w, 15, j0Var2), 5000L);
            return false;
        }
        this.f28439l.add(j0Var);
        e eVar2 = this.f28442o;
        eVar2.f28420w.sendMessageDelayed(Message.obtain(eVar2.f28420w, 15, j0Var), 5000L);
        e eVar3 = this.f28442o;
        eVar3.f28420w.sendMessageDelayed(Message.obtain(eVar3.f28420w, 16, j0Var), 120000L);
        s7.a aVar = new s7.a(2, null);
        if (o(aVar)) {
            return false;
        }
        this.f28442o.f(aVar, this.f28436i);
        return false;
    }

    private final boolean o(s7.a aVar) {
        synchronized (e.A) {
            try {
                e eVar = this.f28442o;
                if (eVar.f28417t == null || !eVar.f28418u.contains(this.f28432e)) {
                    return false;
                }
                this.f28442o.f28417t.s(aVar, this.f28436i);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final boolean p(boolean z10) {
        v7.q.d(this.f28442o.f28420w);
        if (!this.f28431d.b() || !this.f28435h.isEmpty()) {
            return false;
        }
        if (!this.f28433f.g()) {
            this.f28431d.f("Timing out service connection.");
            return true;
        }
        if (!z10) {
            return false;
        }
        k();
        return false;
    }

    public final void D() {
        v7.q.d(this.f28442o.f28420w);
        this.f28440m = null;
    }

    public final void E() {
        v7.q.d(this.f28442o.f28420w);
        if (this.f28431d.b() || this.f28431d.h()) {
            return;
        }
        try {
            e eVar = this.f28442o;
            int iB = eVar.f28413g.b(eVar.f28411e, this.f28431d);
            if (iB == 0) {
                e eVar2 = this.f28442o;
                a.f fVar = this.f28431d;
                l0 l0Var = new l0(eVar2, fVar, this.f28432e);
                if (fVar.o()) {
                    ((d1) v7.q.i(this.f28437j)).y1(l0Var);
                }
                try {
                    this.f28431d.g(l0Var);
                    return;
                } catch (SecurityException e10) {
                    H(new s7.a(10), e10);
                    return;
                }
            }
            s7.a aVar = new s7.a(iB, null);
            Log.w("GoogleApiManager", "The service for " + this.f28431d.getClass().getName() + " is not available: " + aVar.toString());
            H(aVar, null);
        } catch (IllegalStateException e11) {
            H(new s7.a(10), e11);
        }
    }

    public final void F(l1 l1Var) {
        v7.q.d(this.f28442o.f28420w);
        if (this.f28431d.b()) {
            if (n(l1Var)) {
                k();
                return;
            } else {
                this.f28430c.add(l1Var);
                return;
            }
        }
        this.f28430c.add(l1Var);
        s7.a aVar = this.f28440m;
        if (aVar == null || !aVar.f()) {
            E();
        } else {
            H(this.f28440m, null);
        }
    }

    final void G() {
        this.f28441n++;
    }

    public final void H(s7.a aVar, Exception exc) {
        v7.q.d(this.f28442o.f28420w);
        d1 d1Var = this.f28437j;
        if (d1Var != null) {
            d1Var.z1();
        }
        D();
        this.f28442o.f28413g.c();
        d(aVar);
        if ((this.f28431d instanceof x7.e) && aVar.b() != 24) {
            this.f28442o.f28408b = true;
            e eVar = this.f28442o;
            eVar.f28420w.sendMessageDelayed(eVar.f28420w.obtainMessage(19), 300000L);
        }
        if (aVar.b() == 4) {
            e(e.f28406z);
            return;
        }
        if (this.f28430c.isEmpty()) {
            this.f28440m = aVar;
            return;
        }
        if (exc != null) {
            v7.q.d(this.f28442o.f28420w);
            f(null, exc, false);
            return;
        }
        if (!this.f28442o.f28421x) {
            e(e.g(this.f28432e, aVar));
            return;
        }
        f(e.g(this.f28432e, aVar), null, true);
        if (this.f28430c.isEmpty() || o(aVar) || this.f28442o.f(aVar, this.f28436i)) {
            return;
        }
        if (aVar.b() == 18) {
            this.f28438k = true;
        }
        if (!this.f28438k) {
            e(e.g(this.f28432e, aVar));
            return;
        }
        e eVar2 = this.f28442o;
        eVar2.f28420w.sendMessageDelayed(Message.obtain(eVar2.f28420w, 9, this.f28432e), 5000L);
    }

    public final void I(s7.a aVar) {
        v7.q.d(this.f28442o.f28420w);
        a.f fVar = this.f28431d;
        fVar.f("onSignInFailed for " + fVar.getClass().getName() + " with " + String.valueOf(aVar));
        H(aVar, null);
    }

    public final void J() {
        v7.q.d(this.f28442o.f28420w);
        if (this.f28438k) {
            E();
        }
    }

    public final void K() {
        v7.q.d(this.f28442o.f28420w);
        e(e.f28405y);
        this.f28433f.f();
        for (j.a aVar : (j.a[]) this.f28435h.keySet().toArray(new j.a[0])) {
            F(new k1(aVar, new t8.h()));
        }
        d(new s7.a(4));
        if (this.f28431d.b()) {
            this.f28431d.e(new g0(this));
        }
    }

    public final void L() {
        v7.q.d(this.f28442o.f28420w);
        if (this.f28438k) {
            m();
            e eVar = this.f28442o;
            e(eVar.f28412f.f(eVar.f28411e) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
            this.f28431d.f("Timing out connection while resuming.");
        }
    }

    public final boolean a() {
        return this.f28431d.o();
    }

    public final boolean b() {
        return p(true);
    }

    @Override // u7.m
    public final void j(s7.a aVar) {
        H(aVar, null);
    }

    @Override // u7.d
    public final void q(int i10) {
        if (Looper.myLooper() == this.f28442o.f28420w.getLooper()) {
            i(i10);
        } else {
            this.f28442o.f28420w.post(new e0(this, i10));
        }
    }

    public final int r() {
        return this.f28436i;
    }

    final int s() {
        return this.f28441n;
    }

    public final a.f u() {
        return this.f28431d;
    }

    public final Map w() {
        return this.f28435h;
    }

    @Override // u7.d
    public final void x(Bundle bundle) {
        if (Looper.myLooper() == this.f28442o.f28420w.getLooper()) {
            h();
        } else {
            this.f28442o.f28420w.post(new d0(this));
        }
    }
}
