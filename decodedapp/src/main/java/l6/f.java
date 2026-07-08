package l6;

import e6.h;
import e6.j;
import e6.m;
import e6.n;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;
import o6.i;
import o6.p;

/* JADX INFO: loaded from: classes.dex */
public class f extends f6.c {

    /* JADX INFO: renamed from: m0 */
    private static final int f20468m0 = j.a.ALLOW_TRAILING_COMMA.f();

    /* JADX INFO: renamed from: n0 */
    private static final int f20469n0 = j.a.ALLOW_NUMERIC_LEADING_ZEROS.f();

    /* JADX INFO: renamed from: o0 */
    private static final int f20470o0 = j.a.ALLOW_NON_NUMERIC_NUMBERS.f();

    /* JADX INFO: renamed from: p0 */
    private static final int f20471p0 = j.a.ALLOW_MISSING_VALUES.f();

    /* JADX INFO: renamed from: q0 */
    private static final int f20472q0 = j.a.ALLOW_SINGLE_QUOTES.f();

    /* JADX INFO: renamed from: r0 */
    private static final int f20473r0 = j.a.ALLOW_UNQUOTED_FIELD_NAMES.f();

    /* JADX INFO: renamed from: s0 */
    private static final int f20474s0 = j.a.ALLOW_COMMENTS.f();

    /* JADX INFO: renamed from: t0 */
    private static final int f20475t0 = j.a.ALLOW_YAML_COMMENTS.f();

    /* JADX INFO: renamed from: u0 */
    protected static final int[] f20476u0 = i6.c.g();

    /* JADX INFO: renamed from: c0 */
    protected Reader f20477c0;

    /* JADX INFO: renamed from: d0 */
    protected char[] f20478d0;

    /* JADX INFO: renamed from: e0 */
    protected boolean f20479e0;

    /* JADX INFO: renamed from: f0 */
    protected n f20480f0;

    /* JADX INFO: renamed from: g0 */
    protected final m6.b f20481g0;

    /* JADX INFO: renamed from: h0 */
    protected final int f20482h0;

    /* JADX INFO: renamed from: i0 */
    protected boolean f20483i0;

    /* JADX INFO: renamed from: j0 */
    protected long f20484j0;

    /* JADX INFO: renamed from: k0 */
    protected int f20485k0;

    /* JADX INFO: renamed from: l0 */
    protected int f20486l0;

