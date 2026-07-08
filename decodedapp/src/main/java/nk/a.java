package nk;

import io.grpc.stub.d;
import io.grpc.stub.h;
import io.grpc.stub.j;
import nk.b;
import qb.a1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile a1 f22971a;

    /* JADX INFO: renamed from: nk.a$a, reason: collision with other inner class name */
    class C0304a implements d.a {
        C0304a() {
        }

        @Override // io.grpc.stub.d.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d newStub(qb.d dVar, qb.c cVar) {
            return new d(dVar, cVar, null);
        }
    }

    private static abstract class b {
        b() {
        }
    }

    private static final class c extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f22972a;

        c(String str) {
            this.f22972a = str;
        }
    }

    public static final class d extends io.grpc.stub.a {
        /* synthetic */ d(qb.d dVar, qb.c cVar, C0304a c0304a) {
            this(dVar, cVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.grpc.stub.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d build(qb.d dVar, qb.c cVar) {
            return new d(dVar, cVar);
        }

        public void b(b.c cVar, j jVar) {
            h.c(getChannel().d(a.a(), getCallOptions()), cVar, jVar);
        }

        private d(qb.d dVar, qb.c cVar) {
            super(dVar, cVar);
        }
    }

    public static a1 a() {
        a1 a1VarA;
        a1 a1Var = f22971a;
        if (a1Var != null) {
            return a1Var;
        }
        synchronized (a.class) {
            try {
                a1VarA = f22971a;
                if (a1VarA == null) {
                    a1VarA = a1.g().g(a1.d.UNARY).b(a1.b("satellite.Satellite", "GetGP")).e(true).c(vb.a.a(b.c.o())).d(vb.a.a(b.d.r())).f(new c("GetGP")).a();
                    f22971a = a1VarA;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return a1VarA;
    }

    public static d b(qb.d dVar) {
        return (d) io.grpc.stub.a.newStub(new C0304a(), dVar);
    }
}
