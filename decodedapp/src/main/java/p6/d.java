package p6;

import com.fasterxml.jackson.databind.JavaType;
import d6.k;
import d6.r;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public interface d extends i7.t {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final k.d f23952m = new k.d();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final r.b f23953n = r.b.c();

    public static class a implements d, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final y f23954a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected final JavaType f23955b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected final y f23956c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected final x f23957d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        protected final x6.k f23958e;

        public a(y yVar, JavaType javaType, y yVar2, x6.k kVar, x xVar) {
            this.f23954a = yVar;
            this.f23955b = javaType;
            this.f23956c = yVar2;
            this.f23957d = xVar;
            this.f23958e = kVar;
        }

        @Override // p6.d
        public y a() {
            return this.f23954a;
        }

        public y b() {
            return this.f23956c;
        }

        @Override // p6.d
        public x d() {
            return this.f23957d;
        }

        @Override // p6.d
        public r.b e(r6.q qVar, Class cls) {
            x6.k kVar;
            r.b bVarZ;
            r.b bVarL = qVar.l(cls, this.f23955b.r());
            b bVarG = qVar.g();
            return (bVarG == null || (kVar = this.f23958e) == null || (bVarZ = bVarG.Z(kVar)) == null) ? bVarL : bVarL.n(bVarZ);
        }

        @Override // p6.d
        public k.d f(r6.q qVar, Class cls) {
            x6.k kVar;
            k.d dVarS;
            k.d dVarP = qVar.p(cls);
            b bVarG = qVar.g();
            return (bVarG == null || (kVar = this.f23958e) == null || (dVarS = bVarG.s(kVar)) == null) ? dVarP : dVarP.s(dVarS);
        }

        @Override // p6.d, i7.t
        public String getName() {
            return this.f23954a.c();
        }

        @Override // p6.d
        public JavaType getType() {
            return this.f23955b;
        }

        @Override // p6.d
        public x6.k h() {
            return this.f23958e;
        }
    }

    y a();

    x d();

    r.b e(r6.q qVar, Class cls);

    k.d f(r6.q qVar, Class cls);

    @Override // i7.t
    String getName();

    JavaType getType();

    x6.k h();
}
