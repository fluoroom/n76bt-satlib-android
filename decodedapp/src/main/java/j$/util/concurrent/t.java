package j$.util.concurrent;

import j$.util.Spliterator;
import j$.util.function.BiConsumer$CC;
import j$.util.function.BiFunction$CC;
import j$.util.function.Consumer$CC;
import j$.util.stream.g8;
import j$.util.stream.h7;
import j$.util.stream.o1;
import j$.util.stream.s1;
import j$.util.stream.t1;
import j$.util.stream.u1;
import j$.util.stream.v3;
import j$.util.stream.y6;
import j$.util.stream.z6;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class t implements BiConsumer, BiFunction, Consumer, Supplier, g8 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f17774a;

    /* JADX INFO: renamed from: b */
    public final Object f17775b;

    /* JADX INFO: renamed from: c */
    public final Object f17776c;

    public /* synthetic */ t(int i10, Object obj, Object obj2) {
        this.f17774a = i10;
        this.f17775b = obj;
        this.f17776c = obj2;
    }

    public /* synthetic */ t(BiFunction biFunction, Function function) {
        this.f17774a = 2;
        this.f17776c = biFunction;
        this.f17775b = function;
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.f17774a) {
        }
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction$CC.$default$andThen(this, function);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f17774a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        return ((Function) this.f17775b).apply(((BiFunction) this.f17776c).apply(obj, obj2));
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.f17774a) {
            case 0:
                java.util.concurrent.ConcurrentMap concurrentMap = (java.util.concurrent.ConcurrentMap) this.f17775b;
                BiFunction biFunction = (BiFunction) this.f17776c;
                while (!concurrentMap.replace(obj, obj2, biFunction.apply(obj, obj2)) && (obj2 = concurrentMap.get(obj)) != null) {
                }
                break;
            default:
                BiConsumer biConsumer = (BiConsumer) this.f17775b;
                BiConsumer biConsumer2 = (BiConsumer) this.f17776c;
                biConsumer.accept(obj, obj2);
                biConsumer2.accept(obj, obj2);
                break;
        }
    }

    @Override // java.util.function.Supplier
    public Object get() {
        return new o1((t1) this.f17775b, (Predicate) this.f17776c);
    }

    public t(z6 z6Var, t1 t1Var, Supplier supplier) {
        this.f17774a = 6;
        this.f17775b = t1Var;
        this.f17776c = supplier;
    }

    @Override // j$.util.stream.g8
    public int v() {
        return y6.f18272u | y6.f18269r;
    }

    @Override // j$.util.stream.g8
    public Object f(j$.util.stream.a aVar, Spliterator spliterator) {
        s1 s1Var = (s1) ((Supplier) this.f17776c).get();
        aVar.F0(spliterator, s1Var);
        return Boolean.valueOf(s1Var.f18159b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j$.util.stream.g8
    public Object i(v3 v3Var, Spliterator spliterator) {
        return (Boolean) new u1(this, (j$.util.stream.a) v3Var, spliterator).invoke();
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public void n(Object obj) {
        switch (this.f17774a) {
            case 3:
                Consumer consumer = (Consumer) this.f17775b;
                Consumer consumer2 = (Consumer) this.f17776c;
                consumer.n(obj);
                consumer2.n(obj);
                break;
            case 4:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f17775b;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f17776c;
                if (obj != null) {
                    concurrentHashMap.putIfAbsent(obj, Boolean.TRUE);
                } else {
                    atomicBoolean.set(true);
                }
                break;
            case 5:
            case 6:
            default:
                h7 h7Var = (h7) this.f17775b;
                Consumer consumer3 = (Consumer) this.f17776c;
                if (h7Var.f18007b.putIfAbsent(obj != null ? obj : h7.f18005d, Boolean.TRUE) == null) {
                    consumer3.n(obj);
                }
                break;
            case 7:
                ((BiConsumer) this.f17775b).accept(this.f17776c, obj);
                break;
        }
    }
}
