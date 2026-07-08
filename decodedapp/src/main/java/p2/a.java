package p2;

import com.bumptech.glide.load.data.j;
import i2.g;
import o2.h;
import o2.m;
import o2.n;
import o2.o;
import o2.r;

/* JADX INFO: loaded from: classes.dex */
public class a implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f23849b = g.f("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f23850a;

    /* JADX INFO: renamed from: p2.a$a, reason: collision with other inner class name */
    public static class C0327a implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final m f23851a = new m(500);

        @Override // o2.o
        public n d(r rVar) {
            return new a(this.f23851a);
        }
    }

    public a(m mVar) {
        this.f23850a = mVar;
    }

    @Override // o2.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a b(h hVar, int i10, int i11, i2.h hVar2) {
        m mVar = this.f23850a;
        if (mVar != null) {
            h hVar3 = (h) mVar.a(hVar, 0, 0);
            if (hVar3 == null) {
                this.f23850a.b(hVar, 0, 0, hVar);
            } else {
                hVar = hVar3;
            }
        }
        return new n.a(hVar, new j(hVar, ((Integer) hVar2.c(f23849b)).intValue()));
    }

    @Override // o2.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(h hVar) {
        return true;
    }
}
