package tg;

import dd.r;

/* JADX INFO: loaded from: classes3.dex */
public abstract class u {
    public static final Object a(Object obj, hd.e eVar) {
        if (!(obj instanceof s)) {
            return dd.r.a(obj);
        }
        r.a aVar = dd.r.f10916a;
        return dd.r.a(dd.s.a(((s) obj).f27867a));
    }

    public static final Object b(Object obj) {
        Throwable thB = dd.r.b(obj);
        return thB == null ? obj : new s(thB, false, 2, null);
    }

    public static final Object c(Object obj, i iVar) {
        Throwable thB = dd.r.b(obj);
        return thB == null ? obj : new s(thB, false, 2, null);
    }
}
