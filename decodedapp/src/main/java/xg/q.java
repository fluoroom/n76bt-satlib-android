package xg;

import java.util.List;
import tg.o1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class q {
    private static final r a(Throwable th2, String str) throws Throwable {
        if (th2 != null) {
            throw th2;
        }
        d();
        throw new dd.f();
    }

    static /* synthetic */ r b(Throwable th2, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            th2 = null;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        return a(th2, str);
    }

    public static final boolean c(o1 o1Var) {
        return o1Var.v0() instanceof r;
    }

    public static final Void d() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    public static final o1 e(o oVar, List list) {
        try {
            return oVar.b(list);
        } catch (Throwable th2) {
            return a(th2, oVar.a());
        }
    }
}
