package xf;

import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public interface n {

    public static final class a {
        public static /* synthetic */ Collection a(n nVar, d dVar, qd.l lVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContributedDescriptors");
            }
            if ((i10 & 1) != 0) {
                dVar = d.f32050o;
            }
            if ((i10 & 2) != 0) {
                lVar = k.f32076a.c();
            }
            return nVar.e(dVar, lVar);
        }
    }

    Collection e(d dVar, qd.l lVar);

    he.h g(mf.f fVar, pe.b bVar);
}
