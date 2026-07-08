package u7;

import android.os.DeadObjectException;
import android.util.Log;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public final class h1 extends l1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final com.google.android.gms.common.api.internal.a f28443b;

    public h1(int i10, com.google.android.gms.common.api.internal.a aVar) {
        super(i10);
        this.f28443b = (com.google.android.gms.common.api.internal.a) v7.q.j(aVar, "Null methods are not runnable.");
    }

    @Override // u7.l1
    public final void a(Status status) {
        try {
            this.f28443b.o(status);
        } catch (IllegalStateException e10) {
            Log.w("ApiCallRunner", "Exception reporting failure", e10);
        }
    }

    @Override // u7.l1
    public final void b(Exception exc) {
        try {
            this.f28443b.o(new Status(10, exc.getClass().getSimpleName() + ": " + exc.getLocalizedMessage()));
        } catch (IllegalStateException e10) {
            Log.w("ApiCallRunner", "Exception reporting failure", e10);
        }
    }

    @Override // u7.l1
    public final void c(h0 h0Var) throws DeadObjectException {
        try {
            this.f28443b.m(h0Var.u());
        } catch (RuntimeException e10) {
            b(e10);
        }
    }

    @Override // u7.l1
    public final void d(y yVar, boolean z10) {
        yVar.c(this.f28443b, z10);
    }
}
