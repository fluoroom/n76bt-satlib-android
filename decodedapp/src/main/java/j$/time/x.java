package j$.time;

import com.facebook.stetho.websocket.CloseCodes;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class x implements j$.time.temporal.m, j$.time.temporal.o, Comparable, Serializable {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f17647c = 0;
    private static final long serialVersionUID = 4183400860270640070L;

    /* JADX INFO: renamed from: a */
    public final int f17648a;

    /* JADX INFO: renamed from: b */
    public final int f17649b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        x xVar = (x) obj;
        int i10 = this.f17648a - xVar.f17648a;
        return i10 == 0 ? this.f17649b - xVar.f17649b : i10;
    }

    static {
        j$.time.format.o oVar = new j$.time.format.o();
        oVar.h(j$.time.temporal.a.YEAR, 4, 10, j$.time.format.v.EXCEEDS_PAD);
        oVar.c('-');
        oVar.g(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        oVar.l(Locale.getDefault(), j$.time.format.u.SMART, null);
    }

    public x(int i10, int i11) {
        this.f17648a = i10;
        this.f17649b = i11;
    }

    public final x G(int i10, int i11) {
        return (this.f17648a == i10 && this.f17649b == i11) ? this : new x(i10, i11);
    }

    @Override // j$.time.temporal.n
    public final boolean e(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? qVar == j$.time.temporal.a.YEAR || qVar == j$.time.temporal.a.MONTH_OF_YEAR || qVar == j$.time.temporal.a.PROLEPTIC_MONTH || qVar == j$.time.temporal.a.YEAR_OF_ERA || qVar == j$.time.temporal.a.ERA : qVar != null && qVar.i(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.u k(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.YEAR_OF_ERA) {
            return j$.time.temporal.u.e(1L, this.f17648a <= 0 ? 1000000000L : 999999999L);
        }
        return j$.time.temporal.r.d(this, qVar);
    }

    @Override // j$.time.temporal.n
    public final int i(j$.time.temporal.q qVar) {
        return k(qVar).a(w(qVar), qVar);
    }

    @Override // j$.time.temporal.n
    public final long w(j$.time.temporal.q qVar) {
        int i10;
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.l(this);
        }
        int i11 = w.f17645a[((j$.time.temporal.a) qVar).ordinal()];
        if (i11 == 1) {
            i10 = this.f17649b;
        } else {
            if (i11 == 2) {
                return C();
            }
            if (i11 == 3) {
                int i12 = this.f17648a;
                if (i12 < 1) {
                    i12 = 1 - i12;
                }
                return i12;
            }
            if (i11 != 4) {
                if (i11 == 5) {
                    return this.f17648a < 1 ? 0 : 1;
                }
                throw new j$.time.temporal.t(c.a("Unsupported field: ", qVar));
            }
            i10 = this.f17648a;
        }
        return i10;
    }

    public final long C() {
        return ((((long) this.f17648a) * 12) + ((long) this.f17649b)) - 1;
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: H */
    public final x c(long j10, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (x) qVar.o(this, j10);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        aVar.s(j10);
        int i10 = w.f17645a[aVar.ordinal()];
        if (i10 == 1) {
            int i11 = (int) j10;
            j$.time.temporal.a.MONTH_OF_YEAR.s(i11);
            return G(this.f17648a, i11);
        }
        if (i10 == 2) {
            return E(j10 - C());
        }
        if (i10 == 3) {
            if (this.f17648a < 1) {
                j10 = 1 - j10;
            }
            int i12 = (int) j10;
            j$.time.temporal.a.YEAR.s(i12);
            return G(i12, this.f17649b);
        }
        if (i10 == 4) {
            int i13 = (int) j10;
            j$.time.temporal.a.YEAR.s(i13);
            return G(i13, this.f17649b);
        }
        if (i10 != 5) {
            throw new j$.time.temporal.t(c.a("Unsupported field: ", qVar));
        }
        if (w(j$.time.temporal.a.ERA) == j10) {
            return this;
        }
        int i14 = 1 - this.f17648a;
        j$.time.temporal.a.YEAR.s(i14);
        return G(i14, this.f17649b);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: D */
    public final x d(long j10, j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.b)) {
            return (x) sVar.i(this, j10);
        }
        switch (w.f17646b[((j$.time.temporal.b) sVar).ordinal()]) {
            case 1:
                return E(j10);
            case 2:
                return F(j10);
            case 3:
                return F(j$.com.android.tools.r8.a.y(j10, 10));
            case 4:
                return F(j$.com.android.tools.r8.a.y(j10, 100));
            case 5:
                return F(j$.com.android.tools.r8.a.y(j10, CloseCodes.NORMAL_CLOSURE));
            case 6:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return c(j$.com.android.tools.r8.a.t(w(aVar), j10), aVar);
            default:
                throw new j$.time.temporal.t("Unsupported unit: " + sVar);
        }
    }

    public final x F(long j10) {
        if (j10 == 0) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return G(aVar.f17612b.a(((long) this.f17648a) + j10, aVar), this.f17649b);
    }

    public final x E(long j10) {
        if (j10 == 0) {
            return this;
        }
        long j11 = (((long) this.f17648a) * 12) + ((long) (this.f17649b - 1)) + j10;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        long j12 = 12;
        return G(aVar.f17612b.a(j$.com.android.tools.r8.a.x(j11, j12), aVar), ((int) j$.com.android.tools.r8.a.w(j11, j12)) + 1);
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
            return j$.time.temporal.b.MONTHS;
        }
        return j$.time.temporal.r.c(this, bVar);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m o(j$.time.temporal.m mVar) {
        if (!j$.com.android.tools.r8.a.s(mVar).equals(j$.time.chrono.t.f17501c)) {
            throw new b("Adjustment only supported on ISO date-time");
        }
        return mVar.c(C(), j$.time.temporal.a.PROLEPTIC_MONTH);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x) {
            x xVar = (x) obj;
            if (this.f17648a == xVar.f17648a && this.f17649b == xVar.f17649b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f17648a ^ (this.f17649b << 27);
    }

    public final String toString() {
        int iAbs = Math.abs(this.f17648a);
        StringBuilder sb2 = new StringBuilder(9);
        if (iAbs < 1000) {
            int i10 = this.f17648a;
            if (i10 < 0) {
                sb2.append(i10 - 10000);
                sb2.deleteCharAt(1);
            } else {
                sb2.append(i10 + 10000);
                sb2.deleteCharAt(0);
            }
        } else {
            sb2.append(this.f17648a);
        }
        sb2.append(this.f17649b < 10 ? "-0" : "-");
        sb2.append(this.f17649b);
        return sb2.toString();
    }

    private Object writeReplace() {
        return new t((byte) 12, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m j(g gVar) {
        return (x) j$.com.android.tools.r8.a.a(gVar, this);
    }
}
