package u7;

import u7.j;

/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f28474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f28475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runnable f28476c;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private p f28477a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private p f28478b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private j f28480d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private s7.c[] f28481e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f28483g;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Runnable f28479c = new Runnable() { // from class: u7.v0
            @Override // java.lang.Runnable
            public final void run() {
            }
        };

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f28482f = true;

        /* synthetic */ a(y0 y0Var) {
        }

        public o a() {
            v7.q.b(this.f28477a != null, "Must set register function");
            v7.q.b(this.f28478b != null, "Must set unregister function");
            v7.q.b(this.f28480d != null, "Must set holder");
            return new o(new w0(this, this.f28480d, this.f28481e, this.f28482f, this.f28483g), new x0(this, (j.a) v7.q.j(this.f28480d.b(), "Key must not be null")), this.f28479c, null);
        }

        public a b(p pVar) {
            this.f28477a = pVar;
            return this;
        }

        public a c(int i10) {
            this.f28483g = i10;
            return this;
        }

        public a d(p pVar) {
            this.f28478b = pVar;
            return this;
        }

        public a e(j jVar) {
            this.f28480d = jVar;
            return this;
        }
    }

    /* synthetic */ o(n nVar, v vVar, Runnable runnable, z0 z0Var) {
        this.f28474a = nVar;
        this.f28475b = vVar;
        this.f28476c = runnable;
    }

    public static a a() {
        return new a(null);
    }
}
