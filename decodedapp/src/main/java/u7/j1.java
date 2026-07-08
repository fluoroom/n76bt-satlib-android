package u7;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public final class j1 extends p0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t f28452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t8.h f28453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final r f28454d;

    public j1(int i10, t tVar, t8.h hVar, r rVar) {
        super(i10);
        this.f28453c = hVar;
        this.f28452b = tVar;
        this.f28454d = rVar;
        if (i10 == 2 && tVar.c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // u7.l1
    public final void a(Status status) {
        this.f28453c.d(this.f28454d.a(status));
    }

    @Override // u7.l1
    public final void b(Exception exc) {
        this.f28453c.d(exc);
    }

    @Override // u7.l1
    public final void c(h0 h0Var) throws DeadObjectException {
        try {
            this.f28452b.b(h0Var.u(), this.f28453c);
        } catch (DeadObjectException e10) {
            throw e10;
        } catch (RemoteException e11) {
            a(l1.e(e11));
        } catch (RuntimeException e12) {
            this.f28453c.d(e12);
        }
    }

    @Override // u7.l1
    public final void d(y yVar, boolean z10) {
        yVar.d(this.f28453c, z10);
    }

    @Override // u7.p0
    public final boolean f(h0 h0Var) {
        return this.f28452b.c();
    }

    @Override // u7.p0
    public final s7.c[] g(h0 h0Var) {
        return this.f28452b.e();
    }
}
