package f6;

import e6.f;
import e6.g;
import e6.l;
import e6.n;
import e6.p;
import java.math.BigDecimal;
import l6.e;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends g {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected static final int f12810s = (g.b.WRITE_NUMBERS_AS_STRINGS.f() | g.b.ESCAPE_NON_ASCII.f()) | g.b.STRICT_DUPLICATE_DETECTION.f();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected n f12811e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected int f12812f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected boolean f12813g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected e f12814h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected boolean f12815r;

    protected a(int i10, n nVar) {
        this.f12812f = i10;
        this.f12811e = nVar;
        this.f12814h = e.s(g.b.STRICT_DUPLICATE_DETECTION.e(i10) ? l6.a.e(this) : null);
        this.f12813g = g.b.WRITE_NUMBERS_AS_STRINGS.e(i10);
    }

    @Override // e6.g
    public g G(int i10, int i11) {
        int i12 = this.f12812f;
        int i13 = (i10 & i11) | ((~i11) & i12);
        int i14 = i12 ^ i13;
        if (i14 != 0) {
            this.f12812f = i13;
            m1(i13, i14);
        }
        return this;
    }

    @Override // e6.g
    public void H(Object obj) {
        e eVar = this.f12814h;
        if (eVar != null) {
            eVar.k(obj);
        }
    }

    @Override // e6.g
    public void U0(p pVar) {
        n1("write raw value");
        R0(pVar);
    }

    @Override // e6.g
    public void V0(String str) {
        n1("write raw value");
        S0(str);
    }

    @Override // e6.g, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f12815r = true;
    }

    protected String j1(BigDecimal bigDecimal) throws f {
        if (!g.b.WRITE_BIGDECIMAL_AS_PLAIN.e(this.f12812f)) {
            return bigDecimal.toString();
        }
        int iScale = bigDecimal.scale();
        if (iScale < -9999 || iScale > 9999) {
            a(String.format("Attempt to write plain `java.math.BigDecimal` (see JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN) with illegal scale (%d): needs to be between [-%d, %d]", Integer.valueOf(iScale), 9999, 9999));
        }
        return bigDecimal.toPlainString();
    }

    protected void k1(byte[] bArr, int i10, int i11) {
        if (bArr == null) {
            a("Invalid `byte[]` argument: `null`");
        }
        int length = bArr.length;
        int i12 = i10 + i11;
        if (((length - i12) | i10 | i11 | i12) < 0) {
            a(String.format("Invalid 'offset' (%d) and/or 'len' (%d) arguments for `byte[]` of length %d", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(length)));
        }
    }

    protected void l1(char[] cArr, int i10, int i11) {
        if (cArr == null) {
            a("Invalid `char[]` argument: `null`");
        }
        int length = cArr.length;
        int i12 = i10 + i11;
        if (((length - i12) | i10 | i11 | i12) < 0) {
            a(String.format("Invalid 'offset' (%d) and/or 'len' (%d) arguments for `char[]` of length %d", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(length)));
        }
    }

    protected void m1(int i10, int i11) {
        if ((f12810s & i11) == 0) {
            return;
        }
        this.f12813g = g.b.WRITE_NUMBERS_AS_STRINGS.e(i10);
        g.b bVar = g.b.ESCAPE_NON_ASCII;
        if (bVar.e(i11)) {
            if (bVar.e(i10)) {
                S(127);
            } else {
                S(0);
            }
        }
        g.b bVar2 = g.b.STRICT_DUPLICATE_DETECTION;
        if (bVar2.e(i11)) {
            if (!bVar2.e(i10)) {
                this.f12814h = this.f12814h.x(null);
            } else if (this.f12814h.t() == null) {
                this.f12814h = this.f12814h.x(l6.a.e(this));
            }
        }
    }

    protected abstract void n1(String str);

    @Override // e6.g
    public g r(g.b bVar) {
        int iF = bVar.f();
        this.f12812f &= ~iF;
        if ((iF & f12810s) != 0) {
            if (bVar == g.b.WRITE_NUMBERS_AS_STRINGS) {
                this.f12813g = false;
                return this;
            }
            if (bVar == g.b.ESCAPE_NON_ASCII) {
                S(0);
                return this;
            }
            if (bVar == g.b.STRICT_DUPLICATE_DETECTION) {
                this.f12814h = this.f12814h.x(null);
            }
        }
        return this;
    }

    @Override // e6.g
    public l s() {
        return this.f12814h;
    }

    @Override // e6.g
    public final boolean w(g.b bVar) {
        return (bVar.f() & this.f12812f) != 0;
    }
}
