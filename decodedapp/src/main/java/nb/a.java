package nb;

import vip.inode.demo.webrtc.AutomaticGainControlUtils;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static AutomaticGainControlUtils f22652c = new AutomaticGainControlUtils();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f22653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f22654b;

    public a(int i10, int i11) {
        long jAgcCreate = f22652c.agcCreate();
        this.f22653a = jAgcCreate;
        int iAgcInit = f22652c.agcInit(jAgcCreate, 0, 255, 3, i10);
        if (iAgcInit != 0) {
            throw new RuntimeException("error(" + iAgcInit + ") on init AutomaticGainControl");
        }
        int iAgcSetConfig = f22652c.agcSetConfig(this.f22653a, (short) 9, (short) 9, true);
        if (iAgcSetConfig == 0) {
            this.f22654b = i11;
            return;
        }
        throw new RuntimeException("error(" + iAgcSetConfig + ") on Config");
    }

    private void a() {
        if (this.f22653a == 0) {
            throw new IllegalStateException("Object has been released");
        }
    }

    public void b(short[] sArr, short[] sArr2) {
        a();
        AutomaticGainControlUtils automaticGainControlUtils = f22652c;
        long j10 = this.f22653a;
        int i10 = this.f22654b;
        automaticGainControlUtils.agcProcess(j10, sArr, i10, sArr.length / i10, sArr2, 0, 0, 0, false);
    }

    public void c() {
        long j10 = this.f22653a;
        if (j10 == 0) {
            return;
        }
        f22652c.agcFree(j10);
        this.f22653a = 0L;
    }

    protected void finalize() throws Throwable {
        try {
            c();
        } finally {
            super.finalize();
        }
    }
}
