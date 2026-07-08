package xf;

import ed.r0;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public interface k extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f32076a = a.f32077a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f32077a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final qd.l f32078b = j.f32075a;

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean a(mf.f fVar) {
            rd.m.e(fVar, "it");
            return true;
        }

        public final qd.l c() {
            return f32078b;
        }
    }

    public static final class b extends l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f32079b = new b();

        private b() {
        }

        @Override // xf.l, xf.k
        public Set b() {
            return r0.d();
        }

        @Override // xf.l, xf.k
        public Set d() {
            return r0.d();
        }

        @Override // xf.l, xf.k
        public Set f() {
            return r0.d();
        }
    }

    Collection a(mf.f fVar, pe.b bVar);

    Set b();

    Collection c(mf.f fVar, pe.b bVar);

    Set d();

    Set f();
}
