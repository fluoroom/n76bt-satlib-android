package b7;

import d6.e0;

/* JADX INFO: loaded from: classes.dex */
public class i extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final String f3702c;

    public i(a7.f fVar, p6.d dVar, String str) {
        super(fVar, dVar);
        this.f3702c = str;
    }

    @Override // b7.u, a7.h
    public String b() {
        return this.f3702c;
    }

    @Override // b7.b, a7.h
    public e0.a c() {
        return e0.a.PROPERTY;
    }

    @Override // b7.b
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public i a(p6.d dVar) {
        return this.f3734b == dVar ? this : new i(this.f3733a, dVar, this.f3702c);
    }
}
