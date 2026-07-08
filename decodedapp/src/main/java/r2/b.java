package r2;

import android.graphics.drawable.BitmapDrawable;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class b implements i2.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l2.d f25320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i2.k f25321b;

    public b(l2.d dVar, i2.k kVar) {
        this.f25320a = dVar;
        this.f25321b = kVar;
    }

    @Override // i2.k
    public i2.c a(i2.h hVar) {
        return this.f25321b.a(hVar);
    }

    @Override // i2.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean b(k2.v vVar, File file, i2.h hVar) {
        return this.f25321b.b(new f(((BitmapDrawable) vVar.get()).getBitmap(), this.f25320a), file, hVar);
    }
}
