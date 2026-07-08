package dk;

import dk.e;
import dk.j;
import eh.f0;
import j$.util.Objects;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
final class j extends e.a {

    /* JADX INFO: renamed from: a */
    private final Executor f11151a;

    class a implements e {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Type f11152a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Executor f11153b;

        a(Type type, Executor executor) {
            this.f11152a = type;
            this.f11153b = executor;
        }

        @Override // dk.e
        public Type a() {
            return this.f11152a;
        }

        @Override // dk.e
        /* JADX INFO: renamed from: c */
        public d b(d dVar) {
            Executor executor = this.f11153b;
            return executor == null ? dVar : new b(executor, dVar);
        }
    }

    static final class b implements d {

        /* JADX INFO: renamed from: a */
        final Executor f11155a;

        /* JADX INFO: renamed from: b */
        final d f11156b;

        class a implements f {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ f f11157a;

            a(f fVar) {
                this.f11157a = fVar;
            }

            public static /* synthetic */ void d(a aVar, f fVar, z zVar) {
                if (b.this.f11156b.c()) {
                    fVar.a(b.this, new IOException("Canceled"));
                } else {
                    fVar.b(b.this, zVar);
                }
            }

            @Override // dk.f
            public void a(d dVar, final Throwable th2) {
                Executor executor = b.this.f11155a;
                final f fVar = this.f11157a;
                executor.execute(new Runnable() { // from class: dk.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        fVar.a(j.b.this, th2);
                    }
                });
            }

            @Override // dk.f
            public void b(d dVar, final z zVar) {
                Executor executor = b.this.f11155a;
                final f fVar = this.f11157a;
                executor.execute(new Runnable() { // from class: dk.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        j.b.a.d(this.f11159a, fVar, zVar);
                    }
                });
            }
        }

        b(Executor executor, d dVar) {
            this.f11155a = executor;
            this.f11156b = dVar;
        }

        @Override // dk.d
        public boolean c() {
            return this.f11156b.c();
        }

        @Override // dk.d
        public void cancel() {
            this.f11156b.cancel();
        }

        @Override // dk.d
        public f0 e() {
            return this.f11156b.e();
        }

        @Override // dk.d
        public z l() {
            return this.f11156b.l();
        }

        @Override // dk.d
        public void s(f fVar) {
            Objects.requireNonNull(fVar, "callback == null");
            this.f11156b.s(new a(fVar));
        }

        @Override // dk.d
        /* JADX INFO: renamed from: clone */
        public d m1194clone() {
            return new b(this.f11155a, this.f11156b.m1194clone());
        }
    }

    j(Executor executor) {
        this.f11151a = executor;
    }

    @Override // dk.e.a
    public e a(Type type, Annotation[] annotationArr, a0 a0Var) {
        if (e.a.c(type) != d.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new a(e0.g(0, (ParameterizedType) type), e0.l(annotationArr, c0.class) ? null : this.f11151a);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
