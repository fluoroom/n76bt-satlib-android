package qb;

/* JADX INFO: loaded from: classes3.dex */
public abstract class x0 {

    public static final class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    public static x0 d() {
        x0 x0VarD = y0.b().d();
        if (x0VarD != null) {
            return x0VarD;
        }
        throw new a("No functional channel service provider found. Try adding a dependency on the grpc-okhttp, grpc-netty, or grpc-netty-shaded artifact");
    }

    protected abstract w0 a(String str);

    protected abstract boolean b();

    protected abstract int c();
}
