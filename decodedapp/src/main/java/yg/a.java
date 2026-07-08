package yg;

import dd.d0;
import dd.r;
import dd.s;
import hd.e;
import qd.p;
import tg.l0;
import xg.g;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    private static final void a(e eVar, Throwable th2) throws Throwable {
        if (th2 instanceof l0) {
            th2 = ((l0) th2).getCause();
        }
        r.a aVar = r.f10916a;
        eVar.d(r.a(s.a(th2)));
        throw th2;
    }

    public static final void b(e eVar, e eVar2) throws Throwable {
        try {
            e eVarC = id.b.c(eVar);
            r.a aVar = r.f10916a;
            g.b(eVarC, r.a(d0.f10897a));
        } catch (Throwable th2) {
            a(eVar2, th2);
        }
    }

    public static final void c(p pVar, Object obj, e eVar) {
        try {
            e eVarC = id.b.c(id.b.a(pVar, obj, eVar));
            r.a aVar = r.f10916a;
            g.b(eVarC, r.a(d0.f10897a));
        } catch (Throwable th2) {
            a(eVar, th2);
        }
    }
}
