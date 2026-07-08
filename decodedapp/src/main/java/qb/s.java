package qb;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public class s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Logger f24745b = Logger.getLogger(s.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s f24746c = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f24747a = 0;

    public interface a {
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final c f24748a;

        static {
            AtomicReference atomicReference = new AtomicReference();
            f24748a = a(atomicReference);
            Throwable th2 = (Throwable) atomicReference.get();
            if (th2 != null) {
                s.f24745b.log(Level.FINE, "Storage override doesn't exist. Using default", th2);
            }
        }

        private static c a(AtomicReference atomicReference) {
            try {
                return (c) Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(c.class).getConstructor(null).newInstance(null);
            } catch (ClassNotFoundException e10) {
                atomicReference.set(e10);
                return new a2();
            } catch (Exception e11) {
                throw new RuntimeException("Storage override failed to initialize", e11);
            }
        }
    }

    public static abstract class c {
        public abstract s a();

        public abstract void b(s sVar, s sVar2);

        public abstract s c(s sVar);
    }

    private s() {
        k(0);
    }

    static Object d(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    public static s e() {
        s sVarA = j().a();
        return sVarA == null ? f24746c : sVarA;
    }

    static c j() {
        return b.f24748a;
    }

    private static void k(int i10) {
        if (i10 == 1000) {
            f24745b.log(Level.SEVERE, "Context ancestry chain length is abnormally long. This suggests an error in application code. Length exceeded: 1000", (Throwable) new Exception());
        }
    }

    public void a(a aVar, Executor executor) {
        d(aVar, "cancellationListener");
        d(executor, "executor");
    }

    public s b() {
        s sVarC = j().c(this);
        return sVarC == null ? f24746c : sVarC;
    }

    public Throwable c() {
        return null;
    }

    public void f(s sVar) {
        d(sVar, "toAttach");
        j().b(this, sVar);
    }

    public u g() {
        return null;
    }

    public boolean h() {
        return false;
    }

    public void i(a aVar) {
    }
}
