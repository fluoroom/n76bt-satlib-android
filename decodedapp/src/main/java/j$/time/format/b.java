package j$.time.format;

import j$.time.y;
import j$.time.z;
import j$.util.Objects;
import j$.util.a0;
import j$.util.function.BiConsumer$CC;
import j$.util.function.BiFunction$CC;
import j$.util.function.Function$CC;
import j$.util.s1;
import j$.util.stream.Collectors;
import j$.util.x;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements IntFunction, Supplier, BiConsumer, BinaryOperator, Function, DoubleBinaryOperator, ObjDoubleConsumer, DoubleFunction {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f17526a;

    public /* synthetic */ b(int i10) {
        this.f17526a = i10;
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.f17526a) {
            case 11:
                break;
            case 16:
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                break;
            case 26:
                break;
        }
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        switch (this.f17526a) {
        }
        return BiFunction$CC.$default$andThen(this, function);
    }

    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function m1196andThen(Function function) {
        switch (this.f17526a) {
        }
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.DoubleFunction
    public Object apply(double d10) {
        return Double.valueOf(d10);
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        switch (this.f17526a) {
            case 15:
                Set set = Collectors.f17883a;
                return obj;
            default:
                return ((s1) obj).toString();
        }
    }

    @Override // java.util.function.DoubleBinaryOperator
    public double applyAsDouble(double d10, double d11) {
        return Math.min(d10, d11);
    }

    public /* synthetic */ Function compose(Function function) {
        switch (this.f17526a) {
        }
        return Function$CC.$default$compose(this, function);
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.f17526a) {
            case 14:
                List list = (List) obj;
                Set set = Collectors.f17883a;
                list.addAll((List) obj2);
                return list;
            default:
                s1 s1Var = (s1) obj;
                s1 s1Var2 = (s1) obj2;
                s1Var.getClass();
                Objects.requireNonNull(s1Var2);
                if (s1Var2.f17880d != null) {
                    s1Var2.b();
                    s1Var.a(s1Var2.f17880d[0]);
                }
                return s1Var;
        }
    }

    public Object a(j$.time.temporal.n nVar) {
        switch (this.f17526a) {
            case 0:
                y yVar = (y) nVar.l(j$.time.temporal.r.f17630a);
                if (yVar == null || (yVar instanceof z)) {
                    return null;
                }
                return yVar;
            case 1:
                return (y) nVar.l(j$.time.temporal.r.f17630a);
            case 2:
                return (j$.time.chrono.m) nVar.l(j$.time.temporal.r.f17631b);
            case 3:
                return (j$.time.temporal.s) nVar.l(j$.time.temporal.r.f17632c);
            case 4:
                j$.time.temporal.a aVar = j$.time.temporal.a.OFFSET_SECONDS;
                if (nVar.e(aVar)) {
                    return z.I(nVar.i(aVar));
                }
                return null;
            case 5:
                y yVar2 = (y) nVar.l(j$.time.temporal.r.f17630a);
                return yVar2 != null ? yVar2 : (y) nVar.l(j$.time.temporal.r.f17633d);
            case 6:
                j$.time.temporal.a aVar2 = j$.time.temporal.a.EPOCH_DAY;
                if (nVar.e(aVar2)) {
                    return j$.time.g.L(nVar.w(aVar2));
                }
                return null;
            default:
                j$.time.temporal.a aVar3 = j$.time.temporal.a.NANO_OF_DAY;
                if (nVar.e(aVar3)) {
                    return j$.time.k.G(nVar.w(aVar3));
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f17526a) {
            case 1:
                return "ZoneId";
            case 2:
                return "Chronology";
            case 3:
                return "Precision";
            case 4:
                return "ZoneOffset";
            case 5:
                return "Zone";
            case 6:
                return "LocalDate";
            case 7:
                return "LocalTime";
            default:
                return super.toString();
        }
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.f17526a) {
            case 9:
                return new x();
            case 10:
                return new ArrayList();
            case 12:
                return new j$.util.y();
            case 13:
                return new a0();
            case 19:
                return new LinkedHashSet();
            default:
                return new double[4];
        }
    }

    @Override // java.util.function.ObjDoubleConsumer
    public void accept(Object obj, double d10) {
        switch (this.f17526a) {
            case 25:
                double[] dArr = (double[]) obj;
                dArr[2] = dArr[2] + 1.0d;
                Collectors.a(dArr, d10);
                dArr[3] = dArr[3] + d10;
                break;
            default:
                ((x) obj).accept(d10);
                break;
        }
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.f17526a) {
            case 11:
                ((List) obj).add(obj2);
                break;
            case 16:
                ((s1) obj).a((CharSequence) obj2);
                break;
            case 20:
                ((LinkedHashSet) obj).add(obj2);
                break;
            case 21:
                ((LinkedHashSet) obj).addAll((LinkedHashSet) obj2);
                break;
            case 22:
                double[] dArr = (double[]) obj;
                double[] dArr2 = (double[]) obj2;
                Collectors.a(dArr, dArr2[0]);
                Collectors.a(dArr, dArr2[1]);
                dArr[2] = dArr[2] + dArr2[2];
                break;
            case 26:
                double[] dArr3 = (double[]) obj;
                double[] dArr4 = (double[]) obj2;
                Collectors.a(dArr3, dArr4[0]);
                Collectors.a(dArr3, dArr4[1]);
                dArr3[2] = dArr3[2] + dArr4[2];
                dArr3[3] = dArr3[3] + dArr4[3];
                break;
            default:
                ((x) obj).a((x) obj2);
                break;
        }
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i10) {
        return new Object[i10];
    }
}
