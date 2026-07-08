package p2;

import java.io.InputStream;
import java.net.URL;
import o2.h;
import o2.n;
import o2.o;
import o2.r;

/* JADX INFO: loaded from: classes.dex */
public class e implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f23873a;

    public static class a implements o {
        @Override // o2.o
        public n d(r rVar) {
            return new e(rVar.d(h.class, InputStream.class));
        }
    }

    public e(n nVar) {
        this.f23873a = nVar;
    }

    @Override // o2.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a b(URL url, int i10, int i11, i2.h hVar) {
        return this.f23873a.b(new h(url), i10, i11, hVar);
    }

    @Override // o2.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(URL url) {
        return true;
    }
}
