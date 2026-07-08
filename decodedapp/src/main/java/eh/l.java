package eh;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final jh.o f12550a;

    public l(jh.o oVar) {
        rd.m.e(oVar, "delegate");
        this.f12550a = oVar;
    }

    public final jh.o a() {
        return this.f12550a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(int i10, long j10, TimeUnit timeUnit, ih.d dVar, jh.g gVar) {
        this(new jh.o(dVar, i10, j10, timeUnit, gVar));
        rd.m.e(timeUnit, "timeUnit");
        rd.m.e(dVar, "taskRunner");
        rd.m.e(gVar, "connectionListener");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(int i10, long j10, TimeUnit timeUnit) {
        this(i10, j10, timeUnit, ih.d.f16139m, jh.g.f18749a.a());
        rd.m.e(timeUnit, "timeUnit");
    }

    public l() {
        this(5, 5L, TimeUnit.MINUTES);
    }
}
