package q8;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
final class e0 implements y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l8.p f24401c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ x f24402d;

    e0(x xVar) {
        this.f24402d = xVar;
        this.f24401c = xVar.f24481a;
    }

    @Override // q8.y
    public final v a(int i10, int i11, int i12) {
        try {
            return this.f24401c.V0(i10, i11, i12);
        } catch (RemoteException unused) {
            return null;
        }
    }
}
