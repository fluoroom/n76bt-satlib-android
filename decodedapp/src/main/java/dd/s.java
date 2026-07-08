package dd;

import dd.r;

/* JADX INFO: loaded from: classes3.dex */
public abstract class s {
    public static final Object a(Throwable th2) {
        rd.m.e(th2, "exception");
        return new r.b(th2);
    }

    public static final void b(Object obj) {
        if (obj instanceof r.b) {
            throw ((r.b) obj).f10917a;
        }
    }
}
