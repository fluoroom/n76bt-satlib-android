package w2;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import i2.h;
import k2.v;

/* JADX INFO: loaded from: classes.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l2.d f31068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f31069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f31070c;

    public c(l2.d dVar, e eVar, e eVar2) {
        this.f31068a = dVar;
        this.f31069b = eVar;
        this.f31070c = eVar2;
    }

    @Override // w2.e
    public v a(v vVar, h hVar) {
        Drawable drawable = (Drawable) vVar.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f31069b.a(r2.f.f(((BitmapDrawable) drawable).getBitmap(), this.f31068a), hVar);
        }
        if (drawable instanceof v2.c) {
            return this.f31070c.a(b(vVar), hVar);
        }
        return null;
    }

    private static v b(v vVar) {
        return vVar;
    }
}
