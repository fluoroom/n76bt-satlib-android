package i7;

import j$.util.Map;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class k implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Class f15903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final Enum[] f15904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final HashMap f15905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final Enum f15906d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final boolean f15907e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final boolean f15908f;

    protected k(Class cls, Enum[] enumArr, HashMap map, Enum r42, boolean z10, boolean z11) {
        this.f15903a = cls;
        this.f15904b = enumArr;
        this.f15905c = map;
        this.f15906d = r42;
        this.f15907e = z10;
        this.f15908f = z11;
    }

    protected static k a(p6.g gVar, Class cls) {
        p6.b bVarG = gVar.g();
        boolean zL = gVar.L(p6.r.ACCEPT_CASE_INSENSITIVE_ENUMS);
        Class clsE = e(cls);
        Enum[] enumArrF = f(cls);
        String[] strArrQ = bVarG.q(clsE, enumArrF, new String[enumArrF.length]);
        String[][] strArr = new String[strArrQ.length][];
        bVarG.o(clsE, enumArrF, strArr);
        HashMap map = new HashMap();
        int length = enumArrF.length;
        for (int i10 = 0; i10 < length; i10++) {
            Enum r82 = enumArrF[i10];
            String strName = strArrQ[i10];
            if (strName == null) {
                strName = r82.name();
            }
            map.put(strName, r82);
            String[] strArr2 = strArr[i10];
            if (strArr2 != null) {
                for (String str : strArr2) {
                    Map.EL.putIfAbsent(map, str, r82);
                }
            }
        }
        return new k(clsE, enumArrF, map, g(bVarG, clsE), zL, false);
    }

    private static k b(p6.g gVar, Class cls) {
        p6.b bVarG = gVar.g();
        boolean zL = gVar.L(p6.r.ACCEPT_CASE_INSENSITIVE_ENUMS);
        Class clsE = e(cls);
        Enum[] enumArrF = f(cls);
        HashMap map = new HashMap();
        int length = enumArrF.length;
        while (true) {
            length--;
            if (length < 0) {
                return new k(clsE, enumArrF, map, g(bVarG, clsE), zL, false);
            }
            map.put(String.valueOf(length), enumArrF[length]);
        }
    }

    protected static k c(p6.g gVar, Class cls, x6.k kVar) {
        p6.b bVarG = gVar.g();
        boolean zL = gVar.L(p6.r.ACCEPT_CASE_INSENSITIVE_ENUMS);
        Class clsE = e(cls);
        Enum[] enumArrF = f(cls);
        HashMap map = new HashMap();
        int length = enumArrF.length;
        while (true) {
            length--;
            if (length < 0) {
                return new k(clsE, enumArrF, map, g(bVarG, clsE), zL, i(kVar.e()));
            }
            Enum r10 = enumArrF[length];
            try {
                Object objO = kVar.o(r10);
                if (objO != null) {
                    map.put(objO.toString(), r10);
                }
            } catch (Exception e10) {
                throw new IllegalArgumentException("Failed to access @JsonValue of Enum value " + r10 + ": " + e10.getMessage());
            }
        }
    }

    protected static k d(p6.g gVar, Class cls) {
        p6.b bVarG = gVar.g();
        boolean zL = gVar.L(p6.r.ACCEPT_CASE_INSENSITIVE_ENUMS);
        Class clsE = e(cls);
        Enum[] enumArrF = f(cls);
        HashMap map = new HashMap();
        String[][] strArr = new String[enumArrF.length][];
        if (bVarG != null) {
            bVarG.o(clsE, enumArrF, strArr);
        }
        int length = enumArrF.length;
        while (true) {
            length--;
            if (length < 0) {
                return new k(clsE, enumArrF, map, g(bVarG, clsE), zL, false);
            }
            Enum r12 = enumArrF[length];
            map.put(r12.toString(), r12);
            String[] strArr2 = strArr[length];
            if (strArr2 != null) {
                for (String str : strArr2) {
                    Map.EL.putIfAbsent(map, str, r12);
                }
            }
        }
    }

    protected static Enum[] f(Class cls) {
        Enum[] enumArr = (Enum[]) e(cls).getEnumConstants();
        if (enumArr != null) {
            return enumArr;
        }
        throw new IllegalArgumentException("No enum constants for class " + cls.getName());
    }

    protected static Enum g(p6.b bVar, Class cls) {
        if (bVar != null) {
            return bVar.j(e(cls));
        }
        return null;
    }

    protected static boolean i(Class cls) {
        if (cls.isPrimitive()) {
            cls = h.p0(cls);
        }
        return cls == Long.class || cls == Integer.class || cls == Short.class || cls == Byte.class;
    }

    public static k j(p6.g gVar, Class cls) {
        return a(gVar, cls);
    }

    public static k l(p6.g gVar, Class cls) {
        return b(gVar, cls);
    }

    public static k n(p6.g gVar, Class cls, x6.k kVar) {
        return c(gVar, cls, kVar);
    }

    public static k o(p6.g gVar, Class cls) {
        return d(gVar, cls);
    }

    protected Enum h(String str) {
        for (Map.Entry entry : this.f15905c.entrySet()) {
            if (str.equalsIgnoreCase((String) entry.getKey())) {
                return (Enum) entry.getValue();
            }
        }
        return null;
    }

    public i k() {
        return i.b(this.f15905c);
    }

    public Enum p(String str) {
        Enum r02 = (Enum) this.f15905c.get(str);
        return (r02 == null && this.f15907e) ? h(str) : r02;
    }

    public Enum q() {
        return this.f15906d;
    }

    public Class r() {
        return this.f15903a;
    }

    public Collection s() {
        return this.f15905c.keySet();
    }

    public Enum[] t() {
        return this.f15904b;
    }

    public boolean v() {
        return this.f15908f;
    }

    protected static Class e(Class cls) {
        return cls;
    }
}
