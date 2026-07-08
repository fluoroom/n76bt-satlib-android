package v5;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;

/* JADX INFO: loaded from: classes.dex */
public abstract class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f30303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f30304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f30305c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte[] f30306d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f30307e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f30308f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f30309g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f30310h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f30311i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f30312j;

    public c() {
        this(213);
    }

    @Override // v5.b
    public void a(boolean z10) {
        int i10;
        int i11 = this.f30309g + 1;
        this.f30309g = i11;
        int i12 = this.f30303a << 1;
        this.f30303a = i12;
        if (z10) {
            this.f30303a = i12 | 1;
        }
        int i13 = this.f30303a;
        if ((i13 & 65535) == this.f30311i) {
            this.f30309g = 0;
            if ((i13 & 65535) == this.f30312j) {
                this.f30308f++;
            } else {
                this.f30308f = 1;
            }
            if (this.f30304b && (i10 = this.f30305c) > 2) {
                b(this.f30306d, 0, i10);
            }
            this.f30304b = true;
            this.f30305c = 0;
            this.f30307e = 128;
            return;
        }
        if (!this.f30304b) {
            if (i11 > 8) {
                this.f30308f = 0;
                return;
            }
            return;
        }
        if (z10) {
            this.f30307e |= 256;
        }
        int i14 = this.f30307e;
        if ((i14 & 1) <= 0) {
            this.f30307e = i14 >>> 1;
            return;
        }
        if (z10) {
            b(this.f30306d, 0, this.f30305c);
            this.f30304b = false;
            return;
        }
        int i15 = this.f30305c;
        byte[] bArr = this.f30306d;
        if (i15 >= bArr.length) {
            this.f30304b = false;
            return;
        }
        int i16 = i14 >>> 1;
        int i17 = i15 + 1;
        this.f30305c = i17;
        bArr[i15] = (byte) i16;
        this.f30307e = 128;
        if (i16 == 43) {
            this.f30310h = 3;
        } else if (i16 == 45) {
            int i18 = this.f30310h - 1;
            this.f30310h = i18;
            if (i18 == 0) {
                c(bArr, 0, i17);
                this.f30304b = false;
            }
        }
        if (this.f30305c != 4) {
            return;
        }
        int i19 = 0;
        while (true) {
            int i20 = this.f30305c;
            if (i19 >= i20) {
                c(this.f30306d, 0, i20);
                this.f30304b = false;
                return;
            } else if (this.f30306d[i19] != 78) {
                return;
            } else {
                i19++;
            }
        }
    }

    protected abstract void b(byte[] bArr, int i10, int i11);

    protected abstract void c(byte[] bArr, int i10, int i11);

    public c(int i10) {
        this.f30306d = new byte[WXMediaMessage.DESCRIPTION_LENGTH_LIMIT];
        this.f30310h = -1;
        int i11 = i10 | (i10 << 8);
        this.f30311i = i11;
        this.f30312j = i11;
    }
}
