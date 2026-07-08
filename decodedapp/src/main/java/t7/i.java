package t7;

import com.google.android.gms.common.api.Status;
import u7.s;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public static h a(k kVar, g gVar) {
        v7.q.j(kVar, "Result must not be null");
        v7.q.b(!kVar.getStatus().g(), "Status code must not be SUCCESS");
        o oVar = new o(gVar, kVar);
        oVar.f(kVar);
        return oVar;
    }

    public static h b(Status status, g gVar) {
        v7.q.j(status, "Result must not be null");
        s sVar = new s(gVar);
        sVar.f(status);
        return sVar;
    }
}
