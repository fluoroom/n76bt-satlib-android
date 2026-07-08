package g7;

import d6.k;
import e6.g;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public class v extends h0 implements e7.i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v f13643d = new v(Number.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final boolean f13644c;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f13645a;

        static {
            int[] iArr = new int[k.c.values().length];
            f13645a = iArr;
            try {
                iArr[k.c.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    static final class b extends n0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final b f13646c = new b();

        public b() {
            super(BigDecimal.class);
        }

        @Override // g7.n0, p6.p
        public boolean d(p6.d0 d0Var, Object obj) {
            return false;
        }

        @Override // g7.n0, g7.i0, p6.p
        public void f(Object obj, e6.g gVar, p6.d0 d0Var) throws p6.m {
            String string;
            if (gVar.w(g.b.WRITE_BIGDECIMAL_AS_PLAIN)) {
                BigDecimal bigDecimal = (BigDecimal) obj;
                if (!z(gVar, bigDecimal)) {
                    d0Var.E0(String.format("Attempt to write plain `java.math.BigDecimal` (see JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN) with illegal scale (%d): needs to be between [-%d, %d]", Integer.valueOf(bigDecimal.scale()), 9999, 9999), new Object[0]);
                }
                string = bigDecimal.toPlainString();
            } else {
                string = obj.toString();
            }
            gVar.d1(string);
        }

        @Override // g7.n0
        public String x(Object obj) {
            throw new IllegalStateException();
        }

        protected boolean z(e6.g gVar, BigDecimal bigDecimal) {
            int iScale = bigDecimal.scale();
            return iScale >= -9999 && iScale <= 9999;
        }
    }

    public v(Class cls) {
        super(cls, false);
        this.f13644c = cls == BigInteger.class;
    }

    public static p6.p x() {
        return b.f13646c;
    }

    @Override // e7.i
    public p6.p a(p6.d0 d0Var, p6.d dVar) {
        k.d dVarQ = q(d0Var, dVar, c());
        return (dVarQ == null || a.f13645a[dVarQ.i().ordinal()] != 1) ? this : c() == BigDecimal.class ? x() : m0.f13613c;
    }

    @Override // g7.i0, p6.p
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void f(Number number, e6.g gVar, p6.d0 d0Var) {
        if (number instanceof BigDecimal) {
            gVar.K0((BigDecimal) number);
            return;
        }
        if (number instanceof BigInteger) {
            gVar.L0((BigInteger) number);
            return;
        }
        if (number instanceof Long) {
            gVar.I0(number.longValue());
            return;
        }
        if (number instanceof Double) {
            gVar.F0(number.doubleValue());
            return;
        }
        if (number instanceof Float) {
            gVar.G0(number.floatValue());
        } else if ((number instanceof Integer) || (number instanceof Byte) || (number instanceof Short)) {
            gVar.H0(number.intValue());
        } else {
            gVar.J0(number.toString());
        }
    }
}
