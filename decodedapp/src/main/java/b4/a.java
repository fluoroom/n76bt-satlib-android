package b4;

import w3.d;

/* JADX INFO: loaded from: classes.dex */
public class a extends w3.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f3678d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f3679e;

    public a(byte[] bArr, d dVar) {
        super(null);
        this.f3678d = bArr;
        this.f31081c = dVar;
    }

    @Override // w3.c
    public int a() {
        return this.f3678d.length;
    }

    @Override // w3.c
    public int b(int i10) {
        int i11 = this.f3679e;
        int i12 = i10 + i11;
        this.f3679e = i12;
        if (i12 < 0) {
            this.f3679e = 0;
        } else {
            byte[] bArr = this.f3678d;
            if (i12 > bArr.length) {
                this.f3679e = bArr.length;
            }
        }
        return this.f3679e - i11;
    }

    @Override // w3.c
    public int c(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = this.f3678d;
        int length = bArr2.length;
        int i12 = this.f3679e;
        if (i11 > length - i12) {
            i11 = bArr2.length - i12;
        }
        System.arraycopy(bArr2, i12, bArr, i10, i11);
        this.f3679e += i11;
        return i11;
    }

    @Override // w3.c
    public int f(int i10) {
        if (i10 < 0) {
            i10 = 0;
        } else {
            byte[] bArr = this.f3678d;
            if (i10 > bArr.length) {
                i10 = bArr.length;
            }
        }
        this.f3679e = i10;
        return i10;
    }
}
