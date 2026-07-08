package com.dw.mdc;

/* JADX INFO: loaded from: classes.dex */
public class Decoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f6890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f6891b;

    static {
        System.loadLibrary("mdc");
    }

    public Decoder(int i10) {
        this.f6890a = native_setup(i10);
    }

    private final native int native_get_packet(long j10, Packet packet, byte[] bArr);

    private final native int native_process_samples(long j10, short[] sArr, int i10, int i11);

    private final native void native_release(long j10);

    private final native int native_reset(long j10);

    private final native long native_setup(int i10);

    public Packet a() {
        int i10 = this.f6891b;
        if (i10 != 1 && i10 != 2 && i10 != 3) {
            return null;
        }
        Packet packet = new Packet(i10 == 3);
        native_get_packet(this.f6890a, packet, packet.extra);
        return packet;
    }

    public int b(short[] sArr, int i10, int i11) {
        long j10 = this.f6890a;
        if (j10 == 0) {
            return -1;
        }
        int iNative_process_samples = native_process_samples(j10, sArr, i10, i11);
        this.f6891b = iNative_process_samples;
        return iNative_process_samples;
    }

    public void c() {
        long j10 = this.f6890a;
        if (j10 == 0) {
            return;
        }
        native_release(j10);
        this.f6890a = 0L;
    }

    public void d() {
        long j10 = this.f6890a;
        if (j10 == 0) {
            return;
        }
        native_reset(j10);
    }

    protected void finalize() throws Throwable {
        try {
            c();
        } finally {
            super.finalize();
        }
    }
}
