package kj;

import java.util.function.Supplier;

/* JADX INFO: loaded from: classes3.dex */
public class f1 extends c {

    /* JADX INFO: renamed from: e */
    private final d1 f20106e;

    public f1(d1 d1Var, yj.c0 c0Var, final ej.b bVar) {
        super(c0Var, new Supplier() { // from class: kj.e1
            @Override // java.util.function.Supplier
            public final Object get() {
                return bVar.a().l();
            }
        });
        this.f20106e = d1Var;
    }

    @Override // kj.s0
    public z a(zj.s sVar, boolean z10) {
        return this.f20106e.e(sVar, z10, l());
    }
}
