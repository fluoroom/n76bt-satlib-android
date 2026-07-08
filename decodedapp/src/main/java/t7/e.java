package t7;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class e extends w7.a {
    public static final Parcelable.Creator<e> CREATOR;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f27577e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f27578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f27579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f27580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f27581d;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f27582a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f27583b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f27584c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f27585d = true;

        public e a() {
            return new e(this.f27582a, this.f27583b, this.f27584c, this.f27585d);
        }

        public a b(int i10) {
            this.f27582a = i10;
            return this;
        }

        public a c(int i10) {
            this.f27583b = i10;
            return this;
        }

        public a d(boolean z10) {
            this.f27585d = z10;
            return this;
        }

        public a e(int i10) {
            this.f27584c = i10;
            return this;
        }
    }

    static {
        a aVarB = b();
        aVarB.b(-1);
        aVarB.c(-1);
        aVarB.e(0);
        aVarB.d(true);
        f27577e = aVarB.a();
        CREATOR = new r();
    }

    e(int i10, int i11, int i12, boolean z10) {
        this.f27578a = i10;
        this.f27579b = i11;
        this.f27580c = i12;
        this.f27581d = z10;
    }

    public static a b() {
        return new a();
    }

    public static final a c(Context context) {
        return b();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f27578a == eVar.f27578a && this.f27579b == eVar.f27579b && this.f27580c == eVar.f27580c && this.f27581d == eVar.f27581d;
    }

    public final int hashCode() {
        return v7.o.b(Integer.valueOf(this.f27578a), Integer.valueOf(this.f27579b), Integer.valueOf(this.f27580c), Boolean.valueOf(this.f27581d));
    }

    public final String toString() {
        return "ComplianceOptions{callerProductId=" + this.f27578a + ", dataOwnerProductId=" + this.f27579b + ", processingReason=" + this.f27580c + ", isUserData=" + this.f27581d + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f27578a;
        int iA = w7.c.a(parcel);
        w7.c.k(parcel, 1, i11);
        w7.c.k(parcel, 2, this.f27579b);
        w7.c.k(parcel, 3, this.f27580c);
        w7.c.c(parcel, 4, this.f27581d);
        w7.c.b(parcel, iA);
    }
}
