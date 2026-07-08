package m9;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f21805a;

    public a(float f10) {
        this.f21805a = f10;
    }

    @Override // m9.d
    public float a(RectF rectF) {
        return this.f21805a;
    }

    public float b() {
        return this.f21805a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f21805a == ((a) obj).f21805a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f21805a)});
    }

    public String toString() {
        return b() + "px";
    }
}
