package yf;

import eg.r0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final r0 f32596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f32597b;

    public a(r0 r0Var, g gVar) {
        if (r0Var == null) {
            b(0);
        }
        this.f32596a = r0Var;
        this.f32597b = gVar == null ? this : gVar;
    }

    private static /* synthetic */ void b(int i10) {
        String str = (i10 == 1 || i10 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 2) ? 2 : 3];
        if (i10 == 1 || i10 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[0] = "receiverType";
        }
        if (i10 == 1) {
            objArr[1] = "getType";
        } else if (i10 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i10 != 1 && i10 != 2) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // yf.g
    public r0 getType() {
        r0 r0Var = this.f32596a;
        if (r0Var == null) {
            b(1);
        }
        return r0Var;
    }
}
