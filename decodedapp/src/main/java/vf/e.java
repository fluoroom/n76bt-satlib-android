package vf;

import ee.l;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public enum e {
    BOOLEAN(l.f11807g, "boolean", "Z", "java.lang.Boolean"),
    CHAR(l.f11808h, "char", "C", "java.lang.Character"),
    BYTE(l.f11809r, "byte", "B", "java.lang.Byte"),
    SHORT(l.f11810s, "short", "S", "java.lang.Short"),
    INT(l.f11811t, "int", "I", "java.lang.Integer"),
    FLOAT(l.f11812u, "float", "F", "java.lang.Float"),
    LONG(l.f11813v, "long", "J", "java.lang.Long"),
    DOUBLE(l.f11814w, "double", "D", "java.lang.Double");


    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final Map f30735v = new HashMap();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final Map f30736w = new EnumMap(l.class);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final Map f30737x = new HashMap();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final Set f30738y = new HashSet();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final Map f30739z = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f30740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f30741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f30742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final mf.c f30743d;

    static {
        for (e eVar : values()) {
            f30735v.put(eVar.g(), eVar);
            f30736w.put(eVar.h(), eVar);
            f30737x.put(eVar.f(), eVar);
            String strReplace = eVar.f30743d.a().replace('.', '/');
            f30738y.add(strReplace);
            f30739z.put(strReplace, "(" + eVar.f30742c + ")L" + strReplace + ";");
        }
    }

    e(l lVar, String str, String str2, String str3) {
        if (lVar == null) {
            a(8);
        }
        if (str == null) {
            a(9);
        }
        if (str2 == null) {
            a(10);
        }
        if (str3 == null) {
            a(11);
        }
        this.f30740a = lVar;
        this.f30741b = str;
        this.f30742c = str2;
        this.f30743d = new mf.c(str3);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void a(int r8) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: vf.e.a(int):void");
    }

    public static e d(l lVar) {
        if (lVar == null) {
            a(5);
        }
        e eVar = (e) f30736w.get(lVar);
        if (eVar == null) {
            a(6);
        }
        return eVar;
    }

    public static e e(String str) {
        if (str == null) {
            a(3);
        }
        e eVar = (e) f30735v.get(str);
        if (eVar != null) {
            return eVar;
        }
        throw new AssertionError("Non-primitive type name passed: " + str);
    }

    public String f() {
        String str = this.f30742c;
        if (str == null) {
            a(14);
        }
        return str;
    }

    public String g() {
        String str = this.f30741b;
        if (str == null) {
            a(13);
        }
        return str;
    }

    public l h() {
        l lVar = this.f30740a;
        if (lVar == null) {
            a(12);
        }
        return lVar;
    }

    public mf.c i() {
        mf.c cVar = this.f30743d;
        if (cVar == null) {
            a(15);
        }
        return cVar;
    }
}
