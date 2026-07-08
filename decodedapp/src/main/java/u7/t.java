package u7;

import t7.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s7.c[] f28511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f28512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f28513c;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private p f28514a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private s7.c[] f28516c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f28515b = true;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f28517d = 0;

        /* synthetic */ a(f1 f1Var) {
        }

        public t a() {
            v7.q.b(this.f28514a != null, "execute parameter required");
            return new e1(this, this.f28516c, this.f28515b, this.f28517d);
        }

        public a b(p pVar) {
            this.f28514a = pVar;
            return this;
        }

        public a c(boolean z10) {
            this.f28515b = z10;
            return this;
        }

        public a d(s7.c... cVarArr) {
            this.f28516c = cVarArr;
            return this;
        }

        public a e(int i10) {
            this.f28517d = i10;
            return this;
        }
    }

    protected t(s7.c[] cVarArr, boolean z10, int i10) {
        this.f28511a = cVarArr;
        boolean z11 = false;
        if (cVarArr != null && z10) {
            z11 = true;
        }
        this.f28512b = z11;
        this.f28513c = i10;
    }

    public static a a() {
        return new a(null);
    }

    protected abstract void b(a.b bVar, t8.h hVar);

    public boolean c() {
        return this.f28512b;
    }

    public final int d() {
        return this.f28513c;
    }

    public final s7.c[] e() {
        return this.f28511a;
    }
}
