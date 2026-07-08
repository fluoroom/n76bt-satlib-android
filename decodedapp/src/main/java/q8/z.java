package q8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* JADX INFO: loaded from: classes.dex */
public final class z extends w7.a {
    public static final Parcelable.Creator<z> CREATOR = new h0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LatLng f24488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LatLng f24489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LatLng f24490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LatLng f24491d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LatLngBounds f24492e;

    public z(LatLng latLng, LatLng latLng2, LatLng latLng3, LatLng latLng4, LatLngBounds latLngBounds) {
        this.f24488a = latLng;
        this.f24489b = latLng2;
        this.f24490c = latLng3;
        this.f24491d = latLng4;
        this.f24492e = latLngBounds;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f24488a.equals(zVar.f24488a) && this.f24489b.equals(zVar.f24489b) && this.f24490c.equals(zVar.f24490c) && this.f24491d.equals(zVar.f24491d) && this.f24492e.equals(zVar.f24492e);
    }

    public int hashCode() {
        return v7.o.b(this.f24488a, this.f24489b, this.f24490c, this.f24491d, this.f24492e);
    }

    public String toString() {
        return v7.o.c(this).a("nearLeft", this.f24488a).a("nearRight", this.f24489b).a("farLeft", this.f24490c).a("farRight", this.f24491d).a("latLngBounds", this.f24492e).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        LatLng latLng = this.f24488a;
        int iA = w7.c.a(parcel);
        w7.c.p(parcel, 2, latLng, i10, false);
        w7.c.p(parcel, 3, this.f24489b, i10, false);
        w7.c.p(parcel, 4, this.f24490c, i10, false);
        w7.c.p(parcel, 5, this.f24491d, i10, false);
        w7.c.p(parcel, 6, this.f24492e, i10, false);
        w7.c.b(parcel, iA);
    }
}
