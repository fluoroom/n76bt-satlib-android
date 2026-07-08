package cd;

import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes3.dex */
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f4698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f4699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f4700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f4701d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f4702e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f4703f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f4704g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f4705h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f4706i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long[] f4707j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private byte[] f4708k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private byte[] f4709l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private byte[] f4710m;

    protected x(long j10, long j11, int i10, int i11, byte[] bArr, byte[] bArr2) {
        this.f4698a = false;
        this.f4699b = 2;
        this.f4701d = 0;
        this.f4702e = 0;
        this.f4707j = null;
        this.f4708k = null;
        this.f4709l = null;
        this.f4710m = null;
        if (v(j10) + u(j11) + t(i10) + s(i11) + r(bArr) + p(bArr2) != 0) {
            System.out.println("RtpPkt() failed, check with checkPkt()");
        }
        this.f4698a = true;
    }

    private void A() {
        this.f4706i = y.b(this.f4708k, 8);
    }

    private void B() {
        this.f4705h = y.b(this.f4708k, 4);
    }

    private void C() {
        byte bD = (byte) (((byte) (((byte) (((byte) (this.f4699b << 6)) | (this.f4700c << 5))) | (this.f4701d << 4))) | d());
        byte[] bArr = this.f4708k;
        bArr[0] = bD;
        bArr[1] = (byte) (((byte) (this.f4702e << 7)) | this.f4703f);
        byte[] bArrD = y.d(this.f4704g);
        byte[] bArr2 = this.f4708k;
        bArr2[2] = bArrD[0];
        bArr2[3] = bArrD[1];
    }

    private void D() {
        int iH = h();
        int iF = f();
        int iD = d();
        this.f4708k = new byte[iF + iH];
        C();
        byte[] bArrE = y.e(this.f4705h);
        for (int i10 = 0; i10 < 4; i10++) {
            this.f4708k[i10 + 4] = bArrE[i10];
        }
        System.arraycopy(y.e(this.f4706i), 0, this.f4708k, 8, 4);
        for (int i11 = 0; i11 < iD; i11++) {
            System.arraycopy(y.e(this.f4707j[i11]), 0, this.f4708k, (i11 * 4) + 12, 4);
        }
        byte[] bArr = this.f4710m;
        if (bArr != null) {
            System.arraycopy(bArr, 0, this.f4708k, iF - bArr.length, bArr.length);
        }
        System.arraycopy(this.f4709l, 0, this.f4708k, iF, iH);
        this.f4698a = true;
    }

    public static boolean n(byte[] bArr, int i10) {
        return bArr != null && i10 >= 12 && ((bArr[0] & MessagePack.Code.NIL) >>> 6) == 2;
    }

    private void w() {
        for (int i10 = 0; i10 < this.f4707j.length; i10++) {
            this.f4706i = y.b(this.f4708k, (i10 * 4) + 12);
        }
    }

    private int x(int i10) {
        int iF = f();
        int iA = (y.a(this.f4708k, iF + 2) + 1) * 4;
        if (iA > i10) {
            return 0;
        }
        byte[] bArr = new byte[iA];
        this.f4710m = bArr;
        System.arraycopy(this.f4708k, iF, bArr, 0, bArr.length);
        return this.f4710m.length;
    }

    private void y() {
        byte[] bArr = this.f4708k;
        int i10 = bArr[0];
        this.f4699b = (i10 & 192) >>> 6;
        this.f4700c = (i10 & 32) >>> 5;
        this.f4701d = (i10 & 16) >>> 4;
        this.f4707j = new long[i10 & 15];
        byte b10 = bArr[1];
        this.f4702e = (b10 & 128) >> 7;
        this.f4703f = b10 & 127;
        this.f4704g = y.a(bArr, 2);
    }

    private void z(int i10) {
        this.f4709l = new byte[i10];
        System.arraycopy(this.f4708k, f(), this.f4709l, 0, i10);
    }

    protected int a() {
        return 0;
    }

    protected byte[] b() {
        if (!this.f4698a || this.f4708k == null) {
            D();
        }
        return this.f4708k;
    }

    protected long[] c() {
        return this.f4707j;
    }

    protected int d() {
        long[] jArr = this.f4707j;
        if (jArr != null) {
            return jArr.length;
        }
        return 0;
    }

    protected byte[] e() {
        return this.f4710m;
    }

    protected int f() {
        int iD = (d() * 4) + 12;
        byte[] bArr = this.f4710m;
        return iD + (bArr == null ? 0 : bArr.length);
    }

    protected byte[] g() {
        byte[] bArr = this.f4709l;
        return bArr == null ? new byte[0] : bArr;
    }

    protected int h() {
        byte[] bArr = this.f4709l;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    protected int i() {
        return this.f4703f;
    }

    protected int j() {
        return this.f4704g;
    }

    protected long k() {
        return this.f4706i;
    }

    protected long l() {
        return this.f4705h;
    }

    protected boolean m() {
        return this.f4702e != 0;
    }

    protected int o(long[] jArr) {
        if (jArr.length <= 16) {
            this.f4707j = jArr;
            return 0;
        }
        System.out.println("RtpPkt.setCsrcs: Cannot have more than 16 CSRCs");
        return -1;
    }

    protected int p(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            if (this.f4710m != null) {
                this.f4698a = false;
            }
            this.f4710m = null;
            this.f4701d = 0;
            return 0;
        }
        if (bArr.length % 4 != 0) {
            System.out.println("RtpPkt.setExtension: the length must be a multiple of uint32 (4).");
            return -1;
        }
        if (bArr.length != (y.a(bArr, 2) + 1) * 4) {
            System.out.println("RtpPkt.setExtension: the length field must be in the 3rd and 4th byte (uint16).");
            return -1;
        }
        if (bArr.length >= 1024) {
            System.out.println("RtpPkt.setExtension: Cannot carry more than 1024 bytes for now.");
            return -1;
        }
        this.f4701d = 1;
        this.f4698a = false;
        this.f4710m = bArr;
        return 0;
    }

    protected void q(boolean z10) {
        this.f4698a = false;
        if (z10) {
            this.f4702e = 1;
        } else {
            this.f4702e = 0;
        }
    }

    protected int r(byte[] bArr) {
        if (bArr.length >= 10228) {
            System.out.println("RtpPkt.setPayload: Cannot carry more than 65523 bytes for now.");
            return -1;
        }
        this.f4698a = false;
        this.f4709l = bArr;
        return 0;
    }

    protected int s(int i10) {
        int i11 = i10 & 127;
        if (i11 != i10) {
            return -1;
        }
        this.f4698a = false;
        this.f4703f = i11;
        return 0;
    }

    protected int t(int i10) {
        if (i10 > 65536 || i10 < 0) {
            System.out.println("RtpPkt.setSeqNumber: invalid number");
            return -1;
        }
        this.f4698a = false;
        this.f4704g = i10;
        return 0;
    }

    protected int u(long j10) {
        this.f4698a = false;
        this.f4706i = j10;
        return 0;
    }

    protected int v(long j10) {
        this.f4698a = false;
        this.f4705h = j10;
        return 0;
    }

    protected x(byte[] bArr, int i10) {
        this.f4698a = false;
        this.f4699b = 2;
        this.f4701d = 0;
        this.f4702e = 0;
        this.f4707j = null;
        this.f4708k = null;
        this.f4709l = null;
        this.f4710m = null;
        if (bArr == null) {
            System.out.println("RtpPkt(byte[]) Packet null");
        }
        int iX = i10 - 12;
        if (iX >= 0) {
            this.f4708k = bArr;
            y();
            if (this.f4699b == 2) {
                B();
                A();
                if (iX > 4 && d() > 0) {
                    w();
                    iX -= this.f4707j.length * 4;
                }
                iX = this.f4701d != 0 ? iX - x(iX) : iX;
                if (iX > 0) {
                    z(iX);
                }
                a();
                this.f4698a = true;
            } else {
                System.out.println("RtpPkt(byte[]) Packet is not version 2, giving up.");
            }
        } else {
            System.out.println("RtpPkt(byte[]) Packet too small to be sliced");
        }
        this.f4698a = true;
    }
}
