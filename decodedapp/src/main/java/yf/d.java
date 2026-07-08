package yf;

import eg.r0;

/* JADX INFO: loaded from: classes3.dex */
public class d extends a implements g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final he.a f32602c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(he.a aVar, r0 r0Var, g gVar) {
        super(r0Var, gVar);
        if (aVar == null) {
            b(0);
        }
        if (r0Var == null) {
            b(1);
        }
        this.f32602c = aVar;
    }

    private static /* synthetic */ void b(int i10) {
        String str = i10 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 2 ? 3 : 2];
        if (i10 == 1) {
            objArr[0] = "receiverType";
        } else if (i10 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else if (i10 != 3) {
            objArr[0] = "callableDescriptor";
        } else {
            objArr[0] = "newType";
        }
        if (i10 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else {
            objArr[1] = "getDeclarationDescriptor";
        }
        if (i10 != 2) {
            if (i10 != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "replaceType";
            }
        }
        String str2 = String.format(str, objArr);
        if (i10 == 2) {
            throw new IllegalStateException(str2);
        }
    }

    public String toString() {
        return getType() + ": Ext {" + this.f32602c + "}";
    }
}
