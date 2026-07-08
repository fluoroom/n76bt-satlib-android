package j$.util.stream;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a7 implements Spliterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f17904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f17905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Supplier f17906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Spliterator f17907d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public l5 f17908e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public BooleanSupplier f17909f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f17910g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c f17911h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f17912i;

    public abstract void d();

    public abstract a7 e(Spliterator spliterator);

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return j$.util.c.e(this, i10);
    }

    public a7(a aVar, Supplier supplier, boolean z10) {
        this.f17905b = aVar;
        this.f17906c = supplier;
        this.f17907d = null;
        this.f17904a = z10;
    }

    public a7(a aVar, Spliterator spliterator, boolean z10) {
        this.f17905b = aVar;
        this.f17906c = null;
        this.f17907d = spliterator;
        this.f17904a = z10;
    }

    public final void c() {
        if (this.f17907d == null) {
            this.f17907d = (Spliterator) this.f17906c.get();
            this.f17906c = null;
        }
    }

    public final boolean a() {
        c cVar = this.f17911h;
        if (cVar == null) {
            if (this.f17912i) {
                return false;
            }
            c();
            d();
            this.f17910g = 0L;
            this.f17908e.c(this.f17907d.getExactSizeIfKnown());
            return b();
        }
        long j10 = this.f17910g + 1;
        this.f17910g = j10;
        boolean z10 = j10 < cVar.count();
        if (z10) {
            return z10;
        }
        this.f17910g = 0L;
        this.f17911h.clear();
        return b();
    }

    @Override // j$.util.Spliterator
    public Spliterator trySplit() {
        if (!this.f17904a || this.f17911h != null || this.f17912i) {
            return null;
        }
        c();
        Spliterator spliteratorTrySplit = this.f17907d.trySplit();
        if (spliteratorTrySplit == null) {
            return null;
        }
        return e(spliteratorTrySplit);
    }

    public final boolean b() {
        while (this.f17911h.count() == 0) {
            if (this.f17908e.e() || !this.f17909f.getAsBoolean()) {
                if (this.f17912i) {
                    return false;
                }
                this.f17908e.end();
                this.f17912i = true;
            }
        }
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        c();
        return this.f17907d.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        c();
        if (y6.SIZED.l(this.f17905b.f17893m)) {
            return this.f17907d.getExactSizeIfKnown();
        }
        return -1L;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        c();
        int i10 = this.f17905b.f17893m;
        int i11 = i10 & ((~i10) >> 1) & y6.f18261j & y6.f18257f;
        return (i11 & 64) != 0 ? (i11 & (-16449)) | (this.f17907d.characteristics() & 16448) : i11;
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        if (j$.util.c.e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    public final String toString() {
        return String.format("%s[%s]", getClass().getName(), this.f17907d);
    }
}
