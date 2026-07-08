package q8;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l8.m f24480a;

    public w(l8.m mVar) {
        this.f24480a = (l8.m) v7.q.i(mVar);
    }

    public void a() {
        try {
            this.f24480a.c();
        } catch (RemoteException e10) {
            throw new q(e10);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof w)) {
            return false;
        }
        try {
            return this.f24480a.l0(((w) obj).f24480a);
        } catch (RemoteException e10) {
            throw new q(e10);
        }
    }

    public int hashCode() {
        try {
            return this.f24480a.e();
        } catch (RemoteException e10) {
            throw new q(e10);
        }
    }
}
