package t7;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class c extends w7.a {
    public static final Parcelable.Creator<c> CREATOR = p.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c f27574b = e().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f27575a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private e f27576a;

        public c a() {
            return new c(this.f27576a);
        }

        public a b(e eVar) {
            this.f27576a = eVar;
            return this;
        }
    }

    c(e eVar) {
        this.f27575a = eVar;
    }

    public static final c b(e eVar) {
        a aVarE = e();
        aVarE.b(eVar);
        return aVarE.a();
    }

    public static final c c() {
        return f27574b;
    }

    public static a e() {
        return new a();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return Objects.equals(this.f27575a, ((c) obj).f27575a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f27575a);
    }

    public final String toString() {
        return "ApiMetadata(complianceOptions=" + String.valueOf(this.f27575a) + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(-204102970);
        e eVar = this.f27575a;
        int iA = w7.c.a(parcel);
        w7.c.p(parcel, 1, eVar, i10, false);
        w7.c.b(parcel, iA);
    }
}
