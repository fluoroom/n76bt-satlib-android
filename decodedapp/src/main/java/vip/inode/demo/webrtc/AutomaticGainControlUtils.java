package vip.inode.demo.webrtc;

/* JADX INFO: loaded from: classes3.dex */
public class AutomaticGainControlUtils {
    static {
        System.loadLibrary("legacy_agc-lib");
    }

    public native long agcCreate();

    public native int agcFree(long j10);

    public native int agcInit(long j10, int i10, int i11, int i12, int i13);

    public native int agcProcess(long j10, short[] sArr, int i10, int i11, short[] sArr2, int i12, int i13, int i14, boolean z10);

    public native int agcSetConfig(long j10, short s10, short s11, boolean z10);
}
