package j$.time.temporal;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class u implements Serializable {
    private static final long serialVersionUID = -7317881728594519368L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f17638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f17639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f17640d;

    public static u e(long j10, long j11) {
        if (j10 > j11) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        return new u(j10, j10, j11, j11);
    }

    public static u f(long j10, long j11) {
        if (j10 > j11) {
            throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
        }
        if (1 > j11) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        return new u(1L, 1L, j10, j11);
    }

    public u(long j10, long j11, long j12, long j13) {
        this.f17637a = j10;
        this.f17638b = j11;
        this.f17639c = j12;
        this.f17640d = j13;
    }

    public final int a(long j10, q qVar) {
        if (this.f17637a < -2147483648L || this.f17640d > 2147483647L || !d(j10)) {
            throw new j$.time.b(c(j10, qVar));
        }
        return (int) j10;
    }

    public final boolean d(long j10) {
        return j10 >= this.f17637a && j10 <= this.f17640d;
    }

    public final void b(long j10, q qVar) {
        if (!d(j10)) {
            throw new j$.time.b(c(j10, qVar));
        }
    }

    public final String c(long j10, q qVar) {
        if (qVar != null) {
            return "Invalid value for " + qVar + " (valid values " + this + "): " + j10;
        }
        return "Invalid value (valid values " + this + "): " + j10;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        long j10 = this.f17637a;
        long j11 = this.f17638b;
        if (j10 > j11) {
            throw new InvalidObjectException("Smallest minimum value must be less than largest minimum value");
        }
        long j12 = this.f17639c;
        long j13 = this.f17640d;
        if (j12 > j13) {
            throw new InvalidObjectException("Smallest maximum value must be less than largest maximum value");
        }
        if (j11 > j13) {
            throw new InvalidObjectException("Minimum value must be less than maximum value");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (this.f17637a == uVar.f17637a && this.f17638b == uVar.f17638b && this.f17639c == uVar.f17639c && this.f17640d == uVar.f17640d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f17637a;
        long j11 = this.f17638b;
        long j12 = j10 + (j11 << 16) + (j11 >> 48);
        long j13 = this.f17639c;
        long j14 = j12 + (j13 << 32) + (j13 >> 32);
        long j15 = this.f17640d;
        long j16 = j14 + (j15 << 48) + (j15 >> 16);
        return (int) (j16 ^ (j16 >>> 32));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f17637a);
        if (this.f17637a != this.f17638b) {
            sb2.append('/');
            sb2.append(this.f17638b);
        }
        sb2.append(" - ");
        sb2.append(this.f17639c);
        if (this.f17639c != this.f17640d) {
            sb2.append('/');
            sb2.append(this.f17640d);
        }
        return sb2.toString();
    }
}
