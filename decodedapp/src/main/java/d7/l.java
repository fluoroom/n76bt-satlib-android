package d7;

import i7.x;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public class l implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f10835b = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f10836a;

    public l(boolean z10) {
        this.f10836a = z10;
    }

    public a a() {
        return new a(this);
    }

    public d b(byte[] bArr) {
        return d.a0(bArr);
    }

    public e c(boolean z10) {
        return z10 ? e.b0() : e.a0();
    }

    public p d() {
        return p.a0();
    }

    public q e(double d10) {
        return h.e0(d10);
    }

    public q f(float f10) {
        return i.e0(f10);
    }

    public q g(int i10) {
        return j.e0(i10);
    }

    public q h(long j10) {
        return n.e0(j10);
    }

    public v i(BigDecimal bigDecimal) {
        return bigDecimal == null ? d() : g.e0(bigDecimal);
    }

    public v j(BigInteger bigInteger) {
        return bigInteger == null ? d() : c.e0(bigInteger);
    }

    public r k() {
        return new r(this);
    }

    public v l(Object obj) {
        return new s(obj);
    }

    public v n(x xVar) {
        return new s(xVar);
    }

    public t o(String str) {
        return t.b0(str);
    }

    public boolean p() {
        return !this.f10836a;
    }

    protected l() {
        this(false);
    }
}
