package e1;

import java.util.LinkedHashMap;
import java.util.Map;
import rd.h;
import rd.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0153a f11334b = new C0153a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f11335a = new LinkedHashMap();

    /* JADX INFO: renamed from: e1.a$a, reason: collision with other inner class name */
    public static final class C0153a {
        public /* synthetic */ C0153a(h hVar) {
            this();
        }

        private C0153a() {
        }
    }

    public static final class b extends a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f11336c = new b();

        private b() {
        }

        @Override // e1.a
        public Object a(c cVar) {
            m.e(cVar, "key");
            return null;
        }
    }

    public interface c {
    }

    public abstract Object a(c cVar);

    public final Map b() {
        return this.f11335a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof a) && m.a(this.f11335a, ((a) obj).f11335a);
    }

    public int hashCode() {
        return this.f11335a.hashCode();
    }

    public String toString() {
        return "CreationExtras(extras=" + this.f11335a + ')';
    }
}
