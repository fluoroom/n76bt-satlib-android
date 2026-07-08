package q8;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class v extends w7.a {
    public static final Parcelable.Creator<v> CREATOR = new d0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f24479c;

    public v(int i10, int i11, byte[] bArr) {
        this.f24477a = i10;
        this.f24478b = i11;
        this.f24479c = bArr;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f24477a;
        int iA = w7.c.a(parcel);
        w7.c.k(parcel, 2, i11);
        w7.c.k(parcel, 3, this.f24478b);
        w7.c.f(parcel, 4, this.f24479c, false);
        w7.c.b(parcel, iA);
    }
}
