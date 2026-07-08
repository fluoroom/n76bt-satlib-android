package rg;

import com.facebook.stetho.common.Utf8Charset;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f26006a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f26007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f26008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Charset f26009d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Charset f26010e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Charset f26011f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Charset f26012g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile Charset f26013h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static volatile Charset f26014i;

    static {
        Charset charsetForName = Charset.forName(Utf8Charset.NAME);
        rd.m.d(charsetForName, "forName(...)");
        f26007b = charsetForName;
        Charset charsetForName2 = Charset.forName("UTF-16");
        rd.m.d(charsetForName2, "forName(...)");
        f26008c = charsetForName2;
        Charset charsetForName3 = Charset.forName("UTF-16BE");
        rd.m.d(charsetForName3, "forName(...)");
        f26009d = charsetForName3;
        Charset charsetForName4 = Charset.forName("UTF-16LE");
        rd.m.d(charsetForName4, "forName(...)");
        f26010e = charsetForName4;
        Charset charsetForName5 = Charset.forName("US-ASCII");
        rd.m.d(charsetForName5, "forName(...)");
        f26011f = charsetForName5;
        Charset charsetForName6 = Charset.forName("ISO-8859-1");
        rd.m.d(charsetForName6, "forName(...)");
        f26012g = charsetForName6;
    }

    private d() {
    }

    public final Charset a() {
        Charset charset = f26014i;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32BE");
        rd.m.d(charsetForName, "forName(...)");
        f26014i = charsetForName;
        return charsetForName;
    }

    public final Charset b() {
        Charset charset = f26013h;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32LE");
        rd.m.d(charsetForName, "forName(...)");
        f26013h = charsetForName;
        return charsetForName;
    }
}
