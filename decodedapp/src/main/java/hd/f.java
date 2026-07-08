package hd;

import d.h0;
import hd.i;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public interface f extends i.b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final b f15241k = b.f15242a;

    public static final class a {
        public static i.b a(f fVar, i.c cVar) {
            m.e(cVar, "key");
            if (!(cVar instanceof hd.b)) {
                if (f.f15241k != cVar) {
                    return null;
                }
                m.c(fVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return fVar;
            }
            hd.b bVar = (hd.b) cVar;
            if (bVar.a(fVar.getKey())) {
                i.b bVarB = bVar.b(fVar);
                if (h0.a(bVarB)) {
                    return bVarB;
                }
            }
            return null;
        }

        public static i b(f fVar, i.c cVar) {
            m.e(cVar, "key");
            if (!(cVar instanceof hd.b)) {
                return f.f15241k == cVar ? j.f15243a : fVar;
            }
            hd.b bVar = (hd.b) cVar;
            return (!bVar.a(fVar.getKey()) || bVar.b(fVar) == null) ? fVar : j.f15243a;
        }
    }

    public static final class b implements i.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ b f15242a = new b();

        private b() {
        }
    }

    e H(e eVar);

    void w(e eVar);
}
