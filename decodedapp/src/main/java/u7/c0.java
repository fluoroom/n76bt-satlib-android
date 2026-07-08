package u7;

import u7.c;

/* JADX INFO: loaded from: classes.dex */
final class c0 implements c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ e f28395a;

    c0(e eVar) {
        this.f28395a = eVar;
    }

    @Override // u7.c.a
    public final void a(boolean z10) {
        e eVar = this.f28395a;
        eVar.f28420w.sendMessage(eVar.f28420w.obtainMessage(1, Boolean.valueOf(z10)));
    }
}
