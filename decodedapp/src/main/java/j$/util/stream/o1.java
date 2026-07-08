package j$.util.stream;

import java.util.function.Predicate;

/* JADX INFO: loaded from: classes2.dex */
public final class o1 extends s1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t1 f18106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Predicate f18107d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(t1 t1Var, Predicate predicate) {
        super(t1Var);
        this.f18106c = t1Var;
        this.f18107d = predicate;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        if (this.f18158a) {
            return;
        }
        boolean zTest = this.f18107d.test(obj);
        t1 t1Var = this.f18106c;
        if (zTest == t1Var.f18169a) {
            this.f18158a = true;
            this.f18159b = t1Var.f18170b;
        }
    }
}
