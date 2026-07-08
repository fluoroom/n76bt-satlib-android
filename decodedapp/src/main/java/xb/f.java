package xb;

import qb.q0;
import qb.r;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q0.e f31860a;

    static final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final q0.j f31861a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final q0.l f31862b;

        /* JADX INFO: renamed from: xb.f$a$a, reason: collision with other inner class name */
        class C0428a implements q0.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ q0.l f31863a;

            C0428a(q0.l lVar) {
                this.f31863a = lVar;
            }

            @Override // qb.q0.l
            public void a(r rVar) {
                this.f31863a.a(rVar);
                a.this.f31862b.a(rVar);
            }
        }

        a(q0.j jVar, q0.l lVar) {
            this.f31861a = (q0.j) r9.l.o(jVar, "delegate");
            this.f31862b = (q0.l) r9.l.o(lVar, "healthListener");
        }

        @Override // xb.d, qb.q0.j
        public qb.a c() {
            return super.c().d().d(q0.f24712d, Boolean.TRUE).a();
        }

        @Override // xb.d, qb.q0.j
        public void h(q0.l lVar) {
            this.f31861a.h(new C0428a(lVar));
        }

        @Override // xb.d
        public q0.j j() {
            return this.f31861a;
        }
    }

    public f(q0.e eVar) {
        this.f31860a = (q0.e) r9.l.o(eVar, "helper");
    }

    @Override // xb.c, qb.q0.e
    public q0.j a(q0.b bVar) {
        q0.l lVar = (q0.l) bVar.c(q0.f24710b);
        q0.j jVarA = super.a(bVar);
        return (lVar == null || jVarA.c().b(q0.f24712d) != null) ? jVarA : new a(jVarA, lVar);
    }

    @Override // xb.c
    protected q0.e g() {
        return this.f31860a;
    }
}
