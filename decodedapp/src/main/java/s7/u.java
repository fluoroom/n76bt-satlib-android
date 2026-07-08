package s7;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
abstract class u extends s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final WeakReference f27008e = new WeakReference(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private WeakReference f27009d;

    u(byte[] bArr) {
        super(bArr);
        this.f27009d = f27008e;
    }

    protected abstract byte[] v1();

    @Override // s7.s
    final byte[] x() {
        byte[] bArrV1;
        synchronized (this) {
            try {
                bArrV1 = (byte[]) this.f27009d.get();
                if (bArrV1 == null) {
                    bArrV1 = v1();
                    this.f27009d = new WeakReference(bArrV1);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bArrV1;
    }
}
