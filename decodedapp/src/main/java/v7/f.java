package v7;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class f extends w7.a {
    public static final Parcelable.Creator<f> CREATOR = new h1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f30378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f30379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f30380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int[] f30381d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f30382e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int[] f30383f;

    public f(s sVar, boolean z10, boolean z11, int[] iArr, int i10, int[] iArr2) {
        this.f30378a = sVar;
        this.f30379b = z10;
        this.f30380c = z11;
        this.f30381d = iArr;
        this.f30382e = i10;
        this.f30383f = iArr2;
    }

    public int b() {
        return this.f30382e;
    }

    public int[] c() {
        return this.f30381d;
    }

    public int[] e() {
        return this.f30383f;
    }

    public boolean f() {
        return this.f30379b;
    }

    public boolean g() {
        return this.f30380c;
    }

    public final s h() {
        return this.f30378a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = w7.c.a(parcel);
        w7.c.p(parcel, 1, this.f30378a, i10, false);
        w7.c.c(parcel, 2, f());
        w7.c.c(parcel, 3, g());
        w7.c.l(parcel, 4, c(), false);
        w7.c.k(parcel, 5, b());
        w7.c.l(parcel, 6, e(), false);
        w7.c.b(parcel, iA);
    }
}
