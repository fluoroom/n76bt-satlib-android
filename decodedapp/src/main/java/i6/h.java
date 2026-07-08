package i6;

import com.facebook.stetho.websocket.CloseCodes;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f15801a = c.d(true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f15802b = c.c(true);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final h f15803c = new h();

    private int a(int i10, char[] cArr) {
        cArr[1] = (char) i10;
        return 2;
    }

    private int b(int i10, char[] cArr) {
        cArr[1] = 'u';
        char[] cArr2 = f15801a;
        cArr[4] = cArr2[i10 >> 4];
        cArr[5] = cArr2[i10 & 15];
        return 6;
    }

    static int c(int i10) {
        return Math.min(Math.max(16, i10 + Math.min((i10 >> 3) + 6, CloseCodes.NORMAL_CLOSURE)), 32000);
    }

    private char[] d() {
        return new char[]{'\\', 0, '0', '0', 0, 0};
    }

    public static h e() {
        return f15803c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        r9 = r7 + 1;
        r7 = r13.charAt(r7);
        r10 = r2[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        if (r10 >= 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        r7 = b(r7, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        r7 = a(r10, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        r10 = r8 + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        if (r10 <= r1.length) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        r10 = r1.length - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        if (r10 <= 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
    
        java.lang.System.arraycopy(r6, 0, r1, r8, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        if (r5 != null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
    
        r5 = o6.p.o(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        r1 = r5.n();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
    
        r7 = r7 - r10;
        java.lang.System.arraycopy(r6, r10, r1, 0, r7);
        r8 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
    
        throw new java.lang.IllegalStateException(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        java.lang.System.arraycopy(r6, 0, r1, r8, r7);
        r8 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        if (r6 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        r6 = d();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public char[] f(java.lang.String r13) {
        /*
            r12 = this;
            int r0 = r13.length()
            int r1 = c(r0)
            char[] r1 = new char[r1]
            int[] r2 = i6.c.e()
            int r3 = r2.length
            r4 = 0
            r5 = 0
            r6 = r5
            r7 = 0
            r8 = 0
        L14:
            if (r7 >= r0) goto L84
        L16:
            char r9 = r13.charAt(r7)
            if (r9 >= r3) goto L62
            r10 = r2[r9]
            if (r10 == 0) goto L62
            if (r6 != 0) goto L26
            char[] r6 = r12.d()
        L26:
            int r9 = r7 + 1
            char r7 = r13.charAt(r7)
            r10 = r2[r7]
            if (r10 >= 0) goto L35
            int r7 = r12.b(r7, r6)
            goto L39
        L35:
            int r7 = r12.a(r10, r6)
        L39:
            int r10 = r8 + r7
            int r11 = r1.length
            if (r10 <= r11) goto L5c
            int r10 = r1.length
            int r10 = r10 - r8
            if (r10 <= 0) goto L45
            java.lang.System.arraycopy(r6, r4, r1, r8, r10)
        L45:
            if (r5 != 0) goto L4b
            o6.p r5 = o6.p.o(r1)
        L4b:
            char[] r1 = r5.n()     // Catch: java.io.IOException -> L55
            int r7 = r7 - r10
            java.lang.System.arraycopy(r6, r10, r1, r4, r7)
            r8 = r7
            goto L60
        L55:
            r13 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r13)
            throw r0
        L5c:
            java.lang.System.arraycopy(r6, r4, r1, r8, r7)
            r8 = r10
        L60:
            r7 = r9
            goto L14
        L62:
            int r10 = r1.length
            if (r8 < r10) goto L78
            if (r5 != 0) goto L6b
            o6.p r5 = o6.p.o(r1)
        L6b:
            char[] r1 = r5.n()     // Catch: java.io.IOException -> L71
            r8 = 0
            goto L78
        L71:
            r13 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r13)
            throw r0
        L78:
            int r10 = r8 + 1
            r1[r8] = r9
            int r7 = r7 + 1
            if (r7 < r0) goto L82
            r8 = r10
            goto L84
        L82:
            r8 = r10
            goto L16
        L84:
            if (r5 != 0) goto L8b
            char[] r13 = java.util.Arrays.copyOfRange(r1, r4, r8)
            return r13
        L8b:
            r5.y(r8)
            char[] r13 = r5.h()     // Catch: java.io.IOException -> L93
            return r13
        L93:
            r13 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i6.h.f(java.lang.String):char[]");
    }
}
