package com.facebook.stetho.common;

import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class ProcessUtil {
    private static final int CMDLINE_BUFFER_SIZE = 64;
    private static String sProcessName;
    private static boolean sProcessNameRead;

    public static synchronized String getProcessName() {
        if (!sProcessNameRead) {
            sProcessNameRead = true;
            try {
                sProcessName = readProcessName();
            } catch (IOException unused) {
            }
        }
        return sProcessName;
    }

    private static int indexOf(byte[] bArr, int i10, int i11, byte b10) {
        for (int i12 = 0; i12 < bArr.length; i12++) {
            if (bArr[i12] == b10) {
                return i12;
            }
        }
        return -1;
    }

    private static String readProcessName() throws Throwable {
        int i10;
        byte[] bArr = new byte[64];
        FileInputStream fileInputStream = new FileInputStream("/proc/self/cmdline");
        boolean z10 = false;
        try {
            i10 = fileInputStream.read(bArr);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            int iIndexOf = indexOf(bArr, 0, i10, (byte) 0);
            if (iIndexOf > 0) {
                i10 = iIndexOf;
            }
            String str = new String(bArr, 0, i10);
            Util.close(fileInputStream, false);
            return str;
        } catch (Throwable th3) {
            th = th3;
            z10 = true;
            Util.close(fileInputStream, true ^ z10);
            throw th;
        }
    }
}
