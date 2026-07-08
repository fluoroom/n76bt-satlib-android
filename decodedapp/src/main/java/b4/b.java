package b4;

import w3.d;

/* JADX INFO: loaded from: classes.dex */
public class b extends w3.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float[] f3680d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f3681e;

    public b(float[] fArr) {
        super(null);
        this.f3680d = fArr;
        this.f31081c = d.PCM_FLOAT;
    }

    @Override // w3.c
    public int a() {
        return this.f3680d.length;
    }

    @Override // w3.c
    public int b(int i10) {
        int i11 = this.f3681e;
        int i12 = i10 + i11;
        this.f3681e = i12;
        if (i12 < 0) {
            this.f3681e = 0;
        } else {
            float[] fArr = this.f3680d;
            if (i12 > fArr.length) {
                this.f3681e = fArr.length;
            }
        }
        return this.f3681e - i11;
    }

    @Override // w3.c
    public int d(float[] fArr, int i10, int i11) {
        float[] fArr2 = this.f3680d;
        int length = fArr2.length;
        int i12 = this.f3681e;
        if (i11 > length - i12) {
            i11 = fArr2.length - i12;
        }
        System.arraycopy(fArr2, i12, fArr, i10, i11);
        this.f3681e += i11;
        return i11;
    }

    @Override // w3.c
    public int f(int i10) {
        if (i10 < 0) {
            i10 = 0;
        } else {
            float[] fArr = this.f3680d;
            if (i10 > fArr.length) {
                i10 = fArr.length;
            }
        }
        this.f3681e = i10;
        return i10;
    }
}
