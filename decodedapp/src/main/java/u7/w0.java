package u7;

import t7.a;
import u7.o;

/* JADX INFO: loaded from: classes.dex */
final class w0 extends n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ o.a f28530e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w0(o.a aVar, j jVar, s7.c[] cVarArr, boolean z10, int i10) {
        super(jVar, cVarArr, z10, i10);
        this.f28530e = aVar;
    }

    @Override // u7.n
    protected final void d(a.b bVar, t8.h hVar) {
        this.f28530e.f28477a.accept(bVar, hVar);
    }
}
