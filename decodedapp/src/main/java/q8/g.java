package q8;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l8.x f24406a;

    public g(l8.x xVar) {
        this.f24406a = (l8.x) v7.q.i(xVar);
    }

    public void a() {
        try {
            this.f24406a.b0();
        } catch (RemoteException e10) {
            throw new q(e10);
        }
    }

    public void b(boolean z10) {
        try {
            this.f24406a.n1(z10);
        } catch (RemoteException e10) {
            throw new q(e10);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        try {
            return this.f24406a.M0(((g) obj).f24406a);
        } catch (RemoteException e10) {
            throw new q(e10);
        }
    }

    public int hashCode() {
        try {
            return this.f24406a.c();
        } catch (RemoteException e10) {
            throw new q(e10);
        }
    }
}
