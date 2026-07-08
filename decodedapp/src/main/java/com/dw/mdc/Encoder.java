package com.dw.mdc;

/* JADX INFO: loaded from: classes.dex */
public class Encoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f6892a;

    static {
        System.loadLibrary("mdc");
    }

    public Encoder(int i10) {
        this.f6892a = native_setup(i10);
    }

    private final native int native_get_samples(long j10, short[] sArr, int i10, int i11);

    private final native void native_release(long j10);

    private final native int native_set_packet(long j10, byte b10, byte b11, short s10, int i10, byte[] bArr);

    private final native long native_setup(int i10);

    public int a(short[] sArr, int i10, int i11) {
        long j10 = this.f6892a;
        if (j10 == 0) {
            return -1;
        }
        return native_get_samples(j10, sArr, i10, i11);
    }

    public void b() {
        long j10 = this.f6892a;
        if (j10 == 0) {
            return;
        }
        native_release(j10);
        this.f6892a = 0L;
    }

    public void c(byte b10, byte b11, short s10, int i10, byte[] bArr) {
        long j10 = this.f6892a;
        if (j10 == 0) {
            return;
        }
        native_set_packet(j10, b10, b11, s10, i10, bArr);
    }

    public void d(Packet packet) {
        c(packet.op, packet.argument, packet.address, packet.extraLen, packet.extra);
    }

    protected void finalize() throws Throwable {
        try {
            b();
        } finally {
            super.finalize();
        }
    }
}
