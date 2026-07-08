package x7;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import u7.m;
import v7.h;
import v7.w;

/* JADX INFO: loaded from: classes.dex */
public final class e extends h {
    private final w R;

    public e(Context context, Looper looper, v7.e eVar, w wVar, u7.d dVar, m mVar) {
        super(context, looper, 270, eVar, dVar, mVar);
        this.R = wVar;
    }

    @Override // v7.c
    protected final String D() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // v7.c
    protected final String E() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // v7.c
    protected final boolean H() {
        return true;
    }

    @Override // v7.c, t7.a.f
    public final int k() {
        return 203400000;
    }

    @Override // v7.c
    protected final /* synthetic */ IInterface r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new a(iBinder);
    }

    @Override // v7.c
    public final s7.c[] u() {
        return h8.d.f15175b;
    }

    @Override // v7.c
    protected final Bundle z() {
        return this.R.b();
    }
}
