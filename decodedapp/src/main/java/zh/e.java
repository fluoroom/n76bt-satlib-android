package zh;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected byte[] f33324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f33325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f33326c;

    e(Bitmap bitmap) {
        this.f33325b = bitmap.getWidth();
        this.f33326c = bitmap.getHeight();
        a(bitmap);
    }

    protected abstract void a(Bitmap bitmap);

    public abstract int b(int i10, int i11);

    public abstract int c(int i10, int i11);

    public int d() {
        return this.f33325b;
    }

    public abstract int e(int i10, int i11);
}
