package q8;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l8.g f24439a;

    public l(l8.g gVar) {
        this.f24439a = (l8.g) v7.q.i(gVar);
    }

    public void a() {
        try {
            this.f24439a.m();
        } catch (RemoteException e10) {
            throw new q(e10);
        }
    }

    public void b(boolean z10) {
        try {
            this.f24439a.p1(z10);
        } catch (RemoteException e10) {
            throw new q(e10);
        }
    }

    public void c(boolean z10) {
        try {
            this.f24439a.U0(z10);
        } catch (RemoteException e10) {
            throw new q(e10);
        }
    }

    public void d(float f10) {
        try {
            this.f24439a.s0(f10);
        } catch (RemoteException e10) {
            throw new q(e10);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        try {
            return this.f24439a.D0(((l) obj).f24439a);
        } catch (RemoteException e10) {
            throw new q(e10);
        }
    }

    public int hashCode() {
        try {
            return this.f24439a.c();
        } catch (RemoteException e10) {
            throw new q(e10);
        }
    }
}
