package xi;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pi.b f32200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final pi.b f32201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final pi.b f32202c;

    public a(pi.b bVar, pi.b bVar2, pi.b bVar3) {
        this.f32200a = bVar;
        this.f32201b = bVar2;
        this.f32202c = bVar3;
    }

    public static a b(a aVar, a aVar2) {
        return aVar.a(aVar2);
    }

    public a a(a aVar) {
        return new a((pi.b) this.f32200a.r(this.f32201b, aVar.f32202c, (pi.b) this.f32202c.negate(), aVar.f32201b), (pi.b) this.f32201b.r(this.f32202c, aVar.f32200a, (pi.b) this.f32200a.negate(), aVar.f32202c), (pi.b) this.f32202c.r(this.f32200a, aVar.f32201b, (pi.b) this.f32201b.negate(), aVar.f32200a));
    }

    public pi.b c() {
        return (pi.b) ((pi.b) ((pi.b) ((pi.b) this.f32200a.n()).H((pi.b) this.f32201b.n())).H((pi.b) this.f32202c.n())).h();
    }

    public pi.b d() {
        return (pi.b) ((pi.b) ((pi.b) this.f32200a.n()).H((pi.b) this.f32201b.n())).H((pi.b) this.f32202c.n());
    }

    public pi.b e() {
        return this.f32200a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (aVar.h()) {
                return h();
            }
            if (this.f32200a.equals(aVar.f32200a) && this.f32201b.equals(aVar.f32201b) && this.f32202c.equals(aVar.f32202c)) {
                return true;
            }
        }
        return false;
    }

    public pi.b f() {
        return this.f32201b;
    }

    public pi.b g() {
        return this.f32202c;
    }

    public boolean h() {
        return Double.isNaN(this.f32200a.s()) || Double.isNaN(this.f32201b.s()) || Double.isNaN(this.f32202c.s());
    }

    public int hashCode() {
        if (h()) {
            return 409;
        }
        return ((this.f32200a.hashCode() * 107) + (this.f32201b.hashCode() * 83) + this.f32202c.hashCode()) * 311;
    }

    public a i() {
        pi.b bVarC = c();
        if (bVarC.s() != 0.0d) {
            return j((pi.b) bVarC.k());
        }
        throw new ui.g(wi.a.CANNOT_NORMALIZE_A_ZERO_NORM_VECTOR, new Object[0]);
    }

    public a j(pi.b bVar) {
        return new a((pi.b) this.f32200a.N(bVar), (pi.b) this.f32201b.N(bVar), (pi.b) this.f32202c.N(bVar));
    }

    public f k() {
        return new f(this.f32200a.s(), this.f32201b.s(), this.f32202c.s());
    }

    public String toString() {
        return g.d().a(k());
    }

    public a(double d10, a aVar, double d11, a aVar2) {
        pi.b bVarE = aVar.e();
        this.f32200a = (pi.b) bVarE.C(d10, aVar.e(), d11, aVar2.e());
        this.f32201b = (pi.b) bVarE.C(d10, aVar.f(), d11, aVar2.f());
        this.f32202c = (pi.b) bVarE.C(d10, aVar.g(), d11, aVar2.g());
    }

    public a(double d10, a aVar, double d11, a aVar2, double d12, a aVar3) {
        pi.b bVarE = aVar.e();
        this.f32200a = (pi.b) bVarE.v(d10, aVar.e(), d11, aVar2.e(), d12, aVar3.e());
        this.f32201b = (pi.b) bVarE.v(d10, aVar.f(), d11, aVar2.f(), d12, aVar3.f());
        this.f32202c = (pi.b) bVarE.v(d10, aVar.g(), d11, aVar2.g(), d12, aVar3.g());
    }
}
