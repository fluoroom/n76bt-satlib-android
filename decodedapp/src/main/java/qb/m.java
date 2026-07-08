package qb;

import java.util.concurrent.Executor;
import qb.b;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends qb.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qb.b f24680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qb.b f24681b;

    private static final class a extends b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b.a f24682a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final z0 f24683b;

        public a(b.a aVar, z0 z0Var) {
            this.f24682a = aVar;
            this.f24683b = z0Var;
        }

        @Override // qb.b.a
        public void a(z0 z0Var) {
            r9.l.o(z0Var, "headers");
            z0 z0Var2 = new z0();
            z0Var2.l(this.f24683b);
            z0Var2.l(z0Var);
            this.f24682a.a(z0Var2);
        }
    }

    private final class b extends b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b.AbstractC0337b f24684a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Executor f24685b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final b.a f24686c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final s f24687d;

        public b(b.AbstractC0337b abstractC0337b, Executor executor, b.a aVar, s sVar) {
            this.f24684a = abstractC0337b;
            this.f24685b = executor;
            this.f24686c = (b.a) r9.l.o(aVar, "delegate");
            this.f24687d = (s) r9.l.o(sVar, "context");
        }

        @Override // qb.b.a
        public void a(z0 z0Var) {
            r9.l.o(z0Var, "headers");
            s sVarB = this.f24687d.b();
            try {
                m.this.f24681b.a(this.f24684a, this.f24685b, new a(this.f24686c, z0Var));
            } finally {
                this.f24687d.f(sVarB);
            }
        }
    }

    public m(qb.b bVar, qb.b bVar2) {
        this.f24680a = (qb.b) r9.l.o(bVar, "creds1");
        this.f24681b = (qb.b) r9.l.o(bVar2, "creds2");
    }

    @Override // qb.b
    public void a(b.AbstractC0337b abstractC0337b, Executor executor, b.a aVar) {
        this.f24680a.a(abstractC0337b, executor, new b(abstractC0337b, executor, aVar, s.e()));
    }
}
