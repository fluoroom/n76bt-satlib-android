package qb;

import java.nio.charset.Charset;
import qb.z0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f24670a = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t9.a f24671b = z0.f24835f;

    public interface a extends z0.k {
    }

    public static int a(z0 z0Var) {
        return z0Var.h();
    }

    public static z0.h b(String str, a aVar) {
        boolean z10 = false;
        if (str != null && !str.isEmpty() && str.charAt(0) == ':') {
            z10 = true;
        }
        return z0.h.h(str, z10, aVar);
    }

    public static z0 c(byte[]... bArr) {
        return new z0(bArr);
    }

    public static byte[][] d(z0 z0Var) {
        return z0Var.q();
    }
}
