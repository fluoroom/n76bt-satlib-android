package uc;

import hc.j;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends hc.j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final g f29071c = new g("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ThreadFactory f29072b;

    public d() {
        this(f29071c);
    }

    @Override // hc.j
    public j.b a() {
        return new e(this.f29072b);
    }

    public d(ThreadFactory threadFactory) {
        this.f29072b = threadFactory;
    }
}
