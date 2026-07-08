package w1;

import e6.n;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class d implements x1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f31053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p6.n f31054b;

    private d(p6.n nVar, n nVar2) {
        this.f31054b = nVar;
        this.f31053a = nVar2;
    }

    static x1.a a(p6.n nVar, n nVar2) {
        return new d(nVar, nVar2);
    }

    static x1.a b(String str, Map map, n nVar) {
        return a((p6.n) map.get(str), nVar);
    }

    @Override // x1.a
    public Long asLong() {
        if (c() || d() || !this.f31054b.O()) {
            return null;
        }
        return Long.valueOf(this.f31054b.g());
    }

    public boolean c() {
        p6.n nVar = this.f31054b;
        return nVar == null || nVar.L();
    }

    public boolean d() {
        return !c() && this.f31054b.N();
    }

    public String toString() {
        return c() ? "Missing claim" : d() ? "Null claim" : this.f31054b.toString();
    }
}
