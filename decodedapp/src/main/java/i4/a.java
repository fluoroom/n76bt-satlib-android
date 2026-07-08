package i4;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static float a(float[] fArr, int i10, float[] fArr2) {
        float f10 = 0.0f;
        int i11 = 0;
        while (i11 < fArr2.length) {
            f10 += fArr2[i11] * fArr[i10];
            i11++;
            i10++;
        }
        return f10;
    }
}
