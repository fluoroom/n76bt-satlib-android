package xd;

import ed.j0;
import rd.h;

/* JADX INFO: loaded from: classes3.dex */
public class a implements Iterable, sd.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0433a f31971d = new C0433a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f31972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f31973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f31974c;

    /* JADX INFO: renamed from: xd.a$a, reason: collision with other inner class name */
    public static final class C0433a {
        public /* synthetic */ C0433a(h hVar) {
            this();
        }

        public final a a(int i10, int i11, int i12) {
            return new a(i10, i11, i12);
        }

        private C0433a() {
        }
    }

    public a(int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i12 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f31972a = i10;
        this.f31973b = ld.c.b(i10, i11, i12);
        this.f31974c = i12;
    }

    public final int b() {
        return this.f31972a;
    }

    public final int c() {
        return this.f31973b;
    }

    public final int d() {
        return this.f31974c;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public j0 iterator() {
        return new b(this.f31972a, this.f31973b, this.f31974c);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (isEmpty() && ((a) obj).isEmpty()) {
            return true;
        }
        a aVar = (a) obj;
        return this.f31972a == aVar.f31972a && this.f31973b == aVar.f31973b && this.f31974c == aVar.f31974c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f31972a * 31) + this.f31973b) * 31) + this.f31974c;
    }

    public boolean isEmpty() {
        return this.f31974c > 0 ? this.f31972a > this.f31973b : this.f31972a < this.f31973b;
    }

    public String toString() {
        StringBuilder sb2;
        int i10;
        if (this.f31974c > 0) {
            sb2 = new StringBuilder();
            sb2.append(this.f31972a);
            sb2.append("..");
            sb2.append(this.f31973b);
            sb2.append(" step ");
            i10 = this.f31974c;
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.f31972a);
            sb2.append(" downTo ");
            sb2.append(this.f31973b);
            sb2.append(" step ");
            i10 = -this.f31974c;
        }
        sb2.append(i10);
        return sb2.toString();
    }
}
