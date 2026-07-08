package k8;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class z extends w7.a {
    public static final Parcelable.Creator<z> CREATOR = new a0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f19535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final IBinder f19536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final IBinder f19537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final PendingIntent f19538d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f19539e;

    z(int i10, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, String str) {
        this.f19535a = i10;
        this.f19536b = iBinder;
        this.f19537c = iBinder2;
        this.f19538d = pendingIntent;
        this.f19539e = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.os.IBinder, n8.p] */
    public static z b(IInterface iInterface, n8.p pVar, String str) {
        if (iInterface == null) {
            iInterface = null;
        }
        return new z(2, iInterface, pVar, null, str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f19535a;
        int iA = w7.c.a(parcel);
        w7.c.k(parcel, 1, i11);
        w7.c.j(parcel, 2, this.f19536b, false);
        w7.c.j(parcel, 3, this.f19537c, false);
        w7.c.p(parcel, 4, this.f19538d, i10, false);
        w7.c.r(parcel, 6, this.f19539e, false);
        w7.c.b(parcel, iA);
    }
}
