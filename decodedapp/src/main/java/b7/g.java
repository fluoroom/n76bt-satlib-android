package b7;

import d6.e0;

/* JADX INFO: loaded from: classes.dex */
public class g extends u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final String f3698c;

    public g(a7.f fVar, p6.d dVar, String str) {
        super(fVar, dVar);
        this.f3698c = str;
    }

    @Override // b7.u, a7.h
    public String b() {
        return this.f3698c;
    }

    @Override // a7.h
    public e0.a c() {
        return e0.a.EXTERNAL_PROPERTY;
    }

    @Override // a7.h
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public g a(p6.d dVar) {
        return this.f3734b == dVar ? this : new g(this.f3733a, dVar, this.f3698c);
    }
}
