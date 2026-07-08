package p6;

import com.fasterxml.jackson.databind.JavaType;
import java.io.Serializable;
import java.util.Collection;
import x6.i0;

/* JADX INFO: loaded from: classes.dex */
public final class g extends r6.r implements Serializable {
    private static final int H = r6.q.c(i.class);
    protected final r6.d A;
    protected final r6.i B;
    protected final int C;
    protected final int D;
    protected final int E;
    protected final int F;
    protected final int G;

    /* JADX INFO: renamed from: y */
    protected final i7.q f23973y;

    /* JADX INFO: renamed from: z */
    protected final d7.l f23974z;

    public g(r6.a aVar, a7.d dVar, i0 i0Var, i7.y yVar, r6.h hVar, r6.d dVar2, r6.l lVar) {
        super(aVar, dVar, i0Var, yVar, hVar, lVar);
        this.C = H;
        this.f23973y = null;
        this.f23974z = d7.l.f10835b;
        this.B = null;
        this.A = dVar2;
        this.D = 0;
        this.E = 0;
        this.F = 0;
        this.G = 0;
    }

    @Override // r6.q
    public final boolean N(r6.k kVar) {
        return this.f25583u.b(kVar);
    }

    @Override // r6.r
    /* JADX INFO: renamed from: k0 */
    public final g S(long j10) {
        return new g(this, j10, this.C, this.D, this.E, this.F, this.G);
    }

    public r6.b l0(h7.c cVar, Class cls, r6.e eVar) {
        return this.A.b(this, cVar, cls, eVar);
    }

    public r6.b m0(h7.c cVar, Class cls, r6.b bVar) {
        return this.A.c(this, cVar, cls, bVar);
    }

    public a7.e n0(JavaType javaType) {
        Collection collectionC;
        x6.d dVarS = H(javaType.r()).s();
        a7.g gVarP0 = g().p0(this, dVarS, javaType);
        if (gVarP0 == null) {
            gVarP0 = t(javaType);
            collectionC = null;
            if (gVarP0 == null) {
                return null;
            }
        } else {
            collectionC = h0().c(this, dVarS);
        }
        return gVarP0.b(this, javaType, collectionC);
    }

    public r6.i o0() {
        r6.i iVar = this.B;
        return iVar == null ? r6.i.f25527d : iVar;
    }

    public final int p0() {
        return this.C;
    }

    public final d7.l q0() {
        return this.f23974z;
    }

    public i7.q r0() {
        return this.f23973y;
    }

    public e6.j s0(e6.j jVar) {
        int i10 = this.E;
        if (i10 != 0) {
            jVar.Z0(this.D, i10);
        }
        int i11 = this.G;
        if (i11 != 0) {
            jVar.Y0(this.F, i11);
        }
        return jVar;
    }

    public e6.j t0(e6.j jVar, e6.c cVar) {
        int i10 = this.E;
        if (i10 != 0) {
            jVar.Z0(this.D, i10);
        }
        int i11 = this.G;
        if (i11 != 0) {
            jVar.Y0(this.F, i11);
        }
        if (cVar != null) {
            jVar.e1(cVar);
        }
        return jVar;
    }

    public c u0(JavaType javaType) {
        return i().c(this, javaType, this);
    }

    public c v0(JavaType javaType, c cVar) {
        return i().d(this, javaType, this, cVar);
    }

    public c w0(JavaType javaType) {
        return i().b(this, javaType, this);
    }

    public final boolean x0(i iVar) {
        return (iVar.d() & this.C) != 0;
    }

    public boolean y0() {
        return this.f25578g != null ? !r0.h() : x0(i.UNWRAP_ROOT_VALUE);
    }

    private g(g gVar, long j10, int i10, int i11, int i12, int i13, int i14) {
        super(gVar, j10);
        this.C = i10;
        this.f23973y = gVar.f23973y;
        this.f23974z = gVar.f23974z;
        this.A = gVar.A;
        this.B = gVar.B;
        this.D = i11;
        this.E = i12;
        this.F = i13;
        this.G = i14;
    }
}
