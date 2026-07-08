package io.grpc.internal;

import io.grpc.internal.j;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import qb.z1;

/* JADX INFO: loaded from: classes3.dex */
final class l implements o2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Logger f16671f = Logger.getLogger(l.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ScheduledExecutorService f16672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qb.z1 f16673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j.a f16674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private j f16675d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private z1.d f16676e;

    l(j.a aVar, ScheduledExecutorService scheduledExecutorService, qb.z1 z1Var) {
        this.f16674c = aVar;
        this.f16672a = scheduledExecutorService;
        this.f16673b = z1Var;
    }

    public static /* synthetic */ void b(l lVar) {
        z1.d dVar = lVar.f16676e;
        if (dVar != null && dVar.b()) {
            lVar.f16676e.a();
        }
        lVar.f16675d = null;
    }

    @Override // io.grpc.internal.o2
    public void a(Runnable runnable) {
        this.f16673b.f();
        if (this.f16675d == null) {
            this.f16675d = this.f16674c.get();
        }
        z1.d dVar = this.f16676e;
        if (dVar == null || !dVar.b()) {
            long jA = this.f16675d.a();
            this.f16676e = this.f16673b.c(runnable, jA, TimeUnit.NANOSECONDS, this.f16672a);
            f16671f.log(Level.FINE, "Scheduling DNS resolution backoff for {0}ns", Long.valueOf(jA));
        }
    }

    @Override // io.grpc.internal.o2
    public void reset() {
        this.f16673b.f();
        this.f16673b.execute(new Runnable() { // from class: io.grpc.internal.k
            @Override // java.lang.Runnable
            public final void run() {
                l.b(this.f16659a);
            }
        });
    }
}
