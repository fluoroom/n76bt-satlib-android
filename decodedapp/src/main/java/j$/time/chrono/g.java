package j$.time.chrono;

import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements e, j$.time.temporal.m, j$.time.temporal.o, Serializable {
    private static final long serialVersionUID = 4556003607393004514L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient b f17467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient j$.time.k f17468b;

    @Override // j$.time.temporal.n
    public final /* synthetic */ Object l(j$.time.format.b bVar) {
        return j$.com.android.tools.r8.a.n(this, bVar);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int compareTo(e eVar) {
        return j$.com.android.tools.r8.a.f(this, eVar);
    }

    public static g C(m mVar, j$.time.temporal.m mVar2) {
        g gVar = (g) mVar2;
        if (mVar.equals(gVar.f17467a.a())) {
            return gVar;
        }
        throw new ClassCastException("Chronology mismatch, required: " + mVar.h() + ", actual: " + gVar.f17467a.a().h());
    }

    public g(b bVar, j$.time.k kVar) {
        Objects.requireNonNull(bVar, "date");
        Objects.requireNonNull(kVar, "time");
        this.f17467a = bVar;
        this.f17468b = kVar;
    }

    public final g G(j$.time.temporal.m mVar, j$.time.k kVar) {
        b bVar = this.f17467a;
        return (bVar == mVar && this.f17468b == kVar) ? this : new g(d.C(bVar.a(), mVar), kVar);
    }

    @Override // j$.time.chrono.e
    public final m a() {
        return this.f17467a.a();
    }

    @Override // j$.time.chrono.e
    public final b f() {
        return this.f17467a;
    }

    public final int hashCode() {
        return this.f17467a.hashCode() ^ this.f17468b.hashCode();
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m s(long j10, j$.time.temporal.b bVar) {
        return C(this.f17467a.a(), j$.time.temporal.r.b(this, j10, bVar));
    }

    public final String toString() {
        return this.f17467a.toString() + "T" + this.f17468b.toString();
    }

    @Override // j$.time.chrono.e
    public final j$.time.k b() {
        return this.f17468b;
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
            if (!((j$.time.temporal.a) qVar).w()) {
                return this.f17467a.k(qVar);
            }
            j$.time.k kVar = this.f17468b;
            kVar.getClass();
            return j$.time.temporal.r.d(kVar, qVar);
        }
        return qVar.j(this);
    }

    @Override // j$.time.temporal.n
    public final int i(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) qVar).w() ? this.f17468b.i(qVar) : this.f17467a.i(qVar);
        }
        return k(qVar).a(w(qVar), qVar);
    }

    @Override // j$.time.temporal.n
    public final long w(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) qVar).w() ? this.f17468b.w(qVar) : this.f17467a.w(qVar);
        }
        return qVar.l(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m j(j$.time.g gVar) {
        return G(gVar, this.f17468b);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public final g c(long j10, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            if (((j$.time.temporal.a) qVar).w()) {
                return G(this.f17467a, this.f17468b.c(j10, qVar));
            }
            return G(this.f17467a.c(j10, qVar), this.f17468b);
        }
        return C(this.f17467a.a(), qVar.o(this, j10));
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public final g d(long j10, j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.b)) {
            return C(this.f17467a.a(), sVar.i(this, j10));
        }
        switch (f.f17464a[((j$.time.temporal.b) sVar).ordinal()]) {
            case 1:
                return E(this.f17467a, 0L, 0L, 0L, j10);
            case 2:
                g gVarG = G(this.f17467a.d(j10 / 86400000000L, (j$.time.temporal.s) j$.time.temporal.b.DAYS), this.f17468b);
                return gVarG.E(gVarG.f17467a, 0L, 0L, 0L, (j10 % 86400000000L) * 1000);
            case 3:
                g gVarG2 = G(this.f17467a.d(j10 / 86400000, (j$.time.temporal.s) j$.time.temporal.b.DAYS), this.f17468b);
                return gVarG2.E(gVarG2.f17467a, 0L, 0L, 0L, (j10 % 86400000) * 1000000);
            case 4:
                return E(this.f17467a, 0L, 0L, j10, 0L);
            case 5:
                return E(this.f17467a, 0L, j10, 0L, 0L);
            case 6:
                return E(this.f17467a, j10, 0L, 0L, 0L);
            case 7:
                g gVarG3 = G(this.f17467a.d(j10 / 256, (j$.time.temporal.s) j$.time.temporal.b.DAYS), this.f17468b);
                return gVarG3.E(gVarG3.f17467a, (j10 % 256) * 12, 0L, 0L, 0L);
            default:
                return G(this.f17467a.d(j10, sVar), this.f17468b);
        }
    }

    public final g E(b bVar, long j10, long j11, long j12, long j13) {
        if ((j10 | j11 | j12 | j13) == 0) {
            return G(bVar, this.f17468b);
        }
        long j14 = j10 / 24;
        long j15 = ((j10 % 24) * 3600000000000L) + ((j11 % 1440) * 60000000000L) + ((j12 % 86400) * 1000000000) + (j13 % 86400000000000L);
        long jN = this.f17468b.N();
        long j16 = j15 + jN;
        long jX = j$.com.android.tools.r8.a.x(j16, 86400000000000L) + j14 + (j11 / 1440) + (j12 / 86400) + (j13 / 86400000000000L);
        long jW = j$.com.android.tools.r8.a.w(j16, 86400000000000L);
        return G(bVar.d(jX, (j$.time.temporal.s) j$.time.temporal.b.DAYS), jW == jN ? this.f17468b : j$.time.k.G(jW));
    }

    @Override // j$.time.chrono.e
    public final j m(j$.time.z zVar) {
        return l.C(zVar, null, this);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m o(j$.time.temporal.m mVar) {
        return mVar.c(f().x(), j$.time.temporal.a.EPOCH_DAY).c(b().N(), j$.time.temporal.a.NANO_OF_DAY);
    }

    private Object writeReplace() {
        return new f0((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && j$.com.android.tools.r8.a.f(this, (e) obj) == 0;
    }
}
