package e8;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class a extends w7.a {
    public static final Parcelable.Creator<a> CREATOR = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f11660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p f11661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f11662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final r f11663d;

    a(i iVar, p pVar, b bVar, r rVar) {
        this.f11660a = iVar;
        this.f11661b = pVar;
        this.f11662c = bVar;
        this.f11663d = rVar;
    }

    public b b() {
        return this.f11662c;
    }

    public i c() {
        return this.f11660a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return v7.o.a(this.f11660a, aVar.f11660a) && v7.o.a(this.f11661b, aVar.f11661b) && v7.o.a(this.f11662c, aVar.f11662c) && v7.o.a(this.f11663d, aVar.f11663d);
    }

    public int hashCode() {
        return v7.o.b(this.f11660a, this.f11661b, this.f11662c, this.f11663d);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = w7.c.a(parcel);
        w7.c.p(parcel, 1, c(), i10, false);
        w7.c.p(parcel, 2, this.f11661b, i10, false);
        w7.c.p(parcel, 3, b(), i10, false);
        w7.c.p(parcel, 4, this.f11663d, i10, false);
        w7.c.b(parcel, iA);
    }
}
