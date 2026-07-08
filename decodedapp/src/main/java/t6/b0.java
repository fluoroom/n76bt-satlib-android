package t6;

import java.io.Serializable;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class b0 extends p6.l implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final a7.e f27467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final p6.l f27468b;

    public b0(a7.e eVar, p6.l lVar) {
        this.f27467a = eVar;
        this.f27468b = lVar;
    }

    @Override // p6.l, s6.r
    public Object a(p6.h hVar) {
        return this.f27468b.a(hVar);
    }

    @Override // p6.l
    public Object e(e6.j jVar, p6.h hVar) {
        return this.f27468b.g(jVar, hVar, this.f27467a);
    }

    @Override // p6.l
    public Object f(e6.j jVar, p6.h hVar, Object obj) {
        return this.f27468b.f(jVar, hVar, obj);
    }

    @Override // p6.l
    public Object g(e6.j jVar, p6.h hVar, a7.e eVar) {
        throw new IllegalStateException("Type-wrapped deserializer's deserializeWithType should never get called");
    }

    @Override // p6.l
    public Object k(p6.h hVar) {
        return this.f27468b.k(hVar);
    }

    @Override // p6.l
    public Collection l() {
        return this.f27468b.l();
    }

    @Override // p6.l
    public Class p() {
        return this.f27468b.p();
    }

    @Override // p6.l
    public h7.c r() {
        return this.f27468b.r();
    }

    @Override // p6.l
    public Boolean s(p6.g gVar) {
        return this.f27468b.s(gVar);
    }
}
