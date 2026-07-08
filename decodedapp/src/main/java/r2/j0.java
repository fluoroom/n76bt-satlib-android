package r2;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public final class j0 implements i2.j {
    @Override // i2.j
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public k2.v b(Bitmap bitmap, int i10, int i11, i2.h hVar) {
        return new a(bitmap);
    }

    @Override // i2.j
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Bitmap bitmap, i2.h hVar) {
        return true;
    }

    private static final class a implements k2.v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Bitmap f25361a;

        a(Bitmap bitmap) {
            this.f25361a = bitmap;
        }

        @Override // k2.v
        public int a() {
            return e3.l.h(this.f25361a);
        }

        @Override // k2.v
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Bitmap get() {
            return this.f25361a;
        }

        @Override // k2.v
        public Class d() {
            return Bitmap.class;
        }

        @Override // k2.v
        public void c() {
        }
    }
}
