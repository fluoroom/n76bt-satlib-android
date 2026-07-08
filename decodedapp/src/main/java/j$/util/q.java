package j$.util;

import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;
import j$.util.stream.c8;
import j$.util.stream.j7;
import j$.util.stream.l5;
import j$.util.stream.l7;
import j$.util.stream.n7;
import j$.util.stream.w6;
import java.util.Map;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.LongFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class q implements Consumer, Predicate, Supplier, DoubleFunction, Function, LongFunction, BooleanSupplier {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f17862a;

    /* JADX INFO: renamed from: b */
    public Object f17863b;

    public /* synthetic */ q(int i10) {
        this.f17862a = i10;
    }

    public /* synthetic */ q(int i10, Object obj) {
        this.f17862a = i10;
        this.f17863b = obj;
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate$CC.$default$and(this, predicate);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f17862a) {
            case 0:
                break;
            case 8:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public /* synthetic */ Function andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    public /* synthetic */ Predicate negate() {
        return Predicate$CC.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public boolean test(Object obj) {
        return !((Predicate) this.f17863b).test(obj);
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        Object objApply = ((Function) this.f17863b).apply(obj);
        if (objApply == null) {
            return null;
        }
        if (objApply instanceof Stream) {
            return Stream.Wrapper.convert((Stream) objApply);
        }
        if (objApply instanceof java.util.stream.Stream) {
            return w6.f((java.util.stream.Stream) objApply);
        }
        if (objApply instanceof IntStream) {
            return IntStream.Wrapper.convert((IntStream) objApply);
        }
        if (objApply instanceof java.util.stream.IntStream) {
            return IntStream.VivifiedWrapper.convert((java.util.stream.IntStream) objApply);
        }
        if (objApply instanceof j$.util.stream.d0) {
            return j$.util.stream.c0.f((j$.util.stream.d0) objApply);
        }
        if (objApply instanceof DoubleStream) {
            return j$.util.stream.b0.f((DoubleStream) objApply);
        }
        if (objApply instanceof j$.util.stream.m1) {
            return j$.util.stream.l1.f((j$.util.stream.m1) objApply);
        }
        if (objApply instanceof LongStream) {
            return j$.util.stream.k1.f((LongStream) objApply);
        }
        g.a(objApply.getClass(), "java.util.stream.*Stream");
        throw null;
    }

    @Override // java.util.function.DoubleFunction
    public Object apply(double d10) {
        Object objApply = ((DoubleFunction) this.f17863b).apply(d10);
        if (objApply == null) {
            return null;
        }
        if (objApply instanceof j$.util.stream.d0) {
            return j$.util.stream.c0.f((j$.util.stream.d0) objApply);
        }
        if (objApply instanceof DoubleStream) {
            return j$.util.stream.b0.f((DoubleStream) objApply);
        }
        g.a(objApply.getClass(), "java.util.stream.DoubleStream");
        throw null;
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j10) {
        Object objApply = ((LongFunction) this.f17863b).apply(j10);
        if (objApply == null) {
            return null;
        }
        if (objApply instanceof j$.util.stream.m1) {
            return j$.util.stream.l1.f((j$.util.stream.m1) objApply);
        }
        if (objApply instanceof LongStream) {
            return j$.util.stream.k1.f((LongStream) objApply);
        }
        g.a(objApply.getClass(), "java.util.stream.LongStream");
        throw null;
    }

    @Override // java.util.function.BooleanSupplier
    public boolean getAsBoolean() {
        switch (this.f17862a) {
            case 10:
                j7 j7Var = (j7) this.f17863b;
                return j7Var.f17907d.tryAdvance(j7Var.f17908e);
            case 11:
                l7 l7Var = (l7) this.f17863b;
                return l7Var.f17907d.tryAdvance(l7Var.f17908e);
            case 12:
                n7 n7Var = (n7) this.f17863b;
                return n7Var.f17907d.tryAdvance(n7Var.f17908e);
            default:
                c8 c8Var = (c8) this.f17863b;
                return c8Var.f17907d.tryAdvance(c8Var.f17908e);
        }
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.f17862a) {
            case 2:
                return ((j$.util.stream.a) this.f17863b).R0(0);
            case 3:
                return (Spliterator) this.f17863b;
            default:
                CharSequence charSequence = (CharSequence) this.f17863b;
                java.util.Set set = Collectors.f17883a;
                return new s1(charSequence);
        }
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        switch (this.f17862a) {
            case 0:
                ((Consumer) this.f17863b).accept(new r((Map.Entry) obj));
                break;
            case 8:
                ((l5) this.f17863b).accept(obj);
                break;
            default:
                ((java.util.List) this.f17863b).add(obj);
                break;
        }
    }
}
