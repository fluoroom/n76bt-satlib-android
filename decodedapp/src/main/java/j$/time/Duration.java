package j$.time;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class Duration implements Comparable<Duration>, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Duration f17441c = new Duration(0, 0);
    private static final long serialVersionUID = 3078945930695997490L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17443b;

    @Override // java.lang.Comparable
    public final int compareTo(Duration duration) {
        Duration duration2 = duration;
        int iCompare = Long.compare(this.f17442a, duration2.f17442a);
        return iCompare != 0 ? iCompare : this.f17443b - duration2.f17443b;
    }

    static {
        BigInteger.valueOf(1000000000L);
    }

    public static Duration j(long j10) {
        long j11 = j10 / 1000000000;
        int i10 = (int) (j10 % 1000000000);
        if (i10 < 0) {
            i10 = (int) (((long) i10) + 1000000000);
            j11--;
        }
        return i(j11, i10);
    }

    public static Duration i(long j10, int i10) {
        if ((((long) i10) | j10) == 0) {
            return f17441c;
        }
        return new Duration(j10, i10);
    }

    public Duration(long j10, int i10) {
        this.f17442a = j10;
        this.f17443b = i10;
    }

    public boolean isNegative() {
        return this.f17442a < 0;
    }

    public long toNanos() {
        long j10 = this.f17442a;
        long j11 = this.f17443b;
        if (j10 < 0) {
            j10++;
            j11 -= 1000000000;
        }
        return j$.com.android.tools.r8.a.t(j$.com.android.tools.r8.a.y(j10, 1000000000L), j11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Duration) {
            Duration duration = (Duration) obj;
            if (this.f17442a == duration.f17442a && this.f17443b == duration.f17443b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f17442a;
        return (this.f17443b * 51) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        if (this == f17441c) {
            return "PT0S";
        }
        long j10 = this.f17442a;
        if (j10 < 0 && this.f17443b > 0) {
            j10++;
        }
        long j11 = j10 / 3600;
        int i10 = (int) ((j10 % 3600) / 60);
        int i11 = (int) (j10 % 60);
        StringBuilder sb2 = new StringBuilder(24);
        sb2.append("PT");
        if (j11 != 0) {
            sb2.append(j11);
            sb2.append('H');
        }
        if (i10 != 0) {
            sb2.append(i10);
            sb2.append('M');
        }
        if (i11 == 0 && this.f17443b == 0 && sb2.length() > 2) {
            return sb2.toString();
        }
        if (this.f17442a < 0 && this.f17443b > 0 && i11 == 0) {
            sb2.append("-0");
        } else {
            sb2.append(i11);
        }
        if (this.f17443b > 0) {
            int length = sb2.length();
            if (this.f17442a < 0) {
                sb2.append(2000000000 - ((long) this.f17443b));
            } else {
                sb2.append(((long) this.f17443b) + 1000000000);
            }
            while (sb2.charAt(sb2.length() - 1) == '0') {
                sb2.setLength(sb2.length() - 1);
            }
            sb2.setCharAt(length, '.');
        }
        sb2.append('S');
        return sb2.toString();
    }

    private Object writeReplace() {
        return new t((byte) 1, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
