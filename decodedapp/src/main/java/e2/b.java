package e2;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f11346a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f11348c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f11347b = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f11349d = 20;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f11350e = 0;

    public b(byte[] bArr) {
        this.f11346a = bArr;
    }

    private byte[] c(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    byte[] a(int i10) {
        int length = this.f11347b;
        if (length == -1) {
            length = this.f11346a.length;
        }
        int iMin = Math.min(length, this.f11349d - i10);
        int i11 = this.f11347b;
        if (i11 != -1) {
            int i12 = this.f11350e;
            int i13 = this.f11348c;
            if ((i12 - i13) + iMin > i11) {
                iMin = i11 - (i12 - i13);
            }
        }
        int i14 = this.f11350e;
        int i15 = i14 + iMin;
        byte[] bArr = this.f11346a;
        if (i15 > bArr.length) {
            iMin = bArr.length - i14;
        }
        byte[] bArr2 = new byte[iMin];
        System.arraycopy(bArr, i14, bArr2, 0, iMin);
        this.f11350e += iMin;
        return bArr2;
    }

    public byte[] b() {
        return c(this.f11346a);
    }

    public int d() {
        return (this.f11350e * 100) / this.f11346a.length;
    }

    public int e() {
        return this.f11350e;
    }

    byte[] f(int i10) {
        int length = this.f11347b;
        if (length == -1) {
            length = this.f11346a.length;
        }
        int iMin = Math.min(length, this.f11349d - i10);
        int i11 = this.f11350e;
        int i12 = i11 + iMin;
        byte[] bArr = this.f11346a;
        if (i12 > bArr.length) {
            iMin = bArr.length - i11;
        }
        byte[] bArr2 = new byte[iMin];
        System.arraycopy(bArr, i11, bArr2, 0, iMin);
        this.f11350e += iMin;
        return bArr2;
    }

    public int g() {
        int i10 = this.f11347b;
        if (i10 == -1) {
            return this.f11346a.length - this.f11350e;
        }
        int iMin = Math.min(this.f11346a.length - this.f11350e, i10);
        this.f11348c = this.f11350e;
        return iMin;
    }

    public boolean h() {
        return this.f11350e == this.f11346a.length;
    }

    public boolean i() {
        int i10 = this.f11347b;
        return i10 == -1 ? h() : this.f11350e - this.f11348c == i10 || h();
    }

    public void j(int i10) {
        this.f11347b = i10;
    }

    public void k(int i10) {
        this.f11349d = i10;
    }

    public void l(int i10) {
        this.f11350e = i10;
    }
}
