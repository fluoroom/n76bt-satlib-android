package b7;

import com.fasterxml.jackson.databind.JavaType;
import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class o extends a7.d implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected LinkedHashSet f3707a;

    @Override // a7.d
    public Collection a(r6.q qVar, x6.d dVar) {
        r6.q qVar2;
        p6.b bVarG = qVar.g();
        HashMap map = new HashMap();
        if (this.f3707a != null) {
            Class clsE = dVar.e();
            for (a7.b bVar : this.f3707a) {
                if (clsE.isAssignableFrom(bVar.b())) {
                    qVar2 = qVar;
                    f(x6.e.m(qVar, bVar.b()), bVar, qVar2, bVarG, map);
                } else {
                    qVar2 = qVar;
                }
                qVar = qVar2;
            }
        }
        f(dVar, new a7.b(dVar.e(), null), qVar, bVarG, map);
        return new ArrayList(map.values());
    }

    @Override // a7.d
    public Collection b(r6.q qVar, x6.k kVar, JavaType javaType) {
        Class clsE;
        List<a7.b> listN0;
        r6.q qVar2;
        p6.b bVarG = qVar.g();
        if (javaType != null) {
            clsE = javaType.r();
        } else {
            if (kVar == null) {
                throw new IllegalArgumentException("Both property and base type are nulls");
            }
            clsE = kVar.e();
        }
        HashMap map = new HashMap();
        LinkedHashSet<a7.b> linkedHashSet = this.f3707a;
        if (linkedHashSet != null) {
            for (a7.b bVar : linkedHashSet) {
                if (clsE.isAssignableFrom(bVar.b())) {
                    qVar2 = qVar;
                    f(x6.e.m(qVar, bVar.b()), bVar, qVar2, bVarG, map);
                } else {
                    qVar2 = qVar;
                }
                qVar = qVar2;
            }
        }
        r6.q qVar3 = qVar;
        if (kVar != null && (listN0 = bVarG.n0(kVar)) != null) {
            for (a7.b bVar2 : listN0) {
                f(x6.e.m(qVar3, bVar2.b()), bVar2, qVar3, bVarG, map);
            }
        }
        f(x6.e.m(qVar3, clsE), new a7.b(clsE, null), qVar3, bVarG, map);
        return new ArrayList(map.values());
    }

    @Override // a7.d
    public Collection c(r6.q qVar, x6.d dVar) {
        Class clsE = dVar.e();
        HashSet hashSet = new HashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        g(dVar, new a7.b(clsE, null), qVar, hashSet, linkedHashMap);
        LinkedHashSet<a7.b> linkedHashSet = this.f3707a;
        if (linkedHashSet != null) {
            for (a7.b bVar : linkedHashSet) {
                if (clsE.isAssignableFrom(bVar.b())) {
                    g(x6.e.m(qVar, bVar.b()), bVar, qVar, hashSet, linkedHashMap);
                }
            }
        }
        return h(clsE, hashSet, linkedHashMap);
    }

    @Override // a7.d
    public Collection d(r6.q qVar, x6.k kVar, JavaType javaType) {
        List<a7.b> listN0;
        p6.b bVarG = qVar.g();
        Class clsR = javaType.r();
        HashSet hashSet = new HashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        g(x6.e.m(qVar, clsR), new a7.b(clsR, null), qVar, hashSet, linkedHashMap);
        if (kVar != null && (listN0 = bVarG.n0(kVar)) != null) {
            for (a7.b bVar : listN0) {
                g(x6.e.m(qVar, bVar.b()), bVar, qVar, hashSet, linkedHashMap);
            }
        }
        LinkedHashSet<a7.b> linkedHashSet = this.f3707a;
        if (linkedHashSet != null) {
            for (a7.b bVar2 : linkedHashSet) {
                if (clsR.isAssignableFrom(bVar2.b())) {
                    g(x6.e.m(qVar, bVar2.b()), bVar2, qVar, hashSet, linkedHashMap);
                }
            }
        }
        return h(clsR, hashSet, linkedHashMap);
    }

    @Override // a7.d
    public void e(a7.b... bVarArr) {
        if (this.f3707a == null) {
            this.f3707a = new LinkedHashSet();
        }
        for (a7.b bVar : bVarArr) {
            this.f3707a.add(bVar);
        }
    }

    protected void f(x6.d dVar, a7.b bVar, r6.q qVar, p6.b bVar2, HashMap map) {
        String strO0;
        if (!bVar.c() && (strO0 = bVar2.o0(dVar)) != null) {
            bVar = new a7.b(bVar.b(), strO0);
        }
        a7.b bVar3 = new a7.b(bVar.b());
        if (map.containsKey(bVar3)) {
            if (!bVar.c() || ((a7.b) map.get(bVar3)).c()) {
                return;
            }
            map.put(bVar3, bVar);
            return;
        }
        map.put(bVar3, bVar);
        List<a7.b> listN0 = bVar2.n0(dVar);
        if (listN0 == null || listN0.isEmpty()) {
            return;
        }
        for (a7.b bVar4 : listN0) {
            f(x6.e.m(qVar, bVar4.b()), bVar4, qVar, bVar2, map);
        }
    }

    protected void g(x6.d dVar, a7.b bVar, r6.q qVar, Set set, Map map) {
        List<a7.b> listN0;
        String strO0;
        p6.b bVarG = qVar.g();
        if (!bVar.c() && (strO0 = bVarG.o0(dVar)) != null) {
            bVar = new a7.b(bVar.b(), strO0);
        }
        if (bVar.c()) {
            map.put(bVar.a(), bVar);
        }
        if (!set.add(bVar.b()) || (listN0 = bVarG.n0(dVar)) == null || listN0.isEmpty()) {
            return;
        }
        for (a7.b bVar2 : listN0) {
            g(x6.e.m(qVar, bVar2.b()), bVar2, qVar, set, map);
        }
    }

    protected Collection h(Class cls, Set set, Map map) {
        ArrayList arrayList = new ArrayList(map.values());
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            set.remove(((a7.b) it.next()).b());
        }
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            Class cls2 = (Class) it2.next();
            if (cls2 != cls || !Modifier.isAbstract(cls2.getModifiers())) {
                arrayList.add(new a7.b(cls2));
            }
        }
        return arrayList;
    }
}
