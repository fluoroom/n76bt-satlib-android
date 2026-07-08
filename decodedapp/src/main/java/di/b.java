package di;

import fi.d;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    public static a a(double d10, double d11) {
        if (d10 >= 0.0d) {
            return new a(gi.a.b(d11) * d10, d10 * gi.a.g(d11));
        }
        throw new ei.a(d.NEGATIVE_COMPLEX_MODULE, Double.valueOf(d10));
    }
}
