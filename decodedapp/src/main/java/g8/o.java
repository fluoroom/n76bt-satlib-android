package g8;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import t7.g;

/* JADX INFO: loaded from: classes.dex */
public final class o extends v7.h {
    private final m7.g R;

    public o(Context context, Looper looper, v7.e eVar, m7.g gVar, g.a aVar, g.b bVar) {
        super(context, looper, 68, eVar, aVar, bVar);
        m7.f fVar = new m7.f(gVar == null ? m7.g.f21800d : gVar);
        fVar.a(h.a());
        this.R = new m7.g(fVar);
    }

    @Override // v7.c
    protected final String D() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // v7.c
    protected final String E() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    @Override // v7.c, t7.a.f
    public final int k() {
        return 12800000;
    }

    @Override // v7.c
    protected final /* synthetic */ IInterface r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return iInterfaceQueryLocalInterface instanceof p ? (p) iInterfaceQueryLocalInterface : new p(iBinder);
    }

    @Override // v7.c
    protected final Bundle z() {
        return this.R.a();
    }
}
