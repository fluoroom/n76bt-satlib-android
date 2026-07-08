package j$.time;

import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements j$.time.temporal.m, j$.time.temporal.o, j$.time.chrono.e, Serializable {

    /* JADX INFO: renamed from: c */
    public static final i f17576c = F(g.f17570d, k.f17582e);

    /* JADX INFO: renamed from: d */
    public static final i f17577d = F(g.f17571e, k.f17583f);
    private static final long serialVersionUID = 6207766400415563566L;

    /* JADX INFO: renamed from: a */
    public final g f17578a;

    /* JADX INFO: renamed from: b */
    public final k f17579b;

    @Override // j$.time.chrono.e
    public final j$.time.chrono.m a() {
        return ((g) f()).a();
    }

    @Override // j$.time.chrono.e
    public final j$.time.chrono.j m(z zVar) {
        return c0.C(this, zVar, null);
    }

    public static i F(g gVar, k kVar) {
        Objects.requireNonNull(gVar, "date");
        Objects.requireNonNull(kVar, "time");
        return new i(gVar, kVar);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m o(j$.time.temporal.m mVar) {
        return mVar.c(((g) f()).x(), j$.time.temporal.a.EPOCH_DAY).c(b().N(), j$.time.temporal.a.NANO_OF_DAY);
    }

    public static i G(long j10, int i10, z zVar) {
        Objects.requireNonNull(zVar, "offset");
        long j11 = i10;
        j$.time.temporal.a.NANO_OF_SECOND.s(j11);
        long j12 = j10 + ((long) zVar.f17655a);
        long j13 = 86400;
        return new i(g.L(j$.com.android.tools.r8.a.x(j12, j13)), k.G((((long) ((int) j$.com.android.tools.r8.a.w(j12, j13))) * 1000000000) + j11));
    }

    public static i D(j$.time.temporal.n nVar) {
        if (nVar instanceof i) {
            return (i) nVar;
        }
        if (!(nVar instanceof c0)) {
            if (!(nVar instanceof q)) {
                try {
                    return new i(g.E(nVar), k.E(nVar));
                } catch (b e10) {
                    throw new b("Unable to obtain LocalDateTime from TemporalAccessor: " + nVar + " of type " + nVar.getClass().getName(), e10);
                }
            }
            return ((q) nVar).f17599a;
        }
        return ((c0) nVar).f17453a;
    }

    public i(g gVar, k kVar) {
        this.f17578a = gVar;
        this.f17579b = kVar;
    }

    public final i L(g gVar, k kVar) {
        return (this.f17578a == gVar && this.f17579b == kVar) ? this : new i(gVar, kVar);
    }

    @Override // j$.time.temporal.n
    public final boolean e(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar != null && qVar.i(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        return aVar.isDateBased() || aVar.w();
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.u k(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            if (((j$.time.temporal.a) qVar).w()) {
                k kVar = this.f17579b;
                kVar.getClass();
                return j$.time.temporal.r.d(kVar, qVar);
            }
            return this.f17578a.k(qVar);
        }
        return qVar.j(this);
    }

    @Override // j$.time.temporal.n
    public final int i(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) qVar).w() ? this.f17579b.i(qVar) : this.f17578a.i(qVar);
        }
        return j$.time.temporal.r.a(this, qVar);
    }

    @Override // j$.time.temporal.n
    public final long w(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) qVar).w() ? this.f17579b.w(qVar) : this.f17578a.w(qVar);
        }
        return qVar.l(this);
    }

    @Override // j$.time.chrono.e
    public final j$.time.chrono.b f() {
        return this.f17578a;
    }

    @Override // j$.time.chrono.e
    public final k b() {
        return this.f17579b;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m j(g gVar) {
        return L(gVar, this.f17579b);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: K */
    public final i c(long j10, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            if (((j$.time.temporal.a) qVar).w()) {
                return L(this.f17578a, this.f17579b.c(j10, qVar));
            }
            return L(this.f17578a.c(j10, qVar), this.f17579b);
        }
        return (i) qVar.o(this, j10);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: H */
    public final i d(long j10, j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.b)) {
            return (i) sVar.i(this, j10);
        }
        switch (h.f17575a[((j$.time.temporal.b) sVar).ordinal()]) {
            case 1:
                return J(this.f17578a, 0L, 0L, 0L, j10);
            case 2:
                i iVarL = L(this.f17578a.N(j10 / 86400000000L), this.f17579b);
                return iVarL.J(iVarL.f17578a, 0L, 0L, 0L, (j10 % 86400000000L) * 1000);
            case 3:
                i iVarL2 = L(this.f17578a.N(j10 / 86400000), this.f17579b);
                return iVarL2.J(iVarL2.f17578a, 0L, 0L, 0L, (j10 % 86400000) * 1000000);
            case 4:
                return I(j10);
            case 5:
                return J(this.f17578a, 0L, j10, 0L, 0L);
            case 6:
                return J(this.f17578a, j10, 0L, 0L, 0L);
            case 7:
                i iVarL3 = L(this.f17578a.N(j10 / 256), this.f17579b);
                return iVarL3.J(iVarL3.f17578a, (j10 % 256) * 12, 0L, 0L, 0L);
            default:
                return L(this.f17578a.d(j10, sVar), this.f17579b);
        }
    }

    public final i I(long j10) {
        return J(this.f17578a, 0L, 0L, j10, 0L);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m s(long j10, j$.time.temporal.b bVar) {
        return j10 == Long.MIN_VALUE ? d(Long.MAX_VALUE, bVar).d(1L, bVar) : d(-j10, bVar);
    }

    public final i J(g gVar, long j10, long j11, long j12, long j13) {
        if ((j10 | j11 | j12 | j13) == 0) {
            return L(gVar, this.f17579b);
        }
        long j14 = 1;
        long jN = this.f17579b.N();
        long j15 = ((((j10 % 24) * 3600000000000L) + ((j11 % 1440) * 60000000000L) + ((j12 % 86400) * 1000000000) + (j13 % 86400000000000L)) * j14) + jN;
        long jX = j$.com.android.tools.r8.a.x(j15, 86400000000000L) + (((j10 / 24) + (j11 / 1440) + (j12 / 86400) + (j13 / 86400000000000L)) * j14);
        long jW = j$.com.android.tools.r8.a.w(j15, 86400000000000L);
        return L(gVar.N(jX), jW == jN ? this.f17579b : k.G(jW));
    }

    @Override // j$.time.temporal.n
    public final Object l(j$.time.format.b bVar) {
        if (bVar == j$.time.temporal.r.f17635f) {
            return this.f17578a;
        }
        return j$.com.android.tools.r8.a.n(this, bVar);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: z */
    public final int compareTo(j$.time.chrono.e eVar) {
        if (eVar instanceof i) {
            return C((i) eVar);
        }
        return j$.com.android.tools.r8.a.f(this, eVar);
    }

    public final int C(i iVar) {
        int iC = this.f17578a.C(iVar.f17578a);
        return iC == 0 ? this.f17579b.compareTo(iVar.f17579b) : iC;
    }

    public final boolean E(j$.time.chrono.e eVar) {
        if (eVar instanceof i) {
            return C((i) eVar) < 0;
        }
        long jX = this.f17578a.x();
        long jX2 = eVar.f().x();
        if (jX >= jX2) {
            return jX == jX2 && this.f17579b.N() < eVar.b().N();
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f17578a.equals(iVar.f17578a) && this.f17579b.equals(iVar.f17579b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f17578a.hashCode() ^ this.f17579b.hashCode();
    }

    public final String toString() {
        return this.f17578a.toString() + "T" + this.f17579b.toString();
    }

    private Object writeReplace() {
        return new t((byte) 5, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
