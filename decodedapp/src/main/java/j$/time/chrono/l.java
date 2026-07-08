package j$.time.chrono;

import j$.time.Duration;
import j$.time.Instant;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements j, Serializable {
    private static final long serialVersionUID = -5261813987200935591L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient g f17481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient j$.time.z f17482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient j$.time.y f17483c;

    @Override // j$.time.chrono.j
    public final /* synthetic */ long B() {
        return j$.com.android.tools.r8.a.r(this);
    }

    @Override // j$.time.temporal.n
    public final /* synthetic */ int i(j$.time.temporal.q qVar) {
        return j$.com.android.tools.r8.a.h(this, qVar);
    }

    @Override // j$.time.temporal.n
    public final /* synthetic */ Object l(j$.time.format.b bVar) {
        return j$.com.android.tools.r8.a.o(this, bVar);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return j$.com.android.tools.r8.a.g(this, (j) obj);
    }

    public static l C(j$.time.y yVar, j$.time.z zVar, g gVar) {
        Objects.requireNonNull(gVar, "localDateTime");
        Objects.requireNonNull(yVar, "zone");
        if (yVar instanceof j$.time.z) {
            return new l(yVar, (j$.time.z) yVar, gVar);
        }
        j$.time.zone.f fVarC = yVar.C();
        j$.time.i iVarD = j$.time.i.D(gVar);
        List listF = fVarC.f(iVarD);
        if (listF.size() == 1) {
            zVar = (j$.time.z) listF.get(0);
        } else if (listF.size() != 0) {
            if (zVar == null || !listF.contains(zVar)) {
                zVar = (j$.time.z) listF.get(0);
            }
            gVar = gVar;
        } else {
            Object objE = fVarC.e(iVarD);
            j$.time.zone.b bVar = objE instanceof j$.time.zone.b ? (j$.time.zone.b) objE : null;
            gVar = gVar.E(gVar.f17467a, 0L, 0L, Duration.i(bVar.f17663d.f17655a - bVar.f17662c.f17655a, 0).f17442a, 0L);
            zVar = bVar.f17663d;
        }
        Objects.requireNonNull(zVar, "offset");
        return new l(yVar, zVar, gVar);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.u k(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            if (qVar != j$.time.temporal.a.INSTANT_SECONDS && qVar != j$.time.temporal.a.OFFSET_SECONDS) {
                return ((g) p()).k(qVar);
            }
            return ((j$.time.temporal.a) qVar).f17612b;
        }
        return qVar.j(this);
    }

    public static l o(m mVar, j$.time.temporal.m mVar2) {
        l lVar = (l) mVar2;
        if (mVar.equals(lVar.a())) {
            return lVar;
        }
        throw new ClassCastException("Chronology mismatch, required: " + mVar.h() + ", actual: " + lVar.a().h());
    }

    @Override // j$.time.temporal.n
    public final long w(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            int i10 = i.f17476a[((j$.time.temporal.a) qVar).ordinal()];
            if (i10 == 1) {
                return B();
            }
            if (i10 != 2) {
                return ((g) p()).w(qVar);
            }
            return g().f17655a;
        }
        return qVar.l(this);
    }

    public l(j$.time.y yVar, j$.time.z zVar, g gVar) {
        this.f17481a = (g) Objects.requireNonNull(gVar, "dateTime");
        this.f17482b = (j$.time.z) Objects.requireNonNull(zVar, "offset");
        this.f17483c = (j$.time.y) Objects.requireNonNull(yVar, "zone");
    }

    @Override // j$.time.chrono.j
    public final j$.time.z g() {
        return this.f17482b;
    }

    @Override // j$.time.chrono.j
    public final b f() {
        return ((g) p()).f();
    }

    @Override // j$.time.chrono.j
    public final j$.time.k b() {
        return ((g) p()).b();
    }

    public final int hashCode() {
        return (this.f17481a.hashCode() ^ this.f17482b.f17655a) ^ Integer.rotateLeft(this.f17483c.hashCode(), 3);
    }

    @Override // j$.time.chrono.j
    public final e p() {
        return this.f17481a;
    }

    public final String toString() {
        String str = this.f17481a.toString() + this.f17482b.f17656b;
        j$.time.z zVar = this.f17482b;
        j$.time.y yVar = this.f17483c;
        if (zVar == yVar) {
            return str;
        }
        return str + "[" + yVar.toString() + "]";
    }

    @Override // j$.time.chrono.j
    public final j$.time.y v() {
        return this.f17483c;
    }

    @Override // j$.time.chrono.j
    public final m a() {
        return f().a();
    }

    @Override // j$.time.chrono.j
    public final j r(j$.time.y yVar) {
        return C(yVar, this.f17482b, this.f17481a);
    }

    @Override // j$.time.temporal.n
    public final boolean e(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return true;
        }
        return qVar != null && qVar.i(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m c(long j10, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return o(a(), qVar.o(this, j10));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        int i10 = k.f17479a[aVar.ordinal()];
        if (i10 == 1) {
            return d(j10 - j$.com.android.tools.r8.a.r(this), j$.time.temporal.b.SECONDS);
        }
        if (i10 != 2) {
            return C(this.f17483c, this.f17482b, this.f17481a.c(j10, qVar));
        }
        j$.time.z zVarI = j$.time.z.I(aVar.f17612b.a(j10, aVar));
        g gVar = this.f17481a;
        gVar.getClass();
        Instant instantOfEpochSecond = Instant.ofEpochSecond(j$.com.android.tools.r8.a.q(gVar, zVarI), gVar.f17468b.f17589d);
        j$.time.y yVar = this.f17483c;
        m mVarA = a();
        j$.time.z zVarD = yVar.C().d(instantOfEpochSecond);
        Objects.requireNonNull(zVarD, "offset");
        return new l(yVar, zVarD, (g) mVarA.u(j$.time.i.G(instantOfEpochSecond.getEpochSecond(), instantOfEpochSecond.getNano(), zVarD)));
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public final l d(long j10, j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.b) {
            return o(a(), this.f17481a.d(j10, sVar).o(this));
        }
        return o(a(), sVar.i(this, j10));
    }

    private Object writeReplace() {
        return new f0((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && j$.com.android.tools.r8.a.g(this, (j) obj) == 0;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m j(j$.time.g gVar) {
        return o(a(), gVar.o(this));
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m s(long j10, j$.time.temporal.b bVar) {
        return o(a(), j$.time.temporal.r.b(this, j10, bVar));
    }
}
