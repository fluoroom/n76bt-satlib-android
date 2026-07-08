package j$.util.stream;

import j$.util.function.BiConsumer$CC;
import j$.util.function.BiFunction$CC;
import j$.util.function.Consumer$CC;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.LongBinaryOperator;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b1 implements LongFunction, Supplier, ObjLongConsumer, BiConsumer, LongBinaryOperator, Consumer, IntFunction, BinaryOperator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17923a;

    public /* synthetic */ b1(int i10) {
        this.f17923a = i10;
    }

    private final void accept$j$$util$stream$Node$$ExternalSyntheticLambda0(Object obj) {
    }

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfRef$$ExternalSyntheticLambda0(Object obj) {
    }

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfRef$$ExternalSyntheticLambda1(Object obj) {
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public void n(Object obj) {
        int i10 = this.f17923a;
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        switch (this.f17923a) {
        }
        return BiFunction$CC.$default$andThen(this, function);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f17923a) {
            case 6:
                break;
            case 19:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j10) {
        switch (this.f17923a) {
            case 0:
                return Long.valueOf(j10);
            case 8:
                return v3.h0(j10);
            case 10:
                return v3.s0(j10);
            default:
                return v3.t0(j10);
        }
    }

    @Override // java.util.function.LongBinaryOperator
    public long applyAsLong(long j10, long j11) {
        switch (this.f17923a) {
            case 4:
                return Math.max(j10, j11);
            default:
                return j10 + j11;
        }
    }

    @Override // java.util.function.Supplier
    public Object get() {
        return new long[2];
    }

    @Override // java.util.function.ObjLongConsumer
    public void accept(Object obj, long j10) {
        long[] jArr = (long[]) obj;
        jArr[0] = jArr[0] + 1;
        jArr[1] = jArr[1] + j10;
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        long[] jArr = (long[]) obj;
        long[] jArr2 = (long[]) obj2;
        jArr[0] = jArr[0] + jArr2[0];
        jArr[1] = jArr[1] + jArr2[1];
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i10) {
        switch (this.f17923a) {
            case 7:
                return new Object[i10];
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 19:
            case 20:
            default:
                return new Double[i10];
            case 15:
                return new Object[i10];
            case 16:
                return new Integer[i10];
            case 17:
                return new Long[i10];
            case 18:
                return new Double[i10];
            case 21:
                return new Integer[i10];
            case 22:
                return new Integer[i10];
            case 23:
                return new Long[i10];
            case 24:
                return new Long[i10];
            case 25:
                return new Double[i10];
        }
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.f17923a) {
            case 9:
                return new n2((a2) obj, (a2) obj2);
            case 10:
            case 12:
            default:
                return new r2((g2) obj, (g2) obj2);
            case 11:
                return new o2((c2) obj, (c2) obj2);
            case 13:
                return new p2((e2) obj, (e2) obj2);
        }
    }
}
