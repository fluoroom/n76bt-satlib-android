package j$.time;

import com.facebook.stetho.websocket.CloseCodes;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class v implements j$.time.temporal.m, j$.time.temporal.o, Comparable, Serializable {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f17643b = 0;
    private static final long serialVersionUID = -23038383694477807L;

    /* JADX INFO: renamed from: a */
    public final int f17644a;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f17644a - ((v) obj).f17644a;
    }

    static {
        j$.time.format.o oVar = new j$.time.format.o();
        oVar.h(j$.time.temporal.a.YEAR, 4, 10, j$.time.format.v.EXCEEDS_PAD);
        oVar.l(Locale.getDefault(), j$.time.format.u.SMART, null);
    }

    public static v C(int i10) {
        j$.time.temporal.a.YEAR.s(i10);
        return new v(i10);
    }

    public v(int i10) {
        this.f17644a = i10;
    }

    @Override // j$.time.temporal.n
    public final boolean e(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? qVar == j$.time.temporal.a.YEAR || qVar == j$.time.temporal.a.YEAR_OF_ERA || qVar == j$.time.temporal.a.ERA : qVar != null && qVar.i(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.u k(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.YEAR_OF_ERA) {
            return j$.time.temporal.u.e(1L, this.f17644a <= 0 ? 1000000000L : 999999999L);
        }
        return j$.time.temporal.r.d(this, qVar);
    }

    @Override // j$.time.temporal.n
    public final int i(j$.time.temporal.q qVar) {
        return k(qVar).a(w(qVar), qVar);
    }

    @Override // j$.time.temporal.n
    public final long w(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.l(this);
        }
        int i10 = u.f17641a[((j$.time.temporal.a) qVar).ordinal()];
        if (i10 == 1) {
            int i11 = this.f17644a;
            if (i11 < 1) {
                i11 = 1 - i11;
            }
            return i11;
        }
        if (i10 == 2) {
            return this.f17644a;
        }
        if (i10 == 3) {
            return this.f17644a < 1 ? 0 : 1;
        }
        throw new j$.time.temporal.t(c.a("Unsupported field: ", qVar));
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: F */
    public final v c(long j10, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (v) qVar.o(this, j10);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        aVar.s(j10);
        int i10 = u.f17641a[aVar.ordinal()];
        if (i10 == 1) {
            if (this.f17644a < 1) {
                j10 = 1 - j10;
            }
            return C((int) j10);
        }
        if (i10 == 2) {
            return C((int) j10);
        }
        if (i10 == 3) {
            return w(j$.time.temporal.a.ERA) == j10 ? this : C(1 - this.f17644a);
        }
        throw new j$.time.temporal.t(c.a("Unsupported field: ", qVar));
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: D */
    public final v d(long j10, j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.b)) {
            return (v) sVar.i(this, j10);
        }
        int i10 = u.f17642b[((j$.time.temporal.b) sVar).ordinal()];
        if (i10 == 1) {
            return E(j10);
        }
        if (i10 == 2) {
            return E(j$.com.android.tools.r8.a.y(j10, 10));
        }
        if (i10 == 3) {
            return E(j$.com.android.tools.r8.a.y(j10, 100));
        }
        if (i10 == 4) {
            return E(j$.com.android.tools.r8.a.y(j10, CloseCodes.NORMAL_CLOSURE));
        }
        if (i10 == 5) {
            j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
            return c(j$.com.android.tools.r8.a.t(w(aVar), j10), aVar);
        }
        throw new j$.time.temporal.t("Unsupported unit: " + sVar);
    }

    public final v E(long j10) {
        if (j10 == 0) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return C(aVar.f17612b.a(((long) this.f17644a) + j10, aVar));
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m s(long j10, j$.time.temporal.b bVar) {
        return j10 == Long.MIN_VALUE ? d(Long.MAX_VALUE, bVar).d(1L, bVar) : d(-j10, bVar);
    }

    @Override // j$.time.temporal.n
    public final Object l(j$.time.format.b bVar) {
        if (bVar == j$.time.temporal.r.f17631b) {
            return j$.time.chrono.t.f17501c;
        }
        if (bVar == j$.time.temporal.r.f17632c) {
            return j$.time.temporal.b.YEARS;
        }
        return j$.time.temporal.r.c(this, bVar);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m o(j$.time.temporal.m mVar) {
        if (!j$.com.android.tools.r8.a.s(mVar).equals(j$.time.chrono.t.f17501c)) {
            throw new b("Adjustment only supported on ISO date-time");
        }
        return mVar.c(this.f17644a, j$.time.temporal.a.YEAR);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && this.f17644a == ((v) obj).f17644a;
    }

    public final int hashCode() {
        return this.f17644a;
    }

    public final String toString() {
        return Integer.toString(this.f17644a);
    }

    private Object writeReplace() {
        return new t((byte) 11, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m j(g gVar) {
        return (v) j$.com.android.tools.r8.a.a(gVar, this);
    }
}
