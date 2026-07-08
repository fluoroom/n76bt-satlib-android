package r2;

import android.content.res.Resources;

/* JADX INFO: loaded from: classes.dex */
public class a implements i2.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i2.j f25310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Resources f25311b;

    public a(Resources resources, i2.j jVar) {
        this.f25311b = (Resources) e3.k.e(resources);
        this.f25310a = (i2.j) e3.k.e(jVar);
    }

    @Override // i2.j
    public boolean a(Object obj, i2.h hVar) {
        return this.f25310a.a(obj, hVar);
    }

    @Override // i2.j
    public k2.v b(Object obj, int i10, int i11, i2.h hVar) {
        return d0.f(this.f25311b, this.f25310a.b(obj, i10, i11, hVar));
    }
}
