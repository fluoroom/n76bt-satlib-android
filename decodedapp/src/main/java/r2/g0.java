package r2;

import android.graphics.drawable.Drawable;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public class g0 implements i2.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t2.g f25347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l2.d f25348b;

    public g0(t2.g gVar, l2.d dVar) {
        this.f25347a = gVar;
        this.f25348b = dVar;
    }

    @Override // i2.j
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public k2.v b(Uri uri, int i10, int i11, i2.h hVar) {
        k2.v vVarB = this.f25347a.b(uri, i10, i11, hVar);
        if (vVarB == null) {
            return null;
        }
        return t.a(this.f25348b, (Drawable) vVarB.get(), i10, i11);
    }

    @Override // i2.j
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri, i2.h hVar) {
        return "android.resource".equals(uri.getScheme());
    }
}
