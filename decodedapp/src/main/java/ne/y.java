package ne;

import he.v1;
import he.w1;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class y extends u implements j, a0, cf.q {
    @Override // cf.s
    public boolean H() {
        return Modifier.isAbstract(getModifiers());
    }

    @Override // cf.s
    public boolean O() {
        return Modifier.isStatic(getModifiers());
    }

    @Override // cf.q
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public q N() {
        Class<?> declaringClass = Q().getDeclaringClass();
        rd.m.d(declaringClass, "getDeclaringClass(...)");
        return new q(declaringClass);
    }

    public abstract Member Q();

    protected final List R(Type[] typeArr, Annotation[][] annotationArr, boolean z10) throws IllegalAccessException, InvocationTargetException {
        String str;
        rd.m.e(typeArr, "parameterTypes");
        rd.m.e(annotationArr, "parameterAnnotations");
        ArrayList arrayList = new ArrayList(typeArr.length);
        List listB = c.f22678a.b(Q());
        int size = listB != null ? listB.size() - typeArr.length : 0;
        int length = typeArr.length;
        int i10 = 0;
        while (i10 < length) {
            e0 e0VarA = e0.f22688a.a(typeArr[i10]);
            if (listB != null) {
                str = (String) ed.q.c0(listB, i10 + size);
                if (str == null) {
                    throw new IllegalStateException(("No parameter with index " + i10 + '+' + size + " (name=" + getName() + " type=" + e0VarA + ") in " + this).toString());
                }
            } else {
                str = null;
            }
            arrayList.add(new g0(e0VarA, annotationArr[i10], str, z10 && i10 == ed.j.H(typeArr)));
            i10++;
        }
        return arrayList;
    }

    @Override // cf.d
    public /* bridge */ /* synthetic */ cf.a a(mf.c cVar) {
        return a(cVar);
    }

    public boolean equals(Object obj) {
        return (obj instanceof y) && rd.m.a(Q(), ((y) obj).Q());
    }

    @Override // cf.d
    public /* bridge */ /* synthetic */ Collection getAnnotations() {
        return getAnnotations();
    }

    @Override // ne.a0
    public int getModifiers() {
        return Q().getModifiers();
    }

    @Override // cf.t
    public mf.f getName() {
        mf.f fVarH;
        String name = Q().getName();
        return (name == null || (fVarH = mf.f.h(name)) == null) ? mf.h.f22011b : fVarH;
    }

    @Override // cf.s
    public w1 getVisibility() {
        int modifiers = getModifiers();
        return Modifier.isPublic(modifiers) ? v1.h.f15333c : Modifier.isPrivate(modifiers) ? v1.e.f15330c : Modifier.isProtected(modifiers) ? Modifier.isStatic(modifiers) ? le.c.f20549c : le.b.f20548c : le.a.f20547c;
    }

    public int hashCode() {
        return Q().hashCode();
    }

    @Override // cf.d
    public boolean m() {
        return false;
    }

    @Override // cf.s
    public boolean o() {
        return Modifier.isFinal(getModifiers());
    }

    public String toString() {
        return getClass().getName() + ": " + Q();
    }

    @Override // ne.j
    public AnnotatedElement w() {
        Member memberQ = Q();
        rd.m.c(memberQ, "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
        return (AnnotatedElement) memberQ;
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
