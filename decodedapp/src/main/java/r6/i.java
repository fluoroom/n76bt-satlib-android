package r6;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class i implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f25527d = new i(a.HEURISTIC);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i f25528e = new i(a.PROPERTIES);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final i f25529f = new i(a.DELEGATING);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final i f25530g = new i(a.REQUIRE_MODE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final a f25531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final boolean f25532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final boolean f25533c;

    public enum a {
        DELEGATING,
        PROPERTIES,
        HEURISTIC,
        REQUIRE_MODE
    }

    protected i(a aVar, boolean z10, boolean z11) {
        this.f25531a = aVar;
        this.f25532b = z10;
        this.f25533c = z11;
    }

    public boolean a() {
        return this.f25532b;
    }

    public boolean b(Class cls) {
        if (this.f25532b) {
            return false;
        }
        return this.f25533c || !i7.h.N(cls) || Throwable.class.isAssignableFrom(cls);
    }

    public boolean c() {
        return this.f25531a == a.DELEGATING;
    }

    public boolean d() {
        return this.f25531a == a.PROPERTIES;
    }

    public a e() {
        return this.f25531a;
    }

    protected i(a aVar) {
        this(aVar, false, false);
    }
}
