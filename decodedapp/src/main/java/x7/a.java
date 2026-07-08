package x7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import v7.t;

/* JADX INFO: loaded from: classes.dex */
public final class a extends h8.a implements IInterface {
    a(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    public final void v1(t tVar) {
        Parcel parcelJ = j();
        h8.c.c(parcelJ, tVar);
        x(1, parcelJ);
    }
}
