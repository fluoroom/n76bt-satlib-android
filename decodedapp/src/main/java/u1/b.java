package u1;

import j$.util.Base64;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import x1.d;

/* JADX INFO: loaded from: classes.dex */
final class b implements x1.b, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String[] f27942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x1.c f27943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f27944c;

    b(String str) {
        this(new w1.c(), str);
    }

    @Override // x1.d
    public x1.a a(String str) {
        return this.f27944c.a(str);
    }

    b(w1.c cVar, String str) {
        String[] strArrA = c.a(str);
        this.f27942a = strArrA;
        try {
            byte[] bArrDecode = Base64.getUrlDecoder().decode(strArrA[0]);
            Charset charset = StandardCharsets.UTF_8;
            String str2 = new String(bArrDecode, charset);
            String str3 = new String(Base64.getUrlDecoder().decode(strArrA[1]), charset);
            this.f27943b = cVar.e(str2);
            this.f27944c = cVar.f(str3);
        } catch (IllegalArgumentException e10) {
            throw new v1.a("The input is not a valid base 64 encoded string.", e10);
        } catch (NullPointerException e11) {
            throw new v1.a("The UTF-8 Charset isn't initialized.", e11);
        }
    }
}
