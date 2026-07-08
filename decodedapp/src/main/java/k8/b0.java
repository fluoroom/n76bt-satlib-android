package k8;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.location.LocationRequest;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b0 extends w7.a {
    public static final Parcelable.Creator<b0> CREATOR = new c0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    LocationRequest f19481a;

    b0(LocationRequest locationRequest, List list, boolean z10, boolean z11, boolean z12, boolean z13, String str, long j10) {
        WorkSource workSource;
        LocationRequest.a aVar = new LocationRequest.a(locationRequest);
        if (list != null) {
            if (list.isEmpty()) {
                workSource = null;
            } else {
                workSource = new WorkSource();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    v7.d dVar = (v7.d) it.next();
                    com.google.android.gms.common.util.i.a(workSource, dVar.f30356a, dVar.f30357b);
                }
            }
            aVar.n(workSource);
        }
        if (z10) {
            aVar.c(1);
        }
        if (z11) {
            aVar.l(2);
        }
        if (z12) {
            aVar.m(true);
        }
        if (z13) {
            aVar.k(true);
        }
        if (j10 != Long.MAX_VALUE) {
            aVar.e(j10);
        }
        this.f19481a = aVar.a();
    }

    public static b0 b(String str, LocationRequest locationRequest) {
        return new b0(locationRequest, null, false, false, false, false, null, Long.MAX_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b0) {
            return v7.o.a(this.f19481a, ((b0) obj).f19481a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19481a.hashCode();
    }

    public final String toString() {
        return this.f19481a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = w7.c.a(parcel);
        w7.c.p(parcel, 1, this.f19481a, i10, false);
        w7.c.b(parcel, iA);
    }
}
