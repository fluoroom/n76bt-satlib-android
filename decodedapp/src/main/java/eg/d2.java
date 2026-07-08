package eg;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d2 {

    /* JADX INFO: renamed from: a */
    public static final b f12073a = new b(null);

    /* JADX INFO: renamed from: b */
    public static final d2 f12074b = new a();

    public static final class a extends d2 {
        a() {
        }

        @Override // eg.d2
        public /* bridge */ /* synthetic */ a2 e(r0 r0Var) {
            return (a2) i(r0Var);
        }

        @Override // eg.d2
        public boolean f() {
            return true;
        }

        public Void i(r0 r0Var) {
            rd.m.e(r0Var, "key");
            return null;
        }

        public String toString() {
            return "Empty TypeSubstitution";
        }
    }

    public static final class b {
        public /* synthetic */ b(rd.h hVar) {
            this();
        }

        private b() {
        }
    }

    public static final class c extends d2 {
        c() {
        }

        @Override // eg.d2
        public boolean a() {
            return false;
        }

        @Override // eg.d2
        public boolean b() {
            return false;
        }

        @Override // eg.d2
        public ie.h d(ie.h hVar) {
            rd.m.e(hVar, "annotations");
            return d2.this.d(hVar);
        }

        @Override // eg.d2
        public a2 e(r0 r0Var) {
            rd.m.e(r0Var, "key");
            return d2.this.e(r0Var);
        }

        @Override // eg.d2
        public boolean f() {
            return d2.this.f();
        }

        @Override // eg.d2
        public r0 g(r0 r0Var, m2 m2Var) {
            rd.m.e(r0Var, "topLevelType");
            rd.m.e(m2Var, "position");
            return d2.this.g(r0Var, m2Var);
        }
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return false;
    }

    public final f2 c() {
        f2 f2VarG = f2.g(this);
        rd.m.d(f2VarG, "create(...)");
        return f2VarG;
    }

    public ie.h d(ie.h hVar) {
        rd.m.e(hVar, "annotations");
        return hVar;
    }

    public abstract a2 e(r0 r0Var);

    public boolean f() {
        return false;
    }

    public r0 g(r0 r0Var, m2 m2Var) {
        rd.m.e(r0Var, "topLevelType");
        rd.m.e(m2Var, "position");
        return r0Var;
    }

    public final d2 h() {
        return new c();
    }
}
