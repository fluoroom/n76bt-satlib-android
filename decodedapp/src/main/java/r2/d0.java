package r2;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: loaded from: classes.dex */
public final class d0 implements k2.v, k2.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Resources f25335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k2.v f25336b;

    private d0(Resources resources, k2.v vVar) {
        this.f25335a = (Resources) e3.k.e(resources);
        this.f25336b = (k2.v) e3.k.e(vVar);
    }

    public static k2.v f(Resources resources, k2.v vVar) {
        if (vVar == null) {
            return null;
        }
        return new d0(resources, vVar);
    }

    @Override // k2.v
    public int a() {
        return this.f25336b.a();
    }

    @Override // k2.r
    public void b() {
        k2.v vVar = this.f25336b;
        if (vVar instanceof k2.r) {
            ((k2.r) vVar).b();
        }
    }

    @Override // k2.v
    public void c() {
        this.f25336b.c();
    }

    @Override // k2.v
    public Class d() {
        return BitmapDrawable.class;
    }

    @Override // k2.v
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public BitmapDrawable get() {
        return new BitmapDrawable(this.f25335a, (Bitmap) this.f25336b.get());
    }
}
