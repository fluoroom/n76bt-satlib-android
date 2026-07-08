package io.grpc.internal;

import io.grpc.internal.j0;
import qb.g1;

/* JADX INFO: loaded from: classes3.dex */
public final class p2 extends s0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final qb.g1 f17018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o2 f17019d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final qb.z1 f17020e;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            p2.this.d();
        }
    }

    private class b extends g1.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private g1.d f17022a;

        b(g1.d dVar) {
            this.f17022a = dVar;
        }

        @Override // qb.g1.d
        public qb.u1 a(g1.e eVar) {
            qb.u1 u1VarA = this.f17022a.a(eVar);
            if (u1VarA.q()) {
                p2.this.f17019d.reset();
                return u1VarA;
            }
            p2.this.f17019d.a(p2.this.new a());
            return u1VarA;
        }
    }

    p2(qb.g1 g1Var, o2 o2Var, qb.z1 z1Var) {
        super(g1Var);
        this.f17018c = g1Var;
        this.f17019d = o2Var;
        this.f17020e = z1Var;
    }

    public static qb.g1 h(qb.g1 g1Var, g1.a aVar) {
        return new p2(g1Var, new l(new j0.a(), aVar.d(), aVar.f()), aVar.f());
    }

    @Override // io.grpc.internal.s0, qb.g1
    public /* bridge */ /* synthetic */ String c() {
        return super.c();
    }

    @Override // io.grpc.internal.s0, qb.g1
    public /* bridge */ /* synthetic */ void d() {
        super.d();
    }

    @Override // io.grpc.internal.s0, qb.g1
    public void e() {
        super.e();
        this.f17019d.reset();
    }

    @Override // io.grpc.internal.s0, qb.g1
    public void f(g1.d dVar) {
        super.f(new b(dVar));
    }

    @Override // io.grpc.internal.s0
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
