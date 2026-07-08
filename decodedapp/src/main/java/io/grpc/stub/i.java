package io.grpc.stub;

import qb.a1;
import qb.o1;
import qb.u1;
import r9.l;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i {

    public interface a extends e {
    }

    public interface b extends e {
    }

    static class c implements j {
        c() {
        }

        @Override // io.grpc.stub.j
        public void onCompleted() {
        }

        @Override // io.grpc.stub.j
        public void onError(Throwable th2) {
        }

        @Override // io.grpc.stub.j
        public void onNext(Object obj) {
        }
    }

    public interface d extends h {
    }

    private interface e {
    }

    private static final class f implements o1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f17311a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f17312b;

        f(e eVar, boolean z10) {
            this.f17311a = eVar;
            this.f17312b = z10;
        }
    }

    public interface g extends h {
    }

    private interface h {
    }

    /* JADX INFO: renamed from: io.grpc.stub.i$i, reason: collision with other inner class name */
    private static final class C0232i implements o1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final h f17313a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f17314b;

        C0232i(h hVar, boolean z10) {
            this.f17313a = hVar;
            this.f17314b = z10;
        }
    }

    public static o1 a(a aVar) {
        return new f(aVar, true);
    }

    public static o1 b(g gVar) {
        return new C0232i(gVar, false);
    }

    public static j c(a1 a1Var, j jVar) {
        d(a1Var, jVar);
        return new c();
    }

    public static void d(a1 a1Var, j jVar) {
        l.o(a1Var, "methodDescriptor");
        l.o(jVar, "responseObserver");
        jVar.onError(u1.f24782r.s(String.format("Method %s is unimplemented", a1Var.c())).e());
    }
}
