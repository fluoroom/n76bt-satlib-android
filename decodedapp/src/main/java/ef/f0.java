package ef;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f0 f11965a = new f0();

    private f0() {
    }

    private final String c(String str) {
        if (str.length() <= 1) {
            return str;
        }
        return 'L' + str + ';';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence l(String str) {
        rd.m.e(str, "it");
        return f11965a.c(str);
    }

    public final String[] b(String... strArr) {
        rd.m.e(strArr, "signatures");
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("<init>(" + str + ")V");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public final Set d(String str, String... strArr) {
        rd.m.e(str, "internalName");
        rd.m.e(strArr, "signatures");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str2 : strArr) {
            linkedHashSet.add(str + '.' + str2);
        }
        return linkedHashSet;
    }

    public final Set e(String str, String... strArr) {
        rd.m.e(str, "name");
        rd.m.e(strArr, "signatures");
        return d(h(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final Set f(String str, String... strArr) {
        rd.m.e(str, "name");
        rd.m.e(strArr, "signatures");
        return d(i(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final String g(String str) {
        rd.m.e(str, "name");
        return "java/util/function/" + str;
    }

    public final String h(String str) {
        rd.m.e(str, "name");
        return "java/lang/" + str;
    }

    public final String i(String str) {
        rd.m.e(str, "name");
        return "java/util/" + str;
    }

    public final String j(String str) {
        rd.m.e(str, "name");
        return "java/util/concurrent/atomic/" + str;
    }

    public final String k(String str, List list, String str2) {
        rd.m.e(str, "name");
        rd.m.e(list, "parameters");
        rd.m.e(str2, "ret");
        return str + '(' + ed.q.i0(list, "", null, null, 0, null, e0.f11964a, 30, null) + ')' + c(str2);
    }

    public final String m(String str, String str2) {
        rd.m.e(str, "internalName");
        rd.m.e(str2, "jvmDescriptor");
        return str + '.' + str2;
    }
}
