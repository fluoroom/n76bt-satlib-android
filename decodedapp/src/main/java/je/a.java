package je;

import ed.q;
import he.e;
import java.util.Collection;
import mf.f;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public interface a {

    /* JADX INFO: renamed from: je.a$a, reason: collision with other inner class name */
    public static final class C0241a implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0241a f18650a = new C0241a();

        private C0241a() {
        }

        @Override // je.a
        public Collection b(f fVar, e eVar) {
            m.e(fVar, "name");
            m.e(eVar, "classDescriptor");
            return q.k();
        }

        @Override // je.a
        public Collection c(e eVar) {
            m.e(eVar, "classDescriptor");
            return q.k();
        }

        @Override // je.a
        public Collection d(e eVar) {
            m.e(eVar, "classDescriptor");
            return q.k();
        }

        @Override // je.a
        public Collection e(e eVar) {
            m.e(eVar, "classDescriptor");
            return q.k();
        }
    }

    Collection b(f fVar, e eVar);

    Collection c(e eVar);

    Collection d(e eVar);

    Collection e(e eVar);
}
