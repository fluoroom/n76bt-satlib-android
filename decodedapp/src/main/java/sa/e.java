package sa;

import android.content.Context;
import dd.d0;
import j$.util.concurrent.ConcurrentHashMap;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a */
    public static final e f27124a = new e();

    /* JADX INFO: renamed from: b */
    private static final ConcurrentHashMap f27125b = new ConcurrentHashMap();

    private e() {
    }

    private final boolean a(ta.a aVar) {
        aVar.L(e(aVar.i()));
        ConcurrentHashMap concurrentHashMap = f27125b;
        String strI = aVar.i();
        m.b(strI);
        return concurrentHashMap.containsKey(strI);
    }

    private final String e(String str) {
        return str == null ? "default" : str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ d0 i(e eVar, boolean z10, String str, boolean z11, int i10, Object obj) {
        ta.a aVarQ;
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            d dVar = (d) f27125b.get(str);
            z11 = (dVar == null || (aVarQ = dVar.q()) == null) ? true : aVarQ.u();
        }
        return eVar.h(z10, str, z11);
    }

    public final void b(Context context, ta.a aVar) {
        m.e(context, "context");
        m.e(aVar, "config");
        if (a(aVar)) {
            va.d dVarC = aVar.c();
            if (dVarC != null) {
                dVarC.e(false, "Tag exception. You need to set different EasyFloat tag.", null);
            }
            aVar.h();
            ya.g.f32466a.f("Tag exception. You need to set different EasyFloat tag.");
            return;
        }
        d dVar = new d(context, aVar);
        if (dVar.l()) {
            ConcurrentHashMap concurrentHashMap = f27125b;
            String strI = aVar.i();
            m.b(strI);
            concurrentHashMap.put(strI, dVar);
        }
    }

    public final d0 c(String str, boolean z10) {
        d dVarD = d(str);
        if (dVarD == null) {
            return null;
        }
        if (z10) {
            dVarD.x(z10);
        } else {
            dVarD.p();
        }
        return d0.f10897a;
    }

    public final d d(String str) {
        return (d) f27125b.get(e(str));
    }

    public final ConcurrentHashMap f() {
        return f27125b;
    }

    public final d g(String str) {
        return (d) f27125b.remove(e(str));
    }

    public final d0 h(boolean z10, String str, boolean z11) {
        d dVarD = d(str);
        if (dVarD == null) {
            return null;
        }
        dVarD.D(z10 ? 0 : 8, z11);
        return d0.f10897a;
    }
}
