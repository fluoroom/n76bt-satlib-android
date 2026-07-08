package yd;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class r implements TypeVariable, Type {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f32539a;

    public r(n nVar) {
        rd.m.e(nVar, "typeParameter");
        this.f32539a = nVar;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) obj;
        return rd.m.a(getName(), typeVariable.getName()) && rd.m.a(getGenericDeclaration(), typeVariable.getGenericDeclaration());
    }

    @Override // java.lang.reflect.TypeVariable
    public Type[] getBounds() {
        List upperBounds = this.f32539a.getUpperBounds();
        ArrayList arrayList = new ArrayList(ed.q.v(upperBounds, 10));
        Iterator it = upperBounds.iterator();
        while (it.hasNext()) {
            arrayList.add(s.c((m) it.next(), true));
        }
        return (Type[]) arrayList.toArray(new Type[0]);
    }

    @Override // java.lang.reflect.TypeVariable
    public GenericDeclaration getGenericDeclaration() {
        throw new dd.p("An operation is not implemented: " + ("getGenericDeclaration() is not yet supported for type variables created from KType: " + this.f32539a));
    }

    @Override // java.lang.reflect.TypeVariable
    public String getName() {
        return this.f32539a.getName();
    }

    @Override // java.lang.reflect.Type
    public String getTypeName() {
        return getName();
    }

    public int hashCode() {
        return getName().hashCode() ^ getGenericDeclaration().hashCode();
    }

    public String toString() {
        return getTypeName();
    }
}
