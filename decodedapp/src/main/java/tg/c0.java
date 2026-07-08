package tg;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c0 {
    public static final void a(hd.i iVar, Throwable th2) {
        if (th2 instanceof l0) {
            th2 = ((l0) th2).getCause();
        }
        try {
            b0 b0Var = (b0) iVar.a(b0.f27799p);
            if (b0Var != null) {
                b0Var.T(iVar, th2);
            } else {
                xg.d.a(iVar, th2);
            }
        } catch (Throwable th3) {
            xg.d.a(iVar, b(th2, th3));
        }
    }

    public static final Throwable b(Throwable th2, Throwable th3) {
        if (th2 == th3) {
            return th2;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
        dd.b.a(runtimeException, th2);
        return runtimeException;
    }
}
