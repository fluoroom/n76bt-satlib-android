package tg;

import dd.r;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h0 {
    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String c(hd.e eVar) {
        Object objA;
        if (eVar instanceof xg.f) {
            return ((xg.f) eVar).toString();
        }
        try {
            r.a aVar = dd.r.f10916a;
            objA = dd.r.a(eVar + '@' + b(eVar));
        } catch (Throwable th2) {
            r.a aVar2 = dd.r.f10916a;
            objA = dd.r.a(dd.s.a(th2));
        }
        if (dd.r.b(objA) != null) {
            objA = eVar.getClass().getName() + '@' + b(eVar);
        }
        return (String) objA;
    }
}
