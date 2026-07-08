package q8;

import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final l8.d f24419a;

    public i(l8.d dVar) {
        this.f24419a = (l8.d) v7.q.i(dVar);
    }

    public LatLng a() {
        try {
            return this.f24419a.u();
        } catch (RemoteException e10) {
            throw new q(e10);
        }
    }

    public String b() {
        try {
            return this.f24419a.J0();
        } catch (RemoteException e10) {
            throw new q(e10);
        }
    }

    public String c() {
        try {
            return this.f24419a.W0();
        } catch (RemoteException e10) {
            throw new q(e10);
        }
    }

    public float d() {
        try {
            return this.f24419a.e();
        } catch (RemoteException e10) {
            throw new q(e10);
        }
    }

    public boolean e() {
        try {
            return this.f24419a.f1();
        } catch (RemoteException e10) {
            throw new q(e10);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        try {
            return this.f24419a.U(((i) obj).f24419a);
        } catch (RemoteException e10) {
            throw new q(e10);
        }
    }

    public boolean f() {
        try {
            return this.f24419a.l1();
        } catch (RemoteException e10) {
            throw new q(e10);
        }
    }

    public void g() {
        try {
            this.f24419a.m();
        } catch (RemoteException e10) {
            throw new q(e10);
        }
    }

    public void h(b bVar) {
        try {
            if (bVar == null) {
                this.f24419a.X(null);
            } else {
                this.f24419a.X(bVar.a());
            }
        } catch (RemoteException e10) {
            throw new q(e10);
        }
    }

    public int hashCode() {
        try {
            return this.f24419a.x0();
        } catch (RemoteException e10) {
            throw new q(e10);
        }
    }

    public void i(LatLng latLng) {
        if (latLng == null) {
            throw new IllegalArgumentException("latlng cannot be null - a position is required.");
        }
        try {
            this.f24419a.N(latLng);
        } catch (RemoteException e10) {
            throw new q(e10);
        }
    }

    public void j(String str) {
        try {
            this.f24419a.P0(str);
        } catch (RemoteException e10) {
            throw new q(e10);
        }
    }

    public void k(String str) {
        try {
            this.f24419a.z(str);
        } catch (RemoteException e10) {
            throw new q(e10);
        }
    }

    public void l(boolean z10) {
        try {
            this.f24419a.G(z10);
        } catch (RemoteException e10) {
            throw new q(e10);
        }
    }

    public void m(float f10) {
        try {
            this.f24419a.k(f10);
        } catch (RemoteException e10) {
            throw new q(e10);
        }
    }

    public void n() {
        try {
            this.f24419a.n0();
        } catch (RemoteException e10) {
            throw new q(e10);
        }
    }
}
