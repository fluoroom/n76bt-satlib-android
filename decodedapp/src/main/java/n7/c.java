package n7;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class c extends w7.a {
    public static final Parcelable.Creator<c> CREATOR = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f22604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f22605b;

    public c(String str, boolean z10) {
        this.f22604a = str;
        this.f22605b = z10;
    }

    public String b() {
        return this.f22604a;
    }

    public boolean c() {
        return this.f22605b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f22604a.equals(cVar.f22604a) && this.f22605b == cVar.f22605b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return v7.o.b(this.f22604a, Boolean.valueOf(this.f22605b));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = w7.c.a(parcel);
        w7.c.r(parcel, 1, b(), false);
        w7.c.c(parcel, 2, c());
        w7.c.b(parcel, iA);
    }
}
