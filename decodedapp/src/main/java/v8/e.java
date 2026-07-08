package v8;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e implements TypeEvaluator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f30499a = new float[9];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float[] f30500b = new float[9];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Matrix f30501c = new Matrix();

    public Matrix a(float f10, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.f30499a);
        matrix2.getValues(this.f30500b);
        for (int i10 = 0; i10 < 9; i10++) {
            float[] fArr = this.f30500b;
            float f11 = fArr[i10];
            float f12 = this.f30499a[i10];
            fArr[i10] = f12 + ((f11 - f12) * f10);
        }
        this.f30501c.setValues(this.f30500b);
        return this.f30501c;
    }
}
