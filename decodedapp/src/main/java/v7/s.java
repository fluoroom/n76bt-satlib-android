package v7;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class s extends w7.a {
    public static final Parcelable.Creator<s> CREATOR = new y0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f30475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f30476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f30477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f30478d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f30479e;

    public s(int i10, boolean z10, boolean z11, int i11, int i12) {
        this.f30475a = i10;
        this.f30476b = z10;
        this.f30477c = z11;
        this.f30478d = i11;
        this.f30479e = i12;
    }

    public int b() {
        return this.f30478d;
    }

    public int c() {
        return this.f30479e;
    }

    public boolean e() {
        return this.f30476b;
    }

    public boolean f() {
        return this.f30477c;
    }

    public int g() {
        return this.f30475a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = w7.c.a(parcel);
        w7.c.k(parcel, 1, g());
        w7.c.c(parcel, 2, e());
        w7.c.c(parcel, 3, f());
        w7.c.k(parcel, 4, b());
        w7.c.k(parcel, 5, c());
        w7.c.b(parcel, iA);
    }
}
