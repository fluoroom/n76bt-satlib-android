package ne;

import ed.k0;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import mf.b;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {

    /* JADX INFO: renamed from: a */
    private static final List f22689a;

    /* JADX INFO: renamed from: b */
    private static final Map f22690b;

    /* JADX INFO: renamed from: c */
    private static final Map f22691c;

    /* JADX INFO: renamed from: d */
    private static final Map f22692d;

    static {
        int i10 = 0;
        List<yd.c> listN = ed.q.n(rd.c0.b(Boolean.TYPE), rd.c0.b(Byte.TYPE), rd.c0.b(Character.TYPE), rd.c0.b(Double.TYPE), rd.c0.b(Float.TYPE), rd.c0.b(Integer.TYPE), rd.c0.b(Long.TYPE), rd.c0.b(Short.TYPE));
        f22689a = listN;
        ArrayList arrayList = new ArrayList(ed.q.v(listN, 10));
        for (yd.c cVar : listN) {
            arrayList.add(dd.w.a(pd.a.c(cVar), pd.a.d(cVar)));
        }
        f22690b = k0.r(arrayList);
        List<yd.c> list = f22689a;
        ArrayList arrayList2 = new ArrayList(ed.q.v(list, 10));
        for (yd.c cVar2 : list) {
            arrayList2.add(dd.w.a(pd.a.d(cVar2), pd.a.c(cVar2)));
        }
        f22691c = k0.r(arrayList2);
        List listN2 = ed.q.n(qd.a.class, qd.l.class, qd.p.class, qd.q.class, qd.r.class, qd.s.class, qd.t.class, qd.u.class, qd.v.class, qd.w.class, qd.b.class, qd.c.class, qd.d.class, qd.e.class, qd.f.class, qd.g.class, qd.h.class, qd.i.class, qd.j.class, qd.k.class, qd.m.class, qd.n.class, qd.o.class);
        ArrayList arrayList3 = new ArrayList(ed.q.v(listN2, 10));
        for (Object obj : listN2) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                ed.q.u();
            }
            arrayList3.add(dd.w.a((Class) obj, Integer.valueOf(i10)));
            i10 = i11;
        }
        f22692d = k0.r(arrayList3);
    }

    public static final ParameterizedType a(ParameterizedType parameterizedType) {
        rd.m.e(parameterizedType, "it");
        Type ownerType = parameterizedType.getOwnerType();
        if (ownerType instanceof ParameterizedType) {
            return (ParameterizedType) ownerType;
        }
        return null;
    }

    public static final qg.h b(ParameterizedType parameterizedType) {
        rd.m.e(parameterizedType, "it");
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        rd.m.d(actualTypeArguments, "getActualTypeArguments(...)");
        return ed.j.x(actualTypeArguments);
    }

    public static final mf.b e(Class cls) {
        mf.b bVarE;
        rd.m.e(cls, "<this>");
        if (cls.isPrimitive()) {
            throw new IllegalArgumentException("Can't compute ClassId for primitive type: " + cls);
        }
        if (cls.isArray()) {
            throw new IllegalArgumentException("Can't compute ClassId for array type: " + cls);
        }
        if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null) {
            String simpleName = cls.getSimpleName();
            rd.m.d(simpleName, "getSimpleName(...)");
            if (simpleName.length() != 0) {
                Class<?> declaringClass = cls.getDeclaringClass();
                if (declaringClass != null && (bVarE = e(declaringClass)) != null) {
                    mf.f fVarH = mf.f.h(cls.getSimpleName());
                    rd.m.d(fVarH, "identifier(...)");
                    mf.b bVarD = bVarE.d(fVarH);
                    if (bVarD != null) {
                        return bVarD;
                    }
                }
                b.a aVar = mf.b.f21989d;
                String name = cls.getName();
                rd.m.d(name, "getName(...)");
                return aVar.c(new mf.c(name));
            }
        }
        String name2 = cls.getName();
        rd.m.d(name2, "getName(...)");
        mf.c cVar = new mf.c(name2);
        return new mf.b(cVar.d(), mf.c.f21993c.a(cVar.f()), true);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final String f(Class cls) {
        rd.m.e(cls, "<this>");
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                String name = cls.getName();
                rd.m.d(name, "getName(...)");
                return rg.q.E(name, '.', '/', false, 4, null);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append('L');
            String name2 = cls.getName();
            rd.m.d(name2, "getName(...)");
            sb2.append(rg.q.E(name2, '.', '/', false, 4, null));
            sb2.append(';');
            return sb2.toString();
        }
        String name3 = cls.getName();
        switch (name3.hashCode()) {
            case -1325958191:
                if (name3.equals("double")) {
                    return "D";
                }
                break;
            case 104431:
                if (name3.equals("int")) {
                    return "I";
                }
                break;
            case 3039496:
                if (name3.equals("byte")) {
                    return "B";
                }
                break;
            case 3052374:
                if (name3.equals("char")) {
                    return "C";
                }
                break;
            case 3327612:
                if (name3.equals("long")) {
                    return "J";
                }
                break;
            case 3625364:
                if (name3.equals("void")) {
                    return "V";
                }
                break;
            case 64711720:
                if (name3.equals("boolean")) {
                    return "Z";
                }
                break;
            case 97526364:
                if (name3.equals("float")) {
                    return "F";
                }
                break;
            case 109413500:
                if (name3.equals("short")) {
                    return "S";
                }
                break;
        }
        throw new IllegalArgumentException("Unsupported primitive type: " + cls);
    }

    public static final Integer g(Class cls) {
        rd.m.e(cls, "<this>");
        return (Integer) f22692d.get(cls);
    }

    public static final List h(Type type) {
        rd.m.e(type, "<this>");
        if (!(type instanceof ParameterizedType)) {
            return ed.q.k();
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return qg.k.O(qg.k.C(qg.k.n(type, d.f22685a), e.f22687a));
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        rd.m.d(actualTypeArguments, "getActualTypeArguments(...)");
        return ed.j.k0(actualTypeArguments);
    }

    public static final Class i(Class cls) {
        rd.m.e(cls, "<this>");
        return (Class) f22690b.get(cls);
    }

    public static final ClassLoader j(Class cls) {
        rd.m.e(cls, "<this>");
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        rd.m.d(systemClassLoader, "getSystemClassLoader(...)");
        return systemClassLoader;
    }

    public static final Class k(Class cls) {
        rd.m.e(cls, "<this>");
        return (Class) f22691c.get(cls);
    }

    public static final boolean l(Class cls) {
        rd.m.e(cls, "<this>");
        return Enum.class.isAssignableFrom(cls);
    }
}
