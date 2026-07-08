package mi;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import mi.g;

/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final ExecutorService f22310m = Executors.newCachedThreadPool();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f22315e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f22317g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f22318h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    List f22320j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    g f22321k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    h f22322l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f22311a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f22312b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f22313c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f22314d = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f22316f = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    ExecutorService f22319i = f22310m;

    d() {
    }

    public c a() {
        return new c(this);
    }

    g b() {
        g gVar = this.f22321k;
        return gVar != null ? gVar : g.a.a();
    }

    h c() {
        h hVar = this.f22322l;
        if (hVar != null) {
            return hVar;
        }
        if (ni.a.a()) {
            return ni.a.b().f22964b;
        }
        return null;
    }

    public d d(boolean z10) {
        this.f22312b = z10;
        return this;
    }
}
