package r6;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    public static j b() {
        return a.b();
    }

    public abstract Object a(Object obj);

    public abstract j c(Object obj, Object obj2);

    public static class a extends j implements Serializable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected static final a f25539c = new a(Collections.EMPTY_MAP);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected static final Object f25540d = new Object();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final Map f25541a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected transient Map f25542b;

        protected a(Map map) {
            this.f25541a = map;
            this.f25542b = null;
        }

        public static j b() {
            return f25539c;
        }

        @Override // r6.j
        public Object a(Object obj) {
            Object obj2;
            Map map = this.f25542b;
            if (map == null || (obj2 = map.get(obj)) == null) {
                return this.f25541a.get(obj);
            }
            if (obj2 == f25540d) {
                return null;
            }
            return obj2;
        }

        @Override // r6.j
        public j c(Object obj, Object obj2) {
            if (obj2 == null) {
                if (!this.f25541a.containsKey(obj)) {
                    Map map = this.f25542b;
                    if (map != null && map.containsKey(obj)) {
                        this.f25542b.remove(obj);
                    }
                    return this;
                }
                obj2 = f25540d;
            }
            Map map2 = this.f25542b;
            if (map2 == null) {
                return d(obj, obj2);
            }
            map2.put(obj, obj2);
            return this;
        }

        protected j d(Object obj, Object obj2) {
            HashMap map = new HashMap();
            if (obj2 == null) {
                obj2 = f25540d;
            }
            map.put(obj, obj2);
            return new a(this.f25541a, map);
        }

        protected a(Map map, Map map2) {
            this.f25541a = map;
            this.f25542b = map2;
        }
    }
}
