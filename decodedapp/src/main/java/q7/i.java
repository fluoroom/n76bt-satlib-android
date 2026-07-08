package q7;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.Iterator;
import t7.g;

/* JADX INFO: loaded from: classes.dex */
public final class i extends v7.h {
    private final GoogleSignInOptions R;

    public i(Context context, Looper looper, v7.e eVar, GoogleSignInOptions googleSignInOptions, g.a aVar, g.b bVar) {
        super(context, looper, 91, eVar, aVar, bVar);
        GoogleSignInOptions.a aVar2 = googleSignInOptions != null ? new GoogleSignInOptions.a(googleSignInOptions) : new GoogleSignInOptions.a();
        aVar2.e(g8.h.a());
        if (!eVar.d().isEmpty()) {
            Iterator it = eVar.d().iterator();
            while (it.hasNext()) {
                aVar2.d((Scope) it.next(), new Scope[0]);
            }
        }
        this.R = aVar2.a();
    }

    @Override // v7.c
    protected final String D() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // v7.c
    protected final String E() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    @Override // v7.c, t7.a.f
    public final int k() {
        return 12451000;
    }

    public final GoogleSignInOptions k0() {
        return this.R;
    }

    @Override // v7.c
    protected final /* synthetic */ IInterface r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof u ? (u) iInterfaceQueryLocalInterface : new u(iBinder);
    }
}
