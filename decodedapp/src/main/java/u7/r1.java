package u7;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
final class r1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ h f28501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f28502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ s1 f28503c;

    r1(s1 s1Var, h hVar, String str) {
        this.f28501a = hVar;
        this.f28502b = str;
        this.f28503c = s1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        s1 s1Var = this.f28503c;
        if (s1Var.f28509b > 0) {
            h hVar = this.f28501a;
            if (s1Var.f28510c != null) {
                bundle = s1Var.f28510c.getBundle(this.f28502b);
            } else {
                bundle = null;
            }
            hVar.f(bundle);
        }
        if (this.f28503c.f28509b >= 2) {
            this.f28501a.j();
        }
        if (this.f28503c.f28509b >= 3) {
            this.f28501a.h();
        }
        if (this.f28503c.f28509b >= 4) {
            this.f28501a.k();
        }
        if (this.f28503c.f28509b >= 5) {
            this.f28501a.g();
        }
    }
}
