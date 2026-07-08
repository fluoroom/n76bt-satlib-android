package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class r extends d {
    private static final long serialVersionUID = -5207853542612002020L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient p f17496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient int f17497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient int f17498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f17499d;

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final e y(j$.time.k kVar) {
        return new g(this, kVar);
    }

    public r(p pVar, int i10, int i11, int i12) {
        pVar.l(i10, i11, i12);
        this.f17496a = pVar;
        this.f17497b = i10;
        this.f17498c = i11;
        this.f17499d = i12;
    }

    public r(p pVar, long j10) {
        int i10 = (int) j10;
        pVar.j();
        if (i10 < pVar.f17488e || i10 >= pVar.f17489f) {
            throw new j$.time.b("Hijrah date out of range");
        }
        int iBinarySearch = Arrays.binarySearch(pVar.f17487d, i10);
        iBinarySearch = iBinarySearch < 0 ? (-iBinarySearch) - 2 : iBinarySearch;
        int i11 = pVar.f17490g;
        int[] iArr = {(iBinarySearch + i11) / 12, ((i11 + iBinarySearch) % 12) + 1, (i10 - pVar.f17487d[iBinarySearch]) + 1};
        this.f17496a = pVar;
        this.f17497b = iArr[0];
        this.f17498c = iArr[1];
        this.f17499d = iArr[2];
    }

    @Override // j$.time.chrono.b
    public final m a() {
        return this.f17496a;
    }

    @Override // j$.time.chrono.d
    public final n D() {
        return s.AH;
    }

    @Override // j$.time.chrono.d, j$.time.temporal.n
    public final j$.time.temporal.u k(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.j(this);
        }
        if (!j$.com.android.tools.r8.a.k(this, qVar)) {
            throw new j$.time.temporal.t(j$.time.c.a("Unsupported field: ", qVar));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        int i10 = q.f17495a[aVar.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? this.f17496a.w(aVar) : j$.time.temporal.u.e(1L, 5L) : j$.time.temporal.u.e(1L, this.f17496a.C(this.f17497b, 12)) : j$.time.temporal.u.e(1L, this.f17496a.o(this.f17497b, this.f17498c));
    }

    @Override // j$.time.temporal.n
    public final long w(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.l(this);
        }
        switch (q.f17495a[((j$.time.temporal.a) qVar).ordinal()]) {
            case 1:
                return this.f17499d;
            case 2:
                return J();
            case 3:
                return ((this.f17499d - 1) / 7) + 1;
            case 4:
                return ((int) j$.com.android.tools.r8.a.w(x() + 3, 7)) + 1;
            case 5:
                return ((this.f17499d - 1) % 7) + 1;
            case 6:
                return ((J() - 1) % 7) + 1;
            case 7:
                return x();
            case 8:
                return ((J() - 1) / 7) + 1;
            case 9:
                return this.f17498c;
            case 10:
                return ((((long) this.f17497b) * 12) + ((long) this.f17498c)) - 1;
            case 11:
                return this.f17497b;
            case 12:
                return this.f17497b;
            case 13:
                return this.f17497b <= 1 ? 0 : 1;
            default:
                throw new j$.time.temporal.t(j$.time.c.a("Unsupported field: ", qVar));
        }
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public final r c(long j10, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (r) super.c(j10, qVar);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        this.f17496a.w(aVar).b(j10, aVar);
        int i10 = (int) j10;
        switch (q.f17495a[aVar.ordinal()]) {
            case 1:
                return M(this.f17497b, this.f17498c, i10);
            case 2:
                return F(Math.min(i10, this.f17496a.C(this.f17497b, 12)) - J());
            case 3:
                return F((j10 - w(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                return F(j10 - ((long) (((int) j$.com.android.tools.r8.a.w(x() + 3, 7)) + 1)));
            case 5:
                return F(j10 - w(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 6:
                return F(j10 - w(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 7:
                return new r(this.f17496a, j10);
            case 8:
                return F((j10 - w(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 9:
                return M(this.f17497b, i10, this.f17499d);
            case 10:
                return G(j10 - (((((long) this.f17497b) * 12) + ((long) this.f17498c)) - 1));
            case 11:
                if (this.f17497b < 1) {
                    i10 = 1 - i10;
                }
                return M(i10, this.f17498c, this.f17499d);
            case 12:
                return M(i10, this.f17498c, this.f17499d);
            case 13:
                return M(1 - this.f17497b, this.f17498c, this.f17499d);
            default:
                throw new j$.time.temporal.t(j$.time.c.a("Unsupported field: ", qVar));
        }
    }

    public final r M(int i10, int i11, int i12) {
        int iO = this.f17496a.o(i10, i11);
        if (i12 > iO) {
            i12 = iO;
        }
        return new r(this.f17496a, i10, i11, i12);
    }

    @Override // j$.time.chrono.d
    /* JADX INFO: renamed from: I */
    public final b j(j$.time.temporal.o oVar) {
        return (r) super.j(oVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    public final j$.time.temporal.m j(j$.time.g gVar) {
        return (r) super.j(gVar);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final long x() {
        return this.f17496a.l(this.f17497b, this.f17498c, this.f17499d);
    }

    public final int J() {
        return this.f17496a.C(this.f17497b, this.f17498c - 1) + this.f17499d;
    }

    @Override // j$.time.chrono.d
    public final b H(long j10) {
        if (j10 == 0) {
            return this;
        }
        long j11 = ((long) this.f17497b) + ((long) ((int) j10));
        int i10 = (int) j11;
        if (j11 == i10) {
            return M(i10, this.f17498c, this.f17499d);
        }
        throw new ArithmeticException();
    }

    @Override // j$.time.chrono.d
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public final r G(long j10) {
        if (j10 == 0) {
            return this;
        }
        long j11 = (((long) this.f17497b) * 12) + ((long) (this.f17498c - 1)) + j10;
        p pVar = this.f17496a;
        long jX = j$.com.android.tools.r8.a.x(j11, 12L);
        int i10 = pVar.f17490g;
        if (jX >= i10 / 12 && jX <= (((pVar.f17487d.length - 1) + i10) / 12) - 1) {
            return M((int) jX, ((int) j$.com.android.tools.r8.a.w(j11, 12L)) + 1, this.f17499d);
        }
        throw new j$.time.b("Invalid Hijrah year: " + jX);
    }

    @Override // j$.time.chrono.d
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public final r F(long j10) {
        return new r(this.f17496a, x() + j10);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.m
    public final b d(long j10, j$.time.temporal.s sVar) {
        return (r) super.d(j10, sVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    public final j$.time.temporal.m d(long j10, j$.time.temporal.s sVar) {
        return (r) super.d(j10, sVar);
    }

    @Override // j$.time.chrono.d
    /* JADX INFO: renamed from: E */
    public final b s(long j10, j$.time.temporal.s sVar) {
        return (r) super.s(j10, sVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    public final j$.time.temporal.m s(long j10, j$.time.temporal.b bVar) {
        return (r) super.s(j10, bVar);
    }

    @Override // j$.time.chrono.d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (this.f17497b == rVar.f17497b && this.f17498c == rVar.f17498c && this.f17499d == rVar.f17499d && this.f17496a.equals(rVar.f17496a)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final int hashCode() {
        int i10 = this.f17497b;
        int i11 = this.f17498c;
        int i12 = this.f17499d;
        this.f17496a.getClass();
        return (((i10 << 11) + (i11 << 6)) + i12) ^ ((i10 & (-2048)) ^ 2100100019);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new f0((byte) 6, this);
    }
}
