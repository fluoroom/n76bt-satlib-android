package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* JADX INFO: loaded from: classes2.dex */
public final class x4 extends d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v3 f18245h;

    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        d dVar = this.f17948d;
        if (dVar != null) {
            q4 q4Var = (q4) ((x4) dVar).f17950f;
            q4Var.j((q4) ((x4) this.f17949e).f17950f);
            this.f17950f = q4Var;
        }
        super.onCompletion(countedCompleter);
    }

    public x4(v3 v3Var, v3 v3Var2, Spliterator spliterator) {
        super(v3Var2, spliterator);
        this.f18245h = v3Var;
    }

    public x4(x4 x4Var, Spliterator spliterator) {
        super(x4Var, spliterator);
        this.f18245h = x4Var.f18245h;
    }

    @Override // j$.util.stream.d
    public final d c(Spliterator spliterator) {
        return new x4(this, spliterator);
    }

    @Override // j$.util.stream.d
    public final Object a() {
        v3 v3Var = this.f17945a;
        q4 q4VarD0 = this.f18245h.D0();
        v3Var.F0(this.f17946b, q4VarD0);
        return q4VarD0;
    }
}
