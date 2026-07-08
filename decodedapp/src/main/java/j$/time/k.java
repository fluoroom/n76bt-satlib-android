package j$.time;

import com.facebook.stetho.websocket.CloseCodes;
import j$.util.Objects;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements j$.time.temporal.m, j$.time.temporal.o, Comparable, Serializable {

    /* JADX INFO: renamed from: e */
    public static final k f17582e;

    /* JADX INFO: renamed from: f */
    public static final k f17583f;

    /* JADX INFO: renamed from: g */
    public static final k f17584g;

    /* JADX INFO: renamed from: h */
    public static final k[] f17585h = new k[24];
    private static final long serialVersionUID = 6414437269572265201L;

    /* JADX INFO: renamed from: a */
    public final byte f17586a;

    /* JADX INFO: renamed from: b */
    public final byte f17587b;

    /* JADX INFO: renamed from: c */
    public final byte f17588c;

    /* JADX INFO: renamed from: d */
    public final int f17589d;

    static {
        int i10 = 0;
        while (true) {
            k[] kVarArr = f17585h;
            if (i10 < kVarArr.length) {
                kVarArr[i10] = new k(i10, 0, 0, 0);
                i10++;
            } else {
                k kVar = kVarArr[0];
                f17584g = kVar;
                k kVar2 = kVarArr[12];
                f17582e = kVar;
                f17583f = new k(23, 59, 59, 999999999);
                return;
            }
        }
    }

    public static k G(long j10) {
        j$.time.temporal.a.NANO_OF_DAY.s(j10);
        int i10 = (int) (j10 / 3600000000000L);
        long j11 = j10 - (((long) i10) * 3600000000000L);
        int i11 = (int) (j11 / 60000000000L);
        long j12 = j11 - (((long) i11) * 60000000000L);
        int i12 = (int) (j12 / 1000000000);
        return D(i10, i11, i12, (int) (j12 - (((long) i12) * 1000000000)));
    }

    public static k E(j$.time.temporal.n nVar) {
        Objects.requireNonNull(nVar, "temporal");
        k kVar = (k) nVar.l(j$.time.temporal.r.f17636g);
        if (kVar != null) {
            return kVar;
        }
        throw new b("Unable to obtain LocalTime from TemporalAccessor: " + nVar + " of type " + nVar.getClass().getName());
    }

    public static k D(int i10, int i11, int i12, int i13) {
        if ((i11 | i12 | i13) == 0) {
            return f17585h[i10];
        }
        return new k(i10, i11, i12, i13);
    }

    public k(int i10, int i11, int i12, int i13) {
        this.f17586a = (byte) i10;
        this.f17587b = (byte) i11;
        this.f17588c = (byte) i12;
        this.f17589d = i13;
    }

    @Override // j$.time.temporal.n
    public final boolean e(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) qVar).w();
        }
        return qVar != null && qVar.i(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.u k(j$.time.temporal.q qVar) {
        return j$.time.temporal.r.d(this, qVar);
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
            if (qVar == j$.time.temporal.a.NANO_OF_DAY) {
                return N();
            }
            if (qVar == j$.time.temporal.a.MICRO_OF_DAY) {
                return N() / 1000;
            }
            return F(qVar);
        }
        return qVar.l(this);
    }

    public final int F(j$.time.temporal.q qVar) {
        switch (j.f17580a[((j$.time.temporal.a) qVar).ordinal()]) {
            case 1:
                return this.f17589d;
            case 2:
                throw new j$.time.temporal.t("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return this.f17589d / CloseCodes.NORMAL_CLOSURE;
            case 4:
                throw new j$.time.temporal.t("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return this.f17589d / 1000000;
            case 6:
                return (int) (N() / 1000000);
            case 7:
                return this.f17588c;
            case 8:
                return O();
            case 9:
                return this.f17587b;
            case 10:
                return (this.f17586a * 60) + this.f17587b;
            case 11:
                return this.f17586a % 12;
            case 12:
                int i10 = this.f17586a % 12;
                if (i10 % 12 == 0) {
                    return 12;
                }
                return i10;
            case 13:
                return this.f17586a;
            case 14:
                byte b10 = this.f17586a;
                if (b10 == 0) {
                    return 24;
                }
                return b10;
            case 15:
                return this.f17586a / 12;
            default:
                throw new j$.time.temporal.t(c.a("Unsupported field: ", qVar));
        }
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: P */
    public final k c(long j10, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (k) qVar.o(this, j10);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        aVar.s(j10);
        switch (j.f17580a[aVar.ordinal()]) {
            case 1:
                return Q((int) j10);
            case 2:
                return G(j10);
            case 3:
                return Q(((int) j10) * CloseCodes.NORMAL_CLOSURE);
            case 4:
                return G(j10 * 1000);
            case 5:
                return Q(((int) j10) * 1000000);
            case 6:
                return G(j10 * 1000000);
            case 7:
                int i10 = (int) j10;
                if (this.f17588c != i10) {
                    j$.time.temporal.a.SECOND_OF_MINUTE.s(i10);
                    return D(this.f17586a, this.f17587b, i10, this.f17589d);
                }
                return this;
            case 8:
                return L(j10 - ((long) O()));
            case 9:
                int i11 = (int) j10;
                if (this.f17587b != i11) {
                    j$.time.temporal.a.MINUTE_OF_HOUR.s(i11);
                    return D(this.f17586a, i11, this.f17588c, this.f17589d);
                }
                return this;
            case 10:
                return J(j10 - ((long) ((this.f17586a * 60) + this.f17587b)));
            case 11:
                return I(j10 - ((long) (this.f17586a % 12)));
            case 12:
                if (j10 == 12) {
                    j10 = 0;
                }
                return I(j10 - ((long) (this.f17586a % 12)));
            case 13:
                int i12 = (int) j10;
                if (this.f17586a != i12) {
                    j$.time.temporal.a.HOUR_OF_DAY.s(i12);
                    return D(i12, this.f17587b, this.f17588c, this.f17589d);
                }
                return this;
            case 14:
                if (j10 == 24) {
                    j10 = 0;
                }
                int i13 = (int) j10;
                if (this.f17586a != i13) {
                    j$.time.temporal.a.HOUR_OF_DAY.s(i13);
                    return D(i13, this.f17587b, this.f17588c, this.f17589d);
                }
                return this;
            case 15:
                return I((j10 - ((long) (this.f17586a / 12))) * 12);
            default:
                throw new j$.time.temporal.t(c.a("Unsupported field: ", qVar));
        }
    }

    public final k Q(int i10) {
        if (this.f17589d == i10) {
            return this;
        }
        j$.time.temporal.a.NANO_OF_SECOND.s(i10);
        return D(this.f17586a, this.f17587b, this.f17588c, i10);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: H */
    public final k d(long j10, j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.b) {
            switch (j.f17581b[((j$.time.temporal.b) sVar).ordinal()]) {
                case 1:
                    return K(j10);
                case 2:
                    return K((j10 % 86400000000L) * 1000);
                case 3:
                    return K((j10 % 86400000) * 1000000);
                case 4:
                    return L(j10);
                case 5:
                    return J(j10);
                case 6:
                    return I(j10);
                case 7:
                    return I((j10 % 2) * 12);
                default:
                    throw new j$.time.temporal.t("Unsupported unit: " + sVar);
            }
        }
        return (k) sVar.i(this, j10);
    }

    public final k I(long j10) {
        return j10 == 0 ? this : D(((((int) (j10 % 24)) + this.f17586a) + 24) % 24, this.f17587b, this.f17588c, this.f17589d);
    }

    public final k J(long j10) {
        if (j10 != 0) {
            int i10 = (this.f17586a * 60) + this.f17587b;
            int i11 = ((((int) (j10 % 1440)) + i10) + 1440) % 1440;
            if (i10 != i11) {
                return D(i11 / 60, i11 % 60, this.f17588c, this.f17589d);
            }
        }
        return this;
    }

    public final k L(long j10) {
        if (j10 != 0) {
            int i10 = (this.f17587b * 60) + (this.f17586a * 3600) + this.f17588c;
            int i11 = ((((int) (j10 % 86400)) + i10) + 86400) % 86400;
            if (i10 != i11) {
                return D(i11 / 3600, (i11 / 60) % 60, i11 % 60, this.f17589d);
            }
        }
        return this;
    }

    public final k K(long j10) {
        if (j10 != 0) {
            long jN = N();
            long j11 = (((j10 % 86400000000000L) + jN) + 86400000000000L) % 86400000000000L;
            if (jN != j11) {
                return D((int) (j11 / 3600000000000L), (int) ((j11 / 60000000000L) % 60), (int) ((j11 / 1000000000) % 60), (int) (j11 % 1000000000));
            }
        }
        return this;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m s(long j10, j$.time.temporal.b bVar) {
        return j10 == Long.MIN_VALUE ? d(Long.MAX_VALUE, bVar).d(1L, bVar) : d(-j10, bVar);
    }

    @Override // j$.time.temporal.n
    public final Object l(j$.time.format.b bVar) {
        if (bVar == j$.time.temporal.r.f17631b || bVar == j$.time.temporal.r.f17630a || bVar == j$.time.temporal.r.f17634e || bVar == j$.time.temporal.r.f17633d) {
            return null;
        }
        if (bVar == j$.time.temporal.r.f17636g) {
            return this;
        }
        if (bVar == j$.time.temporal.r.f17635f) {
            return null;
        }
        if (bVar == j$.time.temporal.r.f17632c) {
            return j$.time.temporal.b.NANOS;
        }
        return bVar.a(this);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m o(j$.time.temporal.m mVar) {
        return mVar.c(N(), j$.time.temporal.a.NANO_OF_DAY);
    }

    public final int O() {
        return (this.f17587b * 60) + (this.f17586a * 3600) + this.f17588c;
    }

    public final long N() {
        return (((long) this.f17588c) * 1000000000) + (((long) this.f17587b) * 60000000000L) + (((long) this.f17586a) * 3600000000000L) + ((long) this.f17589d);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: C */
    public final int compareTo(k kVar) {
        int iCompare = Integer.compare(this.f17586a, kVar.f17586a);
        return (iCompare == 0 && (iCompare = Integer.compare(this.f17587b, kVar.f17587b)) == 0 && (iCompare = Integer.compare(this.f17588c, kVar.f17588c)) == 0) ? Integer.compare(this.f17589d, kVar.f17589d) : iCompare;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f17586a == kVar.f17586a && this.f17587b == kVar.f17587b && this.f17588c == kVar.f17588c && this.f17589d == kVar.f17589d) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m j(g gVar) {
        return (k) j$.com.android.tools.r8.a.a(gVar, this);
    }

    public final int hashCode() {
        long jN = N();
        return (int) (jN ^ (jN >>> 32));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(18);
        byte b10 = this.f17586a;
        byte b11 = this.f17587b;
        byte b12 = this.f17588c;
        int i10 = this.f17589d;
        sb2.append(b10 < 10 ? "0" : "");
        sb2.append((int) b10);
        sb2.append(b11 < 10 ? ":0" : ":");
        sb2.append((int) b11);
        if (b12 > 0 || i10 > 0) {
            sb2.append(b12 < 10 ? ":0" : ":");
            sb2.append((int) b12);
            if (i10 > 0) {
                sb2.append('.');
                if (i10 % 1000000 == 0) {
                    sb2.append(Integer.toString((i10 / 1000000) + CloseCodes.NORMAL_CLOSURE).substring(1));
                } else if (i10 % CloseCodes.NORMAL_CLOSURE == 0) {
                    sb2.append(Integer.toString((i10 / CloseCodes.NORMAL_CLOSURE) + 1000000).substring(1));
                } else {
                    sb2.append(Integer.toString(i10 + 1000000000).substring(1));
                }
            }
        }
        return sb2.toString();
    }

    private Object writeReplace() {
        return new t((byte) 4, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final void R(DataOutput dataOutput) {
        if (this.f17589d == 0) {
            if (this.f17588c == 0) {
                if (this.f17587b == 0) {
                    dataOutput.writeByte(~this.f17586a);
                    return;
                } else {
                    dataOutput.writeByte(this.f17586a);
                    dataOutput.writeByte(~this.f17587b);
                    return;
                }
            }
            dataOutput.writeByte(this.f17586a);
            dataOutput.writeByte(this.f17587b);
            dataOutput.writeByte(~this.f17588c);
            return;
        }
        dataOutput.writeByte(this.f17586a);
        dataOutput.writeByte(this.f17587b);
        dataOutput.writeByte(this.f17588c);
        dataOutput.writeInt(this.f17589d);
    }

    public static k M(DataInput dataInput) throws IOException {
        int i10;
        int i11;
        int i12 = dataInput.readByte();
        int i13 = 0;
        if (i12 >= 0) {
            byte b10 = dataInput.readByte();
            if (b10 < 0) {
                int i14 = ~b10;
                i10 = 0;
                i13 = i14;
                i11 = 0;
            } else {
                byte b11 = dataInput.readByte();
                if (b11 < 0) {
                    i11 = ~b11;
                    i13 = b10;
                } else {
                    i10 = dataInput.readInt();
                    i13 = b10;
                    i11 = b11;
                }
            }
            j$.time.temporal.a.HOUR_OF_DAY.s(i12);
            j$.time.temporal.a.MINUTE_OF_HOUR.s(i13);
            j$.time.temporal.a.SECOND_OF_MINUTE.s(i11);
            j$.time.temporal.a.NANO_OF_SECOND.s(i10);
            return D(i12, i13, i11, i10);
        }
        i12 = ~i12;
        i11 = 0;
        i10 = 0;
        j$.time.temporal.a.HOUR_OF_DAY.s(i12);
        j$.time.temporal.a.MINUTE_OF_HOUR.s(i13);
        j$.time.temporal.a.SECOND_OF_MINUTE.s(i11);
        j$.time.temporal.a.NANO_OF_SECOND.s(i10);
        return D(i12, i13, i11, i10);
    }
}
