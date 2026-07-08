package ze;

import java.util.Collection;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public interface c {

    public static final class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f33128a = new a();

        private a() {
        }

        @Override // ze.c
        public Set a() {
            return ed.r0.d();
        }

        @Override // ze.c
        public cf.n b(mf.f fVar) {
            rd.m.e(fVar, "name");
            return null;
        }

        @Override // ze.c
        public cf.w c(mf.f fVar) {
            rd.m.e(fVar, "name");
            return null;
        }

        @Override // ze.c
        public Set d() {
            return ed.r0.d();
        }

        @Override // ze.c
        public Set e() {
            return ed.r0.d();
        }

        @Override // ze.c
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public List f(mf.f fVar) {
            rd.m.e(fVar, "name");
            return ed.q.k();
        }
    }

    Set a();

    cf.n b(mf.f fVar);

    cf.w c(mf.f fVar);

    Set d();

    Set e();

    Collection f(mf.f fVar);
}
