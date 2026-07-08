package ca;

import com.google.gson.u;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import j$.util.Objects;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import z9.g0;
import z9.x;

/* JADX INFO: loaded from: classes3.dex */
public class a implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Reader f4495a;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f4504s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f4505t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f4506u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int[] f4507v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private String[] f4509x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int[] f4510y;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private u f4496b = u.LEGACY_STRICT;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f4497c = 255;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final char[] f4498d = new char[WXMediaMessage.DESCRIPTION_LENGTH_LIMIT];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f4499e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f4500f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f4501g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f4502h = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f4503r = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f4508w = 1;

    /* JADX INFO: renamed from: ca.a$a, reason: collision with other inner class name */
    class C0069a extends x {
        C0069a() {
        }

        @Override // z9.x
        public void a(a aVar) throws IOException {
            int iN = aVar.f4503r;
            if (iN == 0) {
                iN = aVar.n();
            }
            if (iN == 13) {
                aVar.f4503r = 9;
            } else if (iN == 12) {
                aVar.f4503r = 8;
            } else {
                if (iN != 14) {
                    throw aVar.M0("a name");
                }
                aVar.f4503r = 10;
            }
        }
    }

    static {
        x.f33070a = new C0069a();
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.f4507v = iArr;
        iArr[0] = 6;
        this.f4509x = new String[32];
        this.f4510y = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f4495a = reader;
    }

    private int B0() {
        String str;
        String str2;
        int i10;
        char c10 = this.f4498d[this.f4499e];
        if (c10 == 't' || c10 == 'T') {
            str = "true";
            str2 = "TRUE";
            i10 = 5;
        } else if (c10 == 'f' || c10 == 'F') {
            str = "false";
            str2 = "FALSE";
            i10 = 6;
        } else {
            if (c10 != 'n' && c10 != 'N') {
                return 0;
            }
            str = "null";
            str2 = "NULL";
            i10 = 7;
        }
        boolean z10 = this.f4496b != u.STRICT;
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (this.f4499e + i11 >= this.f4500f && !s(i11 + 1)) {
                return 0;
            }
            char c11 = this.f4498d[this.f4499e + i11];
            if (c11 != str.charAt(i11) && (!z10 || c11 != str2.charAt(i11))) {
                return 0;
            }
        }
        if ((this.f4499e + length < this.f4500f || s(length + 1)) && T(this.f4498d[this.f4499e + length])) {
            return 0;
        }
        this.f4499e += length;
        this.f4503r = i10;
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0092, code lost:
    
        if (T(r14) != false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0094, code lost:
    
        if (r9 != 2) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0096, code lost:
    
        if (r10 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x009c, code lost:
    
        if (r11 != Long.MIN_VALUE) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x009e, code lost:
    
        if (r13 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a2, code lost:
    
        if (r11 != 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a4, code lost:
    
        if (r13 != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a6, code lost:
    
        if (r13 == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a9, code lost:
    
        r11 = -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00aa, code lost:
    
        r19.f4504s = r11;
        r19.f4499e += r8;
        r19.f4503r = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00b5, code lost:
    
        return 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00b6, code lost:
    
        if (r9 == 2) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00b9, code lost:
    
        if (r9 == 4) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00bc, code lost:
    
        if (r9 != 7) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00bf, code lost:
    
        return r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00c0, code lost:
    
        r19.f4505t = r8;
        r19.f4503r = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00c6, code lost:
    
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00c7, code lost:
    
        return 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int C0() {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ca.a.C0():int");
    }

    private void D0(int i10) throws d {
        int i11 = this.f4508w;
        if (i11 - 1 >= this.f4497c) {
            throw new d("Nesting limit " + this.f4497c + " reached" + W());
        }
        int[] iArr = this.f4507v;
        if (i11 == iArr.length) {
            int i12 = i11 * 2;
            this.f4507v = Arrays.copyOf(iArr, i12);
            this.f4510y = Arrays.copyOf(this.f4510y, i12);
            this.f4509x = (String[]) Arrays.copyOf(this.f4509x, i12);
        }
        int[] iArr2 = this.f4507v;
        int i13 = this.f4508w;
        this.f4508w = i13 + 1;
        iArr2[i13] = i10;
    }

    private char E0() throws d {
        int i10;
        if (this.f4499e == this.f4500f && !s(1)) {
            throw L0("Unterminated escape sequence");
        }
        char[] cArr = this.f4498d;
        int i11 = this.f4499e;
        int i12 = i11 + 1;
        this.f4499e = i12;
        char c10 = cArr[i11];
        if (c10 != '\n') {
            if (c10 != '\"') {
                if (c10 != '\'') {
                    if (c10 != '/' && c10 != '\\') {
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
                            throw L0("Invalid escape sequence");
                        }
                        if (i11 + 5 > this.f4500f && !s(4)) {
                            throw L0("Unterminated escape sequence");
                        }
                        int i13 = this.f4499e;
                        int i14 = i13 + 4;
                        int i15 = 0;
                        while (i13 < i14) {
                            char c11 = this.f4498d[i13];
                            int i16 = i15 << 4;
                            if (c11 >= '0' && c11 <= '9') {
                                i10 = c11 - '0';
                            } else if (c11 >= 'a' && c11 <= 'f') {
                                i10 = c11 - 'W';
                            } else {
                                if (c11 < 'A' || c11 > 'F') {
                                    throw L0("Malformed Unicode escape \\u" + new String(this.f4498d, this.f4499e, 4));
                                }
                                i10 = c11 - '7';
                            }
                            i15 = i16 + i10;
                            i13++;
                        }
                        this.f4499e += 4;
                        return (char) i15;
                    }
                }
            }
            return c10;
        }
        if (this.f4496b == u.STRICT) {
            throw L0("Cannot escape a newline character in strict mode");
        }
        this.f4501g++;
        this.f4502h = i12;
        if (this.f4496b == u.STRICT) {
            throw L0("Invalid escaped character \"'\" in strict mode");
        }
        return c10;
    }

    private void G0(char c10) throws d {
        char[] cArr = this.f4498d;
        do {
            int i10 = this.f4499e;
            int i11 = this.f4500f;
            while (i10 < i11) {
                int i12 = i10 + 1;
                char c11 = cArr[i10];
                if (c11 == c10) {
                    this.f4499e = i12;
                    return;
                }
                if (c11 == '\\') {
                    this.f4499e = i12;
                    E0();
                    i10 = this.f4499e;
                    i11 = this.f4500f;
                } else {
                    if (c11 == '\n') {
                        this.f4501g++;
                        this.f4502h = i12;
                    }
                    i10 = i12;
                }
            }
            this.f4499e = i10;
        } while (s(1));
        throw L0("Unterminated string");
    }

    private boolean H0(String str) {
        int length = str.length();
        while (true) {
            if (this.f4499e + length > this.f4500f && !s(length)) {
                return false;
            }
            char[] cArr = this.f4498d;
            int i10 = this.f4499e;
            if (cArr[i10] != '\n') {
                for (int i11 = 0; i11 < length; i11++) {
                    if (this.f4498d[this.f4499e + i11] != str.charAt(i11)) {
                        break;
                    }
                }
                return true;
            }
            this.f4501g++;
            this.f4502h = i10 + 1;
            this.f4499e++;
        }
    }

    private void I0() {
        char c10;
        do {
            if (this.f4499e >= this.f4500f && !s(1)) {
                return;
            }
            char[] cArr = this.f4498d;
            int i10 = this.f4499e;
            int i11 = i10 + 1;
            this.f4499e = i11;
            c10 = cArr[i10];
            if (c10 == '\n') {
                this.f4501g++;
                this.f4502h = i11;
                return;
            }
        } while (c10 != '\r');
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
    
        k();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void J0() throws ca.d {
        /*
            r4 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r4.f4499e
            int r2 = r1 + r0
            int r3 = r4.f4500f
            if (r2 >= r3) goto L51
            char[] r2 = r4.f4498d
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L4b
            r2 = 10
            if (r1 == r2) goto L4b
            r2 = 12
            if (r1 == r2) goto L4b
            r2 = 13
            if (r1 == r2) goto L4b
            r2 = 32
            if (r1 == r2) goto L4b
            r2 = 35
            if (r1 == r2) goto L48
            r2 = 44
            if (r1 == r2) goto L4b
            r2 = 47
            if (r1 == r2) goto L48
            r2 = 61
            if (r1 == r2) goto L48
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L4b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L4b
            r2 = 58
            if (r1 == r2) goto L4b
            r2 = 59
            if (r1 == r2) goto L48
            switch(r1) {
                case 91: goto L4b;
                case 92: goto L48;
                case 93: goto L4b;
                default: goto L45;
            }
        L45:
            int r0 = r0 + 1
            goto L1
        L48:
            r4.k()
        L4b:
            int r1 = r4.f4499e
            int r1 = r1 + r0
            r4.f4499e = r1
            return
        L51:
            int r1 = r1 + r0
            r4.f4499e = r1
            r0 = 1
            boolean r0 = r4.s(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ca.a.J0():void");
    }

    private d L0(String str) throws d {
        throw new d(str + W() + "\nSee " + g0.a("malformed-json"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public IllegalStateException M0(String str) {
        return new IllegalStateException("Expected " + str + " but was " + A0() + W() + "\nSee " + g0.a(A0() == b.NULL ? "adapter-not-null-safe" : "unexpected-json-structure"));
    }

    private boolean T(char c10) throws d {
        if (c10 == '\t' || c10 == '\n' || c10 == '\f' || c10 == '\r' || c10 == ' ') {
            return false;
        }
        if (c10 != '#') {
            if (c10 == ',') {
                return false;
            }
            if (c10 != '/' && c10 != '=') {
                if (c10 == '{' || c10 == '}' || c10 == ':') {
                    return false;
                }
                if (c10 != ';') {
                    switch (c10) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        k();
        return false;
    }

    private void k() throws d {
        if (this.f4496b != u.LENIENT) {
            throw L0("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        }
    }

    private void l() throws IOException {
        v0(true);
        int i10 = this.f4499e;
        this.f4499e = i10 - 1;
        if (i10 + 4 <= this.f4500f || s(5)) {
            int i11 = this.f4499e;
            char[] cArr = this.f4498d;
            if (cArr[i11] == ')' && cArr[i11 + 1] == ']' && cArr[i11 + 2] == '}' && cArr[i11 + 3] == '\'' && cArr[i11 + 4] == '\n') {
                this.f4499e = i11 + 5;
            }
        }
    }

    private boolean s(int i10) throws IOException {
        int i11;
        int i12;
        char[] cArr = this.f4498d;
        int i13 = this.f4502h;
        int i14 = this.f4499e;
        this.f4502h = i13 - i14;
        int i15 = this.f4500f;
        if (i15 != i14) {
            int i16 = i15 - i14;
            this.f4500f = i16;
            System.arraycopy(cArr, i14, cArr, 0, i16);
        } else {
            this.f4500f = 0;
        }
        this.f4499e = 0;
        do {
            Reader reader = this.f4495a;
            int i17 = this.f4500f;
            int i18 = reader.read(cArr, i17, cArr.length - i17);
            if (i18 == -1) {
                return false;
            }
            i11 = this.f4500f + i18;
            this.f4500f = i11;
            if (this.f4501g == 0 && (i12 = this.f4502h) == 0 && i11 > 0 && cArr[0] == 65279) {
                this.f4499e++;
                this.f4502h = i12 + 1;
                i10++;
            }
        } while (i11 < i10);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0076, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int v0(boolean r9) throws java.io.IOException {
        /*
            r8 = this;
            char[] r0 = r8.f4498d
            int r1 = r8.f4499e
            int r2 = r8.f4500f
        L6:
            r3 = 1
            if (r1 != r2) goto L34
            r8.f4499e = r1
            boolean r1 = r8.s(r3)
            if (r1 != 0) goto L30
            if (r9 != 0) goto L15
            r9 = -1
            return r9
        L15:
            java.io.EOFException r9 = new java.io.EOFException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "End of input"
            r0.append(r1)
            java.lang.String r1 = r8.W()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
        L30:
            int r1 = r8.f4499e
            int r2 = r8.f4500f
        L34:
            int r4 = r1 + 1
            char r5 = r0[r1]
            r6 = 10
            if (r5 != r6) goto L45
            int r1 = r8.f4501g
            int r1 = r1 + r3
            r8.f4501g = r1
            r8.f4502h = r4
            goto Lb2
        L45:
            r6 = 32
            if (r5 == r6) goto Lb2
            r6 = 13
            if (r5 == r6) goto Lb2
            r6 = 9
            if (r5 != r6) goto L52
            goto Lb2
        L52:
            r6 = 47
            if (r5 != r6) goto L9d
            r8.f4499e = r4
            r7 = 2
            if (r4 != r2) goto L69
            r8.f4499e = r1
            boolean r1 = r8.s(r7)
            int r2 = r8.f4499e
            int r2 = r2 + r3
            r8.f4499e = r2
            if (r1 != 0) goto L69
            goto L76
        L69:
            r8.k()
            int r1 = r8.f4499e
            char r2 = r0[r1]
            r3 = 42
            if (r2 == r3) goto L83
            if (r2 == r6) goto L77
        L76:
            return r5
        L77:
            int r1 = r1 + 1
            r8.f4499e = r1
            r8.I0()
            int r1 = r8.f4499e
            int r2 = r8.f4500f
            goto L6
        L83:
            int r1 = r1 + 1
            r8.f4499e = r1
        */
        //  java.lang.String r1 = "*/"
        /*
            boolean r1 = r8.H0(r1)
            if (r1 == 0) goto L96
            int r1 = r8.f4499e
            int r1 = r1 + r7
            int r2 = r8.f4500f
            goto L6
        L96:
            java.lang.String r9 = "Unterminated comment"
            ca.d r9 = r8.L0(r9)
            throw r9
        L9d:
            r1 = 35
            if (r5 != r1) goto Laf
            r8.f4499e = r4
            r8.k()
            r8.I0()
            int r1 = r8.f4499e
            int r2 = r8.f4500f
            goto L6
        Laf:
            r8.f4499e = r4
            return r5
        Lb2:
            r1 = r4
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: ca.a.v0(boolean):int");
    }

    private String w(boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('$');
        int i10 = 0;
        while (true) {
            int i11 = this.f4508w;
            if (i10 >= i11) {
                return sb2.toString();
            }
            int i12 = this.f4507v[i10];
            switch (i12) {
                case 1:
                case 2:
                    int i13 = this.f4510y[i10];
                    if (z10 && i13 > 0 && i10 == i11 - 1) {
                        i13--;
                    }
                    sb2.append('[');
                    sb2.append(i13);
                    sb2.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb2.append('.');
                    String str = this.f4509x[i10];
                    if (str != null) {
                        sb2.append(str);
                    }
                    break;
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    throw new AssertionError("Unknown scope value: " + i12);
            }
            i10++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006c, code lost:
    
        if (r1 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006e, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007c, code lost:
    
        r1.append(r0, r3, r2 - r3);
        r10.f4499e = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String x0(char r11) throws ca.d {
        /*
            r10 = this;
            char[] r0 = r10.f4498d
            r1 = 0
        L3:
            int r2 = r10.f4499e
            int r3 = r10.f4500f
        L7:
            r4 = r3
            r3 = r2
        L9:
            r5 = 16
            r6 = 1
            if (r2 >= r4) goto L6c
            int r7 = r2 + 1
            char r2 = r0[r2]
            com.google.gson.u r8 = r10.f4496b
            com.google.gson.u r9 = com.google.gson.u.STRICT
            if (r8 != r9) goto L24
            r8 = 32
            if (r2 < r8) goto L1d
            goto L24
        L1d:
            java.lang.String r11 = "Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode"
            ca.d r11 = r10.L0(r11)
            throw r11
        L24:
            if (r2 != r11) goto L3a
            r10.f4499e = r7
            int r7 = r7 - r3
            int r7 = r7 - r6
            if (r1 != 0) goto L32
            java.lang.String r11 = new java.lang.String
            r11.<init>(r0, r3, r7)
            return r11
        L32:
            r1.append(r0, r3, r7)
            java.lang.String r11 = r1.toString()
            return r11
        L3a:
            r8 = 92
            if (r2 != r8) goto L5f
            r10.f4499e = r7
            int r7 = r7 - r3
            int r2 = r7 + (-1)
            if (r1 != 0) goto L50
            int r7 = r7 * 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r4 = java.lang.Math.max(r7, r5)
            r1.<init>(r4)
        L50:
            r1.append(r0, r3, r2)
            char r2 = r10.E0()
            r1.append(r2)
            int r2 = r10.f4499e
            int r3 = r10.f4500f
            goto L7
        L5f:
            r5 = 10
            if (r2 != r5) goto L6a
            int r2 = r10.f4501g
            int r2 = r2 + r6
            r10.f4501g = r2
            r10.f4502h = r7
        L6a:
            r2 = r7
            goto L9
        L6c:
            if (r1 != 0) goto L7c
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r4.<init>(r1)
            r1 = r4
        L7c:
            int r4 = r2 - r3
            r1.append(r0, r3, r4)
            r10.f4499e = r2
            boolean r2 = r10.s(r6)
            if (r2 == 0) goto L8b
            goto L3
        L8b:
            java.lang.String r11 = "Unterminated string"
            ca.d r11 = r10.L0(r11)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ca.a.x0(char):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
    
        k();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String z0() throws ca.d {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = 0
        L3:
            int r3 = r6.f4499e
            int r4 = r3 + r2
            int r5 = r6.f4500f
            if (r4 >= r5) goto L4e
            char[] r4 = r6.f4498d
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L5c
            r4 = 10
            if (r3 == r4) goto L5c
            r4 = 12
            if (r3 == r4) goto L5c
            r4 = 13
            if (r3 == r4) goto L5c
            r4 = 32
            if (r3 == r4) goto L5c
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5c
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5c
            r4 = 58
            if (r3 == r4) goto L5c
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5c;
                case 92: goto L4a;
                case 93: goto L5c;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r6.k()
            goto L5c
        L4e:
            char[] r3 = r6.f4498d
            int r3 = r3.length
            if (r2 >= r3) goto L5e
            int r3 = r2 + 1
            boolean r3 = r6.s(r3)
            if (r3 == 0) goto L5c
            goto L3
        L5c:
            r1 = r2
            goto L7e
        L5e:
            if (r0 != 0) goto L6b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L6b:
            char[] r3 = r6.f4498d
            int r4 = r6.f4499e
            r0.append(r3, r4, r2)
            int r3 = r6.f4499e
            int r3 = r3 + r2
            r6.f4499e = r3
            r2 = 1
            boolean r2 = r6.s(r2)
            if (r2 != 0) goto L2
        L7e:
            if (r0 != 0) goto L8a
            java.lang.String r0 = new java.lang.String
            char[] r2 = r6.f4498d
            int r3 = r6.f4499e
            r0.<init>(r2, r3, r1)
            goto L95
        L8a:
            char[] r2 = r6.f4498d
            int r3 = r6.f4499e
            r0.append(r2, r3, r1)
            java.lang.String r0 = r0.toString()
        L95:
            int r2 = r6.f4499e
            int r2 = r2 + r1
            r6.f4499e = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ca.a.z0():java.lang.String");
    }

    public b A0() throws IOException {
        int iN = this.f4503r;
        if (iN == 0) {
            iN = n();
        }
        switch (iN) {
            case 1:
                return b.BEGIN_OBJECT;
            case 2:
                return b.END_OBJECT;
            case 3:
                return b.BEGIN_ARRAY;
            case 4:
                return b.END_ARRAY;
            case 5:
            case 6:
                return b.BOOLEAN;
            case 7:
                return b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return b.STRING;
            case 12:
            case 13:
            case 14:
                return b.NAME;
            case 15:
            case 16:
                return b.NUMBER;
            case 17:
                return b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public final void F0(u uVar) {
        Objects.requireNonNull(uVar);
        this.f4496b = uVar;
    }

    public final u G() {
        return this.f4496b;
    }

    public boolean H() throws IOException {
        int iN = this.f4503r;
        if (iN == 0) {
            iN = n();
        }
        return (iN == 2 || iN == 4 || iN == 17) ? false : true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void K0() throws IOException {
        int i10 = 0;
        do {
            int iN = this.f4503r;
            if (iN == 0) {
                iN = n();
            }
            switch (iN) {
                case 1:
                    D0(3);
                    i10++;
                    this.f4503r = 0;
                    break;
                case 2:
                    if (i10 == 0) {
                        this.f4509x[this.f4508w - 1] = null;
                    }
                    this.f4508w--;
                    i10--;
                    this.f4503r = 0;
                    break;
                case 3:
                    D0(1);
                    i10++;
                    this.f4503r = 0;
                    break;
                case 4:
                    this.f4508w--;
                    i10--;
                    this.f4503r = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.f4503r = 0;
                    break;
                case 8:
                    G0('\'');
                    this.f4503r = 0;
                    break;
                case 9:
                    G0('\"');
                    this.f4503r = 0;
                    break;
                case 10:
                    J0();
                    this.f4503r = 0;
                    break;
                case 12:
                    G0('\'');
                    if (i10 == 0) {
                        this.f4509x[this.f4508w - 1] = "<skipped>";
                    }
                    this.f4503r = 0;
                    break;
                case 13:
                    G0('\"');
                    if (i10 == 0) {
                        this.f4509x[this.f4508w - 1] = "<skipped>";
                    }
                    this.f4503r = 0;
                    break;
                case 14:
                    J0();
                    if (i10 == 0) {
                        this.f4509x[this.f4508w - 1] = "<skipped>";
                    }
                    this.f4503r = 0;
                    break;
                case 16:
                    this.f4499e += this.f4505t;
                    this.f4503r = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i10 > 0);
        int[] iArr = this.f4510y;
        int i11 = this.f4508w - 1;
        iArr[i11] = iArr[i11] + 1;
    }

    public final boolean S() {
        return this.f4496b == u.LENIENT;
    }

    String W() {
        return " at line " + (this.f4501g + 1) + " column " + ((this.f4499e - this.f4502h) + 1) + " path " + v();
    }

    public boolean X() throws IOException {
        int iN = this.f4503r;
        if (iN == 0) {
            iN = n();
        }
        if (iN == 5) {
            this.f4503r = 0;
            int[] iArr = this.f4510y;
            int i10 = this.f4508w - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        }
        if (iN != 6) {
            throw M0("a boolean");
        }
        this.f4503r = 0;
        int[] iArr2 = this.f4510y;
        int i11 = this.f4508w - 1;
        iArr2[i11] = iArr2[i11] + 1;
        return false;
    }

    public void c() throws IOException {
        int iN = this.f4503r;
        if (iN == 0) {
            iN = n();
        }
        if (iN != 3) {
            throw M0("BEGIN_ARRAY");
        }
        D0(1);
        this.f4510y[this.f4508w - 1] = 0;
        this.f4503r = 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f4503r = 0;
        this.f4507v[0] = 8;
        this.f4508w = 1;
        this.f4495a.close();
    }

    public void e() throws IOException {
        int iN = this.f4503r;
        if (iN == 0) {
            iN = n();
        }
        if (iN != 1) {
            throw M0("BEGIN_OBJECT");
        }
        D0(3);
        this.f4503r = 0;
    }

    public double h0() throws IOException {
        int iN = this.f4503r;
        if (iN == 0) {
            iN = n();
        }
        if (iN == 15) {
            this.f4503r = 0;
            int[] iArr = this.f4510y;
            int i10 = this.f4508w - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f4504s;
        }
        if (iN == 16) {
            this.f4506u = new String(this.f4498d, this.f4499e, this.f4505t);
            this.f4499e += this.f4505t;
        } else if (iN == 8 || iN == 9) {
            this.f4506u = x0(iN == 8 ? '\'' : '\"');
        } else if (iN == 10) {
            this.f4506u = z0();
        } else if (iN != 11) {
            throw M0("a double");
        }
        this.f4503r = 11;
        double d10 = Double.parseDouble(this.f4506u);
        if (this.f4496b != u.LENIENT && (Double.isNaN(d10) || Double.isInfinite(d10))) {
            throw L0("JSON forbids NaN and infinities: " + d10);
        }
        this.f4506u = null;
        this.f4503r = 0;
        int[] iArr2 = this.f4510y;
        int i11 = this.f4508w - 1;
        iArr2[i11] = iArr2[i11] + 1;
        return d10;
    }

    int n() throws IOException {
        int iV0;
        int[] iArr = this.f4507v;
        int i10 = this.f4508w;
        int i11 = iArr[i10 - 1];
        if (i11 == 1) {
            iArr[i10 - 1] = 2;
        } else if (i11 == 2) {
            int iV02 = v0(true);
            if (iV02 != 44) {
                if (iV02 != 59) {
                    if (iV02 != 93) {
                        throw L0("Unterminated array");
                    }
                    this.f4503r = 4;
                    return 4;
                }
                k();
            }
        } else {
            if (i11 == 3 || i11 == 5) {
                iArr[i10 - 1] = 4;
                if (i11 == 5 && (iV0 = v0(true)) != 44) {
                    if (iV0 != 59) {
                        if (iV0 != 125) {
                            throw L0("Unterminated object");
                        }
                        this.f4503r = 2;
                        return 2;
                    }
                    k();
                }
                int iV03 = v0(true);
                if (iV03 == 34) {
                    this.f4503r = 13;
                    return 13;
                }
                if (iV03 == 39) {
                    k();
                    this.f4503r = 12;
                    return 12;
                }
                if (iV03 == 125) {
                    if (i11 == 5) {
                        throw L0("Expected name");
                    }
                    this.f4503r = 2;
                    return 2;
                }
                k();
                this.f4499e--;
                if (!T((char) iV03)) {
                    throw L0("Expected name");
                }
                this.f4503r = 14;
                return 14;
            }
            if (i11 == 4) {
                iArr[i10 - 1] = 5;
                int iV04 = v0(true);
                if (iV04 != 58) {
                    if (iV04 != 61) {
                        throw L0("Expected ':'");
                    }
                    k();
                    if (this.f4499e < this.f4500f || s(1)) {
                        char[] cArr = this.f4498d;
                        int i12 = this.f4499e;
                        if (cArr[i12] == '>') {
                            this.f4499e = i12 + 1;
                        }
                    }
                }
            } else if (i11 == 6) {
                if (this.f4496b == u.LENIENT) {
                    l();
                }
                this.f4507v[this.f4508w - 1] = 7;
            } else if (i11 == 7) {
                if (v0(false) == -1) {
                    this.f4503r = 17;
                    return 17;
                }
                k();
                this.f4499e--;
            } else if (i11 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int iV05 = v0(true);
        if (iV05 == 34) {
            this.f4503r = 9;
            return 9;
        }
        if (iV05 == 39) {
            k();
            this.f4503r = 8;
            return 8;
        }
        if (iV05 != 44 && iV05 != 59) {
            if (iV05 == 91) {
                this.f4503r = 3;
                return 3;
            }
            if (iV05 != 93) {
                if (iV05 == 123) {
                    this.f4503r = 1;
                    return 1;
                }
                this.f4499e--;
                int iB0 = B0();
                if (iB0 != 0) {
                    return iB0;
                }
                int iC0 = C0();
                if (iC0 != 0) {
                    return iC0;
                }
                if (!T(this.f4498d[this.f4499e])) {
                    throw L0("Expected value");
                }
                k();
                this.f4503r = 10;
                return 10;
            }
            if (i11 == 1) {
                this.f4503r = 4;
                return 4;
            }
        }
        if (i11 != 1 && i11 != 2) {
            throw L0("Unexpected value");
        }
        k();
        this.f4499e--;
        this.f4503r = 7;
        return 7;
    }

    public int p0() throws IOException {
        int iN = this.f4503r;
        if (iN == 0) {
            iN = n();
        }
        if (iN == 15) {
            long j10 = this.f4504s;
            int i10 = (int) j10;
            if (j10 == i10) {
                this.f4503r = 0;
                int[] iArr = this.f4510y;
                int i11 = this.f4508w - 1;
                iArr[i11] = iArr[i11] + 1;
                return i10;
            }
            throw new NumberFormatException("Expected an int but was " + this.f4504s + W());
        }
        if (iN == 16) {
            this.f4506u = new String(this.f4498d, this.f4499e, this.f4505t);
            this.f4499e += this.f4505t;
        } else {
            if (iN != 8 && iN != 9 && iN != 10) {
                throw M0("an int");
            }
            if (iN == 10) {
                this.f4506u = z0();
            } else {
                this.f4506u = x0(iN == 8 ? '\'' : '\"');
            }
            try {
                int i12 = Integer.parseInt(this.f4506u);
                this.f4503r = 0;
                int[] iArr2 = this.f4510y;
                int i13 = this.f4508w - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return i12;
            } catch (NumberFormatException unused) {
            }
        }
        this.f4503r = 11;
        double d10 = Double.parseDouble(this.f4506u);
        int i14 = (int) d10;
        if (i14 != d10) {
            throw new NumberFormatException("Expected an int but was " + this.f4506u + W());
        }
        this.f4506u = null;
        this.f4503r = 0;
        int[] iArr3 = this.f4510y;
        int i15 = this.f4508w - 1;
        iArr3[i15] = iArr3[i15] + 1;
        return i14;
    }

    public void q() throws IOException {
        int iN = this.f4503r;
        if (iN == 0) {
            iN = n();
        }
        if (iN != 4) {
            throw M0("END_ARRAY");
        }
        int i10 = this.f4508w;
        this.f4508w = i10 - 1;
        int[] iArr = this.f4510y;
        int i11 = i10 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.f4503r = 0;
    }

    public void r() throws IOException {
        int iN = this.f4503r;
        if (iN == 0) {
            iN = n();
        }
        if (iN != 2) {
            throw M0("END_OBJECT");
        }
        int i10 = this.f4508w;
        int i11 = i10 - 1;
        this.f4508w = i11;
        this.f4509x[i11] = null;
        int[] iArr = this.f4510y;
        int i12 = i10 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.f4503r = 0;
    }

    public long t0() throws IOException {
        int iN = this.f4503r;
        if (iN == 0) {
            iN = n();
        }
        if (iN == 15) {
            this.f4503r = 0;
            int[] iArr = this.f4510y;
            int i10 = this.f4508w - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f4504s;
        }
        if (iN == 16) {
            this.f4506u = new String(this.f4498d, this.f4499e, this.f4505t);
            this.f4499e += this.f4505t;
        } else {
            if (iN != 8 && iN != 9 && iN != 10) {
                throw M0("a long");
            }
            if (iN == 10) {
                this.f4506u = z0();
            } else {
                this.f4506u = x0(iN == 8 ? '\'' : '\"');
            }
            try {
                long j10 = Long.parseLong(this.f4506u);
                this.f4503r = 0;
                int[] iArr2 = this.f4510y;
                int i11 = this.f4508w - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return j10;
            } catch (NumberFormatException unused) {
            }
        }
        this.f4503r = 11;
        double d10 = Double.parseDouble(this.f4506u);
        long j11 = (long) d10;
        if (j11 != d10) {
            throw new NumberFormatException("Expected a long but was " + this.f4506u + W());
        }
        this.f4506u = null;
        this.f4503r = 0;
        int[] iArr3 = this.f4510y;
        int i12 = this.f4508w - 1;
        iArr3[i12] = iArr3[i12] + 1;
        return j11;
    }

    public String toString() {
        return getClass().getSimpleName() + W();
    }

    public String u0() throws IOException {
        String strX0;
        int iN = this.f4503r;
        if (iN == 0) {
            iN = n();
        }
        if (iN == 14) {
            strX0 = z0();
        } else if (iN == 12) {
            strX0 = x0('\'');
        } else {
            if (iN != 13) {
                throw M0("a name");
            }
            strX0 = x0('\"');
        }
        this.f4503r = 0;
        this.f4509x[this.f4508w - 1] = strX0;
        return strX0;
    }

    public String v() {
        return w(false);
    }

    public void w0() throws IOException {
        int iN = this.f4503r;
        if (iN == 0) {
            iN = n();
        }
        if (iN != 7) {
            throw M0("null");
        }
        this.f4503r = 0;
        int[] iArr = this.f4510y;
        int i10 = this.f4508w - 1;
        iArr[i10] = iArr[i10] + 1;
    }

    public String x() {
        return w(true);
    }

    public String y0() throws IOException {
        String str;
        int iN = this.f4503r;
        if (iN == 0) {
            iN = n();
        }
        if (iN == 10) {
            str = z0();
        } else if (iN == 8) {
            str = x0('\'');
        } else if (iN == 9) {
            str = x0('\"');
        } else if (iN == 11) {
            str = this.f4506u;
            this.f4506u = null;
        } else if (iN == 15) {
            str = Long.toString(this.f4504s);
        } else {
            if (iN != 16) {
                throw M0("a string");
            }
            str = new String(this.f4498d, this.f4499e, this.f4505t);
            this.f4499e += this.f4505t;
        }
        this.f4503r = 0;
        int[] iArr = this.f4510y;
        int i10 = this.f4508w - 1;
        iArr[i10] = iArr[i10] + 1;
        return str;
    }
}
