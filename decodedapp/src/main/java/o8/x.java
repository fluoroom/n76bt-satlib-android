package o8;

import p8.h0;

/* JADX INFO: loaded from: classes.dex */
final class x extends h0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ d f23330c;

    x(c cVar, d dVar) {
        this.f23330c = dVar;
    }

    @Override // p8.c
    public final void deactivate() {
        this.f23330c.deactivate();
    }

    @Override // p8.c
    public final void g0(p8.m mVar) {
        this.f23330c.a(new t(this, mVar));
    }
}
