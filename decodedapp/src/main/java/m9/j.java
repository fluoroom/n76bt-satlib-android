package m9;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f21853a;

    public j(float f10) {
        this.f21853a = f10;
    }

    private static float b(RectF rectF) {
        return Math.min(rectF.width(), rectF.height());
    }

    @Override // m9.d
    public float a(RectF rectF) {
        return this.f21853a * b(rectF);
    }

    public float c() {
        return this.f21853a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && this.f21853a == ((j) obj).f21853a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f21853a)});
    }

    public String toString() {
        return ((int) (c() * 100.0f)) + "%";
    }
}
