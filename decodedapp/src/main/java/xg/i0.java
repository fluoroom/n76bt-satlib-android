package xg;

import tg.x1;

/* JADX INFO: loaded from: classes3.dex */
final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hd.i f32123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object[] f32124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x1[] f32125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f32126d;

    public i0(hd.i iVar, int i10) {
        this.f32123a = iVar;
        this.f32124b = new Object[i10];
        this.f32125c = new x1[i10];
    }

    public final void a(x1 x1Var, Object obj) {
        Object[] objArr = this.f32124b;
        int i10 = this.f32126d;
        objArr[i10] = obj;
        x1[] x1VarArr = this.f32125c;
        this.f32126d = i10 + 1;
        rd.m.c(x1Var, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        x1VarArr[i10] = x1Var;
    }

    public final void b(hd.i iVar) {
        int length = this.f32125c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i10 = length - 1;
            x1 x1Var = this.f32125c[length];
            rd.m.b(x1Var);
            x1Var.v(iVar, this.f32124b[length]);
            if (i10 < 0) {
                return;
            } else {
                length = i10;
            }
        }
    }
}
