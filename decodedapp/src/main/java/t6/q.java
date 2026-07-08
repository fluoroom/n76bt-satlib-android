package t6;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class q implements s6.r, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final q f27530c = new q(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final q f27531d = new q(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Object f27532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final i7.a f27533b;

    protected q(Object obj) {
        this.f27532a = obj;
        this.f27533b = obj == null ? i7.a.ALWAYS_NULL : i7.a.CONSTANT;
    }

    public static q c(Object obj) {
        return obj == null ? f27531d : new q(obj);
    }

    public static boolean d(s6.r rVar) {
        return rVar == f27530c;
    }

    public static q e() {
        return f27531d;
    }

    public static q f() {
        return f27530c;
    }

    @Override // s6.r
    public Object a(p6.h hVar) {
        return this.f27532a;
    }

    @Override // s6.r
    public /* synthetic */ Object b(p6.h hVar) {
        return s6.q.a(this, hVar);
    }
}
