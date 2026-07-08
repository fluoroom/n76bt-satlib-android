package mf;

import dd.o;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import rd.m;
import rg.q;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22004a;

        static {
            int[] iArr = new int[k.values().length];
            try {
                iArr[k.f22084a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k.f22086c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[k.f22085b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f22004a = iArr;
        }
    }

    public static final Object a(c cVar, Map map) {
        Object next;
        m.e(cVar, "<this>");
        m.e(map, "values");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            c cVar2 = (c) entry.getKey();
            if (m.a(cVar, cVar2) || b(cVar, cVar2)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (linkedHashMap.isEmpty()) {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            return null;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int length = g((c) ((Map.Entry) next).getKey(), cVar).a().length();
                do {
                    Object next2 = it.next();
                    int length2 = g((c) ((Map.Entry) next2).getKey(), cVar).a().length();
                    if (length > length2) {
                        next = next2;
                        length = length2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry2 = (Map.Entry) next;
        if (entry2 != null) {
            return entry2.getValue();
        }
        return null;
    }

    public static final boolean b(c cVar, c cVar2) {
        m.e(cVar, "<this>");
        m.e(cVar2, "packageName");
        return m.a(f(cVar), cVar2);
    }

    private static final boolean c(String str, String str2) {
        return q.J(str, str2, false, 2, null) && str.charAt(str2.length()) == '.';
    }

    public static final boolean d(c cVar, c cVar2) {
        m.e(cVar, "<this>");
        m.e(cVar2, "packageName");
        if (m.a(cVar, cVar2) || cVar2.c()) {
            return true;
        }
        return c(cVar.a(), cVar2.a());
    }

    public static final boolean e(String str) {
        if (str == null) {
            return false;
        }
        k kVar = k.f22084a;
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            int i11 = a.f22004a[kVar.ordinal()];
            if (i11 == 1 || i11 == 2) {
                if (!Character.isJavaIdentifierStart(cCharAt)) {
                    return false;
                }
                kVar = k.f22085b;
            } else {
                if (i11 != 3) {
                    throw new o();
                }
                if (cCharAt == '.') {
                    kVar = k.f22086c;
                } else if (!Character.isJavaIdentifierPart(cCharAt)) {
                    return false;
                }
            }
        }
        return kVar != k.f22086c;
    }

    public static final c f(c cVar) {
        m.e(cVar, "<this>");
        if (cVar.c()) {
            return null;
        }
        return cVar.d();
    }

    public static final c g(c cVar, c cVar2) {
        m.e(cVar, "<this>");
        m.e(cVar2, "prefix");
        if (!d(cVar, cVar2) || cVar2.c()) {
            return cVar;
        }
        if (m.a(cVar, cVar2)) {
            return c.f21994d;
        }
        String strSubstring = cVar.a().substring(cVar2.a().length() + 1);
        m.d(strSubstring, "substring(...)");
        return new c(strSubstring);
    }
}
