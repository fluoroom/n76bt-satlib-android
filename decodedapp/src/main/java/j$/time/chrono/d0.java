package j$.time.chrono;

import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class d0 extends d {
    private static final long serialVersionUID = 1300372329181994526L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient j$.time.g f17462a;

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final e y(j$.time.k kVar) {
        return new g(this, kVar);
    }

    public d0(j$.time.g gVar) {
        Objects.requireNonNull(gVar, "isoDate");
        this.f17462a = gVar;
    }

    @Override // j$.time.chrono.b
    public final m a() {
        return b0.f17459c;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final int hashCode() {
        b0.f17459c.getClass();
        return this.f17462a.hashCode() ^ (-1990173233);
    }

    @Override // j$.time.chrono.d
    public final n D() {
        return J() >= 1 ? e0.ROC : e0.BEFORE_ROC;
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
        int i10 = c0.f17461a[aVar.ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return this.f17462a.k(qVar);
        }
        if (i10 != 4) {
            return b0.f17459c.j(aVar);
        }
        j$.time.temporal.u uVar = j$.time.temporal.a.YEAR.f17612b;
        return j$.time.temporal.u.e(1L, J() <= 0 ? (-uVar.f17637a) + 1912 : uVar.f17640d - 1911);
    }

    @Override // j$.time.temporal.n
    public final long w(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            int i10 = c0.f17461a[((j$.time.temporal.a) qVar).ordinal()];
            if (i10 == 4) {
                int iJ = J();
                if (iJ < 1) {
                    iJ = 1 - iJ;
                }
                return iJ;
            }
            if (i10 == 5) {
                return ((((long) J()) * 12) + ((long) this.f17462a.f17573b)) - 1;
            }
            if (i10 == 6) {
                return J();
            }
            if (i10 != 7) {
                return this.f17462a.w(qVar);
            }
            return J() < 1 ? 0 : 1;
        }
        return qVar.l(this);
    }

    public final int J() {
        return this.f17462a.f17572a - 1911;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    @Override // j$.time.chrono.d, j$.time.temporal.m
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final j$.time.chrono.d0 c(long r8, j$.time.temporal.q r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof j$.time.temporal.a
            if (r0 == 0) goto La0
            r0 = r10
            j$.time.temporal.a r0 = (j$.time.temporal.a) r0
            long r1 = r7.w(r0)
            int r3 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r3 != 0) goto L10
            return r7
        L10:
            int[] r1 = j$.time.chrono.c0.f17461a
            int r2 = r0.ordinal()
            r2 = r1[r2]
            r3 = 7
            r4 = 6
            r5 = 4
            if (r2 == r5) goto L4a
            r6 = 5
            if (r2 == r6) goto L25
            if (r2 == r4) goto L4a
            if (r2 == r3) goto L4a
            goto L60
        L25:
            j$.time.chrono.b0 r10 = j$.time.chrono.b0.f17459c
            j$.time.temporal.u r10 = r10.j(r0)
            r10.b(r8, r0)
            int r10 = r7.J()
            long r0 = (long) r10
            r2 = 12
            long r0 = r0 * r2
            j$.time.g r10 = r7.f17462a
            short r2 = r10.f17573b
            long r2 = (long) r2
            long r0 = r0 + r2
            r2 = 1
            long r0 = r0 - r2
            long r8 = r8 - r0
            j$.time.g r8 = r10.O(r8)
            j$.time.chrono.d0 r8 = r7.L(r8)
            return r8
        L4a:
            j$.time.chrono.b0 r2 = j$.time.chrono.b0.f17459c
            j$.time.temporal.u r2 = r2.j(r0)
            int r2 = r2.a(r8, r0)
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r5) goto L89
            if (r0 == r4) goto L7c
            if (r0 == r3) goto L6b
        L60:
            j$.time.g r0 = r7.f17462a
            j$.time.g r8 = r0.c(r8, r10)
            j$.time.chrono.d0 r8 = r7.L(r8)
            return r8
        L6b:
            j$.time.g r8 = r7.f17462a
            int r9 = r7.J()
            int r9 = 1912 - r9
            j$.time.g r8 = r8.U(r9)
            j$.time.chrono.d0 r8 = r7.L(r8)
            return r8
        L7c:
            j$.time.g r8 = r7.f17462a
            int r2 = r2 + 1911
            j$.time.g r8 = r8.U(r2)
            j$.time.chrono.d0 r8 = r7.L(r8)
            return r8
        L89:
            j$.time.g r8 = r7.f17462a
            int r9 = r7.J()
            r10 = 1
            if (r9 < r10) goto L95
            int r2 = r2 + 1911
            goto L97
        L95:
            int r2 = 1912 - r2
        L97:
            j$.time.g r8 = r8.U(r2)
            j$.time.chrono.d0 r8 = r7.L(r8)
            return r8
        La0:
            j$.time.chrono.b r8 = super.c(r8, r10)
            j$.time.chrono.d0 r8 = (j$.time.chrono.d0) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.d0.c(long, j$.time.temporal.q):j$.time.chrono.d0");
    }

    @Override // j$.time.chrono.d
    /* JADX INFO: renamed from: I */
    public final b j(j$.time.temporal.o oVar) {
        return (d0) super.j(oVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    public final j$.time.temporal.m j(j$.time.g gVar) {
        return (d0) super.j(gVar);
    }

    @Override // j$.time.chrono.d
    public final b H(long j10) {
        return L(this.f17462a.P(j10));
    }

    @Override // j$.time.chrono.d
    public final b G(long j10) {
        return L(this.f17462a.O(j10));
    }

    @Override // j$.time.chrono.d
    public final b F(long j10) {
        return L(this.f17462a.N(j10));
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.m
    public final b d(long j10, j$.time.temporal.s sVar) {
        return (d0) super.d(j10, sVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    public final j$.time.temporal.m d(long j10, j$.time.temporal.s sVar) {
        return (d0) super.d(j10, sVar);
    }

    @Override // j$.time.chrono.d
    /* JADX INFO: renamed from: E */
    public final b s(long j10, j$.time.temporal.s sVar) {
        return (d0) super.s(j10, sVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    public final j$.time.temporal.m s(long j10, j$.time.temporal.b bVar) {
        return (d0) super.s(j10, bVar);
    }

    public final d0 L(j$.time.g gVar) {
        return gVar.equals(this.f17462a) ? this : new d0(gVar);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final long x() {
        return this.f17462a.x();
    }

    @Override // j$.time.chrono.d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d0) {
            return this.f17462a.equals(((d0) obj).f17462a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new f0((byte) 7, this);
    }
}
