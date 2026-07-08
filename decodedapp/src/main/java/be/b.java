package be;

import dd.r;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    static {
        Object objA;
        try {
            r.a aVar = dd.r.f10916a;
            objA = dd.r.a(Class.forName("java.lang.ClassValue"));
        } catch (Throwable th2) {
            r.a aVar2 = dd.r.f10916a;
            objA = dd.r.a(dd.s.a(th2));
        }
        if (dd.r.d(objA)) {
            objA = Boolean.TRUE;
        }
        Object objA2 = dd.r.a(objA);
        Boolean bool = Boolean.FALSE;
        if (dd.r.c(objA2)) {
            objA2 = bool;
        }
        ((Boolean) objA2).getClass();
    }

    public static final a a(qd.l lVar) {
        rd.m.e(lVar, "compute");
        return new i(lVar);
    }
}
