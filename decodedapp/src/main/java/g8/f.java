package g8;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class f extends v7.h {
    private final Bundle R;

    public f(Context context, Looper looper, n7.o oVar, v7.e eVar, u7.d dVar, u7.m mVar) {
        super(context, looper, 212, eVar, dVar, mVar);
        this.R = new Bundle();
    }

    @Override // v7.c
    protected final String D() {
        return "com.google.android.gms.auth.api.identity.internal.ISignInService";
    }

    @Override // v7.c
    protected final String E() {
        return "com.google.android.gms.auth.api.identity.service.signin.START";
    }

    @Override // v7.c
    protected final boolean H() {
        return true;
    }

    @Override // v7.c
    public final boolean Q() {
        return true;
    }

    @Override // v7.c, t7.a.f
    public final int k() {
        return 17895000;
    }

    @Override // v7.c
    protected final /* synthetic */ IInterface r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof s ? (s) iInterfaceQueryLocalInterface : new s(iBinder);
    }

    @Override // v7.c
    public final s7.c[] u() {
        return g.f13699v;
    }

    @Override // v7.c
    protected final Bundle z() {
        return this.R;
    }
}
