package com.google.android.gms.location;

import android.location.Location;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import n8.g;
import v7.o;

/* JADX INFO: loaded from: classes.dex */
public final class LocationResult extends w7.a implements ReflectedParcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f7294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final List f7293b = Collections.EMPTY_LIST;
    public static final Parcelable.Creator<LocationResult> CREATOR = new c();

    LocationResult(List list) {
        this.f7294a = list;
    }

    public static LocationResult b(List list) {
        if (list == null) {
            list = f7293b;
        }
        return new LocationResult(list);
    }

    public Location c() {
        int size = this.f7294a.size();
        if (size == 0) {
            return null;
        }
        return (Location) this.f7294a.get(size - 1);
    }

    public List e() {
        return this.f7294a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        LocationResult locationResult = (LocationResult) obj;
        if (Build.VERSION.SDK_INT >= 31) {
            return this.f7294a.equals(locationResult.f7294a);
        }
        if (this.f7294a.size() != locationResult.f7294a.size()) {
            return false;
        }
        Iterator it = locationResult.f7294a.iterator();
        for (Location location : this.f7294a) {
            Location location2 = (Location) it.next();
            if (Double.compare(location.getLatitude(), location2.getLatitude()) != 0 || Double.compare(location.getLongitude(), location2.getLongitude()) != 0 || location.getTime() != location2.getTime() || location.getElapsedRealtimeNanos() != location2.getElapsedRealtimeNanos() || !o.a(location.getProvider(), location2.getProvider())) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return o.b(this.f7294a);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("LocationResult");
        int i10 = g.f22622d;
        List list = this.f7294a;
        sb2.ensureCapacity(list.size() * 100);
        sb2.append("[");
        Iterator it = list.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            g.a((Location) it.next(), sb2);
            sb2.append(", ");
            z10 = true;
        }
        if (z10) {
            sb2.setLength(sb2.length() - 2);
        }
        sb2.append("]");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = w7.c.a(parcel);
        w7.c.v(parcel, 1, e(), false);
        w7.c.b(parcel, iA);
    }
}
