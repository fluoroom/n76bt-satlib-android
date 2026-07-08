package o2;

import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class k implements i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f23103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile Map f23104d;

    public static final class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final String f23105d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final Map f23106e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f23107a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map f23108b = f23106e;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f23109c = true;

        static {
            String strB = b();
            f23105d = strB;
            HashMap map = new HashMap(2);
            if (!TextUtils.isEmpty(strB)) {
                map.put("User-Agent", Collections.singletonList(new b(strB)));
            }
            f23106e = DesugarCollections.unmodifiableMap(map);
        }

        static String b() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb2 = new StringBuilder(property.length());
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = property.charAt(i10);
                if ((cCharAt > 31 || cCharAt == '\t') && cCharAt < 127) {
                    sb2.append(cCharAt);
                } else {
                    sb2.append('?');
                }
            }
            return sb2.toString();
        }

        public k a() {
            this.f23107a = true;
            return new k(this.f23108b);
        }
    }

    static final class b implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f23110a;

        b(String str) {
            this.f23110a = str;
        }

        @Override // o2.j
        public String a() {
            return this.f23110a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f23110a.equals(((b) obj).f23110a);
            }
            return false;
        }

        public int hashCode() {
            return this.f23110a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.f23110a + "'}";
        }
    }

    k(Map map) {
        this.f23103c = DesugarCollections.unmodifiableMap(map);
    }

    private String b(List list) {
        StringBuilder sb2 = new StringBuilder();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            String strA = ((j) list.get(i10)).a();
            if (!TextUtils.isEmpty(strA)) {
                sb2.append(strA);
                if (i10 != list.size() - 1) {
                    sb2.append(',');
                }
            }
        }
        return sb2.toString();
    }

    private Map c() {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f23103c.entrySet()) {
            String strB = b((List) entry.getValue());
            if (!TextUtils.isEmpty(strB)) {
                map.put((String) entry.getKey(), strB);
            }
        }
        return map;
    }

    @Override // o2.i
    public Map a() {
        if (this.f23104d == null) {
            synchronized (this) {
                try {
                    if (this.f23104d == null) {
                        this.f23104d = DesugarCollections.unmodifiableMap(c());
                    }
                } finally {
                }
            }
        }
        return this.f23104d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f23103c.equals(((k) obj).f23103c);
        }
        return false;
    }

    public int hashCode() {
        return this.f23103c.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f23103c + '}';
    }
}
