package u7;

import android.app.Dialog;

/* JADX INFO: loaded from: classes.dex */
final class n1 extends n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Dialog f28472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ o1 f28473b;

    n1(o1 o1Var, Dialog dialog) {
        this.f28473b = o1Var;
        this.f28472a = dialog;
    }

    @Override // u7.n0
    public final void a() {
        this.f28473b.f28487b.o();
        if (this.f28472a.isShowing()) {
            this.f28472a.dismiss();
        }
    }
}
