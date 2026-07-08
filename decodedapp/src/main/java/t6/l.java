package t6;

import com.fasterxml.jackson.databind.JavaType;
import j$.util.DesugarCollections;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    private static class a implements i7.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final JavaType f27521a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f27522b;

        a(int i10, JavaType javaType) {
            this.f27521a = javaType;
            this.f27522b = i10;
        }

        private void c(int i10) {
            if (i10 == 1) {
                return;
            }
            throw new IllegalArgumentException("Can not deserialize Singleton container from " + i10 + " entries");
        }

        @Override // i7.j
        public JavaType a(com.fasterxml.jackson.databind.type.c cVar) {
            return this.f27521a;
        }

        @Override // i7.j
        public JavaType b(com.fasterxml.jackson.databind.type.c cVar) {
            return this.f27521a;
        }

        @Override // i7.j
        public Object convert(Object obj) {
            if (obj == null) {
                return null;
            }
            switch (this.f27522b) {
                case 1:
                    Set set = (Set) obj;
                    c(set.size());
                    return Collections.singleton(set.iterator().next());
                case 2:
                    List list = (List) obj;
                    c(list.size());
                    return Collections.singletonList(list.get(0));
                case 3:
                    Map map = (Map) obj;
                    c(map.size());
                    Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
                    return Collections.singletonMap(entry.getKey(), entry.getValue());
                case 4:
                    return DesugarCollections.unmodifiableSet((Set) obj);
                case 5:
                    return DesugarCollections.unmodifiableList((List) obj);
                case 6:
                    return DesugarCollections.unmodifiableMap((Map) obj);
                case 7:
                    return DesugarCollections.synchronizedSet((Set) obj);
                case 8:
                    return DesugarCollections.synchronizedCollection((Collection) obj);
                case 9:
                    return DesugarCollections.synchronizedList((List) obj);
                case 10:
                    return DesugarCollections.synchronizedMap((Map) obj);
                default:
                    return obj;
            }
        }
    }

    private static String a(String str) {
        if (str.startsWith("Singleton")) {
            return str.substring(9);
        }
        return null;
    }

    private static String b(String str) {
        if (str.startsWith("Synchronized")) {
            return str.substring(12);
        }
        return null;
    }

    private static String c(String str) {
        if (str.startsWith("Unmodifiable")) {
            return str.substring(12);
        }
        return null;
    }

    private static String d(String str) {
        if (str.startsWith("java.util.Arrays$")) {
            return str.substring(17);
        }
        return null;
    }

    private static String e(String str) {
        if (str.startsWith("java.util.ImmutableCollections$")) {
            return str.substring(31);
        }
        return null;
    }

    private static String f(String str) {
        if (str.startsWith("java.util.Collections$")) {
            return str.substring(22);
        }
        return null;
    }

    static a g(int i10, JavaType javaType, Class cls) {
        return new a(i10, javaType.i(cls));
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p6.l h(p6.h r8, com.fasterxml.jackson.databind.JavaType r9) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.l.h(p6.h, com.fasterxml.jackson.databind.JavaType):p6.l");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p6.l i(p6.h r5, com.fasterxml.jackson.databind.JavaType r6) {
        /*
            java.lang.Class r5 = r6.r()
            java.lang.String r5 = r5.getName()
            java.lang.String r0 = f(r5)
            r1 = 6
            java.lang.Class<java.util.Map> r2 = java.util.Map.class
            java.lang.String r3 = "Map"
            r4 = 0
            if (r0 == 0) goto L4a
            java.lang.String r5 = c(r0)
            if (r5 == 0) goto L25
            boolean r5 = r5.contains(r3)
            if (r5 == 0) goto L5b
            t6.l$a r5 = g(r1, r6, r2)
            goto L5c
        L25:
            java.lang.String r5 = a(r0)
            if (r5 == 0) goto L37
            boolean r5 = r5.contains(r3)
            if (r5 == 0) goto L5b
            r5 = 3
            t6.l$a r5 = g(r5, r6, r2)
            goto L5c
        L37:
            java.lang.String r5 = b(r0)
            if (r5 == 0) goto L5b
            boolean r5 = r5.contains(r3)
            if (r5 == 0) goto L5b
            r5 = 10
            t6.l$a r5 = g(r5, r6, r2)
            goto L5c
        L4a:
            java.lang.String r5 = e(r5)
            if (r5 == 0) goto L5b
            boolean r5 = r5.contains(r3)
            if (r5 == 0) goto L5b
            t6.l$a r5 = g(r1, r6, r2)
            goto L5c
        L5b:
            r5 = r4
        L5c:
            if (r5 != 0) goto L5f
            return r4
        L5f:
            u6.b0 r6 = new u6.b0
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.l.i(p6.h, com.fasterxml.jackson.databind.JavaType):p6.l");
    }
}
