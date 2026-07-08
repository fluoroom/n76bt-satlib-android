package ne;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Collection;
import ne.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends e0 implements cf.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Type f22706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e0 f22707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Collection f22708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f22709e;

    public m(Type type) {
        e0 e0VarA;
        rd.m.e(type, "reflectType");
        this.f22706b = type;
        Type typeP = P();
        if (!(typeP instanceof GenericArrayType)) {
            if (typeP instanceof Class) {
                Class cls = (Class) typeP;
                if (cls.isArray()) {
                    e0.a aVar = e0.f22688a;
                    Class<?> componentType = cls.getComponentType();
                    rd.m.d(componentType, "getComponentType(...)");
                    e0VarA = aVar.a(componentType);
                }
            }
            throw new IllegalArgumentException("Not an array type (" + P().getClass() + "): " + P());
        }
        e0.a aVar2 = e0.f22688a;
        Type genericComponentType = ((GenericArrayType) typeP).getGenericComponentType();
        rd.m.d(genericComponentType, "getGenericComponentType(...)");
        e0VarA = aVar2.a(genericComponentType);
        this.f22707c = e0VarA;
        this.f22708d = ed.q.k();
    }

    @Override // ne.e0
    protected Type P() {
        return this.f22706b;
    }

    @Override // cf.f
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public e0 n() {
        return this.f22707c;
    }

    @Override // cf.d
    public Collection getAnnotations() {
        return this.f22708d;
    }

    @Override // cf.d
    public boolean m() {
        return this.f22709e;
    }
}
