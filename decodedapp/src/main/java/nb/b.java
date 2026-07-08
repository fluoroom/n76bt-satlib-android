package nb;

import vip.inode.demo.webrtc.NoiseSuppressorUtils;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static NoiseSuppressorUtils f22655c = new NoiseSuppressorUtils();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f22656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f22657b;

    public b(int i10, int i11, int i12) {
        long jNsxCreate = f22655c.nsxCreate();
        this.f22656a = jNsxCreate;
        int iNsxInit = f22655c.nsxInit(jNsxCreate, i10);
        if (iNsxInit != 0) {
            throw new RuntimeException("error(" + iNsxInit + ") on init NoiseSuppressor");
        }
        int iNsxSetPolicy = f22655c.nsxSetPolicy(this.f22656a, i11);
        if (iNsxSetPolicy == 0) {
            this.f22657b = i12;
            return;
        }
        throw new RuntimeException("error(" + iNsxSetPolicy + ") on SetPolicy");
    }

    private void a() {
        if (this.f22656a == 0) {
            throw new IllegalStateException("Object has been released");
        }
    }

    public void b(short[] sArr, short[] sArr2) {
        a();
        f22655c.nsxProcess(this.f22656a, sArr, this.f22657b, sArr2);
    }

    public void c() {
        long j10 = this.f22656a;
        if (j10 == 0) {
            return;
        }
        f22655c.nsxFree(j10);
        this.f22656a = 0L;
    }

    protected void finalize() throws Throwable {
        try {
            c();
        } finally {
            super.finalize();
        }
    }
}
