package x2;

import android.content.Context;
import x2.b;

/* JADX INFO: loaded from: classes.dex */
final class d implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f31547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final b.a f31548b;

    d(Context context, b.a aVar) {
        this.f31547a = context.getApplicationContext();
        this.f31548b = aVar;
    }

    private void l() {
        r.a(this.f31547a).d(this.f31548b);
    }

    private void m() {
        r.a(this.f31547a).e(this.f31548b);
    }

    @Override // x2.l
    public void b() {
        l();
    }

    @Override // x2.l
    public void g() {
        m();
    }

    @Override // x2.l
    public void f() {
    }
}
