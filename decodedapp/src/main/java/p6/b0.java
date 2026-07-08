package p6;

import com.fasterxml.jackson.databind.JavaType;
import e6.g;
import java.io.Serializable;
import x6.i0;

/* JADX INFO: loaded from: classes.dex */
public final class b0 extends r6.r implements Serializable {
    protected static final e6.o E = new o6.e();
    private static final int F = r6.q.c(c0.class);
    protected final int A;
    protected final int B;
    protected final int C;
    protected final int D;

    /* JADX INFO: renamed from: y */
    protected final e6.o f23932y;

    /* JADX INFO: renamed from: z */
    protected final int f23933z;

    public b0(r6.a aVar, a7.d dVar, i0 i0Var, i7.y yVar, r6.h hVar, r6.l lVar) {
        super(aVar, dVar, i0Var, yVar, hVar, lVar);
        this.f23933z = F;
        this.f23932y = E;
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.D = 0;
    }

    @Override // r6.q
    public final boolean N(r6.k kVar) {
        return this.f25583u.b(kVar);
    }

    @Override // r6.r
    /* JADX INFO: renamed from: k0 */
    public final b0 S(long j10) {
        return new b0(this, j10, this.f23933z, this.A, this.B, this.C, this.D);
    }

    public e6.o l0() {
        e6.o oVar = this.f23932y;
        return oVar instanceof o6.f ? (e6.o) ((o6.f) oVar).e() : oVar;
    }

    public e6.o m0() {
        return this.f23932y;
    }

    public e7.k n0() {
        return null;
    }

    public void o0(e6.g gVar) {
        e6.o oVarL0;
        if (c0.INDENT_OUTPUT.e(this.f23933z) && gVar.v() == null && (oVarL0 = l0()) != null) {
            gVar.T(oVarL0);
        }
        boolean zE = c0.WRITE_BIGDECIMAL_AS_PLAIN.e(this.f23933z);
        int i10 = this.B;
        if (i10 != 0 || zE) {
            int i11 = this.A;
            if (zE) {
                int iF = g.b.WRITE_BIGDECIMAL_AS_PLAIN.f();
                i11 |= iF;
                i10 |= iF;
            }
            gVar.G(i11, i10);
        }
        int i12 = this.D;
        if (i12 != 0) {
            gVar.x(this.C, i12);
        }
    }

    public c p0(JavaType javaType) {
        return i().e(this, javaType, this);
    }

    public final boolean q0(c0 c0Var) {
        return (c0Var.d() & this.f23933z) != 0;
    }

    public b0 r0(c0 c0Var) {
        int i10 = this.f23933z & (~c0Var.d());
        return i10 == this.f23933z ? this : new b0(this, this.f25571a, i10, this.A, this.B, this.C, this.D);
    }

    private b0(b0 b0Var, long j10, int i10, int i11, int i12, int i13, int i14) {
        super(b0Var, j10);
        this.f23933z = i10;
        b0Var.getClass();
        this.f23932y = b0Var.f23932y;
        this.A = i11;
        this.B = i12;
        this.C = i13;
        this.D = i14;
    }
}
