package ih;

import rd.h;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f16125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f16126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f16127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f16128d;

    public a(String str, boolean z10) {
        m.e(str, "name");
        this.f16125a = str;
        this.f16126b = z10;
        this.f16128d = -1L;
    }

    public final boolean a() {
        return this.f16126b;
    }

    public final String b() {
        return this.f16125a;
    }

    public final long c() {
        return this.f16128d;
    }

    public final c d() {
        return this.f16127c;
    }

    public final void e(c cVar) {
        m.e(cVar, "queue");
        c cVar2 = this.f16127c;
        if (cVar2 == cVar) {
            return;
        }
        if (cVar2 != null) {
            throw new IllegalStateException("task is in multiple queues");
        }
        this.f16127c = cVar;
    }

    public abstract long f();

    public final void g(long j10) {
        this.f16128d = j10;
    }

    public String toString() {
        return this.f16125a;
    }

    public /* synthetic */ a(String str, boolean z10, int i10, h hVar) {
        this(str, (i10 & 2) != 0 ? true : z10);
    }
}
