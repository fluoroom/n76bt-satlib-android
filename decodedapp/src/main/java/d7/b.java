package d7;

import e6.j;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import p6.d0;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends p6.n implements Serializable {
    protected b() {
    }

    protected BigInteger Z(BigDecimal bigDecimal) throws Throwable {
        try {
            e6.r.a().b(bigDecimal.scale());
        } catch (g6.b e10) {
            i7.n.d(e10);
        }
        return bigDecimal.toBigInteger();
    }

    @Override // e6.w
    public j.b b() {
        return null;
    }

    @Override // p6.o
    public abstract void d(e6.g gVar, d0 d0Var);

    @Override // p6.n
    public String toString() {
        return k.b(this);
    }
}
