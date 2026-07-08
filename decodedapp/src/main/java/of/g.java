package of;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import of.i;

/* JADX INFO: loaded from: classes3.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final g f23448b = new g(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f23449a;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f23450a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f23451b;

        a(Object obj, int i10) {
            this.f23450a = obj;
            this.f23451b = i10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f23450a == aVar.f23450a && this.f23451b == aVar.f23451b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f23450a) * 65535) + this.f23451b;
        }
    }

    g() {
        this.f23449a = new HashMap();
    }

    public static g c() {
        return f23448b;
    }

    public static g d() {
        return new g();
    }

    public final void a(i.f fVar) {
        this.f23449a.put(new a(fVar.b(), fVar.d()), fVar);
    }

    public i.f b(p pVar, int i10) {
        return (i.f) this.f23449a.get(new a(pVar, i10));
    }

    private g(boolean z10) {
        this.f23449a = Collections.EMPTY_MAP;
    }
}
