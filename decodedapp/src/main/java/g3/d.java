package g3;

import g3.a;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f13502a = 32766;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f13503b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f13504c = null;

    public d(byte[] bArr, boolean z10) {
        if (z10) {
            b(bArr, bArr.length);
        } else {
            a(bArr, bArr.length);
        }
    }

    private void a(byte[] bArr, int i10) {
        int i11 = i10 - 8;
        if ((bArr[2] & 1) != 0) {
            i11 = i10 - 9;
        }
        this.f13502a = h(bArr, 4);
        this.f13503b = h(bArr, 6);
        if (i11 > 0) {
            this.f13504c = new byte[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                this.f13504c[i12] = bArr[i12 + 8];
            }
        }
    }

    private void b(byte[] bArr, int i10) {
        int i11 = i10 - 4;
        this.f13502a = h(bArr, 0);
        this.f13503b = h(bArr, 2);
        if (i11 > 0) {
            this.f13504c = new byte[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                this.f13504c[i12] = bArr[i12 + 4];
            }
        }
    }

    private int h(byte[] bArr, int i10) {
        try {
            return (bArr[i10 + 1] & MessagePack.Code.EXT_TIMESTAMP) | ((bArr[i10] & MessagePack.Code.EXT_TIMESTAMP) << 8);
        } catch (ArrayIndexOutOfBoundsException unused) {
            return 0;
        }
    }

    public int c() {
        return d(1);
    }

    public int d(int i10) {
        try {
            return this.f13504c[i10];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return 0;
        }
    }

    public int e() {
        return this.f13503b & 32767;
    }

    public int f() {
        return this.f13503b;
    }

    public a.EnumC0194a g() {
        byte[] bArr = this.f13504c;
        if (bArr == null || bArr.length == 0 || !p(16387)) {
            return null;
        }
        return a.EnumC0194a.d(this.f13504c[0]);
    }

    public byte[] i() {
        return this.f13504c;
    }

    public int j() {
        return k(1);
    }

    public int k(int i10) {
        return h(this.f13504c, i10);
    }

    public a.b l() {
        byte[] bArr = this.f13504c;
        if (bArr == null || bArr.length == 0 || !n()) {
            return null;
        }
        return a.b.d(this.f13504c[0]);
    }

    public int m() {
        return this.f13502a;
    }

    public boolean n() {
        return (this.f13503b & 32768) != 0;
    }

    public boolean o() {
        return this.f13502a == 10;
    }

    public boolean p(int i10) {
        return o() && this.f13503b == i10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(a.g(m()));
        sb2.append(" ");
        sb2.append(a.g(f()));
        byte[] bArr = this.f13504c;
        if (bArr != null) {
            for (byte b10 : bArr) {
                sb2.append(" ");
                sb2.append(a.f(b10));
            }
        }
        return sb2.toString();
    }

    public d(byte[] bArr, int i10) {
        a(bArr, i10);
    }
}
