package b4;

import w3.d;

/* JADX INFO: loaded from: classes.dex */
public class c extends w3.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final short[] f3682d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f3683e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f3684f;

    public c(short[] sArr, int i10) {
        super(null);
        this.f3682d = sArr;
        this.f31081c = d.PCM_16BIT;
        this.f3683e = i10;
    }

    @Override // w3.c
    public int a() {
        return this.f3683e;
    }

    @Override // w3.c
    public int b(int i10) {
        int i11 = this.f3684f;
        int i12 = i10 + i11;
        this.f3684f = i12;
        if (i12 < 0) {
            this.f3684f = 0;
        } else {
            int i13 = this.f3683e;
            if (i12 > i13) {
                this.f3684f = i13;
            }
        }
        return this.f3684f - i11;
    }

    @Override // w3.c
    public int e(short[] sArr, int i10, int i11) {
        int i12 = this.f3683e;
        int i13 = this.f3684f;
        if (i11 > i12 - i13) {
            i11 = i12 - i13;
        }
        System.arraycopy(this.f3682d, i13, sArr, i10, i11);
        this.f3684f += i11;
        return i11;
    }

    @Override // w3.c
    public int f(int i10) {
        if (i10 < 0) {
            i10 = 0;
        } else {
            int i11 = this.f3683e;
            if (i10 > i11) {
                i10 = i11;
            }
        }
        this.f3684f = i10;
        return i10;
    }

    public c(short[] sArr) {
        this(sArr, sArr.length);
    }
}
