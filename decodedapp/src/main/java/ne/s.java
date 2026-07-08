package ne;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ne.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends e0 implements cf.j {

    /* JADX INFO: renamed from: b */
    private final Type f22720b;

    /* JADX INFO: renamed from: c */
    private final cf.i f22721c;

    public s(Type type) {
        cf.i qVar;
        rd.m.e(type, "reflectType");
        this.f22720b = type;
        Type typeP = P();
        if (typeP instanceof Class) {
            qVar = new q((Class) typeP);
        } else if (typeP instanceof TypeVariable) {
            qVar = new f0((TypeVariable) typeP);
        } else {
            if (!(typeP instanceof ParameterizedType)) {
                throw new IllegalStateException("Not a classifier type (" + typeP.getClass() + "): " + typeP);
            }
            Type rawType = ((ParameterizedType) typeP).getRawType();
            rd.m.c(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            qVar = new q((Class) rawType);
        }
        this.f22721c = qVar;
    }

    @Override // cf.j
    public List E() {
        List listH = f.h(P());
        e0.a aVar = e0.f22688a;
        ArrayList arrayList = new ArrayList(ed.q.v(listH, 10));
        Iterator it = listH.iterator();
        while (it.hasNext()) {
            arrayList.add(aVar.a((Type) it.next()));
        }
        return arrayList;
    }

    @Override // ne.e0
    public Type P() {
        return this.f22720b;
    }

    @Override // ne.e0, cf.d
    public cf.a a(mf.c cVar) {
        rd.m.e(cVar, "fqName");
        return null;
    }

    @Override // cf.j
    public cf.i f() {
        return this.f22721c;
    }

    @Override // cf.d
    public Collection getAnnotations() {
        return ed.q.k();
    }

    @Override // cf.d
    public boolean m() {
        return false;
    }

    @Override // cf.j
    public String p() {
        return P().toString();
    }

    @Override // cf.j
    public boolean x() {
        Type typeP = P();
        if (typeP instanceof Class) {
            TypeVariable[] typeParameters = ((Class) typeP).getTypeParameters();
            rd.m.d(typeParameters, "getTypeParameters(...)");
            if (!(typeParameters.length == 0)) {
                return true;
            }
        }
        return false;
    }

    @Override // cf.j
    public String y() {
        throw new UnsupportedOperationException("Type not found: " + P());
    }
}
