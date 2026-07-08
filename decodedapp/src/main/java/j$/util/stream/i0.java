package j$.util.stream;

import j$.util.Optional;

/* JADX INFO: loaded from: classes2.dex */
public final class i0 extends j0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e0 f18010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e0 f18011d;

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.f18024a) {
            return new Optional(this.f18025b);
        }
        return null;
    }

    static {
        z6 z6Var = z6.REFERENCE;
        o oVar = new o(11);
        o oVar2 = new o(12);
        Optional optional = Optional.f17694b;
        f18010c = new e0(true, z6Var, optional, oVar, oVar2);
        f18011d = new e0(false, z6Var, optional, new o(11), new o(12));
    }
}
