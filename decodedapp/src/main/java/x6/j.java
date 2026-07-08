package x6;

import com.fasterxml.jackson.databind.JavaType;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import x6.j0;
import x6.v;

/* JADX INFO: loaded from: classes.dex */
public class j extends w {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.fasterxml.jackson.databind.type.c f31756d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final v.a f31757e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f31758f;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j0 f31759a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Field f31760b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public q f31761c = q.e();

        public a(j0 j0Var, Field field) {
            this.f31759a = j0Var;
            this.f31760b = field;
        }

        public i a() {
            return new i(this.f31759a, this.f31760b, this.f31761c.b());
        }
    }

    j(p6.b bVar, com.fasterxml.jackson.databind.type.c cVar, v.a aVar, boolean z10) {
        super(bVar);
        this.f31756d = cVar;
        this.f31757e = bVar == null ? null : aVar;
        this.f31758f = z10;
    }

    private void i(Class cls, Class cls2, Map map) {
        a aVar;
        Iterator it = i7.h.x(cls, cls2, true).iterator();
        while (it.hasNext()) {
            for (Field field : ((Class) it.next()).getDeclaredFields()) {
                if (k(field) && (aVar = (a) map.get(field.getName())) != null) {
                    aVar.f31761c = d(aVar.f31761c, field.getDeclaredAnnotations());
                }
            }
        }
    }

    private Map j(j0 j0Var, JavaType javaType, Map map) {
        v.a aVar;
        Class clsA;
        JavaType javaTypeT = javaType.t();
        if (javaTypeT == null) {
            return map;
        }
        Class clsR = javaType.r();
        Map mapJ = j(new j0.a(this.f31756d, javaTypeT.j()), javaTypeT, map);
        for (Field field : clsR.getDeclaredFields()) {
            if (k(field)) {
                if (mapJ == null) {
                    mapJ = new LinkedHashMap();
                }
                a aVar2 = new a(j0Var, field);
                if (this.f31758f) {
                    aVar2.f31761c = d(aVar2.f31761c, field.getDeclaredAnnotations());
                }
                mapJ.put(field.getName(), aVar2);
            }
        }
        if (mapJ != null && (aVar = this.f31757e) != null && (clsA = aVar.a(clsR)) != null) {
            i(clsA, clsR, mapJ);
        }
        return mapJ;
    }

    private boolean k(Field field) {
        return (field.isSynthetic() || Modifier.isStatic(field.getModifiers())) ? false : true;
    }

    public static List m(p6.b bVar, j0 j0Var, v.a aVar, com.fasterxml.jackson.databind.type.c cVar, JavaType javaType, boolean z10) {
        return new j(bVar, cVar, aVar, z10).l(j0Var, javaType);
    }

    List l(j0 j0Var, JavaType javaType) {
        Map mapJ = j(j0Var, javaType, null);
        if (mapJ == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(mapJ.size());
        Iterator it = mapJ.values().iterator();
        while (it.hasNext()) {
            arrayList.add(((a) it.next()).a());
        }
        return arrayList;
    }
}
