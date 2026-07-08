package j$.time;

import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class r implements j$.time.temporal.m, j$.time.temporal.o, Comparable, Serializable {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f17601c = 0;
    private static final long serialVersionUID = 7264499704384272492L;

    /* JADX INFO: renamed from: a */
    public final k f17602a;

    /* JADX INFO: renamed from: b */
    public final z f17603b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        r rVar = (r) obj;
        if (this.f17603b.equals(rVar.f17603b)) {
            return this.f17602a.compareTo(rVar.f17602a);
        }
        int iCompare = Long.compare(this.f17602a.N() - (((long) this.f17603b.f17655a) * 1000000000), rVar.f17602a.N() - (((long) rVar.f17603b.f17655a) * 1000000000));
        return iCompare == 0 ? this.f17602a.compareTo(rVar.f17602a) : iCompare;
    }

    static {
        k kVar = k.f17582e;
        z zVar = z.f17654g;
        kVar.getClass();
        new r(kVar, zVar);
        k kVar2 = k.f17583f;
        z zVar2 = z.f17653f;
        kVar2.getClass();
        new r(kVar2, zVar2);
    }

    public r(k kVar, z zVar) {
        this.f17602a = (k) Objects.requireNonNull(kVar, "time");
        this.f17603b = (z) Objects.requireNonNull(zVar, "offset");
    }

    public final r D(k kVar, z zVar) {
        return (this.f17602a == kVar && this.f17603b.equals(zVar)) ? this : new r(kVar, zVar);
    }

    @Override // j$.time.temporal.n
    public final boolean e(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) qVar).w() || qVar == j$.time.temporal.a.OFFSET_SECONDS : qVar != null && qVar.i(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.u k(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            if (qVar != j$.time.temporal.a.OFFSET_SECONDS) {
                k kVar = this.f17602a;
                kVar.getClass();
                return j$.time.temporal.r.d(kVar, qVar);
            }
            return ((j$.time.temporal.a) qVar).f17612b;
        }
        return qVar.j(this);
    }

    @Override // j$.time.temporal.n
    public final int i(j$.time.temporal.q qVar) {
        return j$.time.temporal.r.a(this, qVar);
    }

    @Override // j$.time.temporal.n
    public final long w(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            if (qVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return this.f17603b.f17655a;
            }
            return this.f17602a.w(qVar);
        }
        return qVar.l(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m c(long j10, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            if (qVar == j$.time.temporal.a.OFFSET_SECONDS) {
                j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
                return D(this.f17602a, z.I(aVar.f17612b.a(j10, aVar)));
            }
            return D(this.f17602a.c(j10, qVar), this.f17603b);
        }
        return (r) qVar.o(this, j10);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: C */
    public final r d(long j10, j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.b) {
            return D(this.f17602a.d(j10, sVar), this.f17603b);
        }
        return (r) sVar.i(this, j10);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m s(long j10, j$.time.temporal.b bVar) {
        return j10 == Long.MIN_VALUE ? d(Long.MAX_VALUE, bVar).d(1L, bVar) : d(-j10, bVar);
    }

    @Override // j$.time.temporal.n
    public final Object l(j$.time.format.b bVar) {
        if (bVar == j$.time.temporal.r.f17633d || bVar == j$.time.temporal.r.f17634e) {
            return this.f17603b;
        }
        if (((bVar == j$.time.temporal.r.f17630a) || (bVar == j$.time.temporal.r.f17631b)) || bVar == j$.time.temporal.r.f17635f) {
            return null;
        }
        if (bVar == j$.time.temporal.r.f17636g) {
            return this.f17602a;
        }
        if (bVar == j$.time.temporal.r.f17632c) {
            return j$.time.temporal.b.NANOS;
        }
        return bVar.a(this);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m o(j$.time.temporal.m mVar) {
        return mVar.c(this.f17602a.N(), j$.time.temporal.a.NANO_OF_DAY).c(this.f17603b.f17655a, j$.time.temporal.a.OFFSET_SECONDS);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (this.f17602a.equals(rVar.f17602a) && this.f17603b.equals(rVar.f17603b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f17602a.hashCode() ^ this.f17603b.f17655a;
    }

    public final String toString() {
        return this.f17602a.toString() + this.f17603b.f17656b;
    }

    private Object writeReplace() {
        return new t((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m j(g gVar) {
        return (r) j$.com.android.tools.r8.a.a(gVar, this);
    }
}
