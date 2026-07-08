package u7;

import t7.a;
import u7.t;

/* JADX INFO: loaded from: classes.dex */
final class e1 extends t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ t.a f28424d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e1(t.a aVar, s7.c[] cVarArr, boolean z10, int i10) {
        super(cVarArr, z10, i10);
        this.f28424d = aVar;
    }

    @Override // u7.t
    protected final void b(a.b bVar, t8.h hVar) {
        this.f28424d.f28514a.accept(bVar, hVar);
    }
}
