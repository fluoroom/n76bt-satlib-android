package com.google.android.material.carousel;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f7616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    float f7617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f7618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f7619d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    float f7620e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    float f7621f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final int f7622g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final float f7623h;

    public a(int i10, float f10, float f11, float f12, int i11, float f13, int i12, float f14, int i13, float f15) {
        this.f7616a = i10;
        this.f7617b = h0.a.a(f10, f11, f12);
        this.f7618c = i11;
        this.f7620e = f13;
        this.f7619d = i12;
        this.f7621f = f14;
        this.f7622g = i13;
        d(f15, f11, f12, f14);
        this.f7623h = b(f14);
    }

    private float a(float f10, int i10, float f11, int i11, int i12) {
        if (i10 <= 0) {
            f11 = 0.0f;
        }
        float f12 = i11 / 2.0f;
        return (f10 - ((i10 + f12) * f11)) / (i12 + f12);
    }

    private float b(float f10) {
        if (g()) {
            return Math.abs(f10 - this.f7621f) * this.f7616a;
        }
        return Float.MAX_VALUE;
    }

    public static a c(float f10, float f11, float f12, float f13, int[] iArr, float f14, int[] iArr2, float f15, int[] iArr3) {
        a aVar = null;
        int i10 = 1;
        for (int i11 : iArr3) {
            int length = iArr2.length;
            int i12 = 0;
            while (i12 < length) {
                int i13 = iArr2[i12];
                int length2 = iArr.length;
                int i14 = 0;
                while (i14 < length2) {
                    int i15 = length;
                    int i16 = i12;
                    int i17 = i10;
                    int i18 = length2;
                    int i19 = i14;
                    a aVar2 = new a(i17, f11, f12, f13, iArr[i14], f14, i13, f15, i11, f10);
                    if (aVar == null || aVar2.f7623h < aVar.f7623h) {
                        if (aVar2.f7623h == 0.0f) {
                            return aVar2;
                        }
                        aVar = aVar2;
                    }
                    int i20 = i17 + 1;
                    i14 = i19 + 1;
                    i12 = i16;
                    i10 = i20;
                    length = i15;
                    length2 = i18;
                }
                i12++;
                i10 = i10;
                length = length;
            }
        }
        return aVar;
    }

    private void d(float f10, float f11, float f12, float f13) {
        float f14 = f10 - f();
        int i10 = this.f7618c;
        if (i10 > 0 && f14 > 0.0f) {
            float f15 = this.f7617b;
            this.f7617b = f15 + Math.min(f14 / i10, f12 - f15);
        } else if (i10 > 0 && f14 < 0.0f) {
            float f16 = this.f7617b;
            this.f7617b = f16 + Math.max(f14 / i10, f11 - f16);
        }
        int i11 = this.f7618c;
        float f17 = i11 > 0 ? this.f7617b : 0.0f;
        this.f7617b = f17;
        float fA = a(f10, i11, f17, this.f7619d, this.f7622g);
        this.f7621f = fA;
        float f18 = (this.f7617b + fA) / 2.0f;
        this.f7620e = f18;
        int i12 = this.f7619d;
        if (i12 <= 0 || fA == f13) {
            return;
        }
        float f19 = (f13 - fA) * this.f7622g;
        float fMin = Math.min(Math.abs(f19), f18 * 0.1f * i12);
        if (f19 > 0.0f) {
            this.f7620e -= fMin / this.f7619d;
            this.f7621f += fMin / this.f7622g;
        } else {
            this.f7620e += fMin / this.f7619d;
            this.f7621f -= fMin / this.f7622g;
        }
    }

    private float f() {
        return (this.f7621f * this.f7622g) + (this.f7620e * this.f7619d) + (this.f7617b * this.f7618c);
    }

    private boolean g() {
        int i10 = this.f7622g;
        if (i10 <= 0 || this.f7618c <= 0 || this.f7619d <= 0) {
            return i10 <= 0 || this.f7618c <= 0 || this.f7621f > this.f7617b;
        }
        float f10 = this.f7621f;
        float f11 = this.f7620e;
        return f10 > f11 && f11 > this.f7617b;
    }

    int e() {
        return this.f7618c + this.f7619d + this.f7622g;
    }

    public String toString() {
        return "Arrangement [priority=" + this.f7616a + ", smallCount=" + this.f7618c + ", smallSize=" + this.f7617b + ", mediumCount=" + this.f7619d + ", mediumSize=" + this.f7620e + ", largeCount=" + this.f7622g + ", largeSize=" + this.f7621f + ", cost=" + this.f7623h + "]";
    }
}
