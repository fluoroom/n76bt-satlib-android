package t3;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public class a implements Interpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f27463a;

    public a() {
        this(1.3f);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        return ((double) f10) < 0.5d ? (float) (Math.pow(f10 * 2.0f, this.f27463a * 2.0f) / 2.0d) : (float) (1.0d - (Math.pow(2.0f - (f10 * 2.0f), this.f27463a * 2.0f) / 2.0d));
    }

    public a(float f10) {
        this.f27463a = f10;
    }
}
