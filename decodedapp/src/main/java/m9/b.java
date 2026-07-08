package m9;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f21806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f21807b;

    public b(float f10, d dVar) {
        while (dVar instanceof b) {
            dVar = ((b) dVar).f21806a;
            f10 += ((b) dVar).f21807b;
        }
        this.f21806a = dVar;
        this.f21807b = f10;
    }

    @Override // m9.d
    public float a(RectF rectF) {
        return Math.max(0.0f, this.f21806a.a(rectF) + this.f21807b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f21806a.equals(bVar.f21806a) && this.f21807b == bVar.f21807b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f21806a, Float.valueOf(this.f21807b)});
    }
}
