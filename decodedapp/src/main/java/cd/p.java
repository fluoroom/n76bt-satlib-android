package cd;

import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes3.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f4653a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f4654b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int f4655c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected int f4656d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f4657e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected int f4658f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected long f4659g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected byte[] f4660h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected long f4661i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected boolean f4662j = false;

    protected boolean a(int i10) {
        byte[] bArr = this.f4660h;
        byte b10 = bArr[i10];
        this.f4654b = (b10 & MessagePack.Code.NIL) >>> 6;
        this.f4655c = (b10 & 32) >>> 5;
        this.f4656d = b10 & 31;
        byte b11 = bArr[i10 + 1];
        this.f4657e = b11;
        if (b11 < 0) {
            this.f4657e = b11 + 256;
        }
        this.f4658f = y.a(bArr, i10 + 2);
        int i11 = this.f4657e;
        if (i11 > 207 || i11 < 200) {
            System.out.println("RtcpPkt.parseHeaders problem discovered, packetType " + this.f4657e);
        }
        if (this.f4654b == 2 && this.f4658f < 65536) {
            return true;
        }
        System.out.println("RtcpPkt.parseHeaders() failed header checks, check size and version");
        this.f4653a = -1;
        return false;
    }

    protected void b() {
        byte b10 = (byte) (((byte) (((byte) (this.f4654b << 6)) | (this.f4655c << 5))) | this.f4656d);
        byte[] bArr = this.f4660h;
        bArr[0] = b10;
        bArr[1] = (byte) this.f4657e;
        if (bArr.length % 4 != 0) {
            System.out.println("!!!! RtcpPkt.writeHeaders() rawPkt was not a multiple of 32 bits / 4 octets!");
        }
        byte[] bArrD = y.d((this.f4660h.length / 4) - 1);
        byte[] bArr2 = this.f4660h;
        bArr2[2] = bArrD[0];
        bArr2[3] = bArrD[1];
    }
}
