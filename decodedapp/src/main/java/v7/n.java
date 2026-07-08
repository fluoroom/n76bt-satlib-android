package v7;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class n extends w7.a {
    public static final Parcelable.Creator<n> CREATOR = new i0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f30434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f30435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f30436c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f30437d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f30438e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f30439f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f30440g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f30441h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f30442r;

    public n(int i10, int i11, int i12, long j10, long j11, String str, String str2, int i13, int i14) {
        this.f30434a = i10;
        this.f30435b = i11;
        this.f30436c = i12;
        this.f30437d = j10;
        this.f30438e = j11;
        this.f30439f = str;
        this.f30440g = str2;
        this.f30441h = i13;
        this.f30442r = i14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f30434a;
        int iA = w7.c.a(parcel);
        w7.c.k(parcel, 1, i11);
        w7.c.k(parcel, 2, this.f30435b);
        w7.c.k(parcel, 3, this.f30436c);
        w7.c.o(parcel, 4, this.f30437d);
        w7.c.o(parcel, 5, this.f30438e);
        w7.c.r(parcel, 6, this.f30439f, false);
        w7.c.r(parcel, 7, this.f30440g, false);
        w7.c.k(parcel, 8, this.f30441h);
        w7.c.k(parcel, 9, this.f30442r);
        w7.c.b(parcel, iA);
    }
}
