package gj;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public class m implements f {

    /* JADX INFO: renamed from: b */
    private final File f14627b;

    public m(File file) {
        if (!file.isDirectory()) {
            throw new hj.a(hj.f.NOT_A_DIRECTORY, file.getAbsolutePath());
        }
        this.f14627b = file;
    }

    public static /* synthetic */ InputStream b(File file) {
        return new FileInputStream(file);
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean c(java.util.regex.Pattern r11, gj.e r12, gj.g r13, java.io.File r14) throws java.io.IOException {
        /*
            r10 = this;
            java.io.File[] r0 = r14.listFiles()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto La3
            gj.k r14 = new gj.k
            r14.<init>()
            java.util.Arrays.sort(r0, r14)
            int r14 = r0.length
            r3 = 0
            r4 = 0
            r5 = 0
        L14:
            if (r4 >= r14) goto L9c
            r6 = r0[r4]
            boolean r7 = r12.c()     // Catch: hj.a -> L31
            if (r7 == 0) goto L98
            boolean r7 = r6.isDirectory()     // Catch: hj.a -> L31
            if (r7 == 0) goto L33
            boolean r6 = r10.c(r11, r12, r13, r6)     // Catch: hj.a -> L31
            if (r6 != 0) goto L2f
            if (r5 == 0) goto L2d
            goto L2f
        L2d:
            r5 = 0
            goto L98
        L2f:
            r5 = 1
            goto L98
        L31:
            r3 = move-exception
            goto L98
        L33:
            java.util.regex.Pattern r7 = gj.f.f14563a     // Catch: hj.a -> L31
            java.lang.String r8 = r6.getName()     // Catch: hj.a -> L31
            java.util.regex.Matcher r7 = r7.matcher(r8)     // Catch: hj.a -> L31
            boolean r7 = r7.matches()     // Catch: hj.a -> L31
            if (r7 == 0) goto L51
            gj.h0 r7 = new gj.h0     // Catch: hj.a -> L31
            r7.<init>(r6)     // Catch: hj.a -> L31
            boolean r6 = r7.a(r11, r12, r13)     // Catch: hj.a -> L31
            if (r6 != 0) goto L2f
            if (r5 == 0) goto L2d
            goto L2f
        L51:
            gj.h r7 = new gj.h     // Catch: hj.a -> L31
            java.lang.String r8 = r6.getName()     // Catch: hj.a -> L31
            gj.l r9 = new gj.l     // Catch: hj.a -> L31
            r9.<init>()     // Catch: hj.a -> L31
            r7.<init>(r8, r9)     // Catch: hj.a -> L31
            gj.n r8 = r13.e()     // Catch: hj.a -> L31
            gj.h r7 = r8.b(r7)     // Catch: hj.a -> L31
            java.lang.String r8 = r7.a()     // Catch: hj.a -> L31
            java.util.regex.Matcher r8 = r11.matcher(r8)     // Catch: hj.a -> L31
            boolean r8 = r8.matches()     // Catch: hj.a -> L31
            if (r8 == 0) goto L98
            gj.h$b r7 = r7.b()     // Catch: hj.a -> L31
            java.io.InputStream r7 = r7.b()     // Catch: hj.a -> L31
            java.lang.String r6 = r6.getPath()     // Catch: java.lang.Throwable -> L8c
            r12.a(r7, r6)     // Catch: java.lang.Throwable -> L8c
            if (r7 == 0) goto L2f
            r7.close()     // Catch: hj.a -> L8a
            goto L2f
        L8a:
            r3 = move-exception
            goto L2f
        L8c:
            r3 = move-exception
            if (r7 == 0) goto L97
            r7.close()     // Catch: java.lang.Throwable -> L93
            goto L97
        L93:
            r6 = move-exception
            r3.addSuppressed(r6)     // Catch: hj.a -> L31
        L97:
            throw r3     // Catch: hj.a -> L31
        L98:
            int r4 = r4 + 1
            goto L14
        L9c:
            if (r5 != 0) goto La2
            if (r3 != 0) goto La1
            goto La2
        La1:
            throw r3
        La2:
            return r5
        La3:
            hj.a r11 = new hj.a
            hj.f r12 = hj.f.NOT_A_DIRECTORY
            java.lang.String r13 = r14.getAbsolutePath()
            java.lang.Object[] r14 = new java.lang.Object[r1]
            r14[r2] = r13
            r11.<init>(r12, r14)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: gj.m.c(java.util.regex.Pattern, gj.e, gj.g, java.io.File):boolean");
    }

    @Override // gj.f
    public boolean a(Pattern pattern, e eVar, g gVar) {
        try {
            return c(pattern, eVar, gVar, this.f14627b);
        } catch (IOException | ParseException e10) {
            throw new hj.a(e10, new ui.a(e10.getMessage()), new Object[0]);
        }
    }
}
