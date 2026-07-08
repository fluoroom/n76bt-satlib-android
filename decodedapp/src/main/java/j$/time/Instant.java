package j$.time;

import com.facebook.stetho.websocket.CloseCodes;
import j$.util.Objects;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class Instant implements j$.time.temporal.m, j$.time.temporal.o, Comparable<Instant>, Serializable {

    /* JADX INFO: renamed from: c */
    public static final Instant f17444c = new Instant(0, 0);
    private static final long serialVersionUID = -665713676816604388L;

    /* JADX INFO: renamed from: a */
    public final long f17445a;

    /* JADX INFO: renamed from: b */
    public final int f17446b;

    public static Instant now() {
        a.f17447b.getClass();
        return ofEpochMilli(System.currentTimeMillis());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Instant instant) {
        Instant instant2 = instant;
        int iCompare = Long.compare(this.f17445a, instant2.f17445a);
        return iCompare != 0 ? iCompare : this.f17446b - instant2.f17446b;
    }

    static {
        ofEpochSecond(-31557014167219200L, 0L);
        ofEpochSecond(31556889864403199L, 999999999L);
    }

    public static Instant ofEpochSecond(long j10) {
        return C(j10, 0);
    }

    public static Instant ofEpochSecond(long j10, long j11) {
        return C(j$.com.android.tools.r8.a.t(j10, j$.com.android.tools.r8.a.x(j11, 1000000000L)), (int) j$.com.android.tools.r8.a.w(j11, 1000000000L));
    }

    public static Instant ofEpochMilli(long j10) {
        long j11 = CloseCodes.NORMAL_CLOSURE;
        return C(j$.com.android.tools.r8.a.x(j10, j11), ((int) j$.com.android.tools.r8.a.w(j10, j11)) * 1000000);
    }

    public static Instant C(long j10, int i10) {
        if ((((long) i10) | j10) == 0) {
            return f17444c;
        }
        if (j10 < -31557014167219200L || j10 > 31556889864403199L) {
            throw new b("Instant exceeds minimum or maximum instant");
        }
        return new Instant(j10, i10);
    }

    public Instant(long j10, int i10) {
        this.f17445a = j10;
        this.f17446b = i10;
    }

    @Override // j$.time.temporal.n
    public final boolean e(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? qVar == j$.time.temporal.a.INSTANT_SECONDS || qVar == j$.time.temporal.a.NANO_OF_SECOND || qVar == j$.time.temporal.a.MICRO_OF_SECOND || qVar == j$.time.temporal.a.MILLI_OF_SECOND : qVar != null && qVar.i(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.u k(j$.time.temporal.q qVar) {
        return j$.time.temporal.r.d(this, qVar);
    }

    @Override // j$.time.temporal.n
    public final int i(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return j$.time.temporal.r.d(this, qVar).a(qVar.l(this), qVar);
        }
        int i10 = e.f17517a[((j$.time.temporal.a) qVar).ordinal()];
        if (i10 == 1) {
            return this.f17446b;
        }
        if (i10 == 2) {
            return this.f17446b / CloseCodes.NORMAL_CLOSURE;
        }
        if (i10 == 3) {
            return this.f17446b / 1000000;
        }
        if (i10 == 4) {
            j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
            aVar.f17612b.a(this.f17445a, aVar);
        }
        throw new j$.time.temporal.t(c.a("Unsupported field: ", qVar));
    }

    @Override // j$.time.temporal.n
    public final long w(j$.time.temporal.q qVar) {
        int i10;
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.l(this);
        }
        int i11 = e.f17517a[((j$.time.temporal.a) qVar).ordinal()];
        if (i11 == 1) {
            i10 = this.f17446b;
        } else if (i11 == 2) {
            i10 = this.f17446b / CloseCodes.NORMAL_CLOSURE;
        } else {
            if (i11 != 3) {
                if (i11 == 4) {
                    return this.f17445a;
                }
                throw new j$.time.temporal.t(c.a("Unsupported field: ", qVar));
            }
            i10 = this.f17446b / 1000000;
        }
        return i10;
    }

    public long getEpochSecond() {
        return this.f17445a;
    }

    public int getNano() {
        return this.f17446b;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m c(long j10, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (Instant) qVar.o(this, j10);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        aVar.s(j10);
        int i10 = e.f17517a[aVar.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                int i11 = ((int) j10) * CloseCodes.NORMAL_CLOSURE;
                if (i11 != this.f17446b) {
                    return C(this.f17445a, i11);
                }
            } else if (i10 == 3) {
                int i12 = ((int) j10) * 1000000;
                if (i12 != this.f17446b) {
                    return C(this.f17445a, i12);
                }
            } else {
                if (i10 != 4) {
                    throw new j$.time.temporal.t(c.a("Unsupported field: ", qVar));
                }
                if (j10 != this.f17445a) {
                    return C(j10, this.f17446b);
                }
            }
        } else if (j10 != this.f17446b) {
            return C(this.f17445a, (int) j10);
        }
        return this;
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: E */
    public final Instant d(long j10, j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.b)) {
            return (Instant) sVar.i(this, j10);
        }
        switch (e.f17518b[((j$.time.temporal.b) sVar).ordinal()]) {
            case 1:
                return D(0L, j10);
            case 2:
                return D(j10 / 1000000, (j10 % 1000000) * 1000);
            case 3:
                return D(j10 / 1000, (j10 % 1000) * 1000000);
            case 4:
                return D(j10, 0L);
            case 5:
                return D(j$.com.android.tools.r8.a.y(j10, 60), 0L);
            case 6:
                return D(j$.com.android.tools.r8.a.y(j10, 3600), 0L);
            case 7:
                return D(j$.com.android.tools.r8.a.y(j10, 43200), 0L);
            case 8:
                return D(j$.com.android.tools.r8.a.y(j10, 86400), 0L);
            default:
                throw new j$.time.temporal.t("Unsupported unit: " + sVar);
        }
    }

    public final Instant D(long j10, long j11) {
        if ((j10 | j11) == 0) {
            return this;
        }
        return ofEpochSecond(j$.com.android.tools.r8.a.t(j$.com.android.tools.r8.a.t(this.f17445a, j10), j11 / 1000000000), ((long) this.f17446b) + (j11 % 1000000000));
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m s(long j10, j$.time.temporal.b bVar) {
        return j10 == Long.MIN_VALUE ? d(Long.MAX_VALUE, bVar).d(1L, bVar) : d(-j10, bVar);
    }

    @Override // j$.time.temporal.n
    public final Object l(j$.time.format.b bVar) {
        if (bVar == j$.time.temporal.r.f17632c) {
            return j$.time.temporal.b.NANOS;
        }
        if (bVar == j$.time.temporal.r.f17631b || bVar == j$.time.temporal.r.f17630a || bVar == j$.time.temporal.r.f17634e || bVar == j$.time.temporal.r.f17633d || bVar == j$.time.temporal.r.f17635f || bVar == j$.time.temporal.r.f17636g) {
            return null;
        }
        return bVar.a(this);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m o(j$.time.temporal.m mVar) {
        return mVar.c(this.f17445a, j$.time.temporal.a.INSTANT_SECONDS).c(this.f17446b, j$.time.temporal.a.NANO_OF_SECOND);
    }

    public long toEpochMilli() {
        long j10 = this.f17445a;
        return (j10 >= 0 || this.f17446b <= 0) ? j$.com.android.tools.r8.a.t(j$.com.android.tools.r8.a.y(j10, CloseCodes.NORMAL_CLOSURE), this.f17446b / 1000000) : j$.com.android.tools.r8.a.t(j$.com.android.tools.r8.a.y(j10 + 1, CloseCodes.NORMAL_CLOSURE), (this.f17446b / 1000000) - CloseCodes.NORMAL_CLOSURE);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Instant) {
            Instant instant = (Instant) obj;
            if (this.f17445a == instant.f17445a && this.f17446b == instant.f17446b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f17445a;
        return (this.f17446b * 51) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        j$.time.format.a aVar = j$.time.format.a.f17521e;
        StringBuilder sb2 = new StringBuilder(32);
        j$.time.format.f fVar = aVar.f17522a;
        Objects.requireNonNull(this, "temporal");
        Objects.requireNonNull(sb2, "appendable");
        try {
            fVar.i(new j$.time.format.q(this, aVar), sb2);
            return sb2.toString();
        } catch (IOException e10) {
            throw new b(e10.getMessage(), e10);
        }
    }

    private Object writeReplace() {
        return new t((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m j(g gVar) {
        return (Instant) j$.com.android.tools.r8.a.a(gVar, this);
    }
}
