package g8;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.api.Status;
import n7.a;
import t7.a;
import t7.f;
import u7.t;

/* JADX INFO: loaded from: classes.dex */
public final class e extends t7.f implements n7.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final a.g f13674l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final a.AbstractC0384a f13675m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final t7.a f13676n;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f13677k;

    static {
        a.g gVar = new a.g();
        f13674l = gVar;
        b bVar = new b();
        f13675m = bVar;
        f13676n = new t7.a("Auth.Api.Identity.SignIn.API", bVar, gVar);
    }

    public e(Activity activity, n7.o oVar) {
        super(activity, f13676n, (a.d) oVar, f.a.f27596c);
        this.f13677k = h.a();
    }

    @Override // n7.e
    public final n7.f c(Intent intent) throws t7.b {
        if (intent == null) {
            throw new t7.b(Status.f7194h);
        }
        Status status = (Status) w7.e.b(intent, "status", Status.CREATOR);
        if (status == null) {
            throw new t7.b(Status.f7196s);
        }
        if (!status.g()) {
            throw new t7.b(status);
        }
        n7.f fVar = (n7.f) w7.e.b(intent, "sign_in_credential", n7.f.CREATOR);
        if (fVar != null) {
            return fVar;
        }
        throw new t7.b(Status.f7194h);
    }

    @Override // n7.e
    public final t8.g d(n7.a aVar) {
        v7.q.i(aVar);
        a.C0296a c0296aJ = n7.a.j(aVar);
        c0296aJ.h(this.f13677k);
        final n7.a aVarA = c0296aJ.a();
        return i(t.a().d(new s7.c("auth_api_credentials_begin_sign_in", 8L)).b(new u7.p() { // from class: g8.d
            @Override // u7.p
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                f fVar = (f) obj;
                ((s) fVar.C()).x(new c(this.f13672a, (t8.h) obj2), (n7.a) v7.q.i(aVarA), k.a(fVar.x()));
            }
        }).c(false).e(1553).a());
    }
}
