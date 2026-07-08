package u7;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class p1 extends h implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected volatile boolean f28488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final AtomicReference f28489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Handler f28490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final s7.d f28491e;

    p1(i iVar, s7.d dVar) {
        super(iVar);
        this.f28489c = new AtomicReference(null);
        this.f28490d = new h8.h(Looper.getMainLooper());
        this.f28491e = dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(s7.a aVar, int i10) {
        this.f28489c.set(null);
        m(aVar, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        this.f28489c.set(null);
        n();
    }

    private static final int p(m1 m1Var) {
        if (m1Var == null) {
            return -1;
        }
        return m1Var.a();
    }

    @Override // u7.h
    public final void e(int i10, int i11, Intent intent) {
        m1 m1Var = (m1) this.f28489c.get();
        if (i10 != 1) {
            if (i10 == 2) {
                int iF = this.f28491e.f(b());
                if (iF == 0) {
                    o();
                    return;
                } else {
                    if (m1Var == null) {
                        return;
                    }
                    if (m1Var.b().b() == 18 && iF == 18) {
                        return;
                    }
                }
            }
        } else if (i11 == -1) {
            o();
            return;
        } else if (i11 == 0) {
            if (m1Var != null) {
                l(new s7.a(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, m1Var.b().toString()), p(m1Var));
                return;
            }
            return;
        }
        if (m1Var != null) {
            l(m1Var.b(), m1Var.a());
        }
    }

    @Override // u7.h
    public final void f(Bundle bundle) {
        super.f(bundle);
        if (bundle != null) {
            this.f28489c.set(bundle.getBoolean("resolving_error", false) ? new m1(new s7.a(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // u7.h
    public final void i(Bundle bundle) {
        super.i(bundle);
        m1 m1Var = (m1) this.f28489c.get();
        if (m1Var == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", m1Var.a());
        bundle.putInt("failed_status", m1Var.b().b());
        bundle.putParcelable("failed_resolution", m1Var.b().e());
    }

    @Override // u7.h
    public void j() {
        super.j();
        this.f28488b = true;
    }

    @Override // u7.h
    public void k() {
        super.k();
        this.f28488b = false;
    }

    protected abstract void m(s7.a aVar, int i10);

    protected abstract void n();

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        l(new s7.a(13, null), p((m1) this.f28489c.get()));
    }

    public final void s(s7.a aVar, int i10) {
        AtomicReference atomicReference;
        m1 m1Var = new m1(aVar, i10);
        do {
            atomicReference = this.f28489c;
            if (androidx.lifecycle.b.a(atomicReference, null, m1Var)) {
                this.f28490d.post(new o1(this, m1Var));
                return;
            }
        } while (atomicReference.get() == null);
    }
}
