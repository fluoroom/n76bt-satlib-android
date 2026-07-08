package j$.time;

import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class q implements j$.time.temporal.m, j$.time.temporal.o, Comparable, Serializable {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f17598c = 0;
    private static final long serialVersionUID = 2287754244819255394L;

    /* JADX INFO: renamed from: a */
    public final i f17599a;

    /* JADX INFO: renamed from: b */
    public final z f17600b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int iCompare;
        q qVar = (q) obj;
        if (this.f17600b.equals(qVar.f17600b)) {
            iCompare = this.f17599a.compareTo(qVar.f17599a);
        } else {
            i iVar = this.f17599a;
            z zVar = this.f17600b;
            iVar.getClass();
            long jQ = j$.com.android.tools.r8.a.q(iVar, zVar);
            i iVar2 = qVar.f17599a;
            z zVar2 = qVar.f17600b;
            iVar2.getClass();
            iCompare = Long.compare(jQ, j$.com.android.tools.r8.a.q(iVar2, zVar2));
            if (iCompare == 0) {
                iCompare = this.f17599a.f17579b.f17589d - qVar.f17599a.f17579b.f17589d;
            }
        }
        return iCompare == 0 ? this.f17599a.compareTo(qVar.f17599a) : iCompare;
    }

    static {
        i iVar = i.f17576c;
        z zVar = z.f17654g;
        iVar.getClass();
        new q(iVar, zVar);
        i iVar2 = i.f17577d;
        z zVar2 = z.f17653f;
        iVar2.getClass();
        new q(iVar2, zVar2);
    }

    public q(i iVar, z zVar) {
        this.f17599a = (i) Objects.requireNonNull(iVar, "dateTime");
        this.f17600b = (z) Objects.requireNonNull(zVar, "offset");
    }

    public final q D(i iVar, z zVar) {
        return (this.f17599a == iVar && this.f17600b.equals(zVar)) ? this : new q(iVar, zVar);
    }

    @Override // j$.time.temporal.n
    public final boolean e(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return true;
        }
        return qVar != null && qVar.i(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.u k(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            if (qVar != j$.time.temporal.a.INSTANT_SECONDS && qVar != j$.time.temporal.a.OFFSET_SECONDS) {
                return this.f17599a.k(qVar);
            }
            return ((j$.time.temporal.a) qVar).f17612b;
        }
        return qVar.j(this);
    }

    @Override // j$.time.temporal.n
    public final int i(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            int i10 = p.f17597a[((j$.time.temporal.a) qVar).ordinal()];
            if (i10 == 1) {
                throw new j$.time.temporal.t("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i10 == 2) {
                return this.f17600b.f17655a;
            }
            return this.f17599a.i(qVar);
        }
        return j$.time.temporal.r.a(this, qVar);
    }

    @Override // j$.time.temporal.n
    public final long w(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.l(this);
        }
        int i10 = p.f17597a[((j$.time.temporal.a) qVar).ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? this.f17599a.w(qVar) : this.f17600b.f17655a;
        }
        i iVar = this.f17599a;
        z zVar = this.f17600b;
        iVar.getClass();
        return j$.com.android.tools.r8.a.q(iVar, zVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m j(g gVar) {
        i iVar = this.f17599a;
        return D(iVar.L(gVar, iVar.f17579b), this.f17600b);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m c(long j10, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
            int i10 = p.f17597a[aVar.ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    return D(this.f17599a, z.I(aVar.f17612b.a(j10, aVar)));
                }
                return D(this.f17599a.c(j10, qVar), this.f17600b);
            }
            Instant instantOfEpochSecond = Instant.ofEpochSecond(j10, this.f17599a.f17579b.f17589d);
            z zVar = this.f17600b;
            Objects.requireNonNull(instantOfEpochSecond, "instant");
            Objects.requireNonNull(zVar, "zone");
            z zVarD = zVar.C().d(instantOfEpochSecond);
            return new q(i.G(instantOfEpochSecond.getEpochSecond(), instantOfEpochSecond.getNano(), zVarD), zVarD);
        }
        return (q) qVar.o(this, j10);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: C */
    public final q d(long j10, j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.b) {
            return D(this.f17599a.d(j10, sVar), this.f17600b);
        }
        return (q) sVar.i(this, j10);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m s(long j10, j$.time.temporal.b bVar) {
        return j10 == Long.MIN_VALUE ? d(Long.MAX_VALUE, bVar).d(1L, bVar) : d(-j10, bVar);
    }

    @Override // j$.time.temporal.n
    public final Object l(j$.time.format.b bVar) {
        if (bVar == j$.time.temporal.r.f17633d || bVar == j$.time.temporal.r.f17634e) {
            return this.f17600b;
        }
        if (bVar == j$.time.temporal.r.f17630a) {
            return null;
        }
        if (bVar == j$.time.temporal.r.f17635f) {
            return this.f17599a.f17578a;
        }
        if (bVar == j$.time.temporal.r.f17636g) {
            return this.f17599a.f17579b;
        }
        if (bVar == j$.time.temporal.r.f17631b) {
            return j$.time.chrono.t.f17501c;
        }
        if (bVar == j$.time.temporal.r.f17632c) {
            return j$.time.temporal.b.NANOS;
        }
        return bVar.a(this);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m o(j$.time.temporal.m mVar) {
        return mVar.c(this.f17599a.f17578a.x(), j$.time.temporal.a.EPOCH_DAY).c(this.f17599a.f17579b.N(), j$.time.temporal.a.NANO_OF_DAY).c(this.f17600b.f17655a, j$.time.temporal.a.OFFSET_SECONDS);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (this.f17599a.equals(qVar.f17599a) && this.f17600b.equals(qVar.f17600b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f17599a.hashCode() ^ this.f17600b.f17655a;
    }

    public final String toString() {
        return this.f17599a.toString() + this.f17600b.f17656b;
    }

    private Object writeReplace() {
        return new t((byte) 10, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
