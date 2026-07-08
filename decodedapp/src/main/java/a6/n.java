package a6;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {
    public static void a(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    public static boolean b(File file) {
        File[] fileArrListFiles;
        if (file.isFile()) {
            return file.delete();
        }
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                b(file2);
            }
        }
        return file.delete();
    }

    public static byte[] c(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            byte[] bArrD = d(fileInputStream);
            fileInputStream.close();
            return bArrD;
        } catch (Throwable th2) {
            try {
                fileInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static byte[] d(InputStream inputStream) throws NoSuchAlgorithmException, IOException {
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        byte[] bArr = new byte[8192];
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 < 0) {
                return messageDigest.digest();
            }
            messageDigest.update(bArr, 0, i10);
        }
    }

    public static byte[] e(byte[] bArr) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        messageDigest.update(bArr);
        return messageDigest.digest();
    }

    public static String f(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : bArr) {
            String hexString = Integer.toHexString(b10 & MessagePack.Code.EXT_TIMESTAMP);
            if (hexString.length() == 1) {
                sb2.append('0');
            }
            sb2.append(hexString);
        }
        return sb2.toString();
    }

    public static boolean g(File file, File file2) {
        if (!file.exists() || !file.isDirectory()) {
            return false;
        }
        if (!file2.exists()) {
            file2.mkdirs();
        }
        for (File file3 : file.listFiles()) {
            if (file3.isFile()) {
                h(file3, file2);
            } else if (file3.isDirectory()) {
                g(file3, new File(file2, file3.getName()));
            }
        }
        return file.delete();
    }

    public static boolean h(File file, File file2) {
        if (!file.exists() || !file.isFile()) {
            return false;
        }
        if (!file2.exists()) {
            file2.mkdirs();
        }
        return file.renameTo(new File(file2, file.getName()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        if (r6 != r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0045, code lost:
    
        return java.util.Arrays.copyOf(r0, r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static byte[] i(java.io.InputStream r5, int r6) throws java.io.IOException {
        /*
            byte[] r0 = new byte[r6]
            r1 = 0
        L3:
            int r2 = r6 - r1
            int r2 = r5.read(r0, r1, r2)
            if (r2 <= 0) goto Ld
            int r1 = r1 + r2
            goto L3
        Ld:
            if (r2 < 0) goto L3e
            int r2 = r5.read()
            if (r2 >= 0) goto L16
            goto L3e
        L16:
            r3 = 2147483639(0x7ffffff7, float:NaN)
            int r4 = r3 - r6
            if (r6 > r4) goto L26
            int r6 = r6 << 1
            r3 = 8192(0x2000, float:1.14794E-41)
            int r6 = java.lang.Math.max(r6, r3)
            goto L2b
        L26:
            if (r6 == r3) goto L36
            r6 = 2147483639(0x7ffffff7, float:NaN)
        L2b:
            byte[] r0 = java.util.Arrays.copyOf(r0, r6)
            int r3 = r1 + 1
            byte r2 = (byte) r2
            r0[r1] = r2
            r1 = r3
            goto L3
        L36:
            java.lang.OutOfMemoryError r5 = new java.lang.OutOfMemoryError
            java.lang.String r6 = "Required array size too large"
            r5.<init>(r6)
            throw r5
        L3e:
            if (r6 != r1) goto L41
            return r0
        L41:
            byte[] r5 = java.util.Arrays.copyOf(r0, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.n.i(java.io.InputStream, int):byte[]");
    }

    public static byte[] j(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length <= 2147483639) {
                return i(fileInputStream, (int) length);
            }
            throw new OutOfMemoryError("Required array size too large");
        } finally {
            fileInputStream.close();
        }
    }
}
