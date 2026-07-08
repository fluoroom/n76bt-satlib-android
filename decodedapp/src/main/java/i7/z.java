package i7;

import com.fasterxml.jackson.databind.JavaType;
import d6.r;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class z extends x6.u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final p6.b f15940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final x6.k f15941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final p6.x f15942d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final p6.y f15943e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final r.b f15944f;

    protected z(p6.b bVar, x6.k kVar, p6.y yVar, p6.x xVar, r.b bVar2) {
        this.f15940b = bVar;
        this.f15941c = kVar;
        this.f15943e = yVar;
        this.f15942d = xVar == null ? p6.x.f24068r : xVar;
        this.f15944f = bVar2;
    }

    public static z L(r6.q qVar, x6.k kVar, p6.y yVar) {
        return N(qVar, kVar, yVar, null, x6.u.f31818a);
    }

    public static z M(r6.q qVar, x6.k kVar, p6.y yVar, p6.x xVar, r.a aVar) {
        return new z(qVar.g(), kVar, yVar, xVar, (aVar == null || aVar == r.a.USE_DEFAULTS) ? x6.u.f31818a : r.b.a(aVar, null));
    }

    public static z N(r6.q qVar, x6.k kVar, p6.y yVar, p6.x xVar, r.b bVar) {
        return new z(qVar.g(), kVar, yVar, xVar, bVar);
    }

    @Override // x6.u
    public JavaType A() {
        x6.k kVar = this.f15941c;
        return kVar == null ? com.fasterxml.jackson.databind.type.c.b0() : kVar.f();
    }

    @Override // x6.u
    public Class B() {
        x6.k kVar = this.f15941c;
        return kVar == null ? Object.class : kVar.e();
    }

    @Override // x6.u
    public x6.l C() {
        x6.k kVar = this.f15941c;
        if ((kVar instanceof x6.l) && ((x6.l) kVar).x() == 1) {
            return (x6.l) this.f15941c;
        }
        return null;
    }

    @Override // x6.u
    public p6.y D() {
        x6.k kVar;
        p6.b bVar = this.f15940b;
        if (bVar == null || (kVar = this.f15941c) == null) {
            return null;
        }
        return bVar.t0(kVar);
    }

    @Override // x6.u
    public boolean E() {
        return this.f15941c instanceof x6.o;
    }

    @Override // x6.u
    public boolean F() {
        return this.f15941c instanceof x6.i;
    }

    @Override // x6.u
    public boolean G(p6.y yVar) {
        return this.f15943e.equals(yVar);
    }

    @Override // x6.u
    public boolean H() {
        return C() != null;
    }

    @Override // x6.u
    public boolean I() {
        return false;
    }

    @Override // x6.u
    public boolean J() {
        return false;
    }

    @Override // x6.u
    public p6.y a() {
        return this.f15943e;
    }

    @Override // x6.u
    public p6.x d() {
        return this.f15942d;
    }

    @Override // x6.u, i7.t
    public String getName() {
        return this.f15943e.c();
    }

    @Override // x6.u
    public r.b j() {
        return this.f15944f;
    }

    @Override // x6.u
    public x6.o r() {
        x6.k kVar = this.f15941c;
        if (kVar instanceof x6.o) {
            return (x6.o) kVar;
        }
        return null;
    }

    @Override // x6.u
    public Iterator s() {
        x6.o oVarR = r();
        return oVarR == null ? h.n() : Collections.singleton(oVarR).iterator();
    }

    @Override // x6.u
    public x6.i u() {
        x6.k kVar = this.f15941c;
        if (kVar instanceof x6.i) {
            return (x6.i) kVar;
        }
        return null;
    }

    @Override // x6.u
    public x6.l v() {
        x6.k kVar = this.f15941c;
        if ((kVar instanceof x6.l) && ((x6.l) kVar).x() == 0) {
            return (x6.l) this.f15941c;
        }
        return null;
    }

    @Override // x6.u
    public x6.k y() {
        return this.f15941c;
    }
}
