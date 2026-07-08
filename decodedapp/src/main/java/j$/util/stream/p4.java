package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class p4 implements q4, k5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f18119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f18120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LongBinaryOperator f18121c;

    @Override // j$.util.stream.l5
    public final /* synthetic */ void accept(double d10) {
        v3.C();
        throw null;
    }

    @Override // j$.util.stream.l5
    public final /* synthetic */ void accept(int i10) {
        v3.J();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        l((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.d(this, longConsumer);
    }

    @Override // j$.util.stream.l5
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.l5
    public final /* synthetic */ void end() {
    }

    @Override // j$.util.stream.k5
    public final /* synthetic */ void l(Long l10) {
        v3.H(this, l10);
    }

    public p4(LongBinaryOperator longBinaryOperator) {
        this.f18121c = longBinaryOperator;
    }

    @Override // j$.util.stream.q4
    public final void j(q4 q4Var) {
        p4 p4Var = (p4) q4Var;
        if (p4Var.f18119a) {
            return;
        }
        accept(p4Var.f18120b);
    }

    @Override // j$.util.stream.l5
    public final void c(long j10) {
        this.f18119a = true;
        this.f18120b = 0L;
    }

    @Override // j$.util.stream.l5
    public final void accept(long j10) {
        if (this.f18119a) {
            this.f18119a = false;
            this.f18120b = j10;
        } else {
            this.f18120b = this.f18121c.applyAsLong(this.f18120b, j10);
        }
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.f18119a ? j$.util.d0.f17791c : new j$.util.d0(this.f18120b);
    }
}
