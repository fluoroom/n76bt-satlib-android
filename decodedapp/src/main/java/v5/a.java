package v5;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f30296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f30297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f30298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte[] f30299d = new byte[WXMediaMessage.DESCRIPTION_LENGTH_LIMIT];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f30300e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f30301f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f30302g;

    @Override // v5.b
    public void a(boolean z10) {
        int i10;
        int i11 = this.f30302g + 1;
        this.f30302g = i11;
        int i12 = this.f30296a << 1;
        this.f30296a = i12;
        if (z10) {
            this.f30296a = i12 | 1;
        }
        int i13 = this.f30296a;
        if ((i13 & 255) == 126) {
            this.f30302g = 0;
            if ((i13 & 65535) == 32382) {
                this.f30301f++;
            } else {
                this.f30301f = 1;
            }
            if (this.f30297b && (i10 = this.f30298c) > 2) {
                if (t5.a.a(this.f30299d, 0, i10)) {
                    c(this.f30299d, 0, this.f30298c - 2);
                } else {
                    b(this.f30299d, 0, this.f30298c);
                }
            }
            this.f30297b = true;
            this.f30298c = 0;
            this.f30300e = 128;
            return;
        }
        if (!this.f30297b) {
            if (i11 > 8) {
                this.f30301f = 0;
                return;
            }
            return;
        }
        if ((i13 & 127) == 127) {
            this.f30297b = false;
            return;
        }
        if ((i13 & 63) == 62) {
            return;
        }
        if ((i13 & 1) > 0) {
            this.f30300e |= 256;
        }
        int i14 = this.f30300e;
        if ((i14 & 1) <= 0) {
            this.f30300e = i14 >>> 1;
            return;
        }
        int i15 = this.f30298c;
        byte[] bArr = this.f30299d;
        if (i15 >= bArr.length) {
            this.f30297b = false;
            return;
        }
        this.f30298c = i15 + 1;
        bArr[i15] = (byte) (i14 >>> 1);
        this.f30300e = 128;
    }

    protected abstract void b(byte[] bArr, int i10, int i11);

    protected abstract void c(byte[] bArr, int i10, int i11);
}
