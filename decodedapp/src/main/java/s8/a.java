package s8;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import t7.g;
import v7.c;
import v7.n0;
import v7.q;

/* JADX INFO: loaded from: classes.dex */
public class a extends v7.h implements r8.e {
    public static final /* synthetic */ int V = 0;
    private final boolean R;
    private final v7.e S;
    private final Bundle T;
    private final Integer U;

    public a(Context context, Looper looper, boolean z10, v7.e eVar, Bundle bundle, g.a aVar, g.b bVar) {
        super(context, looper, 44, eVar, aVar, bVar);
        this.R = true;
        this.S = eVar;
        this.T = bundle;
        this.U = eVar.i();
    }

    public static Bundle k0(v7.e eVar) {
        eVar.h();
        Integer numI = eVar.i();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", eVar.a());
        if (numI != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", numI.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    @Override // v7.c
    protected final String D() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // v7.c
    protected final String E() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // r8.e
    public final void c(f fVar) {
        q.j(fVar, "Expecting a valid ISignInCallbacks");
        try {
            Account accountC = this.S.c();
            ((g) C()).v1(new j(1, new n0(accountC, ((Integer) q.i(this.U)).intValue(), "<<default account>>".equals(accountC.name) ? q7.c.b(x()).c() : null)), fVar);
        } catch (RemoteException e10) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                fVar.G0(new l(1, new s7.a(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e10);
            }
        }
    }

    @Override // v7.c, t7.a.f
    public final int k() {
        return 12451000;
    }

    @Override // v7.c, t7.a.f
    public final boolean o() {
        return this.R;
    }

    @Override // r8.e
    public final void p() {
        g(new c.d());
    }

    @Override // v7.c
    protected final /* synthetic */ IInterface r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof g ? (g) iInterfaceQueryLocalInterface : new g(iBinder);
    }

    @Override // v7.c
    protected final Bundle z() {
        if (!x().getPackageName().equals(this.S.f())) {
            this.T.putString("com.google.android.gms.signin.internal.realClientPackageName", this.S.f());
        }
        return this.T;
    }
}
