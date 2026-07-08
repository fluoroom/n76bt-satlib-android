package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class y extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j$.time.g f17506d = j$.time.g.K(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient j$.time.g f17507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient z f17508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient int f17509c;

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final e y(j$.time.k kVar) {
        return new g(this, kVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public y(j$.time.g r7) {
        /*
            r6 = this;
            r6.<init>()
            j$.time.g r0 = j$.time.chrono.y.f17506d
            boolean r1 = j$.time.c.b(r0)
            r2 = 1
            if (r1 == 0) goto L16
            r7.getClass()
            int r0 = r7.C(r0)
            if (r0 >= 0) goto L24
            goto L22
        L16:
            long r3 = r7.x()
            long r0 = r0.x()
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 >= 0) goto L24
        L22:
            r0 = 1
            goto L25
        L24:
            r0 = 0
        L25:
            if (r0 != 0) goto L3a
            j$.time.chrono.z r0 = j$.time.chrono.z.h(r7)
            r6.f17508b = r0
            int r1 = r7.f17572a
            j$.time.g r0 = r0.f17513b
            int r0 = r0.f17572a
            int r1 = r1 - r0
            int r1 = r1 + r2
            r6.f17509c = r1
            r6.f17507a = r7
            return
        L3a:
            j$.time.b r7 = new j$.time.b
            java.lang.String r0 = "JapaneseDate before Meiji 6 is not supported"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.y.<init>(j$.time.g):void");
    }

    @Override // j$.time.chrono.b
    public final m a() {
        return w.f17504c;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final int hashCode() {
        w.f17504c.getClass();
        return this.f17507a.hashCode() ^ (-688086063);
    }

    @Override // j$.time.chrono.d
    public final n D() {
        return this.f17508b;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.n
    public final boolean e(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH || qVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR || qVar == j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH || qVar == j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        if (qVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) qVar).isDateBased();
        }
        return qVar != null && qVar.i(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    @Override // j$.time.chrono.d, j$.time.temporal.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final j$.time.temporal.u k(j$.time.temporal.q r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof j$.time.temporal.a
            if (r0 == 0) goto L99
            boolean r0 = r5.e(r6)
            if (r0 == 0) goto L8d
            j$.time.temporal.a r6 = (j$.time.temporal.a) r6
            int[] r0 = j$.time.chrono.x.f17505a
            int r1 = r6.ordinal()
            r0 = r0[r1]
            r1 = 1
            r2 = 1
            if (r0 == r1) goto L81
            r4 = 2
            if (r0 == r4) goto L48
            r4 = 3
            if (r0 == r4) goto L26
            j$.time.chrono.w r0 = j$.time.chrono.w.f17504c
            j$.time.temporal.u r6 = r0.j(r6)
            return r6
        L26:
            j$.time.chrono.z r6 = r5.f17508b
            j$.time.g r0 = r6.f17513b
            int r0 = r0.f17572a
            j$.time.chrono.z r6 = r6.n()
            if (r6 == 0) goto L3e
            j$.time.g r6 = r6.f17513b
            int r6 = r6.f17572a
            int r6 = r6 - r0
            int r6 = r6 + r1
            long r0 = (long) r6
            j$.time.temporal.u r6 = j$.time.temporal.u.e(r2, r0)
            return r6
        L3e:
            r6 = 999999999(0x3b9ac9ff, float:0.004723787)
            int r6 = r6 - r0
            long r0 = (long) r6
            j$.time.temporal.u r6 = j$.time.temporal.u.e(r2, r0)
            return r6
        L48:
            j$.time.chrono.z r6 = r5.f17508b
            j$.time.chrono.z r6 = r6.n()
            if (r6 == 0) goto L60
            j$.time.g r6 = r6.f17513b
            int r0 = r6.f17572a
            j$.time.g r4 = r5.f17507a
            int r4 = r4.f17572a
            if (r0 != r4) goto L60
            int r6 = r6.H()
            int r6 = r6 - r1
            goto L6d
        L60:
            j$.time.g r6 = r5.f17507a
            boolean r6 = r6.I()
            if (r6 == 0) goto L6b
            r6 = 366(0x16e, float:5.13E-43)
            goto L6d
        L6b:
            r6 = 365(0x16d, float:5.11E-43)
        L6d:
            int r0 = r5.f17509c
            if (r0 != r1) goto L7b
            j$.time.chrono.z r0 = r5.f17508b
            j$.time.g r0 = r0.f17513b
            int r0 = r0.H()
            int r0 = r0 - r1
            int r6 = r6 - r0
        L7b:
            long r0 = (long) r6
            j$.time.temporal.u r6 = j$.time.temporal.u.e(r2, r0)
            return r6
        L81:
            j$.time.g r6 = r5.f17507a
            int r6 = r6.J()
            long r0 = (long) r6
            j$.time.temporal.u r6 = j$.time.temporal.u.e(r2, r0)
            return r6
        L8d:
            j$.time.temporal.t r0 = new j$.time.temporal.t
            java.lang.String r1 = "Unsupported field: "
            java.lang.String r6 = j$.time.c.a(r1, r6)
            r0.<init>(r6)
            throw r0
        L99:
            j$.time.temporal.u r6 = r6.j(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.y.k(j$.time.temporal.q):j$.time.temporal.u");
    }

    @Override // j$.time.temporal.n
    public final long w(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.l(this);
        }
        switch (x.f17505a[((j$.time.temporal.a) qVar).ordinal()]) {
            case 2:
                return this.f17509c == 1 ? (this.f17507a.H() - this.f17508b.f17513b.H()) + 1 : this.f17507a.H();
            case 3:
                return this.f17509c;
            case 4:
            case 5:
            case 6:
            case 7:
                throw new j$.time.temporal.t(j$.time.c.a("Unsupported field: ", qVar));
            case 8:
                return this.f17508b.f17512a;
            default:
                return this.f17507a.w(qVar);
        }
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public final y c(long j10, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
            if (w(aVar) == j10) {
                return this;
            }
            int[] iArr = x.f17505a;
            int i10 = iArr[aVar.ordinal()];
            if (i10 == 3 || i10 == 8 || i10 == 9) {
                int iA = w.f17504c.j(aVar).a(j10, aVar);
                int i11 = iArr[aVar.ordinal()];
                if (i11 == 3) {
                    return L(this.f17508b, iA);
                }
                if (i11 == 8) {
                    return L(z.q(iA), this.f17509c);
                }
                if (i11 == 9) {
                    return K(this.f17507a.U(iA));
                }
            }
            return K(this.f17507a.c(j10, qVar));
        }
        return (y) super.c(j10, qVar);
    }

    @Override // j$.time.chrono.d
    /* JADX INFO: renamed from: I */
    public final b j(j$.time.temporal.o oVar) {
        return (y) super.j(oVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    public final j$.time.temporal.m j(j$.time.g gVar) {
        return (y) super.j(gVar);
    }

    public final y L(z zVar, int i10) {
        w.f17504c.getClass();
        if (zVar == null) {
            throw new ClassCastException("Era must be JapaneseEra");
        }
        int i11 = zVar.f17513b.f17572a;
        int i12 = (i11 + i10) - 1;
        if (i10 != 1 && (i12 < -999999999 || i12 > 999999999 || i12 < i11 || zVar != z.h(j$.time.g.K(i12, 1, 1)))) {
            throw new j$.time.b("Invalid yearOfEra value");
        }
        return K(this.f17507a.U(i12));
    }

    @Override // j$.time.chrono.d
    public final b H(long j10) {
        return K(this.f17507a.P(j10));
    }

    @Override // j$.time.chrono.d
    public final b G(long j10) {
        return K(this.f17507a.O(j10));
    }

    @Override // j$.time.chrono.d
    public final b F(long j10) {
        return K(this.f17507a.N(j10));
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.m
    public final b d(long j10, j$.time.temporal.s sVar) {
        return (y) super.d(j10, sVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    public final j$.time.temporal.m d(long j10, j$.time.temporal.s sVar) {
        return (y) super.d(j10, sVar);
    }

    @Override // j$.time.chrono.d
    /* JADX INFO: renamed from: E */
    public final b s(long j10, j$.time.temporal.s sVar) {
        return (y) super.s(j10, sVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    public final j$.time.temporal.m s(long j10, j$.time.temporal.b bVar) {
        return (y) super.s(j10, bVar);
    }

    public final y K(j$.time.g gVar) {
        return gVar.equals(this.f17507a) ? this : new y(gVar);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final long x() {
        return this.f17507a.x();
    }

    @Override // j$.time.chrono.d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y) {
            return this.f17507a.equals(((y) obj).f17507a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new f0((byte) 4, this);
    }
}
