package e8;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class b extends w7.a {
    public static final Parcelable.Creator<b> CREATOR = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f11664a;

    public b(boolean z10) {
        this.f11664a = z10;
    }

    public boolean b() {
        return this.f11664a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof b) && this.f11664a == ((b) obj).f11664a;
    }

    public int hashCode() {
        return v7.o.b(Boolean.valueOf(this.f11664a));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = w7.c.a(parcel);
        w7.c.c(parcel, 1, b());
        w7.c.b(parcel, iA);
    }
}
