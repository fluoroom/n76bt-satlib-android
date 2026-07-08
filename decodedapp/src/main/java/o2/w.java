package o2;

import com.bumptech.glide.load.data.d;
import o2.n;

/* JADX INFO: loaded from: classes.dex */
public class w implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final w f23158a = new w();

    public static class a implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final a f23159a = new a();

        public static a a() {
            return f23159a;
        }

        @Override // o2.o
        public n d(r rVar) {
            return w.c();
        }
    }

    public static w c() {
        return f23158a;
    }

    @Override // o2.n
    public boolean a(Object obj) {
        return true;
    }

    @Override // o2.n
    public n.a b(Object obj, int i10, int i11, i2.h hVar) {
        return new n.a(new d3.b(obj), new b(obj));
    }

    private static class b implements com.bumptech.glide.load.data.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f23160a;

        b(Object obj) {
            this.f23160a = obj;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return this.f23160a.getClass();
        }

        @Override // com.bumptech.glide.load.data.d
        public i2.a d() {
            return i2.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.h hVar, d.a aVar) {
            aVar.f(this.f23160a);
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }
    }
}
