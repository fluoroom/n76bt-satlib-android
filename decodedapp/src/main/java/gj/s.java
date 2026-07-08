package gj;

import kj.d1;
import kj.f1;
import kj.r0;

/* JADX INFO: loaded from: classes3.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f14682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d1 f14683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final yj.m f14684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private f1 f14685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ej.m f14686e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final jj.a f14687f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final nj.a f14688g;

    public s() {
        g gVar = new g();
        this.f14682a = gVar;
        d1 d1Var = new d1(gVar);
        this.f14683b = d1Var;
        yj.m mVar = new yj.m(d1Var);
        this.f14684c = mVar;
        this.f14687f = new jj.a(gVar, mVar.h());
        this.f14688g = new nj.a(gVar);
    }

    public ej.m a() {
        ej.m mVar;
        synchronized (this) {
            try {
                if (this.f14686e == null) {
                    this.f14686e = new ej.m(b(), d(), r0.t());
                }
                mVar = this.f14686e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mVar;
    }

    public g b() {
        return this.f14682a;
    }

    public f1 c() {
        f1 f1Var;
        synchronized (this) {
            try {
                if (this.f14685d == null) {
                    this.f14685d = new f1(this.f14683b, d(), a());
                }
                f1Var = this.f14685d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f1Var;
    }

    public yj.m d() {
        return this.f14684c;
    }
}
