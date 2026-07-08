package o8;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p8.f f23313a;

    k(p8.f fVar) {
        this.f23313a = fVar;
    }

    public void a(boolean z10) {
        try {
            this.f23313a.J(z10);
        } catch (RemoteException e10) {
            throw new q8.q(e10);
        }
    }

    public void b(boolean z10) {
        try {
            this.f23313a.B0(z10);
        } catch (RemoteException e10) {
            throw new q8.q(e10);
        }
    }

    public void c(boolean z10) {
        try {
            this.f23313a.o0(z10);
        } catch (RemoteException e10) {
            throw new q8.q(e10);
        }
    }

    public void d(boolean z10) {
        try {
            this.f23313a.y0(z10);
        } catch (RemoteException e10) {
            throw new q8.q(e10);
        }
    }
}
