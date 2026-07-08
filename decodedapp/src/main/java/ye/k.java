package ye;

import he.h0;
import ve.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a */
    private final d f32584a;

    /* JADX INFO: renamed from: b */
    private final p f32585b;

    /* JADX INFO: renamed from: c */
    private final dd.j f32586c;

    /* JADX INFO: renamed from: d */
    private final af.e f32587d;

    public k(d dVar, p pVar, dd.j jVar) {
        rd.m.e(dVar, "components");
        rd.m.e(pVar, "typeParameterResolver");
        rd.m.e(jVar, "delegateForDefaultTypeQualifiers");
        this.f32584a = dVar;
        this.f32585b = pVar;
        this.f32586c = jVar;
        this.f32587d = new af.e(this, pVar);
    }

    public final d a() {
        return this.f32584a;
    }

    public final f0 b() {
        return (f0) this.f32586c.getValue();
    }

    public final dd.j c() {
        return this.f32586c;
    }

    public final h0 d() {
        return this.f32584a.m();
    }

    public final dg.n e() {
        return this.f32584a.u();
    }

    public final p f() {
        return this.f32585b;
    }

    public final af.e g() {
        return this.f32587d;
    }
}
