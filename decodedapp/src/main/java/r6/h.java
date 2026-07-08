package r6;

import d6.b0;
import d6.k;
import d6.r;
import java.io.Serializable;
import java.util.Map;
import x6.l0;

/* JADX INFO: loaded from: classes.dex */
public class h implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Map f25521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected r.b f25522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected b0.a f25523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected l0 f25524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected Boolean f25525e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected Boolean f25526f;

    public h() {
        this(null, r.b.c(), b0.a.c(), l0.a.q(), null, null);
    }

    public k.d a(Class cls) {
        g gVar;
        k.d dVarB;
        Map map = this.f25521a;
        if (map != null && (gVar = (g) map.get(cls)) != null && (dVarB = gVar.b()) != null) {
            return !dVarB.k() ? dVarB.r(this.f25526f) : dVarB;
        }
        Boolean bool = this.f25526f;
        return bool == null ? k.d.b() : k.d.c(bool.booleanValue());
    }

    public g b(Class cls) {
        Map map = this.f25521a;
        if (map == null) {
            return null;
        }
        return (g) map.get(cls);
    }

    public r.b c() {
        return this.f25522b;
    }

    public Boolean d() {
        return this.f25525e;
    }

    public b0.a e() {
        return this.f25523c;
    }

    public l0 f() {
        return this.f25524d;
    }

    public void g(r.b bVar) {
        this.f25522b = bVar;
    }

    protected h(Map map, r.b bVar, b0.a aVar, l0 l0Var, Boolean bool, Boolean bool2) {
        this.f25521a = map;
        this.f25522b = bVar;
        this.f25523c = aVar;
        this.f25524d = l0Var;
        this.f25525e = bool;
        this.f25526f = bool2;
    }
}
