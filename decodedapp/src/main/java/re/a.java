package re;

import rd.m;
import yd.h;
import yd.j;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f25962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f25963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f25964c;

    public a(h hVar, d dVar) {
        m.e(hVar, "flags");
        m.e(dVar, "flag");
        this.f25962a = hVar;
        this.f25963b = dVar;
        if (dVar.a() == 1 && dVar.c() == 1) {
            this.f25964c = 1 << dVar.b();
            return;
        }
        throw new IllegalArgumentException(("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but " + dVar + " was passed").toString());
    }

    public final boolean a(Object obj, j jVar) {
        m.e(jVar, "property");
        return this.f25963b.d(((Number) this.f25962a.get(obj)).intValue());
    }

    public final void b(Object obj, j jVar, boolean z10) {
        m.e(jVar, "property");
        int iIntValue = ((Number) this.f25962a.get(obj)).intValue();
        this.f25962a.set(obj, Integer.valueOf(z10 ? iIntValue | this.f25964c : iIntValue & (~this.f25964c)));
    }
}
