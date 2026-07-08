package ne;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import ne.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class h0 extends e0 implements cf.c0 {

    /* JADX INFO: renamed from: b */
    private final WildcardType f22701b;

    /* JADX INFO: renamed from: c */
    private final Collection f22702c;

    /* JADX INFO: renamed from: d */
    private final boolean f22703d;

    public h0(WildcardType wildcardType) {
        rd.m.e(wildcardType, "reflectType");
        this.f22701b = wildcardType;
        this.f22702c = ed.q.k();
    }

    @Override // cf.c0
    public boolean J() {
        rd.m.d(P().getUpperBounds(), "getUpperBounds(...)");
        return !rd.m.a(ed.j.E(r0), Object.class);
    }

    @Override // cf.c0
    /* JADX INFO: renamed from: Q */
    public e0 C() {
        Type[] upperBounds = P().getUpperBounds();
        Type[] lowerBounds = P().getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            throw new UnsupportedOperationException("Wildcard types with many bounds are not yet supported: " + P());
        }
        if (lowerBounds.length == 1) {
            e0.a aVar = e0.f22688a;
            rd.m.b(lowerBounds);
            Object objX = ed.j.X(lowerBounds);
            rd.m.d(objX, "single(...)");
            return aVar.a((Type) objX);
        }
        if (upperBounds.length == 1) {
            rd.m.b(upperBounds);
            Type type = (Type) ed.j.X(upperBounds);
            if (!rd.m.a(type, Object.class)) {
                e0.a aVar2 = e0.f22688a;
                rd.m.b(type);
                return aVar2.a(type);
            }
        }
        return null;
    }

    @Override // ne.e0
    /* JADX INFO: renamed from: R */
    public WildcardType P() {
        return this.f22701b;
    }

    @Override // cf.d
    public Collection getAnnotations() {
        return this.f22702c;
    }

    @Override // cf.d
    public boolean m() {
        return this.f22703d;
    }
}
