package k2;

import java.io.File;
import m2.a;

/* JADX INFO: loaded from: classes.dex */
class e implements a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i2.d f18960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f18961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i2.h f18962c;

    e(i2.d dVar, Object obj, i2.h hVar) {
        this.f18960a = dVar;
        this.f18961b = obj;
        this.f18962c = hVar;
    }

    @Override // m2.a.b
    public boolean a(File file) {
        return this.f18960a.b(this.f18961b, file, this.f18962c);
    }
}
