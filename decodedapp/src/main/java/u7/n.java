package u7;

import t7.a;
import u7.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f28468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s7.c[] f28469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f28470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f28471d;

    protected n(j jVar, s7.c[] cVarArr, boolean z10, int i10) {
        this.f28468a = jVar;
        this.f28469b = cVarArr;
        this.f28470c = z10;
        this.f28471d = i10;
    }

    public void a() {
        this.f28468a.a();
    }

    public j.a b() {
        return this.f28468a.b();
    }

    public s7.c[] c() {
        return this.f28469b;
    }

    protected abstract void d(a.b bVar, t8.h hVar);

    public final int e() {
        return this.f28471d;
    }

    public final boolean f() {
        return this.f28470c;
    }
}
