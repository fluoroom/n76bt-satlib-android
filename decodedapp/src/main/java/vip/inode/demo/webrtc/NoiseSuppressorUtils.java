package vip.inode.demo.webrtc;

/* JADX INFO: loaded from: classes3.dex */
public class NoiseSuppressorUtils {
    static {
        System.loadLibrary("legacy_ns-lib");
    }

    public native long nsxCreate();

    public native int nsxFree(long j10);

    public native int nsxInit(long j10, int i10);

    public native int nsxProcess(long j10, short[] sArr, int i10, short[] sArr2);

    public native int nsxSetPolicy(long j10, int i10);
}
