package r2;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public class f implements k2.v, k2.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bitmap f25339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l2.d f25340b;

    public f(Bitmap bitmap, l2.d dVar) {
        this.f25339a = (Bitmap) e3.k.f(bitmap, "Bitmap must not be null");
        this.f25340b = (l2.d) e3.k.f(dVar, "BitmapPool must not be null");
    }

    public static f f(Bitmap bitmap, l2.d dVar) {
        if (bitmap == null) {
            return null;
        }
        return new f(bitmap, dVar);
    }

    @Override // k2.v
    public int a() {
        return e3.l.h(this.f25339a);
    }

    @Override // k2.r
    public void b() {
        this.f25339a.prepareToDraw();
    }

    @Override // k2.v
    public void c() {
        this.f25340b.c(this.f25339a);
    }

    @Override // k2.v
    public Class d() {
        return Bitmap.class;
    }

    @Override // k2.v
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Bitmap get() {
        return this.f25339a;
    }
}
