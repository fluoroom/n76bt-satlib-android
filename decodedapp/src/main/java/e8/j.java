package e8;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class j extends w7.a {
    public static final Parcelable.Creator<j> CREATOR = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f11700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final short f11701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final short f11702c;

    j(int i10, short s10, short s11) {
        this.f11700a = i10;
        this.f11701b = s10;
        this.f11702c = s11;
    }

    public short b() {
        return this.f11701b;
    }

    public short c() {
        return this.f11702c;
    }

    public int e() {
        return this.f11700a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f11700a == jVar.f11700a && this.f11701b == jVar.f11701b && this.f11702c == jVar.f11702c;
    }

    public int hashCode() {
        return v7.o.b(Integer.valueOf(this.f11700a), Short.valueOf(this.f11701b), Short.valueOf(this.f11702c));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = w7.c.a(parcel);
        w7.c.k(parcel, 1, e());
        w7.c.q(parcel, 2, b());
        w7.c.q(parcel, 3, c());
        w7.c.b(parcel, iA);
    }
}
