package qb;

import java.util.IdentityHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final IdentityHashMap f24505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f24506c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IdentityHashMap f24507a;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private a f24508a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private IdentityHashMap f24509b;

        private IdentityHashMap b(int i10) {
            if (this.f24509b == null) {
                IdentityHashMap identityHashMap = new IdentityHashMap(this.f24508a.f24507a.size() + i10);
                this.f24509b = identityHashMap;
                identityHashMap.putAll(this.f24508a.f24507a);
                this.f24508a = null;
            }
            return this.f24509b;
        }

        public a a() {
            if (this.f24509b != null) {
                this.f24508a = new a(this.f24509b);
                this.f24509b = null;
            }
            return this.f24508a;
        }

        public b c(c cVar) {
            a aVar = this.f24508a;
            if (aVar == null) {
                this.f24509b.remove(cVar);
                return this;
            }
            if (aVar.f24507a.containsKey(cVar)) {
                b(0).remove(cVar);
            }
            return this;
        }

        public b d(c cVar, Object obj) {
            b(1).put(cVar, obj);
            return this;
        }

        private b(a aVar) {
            this.f24508a = aVar;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f24510a;

        private c(String str) {
            this.f24510a = str;
        }

        public static c a(String str) {
            return new c(str);
        }

        public String toString() {
            return this.f24510a;
        }
    }

    static {
        IdentityHashMap identityHashMap = new IdentityHashMap();
        f24505b = identityHashMap;
        f24506c = new a(identityHashMap);
    }

    public static b c() {
        return new b();
    }

    public Object b(c cVar) {
        return this.f24507a.get(cVar);
    }

    public b d() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f24507a.size() != aVar.f24507a.size()) {
            return false;
        }
        for (Map.Entry entry : this.f24507a.entrySet()) {
            if (!aVar.f24507a.containsKey(entry.getKey()) || !r9.h.a(entry.getValue(), aVar.f24507a.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int iB = 0;
        for (Map.Entry entry : this.f24507a.entrySet()) {
            iB += r9.h.b(entry.getKey(), entry.getValue());
        }
        return iB;
    }

    public String toString() {
        return this.f24507a.toString();
    }

    private a(IdentityHashMap identityHashMap) {
        this.f24507a = identityHashMap;
    }
}
