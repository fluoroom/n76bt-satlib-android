package o8;

import android.app.Activity;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p8.b0;

/* JADX INFO: loaded from: classes.dex */
final class o extends c8.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final androidx.fragment.app.o f23318e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected c8.e f23319f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Activity f23320g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f23321h = new ArrayList();

    o(androidx.fragment.app.o oVar) {
        this.f23318e = oVar;
    }

    static /* synthetic */ void v(o oVar, Activity activity) {
        oVar.f23320g = activity;
        oVar.x();
    }

    @Override // c8.a
    protected final void a(c8.e eVar) {
        this.f23319f = eVar;
        x();
    }

    public final void w(f fVar) {
        if (b() != null) {
            ((n) b()).a(fVar);
        } else {
            this.f23321h.add(fVar);
        }
    }

    public final void x() {
        if (this.f23320g == null || this.f23319f == null || b() != null) {
            return;
        }
        try {
            e.a(this.f23320g);
            p8.d dVarE1 = b0.a(this.f23320g, null).e1(c8.d.v1(this.f23320g));
            if (dVarE1 == null) {
                return;
            }
            this.f23319f.a(new n(this.f23318e, dVarE1));
            List list = this.f23321h;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((n) b()).a((f) it.next());
            }
            list.clear();
        } catch (RemoteException e10) {
            throw new q8.q(e10);
        } catch (s7.f unused) {
        }
    }
}
