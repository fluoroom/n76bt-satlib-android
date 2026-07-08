package t8;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class k implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f27611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f27612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w f27613c;

    public k(Executor executor, a aVar, w wVar) {
        this.f27611a = executor;
        this.f27612b = aVar;
        this.f27613c = wVar;
    }

    @Override // t8.r
    public final void a(g gVar) {
        this.f27611a.execute(new j(this, gVar));
    }

    @Override // t8.r
    public final void i() {
        throw new UnsupportedOperationException();
    }
}
