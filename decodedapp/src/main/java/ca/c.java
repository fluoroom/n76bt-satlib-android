package ca;

import com.google.gson.e;
import com.google.gson.u;
import j$.util.Objects;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public class c implements Closeable, Flushable {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final Pattern f4522u = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String[] f4523v = new String[128];

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String[] f4524w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Writer f4525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f4526b = new int[32];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f4527c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private e f4528d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f4529e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f4530f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f4531g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private u f4532h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f4533r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f4534s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f4535t;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f4523v[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f4523v;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f4524w = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        X(6);
        this.f4532h = u.LEGACY_STRICT;
        this.f4535t = true;
        Objects.requireNonNull(writer, "out == null");
        this.f4525a = writer;
        p0(e.f8627d);
    }

    private void D0() throws IOException {
        if (this.f4534s != null) {
            c();
            w0(this.f4534s);
            this.f4534s = null;
        }
    }

    private void H() throws IOException {
        if (this.f4531g) {
            return;
        }
        this.f4525a.write(this.f4528d.b());
        int i10 = this.f4527c;
        for (int i11 = 1; i11 < i10; i11++) {
            this.f4525a.write(this.f4528d.a());
        }
    }

    private c T(int i10, char c10) throws IOException {
        e();
        X(i10);
        this.f4525a.write(c10);
        return this;
    }

    private int W() {
        int i10 = this.f4527c;
        if (i10 != 0) {
            return this.f4526b[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private void X(int i10) {
        int i11 = this.f4527c;
        int[] iArr = this.f4526b;
        if (i11 == iArr.length) {
            this.f4526b = Arrays.copyOf(iArr, i11 * 2);
        }
        int[] iArr2 = this.f4526b;
        int i12 = this.f4527c;
        this.f4527c = i12 + 1;
        iArr2[i12] = i10;
    }

    private static boolean a(Class cls) {
        return cls == Integer.class || cls == Long.class || cls == Byte.class || cls == Short.class || cls == BigDecimal.class || cls == BigInteger.class || cls == AtomicInteger.class || cls == AtomicLong.class;
    }

    private void c() throws IOException {
        int iW = W();
        if (iW == 5) {
            this.f4525a.write(this.f4530f);
        } else if (iW != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        H();
        h0(4);
    }

    private void e() throws IOException {
        int iW = W();
        if (iW == 1) {
            h0(2);
            H();
            return;
        }
        if (iW == 2) {
            this.f4525a.append((CharSequence) this.f4530f);
            H();
        } else {
            if (iW == 4) {
                this.f4525a.append((CharSequence) this.f4529e);
                h0(5);
                return;
            }
            if (iW != 6) {
                if (iW != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (this.f4532h != u.LENIENT) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            h0(7);
        }
    }

    private void h0(int i10) {
        this.f4526b[this.f4527c - 1] = i10;
    }

    private c n(int i10, int i11, char c10) throws IOException {
        int iW = W();
        if (iW != i11 && iW != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f4534s != null) {
            throw new IllegalStateException("Dangling name: " + this.f4534s);
        }
        this.f4527c--;
        if (iW == i11) {
            H();
        }
        this.f4525a.write(c10);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void w0(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.f4533r
            if (r0 == 0) goto L7
            java.lang.String[] r0 = ca.c.f4524w
            goto L9
        L7:
            java.lang.String[] r0 = ca.c.f4523v
        L9:
            java.io.Writer r1 = r8.f4525a
            r2 = 34
            r1.write(r2)
            int r1 = r9.length()
            r3 = 0
            r4 = 0
        L16:
            if (r3 >= r1) goto L45
            char r5 = r9.charAt(r3)
            r6 = 128(0x80, float:1.794E-43)
            if (r5 >= r6) goto L25
            r5 = r0[r5]
            if (r5 != 0) goto L32
            goto L42
        L25:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L2c
            java.lang.String r5 = "\\u2028"
            goto L32
        L2c:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L42
            java.lang.String r5 = "\\u2029"
        L32:
            if (r4 >= r3) goto L3b
            java.io.Writer r6 = r8.f4525a
            int r7 = r3 - r4
            r6.write(r9, r4, r7)
        L3b:
            java.io.Writer r4 = r8.f4525a
            r4.write(r5)
            int r4 = r3 + 1
        L42:
            int r3 = r3 + 1
            goto L16
        L45:
            if (r4 >= r1) goto L4d
            java.io.Writer r0 = r8.f4525a
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L4d:
            java.io.Writer r9 = r8.f4525a
            r9.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ca.c.w0(java.lang.String):void");
    }

    public c A0(Number number) throws IOException {
        if (number == null) {
            return S();
        }
        D0();
        String string = number.toString();
        Class<?> cls = number.getClass();
        if (!a(cls)) {
            if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
                if (this.f4532h != u.LENIENT) {
                    throw new IllegalArgumentException("Numeric values must be finite, but was " + string);
                }
            } else if (cls != Float.class && cls != Double.class && !f4522u.matcher(string).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + string);
            }
        }
        e();
        this.f4525a.append((CharSequence) string);
        return this;
    }

    public c B0(String str) throws IOException {
        if (str == null) {
            return S();
        }
        D0();
        e();
        w0(str);
        return this;
    }

    public c C0(boolean z10) throws IOException {
        D0();
        e();
        this.f4525a.write(z10 ? "true" : "false");
        return this;
    }

    public c G(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f4534s != null) {
            throw new IllegalStateException("Already wrote a name, expecting a value.");
        }
        int iW = W();
        if (iW != 3 && iW != 5) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.f4534s = str;
        return this;
    }

    public c S() throws IOException {
        if (this.f4534s != null) {
            if (!this.f4535t) {
                this.f4534s = null;
                return this;
            }
            D0();
        }
        e();
        this.f4525a.write("null");
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f4525a.close();
        int i10 = this.f4527c;
        if (i10 > 1 || (i10 == 1 && this.f4526b[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f4527c = 0;
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.f4527c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f4525a.flush();
    }

    public c k() throws IOException {
        D0();
        return T(1, '[');
    }

    public c l() throws IOException {
        D0();
        return T(3, '{');
    }

    public final void p0(e eVar) {
        Objects.requireNonNull(eVar);
        this.f4528d = eVar;
        this.f4530f = ",";
        if (eVar.c()) {
            this.f4529e = ": ";
            if (this.f4528d.b().isEmpty()) {
                this.f4530f = ", ";
            }
        } else {
            this.f4529e = ":";
        }
        this.f4531g = this.f4528d.b().isEmpty() && this.f4528d.a().isEmpty();
    }

    public c q() {
        return n(1, 2, ']');
    }

    public c r() {
        return n(3, 5, '}');
    }

    public final boolean s() {
        return this.f4535t;
    }

    public final void t0(boolean z10) {
        this.f4533r = z10;
    }

    public final void u0(boolean z10) {
        this.f4535t = z10;
    }

    public final u v() {
        return this.f4532h;
    }

    public final void v0(u uVar) {
        Objects.requireNonNull(uVar);
        this.f4532h = uVar;
    }

    public final boolean w() {
        return this.f4533r;
    }

    public boolean x() {
        return this.f4532h == u.LENIENT;
    }

    public c x0(double d10) throws IOException {
        D0();
        if (this.f4532h == u.LENIENT || !(Double.isNaN(d10) || Double.isInfinite(d10))) {
            e();
            this.f4525a.append((CharSequence) Double.toString(d10));
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + d10);
    }

    public c y0(long j10) throws IOException {
        D0();
        e();
        this.f4525a.write(Long.toString(j10));
        return this;
    }

    public c z0(Boolean bool) throws IOException {
        if (bool == null) {
            return S();
        }
        D0();
        e();
        this.f4525a.write(bool.booleanValue() ? "true" : "false");
        return this;
    }
}
