package f8;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import u7.m;
import v7.e;
import v7.h;

/* JADX INFO: loaded from: classes.dex */
public final class b extends h {
    private final Bundle R;

    public b(Context context, Looper looper, e eVar, m7.c cVar, u7.d dVar, m mVar) {
        super(context, looper, 16, eVar, dVar, mVar);
        this.R = new Bundle();
    }

    @Override // v7.c
    protected final String D() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    @Override // v7.c
    protected final String E() {
        return "com.google.android.gms.auth.service.START";
    }

    @Override // v7.c
    public final boolean Q() {
        return true;
    }

    @Override // v7.c, t7.a.f
    public final int k() {
        return 12451000;
    }

    @Override // v7.c, t7.a.f
    public final boolean o() {
        e eVarH0 = h0();
        return (TextUtils.isEmpty(eVarH0.b()) || eVarH0.e(m7.b.f21794a).isEmpty()) ? false : true;
    }

    @Override // v7.c
    protected final /* synthetic */ IInterface r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        return iInterfaceQueryLocalInterface instanceof c ? (c) iInterfaceQueryLocalInterface : new c(iBinder);
    }

    @Override // v7.c
    protected final Bundle z() {
        return this.R;
    }
}
