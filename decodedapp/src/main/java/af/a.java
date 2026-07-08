package af;

import ed.r0;
import eg.c1;
import eg.g0;
import eg.h2;
import he.l1;
import java.util.Set;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends g0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h2 f428d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c f429e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f430f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f431g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Set f432h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final c1 f433i;

    public /* synthetic */ a(h2 h2Var, c cVar, boolean z10, boolean z11, Set set, c1 c1Var, int i10, rd.h hVar) {
        this(h2Var, (i10 & 2) != 0 ? c.f434a : cVar, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? false : z11, (i10 & 16) != 0 ? null : set, (i10 & 32) != 0 ? null : c1Var);
    }

    public static /* synthetic */ a f(a aVar, h2 h2Var, c cVar, boolean z10, boolean z11, Set set, c1 c1Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            h2Var = aVar.f428d;
        }
        if ((i10 & 2) != 0) {
            cVar = aVar.f429e;
        }
        if ((i10 & 4) != 0) {
            z10 = aVar.f430f;
        }
        if ((i10 & 8) != 0) {
            z11 = aVar.f431g;
        }
        if ((i10 & 16) != 0) {
            set = aVar.f432h;
        }
        if ((i10 & 32) != 0) {
            c1Var = aVar.f433i;
        }
        Set set2 = set;
        c1 c1Var2 = c1Var;
        return aVar.e(h2Var, cVar, z10, z11, set2, c1Var2);
    }

    @Override // eg.g0
    public c1 a() {
        return this.f433i;
    }

    @Override // eg.g0
    public h2 b() {
        return this.f428d;
    }

    @Override // eg.g0
    public Set c() {
        return this.f432h;
    }

    public final a e(h2 h2Var, c cVar, boolean z10, boolean z11, Set set, c1 c1Var) {
        m.e(h2Var, "howThisTypeIsUsed");
        m.e(cVar, "flexibility");
        return new a(h2Var, cVar, z10, z11, set, c1Var);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return m.a(aVar.a(), a()) && aVar.b() == b() && aVar.f429e == this.f429e && aVar.f430f == this.f430f && aVar.f431g == this.f431g;
    }

    public final c g() {
        return this.f429e;
    }

    public final boolean h() {
        return this.f431g;
    }

    @Override // eg.g0
    public int hashCode() {
        c1 c1VarA = a();
        int iHashCode = c1VarA != null ? c1VarA.hashCode() : 0;
        int iHashCode2 = iHashCode + (iHashCode * 31) + b().hashCode();
        int iHashCode3 = iHashCode2 + (iHashCode2 * 31) + this.f429e.hashCode();
        int i10 = iHashCode3 + (iHashCode3 * 31) + (this.f430f ? 1 : 0);
        return i10 + (i10 * 31) + (this.f431g ? 1 : 0);
    }

    public final boolean i() {
        return this.f430f;
    }

    public final a j(boolean z10) {
        return f(this, null, null, z10, false, null, null, 59, null);
    }

    public a k(c1 c1Var) {
        return f(this, null, null, false, false, null, c1Var, 31, null);
    }

    public final a l(c cVar) {
        m.e(cVar, "flexibility");
        return f(this, null, cVar, false, false, null, null, 61, null);
    }

    @Override // eg.g0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public a d(l1 l1Var) {
        m.e(l1Var, "typeParameter");
        return f(this, null, null, false, false, c() != null ? r0.k(c(), l1Var) : r0.c(l1Var), null, 47, null);
    }

    public String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + this.f428d + ", flexibility=" + this.f429e + ", isRaw=" + this.f430f + ", isForAnnotationParameter=" + this.f431g + ", visitedTypeParameters=" + this.f432h + ", defaultType=" + this.f433i + ')';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(h2 h2Var, c cVar, boolean z10, boolean z11, Set set, c1 c1Var) {
        super(h2Var, set, c1Var);
        m.e(h2Var, "howThisTypeIsUsed");
        m.e(cVar, "flexibility");
        this.f428d = h2Var;
        this.f429e = cVar;
        this.f430f = z10;
        this.f431g = z11;
        this.f432h = set;
        this.f433i = c1Var;
    }
}
