package j$.time;

import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class c0 implements j$.time.temporal.m, j$.time.chrono.j, Serializable {
    private static final long serialVersionUID = -6260982410461394882L;

    /* JADX INFO: renamed from: a */
    public final i f17453a;

    /* JADX INFO: renamed from: b */
    public final z f17454b;

    /* JADX INFO: renamed from: c */
    public final y f17455c;

    @Override // j$.time.chrono.j
    public final /* synthetic */ long B() {
        return j$.com.android.tools.r8.a.r(this);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return j$.com.android.tools.r8.a.g(this, (j$.time.chrono.j) obj);
    }

    @Override // j$.time.chrono.j
    public final j$.time.chrono.m a() {
        return ((g) f()).a();
    }

    public static c0 C(i iVar, y yVar, z zVar) {
        Objects.requireNonNull(iVar, "localDateTime");
        Objects.requireNonNull(yVar, "zone");
        if (yVar instanceof z) {
            return new c0(iVar, yVar, (z) yVar);
        }
        j$.time.zone.f fVarC = yVar.C();
        List listF = fVarC.f(iVar);
        if (listF.size() == 1) {
            zVar = (z) listF.get(0);
        } else if (listF.size() != 0) {
            if (zVar == null || !listF.contains(zVar)) {
                zVar = (z) Objects.requireNonNull((z) listF.get(0), "offset");
            }
        } else {
            Object objE = fVarC.e(iVar);
            j$.time.zone.b bVar = objE instanceof j$.time.zone.b ? (j$.time.zone.b) objE : null;
            iVar = iVar.I(Duration.i(bVar.f17663d.f17655a - bVar.f17662c.f17655a, 0).f17442a);
            zVar = bVar.f17663d;
        }
        return new c0(iVar, yVar, zVar);
    }

    public static c0 o(long j10, int i10, y yVar) {
        z zVarD = yVar.C().d(Instant.ofEpochSecond(j10, i10));
        return new c0(i.G(j10, i10, zVarD), yVar, zVarD);
    }

    public c0(i iVar, y yVar, z zVar) {
        this.f17453a = iVar;
        this.f17454b = zVar;
        this.f17455c = yVar;
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
            if (qVar == j$.time.temporal.a.INSTANT_SECONDS || qVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return ((j$.time.temporal.a) qVar).f17612b;
            }
            return this.f17453a.k(qVar);
        }
        return qVar.j(this);
    }

    @Override // j$.time.temporal.n
    public final int i(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            int i10 = b0.f17452a[((j$.time.temporal.a) qVar).ordinal()];
            if (i10 == 1) {
                throw new j$.time.temporal.t("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i10 == 2) {
                return this.f17454b.f17655a;
            }
            return this.f17453a.i(qVar);
        }
        return j$.com.android.tools.r8.a.h(this, qVar);
    }

    @Override // j$.time.temporal.n
    public final long w(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.l(this);
        }
        int i10 = b0.f17452a[((j$.time.temporal.a) qVar).ordinal()];
        return i10 != 1 ? i10 != 2 ? this.f17453a.w(qVar) : this.f17454b.f17655a : j$.com.android.tools.r8.a.r(this);
    }

    @Override // j$.time.chrono.j
    public final z g() {
        return this.f17454b;
    }

    @Override // j$.time.chrono.j
    public final y v() {
        return this.f17455c;
    }

    @Override // j$.time.chrono.j
    public final j$.time.chrono.j r(y yVar) {
        Objects.requireNonNull(yVar, "zone");
        return this.f17455c.equals(yVar) ? this : C(this.f17453a, yVar, this.f17454b);
    }

    @Override // j$.time.chrono.j
    public final j$.time.chrono.e p() {
        return this.f17453a;
    }

    @Override // j$.time.chrono.j
    public final j$.time.chrono.b f() {
        return this.f17453a.f17578a;
    }

    @Override // j$.time.chrono.j
    public final k b() {
        return this.f17453a.f17579b;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m j(g gVar) {
        return C(i.F(gVar, this.f17453a.f17579b), this.f17455c, this.f17454b);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m c(long j10, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
            int i10 = b0.f17452a[aVar.ordinal()];
            if (i10 == 1) {
                return o(j10, this.f17453a.f17579b.f17589d, this.f17455c);
            }
            if (i10 != 2) {
                return C(this.f17453a.c(j10, qVar), this.f17455c, this.f17454b);
            }
            z zVarI = z.I(aVar.f17612b.a(j10, aVar));
            return (zVarI.equals(this.f17454b) || !this.f17455c.C().f(this.f17453a).contains(zVarI)) ? this : new c0(this.f17453a, this.f17455c, zVarI);
        }
        return (c0) qVar.o(this, j10);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: D */
    public final c0 d(long j10, j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.b)) {
            return (c0) sVar.i(this, j10);
        }
        j$.time.temporal.b bVar = (j$.time.temporal.b) sVar;
        if (bVar.compareTo(j$.time.temporal.b.DAYS) >= 0 && bVar != j$.time.temporal.b.FOREVER) {
            return C(this.f17453a.d(j10, sVar), this.f17455c, this.f17454b);
        }
        i iVarD = this.f17453a.d(j10, sVar);
        z zVar = this.f17454b;
        y yVar = this.f17455c;
        Objects.requireNonNull(iVarD, "localDateTime");
        Objects.requireNonNull(zVar, "offset");
        Objects.requireNonNull(yVar, "zone");
        if (yVar.C().f(iVarD).contains(zVar)) {
            return new c0(iVarD, yVar, zVar);
        }
        iVarD.getClass();
        return o(j$.com.android.tools.r8.a.q(iVarD, zVar), iVarD.f17579b.f17589d, yVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m s(long j10, j$.time.temporal.b bVar) {
        return j10 == Long.MIN_VALUE ? d(Long.MAX_VALUE, bVar).d(1L, bVar) : d(-j10, bVar);
    }

    @Override // j$.time.temporal.n
    public final Object l(j$.time.format.b bVar) {
        if (bVar == j$.time.temporal.r.f17635f) {
            return this.f17453a.f17578a;
        }
        return j$.com.android.tools.r8.a.o(this, bVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c0) {
            c0 c0Var = (c0) obj;
            if (this.f17453a.equals(c0Var.f17453a) && this.f17454b.equals(c0Var.f17454b) && this.f17455c.equals(c0Var.f17455c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f17453a.hashCode() ^ this.f17454b.f17655a) ^ Integer.rotateLeft(this.f17455c.hashCode(), 3);
    }

    public final String toString() {
        String str = this.f17453a.toString() + this.f17454b.f17656b;
        z zVar = this.f17454b;
        y yVar = this.f17455c;
        if (zVar == yVar) {
            return str;
        }
        return str + "[" + yVar.toString() + "]";
    }

    private Object writeReplace() {
        return new t((byte) 6, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
