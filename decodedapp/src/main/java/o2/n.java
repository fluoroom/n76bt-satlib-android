package o2;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface n {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i2.f f23122a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f23123b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final com.bumptech.glide.load.data.d f23124c;

        public a(i2.f fVar, com.bumptech.glide.load.data.d dVar) {
            this(fVar, Collections.EMPTY_LIST, dVar);
        }

        public a(i2.f fVar, List list, com.bumptech.glide.load.data.d dVar) {
            this.f23122a = (i2.f) e3.k.e(fVar);
            this.f23123b = (List) e3.k.e(list);
            this.f23124c = (com.bumptech.glide.load.data.d) e3.k.e(dVar);
        }
    }

    boolean a(Object obj);

    a b(Object obj, int i10, int i11, i2.h hVar);
}
