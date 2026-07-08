package q8;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l8.j f24451a;

    public n(l8.j jVar) {
        this.f24451a = (l8.j) v7.q.i(jVar);
    }

    public void a() {
        try {
            this.f24451a.C();
        } catch (RemoteException e10) {
            throw new q(e10);
        }
    }

    public void b(boolean z10) {
        try {
            this.f24451a.N0(z10);
        } catch (RemoteException e10) {
            throw new q(e10);
        }
    }

    public void c(boolean z10) {
        try {
            this.f24451a.w0(z10);
        } catch (RemoteException e10) {
            throw new q(e10);
        }
    }

    public void d(float f10) {
        try {
            this.f24451a.k(f10);
        } catch (RemoteException e10) {
            throw new q(e10);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        try {
            return this.f24451a.k1(((n) obj).f24451a);
        } catch (RemoteException e10) {
            throw new q(e10);
        }
    }

    public int hashCode() {
        try {
            return this.f24451a.H();
        } catch (RemoteException e10) {
            throw new q(e10);
        }
    }
}
