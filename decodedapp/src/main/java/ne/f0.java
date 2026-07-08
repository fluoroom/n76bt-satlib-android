package ne;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 extends u implements j, cf.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TypeVariable f22693a;

    public f0(TypeVariable typeVariable) {
        rd.m.e(typeVariable, "typeVariable");
        this.f22693a = typeVariable;
    }

    @Override // cf.y
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public List getUpperBounds() {
        Type[] bounds = this.f22693a.getBounds();
        rd.m.d(bounds, "getBounds(...)");
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type type : bounds) {
            arrayList.add(new s(type));
        }
        s sVar = (s) ed.q.y0(arrayList);
        return rd.m.a(sVar != null ? sVar.P() : null, Object.class) ? ed.q.k() : arrayList;
    }

    @Override // cf.d
    public /* bridge */ /* synthetic */ cf.a a(mf.c cVar) {
        return a(cVar);
    }

    public boolean equals(Object obj) {
        return (obj instanceof f0) && rd.m.a(this.f22693a, ((f0) obj).f22693a);
    }

    @Override // cf.d
    public /* bridge */ /* synthetic */ Collection getAnnotations() {
        return getAnnotations();
    }

    @Override // cf.t
    public mf.f getName() {
        mf.f fVarH = mf.f.h(this.f22693a.getName());
        rd.m.d(fVarH, "identifier(...)");
        return fVarH;
    }

    public int hashCode() {
        return this.f22693a.hashCode();
    }

    @Override // cf.d
    public boolean m() {
        return false;
    }

    public String toString() {
        return f0.class.getName() + ": " + this.f22693a;
    }

    @Override // ne.j
    public AnnotatedElement w() {
        TypeVariable typeVariable = this.f22693a;
        if (typeVariable instanceof AnnotatedElement) {
            return (AnnotatedElement) typeVariable;
        }
        return null;
    }

    @Override // ne.j, cf.d
    public g a(mf.c cVar) {
        Annotation[] declaredAnnotations;
        rd.m.e(cVar, "fqName");
        AnnotatedElement annotatedElementW = w();
        if (annotatedElementW == null || (declaredAnnotations = annotatedElementW.getDeclaredAnnotations()) == null) {
            return null;
        }
        return k.a(declaredAnnotations, cVar);
    }

    @Override // ne.j, cf.d
    public List getAnnotations() {
        Annotation[] declaredAnnotations;
        List listB;
        AnnotatedElement annotatedElementW = w();
        return (annotatedElementW == null || (declaredAnnotations = annotatedElementW.getDeclaredAnnotations()) == null || (listB = k.b(declaredAnnotations)) == null) ? ed.q.k() : listB;
    }
}
