package o8;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.maps.model.CameraPosition;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a */
    private final p8.b f23275a;

    /* JADX INFO: renamed from: b */
    private final Map f23276b = new HashMap();

    /* JADX INFO: renamed from: c */
    private final Map f23277c = new HashMap();

    /* JADX INFO: renamed from: d */
    private o8.k f23278d;

    public interface a {
        View c(q8.i iVar);

        View j(q8.i iVar);
    }

    public interface b {
        void a();
    }

    /* JADX INFO: renamed from: o8.c$c */
    public interface InterfaceC0314c {
        void a();
    }

    public interface d {
        void b(int i10);
    }

    public interface e {
        void f(q8.g gVar);
    }

    public interface f {
        void h(q8.i iVar);
    }

    public interface g {
        void a(q8.i iVar);
    }

    public interface h {
        boolean d(q8.i iVar);
    }

    public interface i {
        void e(q8.i iVar);

        void g(q8.i iVar);

        void i(q8.i iVar);
    }

    public interface j {
        void b(q8.l lVar);
    }

    public interface k {
        void k(q8.n nVar);
    }

    public c(p8.b bVar) {
        this.f23275a = (p8.b) v7.q.i(bVar);
    }

    public final void A(j jVar) {
        try {
            if (jVar == null) {
                this.f23275a.e0(null);
            } else {
                this.f23275a.e0(new v(this, jVar));
            }
        } catch (RemoteException e10) {
            throw new q8.q(e10);
        }
    }

    public final void B(k kVar) {
        try {
            if (kVar == null) {
                this.f23275a.L0(null);
            } else {
                this.f23275a.L0(new w(this, kVar));
            }
        } catch (RemoteException e10) {
            throw new q8.q(e10);
        }
    }

    public final void C(boolean z10) {
        try {
            this.f23275a.z0(z10);
        } catch (RemoteException e10) {
            throw new q8.q(e10);
        }
    }

    public final q8.g a(q8.h hVar) {
        try {
            v7.q.j(hVar, "GroundOverlayOptions must not be null.");
            l8.x xVarQ1 = this.f23275a.q1(hVar);
            if (xVarQ1 != null) {
                return new q8.g(xVarQ1);
            }
            return null;
        } catch (RemoteException e10) {
            throw new q8.q(e10);
        }
    }

    public final q8.i b(q8.j jVar) {
        try {
            v7.q.j(jVar, "MarkerOptions must not be null.");
            l8.d dVarD1 = this.f23275a.d1(jVar);
            if (dVarD1 != null) {
                return jVar.y() == 1 ? new q8.a(dVarD1) : new q8.i(dVarD1);
            }
            return null;
        } catch (RemoteException e10) {
            throw new q8.q(e10);
        }
    }

    public final q8.l c(q8.m mVar) {
        try {
            v7.q.j(mVar, "PolygonOptions must not be null");
            return new q8.l(this.f23275a.p0(mVar));
        } catch (RemoteException e10) {
            throw new q8.q(e10);
        }
    }

    public final q8.n d(q8.o oVar) {
        try {
            v7.q.j(oVar, "PolylineOptions must not be null");
            return new q8.n(this.f23275a.H0(oVar));
        } catch (RemoteException e10) {
            throw new q8.q(e10);
        }
    }

    public final q8.w e(q8.x xVar) {
        try {
            v7.q.j(xVar, "TileOverlayOptions must not be null.");
            l8.m mVarY = this.f23275a.Y(xVar);
            if (mVarY != null) {
                return new q8.w(mVarY);
            }
            return null;
        } catch (RemoteException e10) {
            throw new q8.q(e10);
        }
    }

    public final void f(o8.a aVar) {
        try {
            v7.q.j(aVar, "CameraUpdate must not be null.");
            this.f23275a.s1(aVar.a());
        } catch (RemoteException e10) {
            throw new q8.q(e10);
        }
    }

    public final CameraPosition g() {
        try {
            return this.f23275a.f0();
        } catch (RemoteException e10) {
            throw new q8.q(e10);
        }
    }

    public final float h() {
        try {
            return this.f23275a.h1();
        } catch (RemoteException e10) {
            throw new q8.q(e10);
        }
    }

    public final float i() {
        try {
            return this.f23275a.D();
        } catch (RemoteException e10) {
            throw new q8.q(e10);
        }
    }

    public final o8.h j() {
        try {
            return new o8.h(this.f23275a.s());
        } catch (RemoteException e10) {
            throw new q8.q(e10);
        }
    }

    public final o8.k k() {
        try {
            if (this.f23278d == null) {
                this.f23278d = new o8.k(this.f23275a.R0());
            }
            return this.f23278d;
        } catch (RemoteException e10) {
            throw new q8.q(e10);
        }
    }

    public final void l(o8.a aVar) {
        try {
            v7.q.j(aVar, "CameraUpdate must not be null.");
            this.f23275a.S0(aVar.a());
        } catch (RemoteException e10) {
            throw new q8.q(e10);
        }
    }

    public final void m(boolean z10) {
        try {
            this.f23275a.y(z10);
        } catch (RemoteException e10) {
            throw new q8.q(e10);
        }
    }

    public final boolean n(boolean z10) {
        try {
            return this.f23275a.I(z10);
        } catch (RemoteException e10) {
            throw new q8.q(e10);
        }
    }

    public final void o(a aVar) {
        try {
            if (aVar == null) {
                this.f23275a.c1(null);
            } else {
                this.f23275a.c1(new s(this, aVar));
            }
        } catch (RemoteException e10) {
            throw new q8.q(e10);
        }
    }

    public final void p(o8.d dVar) {
        try {
            if (dVar == null) {
                this.f23275a.u1(null);
            } else {
                this.f23275a.u1(new x(this, dVar));
            }
        } catch (RemoteException e10) {
            throw new q8.q(e10);
        }
    }

    public final void q(int i10) {
        try {
            this.f23275a.E0(i10);
        } catch (RemoteException e10) {
            throw new q8.q(e10);
        }
    }

    public final void r(boolean z10) {
        try {
            this.f23275a.i1(z10);
        } catch (RemoteException e10) {
            throw new q8.q(e10);
        }
    }

    public final void s(b bVar) {
        try {
            if (bVar == null) {
                this.f23275a.o1(null);
            } else {
                this.f23275a.o1(new a0(this, bVar));
            }
        } catch (RemoteException e10) {
            throw new q8.q(e10);
        }
    }

    public final void t(InterfaceC0314c interfaceC0314c) {
        try {
            if (interfaceC0314c == null) {
                this.f23275a.X0(null);
            } else {
                this.f23275a.X0(new z(this, interfaceC0314c));
            }
        } catch (RemoteException e10) {
            throw new q8.q(e10);
        }
    }

    public final void u(d dVar) {
        try {
            if (dVar == null) {
                this.f23275a.b1(null);
            } else {
                this.f23275a.b1(new y(this, dVar));
            }
        } catch (RemoteException e10) {
            throw new q8.q(e10);
        }
    }

    public final void v(e eVar) {
        try {
            if (eVar == null) {
                this.f23275a.A0(null);
            } else {
                this.f23275a.A0(new u(this, eVar));
            }
        } catch (RemoteException e10) {
            throw new q8.q(e10);
        }
    }

    public final void w(f fVar) {
        try {
            if (fVar == null) {
                this.f23275a.M(null);
            } else {
                this.f23275a.M(new q(this, fVar));
            }
        } catch (RemoteException e10) {
            throw new q8.q(e10);
        }
    }

    public final void x(g gVar) {
        try {
            if (gVar == null) {
                this.f23275a.t1(null);
            } else {
                this.f23275a.t1(new r(this, gVar));
            }
        } catch (RemoteException e10) {
            throw new q8.q(e10);
        }
    }

    public final void y(h hVar) {
        try {
            if (hVar == null) {
                this.f23275a.u0(null);
            } else {
                this.f23275a.u0(new l(this, hVar));
            }
        } catch (RemoteException e10) {
            throw new q8.q(e10);
        }
    }

    public final void z(i iVar) {
        try {
            if (iVar == null) {
                this.f23275a.q0(null);
            } else {
                this.f23275a.q0(new p(this, iVar));
            }
        } catch (RemoteException e10) {
            throw new q8.q(e10);
        }
    }
}
