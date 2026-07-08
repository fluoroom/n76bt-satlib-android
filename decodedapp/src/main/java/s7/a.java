package s7;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import v7.o;

/* JADX INFO: loaded from: classes.dex */
public final class a extends w7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f26978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f26979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PendingIntent f26980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f26981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f26977e = new a(0);
    public static final Parcelable.Creator<a> CREATOR = new m();

    a(int i10, int i11, PendingIntent pendingIntent, String str) {
        this.f26978a = i10;
        this.f26979b = i11;
        this.f26980c = pendingIntent;
        this.f26981d = str;
    }

    static String h(int i10) {
        if (i10 == 99) {
            return "UNFINISHED";
        }
        if (i10 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i10) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i10) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    case 25:
                        return "API_INSTALL_REQUIRED";
                    default:
                        return "UNKNOWN_ERROR_CODE(" + i10 + ")";
                }
        }
    }

    public int b() {
        return this.f26979b;
    }

    public String c() {
        return this.f26981d;
    }

    public PendingIntent e() {
        return this.f26980c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f26979b == aVar.f26979b && v7.o.a(this.f26980c, aVar.f26980c) && v7.o.a(this.f26981d, aVar.f26981d);
    }

    public boolean f() {
        return (this.f26979b == 0 || this.f26980c == null) ? false : true;
    }

    public boolean g() {
        return this.f26979b == 0;
    }

    public int hashCode() {
        return v7.o.b(Integer.valueOf(this.f26979b), this.f26980c, this.f26981d);
    }

    public String toString() {
        o.a aVarC = v7.o.c(this);
        aVarC.a("statusCode", h(this.f26979b));
        aVarC.a("resolution", this.f26980c);
        aVarC.a("message", this.f26981d);
        return aVarC.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f26978a;
        int iA = w7.c.a(parcel);
        w7.c.k(parcel, 1, i11);
        w7.c.k(parcel, 2, b());
        w7.c.p(parcel, 3, e(), i10, false);
        w7.c.r(parcel, 4, c(), false);
        w7.c.b(parcel, iA);
    }

    public a(int i10) {
        this(i10, null, null);
    }

    public a(int i10, PendingIntent pendingIntent) {
        this(i10, pendingIntent, null);
    }

    public a(int i10, PendingIntent pendingIntent, String str) {
        this(1, i10, pendingIntent, str);
    }
}
