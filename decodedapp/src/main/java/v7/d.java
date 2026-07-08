package v7;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class d extends w7.a {
    public static final Parcelable.Creator<d> CREATOR = new x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f30357b;

    public d(int i10, String str) {
        this.f30356a = i10;
        this.f30357b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return dVar.f30356a == this.f30356a && o.a(dVar.f30357b, this.f30357b);
    }

    public final int hashCode() {
        return this.f30356a;
    }

    public final String toString() {
        return this.f30356a + ":" + this.f30357b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f30356a;
        int iA = w7.c.a(parcel);
        w7.c.k(parcel, 1, i11);
        w7.c.r(parcel, 2, this.f30357b, false);
        w7.c.b(parcel, iA);
    }
}
