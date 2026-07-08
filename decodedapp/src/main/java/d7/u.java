package d7;

import d7.o;
import e6.j;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public class u extends f6.d {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected e6.n f10863x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    protected o f10864y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected boolean f10865z;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f10866a;

        static {
            int[] iArr = new int[e6.m.values().length];
            f10866a = iArr;
            try {
                iArr[e6.m.START_OBJECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10866a[e6.m.START_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10866a[e6.m.END_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10866a[e6.m.END_ARRAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10866a[e6.m.FIELD_NAME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10866a[e6.m.VALUE_STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10866a[e6.m.VALUE_NUMBER_INT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f10866a[e6.m.VALUE_NUMBER_FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f10866a[e6.m.VALUE_EMBEDDED_OBJECT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public u(p6.n nVar, e6.n nVar2) {
        super(0);
        this.f10863x = nVar2;
        this.f10864y = new o.c(nVar, null);
    }

    @Override // e6.j
    public o6.i A0() {
        return e6.j.f11531b;
    }

    @Override // f6.d, e6.j
    public String C0() {
        e6.m mVar = this.f12831c;
        if (mVar == null) {
            return null;
        }
        switch (a.f10866a[mVar.ordinal()]) {
            case 5:
                return this.f10864y.b();
            case 6:
                return L1().Y();
            case 7:
            case 8:
                return String.valueOf(L1().S());
            case 9:
                p6.n nVarL1 = L1();
                if (nVarL1 != null && nVarL1.K()) {
                    return nVarL1.i();
                }
                break;
        }
        return this.f12831c.d();
    }

    @Override // e6.j
    public char[] D0() {
        return C0().toCharArray();
    }

    @Override // e6.j
    public int E0() {
        return C0().length();
    }

    @Override // e6.j
    public int F0() {
        return 0;
    }

    @Override // e6.j
    public e6.n G() {
        return this.f10863x;
    }

    @Override // e6.j
    public e6.h G0() {
        return e6.h.f11524g;
    }

    @Override // e6.j
    public e6.h H() {
        return e6.h.f11524g;
    }

    protected p6.n L1() {
        o oVar;
        if (this.f10865z || (oVar = this.f10864y) == null) {
            return null;
        }
        return oVar.m();
    }

    @Override // e6.j
    public boolean M0() {
        return false;
    }

    protected p6.n M1() throws e6.i {
        p6.n nVarL1 = L1();
        if (nVarL1 != null && nVarL1.O()) {
            return nVarL1;
        }
        throw a("Current token (" + (nVarL1 == null ? null : nVarL1.c()) + ") not numeric, cannot use numeric value accessors");
    }

    @Override // f6.d, e6.j
    public String S() {
        o oVarN = this.f10864y;
        e6.m mVar = this.f12831c;
        if (mVar == e6.m.START_OBJECT || mVar == e6.m.START_ARRAY) {
            oVarN = oVarN.n();
        }
        if (oVarN == null) {
            return null;
        }
        return oVarN.b();
    }

    @Override // e6.j
    public boolean U0() {
        if (this.f10865z) {
            return false;
        }
        p6.n nVarL1 = L1();
        if (nVarL1 instanceof q) {
            return ((q) nVarL1).c0();
        }
        return false;
    }

    @Override // e6.j
    public BigDecimal W() {
        return M1().q();
    }

    @Override // e6.j
    public double X() {
        return M1().s();
    }

    @Override // f6.d, e6.j
    public e6.m X0() {
        e6.m mVarO = this.f10864y.o();
        this.f12831c = mVarO;
        if (mVarO == null) {
            this.f10865z = true;
            return null;
        }
        int i10 = a.f10866a[mVarO.ordinal()];
        if (i10 == 1) {
            this.f10864y = this.f10864y.q();
        } else if (i10 == 2) {
            this.f10864y = this.f10864y.p();
        } else if (i10 == 3 || i10 == 4) {
            this.f10864y = this.f10864y.n();
        }
        return this.f12831c;
    }

    @Override // e6.j
    public int a1(e6.a aVar, OutputStream outputStream) throws IOException {
        byte[] bArrV = v(aVar);
        if (bArrV == null) {
            return 0;
        }
        outputStream.write(bArrV, 0, bArrV.length);
        return bArrV.length;
    }

    @Override // e6.j, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f10865z) {
            return;
        }
        this.f10865z = true;
        this.f10864y = null;
        this.f12831c = null;
    }

    @Override // f6.d, e6.j
    public e6.j f1() {
        e6.m mVar = this.f12831c;
        if (mVar == e6.m.START_OBJECT) {
            this.f10864y = this.f10864y.n();
            this.f12831c = e6.m.END_OBJECT;
            return this;
        }
        if (mVar == e6.m.START_ARRAY) {
            this.f10864y = this.f10864y.n();
            this.f12831c = e6.m.END_ARRAY;
        }
        return this;
    }

    @Override // e6.j
    public Object h0() {
        p6.n nVarL1;
        if (this.f10865z || (nVarL1 = L1()) == null) {
            return null;
        }
        if (nVarL1.Q()) {
            return ((s) nVarL1).b0();
        }
        if (nVarL1.K()) {
            return ((d) nVarL1).o();
        }
        return null;
    }

    @Override // f6.d
    protected void k1() {
        y1();
    }

    @Override // e6.j
    public float p0() {
        return (float) M1().s();
    }

    @Override // e6.j
    public BigInteger r() {
        return M1().l();
    }

    @Override // e6.j
    public int t0() {
        q qVar = (q) M1();
        if (!qVar.a0()) {
            F1();
        }
        return qVar.b0();
    }

    @Override // e6.j
    public long u0() {
        q qVar = (q) M1();
        if (!qVar.p()) {
            I1();
        }
        return qVar.d0();
    }

    @Override // e6.j
    public byte[] v(e6.a aVar) {
        p6.n nVarL1 = L1();
        if (nVarL1 != null) {
            return nVarL1 instanceof t ? ((t) nVarL1).a0(aVar) : nVarL1.o();
        }
        return null;
    }

    @Override // e6.j
    public j.b v0() throws e6.i {
        p6.n nVarM1 = M1();
        if (nVarM1 == null) {
            return null;
        }
        return nVarM1.b();
    }

    @Override // e6.j
    public Number w0() {
        return M1().S();
    }

    @Override // e6.j
    public e6.l z0() {
        return this.f10864y;
    }
}
