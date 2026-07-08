package l2;

import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Queue f20331a = e3.l.f(20);

    c() {
    }

    abstract m a();

    m b() {
        m mVar = (m) this.f20331a.poll();
        return mVar == null ? a() : mVar;
    }

    public void c(m mVar) {
        if (this.f20331a.size() < 20) {
            this.f20331a.offer(mVar);
        }
    }
}
