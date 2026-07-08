package n8;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class h extends w7.a {
    public static final Parcelable.Creator<h> CREATOR = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f22625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f22626d;

    h(int i10, int i11, long j10, long j11) {
        this.f22623a = i10;
        this.f22624b = i11;
        this.f22625c = j10;
        this.f22626d = j11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f22623a == hVar.f22623a && this.f22624b == hVar.f22624b && this.f22625c == hVar.f22625c && this.f22626d == hVar.f22626d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return v7.o.b(Integer.valueOf(this.f22624b), Integer.valueOf(this.f22623a), Long.valueOf(this.f22626d), Long.valueOf(this.f22625c));
    }

    public final String toString() {
        int i10 = this.f22623a;
        int length = String.valueOf(i10).length();
        int i11 = this.f22624b;
        int length2 = String.valueOf(i11).length();
        long j10 = this.f22626d;
        int length3 = String.valueOf(j10).length();
        long j11 = this.f22625c;
        StringBuilder sb2 = new StringBuilder(length + 50 + length2 + 18 + length3 + 17 + String.valueOf(j11).length());
        sb2.append("NetworkLocationStatus: Wifi status: ");
        sb2.append(i10);
        sb2.append(" Cell status: ");
        sb2.append(i11);
        sb2.append(" elapsed time NS: ");
        sb2.append(j10);
        sb2.append(" system time ms: ");
        sb2.append(j11);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f22623a;
        int iA = w7.c.a(parcel);
        w7.c.k(parcel, 1, i11);
        w7.c.k(parcel, 2, this.f22624b);
        w7.c.o(parcel, 3, this.f22625c);
        w7.c.o(parcel, 4, this.f22626d);
        w7.c.b(parcel, iA);
    }
}
