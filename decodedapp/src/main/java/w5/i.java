package w5;

/* JADX INFO: loaded from: classes.dex */
public class i extends h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f31317c;

    public i(byte[] bArr) {
        this.f31317c = bArr;
    }

    @Override // w5.h
    int d() {
        byte[] bArr = this.f31317c;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    @Override // w5.h
    int h(byte[] bArr, int i10) {
        byte[] bArr2 = this.f31317c;
        if (bArr2 == null) {
            return i10;
        }
        int length = bArr2.length;
        int i11 = 0;
        while (i11 < length) {
            bArr[i10] = bArr2[i11];
            i11++;
            i10++;
        }
        return i10;
    }
}
