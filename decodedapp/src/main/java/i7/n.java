package i7;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {
    private static boolean b(Throwable th2) {
        return (th2 instanceof VirtualMachineError) || (th2 instanceof ThreadDeath) || (th2 instanceof InterruptedException) || (th2 instanceof ClassCircularityError) || (th2 instanceof ClassFormatError) || (th2 instanceof IncompatibleClassChangeError) || m.a(th2) || (th2 instanceof VerifyError);
    }

    public static void c(Throwable th2) {
        if (b(th2)) {
            if (th2 instanceof Error) {
                throw ((Error) th2);
            }
            if (!(th2 instanceof RuntimeException)) {
                throw new RuntimeException(th2);
            }
            throw ((RuntimeException) th2);
        }
    }

    public static Object d(IOException iOException) throws Throwable {
        a(iOException);
        return null;
    }

    private static void a(Throwable th2) throws Throwable {
        throw th2;
    }
}
