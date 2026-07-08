package kj;

import j$.util.function.BiFunction$CC;
import j$.util.function.Function$CC;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r0 f20214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f20215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b2 f20216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f20217d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f20218e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final h1 f20219f;

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final r0 f20220a = new a(j1.GCRF.a(), true);

        class a extends r0 {
            a(String str, boolean z10) {
                super(str, z10);
            }
        }
    }

    public static /* synthetic */ y1 e(yj.b bVar, y1 y1Var, y1 y1Var2) {
        return new y1(bVar, y1Var, y1Var2);
    }

    private static r0 o(r0 r0Var, r0 r0Var2) {
        int i10 = r0Var.f20215b;
        int i11 = r0Var2.f20215b;
        r0 r0VarP = i10 > i11 ? r0Var.p(i10 - i11) : r0Var;
        int i12 = r0Var.f20215b;
        int i13 = r0Var2.f20215b;
        if (i12 <= i13) {
            r0Var2 = r0Var2.p(i13 - i12);
        }
        while (r0VarP != r0Var2) {
            r0VarP = r0VarP.f20214a;
            r0Var2 = r0Var2.f20214a;
        }
        return r0VarP;
    }

    public static r0 t() {
        return b.f20220a;
    }

    public r0 p(int i10) {
        if (i10 > this.f20215b) {
            throw new hj.c(hj.f.FRAME_NO_NTH_ANCESTOR, this.f20217d, Integer.valueOf(this.f20215b), Integer.valueOf(i10));
        }
        r0 r0Var = this;
        for (int i11 = 0; i11 < i10; i11++) {
            r0Var = r0Var.f20214a;
        }
        return r0Var;
    }

    public b1 q(r0 r0Var, final yj.b bVar) {
        this.f20219f.a(r0Var);
        return (b1) w(r0Var, a1.e(), new Function() { // from class: kj.l0
            public /* synthetic */ Function andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((r0) obj).v().a(bVar);
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new BiFunction() { // from class: kj.m0
            public /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return a1.b(bVar, (b1) obj, (b1) obj2);
            }
        }, new Function() { // from class: kj.n0
            public /* synthetic */ Function andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((b1) obj).d();
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    public String r() {
        return this.f20217d;
    }

    public r0 s() {
        return this.f20214a;
    }

    public String toString() {
        return this.f20217d;
    }

    public t1 u(r0 r0Var, final yj.b bVar) {
        this.f20219f.a(r0Var);
        return (t1) w(r0Var, s1.e(), new Function() { // from class: kj.i0
            public /* synthetic */ Function andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((r0) obj).v().c(bVar);
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new BiFunction() { // from class: kj.j0
            public /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return s1.b(bVar, (t1) obj, (t1) obj2);
            }
        }, new Function() { // from class: kj.k0
            public /* synthetic */ Function andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((t1) obj).d();
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    public b2 v() {
        return this.f20216c;
    }

    Object w(r0 r0Var, Object obj, Function function, BiFunction biFunction, Function function2) {
        if (this == r0Var) {
            return obj;
        }
        r0 r0VarO = o(this, r0Var);
        Object objApply = obj;
        for (r0 r0Var2 = this; r0Var2 != r0VarO; r0Var2 = r0Var2.f20214a) {
            objApply = biFunction.apply(function.apply(r0Var2), objApply);
        }
        while (r0Var != r0VarO) {
            obj = biFunction.apply(function.apply(r0Var), obj);
            r0Var = r0Var.f20214a;
        }
        return biFunction.apply(function2.apply(objApply), obj);
    }

    public y1 x(r0 r0Var, final yj.b bVar) {
        this.f20219f.a(r0Var);
        return (y1) w(r0Var, y1.f20277d, new Function() { // from class: kj.o0
            public /* synthetic */ Function andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((r0) obj).v().b(bVar);
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new BiFunction() { // from class: kj.p0
            public /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return r0.e(bVar, (y1) obj, (y1) obj2);
            }
        }, new Function() { // from class: kj.q0
            public /* synthetic */ Function andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((y1) obj).d();
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    public boolean y() {
        return this.f20218e;
    }

    private r0(String str, boolean z10) {
        this.f20214a = null;
        this.f20215b = 0;
        this.f20216c = new h0(y1.f20277d);
        this.f20217d = str;
        this.f20218e = z10;
        this.f20219f = new h1(this);
    }

    public r0(r0 r0Var, y1 y1Var, String str, boolean z10) {
        this(r0Var, new h0(y1Var), str, z10);
    }

    public r0(r0 r0Var, b2 b2Var, String str, boolean z10) {
        if (r0Var != null) {
            this.f20214a = r0Var;
            this.f20215b = r0Var.f20215b + 1;
            this.f20216c = b2Var;
            this.f20217d = str;
            this.f20218e = z10;
            this.f20219f = new h1(this);
            return;
        }
        throw new hj.c(hj.f.NULL_PARENT_FOR_FRAME, str);
    }
}
