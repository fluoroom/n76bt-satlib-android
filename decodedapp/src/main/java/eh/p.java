package eh;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f12587a = new p();

    private p() {
    }

    public static final String a(String str, String str2, Charset charset) {
        rd.m.e(str, "username");
        rd.m.e(str2, "password");
        rd.m.e(charset, "charset");
        return "Basic " + vh.h.f30792d.c(str + ':' + str2, charset).a();
    }
}
