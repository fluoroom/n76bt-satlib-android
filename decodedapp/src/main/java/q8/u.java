package q8;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class u extends w7.a {
    public static final Parcelable.Creator<u> CREATOR = new c0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t f24475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f24476b;

    public u(t tVar, double d10) {
        if (d10 <= 0.0d) {
            throw new IllegalArgumentException("A style must be applied to some segments on a polyline.");
        }
        this.f24475a = tVar;
        this.f24476b = d10;
    }

    public double b() {
        return this.f24476b;
    }

    public t c() {
        return this.f24475a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = w7.c.a(parcel);
        w7.c.p(parcel, 2, c(), i10, false);
        w7.c.g(parcel, 3, b());
        w7.c.b(parcel, iA);
    }
}
