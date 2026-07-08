package kj;

import j$.util.function.BiFunction$CC;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/* JADX INFO: loaded from: classes3.dex */
public class r1 implements b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y0 f20221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient zj.j f20222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient Map f20223c;

    public r1(b2 b2Var, zj.d dVar, zj.c cVar, int i10, double d10, int i11, double d11, double d12) {
        this(new y0(b2Var, dVar, cVar, i10, d10, i11, d11, d12), i11, d11, d12);
    }

    public static /* synthetic */ y1 d(yj.b bVar, y1 y1Var, y1 y1Var2) {
        return aj.d.b(bVar.X(y1Var.getDate())) < aj.d.b(bVar.X(y1Var2.getDate())) ? y1Var : y1Var2;
    }

    public static /* synthetic */ y1 e(yj.b bVar, y1 y1Var, y1 y1Var2) {
        return aj.d.b(bVar.X(y1Var.getDate())) < aj.d.b(bVar.X(y1Var2.getDate())) ? y1Var : y1Var2;
    }

    @Override // kj.b2
    public /* synthetic */ b1 a(yj.b bVar) {
        return a2.a(this, bVar);
    }

    @Override // kj.b2
    public y1 b(final yj.b bVar) {
        y1 y1Var = (y1) this.f20222b.b(bVar).reduce(new BinaryOperator() { // from class: kj.p1
            public /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return r1.d(bVar, (y1) obj, (y1) obj2);
            }
        }).get();
        return y1Var.a(bVar.X(y1Var.getDate()));
    }

    @Override // kj.b2
    public t1 c(final yj.b bVar) {
        y1 y1Var = (y1) this.f20222b.b(bVar).reduce(new BinaryOperator() { // from class: kj.q1
            public /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return r1.e(bVar, (y1) obj, (y1) obj2);
            }
        }).get();
        return y1Var.o(bVar.X(y1Var.getDate()));
    }

    public int f() {
        return this.f20221a.d();
    }

    public b2 g() {
        return this.f20221a.e();
    }

    public double h() {
        return this.f20221a.f();
    }

    private r1(y0 y0Var, int i10, double d10, double d11) {
        this.f20221a = y0Var;
        this.f20222b = new zj.j(2, i10, d10, d11, new z1(2, y0Var, y0Var.f()));
        this.f20223c = new HashMap();
    }
}
