package ne;

import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 extends e0 implements cf.v {

    /* JADX INFO: renamed from: b */
    private final Class f22682b;

    /* JADX INFO: renamed from: c */
    private final Collection f22683c;

    /* JADX INFO: renamed from: d */
    private final boolean f22684d;

    public c0(Class cls) {
        rd.m.e(cls, "reflectType");
        this.f22682b = cls;
        this.f22683c = ed.q.k();
    }

    @Override // ne.e0
    /* JADX INFO: renamed from: Q */
    public Class P() {
        return this.f22682b;
    }

    @Override // cf.d
    public Collection getAnnotations() {
        return this.f22683c;
    }

    @Override // cf.v
    public ee.l getType() {
        if (rd.m.a(P(), Void.TYPE)) {
            return null;
        }
        return vf.e.e(P().getName()).h();
    }

    @Override // cf.d
    public boolean m() {
        return this.f22684d;
    }
}
