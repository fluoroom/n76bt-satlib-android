package ne;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import ne.h;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends u implements cf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Annotation f22694a;

    public g(Annotation annotation) {
        rd.m.e(annotation, "annotation");
        this.f22694a = annotation;
    }

    public final Annotation P() {
        return this.f22694a;
    }

    @Override // cf.a
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public q z() {
        return new q(pd.a.b(pd.a.a(this.f22694a)));
    }

    @Override // cf.a
    public Collection c() throws IllegalAccessException, InvocationTargetException {
        Method[] declaredMethods = pd.a.b(pd.a.a(this.f22694a)).getDeclaredMethods();
        rd.m.d(declaredMethods, "getDeclaredMethods(...)");
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            h.a aVar = h.f22699b;
            Object objInvoke = method.invoke(this.f22694a, null);
            rd.m.d(objInvoke, "invoke(...)");
            arrayList.add(aVar.a(objInvoke, mf.f.h(method.getName())));
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof g) && this.f22694a == ((g) obj).f22694a;
    }

    @Override // cf.a
    public mf.b h() {
        return f.e(pd.a.b(pd.a.a(this.f22694a)));
    }

    public int hashCode() {
        return System.identityHashCode(this.f22694a);
    }

    @Override // cf.a
    public boolean j() {
        return false;
    }

    public String toString() {
        return g.class.getName() + ": " + this.f22694a;
    }

    @Override // cf.a
    public boolean v() {
        return false;
    }
}
