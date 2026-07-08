package j$.time;

import com.facebook.stetho.websocket.CloseCodes;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements j$.time.temporal.m, j$.time.temporal.o, j$.time.chrono.b, Serializable {

    /* JADX INFO: renamed from: d */
    public static final g f17570d = K(-999999999, 1, 1);

    /* JADX INFO: renamed from: e */
    public static final g f17571e = K(999999999, 12, 31);
    private static final long serialVersionUID = 2942565459149668126L;

    /* JADX INFO: renamed from: a */
    public final int f17572a;

    /* JADX INFO: renamed from: b */
    public final short f17573b;

    /* JADX INFO: renamed from: c */
    public final short f17574c;

    static {
        K(1970, 1, 1);
    }

    public static g K(int i10, int i11, int i12) {
        j$.time.temporal.a.YEAR.s(i10);
        j$.time.temporal.a.MONTH_OF_YEAR.s(i11);
        j$.time.temporal.a.DAY_OF_MONTH.s(i12);
        return D(i10, i11, i12);
    }

    public static g L(long j10) {
        long j11;
        j$.time.temporal.a.EPOCH_DAY.s(j10);
        long j12 = 719468 + j10;
        if (j12 < 0) {
            long j13 = ((j10 + 719469) / 146097) - 1;
            j11 = j13 * 400;
            j12 += (-j13) * 146097;
        } else {
            j11 = 0;
        }
        long j14 = ((j12 * 400) + 591) / 146097;
        long j15 = j12 - ((j14 / 400) + (((j14 / 4) + (j14 * 365)) - (j14 / 100)));
        if (j15 < 0) {
            j14--;
            j15 = j12 - ((j14 / 400) + (((j14 / 4) + (365 * j14)) - (j14 / 100)));
        }
        int i10 = (int) j15;
        int i11 = ((i10 * 5) + 2) / 153;
        int i12 = ((i11 + 2) % 12) + 1;
        int i13 = (i10 - (((i11 * 306) + 5) / 10)) + 1;
        long j16 = j14 + j11 + ((long) (i11 / 10));
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return new g(aVar.f17612b.a(j16, aVar), i12, i13);
    }

    public static g E(j$.time.temporal.n nVar) {
        Objects.requireNonNull(nVar, "temporal");
        g gVar = (g) nVar.l(j$.time.temporal.r.f17635f);
        if (gVar != null) {
            return gVar;
        }
        throw new b("Unable to obtain LocalDate from TemporalAccessor: " + nVar + " of type " + nVar.getClass().getName());
    }

    public static g D(int i10, int i11, int i12) {
        int i13 = 28;
        if (i12 > 28) {
            if (i11 != 2) {
                i13 = (i11 == 4 || i11 == 6 || i11 == 9 || i11 == 11) ? 30 : 31;
            } else {
                j$.time.chrono.t.f17501c.getClass();
                if (j$.time.chrono.t.j(i10)) {
                    i13 = 29;
                }
            }
            if (i12 > i13) {
                if (i12 == 29) {
                    throw new b("Invalid date 'February 29' as '" + i10 + "' is not a leap year");
                }
                throw new b("Invalid date '" + m.F(i11).name() + " " + i12 + "'");
            }
        }
        return new g(i10, i11, i12);
    }

    public static g Q(int i10, int i11, int i12) {
        if (i11 == 2) {
            j$.time.chrono.t.f17501c.getClass();
            i12 = Math.min(i12, j$.time.chrono.t.j((long) i10) ? 29 : 28);
        } else if (i11 == 4 || i11 == 6 || i11 == 9 || i11 == 11) {
            i12 = Math.min(i12, 30);
        }
        return new g(i10, i11, i12);
    }

    public g(int i10, int i11, int i12) {
        this.f17572a = i10;
        this.f17573b = (short) i11;
        this.f17574c = (short) i12;
    }

    @Override // j$.time.temporal.n
    public final boolean e(j$.time.temporal.q qVar) {
        return j$.com.android.tools.r8.a.k(this, qVar);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.u k(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.j(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        if (!aVar.isDateBased()) {
            throw new j$.time.temporal.t(c.a("Unsupported field: ", qVar));
        }
        int i10 = f.f17519a[aVar.ordinal()];
        if (i10 == 1) {
            return j$.time.temporal.u.e(1L, J());
        }
        if (i10 == 2) {
            return j$.time.temporal.u.e(1L, I() ? 366 : 365);
        }
        if (i10 != 3) {
            return i10 != 4 ? aVar.f17612b : this.f17572a <= 0 ? j$.time.temporal.u.e(1L, 1000000000L) : j$.time.temporal.u.e(1L, 999999999L);
        }
        return j$.time.temporal.u.e(1L, (m.F(this.f17573b) != m.FEBRUARY || I()) ? 5L : 4L);
    }

    @Override // j$.time.temporal.n
    public final int i(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return F(qVar);
        }
        return j$.time.temporal.r.a(this, qVar);
    }

    @Override // j$.time.temporal.n
    public final long w(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            if (qVar == j$.time.temporal.a.EPOCH_DAY) {
                return x();
            }
            if (qVar != j$.time.temporal.a.PROLEPTIC_MONTH) {
                return F(qVar);
            }
            return ((((long) this.f17572a) * 12) + ((long) this.f17573b)) - 1;
        }
        return qVar.l(this);
    }

    public final int F(j$.time.temporal.q qVar) {
        switch (f.f17519a[((j$.time.temporal.a) qVar).ordinal()]) {
            case 1:
                return this.f17574c;
            case 2:
                return H();
            case 3:
                return ((this.f17574c - 1) / 7) + 1;
            case 4:
                int i10 = this.f17572a;
                return i10 >= 1 ? i10 : 1 - i10;
            case 5:
                return G().getValue();
            case 6:
                return ((this.f17574c - 1) % 7) + 1;
            case 7:
                return ((H() - 1) % 7) + 1;
            case 8:
                throw new j$.time.temporal.t("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((H() - 1) / 7) + 1;
            case 10:
                return this.f17573b;
            case 11:
                throw new j$.time.temporal.t("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return this.f17572a;
            case 13:
                return this.f17572a >= 1 ? 1 : 0;
            default:
                throw new j$.time.temporal.t(c.a("Unsupported field: ", qVar));
        }
    }

    @Override // j$.time.chrono.b
    public final j$.time.chrono.m a() {
        return j$.time.chrono.t.f17501c;
    }

    public final int H() {
        return (m.F(this.f17573b).C(I()) + this.f17574c) - 1;
    }

    public final d G() {
        return d.C(((int) j$.com.android.tools.r8.a.w(x() + 3, 7)) + 1);
    }

    public final boolean I() {
        j$.time.chrono.t tVar = j$.time.chrono.t.f17501c;
        long j10 = this.f17572a;
        tVar.getClass();
        return j$.time.chrono.t.j(j10);
    }

    public final int J() {
        short s10 = this.f17573b;
        return s10 != 2 ? (s10 == 4 || s10 == 6 || s10 == 9 || s10 == 11) ? 30 : 31 : I() ? 29 : 28;
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: S */
    public final g j(j$.time.temporal.o oVar) {
        if (oVar instanceof g) {
            return (g) oVar;
        }
        return (g) oVar.o(this);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: R */
    public final g c(long j10, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (g) qVar.o(this, j10);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        aVar.s(j10);
        switch (f.f17519a[aVar.ordinal()]) {
            case 1:
                int i10 = (int) j10;
                if (this.f17574c != i10) {
                    return K(this.f17572a, this.f17573b, i10);
                }
                return this;
            case 2:
                return T((int) j10);
            case 3:
                return N(j$.com.android.tools.r8.a.y(j10 - w(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH), 7));
            case 4:
                if (this.f17572a < 1) {
                    j10 = 1 - j10;
                }
                return U((int) j10);
            case 5:
                return N(j10 - ((long) G().getValue()));
            case 6:
                return N(j10 - w(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return N(j10 - w(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return L(j10);
            case 9:
                return N(j$.com.android.tools.r8.a.y(j10 - w(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR), 7));
            case 10:
                int i11 = (int) j10;
                if (this.f17573b != i11) {
                    j$.time.temporal.a.MONTH_OF_YEAR.s(i11);
                    return Q(this.f17572a, i11, this.f17574c);
                }
                return this;
            case 11:
                return O(j10 - (((((long) this.f17572a) * 12) + ((long) this.f17573b)) - 1));
            case 12:
                return U((int) j10);
            case 13:
                if (w(j$.time.temporal.a.ERA) != j10) {
                    return U(1 - this.f17572a);
                }
                return this;
            default:
                throw new j$.time.temporal.t(c.a("Unsupported field: ", qVar));
        }
    }

    public final g U(int i10) {
        if (this.f17572a == i10) {
            return this;
        }
        j$.time.temporal.a.YEAR.s(i10);
        return Q(i10, this.f17573b, this.f17574c);
    }

    public final g T(int i10) {
        if (H() == i10) {
            return this;
        }
        int i11 = this.f17572a;
        long j10 = i11;
        j$.time.temporal.a.YEAR.s(j10);
        j$.time.temporal.a.DAY_OF_YEAR.s(i10);
        j$.time.chrono.t.f17501c.getClass();
        boolean zJ = j$.time.chrono.t.j(j10);
        if (i10 == 366 && !zJ) {
            throw new b("Invalid date 'DayOfYear 366' as '" + i11 + "' is not a leap year");
        }
        m mVarF = m.F(((i10 - 1) / 31) + 1);
        if (i10 > (mVarF.D(zJ) + mVarF.C(zJ)) - 1) {
            mVarF = m.f17591a[((((int) 1) + 12) + mVarF.ordinal()) % 12];
        }
        return new g(i11, mVarF.getValue(), (i10 - mVarF.C(zJ)) + 1);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: M */
    public final g d(long j10, j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.b)) {
            return (g) sVar.i(this, j10);
        }
        switch (f.f17520b[((j$.time.temporal.b) sVar).ordinal()]) {
            case 1:
                return N(j10);
            case 2:
                return N(j$.com.android.tools.r8.a.y(j10, 7));
            case 3:
                return O(j10);
            case 4:
                return P(j10);
            case 5:
                return P(j$.com.android.tools.r8.a.y(j10, 10));
            case 6:
                return P(j$.com.android.tools.r8.a.y(j10, 100));
            case 7:
                return P(j$.com.android.tools.r8.a.y(j10, CloseCodes.NORMAL_CLOSURE));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return c(j$.com.android.tools.r8.a.t(w(aVar), j10), aVar);
            default:
                throw new j$.time.temporal.t("Unsupported unit: " + sVar);
        }
    }

    public final g P(long j10) {
        if (j10 == 0) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return Q(aVar.f17612b.a(((long) this.f17572a) + j10, aVar), this.f17573b, this.f17574c);
    }

    public final g O(long j10) {
        if (j10 == 0) {
            return this;
        }
        long j11 = (((long) this.f17572a) * 12) + ((long) (this.f17573b - 1)) + j10;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        long j12 = 12;
        return Q(aVar.f17612b.a(j$.com.android.tools.r8.a.x(j11, j12), aVar), ((int) j$.com.android.tools.r8.a.w(j11, j12)) + 1, this.f17574c);
    }

    public final g N(long j10) {
        if (j10 == 0) {
            return this;
        }
        long j11 = ((long) this.f17574c) + j10;
        if (j11 > 0) {
            if (j11 <= 28) {
                return new g(this.f17572a, this.f17573b, (int) j11);
            }
            if (j11 <= 59) {
                long J = J();
                if (j11 <= J) {
                    return new g(this.f17572a, this.f17573b, (int) j11);
                }
                short s10 = this.f17573b;
                if (s10 < 12) {
                    return new g(this.f17572a, s10 + 1, (int) (j11 - J));
                }
                j$.time.temporal.a.YEAR.s(this.f17572a + 1);
                return new g(this.f17572a + 1, 1, (int) (j11 - J));
            }
        }
        return L(j$.com.android.tools.r8.a.t(x(), j10));
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m s(long j10, j$.time.temporal.b bVar) {
        return j10 == Long.MIN_VALUE ? d(Long.MAX_VALUE, bVar).d(1L, bVar) : d(-j10, bVar);
    }

    @Override // j$.time.temporal.n
    public final Object l(j$.time.format.b bVar) {
        return bVar == j$.time.temporal.r.f17635f ? this : j$.com.android.tools.r8.a.m(this, bVar);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m o(j$.time.temporal.m mVar) {
        return j$.com.android.tools.r8.a.a(this, mVar);
    }

    @Override // j$.time.chrono.b
    public final j$.time.chrono.e y(k kVar) {
        return i.F(this, kVar);
    }

    @Override // j$.time.chrono.b
    public final long x() {
        long j10 = this.f17572a;
        long j11 = this.f17573b;
        long j12 = 365 * j10;
        long j13 = (((367 * j11) - 362) / 12) + (j10 >= 0 ? ((j10 + 399) / 400) + (((3 + j10) / 4) - ((99 + j10) / 100)) + j12 : j12 - ((j10 / (-400)) + ((j10 / (-4)) - (j10 / (-100))))) + ((long) (this.f17574c - 1));
        if (j11 > 2) {
            j13 = !I() ? j13 - 2 : j13 - 1;
        }
        return j13 - 719528;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: A */
    public final int compareTo(j$.time.chrono.b bVar) {
        if (bVar instanceof g) {
            return C((g) bVar);
        }
        return j$.com.android.tools.r8.a.e(this, bVar);
    }

    public final int C(g gVar) {
        int i10 = this.f17572a - gVar.f17572a;
        if (i10 != 0) {
            return i10;
        }
        int i11 = this.f17573b - gVar.f17573b;
        return i11 == 0 ? this.f17574c - gVar.f17574c : i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && C((g) obj) == 0;
    }

    @Override // j$.time.chrono.b
    public final int hashCode() {
        int i10 = this.f17572a;
        return (((i10 << 11) + (this.f17573b << 6)) + this.f17574c) ^ (i10 & (-2048));
    }

    @Override // j$.time.chrono.b
    public final String toString() {
        int i10 = this.f17572a;
        short s10 = this.f17573b;
        short s11 = this.f17574c;
        int iAbs = Math.abs(i10);
        StringBuilder sb2 = new StringBuilder(10);
        if (iAbs >= 1000) {
            if (i10 > 9999) {
                sb2.append('+');
            }
            sb2.append(i10);
        } else if (i10 < 0) {
            sb2.append(i10 - 10000);
            sb2.deleteCharAt(1);
        } else {
            sb2.append(i10 + 10000);
            sb2.deleteCharAt(0);
        }
        sb2.append(s10 < 10 ? "-0" : "-");
        sb2.append((int) s10);
        sb2.append(s11 < 10 ? "-0" : "-");
        sb2.append((int) s11);
        return sb2.toString();
    }

    private Object writeReplace() {
        return new t((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
