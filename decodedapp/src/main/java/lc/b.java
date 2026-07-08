package lc;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    public static RuntimeException a(Throwable th2) {
        throw xc.e.d(th2);
    }

    public static void b(Throwable th2) {
        if (th2 instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th2);
        }
        if (th2 instanceof ThreadDeath) {
            throw ((ThreadDeath) th2);
        }
        if (th2 instanceof LinkageError) {
            throw ((LinkageError) th2);
        }
    }
}
