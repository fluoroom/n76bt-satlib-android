package u7;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
abstract class g1 extends p0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final t8.h f28428b;

    public g1(int i10, t8.h hVar) {
        super(i10);
        this.f28428b = hVar;
    }

    @Override // u7.l1
    public final void a(Status status) {
        this.f28428b.d(new t7.b(status));
    }

    @Override // u7.l1
    public final void b(Exception exc) {
        this.f28428b.d(exc);
    }

    @Override // u7.l1
    public final void c(h0 h0Var) throws DeadObjectException {
        try {
            h(h0Var);
        } catch (DeadObjectException e10) {
            a(l1.e(e10));
            throw e10;
        } catch (RemoteException e11) {
            a(l1.e(e11));
        } catch (RuntimeException e12) {
            this.f28428b.d(e12);
        }
    }

    protected abstract void h(h0 h0Var);
}
