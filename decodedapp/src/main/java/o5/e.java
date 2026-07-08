package o5;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0064, code lost:
    
        s3.b.d("AudioUtils", "重新采样错误");
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static short[] a(java.io.File r12) throws java.lang.Throwable {
        /*
            r1 = 0
            if (r12 == 0) goto Lb0
            boolean r0 = r12.isFile()
            if (r0 != 0) goto Lb
            goto Lb0
        Lb:
            r0 = 960000(0xea600, float:1.345247E-39)
            short[] r2 = new short[r0]
            r3 = 0
            x3.a r4 = new x3.a     // Catch: java.lang.Throwable -> L8d java.io.IOException -> L91
            r4.<init>(r12)     // Catch: java.lang.Throwable -> L8d java.io.IOException -> L91
            r12 = 2880(0xb40, float:4.036E-42)
            short[] r6 = new short[r12]     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L4b
            int r0 = r4.j()     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L4b
            r5 = 32000(0x7d00, float:4.4842E-41)
            if (r0 == r5) goto L50
            com.dw.audio.codec.Resample r7 = new com.dw.audio.codec.Resample     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L4b
            int r0 = r4.j()     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L4b
            r7.<init>(r0, r5)     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L4b
            int r0 = r4.j()     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3f
            r1 = 92160000(0x57e4000, float:1.19547775E-35)
            int r1 = r1 / r0
            short[] r0 = new short[r1]     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3f
            r9 = r0
            r5 = r7
        L37:
            r1 = 0
            goto L53
        L39:
            r0 = move-exception
            r12 = r0
            r1 = r4
            r5 = r7
            goto La7
        L3f:
            r0 = move-exception
            r12 = r0
            r1 = r4
            r5 = r7
            goto L94
        L45:
            r0 = move-exception
            r12 = r0
            r5 = r1
        L48:
            r1 = r4
            goto La7
        L4b:
            r0 = move-exception
            r12 = r0
            r5 = r1
        L4e:
            r1 = r4
            goto L94
        L50:
            r5 = r1
            r9 = r6
            goto L37
        L53:
            int r8 = r4.P(r6, r3, r12)     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6f
            if (r8 <= 0) goto L84
            if (r5 == 0) goto L73
            int r11 = r9.length     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6f
            r7 = 0
            r10 = 0
            int r8 = r5.b(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6f
            if (r8 > 0) goto L73
            java.lang.String r12 = "AudioUtils"
            java.lang.String r0 = "重新采样错误"
            s3.b.d(r12, r0)     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6f
            goto L84
        L6c:
            r0 = move-exception
            r12 = r0
            goto L48
        L6f:
            r0 = move-exception
            r12 = r0
            r3 = r1
            goto L4e
        L73:
            int r0 = r1 + r8
            int r7 = r2.length     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6f
            if (r0 <= r7) goto L7f
            int r7 = r2.length     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6f
            int r7 = r7 * 2
            short[] r2 = java.util.Arrays.copyOf(r2, r7)     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6f
        L7f:
            d4.a.b(r2, r1, r9, r3, r8)     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6f
            r1 = r0
            goto L53
        L84:
            a6.n.a(r4)
            if (r5 == 0) goto La0
            r5.c()
            goto La0
        L8d:
            r0 = move-exception
            r12 = r0
            r5 = r1
            goto La7
        L91:
            r0 = move-exception
            r12 = r0
            r5 = r1
        L94:
            r12.printStackTrace()     // Catch: java.lang.Throwable -> La5
            a6.n.a(r1)
            if (r5 == 0) goto L9f
            r5.c()
        L9f:
            r1 = r3
        La0:
            short[] r12 = java.util.Arrays.copyOf(r2, r1)
            return r12
        La5:
            r0 = move-exception
            r12 = r0
        La7:
            a6.n.a(r1)
            if (r5 == 0) goto Laf
            r5.c()
        Laf:
            throw r12
        Lb0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.e.a(java.io.File):short[]");
    }
}
