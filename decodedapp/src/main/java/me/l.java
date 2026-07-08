package me;

import he.h1;
import ne.u;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements bf.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f21978a = new l();

    public static final class a implements bf.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final u f21979b;

        public a(u uVar) {
            rd.m.e(uVar, "javaElement");
            this.f21979b = uVar;
        }

        @Override // he.g1
        public h1 a() {
            h1 h1Var = h1.f15282a;
            rd.m.d(h1Var, "NO_SOURCE_FILE");
            return h1Var;
        }

        @Override // bf.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public u b() {
            return this.f21979b;
        }

        public String toString() {
            return a.class.getName() + ": " + b();
        }
    }

    private l() {
    }

    @Override // bf.b
    public bf.a a(cf.l lVar) {
        rd.m.e(lVar, "javaElement");
        return new a((u) lVar);
    }
}
