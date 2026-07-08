package nj;

import ej.n;
import kj.r0;

/* JADX INFO: loaded from: classes3.dex */
public class b extends n implements ej.a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final double f22969m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final double f22970n;

    public b(double d10, double d11, r0 r0Var, double d12, double d13) {
        super(d10, d11, r0Var);
        this.f22969m = d12;
        this.f22970n = d13;
    }

    public static b f(r0 r0Var) {
        return new b(6378137.0d, 0.0033528106647474805d, r0Var, 3.986004418E14d, 7.292115E-5d);
    }
}
