package q8;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class k extends w7.a {
    public static final Parcelable.Creator<k> CREATOR = new n0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f24437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Float f24438b;

    public k(int i10, Float f10) {
        boolean z10 = true;
        if (i10 != 1 && (f10 == null || f10.floatValue() < 0.0f)) {
            z10 = false;
        }
        v7.q.b(z10, "Invalid PatternItem: type=" + i10 + " length=" + f10);
        this.f24437a = i10;
        this.f24438b = f10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f24437a == kVar.f24437a && v7.o.a(this.f24438b, kVar.f24438b);
    }

    public int hashCode() {
        return v7.o.b(Integer.valueOf(this.f24437a), this.f24438b);
    }

    public String toString() {
        return "[PatternItem: type=" + this.f24437a + " length=" + this.f24438b + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f24437a;
        int iA = w7.c.a(parcel);
        w7.c.k(parcel, 2, i11);
        w7.c.i(parcel, 3, this.f24438b, false);
        w7.c.b(parcel, iA);
    }
}
