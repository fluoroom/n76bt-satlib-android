package qb;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import qb.g;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final g f24655a = new a();

    private static class b extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f24656a;

        /* synthetic */ b(d dVar, h hVar, i iVar) {
            this(dVar, hVar);
        }

        @Override // qb.d
        public String a() {
            return this.f24656a.a();
        }

        @Override // qb.d
        public g d(a1 a1Var, c cVar) {
            throw null;
        }

        private b(d dVar, h hVar) {
            this.f24656a = dVar;
            android.support.v4.media.session.b.a(r9.l.o(hVar, "interceptor"));
        }
    }

    public static d a(d dVar, List list) {
        r9.l.o(dVar, "channel");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            i iVar = null;
            dVar = new b(dVar, iVar, iVar);
        }
        return dVar;
    }

    public static d b(d dVar, h... hVarArr) {
        return a(dVar, Arrays.asList(hVarArr));
    }

    class a extends g {
        a() {
        }

        @Override // qb.g
        public void b() {
        }

        @Override // qb.g
        public void c(int i10) {
        }

        @Override // qb.g
        public void d(Object obj) {
        }

        @Override // qb.g
        public void a(String str, Throwable th2) {
        }

        @Override // qb.g
        public void e(g.a aVar, z0 z0Var) {
        }
    }
}
