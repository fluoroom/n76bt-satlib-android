package dk;

import dk.e;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;

/* JADX INFO: loaded from: classes3.dex */
final class h extends e.a {

    private static final class a implements e {

        /* JADX INFO: renamed from: a */
        private final Type f11144a;

        /* JADX INFO: renamed from: dk.h$a$a */
        private class C0151a implements f {

            /* JADX INFO: renamed from: a */
            private final CompletableFuture f11145a;

            public C0151a(CompletableFuture completableFuture) {
                this.f11145a = completableFuture;
            }

            @Override // dk.f
            public void a(d dVar, Throwable th2) {
                this.f11145a.completeExceptionally(th2);
            }

            @Override // dk.f
            public void b(d dVar, z zVar) {
                if (zVar.e()) {
                    this.f11145a.complete(zVar.a());
                } else {
                    this.f11145a.completeExceptionally(new o(zVar));
                }
            }
        }

        a(Type type) {
            this.f11144a = type;
        }

        @Override // dk.e
        public Type a() {
            return this.f11144a;
        }

        @Override // dk.e
        /* JADX INFO: renamed from: c */
        public CompletableFuture b(d dVar) {
            b bVar = new b(dVar);
            dVar.s(new C0151a(bVar));
            return bVar;
        }
    }

    private static final class b extends CompletableFuture {

        /* JADX INFO: renamed from: a */
        private final d f11147a;

        b(d dVar) {
            this.f11147a = dVar;
        }

        @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
        public boolean cancel(boolean z10) {
            if (z10) {
                this.f11147a.cancel();
            }
            return super.cancel(z10);
        }
    }

    private static final class c implements e {

        /* JADX INFO: renamed from: a */
        private final Type f11148a;

        private class a implements f {

            /* JADX INFO: renamed from: a */
            private final CompletableFuture f11149a;

            public a(CompletableFuture completableFuture) {
                this.f11149a = completableFuture;
            }

            @Override // dk.f
            public void a(d dVar, Throwable th2) {
                this.f11149a.completeExceptionally(th2);
            }

            @Override // dk.f
            public void b(d dVar, z zVar) {
                this.f11149a.complete(zVar);
            }
        }

        c(Type type) {
            this.f11148a = type;
        }

        @Override // dk.e
        public Type a() {
            return this.f11148a;
        }

        @Override // dk.e
        /* JADX INFO: renamed from: c */
        public CompletableFuture b(d dVar) {
            b bVar = new b(dVar);
            dVar.s(new a(bVar));
            return bVar;
        }
    }

    h() {
    }

    @Override // dk.e.a
    public e a(Type type, Annotation[] annotationArr, a0 a0Var) {
        if (e.a.c(type) != g.a()) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        }
        Type typeB = e.a.b(0, (ParameterizedType) type);
        if (e.a.c(typeB) != z.class) {
            return new a(typeB);
        }
        if (typeB instanceof ParameterizedType) {
            return new c(e.a.b(0, (ParameterizedType) typeB));
        }
        throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
    }
}
