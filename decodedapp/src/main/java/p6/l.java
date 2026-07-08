package p6;

import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public abstract class l implements s6.r {

    public static abstract class a extends l {
    }

    @Override // s6.r
    public Object a(h hVar) {
        return n();
    }

    @Override // s6.r
    public Object b(h hVar) {
        return a(hVar);
    }

    public abstract Object e(e6.j jVar, h hVar);

    public Object f(e6.j jVar, h hVar, Object obj) throws v6.b {
        hVar.k0(this);
        return e(jVar, hVar);
    }

    public Object g(e6.j jVar, h hVar, a7.e eVar) {
        return eVar.c(jVar, hVar);
    }

    public Object h(e6.j jVar, h hVar, a7.e eVar, Object obj) throws v6.b {
        hVar.k0(this);
        return g(jVar, hVar, eVar);
    }

    public s6.u i(String str) {
        throw new IllegalArgumentException("Cannot handle managed/back reference '" + str + "': type: value deserializer of type " + getClass().getName() + " does not support them");
    }

    public i7.a j() {
        return i7.a.DYNAMIC;
    }

    public Object k(h hVar) {
        return a(hVar);
    }

    public Collection l() {
        return null;
    }

    public Object n() {
        return null;
    }

    public t6.s o() {
        return null;
    }

    public Class p() {
        return null;
    }

    public boolean q() {
        return false;
    }

    public h7.c r() {
        return null;
    }

    public Boolean s(g gVar) {
        return null;
    }

    public l t(i7.s sVar) {
        return this;
    }
}
