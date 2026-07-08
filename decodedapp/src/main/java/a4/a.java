package a4;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static HashMap f275a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static HashMap f276b = new HashMap();

    /* JADX INFO: renamed from: a4.a$a, reason: collision with other inner class name */
    public static class C0005a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f277c = 32768;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f278a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f279b;

        public static int c(String str) {
            int length = str.length();
            int i10 = f277c;
            int i11 = 0;
            for (int i12 = 0; i12 < length; i12++) {
                char cCharAt = str.charAt(i12);
                if (cCharAt == '-') {
                    i11 |= i10;
                } else if (cCharAt == '/') {
                    return 0;
                }
                i10 >>>= 1;
            }
            return (length << 16) | i11;
        }

        public static String h(char c10) {
            int i10 = c10 & 65535;
            int iNumberOfLeadingZeros = 32 - Integer.numberOfLeadingZeros(i10);
            if (iNumberOfLeadingZeros <= 9) {
                iNumberOfLeadingZeros = 10;
            }
            return i(iNumberOfLeadingZeros, i10 << (16 - iNumberOfLeadingZeros));
        }

        public static String i(int i10, int i11) {
            if (i10 == 0) {
                return "/";
            }
            char[] cArr = new char[i10];
            for (int i12 = 0; i12 < i10; i12++) {
                if ((f277c & i11) != 0) {
                    cArr[i12] = '-';
                } else {
                    cArr[i12] = '.';
                }
                i11 <<= 1;
            }
            return String.valueOf(cArr);
        }

        public void a() {
            int i10 = this.f279b;
            if (i10 >= 16) {
                throw new IllegalStateException("错编码:数据太长");
            }
            this.f279b = i10 + 1;
            this.f278a = (this.f278a << 1) | 1;
        }

        public void b() {
            int i10 = this.f279b;
            if (i10 >= 16) {
                throw new IllegalStateException("错编码:数据太长");
            }
            this.f279b = i10 + 1;
            this.f278a <<= 1;
        }

        public String d() {
            String str = (String) a.f276b.get(Integer.valueOf(e()));
            return str != null ? str : this.f279b > 9 ? String.valueOf((char) this.f278a) : "*";
        }

        public int e() {
            int i10 = this.f279b;
            return (this.f278a << (16 - i10)) | (i10 << 16);
        }

        public boolean f() {
            return this.f279b == 0;
        }

        public void g() {
            this.f279b = 0;
            this.f278a = 0;
        }
    }

    static {
        f275a.put("a", ".-");
        f275a.put("b", "-...");
        f275a.put("c", "-.-.");
        f275a.put("d", "-..");
        f275a.put("e", ".");
        f275a.put("f", "..-.");
        f275a.put("g", "--.");
        f275a.put("h", "....");
        f275a.put("i", "..");
        f275a.put("j", ".---");
        f275a.put("k", "-.-");
        f275a.put("l", ".-..");
        f275a.put("m", "--");
        f275a.put("n", "-.");
        f275a.put("o", "---");
        f275a.put("p", ".--.");
        f275a.put("q", "--.-");
        f275a.put("r", ".-.");
        f275a.put("s", "...");
        f275a.put("t", "-");
        f275a.put("u", "..-");
        f275a.put("v", "...-");
        f275a.put("w", ".--");
        f275a.put("x", "-..-");
        f275a.put("y", "-.--");
        f275a.put("z", "--..");
        f275a.put("1", ".----");
        f275a.put("2", "..---");
        f275a.put("3", "...--");
        f275a.put("4", "....-");
        f275a.put("5", ".....");
        f275a.put("6", "-....");
        f275a.put("7", "--...");
        f275a.put("8", "---..");
        f275a.put("9", "----.");
        f275a.put("0", "-----");
        f275a.put(".", ".-.-.-");
        f275a.put(",", "--..--");
        f275a.put("?", "..--..");
        f275a.put("'", ".----.");
        f275a.put("!", "-.-.--");
        f275a.put("/", "-..-.");
        f275a.put("(", "-.--.");
        f275a.put(")", "-.--.-");
        f275a.put("&", ".-...");
        f275a.put(":", "---...");
        f275a.put(";", "-.-.-.");
        f275a.put("=", "-...-");
        f275a.put("+", ".-.-.");
        f275a.put("-", "-....-");
        f275a.put("_", "..--.-");
        f275a.put("\"", ".-..-.");
        f275a.put("$", "...-..-");
        f275a.put("@", ".--.-.");
        f275a.put("\n", ".-.-");
        f275a.put("\u0004", "...-.-");
        f275a.put("????", "........");
        f275a.put("NJ", "-..---");
        f275a.put("\u0001", "-.-.-");
        f275a.put("SOS", "...---...");
        f275a.put(" ", "/");
        f275a.put("è", ".-..-");
        f275a.put("ñ", "--.--");
        f275a.put("à", ".--.-");
        f275a.put("é", "..-..");
        f275a.put("ö", "---.");
        f275a.put("ç", "-.-..");
        f275a.put("ĝ", "--.-.");
        f275a.put("ŝ", "...-.");
        f275a.put("š", "----");
        f275a.put("þ", ".--..");
        f275a.put("ð", "..--.");
        f275a.put("ĵ", ".---.");
        f275a.put("ü", "..--");
        f275a.put("ś", "...-...");
        f275a.put("ź", "--..-.");
        f275a.put("ż", "--..-");
        for (String str : f275a.keySet()) {
            String str2 = (String) f275a.get(str);
            int iC = C0005a.c(str2);
            if (f276b.containsKey(Integer.valueOf(iC))) {
                throw new Error(String.format("重复编码:%s和%s => %s", f276b.get(Integer.valueOf(iC)), str, str2));
            }
            f276b.put(Integer.valueOf(iC), str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d A[PHI: r5 r7
      0x006d: PHI (r5v7 java.lang.String) = (r5v6 java.lang.String), (r5v10 java.lang.String) binds: [B:39:0x009b, B:26:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x006d: PHI (r7v6 int) = (r7v5 int), (r7v10 int) binds: [B:39:0x009b, B:26:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String b(java.lang.String r9) {
        /*
            int r0 = r9.length()
            if (r0 != 0) goto L8
            r9 = 0
            return r9
        L8:
            java.lang.String r9 = r9.toLowerCase()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 0
        L12:
            if (r2 >= r0) goto Laf
            char r3 = r9.charAt(r2)
            java.util.HashMap r4 = a4.a.f275a
            java.lang.String r5 = java.lang.String.valueOf(r3)
            java.lang.Object r4 = r4.get(r5)
            java.lang.String r4 = (java.lang.String) r4
            r5 = 110(0x6e, float:1.54E-43)
            r6 = 1
            if (r3 != r5) goto L46
            int r5 = r0 - r2
            if (r5 <= r6) goto L46
            int r5 = r2 + 1
            char r7 = r9.charAt(r5)
            r8 = 106(0x6a, float:1.49E-43)
            if (r7 != r8) goto L46
            java.util.HashMap r7 = a4.a.f275a
            java.lang.String r8 = "NJ"
            java.lang.Object r7 = r7.get(r8)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L9e
            r2 = r5
            r4 = r7
            goto L9e
        L46:
            r5 = 115(0x73, float:1.61E-43)
            if (r3 != r5) goto L70
            int r7 = r0 - r2
            r8 = 2
            if (r7 <= r8) goto L70
            int r7 = r2 + 1
            char r7 = r9.charAt(r7)
            r8 = 111(0x6f, float:1.56E-43)
            if (r7 != r8) goto L70
            int r7 = r2 + 2
            char r8 = r9.charAt(r7)
            if (r8 != r5) goto L70
            java.util.HashMap r5 = a4.a.f275a
            java.lang.String r8 = "SOS"
            java.lang.Object r5 = r5.get(r8)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L9e
        L6d:
            r4 = r5
            r2 = r7
            goto L9e
        L70:
            r5 = 63
            if (r3 != r5) goto L9e
            int r7 = r0 - r2
            r8 = 3
            if (r7 <= r8) goto L9e
            int r7 = r2 + 1
            char r7 = r9.charAt(r7)
            if (r7 != r5) goto L9e
            int r7 = r2 + 2
            char r7 = r9.charAt(r7)
            if (r7 != r5) goto L9e
            int r7 = r2 + 3
            char r8 = r9.charAt(r7)
            if (r8 != r5) goto L9e
            java.util.HashMap r5 = a4.a.f275a
            java.lang.String r8 = "????"
            java.lang.Object r5 = r5.get(r8)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L9e
            goto L6d
        L9e:
            if (r4 != 0) goto La4
            java.lang.String r4 = a4.a.C0005a.h(r3)
        La4:
            r1.append(r4)
            r3 = 32
            r1.append(r3)
            int r2 = r2 + r6
            goto L12
        Laf:
            java.lang.String r9 = r1.toString()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.a.b(java.lang.String):java.lang.String");
    }
}
