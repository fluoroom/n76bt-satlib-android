package o2;

import android.content.res.AssetManager;
import android.net.Uri;
import o2.n;

/* JADX INFO: loaded from: classes.dex */
public class a implements n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f23062c = 22;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AssetManager f23063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0310a f23064b;

    /* JADX INFO: renamed from: o2.a$a, reason: collision with other inner class name */
    public interface InterfaceC0310a {
        com.bumptech.glide.load.data.d a(AssetManager assetManager, String str);
    }

    public static class b implements o, InterfaceC0310a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AssetManager f23065a;

        public b(AssetManager assetManager) {
            this.f23065a = assetManager;
        }

        @Override // o2.a.InterfaceC0310a
        public com.bumptech.glide.load.data.d a(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.h(assetManager, str);
        }

        @Override // o2.o
        public n d(r rVar) {
            return new a(this.f23065a, this);
        }
    }

    public static class c implements o, InterfaceC0310a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AssetManager f23066a;

        public c(AssetManager assetManager) {
            this.f23066a = assetManager;
        }

        @Override // o2.a.InterfaceC0310a
        public com.bumptech.glide.load.data.d a(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.m(assetManager, str);
        }

        @Override // o2.o
        public n d(r rVar) {
            return new a(this.f23066a, this);
        }
    }

    public a(AssetManager assetManager, InterfaceC0310a interfaceC0310a) {
        this.f23063a = assetManager;
        this.f23064b = interfaceC0310a;
    }

    @Override // o2.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a b(Uri uri, int i10, int i11, i2.h hVar) {
        return new n.a(new d3.b(uri), this.f23064b.a(this.f23063a, uri.toString().substring(f23062c)));
    }

    @Override // o2.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }
}
