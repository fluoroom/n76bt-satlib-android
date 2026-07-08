package e8;

import android.os.Parcel;
import android.os.Parcelable;
import e8.g;

/* JADX INFO: loaded from: classes.dex */
public class e extends f {
    public static final Parcelable.Creator<e> CREATOR = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f11674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f11675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f11676c;

    e(int i10, String str, int i11) {
        try {
            this.f11674a = g.f(i10);
            this.f11675b = str;
            this.f11676c = i11;
        } catch (g.a e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public int b() {
        return this.f11674a.e();
    }

    public String c() {
        return this.f11675b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return v7.o.a(this.f11674a, eVar.f11674a) && v7.o.a(this.f11675b, eVar.f11675b) && v7.o.a(Integer.valueOf(this.f11676c), Integer.valueOf(eVar.f11676c));
    }

    public int hashCode() {
        return v7.o.b(this.f11674a, this.f11675b, Integer.valueOf(this.f11676c));
    }

    public String toString() {
        j8.f fVarA = j8.g.a(this);
        fVarA.a("errorCode", this.f11674a.e());
        String str = this.f11675b;
        if (str != null) {
            fVarA.b("errorMessage", str);
        }
        return fVarA.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = w7.c.a(parcel);
        w7.c.k(parcel, 2, b());
        w7.c.r(parcel, 3, c(), false);
        w7.c.k(parcel, 4, this.f11676c);
        w7.c.b(parcel, iA);
    }
}
