package s7;

import android.os.Parcel;
import android.os.Parcelable;
import v7.o;

/* JADX INFO: loaded from: classes.dex */
public class c extends w7.a {
    public static final Parcelable.Creator<c> CREATOR = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f26986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f26987c;

    public c(String str, int i10, long j10) {
        this.f26985a = str;
        this.f26986b = i10;
        this.f26987c = j10;
    }

    public String b() {
        return this.f26985a;
    }

    public long c() {
        long j10 = this.f26987c;
        return j10 == -1 ? this.f26986b : j10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (((b() != null && b().equals(cVar.b())) || (b() == null && cVar.b() == null)) && c() == cVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return v7.o.b(b(), Long.valueOf(c()));
    }

    public final String toString() {
        o.a aVarC = v7.o.c(this);
        aVarC.a("name", b());
        aVarC.a("version", Long.valueOf(c()));
        return aVarC.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = w7.c.a(parcel);
        w7.c.r(parcel, 1, b(), false);
        w7.c.k(parcel, 2, this.f26986b);
        w7.c.o(parcel, 3, c());
        w7.c.b(parcel, iA);
    }

    public c(String str, long j10) {
        this.f26985a = str;
        this.f26987c = j10;
        this.f26986b = -1;
    }
}
