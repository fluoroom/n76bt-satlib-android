package kj;

import j$.util.function.BiFunction$CC;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import kj.z;

/* JADX INFO: loaded from: classes3.dex */
public class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f20281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f20282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient zj.w0 f20283c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final zj.s f20284d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient yj.h0 f20285e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient yj.c0 f20286f;

    /* JADX INFO: Access modifiers changed from: private */
    static class a implements yj.h0, zj.j1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final yj.h0 f20287a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final double f20288b = 3600.0d;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final zj.i1 f20289c = new zj.j(8, zj.x0.a(), 2592000.0d, 86400.0d, this);

        a(yj.h0 h0Var) {
            this.f20287a = h0Var;
        }

        @Override // yj.h0
        public double[] a(final yj.b bVar) {
            try {
                final si.a aVar = new si.a();
                this.f20289c.b(bVar).forEach(new Consumer() { // from class: kj.y
                    @Override // java.util.function.Consumer
                    /* JADX INFO: renamed from: accept */
                    public final void n(Object obj) {
                        z.c cVar = (z.c) obj;
                        aVar.a(cVar.f20294a.X(bVar), cVar.f20295b);
                    }

                    public /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                return aVar.d(0.0d);
            } catch (hj.g e10) {
                throw new hj.e(e10);
            }
        }

        @Override // zj.j1
        public List b(yj.b bVar, yj.b bVar2) {
            ArrayList arrayList = new ArrayList();
            if (bVar == null) {
                int i10 = (-this.f20289c.a()) / 2;
                while (arrayList.size() < this.f20289c.a()) {
                    yj.b bVarA = bVar2.a(((double) i10) * this.f20288b);
                    arrayList.add(new c(bVarA, this.f20287a.a(bVarA)));
                    i10++;
                }
            } else if (bVar2.compareTo(bVar) > 0) {
                do {
                    bVar = bVar.a(this.f20288b);
                    arrayList.add(new c(bVar, this.f20287a.a(bVar)));
                } while (bVar.compareTo(bVar2) <= 0);
            } else {
                do {
                    bVar = bVar.a(-this.f20288b);
                    arrayList.add(0, new c(bVar, this.f20287a.a(bVar)));
                } while (bVar.compareTo(bVar2) >= 0);
            }
            return arrayList;
        }
    }

    private static class b implements Consumer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private double f20290a = Double.NaN;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f20291b = true;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final si.a f20292c = new si.a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private yj.b f20293d;

        b(yj.b bVar) {
            this.f20293d = bVar;
        }

        @Override // java.util.function.Consumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void n(i iVar) {
            double dO;
            if (Double.isNaN(this.f20290a)) {
                this.f20290a = iVar.o();
            }
            if (iVar.o() - this.f20290a > 0.9d) {
                dO = iVar.o() - 1.0d;
                if (iVar.getDate().a(-1.0d).compareTo(this.f20293d) <= 0) {
                    this.f20291b = false;
                }
            } else {
                dO = iVar.o();
            }
            this.f20292c.a(iVar.getDate().X(this.f20293d), new double[]{dO});
        }

        public /* synthetic */ Consumer andThen(Consumer consumer) {
            return Consumer$CC.$default$andThen(this, consumer);
        }

        public double b() {
            double d10 = this.f20292c.d(0.0d)[0];
            return this.f20291b ? d10 : d10 + 1.0d;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class c implements yj.g0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final yj.b f20294a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final double[] f20295b;

        c(yj.b bVar, double[] dArr) {
            this.f20294a = bVar;
            this.f20295b = dArr;
        }

        @Override // yj.g0
        public /* synthetic */ double e(yj.g0 g0Var) {
            return yj.f0.a(this, g0Var);
        }

        @Override // yj.g0
        public yj.b getDate() {
            return this.f20294a;
        }
    }

    public z(zj.s sVar, int i10, Collection collection, boolean z10, yj.c0 c0Var) {
        this(sVar, i10, collection, z10 ? null : new a(sVar.e(c0Var)), c0Var);
    }

    public static /* synthetic */ Double c(zj.w0 w0Var, final i iVar, final Function function) {
        final si.a aVar = new si.a();
        w0Var.b(iVar.getDate()).forEach(new Consumer() { // from class: kj.o
            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void n(Object obj) {
                i iVar2 = (i) obj;
                aVar.a(iVar2.getDate().X(iVar.getDate()), new double[]{((Double) function.apply(iVar2)).doubleValue()});
            }

            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return Double.valueOf(aVar.c(0.0d, 1)[1][0]);
    }

    private i g(i iVar, final zj.w0 w0Var) {
        BiFunction biFunction = new BiFunction() { // from class: kj.j
            public /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return z.c(w0Var, (i) obj, (Function) obj2);
            }
        };
        if (Double.isNaN(iVar.k() + iVar.t() + iVar.w())) {
            return new i(iVar.l(), iVar.o(), Double.isNaN(iVar.k()) ? -((Double) biFunction.apply(iVar, new Function() { // from class: kj.p
                public /* synthetic */ Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Double.valueOf(((i) obj).o());
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            })).doubleValue() : iVar.k(), iVar.p(), iVar.v(), Double.isNaN(iVar.t()) ? ((Double) biFunction.apply(iVar, new q())).doubleValue() : iVar.t(), Double.isNaN(iVar.w()) ? ((Double) biFunction.apply(iVar, new r())).doubleValue() : iVar.w(), iVar.b(), iVar.a(), iVar.c(), iVar.h(), iVar.j(), iVar.getDate(), iVar.i());
        }
        return iVar;
    }

    private double s(final yj.b bVar, final Function function) {
        try {
            final si.a aVar = new si.a();
            l(bVar, this.f20281a + 1).forEach(new Consumer() { // from class: kj.l
                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final void n(Object obj) {
                    i iVar = (i) obj;
                    aVar.a(iVar.getDate().X(bVar), new double[]{((Double) function.apply(iVar)).doubleValue()});
                }

                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            return aVar.d(0.0d)[0];
        } catch (hj.g e10) {
            throw new hj.e(e10);
        }
    }

    private double[] t(final yj.b bVar, final Function function, final Function function2) {
        try {
            final si.a aVar = new si.a();
            l(bVar, this.f20281a + 1).forEach(new Consumer() { // from class: kj.m
                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final void n(Object obj) {
                    i iVar = (i) obj;
                    aVar.a(iVar.getDate().X(bVar), new double[]{((Double) function.apply(iVar)).doubleValue(), ((Double) function2.apply(iVar)).doubleValue()});
                }

                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            return aVar.d(0.0d);
        } catch (hj.g e10) {
            throw new hj.e(e10);
        }
    }

    private double[] u(final yj.b bVar, final Function function, final Function function2, final Function function3, final Function function4) {
        try {
            final si.a aVar = new si.a();
            l(bVar, (this.f20281a + 1) / 2).forEach(new Consumer() { // from class: kj.n
                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final void n(Object obj) {
                    i iVar = (i) obj;
                    aVar.a(iVar.getDate().X(bVar), new double[]{((Double) function.apply(iVar)).doubleValue(), ((Double) function2.apply(iVar)).doubleValue()}, new double[]{((Double) function3.apply(iVar)).doubleValue(), ((Double) function4.apply(iVar)).doubleValue()});
                }

                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            return aVar.d(0.0d);
        } catch (hj.g e10) {
            throw new hj.e(e10);
        }
    }

    private boolean w(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            if (Double.isNaN(iVar.k() + iVar.t() + iVar.w())) {
                return true;
            }
        }
        return false;
    }

    public void f(double d10) {
        yj.g0 g0Var = null;
        for (yj.g0 g0Var2 : this.f20283c.e()) {
            if (g0Var != null && g0Var2.getDate().X(g0Var.getDate()) > d10) {
                throw new hj.a(hj.f.MISSING_EARTH_ORIENTATION_PARAMETERS_BETWEEN_DATES_GAP, g0Var.getDate(), g0Var2.getDate(), Double.valueOf(g0Var2.getDate().X(g0Var.getDate())));
            }
            g0Var = g0Var2;
        }
    }

    public zj.s h() {
        return this.f20284d;
    }

    public yj.b i() {
        return ((i) this.f20283c.g()).getDate();
    }

    public double[] j(yj.b bVar) {
        return !r(bVar) ? new double[2] : t(bVar, new Function() { // from class: kj.v
            public /* synthetic */ Function andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(((i) obj).b());
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: kj.w
            public /* synthetic */ Function andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(((i) obj).a());
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    public double k(yj.b bVar) {
        if (r(bVar)) {
            double dS = s(bVar, new Function() { // from class: kj.u
                public /* synthetic */ Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Double.valueOf(((i) obj).k());
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            yj.h0 h0Var = this.f20285e;
            return h0Var != null ? dS + h0Var.a(bVar)[3] : dS;
        }
        yj.h0 h0Var2 = this.f20285e;
        if (h0Var2 == null) {
            return 0.0d;
        }
        return h0Var2.a(bVar)[3];
    }

    protected Stream l(yj.b bVar, int i10) {
        return this.f20283c.c(bVar, i10);
    }

    public double[] m(yj.b bVar) {
        return !r(bVar) ? new double[2] : t(bVar, new Function() { // from class: kj.x
            public /* synthetic */ Function andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(((i) obj).c());
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: kj.k
            public /* synthetic */ Function andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(((i) obj).h());
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    public i1 n(yj.b bVar) {
        if (!r(bVar)) {
            yj.h0 h0Var = this.f20285e;
            if (h0Var == null) {
                return i1.f20132c;
            }
            double[] dArrA = h0Var.a(bVar);
            return new i1(dArrA[0], dArrA[1]);
        }
        double[] dArrU = u(bVar, new q(), new r(), new Function() { // from class: kj.s
            public /* synthetic */ Function andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(((i) obj).t());
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: kj.t
            public /* synthetic */ Function andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(((i) obj).w());
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        yj.h0 h0Var2 = this.f20285e;
        if (h0Var2 != null) {
            double[] dArrA2 = h0Var2.a(bVar);
            dArrU[0] = dArrU[0] + dArrA2[0];
            dArrU[1] = dArrU[1] + dArrA2[1];
        }
        return new i1(dArrU[0], dArrU[1]);
    }

    public yj.b o() {
        return ((i) this.f20283c.f()).getDate();
    }

    public yj.c0 p() {
        return this.f20286f;
    }

    public double q(yj.b bVar) {
        if (!r(bVar)) {
            yj.h0 h0Var = this.f20285e;
            if (h0Var == null) {
                return 0.0d;
            }
            return h0Var.a(bVar)[2];
        }
        try {
            b bVar2 = new b(bVar);
            l(bVar, this.f20281a + 1).forEach(bVar2);
            double dB = bVar2.b();
            yj.h0 h0Var2 = this.f20285e;
            return h0Var2 != null ? dB + h0Var2.a(bVar)[2] : dB;
        } catch (hj.g e10) {
            throw new hj.e(e10);
        }
    }

    protected boolean r(yj.b bVar) {
        return this.f20282b && o().compareTo(bVar) <= 0 && bVar.compareTo(i()) <= 0;
    }

    public boolean v() {
        return this.f20285e == null;
    }

    private z(zj.s sVar, int i10, Collection collection, yj.h0 h0Var, yj.c0 c0Var) {
        int i11 = i10 + 1;
        if (i10 == ((i11 / 4) * 4) - 1) {
            this.f20284d = sVar;
            this.f20281a = i10;
            this.f20285e = h0Var;
            this.f20286f = c0Var;
            if (collection.size() >= 1) {
                if (w(collection)) {
                    zj.w0 w0Var = new zj.w0(aj.d.E(i11, collection.size()), collection);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = w0Var.e().iterator();
                    while (it.hasNext()) {
                        arrayList.add(g((i) it.next(), w0Var));
                    }
                    this.f20283c = new zj.w0(aj.d.E(i11, arrayList.size()), arrayList);
                } else {
                    this.f20283c = new zj.w0(aj.d.E(i11, collection.size()), collection);
                }
                this.f20282b = true;
                return;
            }
            this.f20283c = zj.w0.d();
            this.f20282b = false;
            return;
        }
        throw new hj.a(hj.f.WRONG_EOP_INTERPOLATION_DEGREE, Integer.valueOf(i10));
    }
}
