package w6;

import p6.l;
import p6.p;

/* JADX INFO: loaded from: classes.dex */
public class c extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f31319b = b.a();

    @Override // w6.a
    public l a(Class cls) {
        if (cls == this.f31319b) {
            return new i();
        }
        return null;
    }

    @Override // w6.a
    public p b(Class cls) {
        if (this.f31319b.isAssignableFrom(cls)) {
            return new j();
        }
        return null;
    }
}