    public f(i6.f fVar, int i10, Reader reader, n nVar, m6.b bVar, char[] cArr, int i11, int i12, boolean z10) {
        super(fVar, i10);
        this.f20477c0 = reader;
        this.f20480f0 = nVar;
        this.f20478d0 = cArr;
        this.A = i11;
        this.B = i12;
        this.E = i11;
        this.C = -i11;
        this.f20481g0 = bVar;
        this.f20482h0 = bVar.m();
        this.f20479e0 = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0061 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String H2(int r5, int r6, int[] r7) {
        /*
            r4 = this;
            o6.p r0 = r4.K
            char[] r1 = r4.f20478d0
            int r2 = r4.A
            int r2 = r2 - r5
            r0.v(r1, r5, r2)
            o6.p r5 = r4.K
            char[] r5 = r5.p()
            o6.p r0 = r4.K
            int r0 = r0.q()
            int r1 = r7.length
        L17:
            int r2 = r4.A
            int r3 = r4.B
            if (r2 < r3) goto L24
            boolean r2 = r4.J2()
            if (r2 != 0) goto L24
            goto L37
        L24:
            char[] r2 = r4.f20478d0
            int r3 = r4.A
            char r2 = r2[r3]
            if (r2 >= r1) goto L31
            r3 = r7[r2]
            if (r3 == 0) goto L51
            goto L37
        L31:
            boolean r3 = java.lang.Character.isJavaIdentifierPart(r2)
            if (r3 != 0) goto L51
        L37:
            o6.p r5 = r4.K
            r5.y(r0)
            o6.p r5 = r4.K
            char[] r7 = r5.r()
            int r0 = r5.s()
            int r5 = r5.z()
            m6.b r1 = r4.f20481g0
            java.lang.String r5 = r1.l(r7, r0, r5, r6)
            return r5
        L51:
            int r3 = r4.A
            int r3 = r3 + 1
            r4.A = r3
            int r6 = r6 * 33
            int r6 = r6 + r2
            int r3 = r0 + 1
            r5[r0] = r2
            int r0 = r5.length
            if (r3 < r0) goto L69
            o6.p r5 = r4.K
            char[] r5 = r5.n()
            r0 = 0
            goto L17
        L69:
            r0 = r3
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.f.H2(int, int, int[]):java.lang.String");
    }

    private final void L2() {
        int i10;
        char c10;
        int i11 = this.A;
        if (i11 + 4 < this.B) {
            char[] cArr = this.f20478d0;
            if (cArr[i11] == 'a' && cArr[i11 + 1] == 'l' && cArr[i11 + 2] == 's' && cArr[i11 + 3] == 'e' && ((c10 = cArr[(i10 = i11 + 4)]) < '0' || c10 == ']' || c10 == '}')) {
                this.A = i10;
                return;
            }
        }
        N2("false", 1);
    }

    private final void M2() {
        int i10;
        char c10;
        int i11 = this.A;
        if (i11 + 3 < this.B) {
            char[] cArr = this.f20478d0;
            if (cArr[i11] == 'u' && cArr[i11 + 1] == 'l' && cArr[i11 + 2] == 'l' && ((c10 = cArr[(i10 = i11 + 3)]) < '0' || c10 == ']' || c10 == '}')) {
                this.A = i10;
                return;
            }
        }
        N2("null", 1);
    }

    private final void O2(String str, int i10) {
        int i11;
        char c10;
        int length = str.length();
        do {
            if ((this.A >= this.B && !J2()) || this.f20478d0[this.A] != str.charAt(i10)) {
                b3(str.substring(0, i10));
            }
            i11 = this.A + 1;
            this.A = i11;
            i10++;
        } while (i10 < length);
        if ((i11 < this.B || J2()) && (c10 = this.f20478d0[this.A]) >= '0' && c10 != ']' && c10 != '}') {
            x2(str, i10, c10);
        }
    }

    private final void P2() {
        int i10;
        char c10;
        int i11 = this.A;
        if (i11 + 3 < this.B) {
            char[] cArr = this.f20478d0;
            if (cArr[i11] == 'r' && cArr[i11 + 1] == 'u' && cArr[i11 + 2] == 'e' && ((c10 = cArr[(i10 = i11 + 3)]) < '0' || c10 == ']' || c10 == '}')) {
                this.A = i10;
                return;
            }
        }
        N2("true", 1);
    }

    private final m Q2() {
        this.M = false;
        m mVar = this.J;
        this.J = null;
        if (mVar == m.START_ARRAY) {
            p2(this.G, this.H);
        } else if (mVar == m.START_OBJECT) {
            q2(this.G, this.H);
        }
        this.f12831c = mVar;
        return mVar;
    }

    private final m R2(int i10) {
        if (i10 == 34) {
            this.f20483i0 = true;
            m mVar = m.VALUE_STRING;
            this.f12831c = mVar;
            return mVar;
        }
        if (i10 == 91) {
            p2(this.G, this.H);
            m mVar2 = m.START_ARRAY;
            this.f12831c = mVar2;
            return mVar2;
        }
        if (i10 == 102) {
            N2("false", 1);
            m mVar3 = m.VALUE_FALSE;
            this.f12831c = mVar3;
            return mVar3;
        }
        if (i10 == 110) {
            N2("null", 1);
            m mVar4 = m.VALUE_NULL;
            this.f12831c = mVar4;
            return mVar4;
        }
        if (i10 == 116) {
            N2("true", 1);
            m mVar5 = m.VALUE_TRUE;
            this.f12831c = mVar5;
            return mVar5;
        }
        if (i10 == 123) {
            q2(this.G, this.H);
            m mVar6 = m.START_OBJECT;
            this.f12831c = mVar6;
            return mVar6;
        }
        switch (i10) {
            case 44:
                if (!this.I.j() && (this.f11532a & f20471p0) != 0) {
                    this.A--;
                    m mVar7 = m.VALUE_NULL;
                    this.f12831c = mVar7;
                    return mVar7;
                }
                break;
            case 45:
                m mVarY2 = Y2(true);
                this.f12831c = mVarY2;
                return mVarY2;
            case 46:
                m mVarU2 = U2(false);
                this.f12831c = mVarU2;
                return mVarU2;
            default:
                switch (i10) {
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                        m mVarZ2 = Z2(i10);
                        this.f12831c = mVarZ2;
                        return mVarZ2;
                }
        }
        m mVarI2 = I2(i10);
        this.f12831c = mVarI2;
        return mVarI2;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r10v0 ??, r10v1 ??, r10v18 ??, r10v12 ??, r10v6 ??, r10v5 ??, r10v3 ??, r10v10 ??, r10v9 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    private final e6.m T2(
    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r10v0 ??, r10v1 ??, r10v18 ??, r10v12 ??, r10v6 ??, r10v5 ??, r10v3 ??, r10v10 ??, r10v9 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r10v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:407)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:303)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */

    private String W2(int i10, int i11, int i12) {
        this.K.v(this.f20478d0, i10, this.A - i10);
        char[] cArrP = this.K.p();
        int iQ = this.K.q();
        while (true) {
            if (this.A >= this.B && !J2()) {
                t1(" in field name", m.FIELD_NAME);
            }
            char[] cArr = this.f20478d0;
            int i13 = this.A;
            this.A = i13 + 1;
            char cQ1 = cArr[i13];
            if (cQ1 <= '\\') {
                if (cQ1 == '\\') {
                    cQ1 = Q1();
                } else if (cQ1 <= i12) {
                    if (cQ1 == i12) {
                        this.K.y(iQ);
                        p pVar = this.K;
                        return this.f20481g0.l(pVar.r(), pVar.s(), pVar.z(), i11);
                    }
                    if (cQ1 < ' ') {
                        g2(cQ1, "name");
                    }
                }
            }
            i11 = (i11 * 33) + cQ1;
            int i14 = iQ + 1;
            cArrP[iQ] = cQ1;
            if (i14 >= cArrP.length) {
                cArrP = this.K.n();
                iQ = 0;
            } else {
                iQ = i14;
            }
        }
    }

    private final m X2(boolean z10, int i10) {
        int i11;
        char cU3;
        boolean z11;
        int i12;
        char cU32;
        if (z10) {
            i10++;
        }
        this.A = i10;
        char[] cArrL = this.K.l();
        if (z10) {
            cArrL[0] = '-';
            i11 = 1;
        } else {
            i11 = 0;
        }
        int i13 = this.A;
        if (i13 < this.B) {
            char[] cArr = this.f20478d0;
            this.A = i13 + 1;
            cU3 = cArr[i13];
        } else {
            cU3 = u3("No digit following minus sign", m.VALUE_NUMBER_INT);
        }
        if (cU3 == '0') {
            cU3 = s3();
        }
        int i14 = 0;
        while (cU3 >= '0' && cU3 <= '9') {
            i14++;
            if (i11 >= cArrL.length) {
                cArrL = this.K.n();
                i11 = 0;
            }
            int i15 = i11 + 1;
            cArrL[i11] = cU3;
            if (this.A >= this.B && !J2()) {
                i11 = i15;
                cU3 = 0;
                z11 = true;
                break;
            }
            char[] cArr2 = this.f20478d0;
            int i16 = this.A;
            this.A = i16 + 1;
            cU3 = cArr2[i16];
            i11 = i15;
        }
        z11 = false;
        if (i14 == 0 && !P0(d.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.g())) {
            return E2(cU3, z10);
        }
        int i17 = -1;
        if (cU3 == '.') {
            if (i11 >= cArrL.length) {
                cArrL = this.K.n();
                i11 = 0;
            }
            cArrL[i11] = cU3;
            i11++;
            i12 = 0;
            while (true) {
                if (this.A >= this.B && !J2()) {
                    z11 = true;
                    break;
                }
                char[] cArr3 = this.f20478d0;
                int i18 = this.A;
                this.A = i18 + 1;
                cU3 = cArr3[i18];
                if (cU3 < '0' || cU3 > '9') {
                    break;
                }
                i12++;
                if (i11 >= cArrL.length) {
                    cArrL = this.K.n();
                    i11 = 0;
                }
                cArrL[i11] = cU3;
                i11++;
            }
            if (i12 == 0 && !P0(d.ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS.g())) {
                x1(cU3, "Decimal point not followed by a digit");
            }
        } else {
            i12 = -1;
        }
        if (cU3 == 'e' || cU3 == 'E') {
            if (i11 >= cArrL.length) {
                cArrL = this.K.n();
                i11 = 0;
            }
            int i19 = i11 + 1;
            cArrL[i11] = cU3;
            int i20 = this.A;
            if (i20 < this.B) {
                char[] cArr4 = this.f20478d0;
                this.A = i20 + 1;
                cU32 = cArr4[i20];
            } else {
                cU32 = u3("expected a digit for number exponent", m.VALUE_NUMBER_FLOAT);
            }
            if (cU32 == '-' || cU32 == '+') {
                if (i19 >= cArrL.length) {
                    cArrL = this.K.n();
                    i19 = 0;
                }
                int i21 = i19 + 1;
                cArrL[i19] = cU32;
                int i22 = this.A;
                if (i22 < this.B) {
                    char[] cArr5 = this.f20478d0;
                    this.A = i22 + 1;
                    cU32 = cArr5[i22];
                } else {
                    cU32 = u3("expected a digit for number exponent", m.VALUE_NUMBER_FLOAT);
                }
                i19 = i21;
            }
            cU3 = cU32;
            int i23 = 0;
            while (cU3 <= '9' && cU3 >= '0') {
                i23++;
                if (i19 >= cArrL.length) {
                    cArrL = this.K.n();
                    i19 = 0;
                }
                i11 = i19 + 1;
                cArrL[i19] = cU3;
                if (this.A >= this.B && !J2()) {
                    z11 = true;
                    break;
                }
                char[] cArr6 = this.f20478d0;
                int i24 = this.A;
                this.A = i24 + 1;
                cU3 = cArr6[i24];
                i19 = i11;
            }
            i11 = i19;
            i17 = i23;
            if (i17 == 0) {
                x1(cU3, "Exponent indicator not followed by a digit");
            }
        }
        if (!z11) {
            this.A--;
            if (this.I.j()) {
                t3(cU3);
            }
        }
        this.K.y(i11);
        return (i12 >= 0 || i17 >= 0) ? v2(z10, i14, i12, i17) : w2(z10, i14);
    }

    private final m Y2(boolean z10) {
        int i10 = this.A;
        int i11 = z10 ? i10 - 1 : i10;
        int i12 = this.B;
        if (i10 >= i12) {
            return X2(z10, i11);
        }
        int i13 = i10 + 1;
        char c10 = this.f20478d0[i10];
        int i14 = 1;
        if (c10 > '9' || c10 < '0') {
            this.A = i13;
            return c10 == '.' ? U2(z10) : F2(c10, z10, true);
        }
        if (c10 == '0') {
            return X2(z10, i11);
        }
        while (i13 < i12) {
            int i15 = i13 + 1;
            char c11 = this.f20478d0[i13];
            if (c11 < '0' || c11 > '9') {
                if (c11 == '.' || c11 == 'e' || c11 == 'E') {
                    this.A = i15;
                    return T2(c11, i11, i15, z10, i14);
                }
                this.A = i13;
                if (this.I.j()) {
                    t3(c11);
                }
                this.K.v(this.f20478d0, i11, i13 - i11);
                return w2(z10, i14);
            }
            i14++;
            i13 = i15;
        }
        return X2(z10, i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x004f, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int d3() throws e6.i {
        /*
            r3 = this;
        L0:
            int r0 = r3.A
            int r1 = r3.B
            if (r0 < r1) goto L2e
            boolean r0 = r3.J2()
            if (r0 == 0) goto Ld
            goto L2e
        Ld:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unexpected end-of-input within/between "
            r0.append(r1)
            l6.c r1 = r3.I
            java.lang.String r1 = r1.l()
            r0.append(r1)
            java.lang.String r1 = " entries"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            e6.i r0 = r3.a(r0)
            throw r0
        L2e:
            char[] r0 = r3.f20478d0
            int r1 = r3.A
            int r2 = r1 + 1
            r3.A = r2
            char r0 = r0[r1]
            r1 = 32
            if (r0 <= r1) goto L50
            r1 = 47
            if (r0 != r1) goto L44
            r3.j3()
            goto L0
        L44:
            r1 = 35
            if (r0 != r1) goto L4f
            boolean r1 = r3.o3()
            if (r1 == 0) goto L4f
            goto L0
        L4f:
            return r0
        L50:
            if (r0 >= r1) goto L0
            r1 = 10
            if (r0 != r1) goto L5f
            int r0 = r3.D
            int r0 = r0 + 1
            r3.D = r0
            r3.E = r2
            goto L0
        L5f:
            r1 = 13
            if (r0 != r1) goto L67
            r3.f3()
            goto L0
        L67:
            r1 = 9
            if (r0 == r1) goto L0
            r3.z1(r0)
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.f.d3():int");
    }

    private void e3() {
        while (true) {
            if (this.A >= this.B && !J2()) {
                break;
            }
            char[] cArr = this.f20478d0;
            int i10 = this.A;
            int i11 = i10 + 1;
            this.A = i11;
            char c10 = cArr[i10];
            if (c10 <= '*') {
                if (c10 == '*') {
                    if (i11 >= this.B && !J2()) {
                        break;
                    }
                    char[] cArr2 = this.f20478d0;
                    int i12 = this.A;
                    if (cArr2[i12] == '/') {
                        this.A = i12 + 1;
                        return;
                    }
                } else if (c10 < ' ') {
                    if (c10 == '\n') {
                        this.D++;
                        this.E = i11;
                    } else if (c10 == '\r') {
                        f3();
                    } else if (c10 != '\t') {
                        z1(c10);
                    }
                }
            }
        }
        t1(" in a comment", null);
    }

    private final int g3() {
        int i10 = this.A;
        if (i10 + 4 >= this.B) {
            return h3(false);
        }
        char[] cArr = this.f20478d0;
        char c10 = cArr[i10];
        if (c10 == ':') {
            int i11 = i10 + 1;
            this.A = i11;
            char c11 = cArr[i11];
            if (c11 > ' ') {
                if (c11 == '/' || c11 == '#') {
                    return h3(true);
                }
                this.A = i10 + 2;
                return c11;
            }
            if (c11 == ' ' || c11 == '\t') {
                int i12 = i10 + 2;
                this.A = i12;
                char c12 = cArr[i12];
                if (c12 > ' ') {
                    if (c12 == '/' || c12 == '#') {
                        return h3(true);
                    }
                    this.A = i10 + 3;
                    return c12;
                }
            }
            return h3(true);
        }
        if (c10 == ' ' || c10 == '\t') {
            int i13 = i10 + 1;
            this.A = i13;
            c10 = cArr[i13];
        }
        if (c10 != ':') {
            return h3(false);
        }
        int i14 = this.A;
        int i15 = i14 + 1;
        this.A = i15;
        char c13 = cArr[i15];
        if (c13 > ' ') {
            if (c13 == '/' || c13 == '#') {
                return h3(true);
            }
            this.A = i14 + 2;
            return c13;
        }
        if (c13 == ' ' || c13 == '\t') {
            int i16 = i14 + 2;
            this.A = i16;
            char c14 = cArr[i16];
            if (c14 > ' ') {
                if (c14 == '/' || c14 == '#') {
                    return h3(true);
                }
                this.A = i14 + 3;
                return c14;
            }
        }
        return h3(true);
    }

    private final int h3(boolean z10) {
        while (true) {
            if (this.A >= this.B && !J2()) {
                t1(" within/between " + this.I.l() + " entries", null);
                return -1;
            }
            char[] cArr = this.f20478d0;
            int i10 = this.A;
            int i11 = i10 + 1;
            this.A = i11;
            char c10 = cArr[i10];
            if (c10 > ' ') {
                if (c10 == '/') {
                    j3();
                } else if (c10 != '#' || !o3()) {
                    if (z10) {
                        return c10;
                    }
                    if (c10 != ':') {
                        w1(c10, "was expecting a colon to separate field name and value");
                    }
                    z10 = true;
                }
            } else if (c10 < ' ') {
                if (c10 == '\n') {
                    this.D++;
                    this.E = i11;
                } else if (c10 == '\r') {
                    f3();
                } else if (c10 != '\t') {
                    z1(c10);
                }
            }
        }
    }

    private final int i3(int i10) {
        if (i10 != 44) {
            w1(i10, "was expecting comma to separate " + this.I.l() + " entries");
        }
        while (true) {
            int i11 = this.A;
            if (i11 >= this.B) {
                return d3();
            }
            char[] cArr = this.f20478d0;
            int i12 = i11 + 1;
            this.A = i12;
            char c10 = cArr[i11];
            if (c10 > ' ') {
                if (c10 != '/' && c10 != '#') {
                    return c10;
                }
                this.A = i11;
                return d3();
            }
            if (c10 < ' ') {
                if (c10 == '\n') {
                    this.D++;
                    this.E = i12;
                } else if (c10 == '\r') {
                    f3();
                } else if (c10 != '\t') {
                    z1(c10);
                }
            }
        }
    }

    private void j3() {
        if ((this.f11532a & f20474s0) == 0) {
            w1(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        if (this.A >= this.B && !J2()) {
            t1(" in a comment", null);
        }
        char[] cArr = this.f20478d0;
        int i10 = this.A;
        this.A = i10 + 1;
        char c10 = cArr[i10];
        if (c10 == '/') {
            k3();
        } else if (c10 == '*') {
            e3();
        } else {
            w1(c10, "was expecting either '*' or '/' for a comment");
        }
    }

    private void k3() {
        while (true) {
            if (this.A >= this.B && !J2()) {
                return;
            }
            char[] cArr = this.f20478d0;
            int i10 = this.A;
            int i11 = i10 + 1;
            this.A = i11;
            char c10 = cArr[i10];
            if (c10 < ' ') {
                if (c10 == '\n') {
                    this.D++;
                    this.E = i11;
                    return;
                } else if (c10 == '\r') {
                    f3();
                    return;
                } else if (c10 != '\t') {
                    z1(c10);
                }
            }
        }
    }

    private final int m3() {
        if (this.A >= this.B && !J2()) {
            return R1();
        }
        char[] cArr = this.f20478d0;
        int i10 = this.A;
        int i11 = i10 + 1;
        this.A = i11;
        char c10 = cArr[i10];
        if (c10 > ' ') {
            if (c10 != '/' && c10 != '#') {
                return c10;
            }
            this.A = i10;
            return n3();
        }
        if (c10 != ' ') {
            if (c10 == '\n') {
                this.D++;
                this.E = i11;
            } else if (c10 == '\r') {
                f3();
            } else if (c10 != '\t') {
                z1(c10);
            }
        }
        while (true) {
            int i12 = this.A;
            if (i12 >= this.B) {
                return n3();
            }
            char[] cArr2 = this.f20478d0;
            int i13 = i12 + 1;
            this.A = i13;
            char c11 = cArr2[i12];
            if (c11 > ' ') {
                if (c11 != '/' && c11 != '#') {
                    return c11;
                }
                this.A = i12;
                return n3();
            }
            if (c11 != ' ') {
                if (c11 == '\n') {
                    this.D++;
                    this.E = i13;
                } else if (c11 == '\r') {
                    f3();
                } else if (c11 != '\t') {
                    z1(c11);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0032, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int n3() {
        /*
            r3 = this;
        L0:
            int r0 = r3.A
            int r1 = r3.B
            if (r0 < r1) goto L11
            boolean r0 = r3.J2()
            if (r0 != 0) goto L11
            int r0 = r3.R1()
            return r0
        L11:
            char[] r0 = r3.f20478d0
            int r1 = r3.A
            int r2 = r1 + 1
            r3.A = r2
            char r0 = r0[r1]
            r1 = 32
            if (r0 <= r1) goto L33
            r1 = 47
            if (r0 != r1) goto L27
            r3.j3()
            goto L0
        L27:
            r1 = 35
            if (r0 != r1) goto L32
            boolean r1 = r3.o3()
            if (r1 == 0) goto L32
            goto L0
        L32:
            return r0
        L33:
            if (r0 == r1) goto L0
            r1 = 10
            if (r0 != r1) goto L42
            int r0 = r3.D
            int r0 = r0 + 1
            r3.D = r0
            r3.E = r2
            goto L0
        L42:
            r1 = 13
            if (r0 != r1) goto L4a
            r3.f3()
            goto L0
        L4a:
            r1 = 9
            if (r0 == r1) goto L0
            r3.z1(r0)
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.f.n3():int");
    }

    private boolean o3() {
        if ((this.f11532a & f20475t0) == 0) {
            return false;
        }
        k3();
        return true;
    }

    private final void p3() {
        int i10 = this.A;
        this.F = this.C + ((long) i10);
        this.G = this.D;
        this.H = i10 - this.E;
    }

    private final void q3() {
        int i10 = this.A;
        this.f20484j0 = i10;
        this.f20485k0 = this.D;
        this.f20486l0 = i10 - this.E;
    }

    private char r3() {
        char c10;
        if ((this.A >= this.B && !J2()) || (c10 = this.f20478d0[this.A]) < '0' || c10 > '9') {
            return '0';
        }
        if ((this.f11532a & f20469n0) == 0) {
            E1("Leading zeroes not allowed");
        }
        this.A++;
        if (c10 != '0') {
            return c10;
        }
        do {
            if (this.A >= this.B && !J2()) {
                return c10;
            }
            char[] cArr = this.f20478d0;
            int i10 = this.A;
            c10 = cArr[i10];
            if (c10 < '0' || c10 > '9') {
                return '0';
            }
            this.A = i10 + 1;
        } while (c10 == '0');
        return c10;
    }

    private final char s3() {
        char c10;
        int i10 = this.A;
        if (i10 >= this.B || ((c10 = this.f20478d0[i10]) >= '0' && c10 <= '9')) {
            return r3();
        }
        return '0';
    }

    private final void t3(int i10) {
        int i11 = this.A;
        int i12 = i11 + 1;
        this.A = i12;
        if (i10 != 9) {
            if (i10 == 10) {
                this.D++;
                this.E = i12;
            } else if (i10 == 13) {
                this.A = i11;
            } else if (i10 != 32) {
                v1(i10);
            }
        }
    }

    private final void x2(String str, int i10, int i11) {
        if (Character.isJavaIdentifierPart((char) i11)) {
            b3(str.substring(0, i10));
        }
    }

    private void y2(int i10) {
        if (i10 == 93) {
            p3();
            if (!this.I.h()) {
                e2(i10, '}');
            }
            this.I = this.I.n();
            this.f12831c = m.END_ARRAY;
        }
        if (i10 == 125) {
            p3();
            if (!this.I.i()) {
                e2(i10, ']');
            }
            this.I = this.I.n();
            this.f12831c = m.END_OBJECT;
        }
    }

    @Override // e6.j
    public i A0() {
        return f6.c.f12816b0;
    }

    protected final void A2() {
        int i10 = this.A;
        int i11 = this.B;
        if (i10 < i11) {
            int[] iArr = f20476u0;
            int length = iArr.length;
            while (true) {
                char[] cArr = this.f20478d0;
                char c10 = cArr[i10];
                if (c10 >= length || iArr[c10] == 0) {
                    i10++;
                    if (i10 >= i11) {
                        break;
                    }
                } else if (c10 == '\"') {
                    p pVar = this.K;
                    int i12 = this.A;
                    pVar.v(cArr, i12, i10 - i12);
                    this.A = i10 + 1;
                    return;
                }
            }
        }
        p pVar2 = this.K;
        char[] cArr2 = this.f20478d0;
        int i13 = this.A;
        pVar2.u(cArr2, i13, i10 - i13);
        this.A = i10;
        B2();
    }

    protected void B2() {
        char[] cArrP = this.K.p();
        int iQ = this.K.q();
        int[] iArr = f20476u0;
        int length = iArr.length;
        while (true) {
            if (this.A >= this.B && !J2()) {
                t1(": was expecting closing quote for a string value", m.VALUE_STRING);
            }
            char[] cArr = this.f20478d0;
            int i10 = this.A;
            this.A = i10 + 1;
            char cQ1 = cArr[i10];
            if (cQ1 < length && iArr[cQ1] != 0) {
                if (cQ1 == '\"') {
                    this.K.y(iQ);
                    return;
                } else if (cQ1 == '\\') {
                    cQ1 = Q1();
                } else if (cQ1 < ' ') {
                    g2(cQ1, "string value");
                }
            }
            if (iQ >= cArrP.length) {
                cArrP = this.K.n();
                iQ = 0;
            }
            cArrP[iQ] = cQ1;
            iQ++;
        }
    }

    @Override // f6.d, e6.j
    public final String C0() {
        m mVar = this.f12831c;
        if (mVar != m.VALUE_STRING) {
            return C2(mVar);
        }
        if (this.f20483i0) {
            this.f20483i0 = false;
            A2();
        }
        return this.K.k();
    }

    protected final String C2(m mVar) {
        if (mVar == null) {
            return null;
        }
        int iE = mVar.e();
        return iE != 5 ? (iE == 6 || iE == 7 || iE == 8) ? this.K.k() : mVar.d() : this.I.b();
    }

    @Override // e6.j
    public final char[] D0() {
        m mVar = this.f12831c;
        if (mVar == null) {
            return null;
        }
        int iE = mVar.e();
        if (iE != 5) {
            if (iE != 6) {
                if (iE != 7 && iE != 8) {
                    return this.f12831c.a();
                }
            } else if (this.f20483i0) {
                this.f20483i0 = false;
                A2();
            }
            return this.K.r();
        }
        if (!this.M) {
            String strB = this.I.b();
            int length = strB.length();
            char[] cArr = this.L;
            if (cArr == null) {
                this.L = this.f12818x.f(length);
            } else if (cArr.length < length) {
                this.L = new char[length];
            }
            strB.getChars(0, length, this.L, 0);
            this.M = true;
        }
        return this.L;
    }

    @Override // f6.d
    public final String D1(String str) {
        m mVar = this.f12831c;
        if (mVar != m.VALUE_STRING) {
            return mVar == m.FIELD_NAME ? S() : super.D1(str);
        }
        if (this.f20483i0) {
            this.f20483i0 = false;
            A2();
        }
        return this.K.k();
    }

    protected m D2() {
        char[] cArrL = this.K.l();
        int iQ = this.K.q();
        while (true) {
            if (this.A >= this.B && !J2()) {
                t1(": was expecting closing quote for a string value", m.VALUE_STRING);
            }
            char[] cArr = this.f20478d0;
            int i10 = this.A;
            this.A = i10 + 1;
            char cQ1 = cArr[i10];
            if (cQ1 <= '\\') {
                if (cQ1 == '\\') {
                    cQ1 = Q1();
                } else if (cQ1 <= '\'') {
                    if (cQ1 == '\'') {
                        this.K.y(iQ);
                        return m.VALUE_STRING;
                    }
                    if (cQ1 < ' ') {
                        g2(cQ1, "string value");
                    }
                }
            }
            if (iQ >= cArrL.length) {
                cArrL = this.K.n();
                iQ = 0;
            }
            cArrL[iQ] = cQ1;
            iQ++;
        }
    }

    @Override // e6.j
    public final int E0() {
        m mVar = this.f12831c;
        if (mVar == null) {
            return 0;
        }
        int iE = mVar.e();
        if (iE == 5) {
            return this.I.b().length();
        }
        if (iE != 6) {
            if (iE != 7 && iE != 8) {
                return this.f12831c.a().length;
            }
        } else if (this.f20483i0) {
            this.f20483i0 = false;
            A2();
        }
        return this.K.z();
    }

    protected m E2(int i10, boolean z10) {
        return F2(i10, z10, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0011, code lost:
    
        if (r0 != 8) goto L33;
     */
    @Override // e6.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int F0() {
        /*
            r3 = this;
            e6.m r0 = r3.f12831c
            r1 = 0
            if (r0 == 0) goto L24
            int r0 = r0.e()
            r2 = 6
            if (r0 == r2) goto L14
            r2 = 7
            if (r0 == r2) goto L1d
            r2 = 8
            if (r0 == r2) goto L1d
            goto L24
        L14:
            boolean r0 = r3.f20483i0
            if (r0 == 0) goto L1d
            r3.f20483i0 = r1
            r3.A2()
        L1d:
            o6.p r0 = r3.K
            int r0 = r0.s()
            return r0
        L24:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.f.F0():int");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r10v0 ??, r10v1 ??, r10v5 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    protected e6.m F2(
    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r10v0 ??, r10v1 ??, r10v5 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r10v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:407)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:303)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */

    @Override // e6.j
    public n G() {
        return this.f20480f0;
    }

    @Override // e6.j
    public h G0() {
        if (this.f12831c != m.FIELD_NAME) {
            return new h(N1(), -1L, this.F - 1, this.G, this.H);
        }
        return new h(N1(), -1L, this.C + (this.f20484j0 - 1), this.f20485k0, this.f20486l0);
    }

    protected String G2(int i10) {
        if (i10 == 39 && (this.f11532a & f20472q0) != 0) {
            return S2();
        }
        if ((this.f11532a & f20473r0) == 0) {
            w1(i10, "was expecting double-quote to start field name");
        }
        int[] iArrH = i6.c.h();
        int length = iArrH.length;
        if (!(i10 < length ? iArrH[i10] == 0 : Character.isJavaIdentifierPart((char) i10))) {
            w1(i10, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        int i11 = this.A;
        int i12 = this.f20482h0;
        int i13 = this.B;
        if (i11 < i13) {
            do {
                char[] cArr = this.f20478d0;
                char c10 = cArr[i11];
                if (c10 < length) {
                    if (iArrH[c10] != 0) {
                        int i14 = this.A - 1;
                        this.A = i11;
                        return this.f20481g0.l(cArr, i14, i11 - i14, i12);
                    }
                } else if (!Character.isJavaIdentifierPart(c10)) {
                    int i15 = this.A - 1;
                    this.A = i11;
                    return this.f20481g0.l(this.f20478d0, i15, i11 - i15, i12);
                }
                i12 = (i12 * 33) + c10;
                i11++;
            } while (i11 < i13);
        }
        int i16 = this.A - 1;
        this.A = i11;
        return H2(i16, i12, iArrH);
    }

    @Override // e6.j
    public h H() {
        int i10 = (this.A - this.E) + 1;
        return new h(N1(), -1L, ((long) this.A) + this.C, this.D, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected e6.m I2(int r4) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.f.I2(int):e6.m");
    }

    protected boolean J2() throws IOException {
        Reader reader = this.f20477c0;
        if (reader != null) {
            char[] cArr = this.f20478d0;
            int i10 = reader.read(cArr, 0, cArr.length);
            if (i10 > 0) {
                int i11 = this.B;
                long j10 = i11;
                this.C += j10;
                this.E -= i11;
                this.f20484j0 -= j10;
                this.A = 0;
                this.B = i10;
                return true;
            }
            M1();
            if (i10 == 0) {
                throw new IOException("Reader returned 0 characters when trying to read " + this.B);
            }
        }
        return false;
    }

    @Override // f6.d, e6.j
    public final String K0() {
        m mVar = this.f12831c;
        if (mVar != m.VALUE_STRING) {
            return mVar == m.FIELD_NAME ? S() : super.D1(null);
        }
        if (this.f20483i0) {
            this.f20483i0 = false;
            A2();
        }
        return this.K.k();
    }

    protected void K2() {
        if (J2()) {
            return;
        }
        s1();
    }

    @Override // f6.c
    protected void M1() throws IOException {
        if (this.f20477c0 != null) {
            if (this.f12818x.k() || P0(j.a.AUTO_CLOSE_SOURCE)) {
                this.f20477c0.close();
            }
            this.f20477c0 = null;
        }
    }

    protected final void N2(String str, int i10) {
        int i11;
        int length = str.length();
        if (this.A + length >= this.B) {
            O2(str, i10);
            return;
        }
        do {
            if (this.f20478d0[this.A] != str.charAt(i10)) {
                b3(str.substring(0, i10));
            }
            i11 = this.A + 1;
            this.A = i11;
            i10++;
        } while (i10 < length);
        char c10 = this.f20478d0[i11];
        if (c10 < '0' || c10 == ']' || c10 == '}') {
            return;
        }
        x2(str, i10, c10);
    }

    @Override // f6.c
    protected char Q1() {
        if (this.A >= this.B && !J2()) {
            t1(" in character escape sequence", m.VALUE_STRING);
        }
        char[] cArr = this.f20478d0;
        int i10 = this.A;
        this.A = i10 + 1;
        char c10 = cArr[i10];
        if (c10 == '\"' || c10 == '/' || c10 == '\\') {
            return c10;
        }
        if (c10 == 'b') {
            return '\b';
        }
        if (c10 == 'f') {
            return '\f';
        }
        if (c10 == 'n') {
            return '\n';
        }
        if (c10 == 'r') {
            return '\r';
        }
        if (c10 == 't') {
            return '\t';
        }
        if (c10 != 'u') {
            return Y1(c10);
        }
        int i11 = 0;
        for (int i12 = 0; i12 < 4; i12++) {
            if (this.A >= this.B && !J2()) {
                t1(" in character escape sequence", m.VALUE_STRING);
            }
            char[] cArr2 = this.f20478d0;
            int i13 = this.A;
            this.A = i13 + 1;
            char c11 = cArr2[i13];
            int iB = i6.c.b(c11);
            if (iB < 0) {
                w1(c11, "expected a hex-digit for character escape sequence");
            }
            i11 = (i11 << 4) | iB;
        }
        return (char) i11;
    }

    protected String S2() {
        int i10 = this.A;
        int i11 = this.f20482h0;
        int i12 = this.B;
        if (i10 < i12) {
            int[] iArr = f20476u0;
            int length = iArr.length;
            do {
                char[] cArr = this.f20478d0;
                char c10 = cArr[i10];
                if (c10 != '\'') {
                    if (c10 < length && iArr[c10] != 0) {
                        break;
                    }
                    i11 = (i11 * 33) + c10;
                    i10++;
                } else {
                    int i13 = this.A;
                    this.A = i10 + 1;
                    return this.f20481g0.l(cArr, i13, i10 - i13, i11);
                }
            } while (i10 < i12);
        }
        int i14 = this.A;
        this.A = i10;
        return W2(i14, i11, 39);
    }

    protected final m U2(boolean z10) {
        if (!P0(d.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.g())) {
            return I2(46);
        }
        int i10 = this.A;
        int i11 = i10 - 1;
        if (z10) {
            i11 = i10 - 2;
        }
        return T2(46, i11, i10, z10, 0);
    }

    @Override // e6.j
    public String V0() throws e6.i {
        m mVarY2;
        this.P = 0;
        m mVar = this.f12831c;
        m mVar2 = m.FIELD_NAME;
        if (mVar == mVar2) {
            Q2();
            return null;
        }
        if (this.f20483i0) {
            l3();
        }
        int iM3 = m3();
        if (iM3 < 0) {
            close();
            this.f12831c = null;
            return null;
        }
        this.O = null;
        if (iM3 == 93 || iM3 == 125) {
            y2(iM3);
            return null;
        }
        if (this.I.r()) {
            iM3 = i3(iM3);
            if ((this.f11532a & f20468m0) != 0 && (iM3 == 93 || iM3 == 125)) {
                y2(iM3);
                return null;
            }
        }
        if (!this.I.i()) {
            p3();
            R2(iM3);
            return null;
        }
        q3();
        String strV2 = iM3 == 34 ? V2() : G2(iM3);
        this.I.v(strV2);
        this.f12831c = mVar2;
        int iG3 = g3();
        p3();
        if (iG3 == 34) {
            this.f20483i0 = true;
            this.J = m.VALUE_STRING;
            return strV2;
        }
        if (iG3 == 43) {
            mVarY2 = P0(d.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.g()) ? Y2(false) : I2(iG3);
        } else if (iG3 == 91) {
            mVarY2 = m.START_ARRAY;
        } else if (iG3 == 102) {
            L2();
            mVarY2 = m.VALUE_FALSE;
        } else if (iG3 == 110) {
            M2();
            mVarY2 = m.VALUE_NULL;
        } else if (iG3 == 116) {
            P2();
            mVarY2 = m.VALUE_TRUE;
        } else if (iG3 == 123) {
            mVarY2 = m.START_OBJECT;
        } else if (iG3 == 45) {
            mVarY2 = Y2(true);
        } else if (iG3 != 46) {
            switch (iG3) {
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                    mVarY2 = Z2(iG3);
                    break;
                default:
                    mVarY2 = I2(iG3);
                    break;
            }
        } else {
            mVarY2 = U2(false);
        }
        this.J = mVarY2;
        return strV2;
    }

    protected final String V2() {
        int i10 = this.A;
        int i11 = this.f20482h0;
        int[] iArr = f20476u0;
        while (true) {
            if (i10 >= this.B) {
                break;
            }
            char[] cArr = this.f20478d0;
            char c10 = cArr[i10];
            if (c10 >= iArr.length || iArr[c10] == 0) {
                i11 = (i11 * 33) + c10;
                i10++;
            } else if (c10 == '\"') {
                int i12 = this.A;
                this.A = i10 + 1;
                return this.f20481g0.l(cArr, i12, i10 - i12, i11);
            }
        }
        int i13 = this.A;
        this.A = i10;
        return W2(i13, i11, 34);
    }

    @Override // e6.j
    public final String W0() {
        if (this.f12831c != m.FIELD_NAME) {
            if (X0() == m.VALUE_STRING) {
                return C0();
            }
            return null;
        }
        this.M = false;
        m mVar = this.J;
        this.J = null;
        this.f12831c = mVar;
        if (mVar == m.VALUE_STRING) {
            if (this.f20483i0) {
                this.f20483i0 = false;
                A2();
            }
            return this.K.k();
        }
        if (mVar == m.START_ARRAY) {
            p2(this.G, this.H);
        } else if (mVar == m.START_OBJECT) {
            q2(this.G, this.H);
        }
        return null;
    }

    @Override // f6.d, e6.j
    public final m X0() throws e6.i {
        m mVarY2;
        m mVar = this.f12831c;
        m mVar2 = m.FIELD_NAME;
        if (mVar == mVar2) {
            return Q2();
        }
        this.P = 0;
        if (this.f20483i0) {
            l3();
        }
        int iM3 = m3();
        if (iM3 < 0) {
            close();
            this.f12831c = null;
            return null;
        }
        this.O = null;
        if (iM3 == 93 || iM3 == 125) {
            y2(iM3);
            return this.f12831c;
        }
        if (this.I.r()) {
            iM3 = i3(iM3);
            if ((this.f11532a & f20468m0) != 0 && (iM3 == 93 || iM3 == 125)) {
                y2(iM3);
                return this.f12831c;
            }
        }
        boolean zI = this.I.i();
        if (zI) {
            q3();
            this.I.v(iM3 == 34 ? V2() : G2(iM3));
            this.f12831c = mVar2;
            iM3 = g3();
        }
        p3();
        if (iM3 == 34) {
            this.f20483i0 = true;
            mVarY2 = m.VALUE_STRING;
        } else if (iM3 == 43) {
            mVarY2 = P0(d.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.g()) ? Y2(false) : I2(iM3);
        } else if (iM3 == 91) {
            if (!zI) {
                p2(this.G, this.H);
            }
            mVarY2 = m.START_ARRAY;
        } else if (iM3 == 102) {
            L2();
            mVarY2 = m.VALUE_FALSE;
        } else if (iM3 == 110) {
            M2();
            mVarY2 = m.VALUE_NULL;
        } else if (iM3 == 116) {
            P2();
            mVarY2 = m.VALUE_TRUE;
        } else if (iM3 == 123) {
            if (!zI) {
                q2(this.G, this.H);
            }
            mVarY2 = m.START_OBJECT;
        } else if (iM3 == 125) {
            w1(iM3, "expected a value");
            P2();
            mVarY2 = m.VALUE_TRUE;
        } else if (iM3 == 45) {
            mVarY2 = Y2(true);
        } else if (iM3 != 46) {
            switch (iM3) {
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                    mVarY2 = Z2(iM3);
                    break;
                default:
                    mVarY2 = I2(iM3);
                    break;
            }
        } else {
            mVarY2 = U2(false);
        }
        if (zI) {
            this.J = mVarY2;
            return this.f12831c;
        }
        this.f12831c = mVarY2;
        return mVarY2;
    }

    protected final m Z2(int i10) {
        int i11 = this.A;
        int i12 = i11 - 1;
        int i13 = this.B;
        if (i10 == 48) {
            return X2(false, i12);
        }
        int i14 = 1;
        while (i11 < i13) {
            int i15 = i11 + 1;
            char c10 = this.f20478d0[i11];
            if (c10 < '0' || c10 > '9') {
                if (c10 == '.' || c10 == 'e' || c10 == 'E') {
                    this.A = i15;
                    return T2(c10, i12, i15, false, i14);
                }
                this.A = i11;
                if (this.I.j()) {
                    t3(c10);
                }
                this.K.v(this.f20478d0, i12, i11 - i12);
                return w2(false, i14);
            }
            i14++;
            i11 = i15;
        }
        this.A = i12;
        return X2(false, i12);
    }

    @Override // e6.j
    public int a1(e6.a aVar, OutputStream outputStream) throws IOException {
        if (!this.f20483i0 || this.f12831c != m.VALUE_STRING) {
            byte[] bArrV = v(aVar);
            outputStream.write(bArrV);
            return bArrV.length;
        }
        byte[] bArrD = this.f12818x.d();
        try {
            return a3(aVar, outputStream, bArrD);
        } finally {
            this.f12818x.l(bArrD);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x0124, code lost:
    
        r17.f20483i0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0126, code lost:
    
        if (r7 <= 0) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0128, code lost:
    
        r8 = r8 + r7;
        r19.write(r20, 0, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x012c, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:?, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected int a3(e6.a r18, java.io.OutputStream r19, byte[] r20) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.f.a3(e6.a, java.io.OutputStream, byte[]):int");
    }

    protected void b3(String str) {
        c3(str, h2());
    }

    protected void c3(String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        while (true) {
            if (this.A >= this.B && !J2()) {
                break;
            }
            char c10 = this.f20478d0[this.A];
            if (!Character.isJavaIdentifierPart(c10)) {
                break;
            }
            this.A++;
            sb2.append(c10);
            if (sb2.length() >= 256) {
                sb2.append("...");
                break;
            }
        }
        q1("Unrecognized token '%s': was expecting %s", sb2, str2);
    }

    @Override // f6.c
    protected void d2() {
        char[] cArr;
        super.d2();
        this.f20481g0.r();
        if (!this.f20479e0 || (cArr = this.f20478d0) == null) {
            return;
        }
        this.f20478d0 = null;
        this.f12818x.o(cArr);
    }

    protected final void f3() {
        if (this.A < this.B || J2()) {
            char[] cArr = this.f20478d0;
            int i10 = this.A;
            if (cArr[i10] == '\n') {
                this.A = i10 + 1;
            }
        }
        this.D++;
        this.E = this.A;
    }

    protected final void l3() {
        this.f20483i0 = false;
        int i10 = this.A;
        int i11 = this.B;
        char[] cArr = this.f20478d0;
        while (true) {
            if (i10 >= i11) {
                this.A = i10;
                if (!J2()) {
                    t1(": was expecting closing quote for a string value", m.VALUE_STRING);
                }
                i10 = this.A;
                i11 = this.B;
            }
            int i12 = i10 + 1;
            char c10 = cArr[i10];
            if (c10 <= '\\') {
                if (c10 == '\\') {
                    this.A = i12;
                    Q1();
                    i10 = this.A;
                    i11 = this.B;
                } else if (c10 <= '\"') {
                    if (c10 == '\"') {
                        this.A = i12;
                        return;
                    } else if (c10 < ' ') {
                        this.A = i12;
                        g2(c10, "string value");
                    }
                }
            }
            i10 = i12;
        }
    }

    protected char u3(String str, m mVar) {
        if (this.A >= this.B && !J2()) {
            t1(str, mVar);
        }
        char[] cArr = this.f20478d0;
        int i10 = this.A;
        this.A = i10 + 1;
        return cArr[i10];
    }

    @Override // e6.j
    public byte[] v(e6.a aVar) throws e6.i {
        byte[] bArr;
        m mVar = this.f12831c;
        if (mVar == m.VALUE_EMBEDDED_OBJECT && (bArr = this.O) != null) {
            return bArr;
        }
        if (mVar != m.VALUE_STRING) {
            o1("Current token (" + this.f12831c + ") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
        }
        if (this.f20483i0) {
            try {
                this.O = z2(aVar);
                this.f20483i0 = false;
            } catch (IllegalArgumentException e10) {
                throw a("Failed to decode VALUE_STRING as base64 (" + aVar + "): " + e10.getMessage());
            }
        } else if (this.O == null) {
            o6.c cVarU1 = U1();
            i1(C0(), cVarU1, aVar);
            this.O = cVarU1.l();
        }
        return this.O;
    }

    protected byte[] z2(e6.a aVar) {
        o6.c cVarU1 = U1();
        while (true) {
            if (this.A >= this.B) {
                K2();
            }
            char[] cArr = this.f20478d0;
            int i10 = this.A;
            this.A = i10 + 1;
            char c10 = cArr[i10];
            if (c10 > ' ') {
                int iG = aVar.g(c10);
                if (iG < 0) {
                    if (c10 == '\"') {
                        return cVarU1.l();
                    }
                    iG = P1(aVar, c10, 0);
                    if (iG < 0) {
                        continue;
                    }
                }
                if (this.A >= this.B) {
                    K2();
                }
                char[] cArr2 = this.f20478d0;
                int i11 = this.A;
                this.A = i11 + 1;
                char c11 = cArr2[i11];
                int iG2 = aVar.g(c11);
                if (iG2 < 0) {
                    iG2 = P1(aVar, c11, 1);
                }
                int i12 = (iG << 6) | iG2;
                if (this.A >= this.B) {
                    K2();
                }
                char[] cArr3 = this.f20478d0;
                int i13 = this.A;
                this.A = i13 + 1;
                char c12 = cArr3[i13];
                int iG3 = aVar.g(c12);
                if (iG3 < 0) {
                    if (iG3 != -2) {
                        if (c12 == '\"') {
                            cVarU1.c(i12 >> 4);
                            if (aVar.s()) {
                                this.A--;
                                X1(aVar);
                            }
                            return cVarU1.l();
                        }
                        iG3 = P1(aVar, c12, 2);
                    }
                    if (iG3 == -2) {
                        if (this.A >= this.B) {
                            K2();
                        }
                        char[] cArr4 = this.f20478d0;
                        int i14 = this.A;
                        this.A = i14 + 1;
                        char c13 = cArr4[i14];
                        if (!aVar.w(c13) && P1(aVar, c13, 3) != -2) {
                            throw t2(aVar, c13, 3, "expected padding character '" + aVar.q() + "'");
                        }
                        cVarU1.c(i12 >> 4);
                    }
                }
                int i15 = (i12 << 6) | iG3;
                if (this.A >= this.B) {
                    K2();
                }
                char[] cArr5 = this.f20478d0;
                int i16 = this.A;
                this.A = i16 + 1;
                char c14 = cArr5[i16];
                int iG4 = aVar.g(c14);
                if (iG4 < 0) {
                    if (iG4 != -2) {
                        if (c14 == '\"') {
                            cVarU1.k(i15 >> 2);
                            if (aVar.s()) {
                                this.A--;
                                X1(aVar);
                            }
                            return cVarU1.l();
                        }
                        iG4 = P1(aVar, c14, 3);
                    }
                    if (iG4 == -2) {
                        cVarU1.k(i15 >> 2);
                    }
                }
                cVarU1.e((i15 << 6) | iG4);
            }
        }
    }

    public f(i6.f fVar, int i10, Reader reader, n nVar, m6.b bVar) {
        super(fVar, i10);
        this.f20477c0 = reader;
        this.f20478d0 = fVar.g();
        this.A = 0;
        this.B = 0;
        this.f20480f0 = nVar;
        this.f20481g0 = bVar;
        this.f20482h0 = bVar.m();
        this.f20479e0 = true;
    }
}
