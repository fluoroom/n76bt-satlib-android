package kj;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public enum w0 {
    ITRF_2020(2020),
    ITRF_2014(2014),
    ITRF_2008(2008),
    ITRF_2005(2005),
    ITRF_2000(2000),
    ITRF_1997(1997),
    ITRF_1996(1996),
    ITRF_1994(1994),
    ITRF_1993(1993),
    ITRF_1992(1992),
    ITRF_1991(1991),
    ITRF_1990(1990),
    ITRF_1989(1989),
    ITRF_1988(1988);


    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final Pattern f20252z = Pattern.compile("[Ii][Tt][Rr][Ff][-_ ]?([0-9]{2,4})");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f20253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f20254b;

    w0(int i10) {
        this.f20253a = i10;
        this.f20254b = "ITRF-" + i10;
    }

    public static w0 a(int i10) {
        int i11 = i10 < 100 ? (i10 > 87 ? 1900 : 2000) + i10 : i10;
        for (w0 w0Var : values()) {
            if (w0Var.e() == i11) {
                return w0Var;
            }
        }
        throw new hj.a(hj.f.NO_SUCH_ITRF_FRAME, Integer.valueOf(i10));
    }

    public static w0 d(String str) {
        Matcher matcher = f20252z.matcher(str);
        if (!matcher.matches()) {
            throw new hj.a(hj.f.NO_SUCH_ITRF_FRAME, str);
        }
        try {
            return a(Integer.parseInt(matcher.group(1)));
        } catch (hj.a unused) {
            throw new hj.a(hj.f.NO_SUCH_ITRF_FRAME, str);
        }
    }

    public int e() {
        return this.f20253a;
    }
}
