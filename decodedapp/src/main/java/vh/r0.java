package vh;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r0 {
    public static final byte[] a(String str) {
        rd.m.e(str, "<this>");
        byte[] bytes = str.getBytes(rg.d.f26007b);
        rd.m.d(bytes, "getBytes(...)");
        return bytes;
    }

    public static final ReentrantLock b() {
        return new ReentrantLock();
    }

    public static final String c(byte[] bArr) {
        rd.m.e(bArr, "<this>");
        return new String(bArr, rg.d.f26007b);
    }
}
