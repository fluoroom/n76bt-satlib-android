package eg;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h2 f12098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f12099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c1 f12100c;

    public g0(h2 h2Var, Set set, c1 c1Var) {
        rd.m.e(h2Var, "howThisTypeIsUsed");
        this.f12098a = h2Var;
        this.f12099b = set;
        this.f12100c = c1Var;
    }

    public abstract c1 a();

    public abstract h2 b();

    public abstract Set c();

    public abstract g0 d(he.l1 l1Var);

    public abstract int hashCode();
}
