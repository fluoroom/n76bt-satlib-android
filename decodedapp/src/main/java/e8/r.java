package e8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class r extends w7.a {
    public static final Parcelable.Creator<r> CREATOR = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f11705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f11706b;

    public r(boolean z10, byte[] bArr) {
        this.f11705a = z10;
        this.f11706b = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f11705a == rVar.f11705a && Arrays.equals(this.f11706b, rVar.f11706b);
    }

    public final int hashCode() {
        return v7.o.b(Boolean.valueOf(this.f11705a), this.f11706b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = w7.c.a(parcel);
        w7.c.c(parcel, 1, this.f11705a);
        w7.c.f(parcel, 2, this.f11706b, false);
        w7.c.b(parcel, iA);
    }
}
