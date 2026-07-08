package c0;

/* JADX INFO: loaded from: classes.dex */
final class o {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final o f4264k = k(b.f4230c, (float) ((((double) b.h(50.0f)) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f4265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f4266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f4267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f4268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f4269e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f4270f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float[] f4271g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f4272h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float f4273i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final float f4274j;

    private o(float f10, float f11, float f12, float f13, float f14, float f15, float[] fArr, float f16, float f17, float f18) {
        this.f4270f = f10;
        this.f4265a = f11;
        this.f4266b = f12;
        this.f4267c = f13;
        this.f4268d = f14;
        this.f4269e = f15;
        this.f4271g = fArr;
        this.f4272h = f16;
        this.f4273i = f17;
        this.f4274j = f18;
    }

    static o k(float[] fArr, float f10, float f11, float f12, boolean z10) {
        float[][] fArr2 = b.f4228a;
        float f13 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f14 = fArr3[0] * f13;
        float f15 = fArr[1];
        float f16 = f14 + (fArr3[1] * f15);
        float f17 = fArr[2];
        float f18 = f16 + (fArr3[2] * f17);
        float[] fArr4 = fArr2[1];
        float f19 = (fArr4[0] * f13) + (fArr4[1] * f15) + (fArr4[2] * f17);
        float[] fArr5 = fArr2[2];
        float f20 = (f13 * fArr5[0]) + (f15 * fArr5[1]) + (f17 * fArr5[2]);
        float f21 = (f12 / 10.0f) + 0.8f;
        float fD = ((double) f21) >= 0.9d ? b.d(0.59f, 0.69f, (f21 - 0.9f) * 10.0f) : b.d(0.525f, 0.59f, (f21 - 0.8f) * 10.0f);
        float fExp = z10 ? 1.0f : (1.0f - (((float) Math.exp(((-f10) - 42.0f) / 92.0f)) * 0.2777778f)) * f21;
        double d10 = fExp;
        if (d10 > 1.0d) {
            fExp = 1.0f;
        } else if (d10 < 0.0d) {
            fExp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f18) * fExp) + 1.0f) - fExp, (((100.0f / f19) * fExp) + 1.0f) - fExp, (((100.0f / f20) * fExp) + 1.0f) - fExp};
        float f22 = 1.0f / ((5.0f * f10) + 1.0f);
        float f23 = f22 * f22 * f22 * f22;
        float f24 = 1.0f - f23;
        float fCbrt = (f23 * f10) + (0.1f * f24 * f24 * ((float) Math.cbrt(((double) f10) * 5.0d)));
        float fH = b.h(f11) / fArr[1];
        double d11 = fH;
        float fSqrt = ((float) Math.sqrt(d11)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d11, 0.2d));
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * fCbrt) * f18)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * fCbrt) * f19)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[2] * fCbrt) * f20)) / 100.0d, 0.42d)};
        float f25 = fArr7[0];
        float f26 = (f25 * 400.0f) / (f25 + 27.13f);
        float f27 = fArr7[1];
        float f28 = (f27 * 400.0f) / (f27 + 27.13f);
        float f29 = fArr7[2];
        float[] fArr8 = {f26, f28, (400.0f * f29) / (f29 + 27.13f)};
        return new o(fH, ((fArr8[0] * 2.0f) + fArr8[1] + (fArr8[2] * 0.05f)) * fPow, fPow, fPow, fD, f21, fArr6, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    float a() {
        return this.f4265a;
    }

    float b() {
        return this.f4268d;
    }

    float c() {
        return this.f4272h;
    }

    float d() {
        return this.f4273i;
    }

    float e() {
        return this.f4270f;
    }

    float f() {
        return this.f4266b;
    }

    float g() {
        return this.f4269e;
    }

    float h() {
        return this.f4267c;
    }

    float[] i() {
        return this.f4271g;
    }

    float j() {
        return this.f4274j;
    }
}
