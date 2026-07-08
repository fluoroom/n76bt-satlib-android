package u7;

import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiActivity;

/* JADX INFO: loaded from: classes.dex */
final class o1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m1 f28486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ p1 f28487b;

    o1(p1 p1Var, m1 m1Var) {
        this.f28487b = p1Var;
        this.f28486a = m1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f28487b.f28488b) {
            s7.a aVarB = this.f28486a.b();
            if (aVarB.f()) {
                p1 p1Var = this.f28487b;
                p1Var.f28429a.startActivityForResult(GoogleApiActivity.a(p1Var.b(), (PendingIntent) v7.q.i(aVarB.e()), this.f28486a.a(), false), 1);
                return;
            }
            p1 p1Var2 = this.f28487b;
            if (p1Var2.f28491e.a(p1Var2.b(), aVarB.b(), null) != null) {
                p1 p1Var3 = this.f28487b;
                p1Var3.f28491e.u(p1Var3.b(), p1Var3.f28429a, aVarB.b(), 2, this.f28487b);
                return;
            }
            if (aVarB.b() != 18) {
                this.f28487b.l(aVarB, this.f28486a.a());
                return;
            }
            p1 p1Var4 = this.f28487b;
            Dialog dialogP = p1Var4.f28491e.p(p1Var4.b(), p1Var4);
            p1 p1Var5 = this.f28487b;
            p1Var5.f28491e.q(p1Var5.b().getApplicationContext(), new n1(this, dialogP));
        }
    }
}
