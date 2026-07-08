package k8;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class d0 extends w7.a {
    public static final Parcelable.Creator<d0> CREATOR = new e0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f19482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b0 f19483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n8.s f19484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final n8.p f19485d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final PendingIntent f19486e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final x0 f19487f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f19488g;

    d0(int i10, b0 b0Var, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, IBinder iBinder3, String str) {
        this.f19482a = i10;
        this.f19483b = b0Var;
        x0 v0Var = null;
        this.f19484c = iBinder != null ? n8.r.q(iBinder) : null;
        this.f19486e = pendingIntent;
        this.f19485d = iBinder2 != null ? n8.o.q(iBinder2) : null;
        if (iBinder3 != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            v0Var = iInterfaceQueryLocalInterface instanceof x0 ? (x0) iInterfaceQueryLocalInterface : new v0(iBinder3);
        }
        this.f19487f = v0Var;
        this.f19488g = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f19482a;
        int iA = w7.c.a(parcel);
        w7.c.k(parcel, 1, i11);
        w7.c.p(parcel, 2, this.f19483b, i10, false);
        n8.s sVar = this.f19484c;
        w7.c.j(parcel, 3, sVar == null ? null : sVar.asBinder(), false);
        w7.c.p(parcel, 4, this.f19486e, i10, false);
        n8.p pVar = this.f19485d;
        w7.c.j(parcel, 5, pVar == null ? null : pVar.asBinder(), false);
        x0 x0Var = this.f19487f;
        w7.c.j(parcel, 6, x0Var != null ? x0Var.asBinder() : null, false);
        w7.c.r(parcel, 8, this.f19488g, false);
        w7.c.b(parcel, iA);
    }
}
