package fh;

import dd.q;
import dd.w;
import eh.b0;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    public static final Charset a(b0 b0Var) {
        Charset charsetD;
        return (b0Var == null || (charsetD = b0.d(b0Var, null, 1, null)) == null) ? rg.d.f26007b : charsetD;
    }

    public static final q b(b0 b0Var) {
        Charset charset = rg.d.f26007b;
        if (b0Var != null) {
            Charset charsetD = b0.d(b0Var, null, 1, null);
            if (charsetD == null) {
                b0Var = b0.f12251e.b(b0Var + "; charset=utf-8");
            } else {
                charset = charsetD;
            }
        }
        return w.a(charset, b0Var);
    }

    public static final String[] c(eh.m mVar, String[] strArr) {
        rd.m.e(mVar, "<this>");
        rd.m.e(strArr, "socketEnabledCipherSuites");
        return mVar.d() != null ? m.w(mVar.d(), strArr, eh.j.f12469b.c()) : strArr;
    }
}
