package p6;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Iterator;
import p6.o;

/* JADX INFO: loaded from: classes.dex */
public abstract class n extends o.a implements e6.w, Iterable {
    protected n() {
    }

    public abstract n A(int i10);

    public abstract d7.m C();

    public boolean D() {
        return false;
    }

    public final boolean K() {
        return C() == d7.m.BINARY;
    }

    public boolean L() {
        return false;
    }

    public final boolean N() {
        return C() == d7.m.NULL;
    }

    public final boolean O() {
        return C() == d7.m.NUMBER;
    }

    public final boolean Q() {
        return C() == d7.m.POJO;
    }

    public final boolean R() {
        return C() == d7.m.STRING;
    }

    public Number S() {
        return null;
    }

    public String Y() {
        return null;
    }

    public long g() {
        return h(0L);
    }

    public abstract String i();

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return t();
    }

    public String j(String str) {
        String strI = i();
        return strI == null ? str : strI;
    }

    public BigInteger l() {
        return BigInteger.ZERO;
    }

    public byte[] o() {
        return null;
    }

    public boolean p() {
        return false;
    }

    public BigDecimal q() {
        return BigDecimal.ZERO;
    }

    public double s() {
        return 0.0d;
    }

    public int size() {
        return 0;
    }

    public Iterator t() {
        return i7.h.n();
    }

    public abstract String toString();

    public Iterator z() {
        return i7.h.n();
    }

    public long h(long j10) {
        return j10;
    }
}
