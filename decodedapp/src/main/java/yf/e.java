package yf;

import eg.c1;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public class e implements g, h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final he.e f32603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f32604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final he.e f32605c;

    public e(he.e eVar, e eVar2) {
        m.e(eVar, "classDescriptor");
        this.f32603a = eVar;
        this.f32604b = eVar2 == null ? this : eVar2;
        this.f32605c = eVar;
    }

    @Override // yf.g
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c1 getType() {
        c1 c1VarS = this.f32603a.s();
        m.d(c1VarS, "getDefaultType(...)");
        return c1VarS;
    }

    public boolean equals(Object obj) {
        he.e eVar = this.f32603a;
        e eVar2 = obj instanceof e ? (e) obj : null;
        return m.a(eVar, eVar2 != null ? eVar2.f32603a : null);
    }

    public int hashCode() {
        return this.f32603a.hashCode();
    }

    @Override // yf.h
    public final he.e r() {
        return this.f32603a;
    }

    public String toString() {
        return "Class{" + getType() + '}';
    }
}
