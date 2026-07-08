package j$.util.stream;

import java.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class n1 implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t1 f18095b;

    public /* synthetic */ n1(t1 t1Var, int i10) {
        this.f18094a = i10;
        this.f18095b = t1Var;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f18094a) {
            case 0:
                return new q1(this.f18095b);
            case 1:
                return new p1(this.f18095b);
            default:
                return new r1(this.f18095b);
        }
    }
}
