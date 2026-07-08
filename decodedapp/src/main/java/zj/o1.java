package zj;

import j$.util.Collection;
import j$.util.function.Consumer$CC;
import j$.util.stream.Stream;
import java.util.function.Consumer;
import yj.c;

/* JADX INFO: loaded from: classes3.dex */
public class o1 extends yj.c {

    /* JADX INFO: renamed from: c */
    private final d f33441c;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f33442a;

        static {
            int[] iArr = new int[d.values().length];
            f33442a = iArr;
            try {
                iArr[d.USE_P.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33442a[d.USE_PV.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33442a[d.USE_PVA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public o1(int i10, d dVar) {
        this(i10, 0.001d, dVar);
    }

    @Override // yj.c
    /* JADX INFO: renamed from: j */
    public k1 f(c.a aVar) {
        final yj.b bVarA = aVar.a();
        Stream stream = Collection.EL.stream(aVar.b());
        final si.a aVar2 = new si.a();
        int i10 = a.f33442a[this.f33441c.ordinal()];
        if (i10 == 1) {
            stream.forEach(new Consumer() { // from class: zj.l1
                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final void n(Object obj) {
                    k1 k1Var = (k1) obj;
                    aVar2.a(k1Var.getDate().X(bVarA), k1Var.t().s());
                }

                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        } else if (i10 == 2) {
            stream.forEach(new Consumer() { // from class: zj.m1
                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final void n(Object obj) {
                    k1 k1Var = (k1) obj;
                    aVar2.a(k1Var.getDate().X(bVarA), k1Var.t().s(), k1Var.s().s());
                }

                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        } else {
            if (i10 != 3) {
                throw new hj.e(null);
            }
            stream.forEach(new Consumer() { // from class: zj.n1
                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final void n(Object obj) {
                    k1 k1Var = (k1) obj;
                    aVar2.a(k1Var.getDate().X(bVarA), k1Var.t().s(), k1Var.s().s(), k1Var.o().s());
                }

                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        double[][] dArrC = aVar2.c(0.0d, 2);
        return new k1(bVarA, new xi.f(dArrC[0]), new xi.f(dArrC[1]), new xi.f(dArrC[2]));
    }

    public o1(int i10, double d10, d dVar) {
        super(i10, d10);
        this.f33441c = dVar;
    }
}
