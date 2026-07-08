package tg;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class g1 extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient f1 f27818a;

    public g1(String str, Throwable th2, f1 f1Var) {
        super(str);
        this.f27818a = f1Var;
        if (th2 != null) {
            initCause(th2);
        }
    }

    public final f1 a() {
        f1 f1Var = this.f27818a;
        return f1Var == null ? q1.f27858b : f1Var;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return rd.m.a(g1Var.getMessage(), getMessage()) && rd.m.a(g1Var.a(), a()) && rd.m.a(g1Var.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        rd.m.b(message);
        int iHashCode = message.hashCode() * 31;
        f1 f1VarA = a();
        int iHashCode2 = (iHashCode + (f1VarA != null ? f1VarA.hashCode() : 0)) * 31;
        Throwable cause = getCause();
        return iHashCode2 + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + "; job=" + a();
    }
}
