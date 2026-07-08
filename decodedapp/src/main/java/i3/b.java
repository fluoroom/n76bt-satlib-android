package i3;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f15760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f15761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f15762c;

    public b(int i10, int i11, byte[] bArr) {
        this.f15761b = i10;
        this.f15760a = i11;
        this.f15762c = bArr;
    }

    public static b a(byte[] bArr) {
        if (bArr.length < 2) {
            return new b(-1, 0, null);
        }
        byte b10 = bArr[0];
        int i10 = bArr[2] | (bArr[1] << 8);
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, 3, bArr2, 0, i10);
        return new b(b10, i10, bArr2);
    }

    public byte[] b() {
        int i10 = this.f15760a;
        byte[] bArr = new byte[i10 + 3];
        bArr[0] = (byte) this.f15761b;
        bArr[1] = (byte) (i10 >> 8);
        bArr[2] = (byte) i10;
        byte[] bArr2 = this.f15762c;
        if (bArr2 != null && bArr2.length > 0) {
            a.a(bArr2, 0, bArr, 3, i10, false);
        }
        return bArr;
    }

    public byte[] c() {
        return this.f15762c;
    }

    public byte d() {
        byte[] bArr = this.f15762c;
        if (bArr.length > 1) {
            return bArr[0];
        }
        return (byte) 0;
    }

    public int e() {
        return this.f15761b;
    }
}
