package lf;

import ed.q;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f20551a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f20552b = q.i0(q.n('k', 'o', 't', 'l', 'i', 'n'), "", null, null, 0, null, null, 62, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f20553c;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List listN = q.n("Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D");
        int iB = ld.c.b(0, listN.size() - 1, 2);
        if (iB >= 0) {
            int i10 = 0;
            while (true) {
                StringBuilder sb2 = new StringBuilder();
                String str = f20552b;
                sb2.append(str);
                sb2.append('/');
                sb2.append((String) listN.get(i10));
                int i11 = i10 + 1;
                linkedHashMap.put(sb2.toString(), listN.get(i11));
                linkedHashMap.put(str + '/' + ((String) listN.get(i10)) + "Array", '[' + ((String) listN.get(i11)));
                if (i10 == iB) {
                    break;
                } else {
                    i10 += 2;
                }
            }
        }
        linkedHashMap.put(f20552b + "/Unit", "V");
        a(linkedHashMap, "Any", "java/lang/Object");
        a(linkedHashMap, "Nothing", "java/lang/Void");
        a(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        for (String str2 : q.n("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum")) {
            a(linkedHashMap, str2, "java/lang/" + str2);
        }
        for (String str3 : q.n("Iterator", "Collection", "List", "Set", "Map", "ListIterator")) {
            a(linkedHashMap, "collections/" + str3, "java/util/" + str3);
            a(linkedHashMap, "collections/Mutable" + str3, "java/util/" + str3);
        }
        a(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        a(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i12 = 0; i12 < 23; i12++) {
            StringBuilder sb3 = new StringBuilder();
            String str4 = f20552b;
            sb3.append(str4);
            sb3.append("/jvm/functions/Function");
            sb3.append(i12);
            a(linkedHashMap, "Function" + i12, sb3.toString());
            a(linkedHashMap, "reflect/KFunction" + i12, str4 + "/reflect/KFunction");
        }
        for (String str5 : q.n("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum")) {
            a(linkedHashMap, str5 + ".Companion", f20552b + "/jvm/internal/" + str5 + "CompanionObject");
        }
        f20553c = linkedHashMap;
    }

    private b() {
    }

    private static final void a(Map map, String str, String str2) {
        map.put(f20552b + '/' + str, 'L' + str2 + ';');
    }

    public static final String b(String str) {
        m.e(str, "classId");
        String str2 = (String) f20553c.get(str);
        if (str2 != null) {
            return str2;
        }
        return 'L' + rg.q.E(str, '.', '$', false, 4, null) + ';';
    }
}
